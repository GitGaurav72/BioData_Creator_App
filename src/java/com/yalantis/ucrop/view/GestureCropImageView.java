/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.ScaleGestureDetector$SimpleOnScaleGestureListener
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  com.yalantis.ucrop.view.GestureCropImageView$c
 *  e.s.a.l.c
 *  e.s.a.l.c$a
 *  e.s.a.m.a$b
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Objects
 */
package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import com.yalantis.ucrop.view.GestureCropImageView;
import e.s.a.l.c;
import e.s.a.m.a;
import java.util.Objects;

/*
 * Exception performing whole class analysis.
 */
public class GestureCropImageView
extends e.s.a.m.a {
    public ScaleGestureDetector L;
    public e.s.a.l.c M;
    public GestureDetector N;
    public float O;
    public float P;
    public boolean Q;
    public boolean R;
    public int S;

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Q = true;
        this.R = true;
        this.S = 5;
    }

    public void c() {
        this.setScaleType(ImageView.ScaleType.MATRIX);
        this.N = new GestureDetector(this.getContext(), (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this, null){
            public final /* synthetic */ GestureCropImageView a;
            {
                this.a = gestureCropImageView;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                GestureCropImageView gestureCropImageView = this.a;
                float f2 = gestureCropImageView.getDoubleTapTargetScale();
                float f3 = motionEvent.getX();
                float f4 = motionEvent.getY();
                if (f2 > gestureCropImageView.getMaxScale()) {
                    f2 = gestureCropImageView.getMaxScale();
                }
                float f5 = gestureCropImageView.getCurrentScale();
                float f6 = f2 - f5;
                a.b b2 = new /* Unavailable Anonymous Inner Class!! */;
                gestureCropImageView.F = b2;
                gestureCropImageView.post((Runnable)b2);
                return super.onDoubleTap(motionEvent);
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                this.a.g(-f2, -f3);
                return true;
            }
        }, null, true);
        this.L = new ScaleGestureDetector(this.getContext(), (ScaleGestureDetector.OnScaleGestureListener)new ScaleGestureDetector.SimpleOnScaleGestureListener(null){

            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                GestureCropImageView gestureCropImageView = GestureCropImageView.this;
                float f2 = scaleGestureDetector.getScaleFactor();
                GestureCropImageView gestureCropImageView2 = GestureCropImageView.this;
                gestureCropImageView.f(f2, gestureCropImageView2.O, gestureCropImageView2.P);
                return true;
            }
        });
        this.M = new e.s.a.l.c((c.a)new /* Unavailable Anonymous Inner Class!! */);
    }

    public int getDoubleTapScaleSteps() {
        return this.S;
    }

    public float getDoubleTapTargetScale() {
        return this.getCurrentScale() * (float)Math.pow((double)(this.getMaxScale() / this.getMinScale()), (double)(1.0f / (float)this.S));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        block10 : {
            block15 : {
                block11 : {
                    block12 : {
                        e.s.a.l.c c2;
                        float f2;
                        float f3;
                        float f4;
                        float f5;
                        block17 : {
                            float f6;
                            block19 : {
                                float f7;
                                block18 : {
                                    block16 : {
                                        block13 : {
                                            block14 : {
                                                if ((255 & motionEvent.getAction()) == 0) {
                                                    this.i();
                                                }
                                                if (motionEvent.getPointerCount() > 1) {
                                                    this.O = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                                                    this.P = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                                                }
                                                this.N.onTouchEvent(motionEvent);
                                                if (this.R) {
                                                    this.L.onTouchEvent(motionEvent);
                                                }
                                                if (!this.Q) break block10;
                                                c2 = this.M;
                                                Objects.requireNonNull((Object)c2);
                                                int n2 = motionEvent.getActionMasked();
                                                if (n2 == 0) break block11;
                                                if (n2 == 1) break block12;
                                                if (n2 == 2) break block13;
                                                if (n2 == 5) break block14;
                                                if (n2 == 6) {
                                                    c2.f = -1;
                                                }
                                                break block10;
                                            }
                                            c2.a = motionEvent.getX();
                                            c2.b = motionEvent.getY();
                                            c2.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                                            break block15;
                                        }
                                        if (c2.e == -1 || c2.f == -1 || motionEvent.getPointerCount() <= c2.f) break block10;
                                        f5 = motionEvent.getX(c2.e);
                                        f3 = motionEvent.getY(c2.e);
                                        f2 = motionEvent.getX(c2.f);
                                        f4 = motionEvent.getY(c2.f);
                                        if (!c2.h) break block16;
                                        c2.g = 0.0f;
                                        c2.h = false;
                                        break block17;
                                    }
                                    float f8 = c2.a;
                                    float f9 = c2.b;
                                    float f10 = c2.c;
                                    float f11 = (float)Math.toDegrees((double)((float)Math.atan2((double)(f9 - c2.d), (double)(f8 - f10))));
                                    c2.g = f7 = (float)Math.toDegrees((double)((float)Math.atan2((double)(f4 - f3), (double)(f2 - f5)))) % 360.0f - f11 % 360.0f;
                                    if (!(f7 < -180.0f)) break block18;
                                    f6 = f7 + 360.0f;
                                    break block19;
                                }
                                if (!(f7 > 180.0f)) break block17;
                                f6 = f7 - 360.0f;
                            }
                            c2.g = f6;
                        }
                        c.a a2 = c2.i;
                        if (a2 != null) {
                            GestureCropImageView gestureCropImageView = (a2).a;
                            gestureCropImageView.e(c2.g, gestureCropImageView.O, gestureCropImageView.P);
                        }
                        c2.a = f2;
                        c2.b = f4;
                        c2.c = f5;
                        c2.d = f3;
                        break block10;
                    }
                    c2.e = -1;
                    break block10;
                }
                c2.c = motionEvent.getX();
                c2.d = motionEvent.getY();
                c2.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            }
            c2.g = 0.0f;
            c2.h = true;
        }
        if ((255 & motionEvent.getAction()) == 1) {
            this.setImageToWrapCropBounds(true);
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int n2) {
        this.S = n2;
    }

    public void setRotateEnabled(boolean bl) {
        this.Q = bl;
    }

    public void setScaleEnabled(boolean bl) {
        this.R = bl;
    }

}

