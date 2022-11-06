/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.RectF
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.IdRes
 *  androidx.appcompat.app.ActionBar
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.appcompat.app.AppCompatDelegate
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.content.ContextCompat
 *  androidx.fragment.app.FragmentActivity
 *  androidx.transition.AutoTransition
 *  androidx.transition.Transition
 *  androidx.transition.TransitionManager
 *  com.yalantis.ucrop.UCropActivity$a
 *  com.yalantis.ucrop.view.widget.AspectRatioTextView
 *  e.s.a.a
 *  e.s.a.c
 *  e.s.a.e
 *  e.s.a.f
 *  e.s.a.i.a
 *  e.s.a.i.b
 *  e.s.a.j.a
 *  e.s.a.j.b
 *  e.s.a.j.c
 *  e.s.a.j.d
 *  e.s.a.k.a
 *  e.s.a.k.b
 *  e.s.a.l.d
 *  e.s.a.m.c
 *  e.s.a.m.c$a
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import e.s.a.d;
import e.s.a.e;
import e.s.a.f;
import e.s.a.g;
import e.s.a.h;
import e.s.a.m.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class UCropActivity
extends AppCompatActivity {
    public static final Bitmap.CompressFormat k = Bitmap.CompressFormat.JPEG;
    public ViewGroup A;
    public ViewGroup B;
    public ViewGroup C;
    public ViewGroup D;
    public ViewGroup E;
    public List<ViewGroup> F = new ArrayList();
    public TextView G;
    public TextView H;
    public View I;
    public Transition J;
    public Bitmap.CompressFormat K = k;
    public int L = 90;
    public int[] M = new int[]{1, 2, 3};
    public c.a N = new a(this);
    public final View.OnClickListener O = new View.OnClickListener(this){
        public final /* synthetic */ UCropActivity k;
        {
            this.k = uCropActivity;
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity uCropActivity = this.k;
                int n2 = view.getId();
                uCropActivity.k(n2);
            }
        }
    };
    public String l;
    public int m;
    public int n;
    public int o;
    public int p;
    @ColorInt
    public int q;
    @DrawableRes
    public int r;
    @DrawableRes
    public int s;
    public int t;
    public boolean u;
    public boolean v = true;
    public UCropView w;
    public GestureCropImageView x;
    public OverlayView y;
    public ViewGroup z;

    public static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled((boolean)true);
    }

    public final void i(int n2) {
        boolean bl;
        GestureCropImageView gestureCropImageView;
        block4 : {
            block3 : {
                GestureCropImageView gestureCropImageView2 = this.x;
                int[] arrn = this.M;
                boolean bl2 = arrn[n2] == 3 || arrn[n2] == 1;
                gestureCropImageView2.setScaleEnabled(bl2);
                gestureCropImageView = this.x;
                int[] arrn2 = this.M;
                if (arrn2[n2] == 3) break block3;
                int n3 = arrn2[n2];
                bl = false;
                if (n3 != 2) break block4;
            }
            bl = true;
        }
        gestureCropImageView.setRotateEnabled(bl);
    }

    public void j(Throwable throwable) {
        this.setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", (Serializable)throwable));
    }

    public final void k(@IdRes int n2) {
        if (!this.u) {
            return;
        }
        ViewGroup viewGroup = this.z;
        boolean bl = n2 == 2131231298;
        viewGroup.setSelected(bl);
        ViewGroup viewGroup2 = this.A;
        boolean bl2 = n2 == 2131231299;
        viewGroup2.setSelected(bl2);
        ViewGroup viewGroup3 = this.B;
        boolean bl3 = n2 == 2131231300;
        viewGroup3.setSelected(bl3);
        ViewGroup viewGroup4 = this.C;
        int n3 = 8;
        int n4 = n2 == 2131231298 ? 0 : n3;
        viewGroup4.setVisibility(n4);
        ViewGroup viewGroup5 = this.D;
        int n5 = n2 == 2131231299 ? 0 : n3;
        viewGroup5.setVisibility(n5);
        ViewGroup viewGroup6 = this.E;
        int n6 = n2 == 2131231300 ? 0 : n3;
        viewGroup6.setVisibility(n6);
        TransitionManager.beginDelayedTransition((ViewGroup)((ViewGroup)this.findViewById(2131231387)), (Transition)this.J);
        View view = this.B.findViewById(2131231348);
        int n7 = n2 == 2131231300 ? 0 : n3;
        view.setVisibility(n7);
        View view2 = this.z.findViewById(2131231343);
        int n8 = n2 == 2131231298 ? 0 : n3;
        view2.setVisibility(n8);
        View view3 = this.A.findViewById(2131231347);
        if (n2 == 2131231299) {
            n3 = 0;
        }
        view3.setVisibility(n3);
        if (n2 == 2131231300) {
            this.i(0);
            return;
        }
        if (n2 == 2131231299) {
            this.i(1);
            return;
        }
        this.i(2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void onCreate(Bundle var1_1) {
        block22 : {
            block23 : {
                block24 : {
                    FragmentActivity.super.onCreate(var1_1);
                    this.setContentView(2131427518);
                    var2_2 = this.getIntent();
                    this.n = var2_2.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor((Context)this, (int)2131034786));
                    this.m = var2_2.getIntExtra("com.yalantis.ucrop.ToolbarColor", ContextCompat.getColor((Context)this, (int)2131034787));
                    this.o = var2_2.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", ContextCompat.getColor((Context)this, (int)2131034773));
                    this.p = var2_2.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", ContextCompat.getColor((Context)this, (int)2131034788));
                    this.r = var2_2.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", 2131165463);
                    this.s = var2_2.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", 2131165464);
                    this.l = var3_3 = var2_2.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
                    if (var3_3 == null) {
                        var3_3 = this.getResources().getString(2131755367);
                    }
                    this.l = var3_3;
                    this.t = var2_2.getIntExtra("com.yalantis.ucrop.UcropLogoColor", ContextCompat.getColor((Context)this, (int)2131034780));
                    this.u = true ^ var2_2.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
                    this.q = var2_2.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", ContextCompat.getColor((Context)this, (int)2131034776));
                    var4_4 = this.n;
                    var5_5 = this.getWindow();
                    if (var5_5 != null) {
                        var5_5.addFlags(Integer.MIN_VALUE);
                        var5_5.setStatusBarColor(var4_4);
                    }
                    var6_6 = (Toolbar)this.findViewById(2131231363);
                    var6_6.setBackgroundColor(this.m);
                    var6_6.setTitleTextColor(this.p);
                    var7_7 = (TextView)var6_6.findViewById(2131231364);
                    var7_7.setTextColor(this.p);
                    var7_7.setText((CharSequence)this.l);
                    var8_8 = ContextCompat.getDrawable((Context)this, (int)this.r).mutate();
                    var8_8.setColorFilter(this.p, PorterDuff.Mode.SRC_ATOP);
                    var6_6.setNavigationIcon(var8_8);
                    this.setSupportActionBar(var6_6);
                    var9_9 = this.getSupportActionBar();
                    if (var9_9 != null) {
                        var9_9.setDisplayShowTitleEnabled(false);
                    }
                    this.w = var10_10 = (UCropView)this.findViewById(2131231385);
                    this.x = var10_10.getCropImageView();
                    this.y = this.w.getOverlayView();
                    this.x.setTransformImageListener(this.N);
                    ((ImageView)this.findViewById(2131231013)).setColorFilter(this.t, PorterDuff.Mode.SRC_ATOP);
                    this.findViewById(2131231386).setBackgroundColor(this.q);
                    if (!this.u) {
                        ((RelativeLayout.LayoutParams)this.findViewById((int)2131231386).getLayoutParams()).bottomMargin = 0;
                        this.findViewById(2131231386).requestLayout();
                    }
                    if (this.u) {
                        var34_11 = (ViewGroup)((ViewGroup)this.findViewById(2131231387)).findViewById(2131230883);
                        var34_11.setVisibility(0);
                        LayoutInflater.from((Context)this).inflate(2131427520, var34_11, true);
                        var36_12 = new AutoTransition();
                        this.J = var36_12;
                        var36_12.setDuration(50L);
                        this.z = var38_13 = (ViewGroup)this.findViewById(2131231298);
                        var38_13.setOnClickListener(this.O);
                        this.A = var39_14 = (ViewGroup)this.findViewById(2131231299);
                        var39_14.setOnClickListener(this.O);
                        this.B = var40_15 = (ViewGroup)this.findViewById(2131231300);
                        var40_15.setOnClickListener(this.O);
                        this.C = (ViewGroup)this.findViewById(2131231052);
                        this.D = (ViewGroup)this.findViewById(2131231053);
                        this.E = (ViewGroup)this.findViewById(2131231054);
                        var41_16 = var2_2.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
                        var42_17 = var2_2.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
                        if (var42_17 == null || var42_17.isEmpty()) {
                            var42_17 = new ArrayList();
                            var42_17.add((Object)new e.s.a.j.a(null, 1.0f, 1.0f));
                            var42_17.add((Object)new e.s.a.j.a(null, 3.0f, 4.0f));
                            var42_17.add((Object)new e.s.a.j.a(this.getString(2131755368).toUpperCase(), 0.0f, 0.0f));
                            var42_17.add((Object)new e.s.a.j.a(null, 3.0f, 2.0f));
                            var42_17.add((Object)new e.s.a.j.a(null, 16.0f, 9.0f));
                            var41_16 = 2;
                        }
                        var48_18 = (LinearLayout)this.findViewById(2131231052);
                        var49_19 = new LinearLayout.LayoutParams(0, -1);
                        var49_19.weight = 1.0f;
                        for (e.s.a.j.a var59_21 : var42_17) {
                            var60_22 = (FrameLayout)this.getLayoutInflater().inflate(2131427519, null);
                            var60_22.setLayoutParams((ViewGroup.LayoutParams)var49_19);
                            var61_23 = (AspectRatioTextView)var60_22.getChildAt(0);
                            var61_23.setActiveColor(this.o);
                            var61_23.setAspectRatio(var59_21);
                            var48_18.addView((View)var60_22);
                            this.F.add((Object)var60_22);
                        }
                        ((ViewGroup)this.F.get(var41_16)).setSelected(true);
                        var51_24 = this.F.iterator();
                        while (var51_24.hasNext()) {
                            ((ViewGroup)var51_24.next()).setOnClickListener((View.OnClickListener)new e.s.a.c(this));
                        }
                        this.G = (TextView)this.findViewById(2131231347);
                        ((HorizontalProgressWheelView)this.findViewById(2131231227)).setScrollingListener(new d(this));
                        ((HorizontalProgressWheelView)this.findViewById(2131231227)).setMiddleLineColor(this.o);
                        this.findViewById(2131231431).setOnClickListener((View.OnClickListener)new e(this));
                        this.findViewById(2131231432).setOnClickListener((View.OnClickListener)new f(this));
                        var52_25 = this.o;
                        var53_26 = this.G;
                        if (var53_26 != null) {
                            var53_26.setTextColor(var52_25);
                        }
                        this.H = (TextView)this.findViewById(2131231348);
                        ((HorizontalProgressWheelView)this.findViewById(2131231238)).setScrollingListener(new g(this));
                        ((HorizontalProgressWheelView)this.findViewById(2131231238)).setMiddleLineColor(this.o);
                        var54_27 = this.o;
                        var55_28 = this.H;
                        if (var55_28 != null) {
                            var55_28.setTextColor(var54_27);
                        }
                        var56_29 = (ImageView)this.findViewById(2131231018);
                        var57_30 = (ImageView)this.findViewById(2131231017);
                        var58_31 = (ImageView)this.findViewById(2131231016);
                        var56_29.setImageDrawable((Drawable)new e.s.a.l.d(var56_29.getDrawable(), this.o));
                        var57_30.setImageDrawable((Drawable)new e.s.a.l.d(var57_30.getDrawable(), this.o));
                        var58_31.setImageDrawable((Drawable)new e.s.a.l.d(var58_31.getDrawable(), this.o));
                    }
                    var11_32 = (Uri)var2_2.getParcelableExtra("com.yalantis.ucrop.InputUri");
                    var12_33 = (Uri)var2_2.getParcelableExtra("com.yalantis.ucrop.OutputUri");
                    var13_34 = var2_2.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
                    var14_35 = TextUtils.isEmpty((CharSequence)var13_34) == false ? Bitmap.CompressFormat.valueOf((String)var13_34) : null;
                    if (var14_35 == null) {
                        var14_35 = UCropActivity.k;
                    }
                    this.K = var14_35;
                    this.L = var2_2.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
                    var15_36 = var2_2.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
                    if (var15_36 != null && var15_36.length == 3) {
                        this.M = var15_36;
                    }
                    this.x.setMaxBitmapSize(var2_2.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
                    this.x.setMaxScaleMultiplier(var2_2.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
                    this.x.setImageToWrapCropBoundsAnimDuration(var2_2.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
                    this.y.setFreestyleCropEnabled(var2_2.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
                    this.y.setDimmedColor(var2_2.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", this.getResources().getColor(2131034779)));
                    this.y.setCircleDimmedLayer(var2_2.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
                    this.y.setShowCropFrame(var2_2.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
                    this.y.setCropFrameColor(var2_2.getIntExtra("com.yalantis.ucrop.CropFrameColor", this.getResources().getColor(2131034777)));
                    this.y.setCropFrameStrokeWidth(var2_2.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", this.getResources().getDimensionPixelSize(2131100298)));
                    this.y.setShowCropGrid(var2_2.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
                    this.y.setCropGridRowCount(var2_2.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
                    this.y.setCropGridColumnCount(var2_2.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
                    this.y.setCropGridColor(var2_2.getIntExtra("com.yalantis.ucrop.CropGridColor", this.getResources().getColor(2131034778)));
                    this.y.setCropGridStrokeWidth(var2_2.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", this.getResources().getDimensionPixelSize(2131100299)));
                    var16_37 = var2_2.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
                    var17_38 = var2_2.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
                    var18_39 = var2_2.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
                    var19_40 = var2_2.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
                    if (!(var16_37 > 0.0f) || !(var17_38 > 0.0f)) break block24;
                    var33_41 = this.z;
                    if (var33_41 != null) {
                        var33_41.setVisibility(8);
                    }
                    var20_42 = this.x;
                    ** GOTO lbl149
                }
                if (var19_40 != null && var18_39 < var19_40.size()) {
                    var20_42 = this.x;
                    var16_37 = ((e.s.a.j.a)var19_40.get((int)var18_39)).l;
                    var17_38 = ((e.s.a.j.a)var19_40.get((int)var18_39)).m;
lbl149: // 2 sources:
                    var21_43 = var16_37 / var17_38;
                } else {
                    var20_42 = this.x;
                    var21_43 = 0.0f;
                }
                var20_42.setTargetAspectRatio(var21_43);
                var22_44 = var2_2.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
                var23_45 = var2_2.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
                if (var22_44 > 0 && var23_45 > 0) {
                    this.x.setMaxResultImageSizeX(var22_44);
                    this.x.setMaxResultImageSizeY(var23_45);
                }
                if (var11_32 != null && var12_33 != null) {
                    try {
                        var27_46 = this.x;
                        var28_47 = var27_46.getMaxBitmapSize();
                        var29_48 = var27_46.getContext();
                        var30_49 = new e.s.a.m.b(var27_46);
                        var31_50 = new e.s.a.k.b(var29_48, var11_32, var12_33, var28_47, var28_47, (e.s.a.i.b)var30_49);
                        var31_50.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
                        break block22;
                    }
                    catch (Exception var24_51) {
                        break block23;
                    }
                }
                var24_52 = new NullPointerException(this.getString(2131755366));
            }
            this.j((Throwable)var24_52);
            this.finish();
        }
        if (this.u) {
            var26_53 = this.z.getVisibility() == 0 ? 2131231298 : 2131231300;
            this.k(var26_53);
        } else {
            this.i(0);
        }
        if (this.I == null) {
            this.I = new View((Context)this);
            var25_54 = new RelativeLayout.LayoutParams(-1, -1);
            var25_54.addRule(3, 2131231363);
            this.I.setLayoutParams((ViewGroup.LayoutParams)var25_54);
            this.I.setClickable(true);
        }
        ((RelativeLayout)this.findViewById(2131231387)).addView(this.I);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131492866, menu);
        MenuItem menuItem = menu.findItem(2131231113);
        Drawable drawable = menuItem.getIcon();
        if (drawable != null) {
            try {
                drawable.mutate();
                drawable.setColorFilter(this.p, PorterDuff.Mode.SRC_ATOP);
                menuItem.setIcon(drawable);
            }
            catch (IllegalStateException illegalStateException) {
                Object[] arrobject = new Object[]{illegalStateException.getMessage(), this.getString(2131755370)};
                Log.i((String)"UCropActivity", (String)String.format((String)"%s - %s", (Object[])arrobject));
            }
            ((Animatable)menuItem.getIcon()).start();
        }
        MenuItem menuItem2 = menu.findItem(2131231112);
        Drawable drawable2 = ContextCompat.getDrawable((Context)this, (int)this.s);
        if (drawable2 != null) {
            drawable2.mutate();
            drawable2.setColorFilter(this.p, PorterDuff.Mode.SRC_ATOP);
            menuItem2.setIcon(drawable2);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131231112) {
            this.I.setClickable(true);
            this.v = true;
            this.supportInvalidateOptionsMenu();
            GestureCropImageView gestureCropImageView = this.x;
            Bitmap.CompressFormat compressFormat = this.K;
            int n2 = this.L;
            h h2 = new h(this);
            gestureCropImageView.i();
            gestureCropImageView.setImageToWrapCropBounds(false);
            e.s.a.j.d d2 = new e.s.a.j.d(gestureCropImageView.z, e.s.a.a.s4((float[])gestureCropImageView.k), gestureCropImageView.getCurrentScale(), gestureCropImageView.getCurrentAngle());
            e.s.a.j.b b2 = new e.s.a.j.b(gestureCropImageView.I, gestureCropImageView.J, compressFormat, n2, gestureCropImageView.getImageInputPath(), gestureCropImageView.getImageOutputPath(), gestureCropImageView.getExifInfo());
            e.s.a.k.a a2 = new e.s.a.k.a(gestureCropImageView.getContext(), gestureCropImageView.getViewBitmap(), d2, b2, (e.s.a.i.a)h2);
            a2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.onBackPressed();
            return true;
        }
        return Activity.super.onOptionsItemSelected(menuItem);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(2131231112).setVisible(true ^ this.v);
        menu.findItem(2131231113).setVisible(this.v);
        return Activity.super.onPrepareOptionsMenu(menu);
    }

    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.x;
        if (gestureCropImageView != null) {
            gestureCropImageView.i();
        }
    }
}

