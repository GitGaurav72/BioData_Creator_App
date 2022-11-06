/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.f.z.b$b
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.k.b.f0.g
 */
package k.b0.x.b.x0.k.b.f0;

import e.e.a.a.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k1.f0;
import k.b0.x.b.x0.c.k1.q0;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.f.n;
import k.b0.x.b.x0.f.z.b;
import k.b0.x.b.x0.f.z.c;
import k.b0.x.b.x0.f.z.f;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.k.b.f0.b;
import k.b0.x.b.x0.k.b.f0.g;
import k.x.c.i;

public final class k
extends f0
implements b {
    public final n G;
    public final c H;
    public final k.b0.x.b.x0.f.z.e I;
    public final f J;
    public final g K;

    public k(k.b0.x.b.x0.c.k k2, n0 n02, h h2, b0 b02, r r2, boolean bl, e e2, b.a a2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, n n2, c c2, k.b0.x.b.x0.f.z.e e3, f f2, g g2) {
        i.e((Object)k2, "containingDeclaration");
        i.e((Object)h2, "annotations");
        i.e((Object)b02, "modality");
        i.e((Object)r2, "visibility");
        i.e(e2, "name");
        i.e((Object)a2, "kind");
        i.e((Object)n2, "proto");
        i.e(c2, "nameResolver");
        i.e(e3, "typeTable");
        i.e(f2, "versionRequirementTable");
        super(k2, n02, h2, b02, r2, bl, e2, a2, u0.a, bl2, bl3, bl6, false, bl4, bl5);
        this.G = n2;
        this.H = c2;
        this.I = e3;
        this.J = f2;
        this.K = g2;
    }

    @Override
    public g A() {
        return this.K;
    }

    @Override
    public boolean isExternal() {
        return a.F(k.b0.x.b.x0.f.z.b.D, (int)this.G.p, (String)"IS_EXTERNAL_PROPERTY.get(proto.flags)");
    }

    @Override
    public p l() {
        return this.G;
    }

    @Override
    public f0 q(k.b0.x.b.x0.c.k k2, b0 b02, r r2, n0 n02, b.a a2, e e2, u0 u02) {
        i.e((Object)k2, "newOwner");
        i.e((Object)b02, "newModality");
        i.e((Object)r2, "newVisibility");
        i.e((Object)a2, "kind");
        i.e(e2, "newName");
        i.e((Object)u02, "source");
        k k3 = new k(k2, n02, this.getAnnotations(), b02, r2, this.l, e2, a2, this.s, this.t, this.isExternal(), this.x, this.u, this.G, this.H, this.I, this.J, this.K);
        return k3;
    }

    @Override
    public k.b0.x.b.x0.f.z.e t() {
        return this.I;
    }

    @Override
    public c y() {
        return this.H;
    }
}

