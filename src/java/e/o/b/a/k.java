/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.Matrix$ScaleToFit
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLayoutChangeListener
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewParent
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.OverScroller
 *  e.e.a.a.a
 *  e.o.b.a.k$a
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 */
package e.o.b.a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import e.o.b.a.g;
import e.o.b.a.h;
import e.o.b.a.i;
import e.o.b.a.k;

public class k
implements View.OnTouchListener,
View.OnLayoutChangeListener {
    public e.o.b.a.e A;
    public e.o.b.a.d B;
    public i C;
    public View.OnClickListener D;
    public View.OnLongClickListener E;
    public e.o.b.a.f F;
    public g G;
    public h H;
    public f I;
    public int J = 2;
    public int K = 2;
    public boolean L = true;
    public ImageView.ScaleType M = ImageView.ScaleType.FIT_CENTER;
    public e.o.b.a.b N = new a(this);
    public Interpolator k = new AccelerateDecelerateInterpolator();
    public int l = 200;
    public float m = 1.0f;
    public float n = 1.75f;
    public float o = 3.0f;
    public boolean p = true;
    public boolean q = false;
    public ImageView r;
    public GestureDetector s;
    public e.o.b.a.a t;
    public final Matrix u = new Matrix();
    public final Matrix v = new Matrix();
    public final Matrix w = new Matrix();
    public final RectF x = new RectF();
    public final float[] y = new float[9];
    public e.o.b.a.c z;

    public k(ImageView imageView) {
        GestureDetector gestureDetector;
        this.r = imageView;
        imageView.setOnTouchListener((View.OnTouchListener)this);
        imageView.addOnLayoutChangeListener((View.OnLayoutChangeListener)this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.t = new e.o.b.a.a(imageView.getContext(), this.N);
        this.s = gestureDetector = new GestureDetector(imageView.getContext(), (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(){

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                k k2 = k.this;
                if (k2.G != null) {
                    if (k2.h() > 1.0f) {
                        return false;
                    }
                    if (motionEvent.getPointerCount() <= 1) {
                        if (motionEvent2.getPointerCount() > 1) {
                            return false;
                        }
                        return k.this.G.onFling(motionEvent, motionEvent2, f2, f3);
                    }
                }
                return false;
            }

            public void onLongPress(MotionEvent motionEvent) {
                k k2 = k.this;
                View.OnLongClickListener onLongClickListener = k2.E;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick((View)k2.r);
                }
            }
        });
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener(){

            public boolean onDoubleTap(MotionEvent motionEvent) {
                float f2;
                k k2;
                float f3;
                block9 : {
                    float f4;
                    block8 : {
                        float f5;
                        try {
                            f5 = k.this.h();
                            f3 = motionEvent.getX();
                            f2 = motionEvent.getY();
                            k2 = k.this;
                            f4 = k2.n;
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
                        if (f5 < f4) break block8;
                        if (!(f5 >= f4)) break block9;
                        f4 = k2.o;
                        if (!(f5 < f4)) break block9;
                    }
                    k2.j(f4, f3, f2, true);
                    return true;
                }
                k2.j(k2.m, f3, f2, true);
                return true;
            }

            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                k k2 = k.this;
                View.OnClickListener onClickListener = k2.D;
                if (onClickListener != null) {
                    onClickListener.onClick((View)k2.r);
                }
                RectF rectF = k.this.c();
                float f2 = motionEvent.getX();
                float f3 = motionEvent.getY();
                k k3 = k.this;
                i i2 = k3.C;
                if (i2 != null) {
                    i2.a((View)k3.r, f2, f3);
                }
                if (rectF != null) {
                    if (rectF.contains(f2, f3)) {
                        float f4 = (f2 - rectF.left) / rectF.width();
                        float f5 = (f3 - rectF.top) / rectF.height();
                        k k4 = k.this;
                        e.o.b.a.e e2 = k4.A;
                        if (e2 != null) {
                            e2.a(k4.r, f4, f5);
                        }
                        return true;
                    }
                    k k5 = k.this;
                    e.o.b.a.d d2 = k5.B;
                    if (d2 != null) {
                        d2.a(k5.r);
                    }
                }
                return false;
            }
        });
    }

    public final void a() {
        if (this.b()) {
            RectF rectF;
            Matrix matrix = this.e();
            this.r.setImageMatrix(matrix);
            if (this.z != null && (rectF = this.d(matrix)) != null) {
                this.z.a(rectF);
            }
        }
    }

    public final boolean b() {
        float f2;
        RectF rectF = this.d(this.e());
        if (rectF == null) {
            return false;
        }
        float f3 = rectF.height();
        float f4 = rectF.width();
        float f5 = this.f(this.r);
        float f6 = f3 FCMPG f5;
        float f7 = 0.0f;
        if (f6 <= 0) {
            int n2 = d.a[this.M.ordinal()];
            if (n2 != 2) {
                float f8 = f5 - f3;
                if (n2 != 3) {
                    f8 /= 2.0f;
                }
                f2 = f8 - rectF.top;
            } else {
                f2 = -rectF.top;
            }
            this.K = 2;
        } else {
            float f9 = rectF.top;
            if (f9 > 0.0f) {
                this.K = 0;
                f2 = -f9;
            } else {
                float f10 = rectF.bottom;
                if (f10 < f5) {
                    this.K = 1;
                    f2 = f5 - f10;
                } else {
                    this.K = -1;
                    f2 = 0.0f;
                }
            }
        }
        float f11 = this.g(this.r);
        if (f4 <= f11) {
            int n3 = d.a[this.M.ordinal()];
            if (n3 != 2) {
                float f12 = f11 - f4;
                if (n3 != 3) {
                    f12 /= 2.0f;
                }
                f7 = f12 - rectF.left;
            } else {
                f7 = -rectF.left;
            }
            this.J = 2;
        } else {
            float f13 = rectF.left;
            if (f13 > 0.0f) {
                this.J = 0;
                f7 = -f13;
            } else {
                float f14 = rectF.right;
                if (f14 < f11) {
                    f7 = f11 - f14;
                    this.J = 1;
                } else {
                    this.J = -1;
                }
            }
        }
        this.w.postTranslate(f7, f2);
        return true;
    }

    public RectF c() {
        this.b();
        return this.d(this.e());
    }

    public final RectF d(Matrix matrix) {
        Drawable drawable = this.r.getDrawable();
        if (drawable != null) {
            this.x.set(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
            matrix.mapRect(this.x);
            return this.x;
        }
        return null;
    }

    public final Matrix e() {
        this.v.set(this.u);
        this.v.postConcat(this.w);
        return this.v;
    }

    public final int f(ImageView imageView) {
        return imageView.getHeight() - imageView.getPaddingTop() - imageView.getPaddingBottom();
    }

    public final int g(ImageView imageView) {
        return imageView.getWidth() - imageView.getPaddingLeft() - imageView.getPaddingRight();
    }

    public float h() {
        this.w.getValues(this.y);
        float f2 = (float)Math.pow((double)this.y[0], (double)2.0);
        this.w.getValues(this.y);
        return (float)Math.sqrt((double)(f2 + (float)Math.pow((double)this.y[3], (double)2.0)));
    }

    public final void i() {
        RectF rectF;
        this.w.reset();
        this.w.postRotate(0.0f);
        this.a();
        Matrix matrix = this.e();
        this.r.setImageMatrix(matrix);
        if (this.z != null && (rectF = this.d(matrix)) != null) {
            this.z.a(rectF);
        }
        this.b();
    }

    public void j(float f2, float f3, float f4, boolean bl) {
        if (!(f2 < this.m) && !(f2 > this.o)) {
            if (bl) {
                ImageView imageView = this.r;
                e e2 = new e(this.h(), f2, f3, f4);
                imageView.post((Runnable)e2);
                return;
            }
            this.w.setScale(f2, f2, f3, f4);
            this.a();
            return;
        }
        throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
    }

    public void k() {
        if (this.L) {
            this.l(this.r.getDrawable());
            return;
        }
        this.i();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void l(Drawable drawable) {
        block3 : {
            Matrix matrix;
            RectF rectF;
            RectF rectF2;
            Matrix.ScaleToFit scaleToFit;
            block10 : {
                block7 : {
                    block8 : {
                        block9 : {
                            float f2;
                            int n2;
                            float f3;
                            float f4;
                            float f5;
                            block6 : {
                                float f6;
                                block5 : {
                                    float f7;
                                    ImageView.ScaleType scaleType;
                                    float f8;
                                    block4 : {
                                        block2 : {
                                            if (drawable == null) {
                                                return;
                                            }
                                            f2 = this.g(this.r);
                                            f4 = this.f(this.r);
                                            int n3 = drawable.getIntrinsicWidth();
                                            int n4 = drawable.getIntrinsicHeight();
                                            this.u.reset();
                                            f5 = n3;
                                            f7 = f2 / f5;
                                            f3 = n4;
                                            f8 = f4 / f3;
                                            scaleType = this.M;
                                            if (scaleType != ImageView.ScaleType.CENTER) break block2;
                                            this.u.postTranslate((f2 - f5) / 2.0f, (f4 - f3) / 2.0f);
                                            break block3;
                                        }
                                        if (scaleType != ImageView.ScaleType.CENTER_CROP) break block4;
                                        f6 = Math.max((float)f7, (float)f8);
                                        break block5;
                                    }
                                    if (scaleType != ImageView.ScaleType.CENTER_INSIDE) break block6;
                                    f6 = Math.min((float)1.0f, (float)Math.min((float)f7, (float)f8));
                                }
                                this.u.postScale(f6, f6);
                                this.u.postTranslate((f2 - f5 * f6) / 2.0f, (f4 - f3 * f6) / 2.0f);
                                break block3;
                            }
                            rectF = new RectF(0.0f, 0.0f, f5, f3);
                            rectF2 = new RectF(0.0f, 0.0f, f2, f4);
                            if ((int)0.0f % 180 != 0) {
                                rectF = new RectF(0.0f, 0.0f, f3, f5);
                            }
                            if ((n2 = d.a[this.M.ordinal()]) == 1) break block7;
                            if (n2 == 2) break block8;
                            if (n2 == 3) break block9;
                            if (n2 != 4) break block3;
                            matrix = this.u;
                            scaleToFit = Matrix.ScaleToFit.FILL;
                            break block10;
                        }
                        matrix = this.u;
                        scaleToFit = Matrix.ScaleToFit.END;
                        break block10;
                    }
                    matrix = this.u;
                    scaleToFit = Matrix.ScaleToFit.START;
                    break block10;
                }
                matrix = this.u;
                scaleToFit = Matrix.ScaleToFit.CENTER;
            }
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        }
        this.i();
    }

    public void onLayoutChange(View view, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n2 != n6 || n3 != n7 || n4 != n8 || n5 != n9) {
            this.l(this.r.getDrawable());
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl;
        block10 : {
            boolean bl2;
            block15 : {
                block12 : {
                    f f2;
                    block11 : {
                        e e2;
                        block14 : {
                            RectF rectF;
                            block13 : {
                                boolean bl3 = this.L;
                                bl = false;
                                if (!bl3) break block10;
                                boolean bl4 = ((ImageView)view).getDrawable() != null;
                                bl = false;
                                if (!bl4) break block10;
                                int n2 = motionEvent.getAction();
                                if (n2 == 0) break block11;
                                if (n2 != 1 && n2 != 3) break block12;
                                if (!(this.h() < this.m)) break block13;
                                RectF rectF2 = this.c();
                                if (rectF2 == null) break block12;
                                float f3 = this.h();
                                float f4 = this.m;
                                float f5 = rectF2.centerX();
                                float f6 = rectF2.centerY();
                                e2 = new e(f3, f4, f5, f6);
                                break block14;
                            }
                            if (!(this.h() > this.o) || (rectF = this.c()) == null) break block12;
                            float f7 = this.h();
                            float f8 = this.o;
                            float f9 = rectF.centerX();
                            float f10 = rectF.centerY();
                            e2 = new e(f7, f8, f9, f10);
                        }
                        view.post((Runnable)e2);
                        bl2 = true;
                        break block15;
                    }
                    ViewParent viewParent = view.getParent();
                    if (viewParent != null) {
                        viewParent.requestDisallowInterceptTouchEvent(true);
                    }
                    if ((f2 = this.I) != null) {
                        f2.k.forceFinished(true);
                        this.I = null;
                    }
                }
                bl2 = false;
            }
            e.o.b.a.a a2 = this.t;
            if (a2 != null) {
                boolean bl5;
                boolean bl6;
                bl5 = a2.c();
                e.o.b.a.a a3 = this.t;
                bl6 = a3.e;
                try {
                    a3.c.onTouchEvent(motionEvent);
                    a3.d(motionEvent);
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                boolean bl7 = !bl5 && !this.t.c();
                boolean bl8 = !bl6 && !this.t.e;
                boolean bl9 = false;
                if (bl7) {
                    bl9 = false;
                    if (bl8) {
                        bl9 = true;
                    }
                }
                this.q = bl9;
                bl = true;
            } else {
                bl = bl2;
            }
            GestureDetector gestureDetector = this.s;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                bl = true;
            }
        }
        return bl;
    }

    public class e
    implements Runnable {
        public final float k;
        public final float l;
        public final long m;
        public final float n;
        public final float o;

        public e(float f2, float f3, float f4, float f5) {
            this.k = f4;
            this.l = f5;
            this.m = System.currentTimeMillis();
            this.n = f2;
            this.o = f3;
        }

        public void run() {
            float f2 = Math.min((float)1.0f, (float)(1.0f * (float)(System.currentTimeMillis() - this.m) / (float)k.this.l));
            float f3 = k.this.k.getInterpolation(f2);
            float f4 = this.n;
            float f5 = e.e.a.a.a.a((float)this.o, (float)f4, (float)f3, (float)f4) / k.this.h();
            e.o.b.a.b b2 = k.this.N;
            float f6 = this.k;
            float f7 = this.l;
            ((a)b2).a(f5, f6, f7);
            if (f3 < 1.0f) {
                k.this.r.postOnAnimation((Runnable)this);
            }
        }
    }

    public class f
    implements Runnable {
        public final OverScroller k;
        public int l;
        public int m;

        public f(Context context) {
            this.k = new OverScroller(context);
        }

        public void run() {
            if (this.k.isFinished()) {
                return;
            }
            if (this.k.computeScrollOffset()) {
                int n2 = this.k.getCurrX();
                int n3 = this.k.getCurrY();
                k.this.w.postTranslate((float)(this.l - n2), (float)(this.m - n3));
                k.this.a();
                this.l = n2;
                this.m = n3;
                k.this.r.postOnAnimation((Runnable)this);
            }
        }
    }

}

