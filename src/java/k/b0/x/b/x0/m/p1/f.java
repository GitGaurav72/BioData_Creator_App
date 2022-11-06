/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.r1.d
 *  k.b0.x.b.x0.m.y0
 *  k.s.r
 */
package k.b0.x.b.x0.m.p1;

import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.p1.h;
import k.b0.x.b.x0.m.r1.b;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.s.r;

public final class f
extends m0
implements k.b0.x.b.x0.m.r1.d {
    public final b l;
    public final h m;
    public final m1 n;
    public final k.b0.x.b.x0.c.i1.h o;
    public final boolean p;
    public final boolean q;

    public f(b b2, h h2, m1 m12, k.b0.x.b.x0.c.i1.h h3, boolean bl, boolean bl2) {
        k.x.c.i.e((Object)b2, "captureStatus");
        k.x.c.i.e(h2, "constructor");
        k.x.c.i.e((Object)h3, "annotations");
        this.l = b2;
        this.m = h2;
        this.n = m12;
        this.o = h3;
        this.p = bl;
        this.q = bl2;
    }

    public f(b b2, h h2, m1 m12, k.b0.x.b.x0.c.i1.h h3, boolean bl, boolean bl2, int n2) {
        if ((n2 & 8) != 0) {
            Objects.requireNonNull((Object)k.b0.x.b.x0.c.i1.h.g);
            h3 = h.a.b;
        }
        k.b0.x.b.x0.c.i1.h h4 = h3;
        boolean bl3 = (n2 & 16) != 0 ? false : bl;
        boolean bl4 = (n2 & 32) != 0 ? false : bl2;
        this(b2, h2, m12, h4, bl3, bl4);
    }

    public List<b1> S() {
        return r.k;
    }

    public y0 T() {
        return this.m;
    }

    public boolean U() {
        return this.p;
    }

    public f c0(boolean bl) {
        f f2 = new f(this.l, this.m, this.n, this.o, bl, false, 32);
        return f2;
    }

    public f d0(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        b b2 = this.l;
        h h2 = this.m.b(d2);
        m1 m12 = this.n;
        m1 m13 = m12 == null ? null : d2.h((i)m12).W();
        m1 m14 = m13;
        k.b0.x.b.x0.c.i1.h h3 = this.o;
        boolean bl = this.p;
        f f2 = new f(b2, h2, m14, h3, bl, false, 32);
        return f2;
    }

    public f e0(k.b0.x.b.x0.c.i1.h h2) {
        k.x.c.i.e((Object)h2, "newAnnotations");
        f f2 = new f(this.l, this.m, this.n, h2, this.p, false, 32);
        return f2;
    }

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        return this.o;
    }

    public k.b0.x.b.x0.j.a0.h getMemberScope() {
        k.b0.x.b.x0.j.a0.h h2 = y.c("No member resolution should be done on captured type!", true);
        k.x.c.i.d((Object)h2, "createErrorScope(\"No mem\u2026on captured type!\", true)");
        return h2;
    }
}

