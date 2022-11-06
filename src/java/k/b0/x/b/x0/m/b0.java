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
import k.b0.x.b.x0.i.c;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.k1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.z;

public final class b0
extends z
implements k1 {
    public final z n;
    public final f0 o;

    public b0(z z2, f0 f02) {
        k.x.c.i.e((Object)z2, "origin");
        k.x.c.i.e((Object)f02, "enhancement");
        super(z2.l, z2.m);
        this.n = z2;
        this.o = f02;
    }

    @Override
    public m1 P() {
        return this.n;
    }

    public m1 X(boolean bl) {
        return e.s.a.a.y4((m1)this.n.X(bl), (f0)this.o.W().X(bl));
    }

    public m1 Z(h h2) {
        k.x.c.i.e((Object)h2, "newAnnotations");
        return e.s.a.a.y4((m1)this.n.Z(h2), (f0)this.o);
    }

    @Override
    public m0 a0() {
        return this.n.a0();
    }

    @Override
    public String b0(c c2, k.b0.x.b.x0.i.i i2) {
        k.x.c.i.e(c2, "renderer");
        k.x.c.i.e(i2, "options");
        if (i2.f()) {
            return c2.v(this.o);
        }
        return this.n.b0(c2, i2);
    }

    public b0 c0(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return new b0((z)d2.h((i)((Object)this.n)), d2.h((i)this.o));
    }

    @Override
    public f0 o() {
        return this.o;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = a.t((String)"[@EnhancedForWarnings(");
        stringBuilder.append((Object)this.o);
        stringBuilder.append(")] ");
        stringBuilder.append((Object)this.n);
        return stringBuilder.toString();
    }
}

