/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  android.view.Window
 *  androidx.annotation.CallSuper
 *  androidx.annotation.IntRange
 *  androidx.annotation.UiThread
 *  androidx.core.content.ContextCompat
 *  androidx.fragment.app.DialogFragment
 *  androidx.fragment.app.Fragment
 *  com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout
 *  com.google.android.material.bottomsheet.BottomSheetBehavior
 *  com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
 *  com.google.android.material.bottomsheet.BottomSheetDialogFragment
 *  e.d.a.a
 *  e.d.a.c
 *  e.d.a.d
 *  e.d.a.e
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package e.d.a;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import e.d.a.a;
import e.d.a.c;
import e.d.a.d;
import e.d.a.e;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bK\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\b\u001d\u0010\u0019R\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010\"R\"\u0010,\u001a\u00020\u000b8\u0000@\u0000X.\u00a2\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0000@\u0000X.\u00a2\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b<\u0010\"R\u001a\u0010A\u001a\u0006\u0012\u0002\b\u00030>8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u0010\"R\u0016\u0010E\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010\u001fR\"\u0010J\u001a\u00020\u001a8\u0000@\u0000X\u000e\u00a2\u0006\u0012\n\u0004\bF\u0010\"\u001a\u0004\bG\u0010\u001c\"\u0004\bH\u0010I\u00a8\u0006L"}, d2={"Le/d/a/f;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lk/q;", "onStart", "()V", "onResume", "onPause", "", "dim", "h", "(F)V", "", "e", "()I", "", "g", "()Z", "d", "o", "F", "propertyDim", "s", "Z", "propertyIsSheetCancelableOnTouchOutside", "t", "propertyIsSheetCancelable", "k", "Landroid/view/View;", "getSheetTouchOutsideContainer$lib_release", "()Landroid/view/View;", "setSheetTouchOutsideContainer$lib_release", "(Landroid/view/View;)V", "sheetTouchOutsideContainer", "Lcom/andrefrsousa/superbottomsheet/CornerRadiusFrameLayout;", "l", "Lcom/andrefrsousa/superbottomsheet/CornerRadiusFrameLayout;", "f", "()Lcom/andrefrsousa/superbottomsheet/CornerRadiusFrameLayout;", "setSheetContainer$lib_release", "(Lcom/andrefrsousa/superbottomsheet/CornerRadiusFrameLayout;)V", "sheetContainer", "q", "I", "propertyStatusBarColor", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "n", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "callback", "v", "canSetStatusBarColor", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "m", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "r", "propertyIsAlwaysExpanded", "p", "propertyCornerRadius", "u", "getPropertyAnimateCornerRadius$lib_release", "setPropertyAnimateCornerRadius$lib_release", "(Z)V", "propertyAnimateCornerRadius", "<init>", "lib_release"}, k=1, mv={1, 4, 0})
public abstract class f
extends BottomSheetDialogFragment {
    public View k;
    public CornerRadiusFrameLayout l;
    public BottomSheetBehavior<?> m;
    public BottomSheetBehavior.BottomSheetCallback n;
    public float o;
    public float p;
    public int q;
    public boolean r;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public boolean v;

    @IntRange(from=-2L, to=-1L)
    public int d() {
        Resources resources;
        int n2 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903991);
        if (n2 != -1) {
            resources = this.getResources();
        } else {
            Context context = this.getContext();
            i.c((Object)context);
            i.d((Object)context, "context!!");
            resources = context.getResources();
            n2 = 2131296305;
        }
        return resources.getInteger(n2);
    }

    public int e() {
        int n2 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903992);
        int n3 = n2 != -1 ? this.getResources().getDimensionPixelSize(n2) : this.getResources().getDimensionPixelSize(2131100272);
        Resources resources = this.getResources();
        i.d((Object)resources, "resources");
        int n4 = resources.getDisplayMetrics().heightPixels;
        int n5 = n4 - n4 * 9 / 16;
        if (n3 < n5) {
            n3 = n5;
        }
        return n3;
    }

    public final CornerRadiusFrameLayout f() {
        CornerRadiusFrameLayout cornerRadiusFrameLayout = this.l;
        if (cornerRadiusFrameLayout != null) {
            return cornerRadiusFrameLayout;
        }
        i.m("sheetContainer");
        throw null;
    }

    public boolean g() {
        Resources resources;
        int n2 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903983);
        if (n2 != -1) {
            resources = this.getResources();
        } else {
            Context context = this.getContext();
            i.c((Object)context);
            i.d((Object)context, "context!!");
            resources = context.getResources();
            n2 = 2130968599;
        }
        return resources.getBoolean(n2);
    }

    @SuppressLint(value={"NewApi"})
    @UiThread
    public final void h(float f2) {
        Window window;
        if (!this.v) {
            return;
        }
        int n2 = this.q;
        float f3 = 255;
        int n3 = Color.argb((int)((int)(f3 - f2 * f3)), (int)Color.red((int)n2), (int)Color.green((int)n2), (int)Color.blue((int)n2));
        Dialog dialog = this.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setStatusBarColor(n3);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Resources resources;
        int n2 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903985);
        if (n2 != -1) {
            resources = this.getResources();
        } else {
            Context context = this.getContext();
            i.c((Object)context);
            i.d((Object)context, "context!!");
            resources = context.getResources();
            n2 = 2130968596;
        }
        if (resources.getBoolean(n2)) {
            return new c(this.getContext(), 2131821603);
        }
        return new c(this.getContext());
    }

    @SuppressLint(value={"NewApi"})
    @CallSuper
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean bl;
        boolean bl2;
        int n2;
        float f2;
        float f3;
        Resources resources;
        i.e((Object)layoutInflater, "inflater");
        boolean bl3 = a.a((int)21);
        boolean bl4 = !e.a.a.c.e(this.getContext()) && bl3;
        this.v = bl4;
        int n3 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903990);
        if (n3 != -1) {
            TypedValue typedValue = new TypedValue();
            this.getResources().getValue(n3, typedValue, true);
            f2 = typedValue.getFloat();
        } else {
            TypedValue typedValue = new TypedValue();
            this.getResources().getValue(2131100271, typedValue, true);
            f2 = typedValue.getFloat();
        }
        this.o = f2;
        int n4 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903989);
        if (n4 != -1) {
            f3 = this.getResources().getDimension(n4);
        } else {
            Context context = this.getContext();
            i.c((Object)context);
            i.d((Object)context, "context!!");
            f3 = context.getResources().getDimension(2131100273);
        }
        this.p = f3;
        int n5 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903993);
        if (n5 != -1) {
            Context context = this.getContext();
            i.c((Object)context);
            n2 = ContextCompat.getColor((Context)context, (int)n5);
        } else {
            Context context = this.getContext();
            i.c((Object)context);
            Context context2 = this.getContext();
            i.c((Object)context2);
            i.d((Object)context2, "context!!");
            n2 = ContextCompat.getColor((Context)context, (int)e.a.a.c.b(context2, 2130903284));
        }
        this.q = n2;
        this.r = this.g();
        int n6 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903987);
        if (n6 != -1) {
            bl = this.getResources().getBoolean(n6);
        } else {
            Context context = this.getContext();
            i.c((Object)context);
            i.d((Object)context, "context!!");
            bl = context.getResources().getBoolean(2130968597);
        }
        this.t = bl;
        int n7 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903988);
        if (n7 != -1) {
            bl2 = this.getResources().getBoolean(n7);
        } else {
            Context context = this.getContext();
            i.c((Object)context);
            i.d((Object)context, "context!!");
            bl2 = context.getResources().getBoolean(2130968598);
        }
        this.s = bl2;
        int n8 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903984);
        if (n8 != -1) {
            resources = this.getResources();
        } else {
            Context context = this.getContext();
            i.c((Object)context);
            i.d((Object)context, "context!!");
            resources = context.getResources();
            n8 = 2130968595;
        }
        this.u = resources.getBoolean(n8);
        Dialog dialog = this.getDialog();
        if (dialog != null) {
            dialog.setCancelable(this.t);
            boolean bl5 = this.t && this.s;
            dialog.setCanceledOnTouchOutside(bl5);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable((Drawable)new ColorDrawable(0));
                window.setDimAmount(this.o);
                if (bl3) {
                    window.addFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    this.h(1.0f);
                }
                if (e.a.a.c.e(window.getContext()) && !e.a.a.c.c(window.getContext())) {
                    window.setGravity(1);
                    window.setLayout(this.getResources().getDimensionPixelSize(2131100274), -2);
                }
            }
        }
        return null;
    }

    public void onDestroyView() {
        DialogFragment.super.onDestroyView();
    }

    public void onPause() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.m;
        if (bottomSheetBehavior != null) {
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.n;
            if (bottomSheetCallback != null) {
                bottomSheetBehavior.removeBottomSheetCallback(bottomSheetCallback);
                Fragment.super.onPause();
                return;
            }
            i.m("callback");
            throw null;
        }
        i.m("behavior");
        throw null;
    }

    public void onResume() {
        Fragment.super.onResume();
        BottomSheetBehavior<?> bottomSheetBehavior = this.m;
        if (bottomSheetBehavior != null) {
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.n;
            if (bottomSheetCallback != null) {
                bottomSheetBehavior.addBottomSheetCallback(bottomSheetCallback);
                return;
            }
            i.m("callback");
            throw null;
        }
        i.m("behavior");
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @CallSuper
    public void onStart() {
        int n2;
        DialogFragment.super.onStart();
        Dialog dialog = this.getDialog();
        CornerRadiusFrameLayout cornerRadiusFrameLayout = dialog != null ? (CornerRadiusFrameLayout)dialog.findViewById(2131231309) : null;
        i.c(cornerRadiusFrameLayout);
        this.l = cornerRadiusFrameLayout;
        Dialog dialog2 = this.getDialog();
        View view = dialog2 != null ? dialog2.findViewById(2131231371) : null;
        i.c((Object)view);
        this.k = view;
        CornerRadiusFrameLayout cornerRadiusFrameLayout2 = this.l;
        if (cornerRadiusFrameLayout2 == null) {
            i.m("sheetContainer");
            throw null;
        }
        int n3 = e.e.a.a.a.G((f)this, (String)"context!!", (int)2130903986);
        if (n3 != (n2 = -1)) {
            Context context = this.getContext();
            i.c((Object)context);
            n2 = ContextCompat.getColor((Context)context, (int)n3);
        }
        cornerRadiusFrameLayout2.setBackgroundColor(n2);
        CornerRadiusFrameLayout cornerRadiusFrameLayout3 = this.l;
        if (cornerRadiusFrameLayout3 == null) {
            i.m("sheetContainer");
            throw null;
        }
        cornerRadiusFrameLayout3.setCornerRadius$lib_release(this.p);
        CornerRadiusFrameLayout cornerRadiusFrameLayout4 = this.l;
        if (cornerRadiusFrameLayout4 == null) {
            i.m("sheetContainer");
            throw null;
        }
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)cornerRadiusFrameLayout4);
        i.d((Object)bottomSheetBehavior, "BottomSheetBehavior.from(sheetContainer)");
        this.m = bottomSheetBehavior;
        if (e.a.a.c.e(this.getContext()) && !e.a.a.c.c(this.getContext())) {
            CornerRadiusFrameLayout cornerRadiusFrameLayout5 = this.l;
            if (cornerRadiusFrameLayout5 == null) {
                i.m("sheetContainer");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = cornerRadiusFrameLayout5.getLayoutParams();
            layoutParams.width = this.getResources().getDimensionPixelSize(2131100274);
            layoutParams.height = this.d();
            cornerRadiusFrameLayout5.setLayoutParams(layoutParams);
        }
        if (this.r) {
            CornerRadiusFrameLayout cornerRadiusFrameLayout6 = this.l;
            if (cornerRadiusFrameLayout6 == null) {
                i.m("sheetContainer");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = cornerRadiusFrameLayout6.getLayoutParams();
            layoutParams.height = this.d();
            cornerRadiusFrameLayout6.setLayoutParams(layoutParams);
        } else {
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.m;
            if (bottomSheetBehavior2 == null) {
                i.m("behavior");
                throw null;
            }
            bottomSheetBehavior2.setPeekHeight(this.e());
            CornerRadiusFrameLayout cornerRadiusFrameLayout7 = this.l;
            if (cornerRadiusFrameLayout7 == null) {
                i.m("sheetContainer");
                throw null;
            }
            BottomSheetBehavior<?> bottomSheetBehavior3 = this.m;
            if (bottomSheetBehavior3 == null) {
                i.m("behavior");
                throw null;
            }
            cornerRadiusFrameLayout7.setMinimumHeight(bottomSheetBehavior3.getPeekHeight());
        }
        boolean bl = !e.a.a.c.e(this.getContext()) && !e.a.a.c.c(this.getContext()) || this.r;
        BottomSheetBehavior<?> bottomSheetBehavior4 = this.m;
        if (bottomSheetBehavior4 == null) {
            i.m("behavior");
            throw null;
        }
        bottomSheetBehavior4.setSkipCollapsed(bl);
        if (bl) {
            BottomSheetBehavior<?> bottomSheetBehavior5 = this.m;
            if (bottomSheetBehavior5 == null) {
                i.m("behavior");
                throw null;
            }
            bottomSheetBehavior5.setState(3);
            this.h(1.0f);
            CornerRadiusFrameLayout cornerRadiusFrameLayout8 = this.l;
            if (cornerRadiusFrameLayout8 == null) {
                i.m("sheetContainer");
                throw null;
            }
            cornerRadiusFrameLayout8.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)new d(this));
        }
        this.n = new e(this);
    }
}

