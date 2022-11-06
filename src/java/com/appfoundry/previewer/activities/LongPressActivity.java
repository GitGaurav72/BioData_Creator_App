/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.widget.FrameLayout
 *  androidx.activity.ComponentActivity
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 *  com.appfoundry.previewer.model.Animation
 *  com.appfoundry.previewer.model.Container
 *  com.appfoundry.previewer.model.Page
 *  e.f.a.a0
 *  e.g.a.d.r0
 *  e.g.a.d.s0
 *  e.g.a.i.c1
 *  e.g.a.i.d1
 *  e.g.a.i.e0
 *  e.g.a.i.n0
 *  e.g.a.i.y
 *  e.g.a.j.v0
 *  e.g.a.o.s
 *  e.g.a.p.f
 *  e.g.a.p.g
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  kotlin.Metadata
 *  o.b.a.c
 *  o.b.a.m
 *  org.greenrobot.eventbus.ThreadMode
 */
package com.appfoundry.previewer.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appfoundry.previewer.model.Animation;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import e.f.a.a0;
import e.g.a.d.r0;
import e.g.a.d.s0;
import e.g.a.i.c1;
import e.g.a.i.d1;
import e.g.a.i.e0;
import e.g.a.i.n0;
import e.g.a.i.y;
import e.g.a.j.v0;
import e.g.a.o.s;
import e.g.a.p.f;
import e.g.a.p.g;
import java.util.List;
import k.x.c.i;
import kotlin.Metadata;
import o.b.a.c;
import o.b.a.m;
import org.greenrobot.eventbus.ThreadMode;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0014H\u0007\u00a8\u0006\u0015"}, d2={"Lcom/appfoundry/previewer/activities/LongPressActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "clearFlagAndFinish", "", "finish", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLongPressPageUnlinkEvent", "event", "Lcom/appfoundry/previewer/events/LongPressPageUnlinkEvent;", "onOpenIntroEvent", "Lcom/appfoundry/previewer/events/OpenIntroEvent;", "onPushDialogEvent", "Lcom/appfoundry/previewer/events/PushDialogEvent;", "onStart", "onUpdateEvent", "Lcom/appfoundry/previewer/events/UpdateEvent;", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class LongPressActivity
extends AppCompatActivity {
    public static void j(LongPressActivity longPressActivity) {
        i.e((Object)longPressActivity, "this$0");
        Activity.super.finish();
        a0.z0((AppCompatActivity)longPressActivity);
    }

    public static void k(LongPressActivity longPressActivity) {
        i.e((Object)longPressActivity, "this$0");
        c.b().g((Object)new c1());
        Activity.super.finish();
        a0.z0((AppCompatActivity)longPressActivity);
    }

    public void finish() {
        Activity.super.finish();
        a0.z0((AppCompatActivity)this);
    }

    public final void i() {
        s.i = false;
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new r0(this), 350L);
    }

    public void onBackPressed() {
        s.i = false;
        ComponentActivity.super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        FragmentActivity.super.onCreate(bundle);
        a0.Y0((AppCompatActivity)this);
        a0.n0((AppCompatActivity)this);
        this.setContentView(2131427399);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)this.findViewById(2131231310);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        a0.y0((AppCompatActivity)this);
        s.i = true;
        Page page = g.k((String)"page-unlink");
        FrameLayout frameLayout = (FrameLayout)this.findViewById(2131230790);
        if (frameLayout != null) {
            v0.m((View)frameLayout);
            String string = page == null ? null : page.a;
            Container container = page == null ? null : page.e;
            v0.f((View)frameLayout, (String)string, (Container)container, (Boolean)Boolean.FALSE);
            String string2 = page == null ? null : page.a;
            Container container2 = page == null ? null : page.j;
            v0.d((View)frameLayout, (String)string2, (Container)container2, null, (int)4);
        }
        RecyclerView recyclerView = (RecyclerView)this.findViewById(2131231213);
        if (recyclerView == null) {
            return;
        }
        String string = page == null ? null : page.a;
        List list = page == null ? null : page.g;
        Animation animation = page == null ? null : page.v;
        a0.b1((RecyclerView)recyclerView, (FragmentActivity)this, (String)string, (List)list, (Animation)animation, null, (boolean)false, (boolean)false, null, (boolean)false, (boolean)false, (boolean)false, (int)2032);
    }

    public void onDestroy() {
        super.onDestroy();
        a0.o1((AppCompatActivity)this);
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onLongPressPageUnlinkEvent(y y2) {
        i.e((Object)y2, "event");
        s.i = false;
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new s0(this), 350L);
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onOpenIntroEvent(e0 e02) {
        i.e((Object)e02, "event");
        this.i();
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onPushDialogEvent(n0 n02) {
        i.e((Object)n02, "event");
        f.z((AppCompatActivity)this);
    }

    public void onStart() {
        super.onStart();
        a0.J0((AppCompatActivity)this);
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onUpdateEvent(d1 d12) {
        i.e((Object)d12, "event");
        this.i();
    }
}

