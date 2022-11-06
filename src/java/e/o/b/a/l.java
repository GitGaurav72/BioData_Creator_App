/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
package e.o.b.a;

import android.widget.ImageView;

public class l {
    public static final /* synthetic */ int[] a;

    public static {
        int[] arrn = new int[ImageView.ScaleType.values().length];
        a = arrn;
        try {
            arrn[ImageView.ScaleType.MATRIX.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

