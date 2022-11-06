/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.SurfaceTexture
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.Display
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.WindowManager
 *  com.google.zxing.client.android.R
 *  com.google.zxing.client.android.R$id
 *  com.google.zxing.client.android.R$styleable
 *  com.journeyapps.barcodescanner.RotationCallback
 *  com.journeyapps.barcodescanner.RotationListener
 *  com.journeyapps.barcodescanner.Size
 *  com.journeyapps.barcodescanner.Util
 *  com.journeyapps.barcodescanner.camera.CameraInstance
 *  com.journeyapps.barcodescanner.camera.CameraParametersCallback
 *  com.journeyapps.barcodescanner.camera.CameraSettings
 *  com.journeyapps.barcodescanner.camera.CameraSurface
 *  com.journeyapps.barcodescanner.camera.DisplayConfiguration
 *  com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.RotationCallback;
import com.journeyapps.barcodescanner.RotationListener;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.Util;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.CameraParametersCallback;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import com.journeyapps.barcodescanner.camera.CameraSurface;
import com.journeyapps.barcodescanner.camera.CenterCropStrategy;
import com.journeyapps.barcodescanner.camera.DisplayConfiguration;
import com.journeyapps.barcodescanner.camera.FitCenterStrategy;
import com.journeyapps.barcodescanner.camera.FitXYStrategy;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.util.ArrayList;
import java.util.List;

