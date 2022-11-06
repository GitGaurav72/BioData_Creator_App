/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  com.appfoundry.previewer.model.Container
 *  com.appfoundry.previewer.model.Page
 *  com.segment.analytics.Options
 *  com.segment.analytics.Properties
 *  e.e.a.a.a
 *  e.f.a.a0
 *  e.g.a.e.a
 *  e.g.a.i.f
 *  e.g.a.i.v0
 *  e.g.a.j.r0
 *  e.g.a.k.f
 *  e.g.a.p.g
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  kotlin.Metadata
 *  o.b.a.m
 *  org.greenrobot.eventbus.ThreadMode
 */
package com.appfoundry.previewer.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.appfoundry.previewer.activities.QrCodeActivity;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.segment.analytics.Options;
import com.segment.analytics.Properties;
import e.f.a.a0;
import e.g.a.e.a;
import e.g.a.i.v0;
import e.g.a.j.r0;
import e.g.a.k.f;
import e.g.a.p.g;
import java.util.ArrayList;
import java.util.List;
import k.x.c.i;
import kotlin.Metadata;
import o.b.a.m;
import org.greenrobot.eventbus.ThreadMode;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0014\u00a8\u0006\u0011"}, d2={"Lcom/appfoundry/previewer/activities/ScannedAppsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "cloneContainers", "", "scannedAppsPage", "Lcom/appfoundry/previewer/model/Page;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPageCloseEvent", "event", "Lcom/appfoundry/previewer/events/CloseEvent;", "onShowQrEvent", "Lcom/appfoundry/previewer/events/ShowQrEvent;", "onStart", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class ScannedAppsActivity
extends AppCompatActivity {
    public void onBackPressed() {
        this.finish();
    }

    public void onCreate(Bundle bundle) {
        FragmentActivity.super.onCreate(bundle);
        this.setContentView(2131427362);
        a0.Y0((AppCompatActivity)this);
        a0.n0((AppCompatActivity)this);
        Page page = g.k((String)"page-scanned-apps");
        if (page != null) {
            int n2 = 1;
            a0.L0((AppCompatActivity)this, (f)r0.a((Page)page, null, (int)n2), (int)2131230871);
            List list = page.g;
            if (list == null || (n2 ^ list.isEmpty()) != n2) {
                n2 = 0;
            }
            Container container = null;
            if (n2 != 0) {
                List list2 = page.g;
                container = list2 == null ? null : (Container)list2.get(0);
            }
            if (container != null) {
                page.g = new ArrayList();
            }
        }
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onPageCloseEvent(e.g.a.i.f f2) {
        i.e((Object)f2, "event");
        this.finish();
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onShowQrEvent(v0 v02) {
        i.e((Object)v02, "event");
        a a2 = a.a;
        String string = v02.a;
        String string2 = v02.b;
        Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (a)a2, (String)a2.d(), (String)"app_url", (String)string).putValue("app_name", (Object)string2);
        a2.f(false, "Show QR", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026tValue(APP_NAME, appName)", (String)"Slack", (boolean)false));
        Bundle bundle = new Bundle();
        bundle.putString("qrCodeUrl", v02.a);
        bundle.putString("appName", v02.b);
        Intent intent = new Intent((Context)this, QrCodeActivity.class);
        intent.putExtras(bundle);
        this.startActivity(intent);
    }

    public void onStart() {
        super.onStart();
        a0.J0((AppCompatActivity)this);
    }
}

