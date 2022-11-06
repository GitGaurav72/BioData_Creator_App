/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  androidx.activity.ComponentActivity
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  com.github.dhaval2404.imagepicker.provider.CameraProvider
 *  com.github.dhaval2404.imagepicker.provider.CompressionProvider
 *  com.github.dhaval2404.imagepicker.provider.CropProvider
 *  com.github.dhaval2404.imagepicker.provider.GalleryProvider
 *  java.io.File
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package com.github.dhaval2404.imagepicker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.github.dhaval2404.imagepicker.R;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.github.dhaval2404.imagepicker.provider.CameraProvider;
import com.github.dhaval2404.imagepicker.provider.CompressionProvider;
import com.github.dhaval2404.imagepicker.provider.CropProvider;
import com.github.dhaval2404.imagepicker.provider.GalleryProvider;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import k.x.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv={1, 0, 3}, d1={"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u00016B\u0007\u00a2\u0006\u0004\b5\u0010\u001eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u0006J-\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\u001f\u0010\u000bJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b \u0010\u000bJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\u0004\u00a2\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0012\u00a2\u0006\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b3\u00104\u00a8\u00067"}, d2={"Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lk/q;", "restoreInstanceState", "(Landroid/os/Bundle;)V", "loadBundle", "Ljava/io/File;", "file", "setResult", "(Ljava/io/File;)V", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "()V", "setImage", "setCropImage", "setCompressedImage", "setResultCancel", "message", "setError", "(Ljava/lang/String;)V", "Lcom/github/dhaval2404/imagepicker/provider/CameraProvider;", "mCameraProvider", "Lcom/github/dhaval2404/imagepicker/provider/CameraProvider;", "mCropFile", "Ljava/io/File;", "mImageFile", "Lcom/github/dhaval2404/imagepicker/provider/CropProvider;", "mCropProvider", "Lcom/github/dhaval2404/imagepicker/provider/CropProvider;", "Lcom/github/dhaval2404/imagepicker/provider/GalleryProvider;", "mGalleryProvider", "Lcom/github/dhaval2404/imagepicker/provider/GalleryProvider;", "Lcom/github/dhaval2404/imagepicker/provider/CompressionProvider;", "mCompressionProvider", "Lcom/github/dhaval2404/imagepicker/provider/CompressionProvider;", "<init>", "Companion", "imagepicker_release"}, k=1, mv={1, 4, 0})
public final class ImagePickerActivity
extends AppCompatActivity {
    public static final Companion Companion = new Object(null){
        {
            this();
        }

        public final Intent getCancelledIntent$imagepicker_release(Context context) {
            i.f((Object)context, "context");
            Intent intent = new Intent();
            intent.putExtra("extra.error", context.getString(R.string.error_task_cancelled));
            return intent;
        }
    };
    private static final String STATE_IMAGE_FILE = "state.image_file";
    private static final String TAG = "image_picker";
    private HashMap _$_findViewCache;
    private CameraProvider mCameraProvider;
    private CompressionProvider mCompressionProvider;
    private File mCropFile;
    private CropProvider mCropProvider;
    private GalleryProvider mGalleryProvider;
    private File mImageFile;

    private final void loadBundle(Bundle bundle) {
        block10 : {
            block14 : {
                GalleryProvider galleryProvider;
                block12 : {
                    CameraProvider cameraProvider;
                    block13 : {
                        block11 : {
                            CropProvider cropProvider;
                            ImageProvider imageProvider;
                            this.mCropProvider = cropProvider = new CropProvider(this);
                            if (cropProvider == null) break block10;
                            cropProvider.onRestoreInstanceState(bundle);
                            this.mCompressionProvider = new CompressionProvider(this);
                            Intent intent = this.getIntent();
                            Serializable serializable = null;
                            if (intent != null) {
                                serializable = intent.getSerializableExtra("extra.image_provider");
                            }
                            if ((imageProvider = (ImageProvider)serializable) == null) break block11;
                            int n2 = imageProvider.ordinal();
                            if (n2 == 0) break block12;
                            if (n2 == 1) break block13;
                        }
                        Log.e((String)TAG, (String)"Image provider can not be null");
                        String string2 = this.getString(R.string.error_task_cancelled);
                        i.b(string2, "getString(R.string.error_task_cancelled)");
                        this.setError(string2);
                        return;
                    }
                    this.mCameraProvider = cameraProvider = new CameraProvider(this);
                    if (cameraProvider != null) {
                        cameraProvider.onRestoreInstanceState(bundle);
                    }
                    if (bundle != null) {
                        return;
                    }
                    CameraProvider cameraProvider2 = this.mCameraProvider;
                    if (cameraProvider2 != null) {
                        cameraProvider2.startIntent();
                        return;
                    }
                    break block14;
                }
                this.mGalleryProvider = galleryProvider = new GalleryProvider(this);
                if (bundle != null) {
                    return;
                }
                if (galleryProvider != null) {
                    galleryProvider.startIntent();
                }
            }
            return;
        }
        i.m("mCropProvider");
        throw null;
    }

    private final void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.mImageFile = (File)bundle.getSerializable(STATE_IMAGE_FILE);
        }
    }

    private final void setResult(File file) {
        Intent intent = new Intent();
        intent.setData(Uri.fromFile((File)file));
        intent.putExtra("extra.file_path", file.getAbsolutePath());
        this.setResult(-1, intent);
        this.finish();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int n2) {
        View view;
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        if ((view = (View)this._$_findViewCache.get((Object)n2)) == null) {
            view = this.findViewById(n2);
            this._$_findViewCache.put((Object)n2, (Object)view);
        }
        return view;
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        CropProvider cropProvider;
        GalleryProvider galleryProvider;
        FragmentActivity.super.onActivityResult(n2, n3, intent);
        CameraProvider cameraProvider = this.mCameraProvider;
        if (cameraProvider != null) {
            cameraProvider.onActivityResult(n2, n3, intent);
        }
        if ((galleryProvider = this.mGalleryProvider) != null) {
            galleryProvider.onActivityResult(n2, n3, intent);
        }
        if ((cropProvider = this.mCropProvider) != null) {
            cropProvider.onActivityResult(n2, n3, intent);
            return;
        }
        i.m("mCropProvider");
        throw null;
    }

    public void onBackPressed() {
        this.setResultCancel();
    }

    public void onCreate(Bundle bundle) {
        FragmentActivity.super.onCreate(bundle);
        this.restoreInstanceState(bundle);
        this.loadBundle(bundle);
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        GalleryProvider galleryProvider;
        i.f(arrstring, "permissions");
        i.f(arrn, "grantResults");
        FragmentActivity.super.onRequestPermissionsResult(n2, arrstring, arrn);
        CameraProvider cameraProvider = this.mCameraProvider;
        if (cameraProvider != null) {
            cameraProvider.onRequestPermissionsResult(n2);
        }
        if ((galleryProvider = this.mGalleryProvider) != null) {
            galleryProvider.onRequestPermissionsResult(n2);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        CropProvider cropProvider;
        i.f((Object)bundle, "outState");
        bundle.putSerializable(STATE_IMAGE_FILE, (Serializable)this.mImageFile);
        CameraProvider cameraProvider = this.mCameraProvider;
        if (cameraProvider != null) {
            cameraProvider.onSaveInstanceState(bundle);
        }
        if ((cropProvider = this.mCropProvider) != null) {
            cropProvider.onSaveInstanceState(bundle);
            ComponentActivity.super.onSaveInstanceState(bundle);
            return;
        }
        i.m("mCropProvider");
        throw null;
    }

    public final void setCompressedImage(File file) {
        File file2;
        File file3;
        i.f((Object)file, "file");
        if (this.mCameraProvider != null && (file2 = this.mImageFile) != null) {
            file2.delete();
        }
        if ((file3 = this.mCropFile) != null) {
            file3.delete();
        }
        this.mCropFile = null;
        this.setResult(file);
    }

    public final void setCropImage(File file) {
        CompressionProvider compressionProvider;
        i.f((Object)file, "file");
        this.mCropFile = file;
        if (this.mCameraProvider != null) {
            File file2 = this.mImageFile;
            if (file2 != null) {
                file2.delete();
            }
            this.mImageFile = null;
        }
        if ((compressionProvider = this.mCompressionProvider) != null) {
            if (compressionProvider.isCompressionRequired(file)) {
                CompressionProvider compressionProvider2 = this.mCompressionProvider;
                if (compressionProvider2 != null) {
                    compressionProvider2.compress(file);
                    return;
                }
                i.m("mCompressionProvider");
                throw null;
            }
            this.setResult(file);
            return;
        }
        i.m("mCompressionProvider");
        throw null;
    }

    public final void setError(String string2) {
        i.f(string2, "message");
        Intent intent = new Intent();
        intent.putExtra("extra.error", string2);
        this.setResult(64, intent);
        this.finish();
    }

    public final void setImage(File file) {
        i.f((Object)file, "file");
        this.mImageFile = file;
        CropProvider cropProvider = this.mCropProvider;
        if (cropProvider != null) {
            if (cropProvider.isCropEnabled()) {
                CropProvider cropProvider2 = this.mCropProvider;
                if (cropProvider2 != null) {
                    cropProvider2.startIntent(file);
                    return;
                }
                i.m("mCropProvider");
                throw null;
            }
            CompressionProvider compressionProvider = this.mCompressionProvider;
            if (compressionProvider != null) {
                if (compressionProvider.isCompressionRequired(file)) {
                    CompressionProvider compressionProvider2 = this.mCompressionProvider;
                    if (compressionProvider2 != null) {
                        compressionProvider2.compress(file);
                        return;
                    }
                    i.m("mCompressionProvider");
                    throw null;
                }
                this.setResult(file);
                return;
            }
            i.m("mCompressionProvider");
            throw null;
        }
        i.m("mCropProvider");
        throw null;
    }

    public final void setResultCancel() {
        this.setResult(0, Companion.getCancelledIntent$imagepicker_release((Context)this));
        this.finish();
    }

}

