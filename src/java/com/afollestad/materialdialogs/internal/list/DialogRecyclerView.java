/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  androidx.annotation.RestrictTo
 *  androidx.annotation.RestrictTo$Scope
 *  androidx.recyclerview.widget.GridLayoutManager
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  androidx.recyclerview.widget.RecyclerView$OnScrollListener
 *  com.afollestad.materialdialogs.internal.list.DialogRecyclerView$b
 *  java.lang.Object
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.Metadata
 */
package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import k.q;
import k.x.b.l;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0004J/\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2={"Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lk/q;", "a", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "left", "top", "oldl", "oldt", "onScrollChanged", "(IIII)V", "", "c", "()Z", "b", "com/afollestad/materialdialogs/internal/list/DialogRecyclerView$b", "k", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView$b;", "scrollListeners", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k=1, mv={1, 4, 0})
@RestrictTo(value={RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogRecyclerView
extends RecyclerView {
    public final b k;

    public DialogRecyclerView(Context context, AttributeSet attributeSet) {
        i.f((Object)context, "context");
        super(context, attributeSet);
        this.k = new b(this);
    }

    public final void a() {
        if (this.getChildCount() == 0 || this.getMeasuredHeight() == 0) {
            // empty if block
        }
    }

    public final boolean b() {
        RecyclerView.Adapter adapter = this.getAdapter();
        if (adapter != null) {
            i.b((Object)adapter, "adapter!!");
            int n = adapter.getItemCount() - 1;
            RecyclerView.LayoutManager layoutManager = this.getLayoutManager();
            return layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager)layoutManager).findLastCompletelyVisibleItemPosition() == n : layoutManager instanceof GridLayoutManager && ((GridLayoutManager)layoutManager).findLastCompletelyVisibleItemPosition() == n;
        }
        i.l();
        throw null;
    }

    public final boolean c() {
        RecyclerView.LayoutManager layoutManager = this.getLayoutManager();
        return layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager)layoutManager).findFirstCompletelyVisibleItemPosition() == 0 : layoutManager instanceof GridLayoutManager && ((GridLayoutManager)layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a a2 = a.k;
        i.f((Object)this, "$this$waitForWidth");
        i.f((Object)a2, "block");
        if (this.getMeasuredWidth() > 0 && this.getMeasuredHeight() > 0) {
            a2.invoke((Object)this);
        } else {
            this.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new e.a.a.f.a(this, a2));
        }
        this.addOnScrollListener((RecyclerView.OnScrollListener)this.k);
    }

    public void onDetachedFromWindow() {
        this.removeOnScrollListener((RecyclerView.OnScrollListener)this.k);
        super.onDetachedFromWindow();
    }

    public void onScrollChanged(int n, int n2, int n3, int n4) {
        ViewGroup.super.onScrollChanged(n, n2, n3, n4);
        this.a();
    }

}

