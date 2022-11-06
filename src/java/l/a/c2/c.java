/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.RejectedExecutionException
 */
package l.a.c2;

import java.util.concurrent.RejectedExecutionException;
import k.u.f;
import l.a.c2.a;
import l.a.c2.l;
import l.a.e0;
import l.a.s0;

public class c
extends s0 {
    public final int k;
    public final int l;
    public final long m;
    public final String n;
    public a o;

    public c(int n2, int n3, String string, int n4) {
        a a2;
        if ((n4 & 1) != 0) {
            n2 = l.b;
        }
        int n5 = n2;
        if ((n4 & 2) != 0) {
            n3 = l.c;
        }
        int n6 = n3;
        String string2 = (n4 & 4) != 0 ? "DefaultDispatcher" : null;
        String string3 = string2;
        long l2 = l.d;
        this.k = n5;
        this.l = n6;
        this.m = l2;
        this.n = string3;
        this.o = a2 = new a(n5, n6, l2, string3);
    }

    @Override
    public void dispatch(f f2, Runnable runnable) {
        try {
            a.q(this.o, runnable, null, false, 6);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            e0.p.S(runnable);
            return;
        }
    }

    @Override
    public void dispatchYield(f f2, Runnable runnable) {
        try {
            a.q(this.o, runnable, null, true, 2);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            e0.p.dispatchYield(f2, runnable);
            return;
        }
    }
}

