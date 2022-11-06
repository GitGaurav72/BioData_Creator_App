/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  e.g.a.d.f0
 *  e.g.a.d.h0
 *  e.g.a.o.k
 *  e.g.a.p.g
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  p.a.a
 *  p.a.a$b
 */
package com.appfoundry.previewer.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import d.a.a.c;
import e.g.a.d.f0;
import e.g.a.d.h0;
import e.g.a.o.k;
import e.g.a.p.g;
import kotlin.Metadata;
import p.a.a;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, d2={"Lcom/appfoundry/previewer/activities/CrashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "copyErrorToClipboard", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class CrashActivity
extends AppCompatActivity {
    public static final /* synthetic */ int k;

    public void onCreate(Bundle bundle) {
        FragmentActivity.super.onCreate(bundle);
        this.setContentView(2131427356);
        Object[] arrobject = new Object[]{c.b((Context)this, this.getIntent()), g.c()};
        a.d.b("AppCrash: %s, with app id: %s", arrobject);
        c.c(this.getIntent());
        Typeface typeface = k.c((k)k.a, (String)"01E25XRF6ZJM19R4ZQCJPPT1XF", (int)0, null, (int)6);
        TextView textView = (TextView)this.findViewById(2131231219);
        if (textView != null) {
            textView.setTypeface(typeface);
            textView.setTypeface(typeface);
            textView.setOnClickListener((View.OnClickListener)new h0(this));
        }
        TextView textView2 = (TextView)this.findViewById(2131231128);
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
        textView2.setTypeface(typeface);
        textView2.setOnClickListener((View.OnClickListener)new f0(this, textView2));
    }
}

