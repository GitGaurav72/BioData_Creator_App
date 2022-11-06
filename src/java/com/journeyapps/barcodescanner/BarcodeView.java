/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.util.AttributeSet
 *  com.google.zxing.DecodeHintType
 *  com.journeyapps.barcodescanner.BarcodeCallback
 *  com.journeyapps.barcodescanner.BarcodeView$1
 *  com.journeyapps.barcodescanner.BarcodeView$DecodeMode
 *  com.journeyapps.barcodescanner.CameraPreview
 *  com.journeyapps.barcodescanner.DecoderFactory
 *  com.journeyapps.barcodescanner.DecoderThread
 *  com.journeyapps.barcodescanner.Util
 *  com.journeyapps.barcodescanner.camera.CameraInstance
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 */
package com.journeyapps.barcodescanner;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import com.google.zxing.DecodeHintType;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.Decoder;
import com.journeyapps.barcodescanner.DecoderFactory;
import com.journeyapps.barcodescanner.DecoderResultPointCallback;
import com.journeyapps.barcodescanner.DecoderThread;
import com.journeyapps.barcodescanner.DefaultDecoderFactory;
import com.journeyapps.barcodescanner.Util;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import java.util.HashMap;
import java.util.Map;

public class BarcodeView
extends CameraPreview {
    private BarcodeCallback callback = null;
    private DecodeMode decodeMode = DecodeMode.NONE;
    private DecoderFactory decoderFactory;
    private DecoderThread decoderThread;
    private final Handler.Callback resultCallback = new 1(this);
    private Handler resultHandler;

    public BarcodeView(Context context) {
        super(context);
        this.initialize();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initialize();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.initialize();
    }

    public static /* synthetic */ BarcodeCallback access$000(BarcodeView barcodeView) {
        return barcodeView.callback;
    }

    public static /* synthetic */ DecodeMode access$100(BarcodeView barcodeView) {
        return barcodeView.decodeMode;
    }

    private Decoder createDecoder() {
        if (this.decoderFactory == null) {
            this.decoderFactory = this.createDefaultDecoderFactory();
        }
        DecoderResultPointCallback decoderResultPointCallback = new DecoderResultPointCallback();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)DecodeHintType.NEED_RESULT_POINT_CALLBACK, (Object)decoderResultPointCallback);
        Decoder decoder = this.decoderFactory.createDecoder((Map)hashMap);
        decoderResultPointCallback.setDecoder(decoder);
        return decoder;
    }

    private void initialize() {
        this.decoderFactory = new DefaultDecoderFactory();
        this.resultHandler = new Handler(this.resultCallback);
    }

    private void startDecoderThread() {
        this.stopDecoderThread();
        if (this.decodeMode != DecodeMode.NONE && this.isPreviewActive()) {
            DecoderThread decoderThread;
            this.decoderThread = decoderThread = new DecoderThread(this.getCameraInstance(), this.createDecoder(), this.resultHandler);
            decoderThread.setCropRect(this.getPreviewFramingRect());
            this.decoderThread.start();
        }
    }

    private void stopDecoderThread() {
        DecoderThread decoderThread = this.decoderThread;
        if (decoderThread != null) {
            decoderThread.stop();
            this.decoderThread = null;
        }
    }

    public DecoderFactory createDefaultDecoderFactory() {
        return new DefaultDecoderFactory();
    }

    public void decodeContinuous(BarcodeCallback barcodeCallback) {
        this.decodeMode = DecodeMode.CONTINUOUS;
        this.callback = barcodeCallback;
        this.startDecoderThread();
    }

    public void decodeSingle(BarcodeCallback barcodeCallback) {
        this.decodeMode = DecodeMode.SINGLE;
        this.callback = barcodeCallback;
        this.startDecoderThread();
    }

    public DecoderFactory getDecoderFactory() {
        return this.decoderFactory;
    }

    public void pause() {
        this.stopDecoderThread();
        super.pause();
    }

    public void previewStarted() {
        super.previewStarted();
        this.startDecoderThread();
    }

    public void setDecoderFactory(DecoderFactory decoderFactory) {
        Util.validateMainThread();
        this.decoderFactory = decoderFactory;
        DecoderThread decoderThread = this.decoderThread;
        if (decoderThread != null) {
            decoderThread.setDecoder(this.createDecoder());
        }
    }

    public void stopDecoding() {
        this.decodeMode = DecodeMode.NONE;
        this.callback = null;
        this.stopDecoderThread();
    }
}