public class CameraPreview
extends ViewGroup {
    private static final int ROTATION_LISTENER_DELAY_MS = 250;
    private static final String TAG = CameraPreview.class.getSimpleName();
    private CameraInstance cameraInstance;
    private CameraSettings cameraSettings = new CameraSettings();
    private Size containerSize;
    private Size currentSurfaceSize;
    private DisplayConfiguration displayConfiguration;
    private final StateListener fireState = new StateListener(this){
        public final /* synthetic */ CameraPreview this$0;
        {
            this.this$0 = cameraPreview;
        }

        public void cameraClosed() {
            java.util.Iterator iterator = CameraPreview.access$700(this.this$0).iterator();
            while (iterator.hasNext()) {
                ((StateListener)iterator.next()).cameraClosed();
            }
        }

        public void cameraError(Exception exception) {
            java.util.Iterator iterator = CameraPreview.access$700(this.this$0).iterator();
            while (iterator.hasNext()) {
                ((StateListener)iterator.next()).cameraError(exception);
            }
        }

        public void previewSized() {
            java.util.Iterator iterator = CameraPreview.access$700(this.this$0).iterator();
            while (iterator.hasNext()) {
                ((StateListener)iterator.next()).previewSized();
            }
        }

        public void previewStarted() {
            java.util.Iterator iterator = CameraPreview.access$700(this.this$0).iterator();
            while (iterator.hasNext()) {
                ((StateListener)iterator.next()).previewStarted();
            }
        }

        public void previewStopped() {
            java.util.Iterator iterator = CameraPreview.access$700(this.this$0).iterator();
            while (iterator.hasNext()) {
                ((StateListener)iterator.next()).previewStopped();
            }
        }
    };
    private Rect framingRect = null;
    private Size framingRectSize = null;
    private double marginFraction = 0.1;
    private int openedOrientation = -1;
    private boolean previewActive = false;
    private Rect previewFramingRect = null;
    private PreviewScalingStrategy previewScalingStrategy = null;
    private Size previewSize;
    private RotationCallback rotationCallback = new RotationCallback(this){
        public final /* synthetic */ CameraPreview this$0;
        {
            this.this$0 = cameraPreview;
        }

        public void onRotationChanged(int n2) {
            CameraPreview.access$600(this.this$0).postDelayed(new java.lang.Runnable(this){
                public final /* synthetic */ 4 this$1;
                {
                    this.this$1 = var1_1;
                }

                public void run() {
                    CameraPreview.access$500(this.this$1.this$0);
                }
            }, 250L);
        }
    };
    private RotationListener rotationListener;
    private final Handler.Callback stateCallback = new Handler.Callback(){

        public boolean handleMessage(Message message) {
            int n2 = message.what;
            if (n2 == R.id.zxing_prewiew_size_ready) {
                CameraPreview.this.previewSized((Size)message.obj);
                return true;
            }
            if (n2 == R.id.zxing_camera_error) {
                Exception exception = (Exception)((Object)message.obj);
                if (CameraPreview.this.isActive()) {
                    CameraPreview.this.pause();
                    CameraPreview.this.fireState.cameraError(exception);
                }
            } else if (n2 == R.id.zxing_camera_closed) {
                CameraPreview.this.fireState.cameraClosed();
            }
            return false;
        }
    };
    private Handler stateHandler;
    private List<StateListener> stateListeners = new ArrayList();
    private final SurfaceHolder.Callback surfaceCallback = new SurfaceHolder.Callback(){

        public void surfaceChanged(SurfaceHolder surfaceHolder, int n2, int n3, int n4) {
            if (surfaceHolder == null) {
                Log.e((String)TAG, (String)"*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            CameraPreview.this.currentSurfaceSize = new Size(n3, n4);
            CameraPreview.this.startPreviewIfReady();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraPreview.this.currentSurfaceSize = null;
        }
    };
    private Rect surfaceRect;
    private SurfaceView surfaceView;
    private TextureView textureView;
    private boolean torchOn = false;
    private boolean useTextureView = false;
    private WindowManager windowManager;

    public CameraPreview(Context context) {
        super(context);
        this.initialize(context, null, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initialize(context, attributeSet, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.initialize(context, attributeSet, n2, 0);
    }

    public static /* synthetic */ void access$500(CameraPreview cameraPreview) {
        cameraPreview.rotationChanged();
    }

    public static /* synthetic */ Handler access$600(CameraPreview cameraPreview) {
        return cameraPreview.stateHandler;
    }

    public static /* synthetic */ List access$700(CameraPreview cameraPreview) {
        return cameraPreview.stateListeners;
    }

    private void calculateFrames() {
        DisplayConfiguration displayConfiguration;
        Size size;
        Size size2 = this.containerSize;
        if (size2 != null && (size = this.previewSize) != null && (displayConfiguration = this.displayConfiguration) != null) {
            int n2 = size.width;
            int n3 = size.height;
            int n4 = size2.width;
            int n5 = size2.height;
            Rect rect = displayConfiguration.scalePreview(size);
            if (rect.width() > 0) {
                Rect rect2;
                if (rect.height() <= 0) {
                    return;
                }
                this.surfaceRect = rect;
                this.framingRect = this.calculateFramingRect(new Rect(0, 0, n4, n5), this.surfaceRect);
                Rect rect3 = new Rect(this.framingRect);
                Rect rect4 = this.surfaceRect;
                rect3.offset(-rect4.left, -rect4.top);
                this.previewFramingRect = rect2 = new Rect(n2 * rect3.left / this.surfaceRect.width(), n3 * rect3.top / this.surfaceRect.height(), n2 * rect3.right / this.surfaceRect.width(), n3 * rect3.bottom / this.surfaceRect.height());
                if (rect2 != null && rect2.width() > 0 && this.previewFramingRect.height() > 0) {
                    this.fireState.previewSized();
                    return;
                }
                this.previewFramingRect = null;
                this.framingRect = null;
                Log.w((String)TAG, (String)"Preview frame is too small");
            }
            return;
        }
        this.previewFramingRect = null;
        this.framingRect = null;
        this.surfaceRect = null;
        throw new IllegalStateException("containerSize or previewSize is not set yet");
    }

    private void containerSized(Size size) {
        this.containerSize = size;
        CameraInstance cameraInstance = this.cameraInstance;
        if (cameraInstance != null && cameraInstance.getDisplayConfiguration() == null) {
            DisplayConfiguration displayConfiguration;
            this.displayConfiguration = displayConfiguration = new DisplayConfiguration(this.getDisplayRotation(), size);
            displayConfiguration.setPreviewScalingStrategy(this.getPreviewScalingStrategy());
            this.cameraInstance.setDisplayConfiguration(this.displayConfiguration);
            this.cameraInstance.configureCamera();
            boolean bl = this.torchOn;
            if (bl) {
                this.cameraInstance.setTorch(bl);
            }
        }
    }

    private int getDisplayRotation() {
        return this.windowManager.getDefaultDisplay().getRotation();
    }

    private void initCamera() {
        CameraInstance cameraInstance;
        if (this.cameraInstance != null) {
            Log.w((String)TAG, (String)"initCamera called twice");
            return;
        }
        this.cameraInstance = cameraInstance = this.createCameraInstance();
        cameraInstance.setReadyHandler(this.stateHandler);
        this.cameraInstance.open();
        this.openedOrientation = this.getDisplayRotation();
    }

    private void initialize(Context context, AttributeSet attributeSet, int n2, int n3) {
        if (this.getBackground() == null) {
            this.setBackgroundColor(-16777216);
        }
        this.initializeAttributes(attributeSet);
        this.windowManager = (WindowManager)context.getSystemService("window");
        this.stateHandler = new Handler(this.stateCallback);
        this.rotationListener = new RotationListener();
    }

    private void previewSized(Size size) {
        this.previewSize = size;
        if (this.containerSize != null) {
            this.calculateFrames();
            this.requestLayout();
            this.startPreviewIfReady();
        }
    }

    private void rotationChanged() {
        if (this.isActive() && this.getDisplayRotation() != this.openedOrientation) {
            this.pause();
            this.resume();
        }
    }

    private void setupSurfaceView() {
        TextureView textureView;
        if (this.useTextureView) {
            TextureView textureView2;
            this.textureView = textureView2 = new TextureView(this.getContext());
            textureView2.setSurfaceTextureListener(this.surfaceTextureListener());
            textureView = this.textureView;
        } else {
            SurfaceView surfaceView;
            this.surfaceView = surfaceView = new SurfaceView(this.getContext());
            surfaceView.getHolder().addCallback(this.surfaceCallback);
            textureView = this.surfaceView;
        }
        this.addView((View)textureView);
    }

    private void startCameraPreview(CameraSurface cameraSurface) {
        if (!this.previewActive && this.cameraInstance != null) {
            Log.i((String)TAG, (String)"Starting preview");
            this.cameraInstance.setSurface(cameraSurface);
            this.cameraInstance.startPreview();
            this.previewActive = true;
            this.previewStarted();
            this.fireState.previewStarted();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void startPreviewIfReady() {
        block4 : {
            CameraSurface cameraSurface;
            block6 : {
                block5 : {
                    Rect rect;
                    Size size = this.currentSurfaceSize;
                    if (size == null || this.previewSize == null || (rect = this.surfaceRect) == null) break block4;
                    if (this.surfaceView == null || !size.equals((Object)new Size(rect.width(), this.surfaceRect.height()))) break block5;
                    cameraSurface = new CameraSurface(this.surfaceView.getHolder());
                    break block6;
                }
                TextureView textureView = this.textureView;
                if (textureView == null || textureView.getSurfaceTexture() == null) break block4;
                if (this.previewSize != null) {
                    Matrix matrix = this.calculateTextureTransform(new Size(this.textureView.getWidth(), this.textureView.getHeight()), this.previewSize);
                    this.textureView.setTransform(matrix);
                }
                cameraSurface = new CameraSurface(this.textureView.getSurfaceTexture());
            }
            this.startCameraPreview(cameraSurface);
            return;
        }
    }

    @TargetApi(value=14)
    private TextureView.SurfaceTextureListener surfaceTextureListener() {
        return new TextureView.SurfaceTextureListener(){

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n2, int n3) {
                this.onSurfaceTextureSizeChanged(surfaceTexture, n2, n3);
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n2, int n3) {
                CameraPreview.this.currentSurfaceSize = new Size(n2, n3);
                CameraPreview.this.startPreviewIfReady();
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
    }

    public void addStateListener(StateListener stateListener) {
        this.stateListeners.add((Object)stateListener);
    }

    public Rect calculateFramingRect(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.framingRectSize != null) {
            rect3.inset(Math.max((int)0, (int)((rect3.width() - this.framingRectSize.width) / 2)), Math.max((int)0, (int)((rect3.height() - this.framingRectSize.height) / 2)));
            return rect3;
        }
        int n2 = (int)Math.min((double)((double)rect3.width() * this.marginFraction), (double)((double)rect3.height() * this.marginFraction));
        rect3.inset(n2, n2);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    public Matrix calculateTextureTransform(Size size, Size size2) {
        float f2;
        float f3 = (float)size.width / (float)size.height;
        float f4 = (float)size2.width / (float)size2.height;
        float f5 = f3 FCMPG f4;
        float f6 = 1.0f;
        if (f5 < 0) {
            float f7 = f4 / f3;
            f2 = f6;
            f6 = f7;
        } else {
            f2 = f3 / f4;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f6, f2);
        int n2 = size.width;
        float f8 = f6 * (float)n2;
        int n3 = size.height;
        float f9 = f2 * (float)n3;
        matrix.postTranslate(((float)n2 - f8) / 2.0f, ((float)n3 - f9) / 2.0f);
        return matrix;
    }

    public void changeCameraParameters(CameraParametersCallback cameraParametersCallback) {
        CameraInstance cameraInstance = this.cameraInstance;
        if (cameraInstance != null) {
            cameraInstance.changeCameraParameters(cameraParametersCallback);
        }
    }

    public CameraInstance createCameraInstance() {
        CameraInstance cameraInstance = new CameraInstance(this.getContext());
        cameraInstance.setCameraSettings(this.cameraSettings);
        return cameraInstance;
    }

    public CameraInstance getCameraInstance() {
        return this.cameraInstance;
    }

    public CameraSettings getCameraSettings() {
        return this.cameraSettings;
    }

    public Rect getFramingRect() {
        return this.framingRect;
    }

    public Size getFramingRectSize() {
        return this.framingRectSize;
    }

    public double getMarginFraction() {
        return this.marginFraction;
    }

    public Rect getPreviewFramingRect() {
        return this.previewFramingRect;
    }

    public PreviewScalingStrategy getPreviewScalingStrategy() {
        PreviewScalingStrategy previewScalingStrategy = this.previewScalingStrategy;
        if (previewScalingStrategy != null) {
            return previewScalingStrategy;
        }
        if (this.textureView != null) {
            return new CenterCropStrategy();
        }
        return new FitCenterStrategy();
    }

    public Size getPreviewSize() {
        return this.previewSize;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void initializeAttributes(AttributeSet attributeSet) {
        TypedArray typedArray;
        block7 : {
            PreviewScalingStrategy previewScalingStrategy;
            block5 : {
                int n2;
                block6 : {
                    block4 : {
                        typedArray = this.getContext().obtainStyledAttributes(attributeSet, R.styleable.zxing_camera_preview);
                        int n3 = (int)typedArray.getDimension(R.styleable.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
                        int n4 = (int)typedArray.getDimension(R.styleable.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
                        if (n3 > 0 && n4 > 0) {
                            this.framingRectSize = new Size(n3, n4);
                        }
                        this.useTextureView = typedArray.getBoolean(R.styleable.zxing_camera_preview_zxing_use_texture_view, true);
                        n2 = typedArray.getInteger(R.styleable.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
                        if (n2 != 1) break block4;
                        previewScalingStrategy = new CenterCropStrategy();
                        break block5;
                    }
                    if (n2 != 2) break block6;
                    previewScalingStrategy = new FitCenterStrategy();
                    break block5;
                }
                if (n2 != 3) break block7;
                previewScalingStrategy = new FitXYStrategy();
            }
            this.previewScalingStrategy = previewScalingStrategy;
        }
        typedArray.recycle();
    }

    public boolean isActive() {
        return this.cameraInstance != null;
    }

    public boolean isCameraClosed() {
        CameraInstance cameraInstance = this.cameraInstance;
        return cameraInstance == null || cameraInstance.isCameraClosed();
        {
        }
    }

    public boolean isPreviewActive() {
        return this.previewActive;
    }

    public boolean isUseTextureView() {
        return this.useTextureView;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setupSurfaceView();
    }

    @SuppressLint(value={"DrawAllocation"})
    public void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        this.containerSized(new Size(n4 - n2, n5 - n3));
        SurfaceView surfaceView = this.surfaceView;
        if (surfaceView != null) {
            Rect rect = this.surfaceRect;
            if (rect == null) {
                surfaceView.layout(0, 0, this.getWidth(), this.getHeight());
                return;
            }
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        TextureView textureView = this.textureView;
        if (textureView != null) {
            textureView.layout(0, 0, this.getWidth(), this.getHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle)parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        this.setTorch(bundle.getBoolean("torch"));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable parcelable = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelable);
        bundle.putBoolean("torch", this.torchOn);
        return bundle;
    }

    public void pause() {
        SurfaceView surfaceView;
        TextureView textureView;
        Util.validateMainThread();
        Log.d((String)TAG, (String)"pause()");
        this.openedOrientation = -1;
        CameraInstance cameraInstance = this.cameraInstance;
        if (cameraInstance != null) {
            cameraInstance.close();
            this.cameraInstance = null;
            this.previewActive = false;
        } else {
            this.stateHandler.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.currentSurfaceSize == null && (surfaceView = this.surfaceView) != null) {
            surfaceView.getHolder().removeCallback(this.surfaceCallback);
        }
        if (this.currentSurfaceSize == null && (textureView = this.textureView) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.containerSize = null;
        this.previewSize = null;
        this.previewFramingRect = null;
        this.rotationListener.stop();
        this.fireState.previewStopped();
    }

    /*
     * Exception decompiling
     */
    public void pauseAndWait() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl23.1 : RETURN : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public void previewStarted() {
    }

    public void resume() {
        Util.validateMainThread();
        Log.d((String)TAG, (String)"resume()");
        this.initCamera();
        if (this.currentSurfaceSize != null) {
            this.startPreviewIfReady();
        } else {
            SurfaceView surfaceView = this.surfaceView;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.surfaceCallback);
            } else {
                TextureView textureView = this.textureView;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.surfaceTextureListener().onSurfaceTextureAvailable(this.textureView.getSurfaceTexture(), this.textureView.getWidth(), this.textureView.getHeight());
                    } else {
                        this.textureView.setSurfaceTextureListener(this.surfaceTextureListener());
                    }
                }
            }
        }
        this.requestLayout();
        this.rotationListener.listen(this.getContext(), this.rotationCallback);
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.cameraSettings = cameraSettings;
    }

    public void setFramingRectSize(Size size) {
        this.framingRectSize = size;
    }

    public void setMarginFraction(double d2) {
        if (!(d2 >= 0.5)) {
            this.marginFraction = d2;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(PreviewScalingStrategy previewScalingStrategy) {
        this.previewScalingStrategy = previewScalingStrategy;
    }

    public void setTorch(boolean bl) {
        this.torchOn = bl;
        CameraInstance cameraInstance = this.cameraInstance;
        if (cameraInstance != null) {
            cameraInstance.setTorch(bl);
        }
    }

    public void setUseTextureView(boolean bl) {
        this.useTextureView = bl;
    }

    public static interface StateListener {
        public void cameraClosed();

        public void cameraError(Exception var1);

        public void previewSized();

        public void previewStarted();

        public void previewStopped();
    }

}

