/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.VelocityTracker
 *  android.view.ViewConfiguration
 *  android.view.ViewParent
 *  android.widget.ImageView
 *  android.widget.OverScroller
 *  e.o.b.a.k$a
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 */
package e.o.b.a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.OverScroller;
import e.o.b.a.b;
import e.o.b.a.h;
import e.o.b.a.k;

public class a {
    public int a = -1;
    public int b = 0;
    public final ScaleGestureDetector c;
    public VelocityTracker d;
    public boolean e;
    public float f;
    public float g;
    public final float h;
    public final float i;
    public b j;

    public a(Context context, b b2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)context);
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = viewConfiguration.getScaledTouchSlop();
        this.j = b2;
        this.c = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener(){

            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float f2 = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN((float)f2) && !Float.isInfinite((float)f2)) {
                    if (f2 >= 0.0f) {
                        b b2 = a.this.j;
                        float f3 = scaleGestureDetector.getFocusX();
                        float f4 = scaleGestureDetector.getFocusY();
                        ((k.a)b2).a(f2, f3, f4);
                    }
                    return true;
                }
                return false;
            }

            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        });
    }

    public final float a(MotionEvent motionEvent) {
        try {
            float f2 = motionEvent.getX(this.b);
            return f2;
        }
        catch (Exception exception) {
            return motionEvent.getX();
        }
    }

    public final float b(MotionEvent motionEvent) {
        try {
            float f2 = motionEvent.getY(this.b);
            return f2;
        }
        catch (Exception exception) {
            return motionEvent.getY();
        }
    }

    public boolean c() {
        return this.c.isInProgress();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean d(MotionEvent var1_1) {
        block24 : {
            block20 : {
                block25 : {
                    block21 : {
                        block26 : {
                            block22 : {
                                block23 : {
                                    var2_2 = 255 & var1_1.getAction();
                                    if (var2_2 == 0) break block20;
                                    if (var2_2 == 1) break block21;
                                    if (var2_2 == 2) break block22;
                                    if (var2_2 == 3) break block23;
                                    if (var2_2 == 6 && var1_1.getPointerId(var46_3 = (65280 & var1_1.getAction()) >> 8) == this.a) {
                                        var47_4 = var46_3 == 0 ? 1 : 0;
                                        this.a = var1_1.getPointerId(var47_4);
                                        this.f = var1_1.getX(var47_4);
                                        this.g = var1_1.getY(var47_4);
                                    }
                                    break block24;
                                }
                                this.a = -1;
                                var6_5 = this.d;
                                if (var6_5 == null) break block24;
                                break block25;
                            }
                            var32_6 = this.a(var1_1);
                            var33_7 = this.b(var1_1);
                            var34_8 = var32_6 - this.f;
                            var35_9 = var33_7 - this.g;
                            if (!this.e) {
                                var45_10 = Math.sqrt((double)(var34_8 * var34_8 + var35_9 * var35_9)) >= (double)this.h;
                                this.e = var45_10;
                            }
                            if (!this.e) break block24;
                            var36_11 = (k.a)this.j;
                            if (var36_11.a.t.c()) break block26;
                            var37_12 = var36_11.a.H;
                            if (var37_12 != null) {
                                var37_12.a(var34_8, var35_9);
                            }
                            var36_11.a.w.postTranslate(var34_8, var35_9);
                            var36_11.a.a();
                            var39_13 = var36_11.a.r.getParent();
                            var40_14 = var36_11.a;
                            if (!var40_14.p || var40_14.t.c()) ** GOTO lbl-1000
                            var42_15 = var36_11.a;
                            if (!var42_15.q) {
                                var43_16 = var42_15.J;
                                if ((var43_16 == 2 || var43_16 == 0 && var34_8 >= 1.0f || var43_16 == 1 && var34_8 <= -1.0f || (var44_17 = var42_15.K) == 0 && var35_9 >= 1.0f || var44_17 == 1 && var35_9 <= -1.0f) && var39_13 != null) {
                                    var39_13.requestDisallowInterceptTouchEvent(false);
                                }
                            } else if (var39_13 != null) {
                                var39_13.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        this.f = var32_6;
                        this.g = var33_7;
                        var41_18 = this.d;
                        if (var41_18 != null) {
                            var41_18.addMovement(var1_1);
                        }
                        break block24;
                    }
                    this.a = -1;
                    if (this.e && this.d != null) {
                        this.f = this.a(var1_1);
                        this.g = this.b(var1_1);
                        this.d.addMovement(var1_1);
                        this.d.computeCurrentVelocity(1000);
                        var7_19 = this.d.getXVelocity();
                        var8_20 = this.d.getYVelocity();
                        if (Math.max((float)Math.abs((float)var7_19), (float)Math.abs((float)var8_20)) >= this.i) {
                            var9_21 = this.j;
                            var10_22 = -var7_19;
                            var11_23 = -var8_20;
                            var12_24 = (k.a)var9_21;
                            var13_25 = var12_24.a;
                            var13_25.I = new k.f(var13_25, var13_25.r.getContext());
                            var14_26 = var12_24.a;
                            var15_27 = var14_26.I;
                            var16_28 = var14_26.g(var14_26.r);
                            var17_29 = var12_24.a;
                            var18_30 = var17_29.f(var17_29.r);
                            var19_31 = (int)var10_22;
                            var20_32 = (int)var11_23;
                            var21_33 = var15_27.n.c();
                            if (var21_33 != null) {
                                var22_34 = Math.round((float)(-var21_33.left));
                                var23_35 = var16_28;
                                if (var23_35 < var21_33.width()) {
                                    var24_36 = Math.round((float)(var21_33.width() - var23_35));
                                    var25_37 = 0;
                                } else {
                                    var25_37 = var24_36 = var22_34;
                                }
                                var26_38 = Math.round((float)(-var21_33.top));
                                var27_39 = var18_30;
                                if (var27_39 < var21_33.height()) {
                                    var28_40 = Math.round((float)(var21_33.height() - var27_39));
                                    var29_41 = 0;
                                } else {
                                    var29_41 = var28_40 = var26_38;
                                }
                                var15_27.l = var22_34;
                                var15_27.m = var26_38;
                                if (var22_34 != var24_36 || var26_38 != var28_40) {
                                    var15_27.k.fling(var22_34, var26_38, var19_31, var20_32, var25_37, var24_36, var29_41, var28_40, 0, 0);
                                }
                            }
                            var30_42 = var12_24.a;
                            var30_42.r.post((Runnable)var30_42.I);
                        }
                    }
                    if ((var6_5 = this.d) == null) break block24;
                }
                var6_5.recycle();
                this.d = null;
                break block24;
            }
            this.a = var1_1.getPointerId(0);
            this.d = var3_43 = VelocityTracker.obtain();
            if (var3_43 != null) {
                var3_43.addMovement(var1_1);
            }
            this.f = this.a(var1_1);
            this.g = this.b(var1_1);
            this.e = false;
        }
        var4_44 = this.a;
        var5_45 = 0;
        if (var4_44 != -1) {
            var5_45 = var4_44;
        }
        this.b = var1_1.findPointerIndex(var5_45);
        return true;
    }

}

