/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  androidx.activity.ComponentActivity
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  com.journeyapps.barcodescanner.CaptureManager
 *  com.journeyapps.barcodescanner.DecoratedBarcodeView
 *  e.f.a.a0
 *  e.g.a.i.f
 *  e.g.a.o.u
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  o.b.a.m
 *  org.greenrobot.eventbus.ThreadMode
 *  p.a.a
 *  p.a.a$b
 */
package com.appfoundry.previewer.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.journeyapps.barcodescanner.CaptureManager;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import e.f.a.a0;
import e.g.a.i.f;
import e.g.a.o.u;
import k.x.c.i;
import kotlin.Metadata;
import o.b.a.m;
import org.greenrobot.eventbus.ThreadMode;
import p.a.a;

@Metadata(d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\bH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\bH\u0014J+\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\bH\u0014J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000bH\u0014J\b\u0010!\u001a\u00020\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2={"Lcom/appfoundry/previewer/activities/QrScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "capture", "Lcom/journeyapps/barcodescanner/CaptureManager;", "zxingBarcodeScanner", "Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onPageCloseEvent", "Lcom/appfoundry/previewer/events/CloseEvent;", "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "onStart", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class QrScannerActivity
extends AppCompatActivity {
    public CaptureManager k;
    public DecoratedBarcodeView l;

    public void onBackPressed() {
        this.finish();
    }

    public void onCreate(Bundle bundle) {
        DecoratedBarcodeView decoratedBarcodeView;
        FragmentActivity.super.onCreate(bundle);
        this.setContentView(2131427361);
        a0.Y0((AppCompatActivity)this);
        a0.n0((AppCompatActivity)this);
        View view = this.findViewById(2131231440);
        i.d((Object)view, "findViewById(R.id.zxing_barcode_scanner)");
        this.l = decoratedBarcodeView = (DecoratedBarcodeView)view;
        if (decoratedBarcodeView != null) {
            CaptureManager captureManager;
            this.k = captureManager = new CaptureManager((Activity)this, decoratedBarcodeView);
            if (captureManager != null) {
                captureManager.initializeFromIntent(this.getIntent(), bundle);
                CaptureManager captureManager2 = this.k;
                if (captureManager2 != null) {
                    captureManager2.decode();
                    return;
                }
                i.m("capture");
                throw null;
            }
            i.m("capture");
            throw null;
        }
        i.m("zxingBarcodeScanner");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        CaptureManager captureManager = this.k;
        if (captureManager != null) {
            captureManager.onDestroy();
            a0.o1((AppCompatActivity)this);
            return;
        }
        i.m("capture");
        throw null;
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        i.e((Object)keyEvent, "event");
        DecoratedBarcodeView decoratedBarcodeView = this.l;
        if (decoratedBarcodeView != null) {
            return decoratedBarcodeView.onKeyDown(n2, keyEvent) || super.onKeyDown(n2, keyEvent);
            {
            }
        }
        i.m("zxingBarcodeScanner");
        throw null;
    }

    @m(threadMode=ThreadMode.MAIN)
    public final void onPageCloseEvent(f f2) {
        i.e((Object)f2, "event");
        this.finish();
    }

    public void onPause() {
        FragmentActivity.super.onPause();
        CaptureManager captureManager = this.k;
        if (captureManager != null) {
            captureManager.onPause();
            return;
        }
        i.m("capture");
        throw null;
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        i.e(arrstring, "permissions");
        i.e(arrn, "grantResults");
        boolean bl = arrn.length == 0;
        if (bl ^ true && arrn[0] == 0) {
            Object[] arrobject = new Object[]{};
            a.d.a("ACCEPTED", arrobject);
            return;
        }
        if (!this.shouldShowRequestPermissionRationale(arrstring[0])) {
            u.a.g("user_disabled_ask_for_camera_permission");
        } else {
            Object[] arrobject = new Object[]{};
            a.d.a("JUST DENIED", arrobject);
        }
        this.finish();
    }

    public void onResume() {
        FragmentActivity.super.onResume();
        CaptureManager captureManager = this.k;
        if (captureManager != null) {
            captureManager.onResume();
            return;
        }
        i.m("capture");
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        i.e((Object)bundle, "outState");
        ComponentActivity.super.onSaveInstanceState(bundle);
        CaptureManager captureManager = this.k;
        if (captureManager != null) {
            captureManager.onSaveInstanceState(bundle);
            return;
        }
        i.m("capture");
        throw null;
    }

    public void onStart() {
        super.onStart();
        a0.J0((AppCompatActivity)this);
    }
}

