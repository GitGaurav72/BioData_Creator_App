/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  androidx.annotation.ColorInt
 *  androidx.core.content.ContextCompat
 *  java.lang.Object
 */
package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;

public class HorizontalProgressWheelView
extends View {
    public final Rect k = new Rect();
    public a l;
    public float m;
    public Paint n;
    public Paint o;
    public int p = this.getContext().getResources().getDimensionPixelSize(2131100318);
    public int q = this.getContext().getResources().getDimensionPixelSize(2131100306);
    public int r = this.getContext().getResources().getDimensionPixelSize(2131100309);
    public boolean s;
    public float t;
    public int u = ContextCompat.getColor((Context)this.getContext(), (int)2131034794);

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        Paint paint;
        Paint paint2;
        super(context, attributeSet, 0);
        this.n = paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.n.setStrokeWidth((float)this.p);
        this.n.setColor(this.getResources().getColor(2131034785));
        this.o = paint = new Paint(this.n);
        paint.setColor(this.u);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.o.setStrokeWidth((float)this.getContext().getResources().getDimensionPixelSize(2131100319));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onDraw(Canvas var1_1) {
        super.onDraw(var1_1);
        var1_1.getClipBounds(this.k);
        var3_2 = this.k.width();
        var4_3 = this.p;
        var5_4 = this.r;
        var6_5 = var3_2 / (var4_3 + var5_4);
        var7_6 = this.t % (float)(var5_4 + var4_3);
        var8_7 = 0;
        do {
            block4 : {
                if (var8_7 >= var6_5) {
                    var1_1.drawLine((float)this.k.centerX(), (float)this.k.centerY() - (float)this.q / 2.0f, (float)this.k.centerX(), (float)this.k.centerY() + (float)this.q / 2.0f, this.o);
                    return;
                }
                var9_8 = var6_5 / 4;
                if (var8_7 >= var9_8) break block4;
                var15_14 = this.n;
                var16_15 = var8_7;
                ** GOTO lbl22
            }
            if (var8_7 > var6_5 * 3 / 4) {
                var15_14 = this.n;
                var16_15 = var6_5 - var8_7;
lbl22: // 2 sources:
                var15_14.setAlpha((int)(255.0f * (var16_15 / (float)var9_8)));
            } else {
                this.n.setAlpha(255);
            }
            var10_9 = -var7_6;
            var11_10 = this.k;
            var12_11 = var10_9 + (float)var11_10.left + (float)(var8_7 * (this.p + this.r));
            var13_12 = (float)var11_10.centerY() - (float)this.q / 4.0f;
            var14_13 = this.k;
            var1_1.drawLine(var12_11, var13_12, var10_9 + (float)var14_13.left + (float)(var8_7 * (this.p + this.r)), (float)var14_13.centerY() + (float)this.q / 4.0f, this.n);
            ++var8_7;
        } while (true);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n = motionEvent.getAction();
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    return true;
                }
                float f2 = motionEvent.getX() - this.m;
                if (f2 != 0.0f) {
                    if (!this.s) {
                        this.s = true;
                        a a2 = this.l;
                        if (a2 != null) {
                            a2.c();
                        }
                    }
                    this.t -= f2;
                    this.postInvalidate();
                    this.m = motionEvent.getX();
                    a a3 = this.l;
                    if (a3 != null) {
                        a3.b(-f2, this.t);
                        return true;
                    }
                }
            } else {
                a a4 = this.l;
                if (a4 != null) {
                    this.s = false;
                    a4.a();
                    return true;
                }
            }
        } else {
            this.m = motionEvent.getX();
        }
        return true;
    }

    public void setMiddleLineColor(@ColorInt int n) {
        this.u = n;
        this.o.setColor(n);
        this.invalidate();
    }

    public void setScrollingListener(a a2) {
        this.l = a2;
    }

    public static interface a {
        public void a();

        public void b(float var1, float var2);

        public void c();
    }

}

