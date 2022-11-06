/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.m0$a
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.k.b.f0.g
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.y0
 *  k.s.r
 */
package k.b0.x.b.x0.k.b.f0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.d;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.i;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.f;
import k.b0.x.b.x0.c.k1.l0;
import k.b0.x.b.x0.c.k1.m0;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.y0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.f.z.c;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.k.b.f0.g;
import k.b0.x.b.x0.k.b.f0.h;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.h1;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.p0;

public final class m
extends f
implements h {
    public final k.b0.x.b.x0.l.m n;
    public final k.b0.x.b.x0.f.r o;
    public final c p;
    public final k.b0.x.b.x0.f.z.e q;
    public final k.b0.x.b.x0.f.z.f r;
    public final g s;
    public Collection<? extends l0> t;
    public k.b0.x.b.x0.m.m0 u;
    public k.b0.x.b.x0.m.m0 v;
    public List<? extends z0> w;
    public k.b0.x.b.x0.m.m0 x;

    public m(k.b0.x.b.x0.l.m m2, k k2, k.b0.x.b.x0.c.i1.h h2, k.b0.x.b.x0.g.e e2, r r2, k.b0.x.b.x0.f.r r3, c c2, k.b0.x.b.x0.f.z.e e3, k.b0.x.b.x0.f.z.f f2, g g2) {
        k.x.c.i.e(m2, "storageManager");
        k.x.c.i.e((Object)k2, "containingDeclaration");
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)r2, "visibility");
        k.x.c.i.e((Object)r3, "proto");
        k.x.c.i.e(c2, "nameResolver");
        k.x.c.i.e(e3, "typeTable");
        k.x.c.i.e(f2, "versionRequirementTable");
        u0 u02 = u0.a;
        k.x.c.i.d((Object)u02, "NO_SOURCE");
        super(k2, h2, e2, u02, r2);
        this.n = m2;
        this.o = r3;
        this.p = c2;
        this.q = e3;
        this.r = f2;
        this.s = g2;
    }

    @Override
    public g A() {
        return this.s;
    }

    @Override
    public k.b0.x.b.x0.m.m0 C() {
        k.b0.x.b.x0.m.m0 m02 = this.u;
        if (m02 != null) {
            return m02;
        }
        k.x.c.i.m("underlyingType");
        throw null;
    }

    @Override
    public e f() {
        if (e.s.a.a.s2((f0)this.v())) {
            return null;
        }
        k.b0.x.b.x0.c.h h2 = this.v().T().getDeclarationDescriptor();
        boolean bl = h2 instanceof e;
        e e2 = null;
        if (bl) {
            e2 = (e)h2;
        }
        return e2;
    }

    @Override
    public k.b0.x.b.x0.m.m0 getDefaultType() {
        k.b0.x.b.x0.m.m0 m02 = this.x;
        if (m02 != null) {
            return m02;
        }
        k.x.c.i.m("defaultTypeImpl");
        throw null;
    }

    public final void o(List<? extends z0> list, k.b0.x.b.x0.m.m0 m02, k.b0.x.b.x0.m.m0 m03) {
        k.s.r r2;
        k.x.c.i.e(list, "declaredTypeParameters");
        k.x.c.i.e(m02, "underlyingType");
        k.x.c.i.e(m03, "expandedType");
        k.x.c.i.e(list, "declaredTypeParameters");
        this.l = list;
        this.u = m02;
        this.v = m03;
        this.w = e.s.a.a.a0((i)this);
        e e2 = this.f();
        h.b b2 = e2 == null ? h.b.b : e2.getUnsubstitutedMemberScope();
        k.b0.x.b.x0.m.m0 m04 = j1.o(this, (k.b0.x.b.x0.j.a0.h)b2, new k.b0.x.b.x0.c.k1.e(this));
        k.x.c.i.d(m04, "@OptIn(TypeRefinement::c\u2026s)?.defaultType\n        }");
        this.x = m04;
        e e3 = this.f();
        if (e3 == null) {
            r2 = k.s.r.k;
        } else {
            Collection<d> collection = e3.getConstructors();
            k.x.c.i.d(collection, "classDescriptor.constructors");
            ArrayList arrayList = new ArrayList();
            for (d d2 : collection) {
                m0 m05;
                m0.a a2 = m0.k;
                k.b0.x.b.x0.l.m m2 = this.n;
                k.x.c.i.d(d2, "it");
                Objects.requireNonNull((Object)a2);
                k.x.c.i.e(m2, "storageManager");
                k.x.c.i.e(this, "typeAliasDescriptor");
                k.x.c.i.e(d2, "constructor");
                h1 h12 = this.f() == null ? null : h1.d((f0)this.v());
                if (h12 == null) {
                    m05 = null;
                } else {
                    d d3 = d2.substitute(h12);
                    if (d3 == null) {
                        m05 = null;
                    } else {
                        k.b0.x.b.x0.c.i1.h h2 = d2.getAnnotations();
                        b.a a3 = d2.getKind();
                        k.x.c.i.d((Object)a3, "constructor.kind");
                        u0 u02 = this.getSource();
                        k.x.c.i.d((Object)u02, "typeAliasDescriptor.source");
                        m0 m06 = new m0(m2, this, d3, null, h2, a3, u02);
                        List<e1> list2 = k.b0.x.b.x0.c.k1.r.getSubstitutedValueParameters(m06, d2.getValueParameters(), h12);
                        if (list2 == null) {
                            m05 = null;
                        } else {
                            q0 q02;
                            k.b0.x.b.x0.m.m0 m07 = e.s.a.a.P2((f0)d3.getReturnType().W());
                            k.b0.x.b.x0.m.m0 m08 = this.getDefaultType();
                            k.x.c.i.d(m08, "typeAliasDescriptor.defaultType");
                            k.b0.x.b.x0.m.m0 m09 = p0.e(m07, m08);
                            q0 q03 = d2.getDispatchReceiverParameter();
                            if (q03 == null) {
                                q02 = null;
                            } else {
                                f0 f02 = h12.i(q03.b(), n1.k);
                                Objects.requireNonNull((Object)k.b0.x.b.x0.c.i1.h.g);
                                q02 = e.s.a.a.z0((a)m06, (f0)f02, (k.b0.x.b.x0.c.i1.h)h.a.b);
                            }
                            m06.initialize(q02, null, this.getDeclaredTypeParameters(), list2, (f0)m09, b0.l, this.k);
                            m05 = m06;
                        }
                    }
                }
                if (m05 == null) continue;
                arrayList.add(m05);
            }
            r2 = arrayList;
        }
        this.t = r2;
    }

    public l substitute(h1 h12) {
        k.x.c.i.e(h12, "substitutor");
        if (h12.h()) {
            return this;
        }
        k.b0.x.b.x0.l.m m2 = this.n;
        k k2 = this.getContainingDeclaration();
        k.x.c.i.d((Object)k2, "containingDeclaration");
        k.b0.x.b.x0.c.i1.h h2 = this.getAnnotations();
        k.x.c.i.d((Object)h2, "annotations");
        k.b0.x.b.x0.g.e e2 = this.getName();
        k.x.c.i.d(e2, "name");
        m m3 = new m(m2, k2, h2, e2, this.k, this.o, this.p, this.q, this.r, this.s);
        List<z0> list = this.getDeclaredTypeParameters();
        k.b0.x.b.x0.m.m0 m02 = this.C();
        n1 n12 = n1.k;
        f0 f02 = h12.i((f0)m02, n12);
        k.x.c.i.d((Object)f02, "substitutor.safeSubstitu\u2026Type, Variance.INVARIANT)");
        k.b0.x.b.x0.m.m0 m03 = e.s.a.a.x((f0)f02);
        f0 f03 = h12.i((f0)this.v(), n12);
        k.x.c.i.d((Object)f03, "substitutor.safeSubstitu\u2026Type, Variance.INVARIANT)");
        m3.o(list, m03, e.s.a.a.x((f0)f03));
        return m3;
    }

    @Override
    public k.b0.x.b.x0.f.z.e t() {
        return this.q;
    }

    @Override
    public k.b0.x.b.x0.m.m0 v() {
        k.b0.x.b.x0.m.m0 m02 = this.v;
        if (m02 != null) {
            return m02;
        }
        k.x.c.i.m("expandedType");
        throw null;
    }

    @Override
    public c y() {
        return this.p;
    }
}

