/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.os.Message
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.animation.AccelerateInterpolator
 *  android.widget.ImageView
 *  androidx.appcompat.app.AppCompatDialogFragment
 *  androidx.fragment.app.DialogFragment
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  e.e.a.a.a
 *  e.g.a.k.h
 *  g.a.a.a.a
 *  g.a.a.a.b
 *  g.a.a.a.c
 *  g.a.a.a.c$a
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 */
package g.a.a.a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import e.g.a.k.h;
import g.a.a.a.a;
import g.a.a.a.b;
import g.a.a.a.c;

public abstract class e
extends AppCompatDialogFragment {
    public c k;

    public int d() {
        return 8;
    }

    public float e() {
        return 4.0f;
    }

    public void onAttach(Activity activity) {
        Fragment.super.onAttach(activity);
        c c2 = this.k;
        if (c2 != null) {
            c2.h = activity;
        }
    }

    public void onCreate(Bundle bundle) {
        DialogFragment.super.onCreate(bundle);
        this.k = new c((Activity)this.getActivity());
        int n2 = this.d();
        if (n2 > 0) {
            c c2 = this.k;
            if (n2 < 0) {
                n2 = 0;
            }
            c2.g = n2;
            float f2 = this.e();
            if (!((double)f2 <= 1.0)) {
                c c3 = this.k;
                c3.f = f2 >= 1.0f ? f2 : 1.0f;
                c3.l = this instanceof h;
                c3.e = false;
                c3.k = false;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Down scale must be strictly greater than 1.0. Found : ");
            stringBuilder.append(f2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException(e.e.a.a.a.f((String)"Blur radius must be strictly positive. Found : ", (int)n2));
    }

    public void onDestroyView() {
        if (this.getDialog() != null) {
            this.getDialog().setDismissMessage(null);
        }
        DialogFragment.super.onDestroyView();
    }

    public void onDetach() {
        DialogFragment.super.onDetach();
        c c2 = this.k;
        c.a a2 = c2.d;
        if (a2 != null) {
            a2.cancel(true);
        }
        c2.d = null;
        c2.h = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView;
        DialogFragment.super.onDismiss(dialogInterface);
        c c2 = this.k;
        c.a a2 = c2.d;
        if (a2 != null) {
            a2.cancel(true);
        }
        if ((imageView = c2.b) != null) {
            imageView.animate().alpha(0.0f).setDuration((long)c2.j).setInterpolator((TimeInterpolator)new AccelerateInterpolator()).setListener((Animator.AnimatorListener)new b(c2)).start();
        }
    }

    public void onResume() {
        Fragment.super.onResume();
        c c2 = this.k;
        boolean bl = this.getRetainInstance();
        if (c2.b == null || bl) {
            if (c2.h.getWindow().getDecorView().isShown()) {
                c.a a2;
                c2.d = a2 = new c.a(c2, null);
                a2.execute((Object[])new Void[0]);
                return;
            }
            c2.h.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)new a(c2));
        }
    }

    public void onStart() {
        Dialog dialog = this.getDialog();
        if (dialog != null) {
            dialog.getWindow().clearFlags(2);
            if (dialog.getWindow().getAttributes().windowAnimations == 0) {
                dialog.getWindow().getAttributes().windowAnimations = 2131820819;
            }
        }
        DialogFragment.super.onStart();
    }
}

