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
 *  k.b0.x.b.x0.m.y0
 *  k.s.r
 */
package k.b0.x.b.x0.m;

import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.s.r;
import k.x.c.i;

public abstract class e
extends m0 {
    public final y0 l;
    public final boolean m;
    public final h n;

    public e(y0 y02, boolean bl) {
        i.e((Object)y02, "originalTypeVariable");
        this.l = y02;
        this.m = bl;
        h h2 = y.b(i.k("Scope for stub type: ", (Object)y02));
        i.d((Object)h2, "createErrorScope(\"Scope \u2026: $originalTypeVariable\")");
        this.n = h2;
    }

    public List<b1> S() {
        return r.k;
    }

    public boolean U() {
        return this.m;
    }

    public f0 V(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }

    public m1 Y(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }

    @Override
    public m1 Z(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        return this;
    }

    @Override
    public m0 a0(boolean bl) {
        if (bl == this.m) {
            return this;
        }
        return this.c0(bl);
    }

    @Override
    public m0 b0(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        return this;
    }

    public abstract e c0(boolean var1);

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        Objects.requireNonNull((Object)k.b0.x.b.x0.c.i1.h.g);
        return h.a.b;
    }

    public h getMemberScope() {
        return this.n;
    }
}

