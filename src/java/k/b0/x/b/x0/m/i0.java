/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.l.e
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.o1
 *  k.b0.x.b.x0.m.p1.d
 *  k.x.b.a
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.l.e;
import k.b0.x.b.x0.l.i;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.h0;
import k.b0.x.b.x0.m.o1;
import k.b0.x.b.x0.m.p1.d;
import k.x.b.a;

public final class i0
extends o1 {
    public final m l;
    public final a<f0> m;
    public final i<f0> n;

    public i0(m m2, a<? extends f0> a2) {
        k.x.c.i.e(m2, "storageManager");
        k.x.c.i.e(a2, "computation");
        this.l = m2;
        this.m = a2;
        this.n = m2.d(a2);
    }

    public f0 V(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return new i0(this.l, new h0(d2, this));
    }

    public f0 X() {
        return (f0)this.n.invoke();
    }

    public boolean Y() {
        e.h h2 = (e.h)this.n;
        return h2.m != e.n.k && h2.m != e.n.l;
    }
}

