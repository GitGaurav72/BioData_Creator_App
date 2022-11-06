/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y$d
 *  k.b0.x.b.x0.m.y0
 *  k.x.b.l
 */
package k.b0.x.b.x0.m;

import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.j0;
import k.b0.x.b.x0.m.k0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.n;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.x.b.l;
import k.x.c.i;

public final class n0
extends m0 {
    public final y0 l;
    public final List<b1> m;
    public final boolean n;
    public final h o;
    public final l<d, m0> p;

    public n0(y0 y02, List<? extends b1> list, boolean bl, h h2, l<? super d, ? extends m0> l2) {
        i.e((Object)y02, "constructor");
        i.e(list, "arguments");
        i.e((Object)h2, "memberScope");
        i.e(l2, "refinedTypeFactory");
        this.l = y02;
        this.m = list;
        this.n = bl;
        this.o = h2;
        this.p = l2;
        if (!(h2 instanceof y.d)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SimpleTypeImpl should not be created for error type: ");
        stringBuilder.append((Object)h2);
        stringBuilder.append('\n');
        stringBuilder.append((Object)y02);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public List<b1> S() {
        return this.m;
    }

    public y0 T() {
        return this.l;
    }

    public boolean U() {
        return this.n;
    }

    public f0 V(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        m0 m02 = (m0)this.p.invoke((Object)d2);
        if (m02 == null) {
            m02 = this;
        }
        return m02;
    }

    public m1 Y(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        m0 m02 = (m0)this.p.invoke((Object)d2);
        if (m02 == null) {
            m02 = this;
        }
        return m02;
    }

    @Override
    public m0 a0(boolean bl) {
        if (bl == this.n) {
            return this;
        }
        if (bl) {
            return new k0(this);
        }
        return new j0(this);
    }

    @Override
    public m0 b0(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        if (h2.isEmpty()) {
            return this;
        }
        return new n(this, h2);
    }

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        Objects.requireNonNull((Object)k.b0.x.b.x0.c.i1.h.g);
        return h.a.b;
    }

    public h getMemberScope() {
        return this.o;
    }
}

