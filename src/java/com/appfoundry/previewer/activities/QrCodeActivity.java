/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  com.appfoundry.previewer.model.Component
 *  com.appfoundry.previewer.model.Container
 *  com.appfoundry.previewer.model.Page
 *  e.f.a.a0
 *  e.g.a.i.f
 *  e.g.a.j.n0
 *  e.g.a.j.r0
 *  e.g.a.k.f
 *  e.g.a.p.g
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  kotlin.Metadata
 *  o.b.a.m
 *  org.greenrobot.eventbus.ThreadMode
 */
package com.appfoundry.previewer.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import e.f.a.a0;
import e.g.a.j.n0;
import e.g.a.j.r0;
import e.g.a.k.f;
import e.g.a.p.g;
import java.util.List;
import k.x.c.i;
import kotlin.Metadata;
import o.b.a.m;
import org.greenrobot.eventbus.ThreadMode;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0014\u00a8\u0006\f"}, d2={"Lcom/appfoundry/previewer/activities/QrCodeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPageCloseEvent", "event", "Lcom/appfoundry/previewer/events/CloseEvent;", "onStart", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class QrCodeActivity
extends AppCompatActivity {
    public void onBackPressed() {
        this.finish();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onCreate(Bundle bundle) {
        FragmentActivity.super.onCreate(bundle);
        this.setContentView(2131427362);
        a0.Y0((AppCompatActivity)this);
        a0.n0((AppCompatActivity)this);
        Page page = g.k((String)"page-qr");
        if (page != null) {
            Container container;
            Container container2;
            List list = page.g;
            Component component = list == null || (container2 = (Container)list.get(0)) == null ? null : n0.j((Container)container2, (String)"scanned-qr");
            if (component != null) {
                Bundle bundle2 = this.getIntent().getExtras();
                String string = bundle2 == null ? null : bundle2.getString("qrCodeUrl");
                component.g = string;
            }
            if (component != null) {
                component.b = "componennt:qr";
            }
            List list2 = page.g;
            Component component2 = list2 == null || (container = (Container)list2.get(0)) == null ? null : n0.j((Container)container, (String)"scanned-title");
            if (component2 != null) {
                String string;
                Bundle bundle3 = this.getIntent().getExtras();
                String string2 = "";
                if (bundle3 != null && (string = bundle3.getString("appName")) != null) {
                    string2 = string;
                }
                n0.C((Component)component2, (String)string2);
            }
            a0.L0((AppCompatActivity)this, (f)r0.a((Page)page, null, (int)1), (int)2131230871);
        }
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onPageCloseEvent(e.g.a.i.f f2) {
        i.e((Object)f2, "event");
        this.finish();
    }

    public void onStart() {
        super.onStart();
        a0.J0((AppCompatActivity)this);
    }
}

