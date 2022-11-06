/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  androidx.exifinterface.media.ExifInterface
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.Throwable
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.dhaval2404.imagepicker.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.exifinterface.media.ExifInterface;
import com.github.dhaval2404.imagepicker.util.ImageUtil$WhenMappings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u001f\u0010 J)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, d2={"Lcom/github/dhaval2404/imagepicker/util/ImageUtil;", "", "Ljava/io/File;", "imageFile", "", "reqWidth", "reqHeight", "Landroid/graphics/Bitmap;", "decodeSampledBitmapFromFile", "(Ljava/io/File;FF)Landroid/graphics/Bitmap;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;II)I", "candidate", "targetOptions", "", "canUseForInBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Z", "Landroid/graphics/Bitmap$Config;", "config", "getBytesPerPixel", "(Landroid/graphics/Bitmap$Config;)I", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "quality", "", "destinationPath", "compressImage", "(Ljava/io/File;FFLandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)Ljava/io/File;", "<init>", "()V", "imagepicker_release"}, k=1, mv={1, 4, 0})
public final class ImageUtil {
    public static final ImageUtil INSTANCE = new ImageUtil();

    private ImageUtil() {
    }

    private final int calculateInSampleSize(BitmapFactory.Options options, int n2, int n3) {
        int n4 = options.outHeight;
        int n5 = options.outWidth;
        if (n4 <= n3 && n5 <= n2) {
            return 1;
        }
        int n6 = 2;
        int n7 = n4 / n6;
        int n8 = n5 / n6;
        while (n7 / n6 >= n3 && n8 / n6 >= n2) {
            n6 *= 2;
        }
        return n6;
    }

    private final boolean canUseForInBitmap(Bitmap bitmap, BitmapFactory.Options options) {
        int n2 = options.outWidth;
        int n3 = options.inSampleSize;
        int n4 = n2 / n3 * (options.outHeight / n3);
        Bitmap.Config config = bitmap.getConfig();
        i.b((Object)config, (String)"candidate.config");
        return n4 * this.getBytesPerPixel(config) <= bitmap.getAllocationByteCount();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Bitmap decodeSampledBitmapFromFile(File file, float f, float f2) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmap2 = BitmapFactory.decodeFile((String)file.getAbsolutePath(), (BitmapFactory.Options)options);
        int n2 = options.outHeight;
        int n3 = options.outWidth;
        float f3 = n3;
        float f4 = n2;
        float f5 = f3 / f4;
        float f6 = f / f2;
        if (f4 > f2 || f3 > f) {
            if (f5 < f6) {
                n3 = (int)(f3 * (f2 / f4));
                n2 = (int)f2;
            } else {
                if (f5 > f6) {
                    f2 = f4 * (f / f3);
                }
                n2 = (int)f2;
                n3 = (int)f;
            }
        }
        options.inSampleSize = this.calculateInSampleSize(options, n3, n2);
        options.inJustDecodeBounds = false;
        if (bitmap2 != null && this.canUseForInBitmap(bitmap2, options)) {
            options.inMutable = true;
            options.inBitmap = bitmap2;
        }
        options.inTempStorage = new byte[16384];
        try {
            bitmap2 = BitmapFactory.decodeFile((String)file.getAbsolutePath(), (BitmapFactory.Options)options);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            outOfMemoryError.printStackTrace();
        }
        try {
            bitmap = Bitmap.createBitmap((int)n3, (int)n2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            outOfMemoryError.printStackTrace();
            bitmap = null;
        }
        float f7 = n3;
        float f8 = f7 / (float)options.outWidth;
        float f9 = n2;
        float f10 = f9 / (float)options.outHeight;
        float f11 = f7 / 2.0f;
        float f12 = f9 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f10, f11, f12);
        if (bitmap == null) {
            i.l();
            throw null;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.setMatrix(matrix);
        if (bitmap2 == null) {
            i.l();
            throw null;
        }
        canvas.drawBitmap(bitmap2, f11 - (float)(bitmap2.getWidth() / 2), f12 - (float)(bitmap2.getHeight() / 2), new Paint(2));
        bitmap2.recycle();
        try {
            int n4 = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
            Matrix matrix2 = new Matrix();
            if (n4 == 6) {
                matrix2.postRotate(90.0f);
            } else if (n4 == 3) {
                matrix2.postRotate(180.0f);
            } else if (n4 == 8) {
                matrix2.postRotate(270.0f);
            }
            int n5 = bitmap.getWidth();
            int n6 = bitmap.getHeight();
            return Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)n5, (int)n6, (Matrix)matrix2, (boolean)true);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return bitmap;
        }
    }

    private final int getBytesPerPixel(Bitmap.Config config) {
        int n2 = ImageUtil$WhenMappings.$EnumSwitchMapping$0[config.ordinal()];
        int n3 = 4;
        if (n2 != 1) {
            if (n2 != 2 && n2 != 3) {
                return 1;
            }
            n3 = 2;
        }
        return n3;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final File compressImage(File file, float f, float f2, Bitmap.CompressFormat compressFormat, int n2, String string2) {
        void var10_13;
        FileOutputStream fileOutputStream;
        block7 : {
            FileOutputStream fileOutputStream2;
            block6 : {
                i.f((Object)file, (String)"imageFile");
                i.f((Object)compressFormat, (String)"compressFormat");
                i.f((Object)string2, (String)"destinationPath");
                File file2 = new File(string2).getParentFile();
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                fileOutputStream = null;
                fileOutputStream2 = new FileOutputStream(string2);
                Bitmap bitmap = this.decodeSampledBitmapFromFile(file, f, f2);
                if (bitmap == null) break block6;
                bitmap.compress(compressFormat, n2, (OutputStream)fileOutputStream2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                return new File(string2);
            }
            try {
                i.l();
                throw null;
            }
            catch (Throwable throwable) {
                fileOutputStream = fileOutputStream2;
            }
            break block7;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (fileOutputStream == null) throw var10_13;
        fileOutputStream.flush();
        fileOutputStream.close();
        throw var10_13;
    }
}

