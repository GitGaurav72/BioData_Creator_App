/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  com.google.zxing.BarcodeFormat
 *  com.google.zxing.EncodeHintType
 *  com.google.zxing.MultiFormatWriter
 *  com.google.zxing.WriterException
 *  com.google.zxing.common.BitMatrix
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

public class BarcodeEncoder {
    private static final int BLACK = -16777216;
    private static final int WHITE = -1;

    public Bitmap createBitmap(BitMatrix bitMatrix) {
        int n2 = bitMatrix.getWidth();
        int n3 = bitMatrix.getHeight();
        int[] arrn = new int[n2 * n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = i2 * n2;
            for (int i3 = 0; i3 < n2; ++i3) {
                int n5 = n4 + i3;
                int n6 = bitMatrix.get(i3, i2) ? -16777216 : -1;
                arrn[n5] = n6;
            }
        }
        Bitmap bitmap = Bitmap.createBitmap((int)n2, (int)n3, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        bitmap.setPixels(arrn, 0, n2, 0, 0, n2, n3);
        return bitmap;
    }

    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n2, int n3) {
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(string2, barcodeFormat, n2, n3);
            return bitMatrix;
        }
        catch (Exception exception) {
            throw new WriterException((Throwable)exception);
        }
        catch (WriterException writerException) {
            throw writerException;
        }
    }

    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n2, int n3, Map<EncodeHintType, ?> map) {
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(string2, barcodeFormat, n2, n3, map);
            return bitMatrix;
        }
        catch (Exception exception) {
            throw new WriterException((Throwable)exception);
        }
        catch (WriterException writerException) {
            throw writerException;
        }
    }

    public Bitmap encodeBitmap(String string2, BarcodeFormat barcodeFormat, int n2, int n3) {
        return this.createBitmap(this.encode(string2, barcodeFormat, n2, n3));
    }

    public Bitmap encodeBitmap(String string2, BarcodeFormat barcodeFormat, int n2, int n3, Map<EncodeHintType, ?> map) {
        return this.createBitmap(this.encode(string2, barcodeFormat, n2, n3, map));
    }
}

