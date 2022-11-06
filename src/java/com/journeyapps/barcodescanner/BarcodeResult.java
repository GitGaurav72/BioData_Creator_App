/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  com.google.zxing.BarcodeFormat
 *  com.google.zxing.Result
 *  com.google.zxing.ResultMetadataType
 *  com.google.zxing.ResultPoint
 *  com.journeyapps.barcodescanner.SourceData
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.SourceData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BarcodeResult {
    private static final float PREVIEW_DOT_WIDTH = 10.0f;
    private static final float PREVIEW_LINE_WIDTH = 4.0f;
    public Result mResult;
    private final int mScaleFactor = 2;
    public SourceData sourceData;

    public BarcodeResult(Result result, SourceData sourceData) {
        this.mResult = result;
        this.sourceData = sourceData;
    }

    private static void drawLine(Canvas canvas, Paint paint, ResultPoint resultPoint, ResultPoint resultPoint2, int n2) {
        if (resultPoint != null && resultPoint2 != null) {
            float f2 = resultPoint.getX();
            float f3 = n2;
            canvas.drawLine(f2 / f3, resultPoint.getY() / f3, resultPoint2.getX() / f3, resultPoint2.getY() / f3, paint);
        }
    }

    public static List<ResultPoint> transformResultPoints(List<ResultPoint> list, SourceData sourceData) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)sourceData.translateResultPoint((ResultPoint)iterator.next()));
        }
        return arrayList;
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.mResult.getBarcodeFormat();
    }

    public Bitmap getBitmap() {
        return this.sourceData.getBitmap(null, 2);
    }

    public int getBitmapScaleFactor() {
        return 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Bitmap getBitmapWithResultPoints(int n2) {
        ResultPoint resultPoint;
        Bitmap bitmap = this.getBitmap();
        List<ResultPoint> list = this.getTransformedResultPoints();
        if (list.isEmpty()) return bitmap;
        if (bitmap == null) return bitmap;
        Bitmap bitmap2 = Bitmap.createBitmap((int)bitmap.getWidth(), (int)bitmap.getHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        Paint paint = new Paint();
        paint.setColor(n2);
        int n3 = list.size();
        int n4 = 1;
        if (n3 == 2) {
            paint.setStrokeWidth(4.0f);
            resultPoint = (ResultPoint)list.get(0);
        } else if (list.size() == 4 && (this.mResult.getBarcodeFormat() == BarcodeFormat.UPC_A || this.mResult.getBarcodeFormat() == BarcodeFormat.EAN_13)) {
            BarcodeResult.drawLine(canvas, paint, (ResultPoint)list.get(0), (ResultPoint)list.get(n4), 2);
            resultPoint = (ResultPoint)list.get(2);
            n4 = 3;
        } else {
            paint.setStrokeWidth(10.0f);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ResultPoint resultPoint2 = (ResultPoint)iterator.next();
                if (resultPoint2 == null) continue;
                canvas.drawPoint(resultPoint2.getX() / 2.0f, resultPoint2.getY() / 2.0f, paint);
            }
            return bitmap2;
        }
        BarcodeResult.drawLine(canvas, paint, resultPoint, (ResultPoint)list.get(n4), 2);
        return bitmap2;
    }

    public byte[] getRawBytes() {
        return this.mResult.getRawBytes();
    }

    public Result getResult() {
        return this.mResult;
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
        return this.mResult.getResultMetadata();
    }

    public ResultPoint[] getResultPoints() {
        return this.mResult.getResultPoints();
    }

    public String getText() {
        return this.mResult.getText();
    }

    public long getTimestamp() {
        return this.mResult.getTimestamp();
    }

    public List<ResultPoint> getTransformedResultPoints() {
        if (this.mResult.getResultPoints() == null) {
            return Collections.emptyList();
        }
        return BarcodeResult.transformResultPoints((List<ResultPoint>)Arrays.asList((Object[])this.mResult.getResultPoints()), this.sourceData);
    }

    public String toString() {
        return this.mResult.getText();
    }
}

