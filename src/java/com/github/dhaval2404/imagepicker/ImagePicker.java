/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.widget.Toast
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  com.github.dhaval2404.imagepicker.ImagePicker$Builder$showImageProviderDialog
 *  com.github.dhaval2404.imagepicker.ImagePicker$Builder$showImageProviderDialog$1
 *  com.github.dhaval2404.imagepicker.ImagePicker$Builder$showImageProviderDialog$2
 *  com.github.dhaval2404.imagepicker.ImagePicker$Builder$startActivity
 *  com.github.dhaval2404.imagepicker.ImagePicker$Builder$startActivity$1
 *  com.github.dhaval2404.imagepicker.ImagePicker$Builder$startActivity$2
 *  com.github.dhaval2404.imagepicker.ImagePicker$Builder$startActivity$3
 *  com.github.dhaval2404.imagepicker.ImagePicker$Builder$startActivity$4
 *  com.github.dhaval2404.imagepicker.ImagePickerActivity
 *  com.github.florent37.inlineactivityresult.kotlin.KotlinActivityResult
 *  com.github.florent37.inlineactivityresult.kotlin.Kotlin_activity_resultKt
 *  java.io.File
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  k.n
 *  k.q
 *  k.x.b.l
 *  k.x.b.p
 *  k.x.c.i
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package com.github.dhaval2404.imagepicker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.github.dhaval2404.imagepicker.listener.ResultListener;
import com.github.dhaval2404.imagepicker.util.DialogHelper;
import com.github.florent37.inlineactivityresult.kotlin.KotlinActivityResult;
import com.github.florent37.inlineactivityresult.kotlin.Kotlin_activity_resultKt;
import java.io.File;
import java.io.Serializable;
import k.n;
import k.q;
import k.x.b.l;
import k.x.b.p;
import k.x.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv={1, 0, 3}, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0006"}, d2={"Lcom/github/dhaval2404/imagepicker/ImagePicker;", "", "<init>", "()V", "Companion", "Builder", "imagepicker_release"}, k=1, mv={1, 4, 0})
public class ImagePicker {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_CROP = "extra.crop";
    public static final String EXTRA_CROP_X = "extra.crop_x";
    public static final String EXTRA_CROP_Y = "extra.crop_y";
    public static final String EXTRA_ERROR = "extra.error";
    public static final String EXTRA_FILE_PATH = "extra.file_path";
    public static final String EXTRA_IMAGE_MAX_SIZE = "extra.image_max_size";
    public static final String EXTRA_IMAGE_PROVIDER = "extra.image_provider";
    public static final String EXTRA_MAX_HEIGHT = "extra.max_height";
    public static final String EXTRA_MAX_WIDTH = "extra.max_width";
    public static final String EXTRA_MIME_TYPES = "extra.mime_types";
    public static final String EXTRA_SAVE_DIRECTORY = "extra.save_directory";
    public static final int REQUEST_CODE = 2404;
    public static final int RESULT_ERROR = 64;

