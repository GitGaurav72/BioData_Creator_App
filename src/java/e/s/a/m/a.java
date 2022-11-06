/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  androidx.annotation.IntRange
 *  androidx.annotation.Nullable
 *  com.yalantis.ucrop.UCropActivity
 *  com.yalantis.ucrop.UCropActivity$a
 *  e.s.a.a
 *  e.s.a.i.c
 *  e.s.a.m.a$a
 *  e.s.a.m.c
 *  e.s.a.m.c$a
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Arrays
 */
package e.s.a.m;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import e.s.a.m.a;
import e.s.a.m.c;
import e.s.a.m.d;
import java.util.Arrays;

/*
 * Exception performing whole class analysis.
 */
public class a
extends c {
    public final Matrix A;
    public float B;
    public float C;
    public e.s.a.i.c D;
    public Runnable E;
    public Runnable F;
    public float G;
    public float H;
    public int I;
    public int J;
    public long K;
    public final RectF z;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.z = new RectF();
        this.A = new Matrix();
        this.C = 10.0f;
        this.F = null;
        this.I = 0;
        this.J = 0;
        this.K = 500L;
    }

    public void d() {
        c.a a2;
        int n2;
        int n3;
        float f2;
        int n4;
        float f3;
        super.d();
        Drawable drawable = this.getDrawable();
        if (drawable == null) {
            return;
        }
        float f4 = drawable.getIntrinsicWidth();
        float f5 = drawable.getIntrinsicHeight();
        if (this.B == 0.0f) {
            this.B = f4 / f5;
        }
        if ((n3 = (int)((f2 = (float)(n2 = this.o)) / (f3 = this.B))) > (n4 = this.p)) {
            float f6 = n4;
            int n5 = (int)(f3 * f6);
            int n6 = (n2 - n5) / 2;
            this.z.set((float)n6, 0.0f, (float)(n5 + n6), f6);
        } else {
            int n7 = (n4 - n3) / 2;
            this.z.set(0.0f, (float)n7, f2, (float)(n3 + n7));
        }
        this.h(f4, f5);
        float f7 = this.z.width();
        float f8 = this.z.height();
        float f9 = Math.max((float)(this.z.width() / f4), (float)(this.z.height() / f5));
        float f10 = (f7 - f4 * f9) / 2.0f;
        RectF rectF = this.z;
        float f11 = f10 + rectF.left;
        float f12 = (f8 - f5 * f9) / 2.0f + rectF.top;
        this.n.reset();
        this.n.postScale(f9, f9);
        this.n.postTranslate(f11, f12);
        this.setImageMatrix(this.n);
        e.s.a.i.c c2 = this.D;
        if (c2 != null) {
            float f13 = this.B;
            ((d)c2).a.l.setTargetAspectRatio(f13);
        }
        if ((a2 = this.q) != null) {
            float f14 = this.getCurrentScale();
            ((UCropActivity.a)a2).b(f14);
            c.a a3 = this.q;
            float f15 = this.getCurrentAngle();
            ((UCropActivity.a)a3).a(f15);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(float f2, float f3, float f4) {
        if (f2 > 1.0f && f2 * this.getCurrentScale() <= this.getMaxScale() || f2 < 1.0f && f2 * this.getCurrentScale() >= this.getMinScale()) {
            super.f(f2, f3, f4);
            return;
        }
    }

    @Nullable
    public e.s.a.i.c getCropBoundsChangeListener() {
        return this.D;
    }

    public float getMaxScale() {
        return this.G;
    }

    public float getMinScale() {
        return this.H;
    }

    public float getTargetAspectRatio() {
        return this.B;
    }

    public final void h(float f2, float f3) {
        float f4;
        this.H = f4 = Math.min((float)Math.min((float)(this.z.width() / f2), (float)(this.z.width() / f3)), (float)Math.min((float)(this.z.height() / f3), (float)(this.z.height() / f2)));
        this.G = f4 * this.C;
    }

    public void i() {
        this.removeCallbacks(this.E);
        this.removeCallbacks(this.F);
    }

    public boolean j(float[] arrf) {
        this.A.reset();
        this.A.setRotate(-this.getCurrentAngle());
        float[] arrf2 = Arrays.copyOf((float[])arrf, (int)arrf.length);
        this.A.mapPoints(arrf2);
        float[] arrf3 = e.s.a.a.p1((RectF)this.z);
        this.A.mapPoints(arrf3);
        return e.s.a.a.s4((float[])arrf2).contains(e.s.a.a.s4((float[])arrf3));
    }

    public void k(float f2) {
        this.e(f2, this.z.centerX(), this.z.centerY());
    }

    public void l(float f2, float f3, float f4) {
        if (f2 <= this.getMaxScale()) {
            this.f(f2 / this.getCurrentScale(), f3, f4);
        }
    }

    public void setCropBoundsChangeListener(@Nullable e.s.a.i.c c2) {
        this.D = c2;
    }

    public void setCropRect(RectF rectF) {
        this.B = rectF.width() / rectF.height();
        this.z.set(rectF.left - (float)this.getPaddingLeft(), rectF.top - (float)this.getPaddingTop(), rectF.right - (float)this.getPaddingRight(), rectF.bottom - (float)this.getPaddingBottom());
        Drawable drawable = this.getDrawable();
        if (drawable != null) {
            this.h(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean bl) {
        if (this.u && !this.j(this.k)) {
            float f2;
            boolean bl2;
            float f3;
            float f4;
            float f5;
            float[] arrf = this.l;
            float f6 = arrf[0];
            float f7 = arrf[1];
            float f8 = this.getCurrentScale();
            float f9 = this.z.centerX() - f6;
            float f10 = this.z.centerY() - f7;
            this.A.reset();
            this.A.setTranslate(f9, f10);
            float[] arrf2 = this.k;
            float[] arrf3 = Arrays.copyOf((float[])arrf2, (int)arrf2.length);
            this.A.mapPoints(arrf3);
            boolean bl3 = this.j(arrf3);
            if (bl3) {
                this.A.reset();
                this.A.setRotate(-this.getCurrentAngle());
                float[] arrf4 = this.k;
                float[] arrf5 = Arrays.copyOf((float[])arrf4, (int)arrf4.length);
                float[] arrf6 = e.s.a.a.p1((RectF)this.z);
                this.A.mapPoints(arrf5);
                this.A.mapPoints(arrf6);
                RectF rectF = e.s.a.a.s4((float[])arrf5);
                RectF rectF2 = e.s.a.a.s4((float[])arrf6);
                float f11 = rectF.left - rectF2.left;
                float f12 = rectF.top - rectF2.top;
                float f13 = rectF.right - rectF2.right;
                float f14 = rectF.bottom - rectF2.bottom;
                float[] arrf7 = new float[4];
                if (!(f11 > 0.0f)) {
                    f11 = 0.0f;
                }
                arrf7[0] = f11;
                if (!(f12 > 0.0f)) {
                    f12 = 0.0f;
                }
                arrf7[1] = f12;
                if (!(f13 < 0.0f)) {
                    f13 = 0.0f;
                }
                arrf7[2] = f13;
                if (!(f14 < 0.0f)) {
                    f14 = 0.0f;
                }
                arrf7[3] = f14;
                this.A.reset();
                this.A.setRotate(this.getCurrentAngle());
                this.A.mapPoints(arrf7);
                float f15 = -(arrf7[0] + arrf7[2]);
                f4 = -(arrf7[1] + arrf7[3]);
                f5 = f8;
                bl2 = bl3;
                f2 = f15;
                f3 = 0.0f;
            } else {
                RectF rectF = new RectF(this.z);
                this.A.reset();
                this.A.setRotate(this.getCurrentAngle());
                this.A.mapRect(rectF);
                float[] arrf8 = this.k;
                float[] arrf9 = new float[2];
                double d2 = arrf8[0] - arrf8[2];
                bl2 = bl3;
                double d3 = Math.pow((double)d2, (double)2.0);
                float f16 = arrf8[1] - arrf8[3];
                f5 = f8;
                arrf9[0] = (float)Math.sqrt((double)(d3 + Math.pow((double)f16, (double)2.0)));
                arrf9[1] = (float)Math.sqrt((double)(Math.pow((double)(arrf8[2] - arrf8[4]), (double)2.0) + Math.pow((double)(arrf8[3] - arrf8[5]), (double)2.0)));
                float f17 = f5 * Math.max((float)(rectF.width() / arrf9[0]), (float)(rectF.height() / arrf9[1])) - f5;
                f2 = f9;
                f3 = f17;
                f4 = f10;
            }
            if (bl) {
                a a2 = new /* Unavailable Anonymous Inner Class!! */;
                this.E = a2;
                this.post((Runnable)a2);
                return;
            }
            this.g(f2, f4);
            if (!bl2) {
                this.l(f5 + f3, this.z.centerX(), this.z.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from=100L) long l2) {
        if (l2 > 0L) {
            this.K = l2;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(@IntRange(from=10L) int n2) {
        this.I = n2;
    }

    public void setMaxResultImageSizeY(@IntRange(from=10L) int n2) {
        this.J = n2;
    }

    public void setMaxScaleMultiplier(float f2) {
        this.C = f2;
    }

    public void setTargetAspectRatio(float f2) {
        Drawable drawable = this.getDrawable();
        if (drawable == null) {
            this.B = f2;
            return;
        }
        if (f2 == 0.0f) {
            f2 = (float)drawable.getIntrinsicWidth() / (float)drawable.getIntrinsicHeight();
        }
        this.B = f2;
        e.s.a.i.c c2 = this.D;
        if (c2 != null) {
            ((d)c2).a.l.setTargetAspectRatio(f2);
        }
    }
}

