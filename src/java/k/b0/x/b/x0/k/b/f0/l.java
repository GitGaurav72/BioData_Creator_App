/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.k.b.f0.g
 */
package k.b0.x.b.x0.k.b.f0;

import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.j0;
import k.b0.x.b.x0.c.k1.r;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.f.i;
import k.b0.x.b.x0.f.z.c;
import k.b0.x.b.x0.f.z.f;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.k.b.f0.b;
import k.b0.x.b.x0.k.b.f0.g;

public final class l
extends j0
implements b {
    public final i k;
    public final c l;
    public final k.b0.x.b.x0.f.z.e m;
    public final f n;
    public final g o;

    public l(k k2, t0 t02, h h2, e e2, b.a a2, i i2, c c2, k.b0.x.b.x0.f.z.e e3, f f2, g g2, u0 u02) {
        k.x.c.i.e((Object)k2, "containingDeclaration");
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)a2, "kind");
        k.x.c.i.e((Object)i2, "proto");
        k.x.c.i.e(c2, "nameResolver");
        k.x.c.i.e(e3, "typeTable");
        k.x.c.i.e(f2, "versionRequirementTable");
        u0 u03 = u02 == null ? u0.a : u02;
        super(k2, t02, h2, e2, a2, u03);
        this.k = i2;
        this.l = c2;
        this.m = e3;
        this.n = f2;
        this.o = g2;
    }

    @Override
    public g A() {
        return this.o;
    }

    @Override
    public r createSubstitutedCopy(k k2, v v2, b.a a2, e e2, h h2, u0 u02) {
        e e3;
        k.x.c.i.e((Object)k2, "newOwner");
        k.x.c.i.e((Object)a2, "kind");
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e((Object)u02, "source");
        t0 t02 = (t0)v2;
        if (e2 == null) {
            e e4 = this.getName();
            k.x.c.i.d(e4, "name");
            e3 = e4;
        } else {
            e3 = e2;
        }
        l l2 = new l(k2, t02, h2, e3, a2, this.k, this.l, this.m, this.n, this.o, u02);
        l2.setHasStableParameterNames(this.hasStableParameterNames());
        return l2;
    }

    @Override
    public p l() {
        return this.k;
    }

    @Override
    public k.b0.x.b.x0.f.z.e t() {
        return this.m;
    }

    @Override
    public c y() {
        return this.l;
    }
}

