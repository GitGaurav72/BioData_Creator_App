/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 */
package k.b0.x.b.x0.m;

import e.e.a.a.a;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.k1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.t;

public final class o0
extends t
implements k1 {
    public final m0 l;
    public final f0 m;

    public o0(m0 m02, f0 f02) {
        k.x.c.i.e(m02, "delegate");
        k.x.c.i.e((Object)f02, "enhancement");
        this.l = m02;
        this.m = f02;
    }

    @Override
    public m1 P() {
        return this.l;
    }

    @Override
    public m0 a0(boolean bl) {
        return (m0)e.s.a.a.y4((m1)this.l.a0(bl), (f0)this.m.W().X(bl));
    }

    @Override
    public m0 b0(h h2) {
        k.x.c.i.e((Object)h2, "newAnnotations");
        return (m0)e.s.a.a.y4((m1)this.l.b0(h2), (f0)this.m);
    }

    @Override
    public m0 c0() {
        return this.l;
    }

    @Override
    public t e0(m0 m02) {
        k.x.c.i.e(m02, "delegate");
        return new o0(m02, this.m);
    }

    public o0 f0(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return new o0((m0)d2.h((i)((Object)this.l)), d2.h((i)this.m));
    }

    @Override
    public f0 o() {
        return this.m;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = a.t((String)"[@EnhancedForWarnings(");
        stringBuilder.append((Object)this.m);
        stringBuilder.append(")] ");
        stringBuilder.append((Object)this.l);
        return stringBuilder.toString();
    }
}

