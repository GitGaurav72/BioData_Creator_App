/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.widget.FrameLayout
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  androidx.recyclerview.widget.RecyclerView
 *  com.appfoundry.previewer.model.Animation
 *  com.appfoundry.previewer.model.Container
 *  com.appfoundry.previewer.model.Page
 *  e.f.a.a0
 *  e.g.a.d.t0
 *  e.g.a.i.a0
 *  e.g.a.i.c0
 *  e.g.a.i.g
 *  e.g.a.i.n0
 *  e.g.a.i.v
 *  e.g.a.j.r0
 *  e.g.a.j.v0
 *  e.g.a.k.f
 *  e.g.a.o.s
 *  e.g.a.p.f
 *  e.g.a.p.g
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  kotlin.Metadata
 *  o.b.a.m
 *  org.greenrobot.eventbus.ThreadMode
 */
package com.appfoundry.previewer.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.appfoundry.previewer.model.Animation;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import e.g.a.d.t0;
import e.g.a.i.a0;
import e.g.a.i.c0;
import e.g.a.i.g;
import e.g.a.i.n0;
import e.g.a.i.v;
import e.g.a.j.r0;
import e.g.a.j.v0;
import e.g.a.k.f;
import e.g.a.o.s;
import java.util.List;
import k.x.c.i;
import kotlin.Metadata;
import o.b.a.m;
import org.greenrobot.eventbus.ThreadMode;

@Metadata(d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\rH\u0014J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\rH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2={"Lcom/appfoundry/previewer/activities/ModalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appUrl", "", "isInterstitial", "", "isModalMenu", "isPreviewer", "page", "Lcom/appfoundry/previewer/model/Page;", "pageId", "finish", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeepLinkPreviewAppEvent", "event", "Lcom/appfoundry/previewer/events/DeepLinkPreviewAppEvent;", "onDestroy", "onIntroCloseEvent", "Lcom/appfoundry/previewer/events/IntroCloseEvent;", "onNavigationEvent", "Lcom/appfoundry/previewer/events/NavigationEvent;", "onOpenAppSettingsEvent", "Lcom/appfoundry/previewer/events/OpenAppSettingsEvent;", "onPushDialogEvent", "Lcom/appfoundry/previewer/events/PushDialogEvent;", "onStart", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class ModalActivity
extends AppCompatActivity {
    public static final /* synthetic */ int k;
    public String l;
    public Page m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;

    public void finish() {
        Activity.super.finish();
        if (this.o) {
            s.b = false;
        }
        e.f.a.a0.z0((AppCompatActivity)this);
    }

    public void onBackPressed() {
        this.finish();
    }

    public void onCreate(Bundle bundle) {
        String string;
        Page page;
        RecyclerView recyclerView;
        FragmentActivity.super.onCreate(bundle);
        e.f.a.a0.Y0((AppCompatActivity)this);
        e.f.a.a0.n0((AppCompatActivity)this);
        this.setContentView(2131427359);
        e.f.a.a0.y0((AppCompatActivity)this);
        this.o = this.getIntent().getBooleanExtra("is_menu", false);
        this.n = this.getIntent().getBooleanExtra("is_previewer", false);
        this.p = this.getIntent().getBooleanExtra("is_interstitial", false);
        Intent intent = this.getIntent();
        if (intent == null || (string = intent.getStringExtra("page_id")) == null) {
            string = "";
        }
        this.l = string;
        if (this.o) {
            page = e.g.a.p.f.p();
        } else if (this.n) {
            page = e.g.a.p.g.j((String)string);
            if (page == null) {
                page = null;
            } else {
                page.K = true;
            }
        } else {
            page = e.g.a.p.g.h((String)string);
        }
        this.m = page;
        FrameLayout frameLayout = (FrameLayout)this.findViewById(2131230789);
        if (frameLayout != null) {
            Page page2 = this.m;
            String string2 = page2 == null ? null : page2.a;
            Container container = page2 == null ? null : page2.j;
            v0.d((View)frameLayout, (String)string2, (Container)container, null, (int)4);
        }
        if ((recyclerView = (RecyclerView)this.findViewById(2131231213)) != null) {
            Page page3 = this.m;
            String string3 = page3 == null ? null : page3.a;
            List list = page3 == null ? null : page3.g;
            Animation animation = page3 == null ? null : page3.v;
            Boolean bl = page3 == null ? null : Boolean.valueOf((boolean)page3.K);
            e.f.a.a0.b1((RecyclerView)recyclerView, (FragmentActivity)this, (String)string3, (List)list, (Animation)animation, (Boolean)bl, (boolean)false, (boolean)false, null, (boolean)false, (boolean)false, (boolean)false, (int)2016);
        }
        if (this.o) {
            s.b = true;
        }
        if (this.n) {
            s.j = true;
        }
        if (this.p) {
            this.q = this.getIntent().getStringExtra("new_app_url");
        }
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onDeepLinkPreviewAppEvent(g g2) {
        i.e((Object)g2, "event");
        s.j = false;
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new t0(this), 350L);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.n) {
            s.j = false;
        }
        e.f.a.a0.o1((AppCompatActivity)this);
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onIntroCloseEvent(v v2) {
        i.e((Object)v2, "event");
        this.finish();
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onNavigationEvent(a0 a02) {
        i.e((Object)a02, "event");
        if (this.n) {
            Page page = e.g.a.p.g.j((String)a02.a);
            f f2 = page == null ? null : r0.a((Page)page, null, (int)1);
            e.f.a.a0.L0((AppCompatActivity)this, (f)f2, (int)2131230871);
            return;
        }
        this.finish();
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onOpenAppSettingsEvent(c0 c02) {
        i.e((Object)c02, "event");
        i.e((Object)this, "<this>");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.fromParts((String)"package", (String)this.getPackageName(), null));
        this.startActivity(intent);
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onPushDialogEvent(n0 n02) {
        i.e((Object)n02, "event");
        e.g.a.p.f.z((AppCompatActivity)this);
    }

    public void onStart() {
        super.onStart();
        e.f.a.a0.J0((AppCompatActivity)this);
    }
}

