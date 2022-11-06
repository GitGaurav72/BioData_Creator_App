/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  androidx.annotation.NonNull
 *  com.yalantis.ucrop.view.GestureCropImageView
 *  e.s.a.b
 *  e.s.a.i.c
 *  e.s.a.i.d
 *  e.s.a.m.a
 *  e.s.a.m.d
 *  e.s.a.m.e
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Objects
 */
package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import e.s.a.b;
import e.s.a.i.c;
import e.s.a.i.d;
import e.s.a.m.a;
import e.s.a.m.e;
import java.util.Objects;

public class UCropView
extends FrameLayout {
    public GestureCropImageView k;
    public final OverlayView l;

    public UCropView(Context context, AttributeSet attributeSet) {
        OverlayView overlayView;
        int n;
        super(context, attributeSet, 0);
        LayoutInflater.from((Context)context).inflate(2131427524, (ViewGroup)this, true);
        this.k = (GestureCropImageView)this.findViewById(2131231011);
        this.l = overlayView = (OverlayView)this.findViewById(2131231405);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, b.b);
        Objects.requireNonNull((Object)((Object)overlayView));
        overlayView.v = typedArray.getBoolean(2, false);
        overlayView.w = n = typedArray.getColor(3, overlayView.getResources().getColor(2131034779));
        overlayView.y.setColor(n);
        overlayView.y.setStyle(Paint.Style.STROKE);
        overlayView.y.setStrokeWidth(1.0f);
        int n2 = typedArray.getDimensionPixelSize(5, overlayView.getResources().getDimensionPixelSize(2131100298));
        int n3 = typedArray.getColor(4, overlayView.getResources().getColor(2131034777));
        overlayView.A.setStrokeWidth((float)n2);
        overlayView.A.setColor(n3);
        overlayView.A.setStyle(Paint.Style.STROKE);
        overlayView.B.setStrokeWidth((float)(n2 * 3));
        overlayView.B.setColor(n3);
        overlayView.B.setStyle(Paint.Style.STROKE);
        overlayView.t = typedArray.getBoolean(10, true);
        int n4 = typedArray.getDimensionPixelSize(9, overlayView.getResources().getDimensionPixelSize(2131100299));
        int n5 = typedArray.getColor(6, overlayView.getResources().getColor(2131034778));
        overlayView.z.setStrokeWidth((float)n4);
        overlayView.z.setColor(n5);
        overlayView.p = typedArray.getInt(8, 2);
        overlayView.q = typedArray.getInt(7, 2);
        overlayView.u = typedArray.getBoolean(11, true);
        GestureCropImageView gestureCropImageView = this.k;
        Objects.requireNonNull((Object)gestureCropImageView);
        float f2 = Math.abs((float)typedArray.getFloat(0, 0.0f));
        float f3 = Math.abs((float)typedArray.getFloat(1, 0.0f));
        gestureCropImageView.B = f2 != 0.0f && f3 != 0.0f ? f2 / f3 : 0.0f;
        typedArray.recycle();
        this.k.setCropBoundsChangeListener((c)new e.s.a.m.d(this));
        overlayView.setOverlayViewChangeListener((d)new e(this));
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.k;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.l;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

