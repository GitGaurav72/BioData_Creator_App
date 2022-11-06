/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.ImageView
 *  androidx.annotation.Nullable
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.core.content.res.ResourcesCompat
 *  androidx.fragment.app.FragmentActivity
 *  cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$a
 *  cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$b
 *  cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$c
 *  java.lang.Class
 *  java.lang.Integer
 */
package cat.ereza.customactivityoncrash.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import d.a.a.d;

public final class DefaultErrorActivity
extends AppCompatActivity {
    public static final /* synthetic */ int k;

    @SuppressLint(value={"PrivateResource"})
    public void onCreate(@Nullable Bundle bundle) {
        b b2;
        FragmentActivity.super.onCreate(bundle);
        TypedArray typedArray = this.obtainStyledAttributes(d.a);
        if (!typedArray.hasValue(117)) {
            this.setTheme(2131821059);
        }
        typedArray.recycle();
        this.setContentView(2131427379);
        Button button = (Button)this.findViewById(2131230895);
        d.a.a.e.a a2 = d.a.a.c.c(this.getIntent());
        if (a2.n && a2.t != null) {
            button.setText(2131755099);
            b2 = new a(this, a2);
        } else {
            b2 = new b(this, a2);
        }
        button.setOnClickListener((View.OnClickListener)b2);
        Button button2 = (Button)this.findViewById(2131230894);
        if (a2.m) {
            button2.setOnClickListener((View.OnClickListener)new c(this));
        } else {
            button2.setVisibility(8);
        }
        Integer n = a2.r;
        ImageView imageView = (ImageView)this.findViewById(2131230893);
        if (n != null) {
            imageView.setImageDrawable(ResourcesCompat.getDrawable((Resources)this.getResources(), (int)n, (Resources.Theme)this.getTheme()));
        }
    }
}

