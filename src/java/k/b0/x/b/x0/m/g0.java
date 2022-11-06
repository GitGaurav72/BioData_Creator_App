/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.v
 *  k.b0.x.b.x0.c.k1.v$a
 *  k.b0.x.b.x0.c.y0
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.j.a0.m
 *  k.b0.x.b.x0.j.w.o
 *  k.b0.x.b.x0.m.a0
 *  k.b0.x.b.x0.m.a1
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.d0
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.g0$c
 *  k.b0.x.b.x0.m.g0$d
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.n
 *  k.b0.x.b.x0.m.n0
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.p1.d$a
 *  k.b0.x.b.x0.m.w0$a
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  k.s.r
 *  k.x.b.l
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.v;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.a0.m;
import k.b0.x.b.x0.j.w.o;
import k.b0.x.b.x0.j.y.a;
import k.b0.x.b.x0.m.a0;
import k.b0.x.b.x0.m.a1;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.d0;
import k.b0.x.b.x0.m.e1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.n;
import k.b0.x.b.x0.m.n0;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.u0;
import k.b0.x.b.x0.m.v0;
import k.b0.x.b.x0.m.w0;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.s.i;
import k.s.r;
import k.x.b.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g0 {
    public static final g0 a = new g0();

    public static final b a(g0 g02, y0 y02, k.b0.x.b.x0.m.p1.d d2, List list) {
        b b2;
        h h2 = y02.getDeclarationDescriptor();
        h h3 = h2 == null ? null : d2.f((k)h2);
        if (h3 == null) {
            return null;
        }
        if (h3 instanceof k.b0.x.b.x0.c.y0) {
            b2 = new b(g0.b((k.b0.x.b.x0.c.y0)h3, (List<? extends b1>)list), null);
        } else {
            y0 y03 = h3.getTypeConstructor().refine(d2);
            k.x.c.i.d((Object)y03, "descriptor.typeConstruct\u2026refine(kotlinTypeRefiner)");
            b2 = new b(null, y03);
        }
        return b2;
    }

    public static final m0 b(k.b0.x.b.x0.c.y0 y02, List<? extends b1> list) {
        k.x.c.i.e((Object)y02, "<this>");
        k.x.c.i.e(list, "arguments");
        u0 u02 = new u0((w0)w0.a.a, false);
        k.x.c.i.e((Object)y02, "typeAliasDescriptor");
        k.x.c.i.e(list, "arguments");
        List list2 = y02.getTypeConstructor().getParameters();
        k.x.c.i.d((Object)list2, "typeAliasDescriptor.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list2, (int)10));
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((z0)iterator.next()).getOriginal());
        }
        Map map = i.c0((Iterable)i.l0((Iterable)arrayList, list));
        v0 v02 = new v0(null, y02, list, map, null);
        Objects.requireNonNull((Object)k.b0.x.b.x0.c.i1.h.g);
        k.b0.x.b.x0.c.i1.h h2 = h.a.b;
        k.x.c.i.e(v02, "typeAliasExpansion");
        k.x.c.i.e((Object)h2, "annotations");
        return u02.c(v02, h2, false, 0, true);
    }

    public static final m1 c(m0 m02, m0 m03) {
        k.x.c.i.e((Object)m02, "lowerBound");
        k.x.c.i.e((Object)m03, "upperBound");
        if (k.x.c.i.a((Object)m02, (Object)m03)) {
            return m02;
        }
        return new a0(m02, m03);
    }

    public static final m0 d(k.b0.x.b.x0.c.i1.h h2, o o2, boolean bl) {
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e((Object)o2, "constructor");
        r r2 = r.k;
        k.b0.x.b.x0.j.a0.h h3 = y.c("Scope for integer literal type", true);
        k.x.c.i.d((Object)h3, "createErrorScope(\"Scope \u2026eger literal type\", true)");
        return g0.h(h2, (y0)o2, (List<? extends b1>)r2, bl, h3);
    }

    public static final m0 e(k.b0.x.b.x0.c.i1.h h2, e e2, List<? extends b1> list) {
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e((Object)e2, "descriptor");
        k.x.c.i.e(list, "arguments");
        y0 y02 = e2.getTypeConstructor();
        k.x.c.i.d((Object)y02, "descriptor.typeConstructor");
        return g0.g(h2, y02, list, false, null, 16);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final m0 f(k.b0.x.b.x0.c.i1.h h2, y0 y02, List<? extends b1> list, boolean bl, k.b0.x.b.x0.m.p1.d d2) {
        k.b0.x.b.x0.j.a0.h h3;
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e((Object)y02, "constructor");
        k.x.c.i.e(list, "arguments");
        if (h2.isEmpty() && list.isEmpty() && !bl && y02.getDeclarationDescriptor() != null) {
            h h4 = y02.getDeclarationDescriptor();
            k.x.c.i.c((Object)h4);
            m0 m02 = h4.getDefaultType();
            k.x.c.i.d((Object)m02, "constructor.declarationDescriptor!!.defaultType");
            return m02;
        }
        h h5 = y02.getDeclarationDescriptor();
        if (h5 instanceof z0) {
            h3 = ((z0)h5).getDefaultType().getMemberScope();
        } else if (h5 instanceof e) {
            if (d2 == null) {
                a.i(a.j((k)h5));
                d2 = d.a.a;
            }
            boolean bl2 = list.isEmpty();
            e e2 = (e)h5;
            if (bl2) {
                k.x.c.i.e((Object)e2, "<this>");
                k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
                Objects.requireNonNull((Object)v.Companion);
                k.x.c.i.e((Object)e2, "<this>");
                k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
                boolean bl3 = e2 instanceof v;
                v v2 = null;
                if (bl3) {
                    v2 = (v)e2;
                }
                if (v2 == null) {
                    h3 = e2.getUnsubstitutedMemberScope();
                    k.x.c.i.d((Object)h3, "this.unsubstitutedMemberScope");
                } else {
                    h3 = v2.getUnsubstitutedMemberScope(d2);
                }
            } else {
                e1 e12 = a1.b.b(y02, list);
                k.x.c.i.e((Object)e2, "<this>");
                k.x.c.i.e(e12, "typeSubstitution");
                k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
                Objects.requireNonNull((Object)v.Companion);
                k.x.c.i.e((Object)e2, "<this>");
                k.x.c.i.e(e12, "typeSubstitution");
                k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
                boolean bl4 = e2 instanceof v;
                v v3 = null;
                if (bl4) {
                    v3 = (v)e2;
                }
                if (v3 == null) {
                    h3 = e2.getMemberScope(e12);
                    k.x.c.i.d((Object)h3, "this.getMemberScope(\n   \u2026ubstitution\n            )");
                } else {
                    h3 = v3.getMemberScope(e12, d2);
                }
            }
        } else if (h5 instanceof k.b0.x.b.x0.c.y0) {
            h3 = y.c(k.x.c.i.k("Scope for abbreviation: ", ((k.b0.x.b.x0.c.y0)h5).getName()), true);
            k.x.c.i.d((Object)h3, "createErrorScope(\"Scope \u2026{descriptor.name}\", true)");
        } else {
            if (!(y02 instanceof d0)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported classifier: ");
                stringBuilder.append((Object)h5);
                stringBuilder.append(" for constructor: ");
                stringBuilder.append((Object)y02);
                throw new IllegalStateException(stringBuilder.toString());
            }
            h3 = m.a.a("member scope for intersection type", (Collection<? extends f0>)((d0)y02).b);
        }
        k.b0.x.b.x0.j.a0.h h6 = h3;
        return g0.i(h2, y02, list, bl, h6, (l<? super k.b0.x.b.x0.m.p1.d, ? extends m0>)new c(y02, list, h2, bl));
    }

    public static /* synthetic */ m0 g(k.b0.x.b.x0.c.i1.h h2, y0 y02, List list, boolean bl, k.b0.x.b.x0.m.p1.d d2, int n2) {
        n2 & 16;
        return g0.f(h2, y02, (List<? extends b1>)list, bl, null);
    }

    public static final m0 h(k.b0.x.b.x0.c.i1.h h2, y0 y02, List<? extends b1> list, boolean bl, k.b0.x.b.x0.j.a0.h h3) {
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e((Object)y02, "constructor");
        k.x.c.i.e(list, "arguments");
        k.x.c.i.e((Object)h3, "memberScope");
        d d2 = new d(y02, list, h2, bl, h3);
        n0 n02 = new n0(y02, list, bl, h3, (l)d2);
        if (h2.isEmpty()) {
            return n02;
        }
        return new n((m0)n02, h2);
    }

    public static final m0 i(k.b0.x.b.x0.c.i1.h h2, y0 y02, List<? extends b1> list, boolean bl, k.b0.x.b.x0.j.a0.h h3, l<? super k.b0.x.b.x0.m.p1.d, ? extends m0> l2) {
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e((Object)y02, "constructor");
        k.x.c.i.e(list, "arguments");
        k.x.c.i.e((Object)h3, "memberScope");
        k.x.c.i.e(l2, "refinedTypeFactory");
        n0 n02 = new n0(y02, list, bl, h3, l2);
        if (h2.isEmpty()) {
            return n02;
        }
        return new n((m0)n02, h2);
    }

    public static final class b {
        public final m0 a;
        public final y0 b;

        public b(m0 m02, y0 y02) {
            this.a = m02;
            this.b = y02;
        }
    }

}

