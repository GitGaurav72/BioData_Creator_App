/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  com.airbnb.lottie.LottieAnimationView
 *  com.appfoundry.previewer.BravoApp
 *  com.appfoundry.previewer.activities.InitActivity$a
 *  e.f.a.a0
 *  e.g.a.d.p0
 *  e.g.a.d.q0
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  k.x.b.p
 *  kotlin.Metadata
 *  p.a.a
 *  p.a.a$b
 */
package com.appfoundry.previewer.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.InitActivity;
import e.f.a.a0;
import e.g.a.d.p0;
import e.g.a.d.q0;
import k.u.d;
import k.u.f;
import k.x.b.p;
import kotlin.Metadata;
import l.a.b0;
import l.a.b2.l;
import l.a.j1;
import l.a.r;
import p.a.a;

@Metadata(d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2={"Lcom/appfoundry/previewer/activities/InitActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "fromUnlink", "", "lottieLoading", "Lcom/airbnb/lottie/LottieAnimationView;", "newAppUrl", "", "scanNewAppProcess", "splashImage", "Landroid/widget/ImageView;", "version", "Landroid/widget/TextView;", "checkIfUiTest", "", "downloadFonts", "parsedJson", "Lcom/appfoundry/previewer/model/JsonApp;", "(Lcom/appfoundry/previewer/model/JsonApp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hideSplashAndStart", "logResult", "font", "Lcom/appfoundry/previewer/model/Asset;", "downloaded", "(Lcom/appfoundry/previewer/model/Asset;Ljava/lang/Boolean;)V", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBravoLoadingAndStart", "start", "trackQRLoaded", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class InitActivity
extends AppCompatActivity {
    public static final /* synthetic */ int k;
    public boolean l;
    public boolean m;
    public String n;
    public TextView o;
    public ImageView p;
    public LottieAnimationView q;

    public final void i() {
        r r2 = e.s.a.a.h(null, (int)1, null);
        e.s.a.a.H2((b0)e.s.a.a.g((f)l.c.plus((f)((Object)r2))), null, null, (p)new a(this, null), (int)3, null);
    }

    public void onBackPressed() {
        this.finish();
    }

    public void onCreate(Bundle bundle) {
        TextView textView;
        FragmentActivity.super.onCreate(bundle);
        this.overridePendingTransition(2130772021, 2130772022);
        a0.Y0((AppCompatActivity)this);
        a0.n0((AppCompatActivity)this);
        Object[] arrobject = new Object[]{Float.valueOf((float)this.getResources().getDisplayMetrics().density)};
        a.b b2 = p.a.a.d;
        b2.a("SCREEN DENSITY = %s", arrobject);
        this.setContentView(2131427358);
        FrameLayout frameLayout = (FrameLayout)this.findViewById(2131231283);
        if (frameLayout != null) {
            frameLayout.post((Runnable)new p0(frameLayout));
        }
        this.o = textView = (TextView)this.findViewById(2131231394);
        if (textView != null) {
            textView.setText((CharSequence)"3.0.336");
        }
        this.p = (ImageView)this.findViewById(2131231282);
        this.q = (LottieAnimationView)this.findViewById(2131231068);
        this.l = this.getIntent().getBooleanExtra("scan_new_app", false);
        if (BravoApp.G == null) {
            BravoApp.G = this.getIntent().getBooleanExtra("IS_APPIUM_UI_TEST", false);
            BravoApp.H = this.getIntent().getBooleanExtra("IS_APPIUM_UI_TEST_WITH_SKIP_INTRO", false);
        }
        Object[] arrobject2 = new Object[]{BravoApp.G};
        b2.a("COMES FROM APPIUM = %b", arrobject2);
        Object[] arrobject3 = new Object[]{BravoApp.H};
        b2.a("COMES FROM APPIUM, SKIP INTRO = %b", arrobject3);
        Object[] arrobject4 = new Object[]{String.valueOf((boolean)this.l)};
        b2.a("scanNewAppProcess = %s", arrobject4);
        this.n = this.getIntent().getStringExtra("new_app_url");
        this.m = this.getIntent().getBooleanExtra("unlink", false);
        boolean bl = this.getIntent().getBooleanExtra("new_json", false);
        if (this.l) {
            LottieAnimationView lottieAnimationView = this.q;
            if (lottieAnimationView != null) {
                lottieAnimationView.setAlpha(1.0f);
            }
            LottieAnimationView lottieAnimationView2 = this.q;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.playAnimation();
            }
            ImageView imageView = this.p;
            if (imageView != null) {
                imageView.setAlpha(0.0f);
            }
            TextView textView2 = this.o;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
            }
            this.i();
            return;
        }
        if (!bl && !this.m) {
            new Handler(Looper.getMainLooper()).postDelayed((Runnable)new q0(this), 800L);
            return;
        }
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        }
        TextView textView3 = this.o;
        if (textView3 != null) {
            textView3.setAlpha(0.0f);
        }
        this.i();
    }
}

