/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.appcompat.app.AppCompatDialogFragment
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentTransaction
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.lifecycle.LifecycleOwnerKt
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 *  com.appfoundry.previewer.BravoApp
 *  com.appfoundry.previewer.BravoApp$a
 *  com.appfoundry.previewer.model.Page
 *  e.g.a.j.n0
 *  e.g.a.j.r0
 *  e.g.a.j.v0
 *  e.g.a.k.i
 *  e.g.a.p.j
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  k.x.b.p
 *  kotlin.Metadata
 *  p.a.a
 *  p.a.a$b
 */
package com.appfoundry.previewer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Page;
import e.d.a.f;
import e.g.a.j.n0;
import e.g.a.j.r0;
import e.g.a.j.v0;
import e.g.a.k.i;
import e.g.a.p.j;
import e.s.a.a;
import k.u.d;
import k.x.b.p;
import kotlin.Metadata;
import l.a.b0;
import p.a.a;

@Metadata(d1={"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020!H\u0016J&\u0010+\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u00020)2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00067"}, d2={"Lcom/appfoundry/previewer/fragments/BottomSheetFragment;", "Lcom/andrefrsousa/superbottomsheet/SuperBottomSheetFragment;", "()V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "layerContainer", "Landroid/view/View;", "getLayerContainer", "()Landroid/view/View;", "setLayerContainer", "(Landroid/view/View;)V", "originalRemoteUrl", "", "page", "Lcom/appfoundry/previewer/model/Page;", "getPage", "()Lcom/appfoundry/previewer/model/Page;", "setPage", "(Lcom/appfoundry/previewer/model/Page;)V", "pageLayout", "getPageLayout", "setPageLayout", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "resizable", "", "getResizable", "()Z", "setResizable", "(Z)V", "getExpandedHeight", "getPeekHeight", "getRemotePageWithCoroutines", "", "isSheetAlwaysExpanded", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "LockedBottomSheetBehavior", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class BottomSheetFragment
extends f {
    public View A;
    public String B;
    public Page w;
    public int x;
    public boolean y = true;
    public View z;

    @Override
    public int d() {
        int n2;
        if (this.y && (n2 = this.x) != 0) {
            return n2;
        }
        return super.d();
    }

    @Override
    public int e() {
        int n2 = this.x;
        if (n2 != 0) {
            return n2;
        }
        return super.e();
    }

    @Override
    public boolean g() {
        return this.x == 0;
    }

    public final View i() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        k.x.c.i.m("layerContainer");
        throw null;
    }

    public final View j() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        k.x.c.i.m("pageLayout");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public View onCreateView(LayoutInflater var1_1, ViewGroup var2_2, Bundle var3_3) {
        k.x.c.i.e((Object)var1_1, "inflater");
        super.onCreateView(var1_1, var2_2, var3_3);
        var5_4 = this.w;
        var6_5 = var5_4 == null ? null : var5_4.c;
        if (k.x.c.i.a(var6_5, "menu:modal")) {
            var7_6 = var1_1.inflate(2131427372, var2_2, false);
            var8_7 = "inflater.inflate(R.layou\u2026iginal, container, false)";
        } else {
            var7_6 = var1_1.inflate(2131427397, var2_2, false);
            var8_7 = "inflater.inflate(R.layou\u2026lified, container, false)";
        }
        k.x.c.i.d((Object)var7_6, var8_7);
        k.x.c.i.e((Object)var7_6, "<set-?>");
        this.z = var7_6;
        var9_8 = this.j().findViewById(2131230819);
        k.x.c.i.d((Object)var9_8, "pageLayout.findViewById<\u2026(R.id.bottomsheet_parent)");
        k.x.c.i.e((Object)var9_8, "<set-?>");
        this.A = var9_8;
        var10_9 = (SwipeRefreshLayout)this.j().findViewById(2131231310);
        if (var10_9 != null) {
            var10_9.setEnabled(false);
        }
        var11_10 = this.w;
        var12_11 = var11_10 == null ? null : var11_10.c;
        j.g((String)var12_11);
        var13_12 = this.w;
        var14_13 = var13_12 == null ? null : var13_12.l;
        this.B = var14_13;
        var15_14 = true;
        var16_15 = var13_12 != null && r0.n((Page)var13_12) == var15_14 ? var15_14 : false;
        if (!var16_15) ** GOTO lbl-1000
        var18_16 = this.w;
        if (var18_16 == null || var18_16.N) {
            var15_14 = false;
        }
        if (var15_14) {
            var19_17 = this.j();
            var20_18 = this.getActivity();
            var21_19 = this.w;
            var22_20 = this.i();
            var23_21 = this.x;
            if (var23_21 == 0) {
                var23_21 = super.e();
            }
            var24_22 = v0.n((View)var19_17, (FragmentActivity)var20_18, (Page)var21_19, (View)var22_20, (Integer)var23_21, null, (int)16);
            a.H2((b0)LifecycleOwnerKt.getLifecycleScope((LifecycleOwner)this), null, null, (p)new i(this, var24_22, null), (int)3, null);
        } else lbl-1000: // 2 sources:
        {
            if ((var17_23 = this.w) != null) {
                var17_23.N = false;
            }
            v0.o((View)this.j(), (FragmentActivity)this.getActivity(), (Page)this.w, null, (View)this.i(), (int)4);
        }
        if (BravoApp.k.e() == false) return this.j();
        n0.t((AppCompatDialogFragment)this);
        n0.s((AppCompatDialogFragment)this);
        return this.j();
    }

    public void show(FragmentManager fragmentManager, String string) {
        k.x.c.i.e((Object)fragmentManager, "manager");
        try {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            k.x.c.i.d((Object)fragmentTransaction, "manager.beginTransaction()");
            fragmentTransaction.add((Fragment)this, string);
            fragmentTransaction.commitAllowingStateLoss();
            return;
        }
        catch (IllegalStateException illegalStateException) {
            Object[] arrobject = new Object[2];
            Page page = this.w;
            String string2 = page == null ? null : page.a;
            arrobject[0] = string2;
            arrobject[1] = illegalStateException.getLocalizedMessage();
            p.a.a.d.b("Error showing BottomSheetFragment with pageID: %s. Exception: %s", arrobject);
            return;
        }
    }
}

