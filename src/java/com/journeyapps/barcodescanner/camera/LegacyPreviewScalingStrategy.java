/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.Log
 *  com.journeyapps.barcodescanner.Size
 *  com.journeyapps.barcodescanner.camera.LegacyPreviewScalingStrategy$1
 *  com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.LegacyPreviewScalingStrategy;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LegacyPreviewScalingStrategy
extends PreviewScalingStrategy {
    private static final String TAG = "LegacyPreviewScalingStrategy";

    public static Size scale(Size size, Size size2) {
        if (!size2.fitsIn(size)) {
            do {
                Size size3 = size.scale(3, 2);
                size = size.scale(2, 1);
                if (!size2.fitsIn(size3)) continue;
                return size3;
            } while (!size2.fitsIn(size));
            return size;
        }
        do {
            Size size4 = size.scale(2, 3);
            Size size5 = size.scale(1, 2);
            if (!size2.fitsIn(size5)) {
                if (size2.fitsIn(size4)) {
                    return size4;
                }
                return size;
            }
            size = size5;
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Size getBestPreviewSize(List<Size> list, Size size) {
        if (size == null) {
            do {
                return (Size)list.get(0);
                break;
            } while (true);
        }
        Collections.sort(list, (Comparator)new 1(this, size));
        String string = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Viewfinder size: ");
        stringBuilder.append((Object)size);
        Log.i((String)string, (String)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Preview in order of preference: ");
        stringBuilder2.append(list);
        Log.i((String)string, (String)stringBuilder2.toString());
        return (Size)list.get(0);
    }

    public Rect scalePreview(Size size, Size size2) {
        Size size3 = LegacyPreviewScalingStrategy.scale(size, size2);
        String string = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Preview: ");
        stringBuilder.append((Object)size);
        stringBuilder.append("; Scaled: ");
        stringBuilder.append((Object)size3);
        stringBuilder.append("; Want: ");
        stringBuilder.append((Object)size2);
        Log.i((String)string, (String)stringBuilder.toString());
        int n = (size3.width - size2.width) / 2;
        int n2 = (size3.height - size2.height) / 2;
        return new Rect(-n, -n2, size3.width - n, size3.height - n2);
    }
}