    @Metadata(bv={1, 0, 3}, d1={"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010=\u001a\u00020<\u00a2\u0006\u0004\bI\u0010JB\u0011\b\u0016\u0012\u0006\u0010F\u001a\u00020E\u00a2\u0006\u0004\bI\u0010KJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0005\u001a\u00020\u00042\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u00042\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u001e\u001a\u00020\u0000\u00a2\u0006\u0004\b\u001e\u0010\u0014J\r\u0010 \u001a\u00020\u0000\u00a2\u0006\u0004\b \u0010\u0014J\u001d\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002\u00a2\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0002\u00a2\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0017\u00a2\u0006\u0004\b)\u0010*J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\b)\u0010-J!\u00100\u001a\u00020\u00002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040.\u00a2\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0004\u00a2\u0006\u0004\b2\u00103J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b2\u0010\u0006J-\u00102\u001a\u00020\u00042\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b2\u0010\nR\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u001e\u001a\u0002068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u00107R$\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010?R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010@R\u0016\u0010A\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u00105R\u0016\u0010%\u001a\u00020B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010CR\u0016\u0010D\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010;R\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010)\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010H\u00a8\u0006L"}, d2={"Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "", "", "reqCode", "Lk/q;", "showImageProviderDialog", "(I)V", "Lkotlin/Function2;", "Landroid/content/Intent;", "completionHandler", "(Lk/x/b/p;)V", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "startActivity", "Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;", "imageProvider", "provider", "(Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "cameraOnly", "()Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "galleryOnly", "", "", "mimeTypes", "galleryMimeTypes", "([Ljava/lang/String;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "", "x", "y", "crop", "(FF)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "cropSquare", "width", "height", "maxResultSize", "(II)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "maxSize", "compress", "(I)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "path", "saveDir", "(Ljava/lang/String;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "Ljava/io/File;", "file", "(Ljava/io/File;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "Lkotlin/Function1;", "interceptor", "setImageProviderInterceptor", "(Lk/x/b/l;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "start", "()V", "cropY", "F", "", "Z", "imageProviderInterceptor", "Lk/x/b/l;", "maxHeight", "I", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "[Ljava/lang/String;", "Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;", "cropX", "", "J", "maxWidth", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "Ljava/lang/String;", "<init>", "(Landroid/app/Activity;)V", "(Landroidx/fragment/app/Fragment;)V", "imagepicker_release"}, k=1, mv={1, 4, 0})
    public static final class Builder {
        private final Activity activity;
        private boolean crop;
        private float cropX;
        private float cropY;
        private Fragment fragment;
        private ImageProvider imageProvider;
        private l<? super ImageProvider, q> imageProviderInterceptor;
        private int maxHeight;
        private long maxSize;
        private int maxWidth;
        private String[] mimeTypes;
        private String saveDir;

        public Builder(Activity activity) {
            i.f((Object)activity, (String)"activity");
            this.activity = activity;
            this.imageProvider = ImageProvider.BOTH;
            this.mimeTypes = new String[0];
        }

        public Builder(Fragment fragment) {
            i.f((Object)fragment, (String)"fragment");
            FragmentActivity fragmentActivity = fragment.getActivity();
            if (fragmentActivity != null) {
                i.b((Object)fragmentActivity, (String)"fragment.activity!!");
                this((Activity)fragmentActivity);
                this.fragment = fragment;
                return;
            }
            i.l();
            throw null;
        }

        public static final /* synthetic */ Activity access$getActivity$p(Builder builder) {
            return builder.activity;
        }

        public static final /* synthetic */ ImageProvider access$getImageProvider$p(Builder builder) {
            return builder.imageProvider;
        }

        public static final /* synthetic */ l access$getImageProviderInterceptor$p(Builder builder) {
            return builder.imageProviderInterceptor;
        }

        public static final /* synthetic */ void access$setImageProvider$p(Builder builder, ImageProvider imageProvider) {
            builder.imageProvider = imageProvider;
        }

        public static final /* synthetic */ void access$setImageProviderInterceptor$p(Builder builder, l l2) {
            builder.imageProviderInterceptor = l2;
        }

        public static final /* synthetic */ void access$startActivity(Builder builder, int n) {
            builder.startActivity(n);
        }

        public static final /* synthetic */ void access$startActivity(Builder builder, p p2) {
            builder.startActivity((p<? super Integer, ? super Intent, q>)p2);
        }

        private final Bundle getBundle() {
            Bundle bundle = new Bundle();
            bundle.putSerializable(ImagePicker.EXTRA_IMAGE_PROVIDER, (Serializable)this.imageProvider);
            bundle.putStringArray(ImagePicker.EXTRA_MIME_TYPES, this.mimeTypes);
            bundle.putBoolean(ImagePicker.EXTRA_CROP, this.crop);
            bundle.putFloat(ImagePicker.EXTRA_CROP_X, this.cropX);
            bundle.putFloat(ImagePicker.EXTRA_CROP_Y, this.cropY);
            bundle.putInt(ImagePicker.EXTRA_MAX_WIDTH, this.maxWidth);
            bundle.putInt(ImagePicker.EXTRA_MAX_HEIGHT, this.maxHeight);
            bundle.putLong(ImagePicker.EXTRA_IMAGE_MAX_SIZE, this.maxSize);
            bundle.putString(ImagePicker.EXTRA_SAVE_DIRECTORY, this.saveDir);
            return bundle;
        }

        private final void showImageProviderDialog(int n) {
            DialogHelper.INSTANCE.showChooseAppDialog((Context)this.activity, (ResultListener<ImageProvider>)new showImageProviderDialog.1(this, n));
        }

        private final void showImageProviderDialog(p<? super Integer, ? super Intent, q> p2) {
            DialogHelper.INSTANCE.showChooseAppDialog((Context)this.activity, (ResultListener<ImageProvider>)new showImageProviderDialog.2(this, p2));
        }

        public static /* synthetic */ void showImageProviderDialog$default(Builder builder, p p2, int n, Object object) {
            if ((n & 1) != 0) {
                p2 = null;
            }
            builder.showImageProviderDialog((p<? super Integer, ? super Intent, q>)p2);
        }

        public static /* synthetic */ void start$default(Builder builder, p p2, int n, Object object) {
            if ((n & 1) != 0) {
                p2 = null;
            }
            builder.start((p<? super Integer, ? super Intent, q>)p2);
        }

        private final void startActivity(int n) {
            Intent intent = new Intent((Context)this.activity, ImagePickerActivity.class);
            intent.putExtras(this.getBundle());
            Fragment fragment = this.fragment;
            if (fragment != null) {
                if (fragment != null) {
                    fragment.startActivityForResult(intent, n);
                    return;
                }
            } else {
                this.activity.startActivityForResult(intent, n);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final void startActivity(p<? super Integer, ? super Intent, q> p2) {
            try {
                startActivity.2 var10_5;
                KotlinActivityResult kotlinActivityResult;
                Intent intent = new Intent((Context)this.activity, ImagePickerActivity.class);
                intent.putExtras(this.getBundle());
                Fragment fragment = this.fragment;
                if (fragment != null) {
                    if (fragment == null) return;
                    kotlinActivityResult = Kotlin_activity_resultKt.startForResult((Fragment)fragment, (Intent)intent, (l)new startActivity.1(p2));
                    if (kotlinActivityResult == null) return;
                    var10_5 = new startActivity.2(p2);
                } else {
                    Activity activity = this.activity;
                    if (activity == null) throw new n("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    kotlinActivityResult = Kotlin_activity_resultKt.startForResult((FragmentActivity)((AppCompatActivity)activity), (Intent)intent, (l)new startActivity.3(p2));
                    var10_5 = new startActivity.4(p2);
                }
                kotlinActivityResult.onFailed((l)var10_5);
                return;
            }
            catch (Exception exception) {
                Activity activity;
                if (!(exception instanceof ClassNotFoundException)) return;
                Fragment fragment = this.fragment;
                if (fragment != null) {
                    if (fragment == null) {
                        i.l();
                        throw null;
                    }
                    activity = fragment.getContext();
                } else {
                    activity = this.activity;
                }
                Toast.makeText((Context)activity, (CharSequence)"InlineActivityResult library not installed falling back to default method, please install it from https://github.com/florent37/InlineActivityResult if you want to get inline activity results.", (int)1).show();
                this.startActivity(2404);
            }
        }

        public static /* synthetic */ void startActivity$default(Builder builder, p p2, int n, Object object) {
            if ((n & 1) != 0) {
                p2 = null;
            }
            builder.startActivity((p<? super Integer, ? super Intent, q>)p2);
        }

        public final Builder cameraOnly() {
            this.imageProvider = ImageProvider.CAMERA;
            return this;
        }

        public final Builder compress(int n2) {
            this.maxSize = 1024L * (long)n2;
            return this;
        }

        public final Builder crop() {
            this.crop = true;
            return this;
        }

        public final Builder crop(float f, float f2) {
            this.cropX = f;
            this.cropY = f2;
            return this.crop();
        }

        public final Builder cropSquare() {
            return this.crop(1.0f, 1.0f);
        }

        public final Builder galleryMimeTypes(String[] arrstring) {
            i.f((Object)arrstring, (String)"mimeTypes");
            this.mimeTypes = arrstring;
            return this;
        }

        public final Builder galleryOnly() {
            this.imageProvider = ImageProvider.GALLERY;
            return this;
        }

        public final Builder maxResultSize(int n2, int n3) {
            this.maxWidth = n2;
            this.maxHeight = n3;
            return this;
        }

        public final Builder provider(ImageProvider imageProvider) {
            i.f((Object)((Object)imageProvider), (String)"imageProvider");
            this.imageProvider = imageProvider;
            return this;
        }

        public final Builder saveDir(File file) {
            i.f((Object)file, (String)"file");
            this.saveDir = file.getAbsolutePath();
            return this;
        }

        public final Builder saveDir(String string2) {
            i.f((Object)string2, (String)"path");
            this.saveDir = string2;
            return this;
        }

        public final Builder setImageProviderInterceptor(l<? super ImageProvider, q> l2) {
            i.f(l2, (String)"interceptor");
            this.imageProviderInterceptor = l2;
            return this;
        }

        public final void start() {
            this.start(2404);
        }

        public final void start(int n2) {
            if (this.imageProvider == ImageProvider.BOTH) {
                this.showImageProviderDialog(n2);
                return;
            }
            this.startActivity(n2);
        }

        public final void start(p<? super Integer, ? super Intent, q> p2) {
            if (this.imageProvider == ImageProvider.BOTH) {
                this.showImageProviderDialog(p2);
                return;
            }
            this.startActivity(p2);
        }
    }

    @Metadata(bv={1, 0, 3}, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b#\u0010$J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001c\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0016\u0010\u001d\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\f8\u0000@\u0000XT\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\"\u0010!\u00a8\u0006%"}, d2={"Lcom/github/dhaval2404/imagepicker/ImagePicker$Companion;", "", "Landroid/app/Activity;", "activity", "Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "with", "(Landroid/app/Activity;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "Landroid/content/Intent;", "data", "", "getError", "(Landroid/content/Intent;)Ljava/lang/String;", "getFilePath", "Ljava/io/File;", "getFile", "(Landroid/content/Intent;)Ljava/io/File;", "EXTRA_CROP", "Ljava/lang/String;", "EXTRA_CROP_X", "EXTRA_CROP_Y", "EXTRA_ERROR", "EXTRA_FILE_PATH", "EXTRA_IMAGE_MAX_SIZE", "EXTRA_IMAGE_PROVIDER", "EXTRA_MAX_HEIGHT", "EXTRA_MAX_WIDTH", "EXTRA_MIME_TYPES", "EXTRA_SAVE_DIRECTORY", "", "REQUEST_CODE", "I", "RESULT_ERROR", "<init>", "()V", "imagepicker_release"}, k=1, mv={1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getError(Intent intent) {
            String string2 = intent != null ? intent.getStringExtra(ImagePicker.EXTRA_ERROR) : null;
            if (string2 != null) {
                return string2;
            }
            return "Unknown Error!";
        }

        public final File getFile(Intent intent) {
            String string2 = this.getFilePath(intent);
            if (string2 != null) {
                return new File(string2);
            }
            return null;
        }

        public final String getFilePath(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra(ImagePicker.EXTRA_FILE_PATH);
            }
            return null;
        }

        public final Builder with(Activity activity) {
            i.f((Object)activity, (String)"activity");
            return new Builder(activity);
        }

        public final Builder with(Fragment fragment) {
            i.f((Object)fragment, (String)"fragment");
            return new Builder(fragment);
        }
    }

}

