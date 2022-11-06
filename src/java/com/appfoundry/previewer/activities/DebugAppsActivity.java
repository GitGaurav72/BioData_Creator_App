/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  androidx.recyclerview.widget.RecyclerView
 *  e.f.a.a0
 *  e.g.a.d.a1
 *  e.g.a.d.j0
 *  e.g.a.d.k0
 *  e.g.a.d.n0
 *  e.g.a.g.a
 *  e.g.a.i.q0
 *  e.g.a.j.t0
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  k.d0.g
 *  kotlin.Metadata
 *  o.b.a.c
 */
package com.appfoundry.previewer.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import e.f.a.a0;
import e.g.a.d.a1;
import e.g.a.d.j0;
import e.g.a.d.k0;
import e.g.a.d.n0;
import e.g.a.g.a;
import e.g.a.i.q0;
import e.g.a.j.t0;
import java.util.List;
import k.d0.g;
import k.x.c.i;
import kotlin.Metadata;
import o.b.a.c;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2={"Lcom/appfoundry/previewer/activities/DebugAppsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "buttonWidth", "", "getButtonWidth", "()I", "setButtonWidth", "(I)V", "filter", "Landroid/widget/EditText;", "getFilter", "()Landroid/widget/EditText;", "setFilter", "(Landroid/widget/EditText;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFilter", "setupInputJson", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class DebugAppsActivity
extends AppCompatActivity {
    public static final /* synthetic */ int k;
    public RecyclerView l;
    public EditText m;
    public int n;

    public static void i(TextView textView, DebugAppsActivity debugAppsActivity, View view) {
        String string;
        block8 : {
            String string2;
            block7 : {
                block6 : {
                    i.e((Object)debugAppsActivity, "this$0");
                    string = textView.getText().toString();
                    i.e(string, "<this>");
                    if (!g.c((CharSequence)string, (CharSequence)"/devices/apps/", (boolean)false, (int)2)) {
                        i.e(string, "<this>");
                        boolean bl = string.length() == 26;
                        if (!bl && !t0.h((String)string)) {
                            Toast.makeText((Context)debugAppsActivity, (CharSequence)"Invalid json", (int)0).show();
                            return;
                        }
                    }
                    i.e(string, "<this>");
                    int n2 = string.length();
                    boolean bl = false;
                    if (n2 == 26) {
                        bl = true;
                    }
                    if (!bl) break block6;
                    string2 = "https://apps-service.bravostudio.app/devices/apps/";
                    break block7;
                }
                if (!t0.h((String)string)) break block8;
                string = string.substring(3);
                i.d(string, "this as java.lang.String).substring(startIndex)");
                string2 = "https://apps-service-dev.bravostudio.app/devices/apps/";
            }
            string = i.k(string2, string);
        }
        c.b().g((Object)new q0(string));
        Activity.super.finish();
        a0.z0((AppCompatActivity)debugAppsActivity);
    }

    public void finish() {
        Activity.super.finish();
        a0.z0((AppCompatActivity)this);
    }

    public void onCreate(Bundle bundle) {
        FragmentActivity.super.onCreate(bundle);
        a0.Y0((AppCompatActivity)this);
        a0.n0((AppCompatActivity)this);
        this.setContentView(2131427357);
        a0.y0((AppCompatActivity)this);
        View view = this.findViewById(2131230957);
        i.d((Object)view, "findViewById(R.id.filter_debug_app_edittext)");
        EditText editText = (EditText)view;
        i.e((Object)editText, "<set-?>");
        this.m = editText;
        TextView textView = (TextView)this.findViewById(2131230902);
        ImageButton imageButton = (ImageButton)this.findViewById(2131230903);
        ImageButton imageButton2 = (ImageButton)this.findViewById(2131230831);
        ImageButton imageButton3 = (ImageButton)this.findViewById(2131230830);
        n0 n02 = new n0(this, imageButton, imageButton2, imageButton3, textView);
        imageButton.setOnClickListener((View.OnClickListener)n02);
        j0 j02 = new j0(textView, imageButton, this, imageButton2, imageButton3);
        imageButton3.setOnClickListener((View.OnClickListener)j02);
        imageButton2.setOnClickListener((View.OnClickListener)new k0(textView, this));
        EditText editText2 = this.m;
        if (editText2 != null) {
            editText2.addTextChangedListener((TextWatcher)new a1(this));
            View view2 = this.findViewById(2131231213);
            i.d((Object)view2, "findViewById(R.id.recyclerView)");
            RecyclerView recyclerView = (RecyclerView)view2;
            i.e((Object)recyclerView, "<set-?>");
            this.l = recyclerView;
            a0.a1((RecyclerView)recyclerView, (AppCompatActivity)this, (List)a.b);
            return;
        }
        i.m("filter");
        throw null;
    }
}

