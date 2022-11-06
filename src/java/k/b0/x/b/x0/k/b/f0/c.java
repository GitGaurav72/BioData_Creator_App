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
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.j;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.f.d;
import k.b0.x.b.x0.f.z.f;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.k.b.f0.b;
import k.b0.x.b.x0.k.b.f0.g;
import k.x.c.i;

public final class c
extends k.b0.x.b.x0.c.k1.i
implements b {
    public final d l;
    public final k.b0.x.b.x0.f.z.c m;
    public final k.b0.x.b.x0.f.z.e n;
    public final f o;
    public final g p;

    public c(e e2, j j2, h h2, boolean bl, b.a a2, d d2, k.b0.x.b.x0.f.z.c c2, k.b0.x.b.x0.f.z.e e3, f f2, g g2, u0 u02) {
        i.e(e2, "containingDeclaration");
        i.e((Object)h2, "annotations");
        i.e((Object)a2, "kind");
        i.e((Object)d2, "proto");
        i.e(c2, "nameResolver");
        i.e(e3, "typeTable");
        i.e(f2, "versionRequirementTable");
        u0 u03 = u02 == null ? u0.a : u02;
        super(e2, j2, h2, bl, a2, u03);
        this.l = d2;
        this.m = c2;
        this.n = e3;
        this.o = f2;
        this.p = g2;
    }

    @Override
    public g A() {
        return this.p;
    }

    public c S(k k2, v v2, b.a a2, h h2, u0 u02) {
        i.e((Object)k2, "newOwner");
        i.e((Object)a2, "kind");
        i.e((Object)h2, "annotations");
        i.e((Object)u02, "source");
        c c2 = new c((e)k2, (j)v2, h2, this.k, a2, this.l, this.m, this.n, this.o, this.p, u02);
        c2.setHasStableParameterNames(this.hasStableParameterNames());
        return c2;
    }

    @Override
    public boolean isExternal() {
        return false;
    }

    @Override
    public boolean isInline() {
        return false;
    }

    @Override
    public boolean isSuspend() {
        return false;
    }

    @Override
    public boolean isTailrec() {
        return false;
    }

    @Override
    public p l() {
        return this.l;
    }

    @Override
    public k.b0.x.b.x0.f.z.e t() {
        return this.n;
    }

    @Override
    public k.b0.x.b.x0.f.z.c y() {
        return this.m;
    }
}

