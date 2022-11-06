/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.t;

public final class a
extends t {
    public final m0 l;
    public final m0 m;

    public a(m0 m02, m0 m03) {
        k.x.c.i.e(m02, "delegate");
        k.x.c.i.e(m03, "abbreviation");
        this.l = m02;
        this.m = m03;
    }

    @Override
    public m1 Z(h h2) {
        k.x.c.i.e((Object)h2, "newAnnotations");
        return new a(this.l.b0(h2), this.m);
    }

    @Override
    public m0 a0(boolean bl) {
        return new a(this.l.a0(bl), this.m.a0(bl));
    }

    @Override
    public m0 b0(h h2) {
        k.x.c.i.e((Object)h2, "newAnnotations");
        return new a(this.l.b0(h2), this.m);
    }

    @Override
    public m0 c0() {
        return this.l;
    }

    @Override
    public t e0(m0 m02) {
        k.x.c.i.e(m02, "delegate");
        return new a(m02, this.m);
    }

    public a f0(boolean bl) {
        return new a(this.l.a0(bl), this.m.a0(bl));
    }

    public a g0(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return new a((m0)d2.h((i)((Object)this.l)), (m0)d2.h((i)((Object)this.m)));
    }
}

