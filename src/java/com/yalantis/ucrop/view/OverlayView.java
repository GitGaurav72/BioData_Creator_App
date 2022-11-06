/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.RectF
 *  android.graphics.Region
 *  android.graphics.Region$Op
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  androidx.annotation.ColorInt
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  com.yalantis.ucrop.view.GestureCropImageView
 *  e.s.a.a
 *  e.s.a.i.d
 *  e.s.a.m.e
 *  java.lang.Deprecated
 *  java.lang.Math
 */
package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.UCropView;
import e.s.a.a;
import e.s.a.i.d;
import e.s.a.m.e;

public class OverlayView
extends View {
    public Paint A = new Paint(1);
    public Paint B = new Paint(1);
    public int C = 0;
    public float D = -1.0f;
    public float E = -1.0f;
    public int F = -1;
    public int G = this.getResources().getDimensionPixelSize(2131100302);
    public int H = this.getResources().getDimensionPixelSize(2131100303);
    public int I = this.getResources().getDimensionPixelSize(2131100301);
    public d J;
    public boolean K;
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public int m;
    public int n;
    public float[] o;
    public int p;
    public int q;
    public float r;
    public float[] s = null;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public Path x = new Path();
    public Paint y = new Paint(1);
    public Paint z = new Paint(1);

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void a() {
        this.o = a.p1((RectF)this.k);
        a.l1((RectF)this.k);
        this.s = null;
        this.x.reset();
        this.x.addCircle(this.k.centerX(), this.k.centerY(), Math.min((float)this.k.width(), (float)this.k.height()) / 2.0f, Path.Direction.CW);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.k;
    }

    public int getFreestyleCropMode() {
        return this.C;
    }

    public d getOverlayViewChangeListener() {
        return this.J;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.v) {
            canvas.clipPath(this.x, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.k, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.w);
        canvas.restore();
        if (this.v) {
            canvas.drawCircle(this.k.centerX(), this.k.centerY(), Math.min((float)this.k.width(), (float)this.k.height()) / 2.0f, this.y);
        }
        if (this.u) {
            float[] arrf;
            if (this.s == null && !this.k.isEmpty()) {
                this.s = new float[4 * this.p + 4 * this.q];
                int n = 0;
                int n2 = 0;
                do {
                    int n3 = this.p;
                    if (n >= n3) break;
                    float[] arrf2 = this.s;
                    int n4 = n2 + 1;
                    RectF rectF = this.k;
                    arrf2[n2] = rectF.left;
                    int n5 = n4 + 1;
                    float f2 = rectF.height();
                    float f3 = 1.0f + (float)n;
                    float f4 = f2 * (f3 / (float)(1 + this.p));
                    RectF rectF2 = this.k;
                    arrf2[n4] = f4 + rectF2.top;
                    float[] arrf3 = this.s;
                    int n6 = n5 + 1;
                    arrf3[n5] = rectF2.right;
                    n2 = n6 + 1;
                    arrf3[n6] = rectF2.height() * (f3 / (float)(1 + this.p)) + this.k.top;
                    ++n;
                } while (true);
                for (int i = 0; i < this.q; ++i) {
                    float[] arrf4 = this.s;
                    int n7 = n2 + 1;
                    float f5 = this.k.width();
                    float f6 = 1.0f + (float)i;
                    float f7 = f5 * (f6 / (float)(1 + this.q));
                    RectF rectF = this.k;
                    arrf4[n2] = f7 + rectF.left;
                    float[] arrf5 = this.s;
                    int n8 = n7 + 1;
                    arrf5[n7] = rectF.top;
                    int n9 = n8 + 1;
                    float f8 = rectF.width() * (f6 / (float)(1 + this.q));
                    RectF rectF3 = this.k;
                    arrf5[n8] = f8 + rectF3.left;
                    float[] arrf6 = this.s;
                    n2 = n9 + 1;
                    arrf6[n9] = rectF3.bottom;
                }
            }
            if ((arrf = this.s) != null) {
                canvas.drawLines(arrf, this.z);
            }
        }
        if (this.t) {
            canvas.drawRect(this.k, this.A);
        }
        if (this.C != 0) {
            canvas.save();
            this.l.set(this.k);
            RectF rectF = this.l;
            int n = this.I;
            rectF.inset((float)n, (float)(-n));
            canvas.clipRect(this.l, Region.Op.DIFFERENCE);
            this.l.set(this.k);
            RectF rectF4 = this.l;
            int n10 = this.I;
            rectF4.inset((float)(-n10), (float)n10);
            canvas.clipRect(this.l, Region.Op.DIFFERENCE);
            canvas.drawRect(this.k, this.B);
            canvas.restore();
        }
    }

    public void onLayout(boolean bl, int n, int n2, int n3, int n4) {
        super.onLayout(bl, n, n2, n3, n4);
        if (bl) {
            int n5 = this.getPaddingLeft();
            int n6 = this.getPaddingTop();
            int n7 = this.getWidth() - this.getPaddingRight();
            int n8 = this.getHeight() - this.getPaddingBottom();
            this.m = n7 - n5;
            this.n = n8 - n6;
            if (this.K) {
                this.K = false;
                this.setTargetAspectRatio(this.r);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        block9 : {
            block10 : {
                float f2;
                float f3;
                block16 : {
                    block17 : {
                        block15 : {
                            block11 : {
                                block12 : {
                                    block13 : {
                                        block14 : {
                                            if (this.k.isEmpty() || this.C == 0) break block9;
                                            float f4 = motionEvent.getX();
                                            float f5 = motionEvent.getY();
                                            if ((255 & motionEvent.getAction()) == 0) {
                                                double d2 = this.G;
                                                int n = -1;
                                                for (int i = 0; i < 8; i += 2) {
                                                    double d3 = Math.sqrt((double)(Math.pow((double)(f4 - this.o[i]), (double)2.0) + Math.pow((double)(f5 - this.o[i + 1]), (double)2.0)));
                                                    if (!(d3 < d2)) continue;
                                                    n = i / 2;
                                                    d2 = d3;
                                                }
                                                int n2 = this.C == 1 && n < 0 && this.k.contains(f4, f5) ? 4 : n;
                                                this.F = n2;
                                                boolean bl = n2 != -1;
                                                if (!bl) {
                                                    this.D = -1.0f;
                                                    this.E = -1.0f;
                                                    return bl;
                                                }
                                                if (this.D < 0.0f) {
                                                    this.D = f4;
                                                    this.E = f5;
                                                }
                                                return bl;
                                            }
                                            if ((255 & motionEvent.getAction()) != 2 || motionEvent.getPointerCount() != 1 || this.F == -1) break block10;
                                            f2 = Math.min((float)Math.max((float)f4, (float)this.getPaddingLeft()), (float)(this.getWidth() - this.getPaddingRight()));
                                            f3 = Math.min((float)Math.max((float)f5, (float)this.getPaddingTop()), (float)(this.getHeight() - this.getPaddingBottom()));
                                            this.l.set(this.k);
                                            int n = this.F;
                                            if (n == 0) break block11;
                                            if (n == 1) break block12;
                                            if (n == 2) break block13;
                                            if (n == 3) break block14;
                                            if (n != 4) break block15;
                                            this.l.offset(f2 - this.D, f3 - this.E);
                                            if (!(this.l.left > (float)this.getLeft()) || !(this.l.top > (float)this.getTop()) || !(this.l.right < (float)this.getRight()) || !(this.l.bottom < (float)this.getBottom())) break block16;
                                            this.k.set(this.l);
                                            break block17;
                                        }
                                        RectF rectF = this.l;
                                        RectF rectF2 = this.k;
                                        rectF.set(f2, rectF2.top, rectF2.right, f3);
                                        break block15;
                                    }
                                    RectF rectF = this.l;
                                    RectF rectF3 = this.k;
                                    rectF.set(rectF3.left, rectF3.top, f2, f3);
                                    break block15;
                                }
                                RectF rectF = this.l;
                                RectF rectF4 = this.k;
                                rectF.set(rectF4.left, f3, f2, rectF4.bottom);
                                break block15;
                            }
                            RectF rectF = this.l;
                            RectF rectF5 = this.k;
                            rectF.set(f2, f3, rectF5.right, rectF5.bottom);
                        }
                        boolean bl = this.l.height() >= (float)this.H;
                        boolean bl2 = this.l.width() >= (float)this.H;
                        RectF rectF = this.k;
                        float f6 = bl2 ? this.l.left : rectF.left;
                        float f7 = bl ? this.l.top : rectF.top;
                        float f8 = bl2 ? this.l.right : rectF.right;
                        float f9 = bl ? this.l.bottom : rectF.bottom;
                        rectF.set(f6, f7, f8, f9);
                        if (!bl && !bl2) break block16;
                    }
                    this.a();
                    this.postInvalidate();
                }
                this.D = f2;
                this.E = f3;
                return true;
            }
            if ((255 & motionEvent.getAction()) == 1) {
                this.D = -1.0f;
                this.E = -1.0f;
                this.F = -1;
                d d4 = this.J;
                if (d4 != null) {
                    RectF rectF = this.k;
                    ((e)d4).a.k.setCropRect(rectF);
                }
            }
            return false;
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean bl) {
        this.v = bl;
    }

    public void setCropFrameColor(@ColorInt int n) {
        this.A.setColor(n);
    }

    public void setCropFrameStrokeWidth(@IntRange(from=0L) int n) {
        this.A.setStrokeWidth((float)n);
    }

    public void setCropGridColor(@ColorInt int n) {
        this.z.setColor(n);
    }

    public void setCropGridColumnCount(@IntRange(from=0L) int n) {
        this.q = n;
        this.s = null;
    }

    public void setCropGridRowCount(@IntRange(from=0L) int n) {
        this.p = n;
        this.s = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from=0L) int n) {
        this.z.setStrokeWidth((float)n);
    }

    public void setDimmedColor(@ColorInt int n) {
        this.w = n;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean bl) {
        this.C = bl ? 1 : 0;
    }

    public void setFreestyleCropMode(int n) {
        this.C = n;
        this.postInvalidate();
    }

    public void setOverlayViewChangeListener(d d2) {
        this.J = d2;
    }

    public void setShowCropFrame(boolean bl) {
        this.t = bl;
    }

    public void setShowCropGrid(boolean bl) {
        this.u = bl;
    }

    public void setTargetAspectRatio(float f2) {
        this.r = f2;
        int n = this.m;
        if (n > 0) {
            int n2 = (int)((float)n / f2);
            int n3 = this.n;
            if (n2 > n3) {
                int n4 = (int)(f2 * (float)n3);
                int n5 = (n - n4) / 2;
                this.k.set((float)(n5 + this.getPaddingLeft()), (float)this.getPaddingTop(), (float)(n5 + (n4 + this.getPaddingLeft())), (float)(this.getPaddingTop() + this.n));
            } else {
                int n6 = (n3 - n2) / 2;
                this.k.set((float)this.getPaddingLeft(), (float)(n6 + this.getPaddingTop()), (float)(this.getPaddingLeft() + this.m), (float)(n6 + (n2 + this.getPaddingTop())));
            }
            d d2 = this.J;
            if (d2 != null) {
                RectF rectF = this.k;
                ((e)d2).a.k.setCropRect(rectF);
            }
            this.a();
            this.postInvalidate();
            return;
        }
        this.K = true;
    }
}

