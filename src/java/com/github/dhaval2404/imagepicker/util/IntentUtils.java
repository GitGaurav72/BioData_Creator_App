/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.os.Parcelable
 *  androidx.core.content.FileProvider
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.dhaval2404.imagepicker.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.github.dhaval2404.imagepicker.R;
import java.io.File;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\b\b\u0010\u0007J!\u0010\t\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0018"}, d2={"Lcom/github/dhaval2404/imagepicker/util/IntentUtils;", "", "", "", "mimeTypes", "Landroid/content/Intent;", "getGalleryDocumentIntent", "([Ljava/lang/String;)Landroid/content/Intent;", "getLegacyGalleryPickIntent", "applyImageTypes", "(Landroid/content/Intent;[Ljava/lang/String;)Landroid/content/Intent;", "Landroid/content/Context;", "context", "getGalleryIntent", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Ljava/io/File;", "file", "getCameraIntent", "(Landroid/content/Context;Ljava/io/File;)Landroid/content/Intent;", "", "isCameraHardwareAvailable", "(Landroid/content/Context;)Z", "<init>", "()V", "imagepicker_release"}, k=1, mv={1, 4, 0})
public final class IntentUtils {
    public static final IntentUtils INSTANCE = new IntentUtils();

    private IntentUtils() {
    }

    private final Intent applyImageTypes(Intent intent, String[] arrstring) {
        intent.setType("image/*");
        boolean bl = arrstring.length == 0;
        if (bl ^ true) {
            intent.putExtra("android.intent.extra.MIME_TYPES", arrstring);
        }
        return intent;
    }

    private final Intent getGalleryDocumentIntent(String[] arrstring) {
        Intent intent = this.applyImageTypes(new Intent("android.intent.action.OPEN_DOCUMENT"), arrstring);
        intent.addCategory("android.intent.category.OPENABLE");
        return intent;
    }

    private final Intent getLegacyGalleryPickIntent(String[] arrstring) {
        return this.applyImageTypes(new Intent("android.intent.action.PICK"), arrstring);
    }

    public final Intent getCameraIntent(Context context, File file) {
        i.f((Object)context, (String)"context");
        i.f((Object)file, (String)"file");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append(context.getString(R.string.image_picker_provider_authority_suffix));
        intent.putExtra("output", (Parcelable)FileProvider.getUriForFile((Context)context, (String)stringBuilder.toString(), (File)file));
        return intent;
    }

    public final Intent getGalleryIntent(Context context, String[] arrstring) {
        i.f((Object)context, (String)"context");
        i.f((Object)arrstring, (String)"mimeTypes");
        Intent intent = this.getGalleryDocumentIntent(arrstring);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return intent;
        }
        return this.getLegacyGalleryPickIntent(arrstring);
    }

    public final boolean isCameraHardwareAvailable(Context context) {
        i.f((Object)context, (String)"context");
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }
}

