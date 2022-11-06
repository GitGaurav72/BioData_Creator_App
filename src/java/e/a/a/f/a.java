/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Integer
 *  java.lang.Object
 *  k.x.b.l
 */
package e.a.a.f;

import android.view.View;
import android.view.ViewTreeObserver;
import k.x.b.l;

public final class a
implements ViewTreeObserver.OnGlobalLayoutListener {
    public Integer k;
    public final /* synthetic */ View l;
    public final /* synthetic */ l m;

    public a(T t, l l2) {
        this.l = t;
        this.m = l2;
    }

    public void onGlobalLayout() {
        Integer n2 = this.k;
        if (n2 != null) {
            int n3 = this.l.getMeasuredWidth();
            if (n2 != null && n2 == n3) {
                this.l.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                return;
            }
        }
        if (this.l.getMeasuredWidth() > 0 && this.l.getMeasuredHeight() > 0) {
            Integer n4 = this.k;
            int n5 = this.l.getMeasuredWidth();
            if (n4 == null || n4 != n5) {
                this.k = this.l.getMeasuredWidth();
                this.m.invoke((Object)this.l);
            }
        }
    }
}

