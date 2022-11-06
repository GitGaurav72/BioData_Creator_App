/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.j.v.a.b
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.r1.d
 *  k.b0.x.b.x0.m.y0
 *  k.s.r
 */
package k.b0.x.b.x0.j.v.a;

import java.util.List;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.j.v.a.b;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.r1.d;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.s.r;
import k.x.c.i;

public final class a
extends m0
implements d {
    public final b1 l;
    public final b m;
    public final boolean n;
    public final k.b0.x.b.x0.c.i1.h o;

    public a(b1 b12, b b2, boolean bl, k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)b12, "typeProjection");
        i.e((Object)b2, "constructor");
        i.e((Object)h2, "annotations");
        this.l = b12;
        this.m = b2;
        this.n = bl;
        this.o = h2;
    }

    public List<b1> S() {
        return r.k;
    }

    public y0 T() {
        return this.m;
    }

    public boolean U() {
        return this.n;
    }

    @Override
    public m1 X(boolean bl) {
        if (bl == this.n) {
            return this;
        }
        return new a(this.l, this.m, bl, this.o);
    }

    @Override
    public m1 Z(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        return new a(this.l, this.m, this.n, h2);
    }

    @Override
    public m0 a0(boolean bl) {
        if (bl == this.n) {
            return this;
        }
        return new a(this.l, this.m, bl, this.o);
    }

    @Override
    public m0 b0(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        return new a(this.l, this.m, this.n, h2);
    }

    public a c0(k.b0.x.b.x0.m.p1.d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        b1 b12 = this.l.refine(d2);
        i.d((Object)b12, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(b12, this.m, this.n, this.o);
    }

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        return this.o;
    }

    public h getMemberScope() {
        h h2 = y.c("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        i.d((Object)h2, "createErrorScope(\n      \u2026solution\", true\n        )");
        return h2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Captured(");
        stringBuilder.append((Object)this.l);
        stringBuilder.append(')');
        String string = this.n ? "?" : "";
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

