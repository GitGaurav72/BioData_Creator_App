/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.os.Environment
 *  android.os.StatFs
 *  java.io.File
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 *  k.d0.g
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.dhaval2404.imagepicker.util;

import android.graphics.Bitmap;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k.d0.g;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2={"Lcom/github/dhaval2404/imagepicker/util/FileUtil;", "", "Ljava/io/File;", "getCameraDirectory", "()Ljava/io/File;", "", "getTimestamp", "()Ljava/lang/String;", "dir", "extension", "getImageFile", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "file", "", "getFreeSpace", "(Ljava/io/File;)J", "Landroid/graphics/Bitmap$CompressFormat;", "getCompressFormat", "(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;", "<init>", "()V", "imagepicker_release"}, k=1, mv={1, 4, 0})
public final class FileUtil {
    public static final FileUtil INSTANCE = new FileUtil();

    private FileUtil() {
    }

    private final File getCameraDirectory() {
        return new File(Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_DCIM), "Camera");
    }

    public static /* synthetic */ File getImageFile$default(FileUtil fileUtil, File file, String string2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            file = null;
        }
        if ((n2 & 2) != 0) {
            string2 = null;
        }
        return fileUtil.getImageFile(file, string2);
    }

    private final String getTimestamp() {
        String string2 = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.getDefault()).format(new Date());
        i.b((Object)string2, (String)"SimpleDateFormat(timeFor\u2026Default()).format(Date())");
        return string2;
    }

    public final Bitmap.CompressFormat getCompressFormat(String string2) {
        i.f((Object)string2, (String)"extension");
        if (g.a((CharSequence)string2, (CharSequence)"png", (boolean)true)) {
            return Bitmap.CompressFormat.PNG;
        }
        if (g.a((CharSequence)string2, (CharSequence)"webp", (boolean)true)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final long getFreeSpace(File file) {
        i.f((Object)file, (String)"file");
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final File getImageFile(File file, String string2) {
        if (string2 == null) {
            string2 = ".jpg";
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IMG_");
            stringBuilder.append(this.getTimestamp());
            stringBuilder.append(string2);
            String string3 = stringBuilder.toString();
            if (file == null) {
                file = this.getCameraDirectory();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, string3);
            file2.createNewFile();
            return file2;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }
}

