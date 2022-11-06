/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.AssertionError
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.i1.c
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.y0
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.j.a0.h$b
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.d1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.s1.a
 *  k.b0.x.b.x0.m.s1.b
 *  k.b0.x.b.x0.m.w
 *  k.b0.x.b.x0.m.y0
 *  k.b0.x.b.x0.m.z
 *  k.s.i
 *  k.x.b.l
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.d1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.h1;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.p0;
import k.b0.x.b.x0.m.s1.b;
import k.b0.x.b.x0.m.v0;
import k.b0.x.b.x0.m.w;
import k.b0.x.b.x0.m.w0;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.b0.x.b.x0.m.z;
import k.x.b.l;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class u0 {
    public static final a a = new a(null);
    public final w0 b;
    public final boolean c;

    public u0(w0 w02, boolean bl) {
        i.e(w02, "reportStrategy");
        this.b = w02;
        this.c = bl;
    }

    public final void a(k.b0.x.b.x0.c.i1.h h2, k.b0.x.b.x0.c.i1.h h3) {
        HashSet hashSet = new HashSet();
        Iterator iterator = h2.iterator();
        while (iterator.hasNext()) {
            hashSet.add((Object)((k.b0.x.b.x0.c.i1.c)iterator.next()).getFqName());
        }
        for (k.b0.x.b.x0.c.i1.c c2 : h3) {
            if (!hashSet.contains((Object)c2.getFqName())) continue;
            this.b.a(c2);
        }
    }

    public final m0 b(m0 m02, k.b0.x.b.x0.c.i1.h h2) {
        if (e.s.a.a.s2((f0)m02)) {
            return m02;
        }
        boolean bl = e.s.a.a.s2((f0)m02);
        k.b0.x.b.x0.c.i1.h h3 = m02.getAnnotations();
        if (!bl) {
            h3 = e.s.a.a.X((k.b0.x.b.x0.c.i1.h)h2, (k.b0.x.b.x0.c.i1.h)h3);
        }
        return e.s.a.a.o3((m0)m02, null, (k.b0.x.b.x0.c.i1.h)h3, (int)1);
    }

    public final m0 c(v0 v02, k.b0.x.b.x0.c.i1.h h2, boolean bl, int n2, boolean bl2) {
        b1 b12 = this.d((b1)new d1(n1.k, (f0)v02.b.C()), v02, null, n2);
        f0 f02 = b12.b();
        i.d((Object)f02, "expandedProjection.type");
        m0 m02 = e.s.a.a.x((f0)f02);
        if (e.s.a.a.s2((f0)m02)) {
            return m02;
        }
        b12.a();
        this.a(m02.getAnnotations(), h2);
        m0 m03 = j1.m(this.b(m02, h2), bl);
        i.d((Object)m03, "expandedType.combineAnno\u2026fNeeded(it, isNullable) }");
        if (bl2) {
            y0 y02 = v02.b.getTypeConstructor();
            i.d((Object)y02, "descriptor.typeConstructor");
            m03 = p0.e(m03, g0.h(h2, y02, v02.c, bl, (k.b0.x.b.x0.j.a0.h)h.b.b));
        }
        return m03;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final b1 d(b1 b12, v0 v02, z0 z02, int n2) {
        m0 m02;
        n1 n12;
        m1 m12;
        f0 f02;
        block29 : {
            n1 n13;
            block28 : {
                b1 b13;
                block27 : {
                    block26 : {
                        n12 = n1.k;
                        k.b0.x.b.x0.c.y0 y02 = v02.b;
                        if (n2 > 100) throw new AssertionError((Object)i.k("Too deep recursion while expanding type alias ", y02.getName()));
                        if (b12.c()) break block26;
                        f02 = b12.b();
                        i.d((Object)f02, "underlyingProjection.type");
                        y0 y03 = f02.T();
                        i.e((Object)y03, "constructor");
                        h h2 = y03.getDeclarationDescriptor();
                        b13 = h2 instanceof z0 ? (b1)v02.d.get((Object)h2) : null;
                        if (b13 == null) {
                            m1 m13 = b12.b().W();
                            if (e.s.a.a.p2((f0)m13)) {
                                return b12;
                            }
                            m0 m03 = e.s.a.a.x((f0)m13);
                            if (e.s.a.a.s2((f0)m03)) return b12;
                            i.e((Object)m03, "<this>");
                            if (!e.s.a.a.f0((f0)m03, (l)b.k)) {
                                return b12;
                            }
                            y0 y04 = m03.T();
                            h h3 = y04.getDeclarationDescriptor();
                            y04.getParameters().size();
                            m03.S().size();
                            if (h3 instanceof z0) {
                                return b12;
                            }
                            boolean bl = h3 instanceof k.b0.x.b.x0.c.y0;
                            int n3 = 0;
                            if (bl) {
                                k.b0.x.b.x0.c.y0 y05 = (k.b0.x.b.x0.c.y0)h3;
                                if (v02.a(y05)) {
                                    this.b.d(y05);
                                    return new d1(n12, (f0)y.d(i.k("Recursive type alias: ", y05.getName())));
                                }
                                List list = m03.S();
                                ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
                                for (Object object : list) {
                                    int n4 = n3 + 1;
                                    if (n3 < 0) {
                                        k.s.i.X();
                                        throw null;
                                    }
                                    arrayList.add((Object)this.d((b1)object, v02, (z0)y04.getParameters().get(n3), n2 + 1));
                                    n3 = n4;
                                }
                                i.e((Object)y05, "typeAliasDescriptor");
                                i.e((Object)arrayList, "arguments");
                                List list2 = y05.getTypeConstructor().getParameters();
                                i.d((Object)list2, "typeAliasDescriptor.typeConstructor.parameters");
                                ArrayList arrayList2 = new ArrayList(e.s.a.a.U((Iterable)list2, (int)10));
                                Iterator iterator = list2.iterator();
                                while (iterator.hasNext()) {
                                    arrayList2.add((Object)((z0)iterator.next()).getOriginal());
                                }
                                Map map = k.s.i.c0((Iterable)k.s.i.l0((Iterable)arrayList2, (Iterable)arrayList));
                                v0 v03 = new v0(v02, y05, (List)arrayList, map, null);
                                m0 m04 = this.c(v03, m03.getAnnotations(), m03.U(), n2 + 1, false);
                                m0 m05 = this.e(m03, v02, n2);
                                if (e.s.a.a.p2((f0)m04)) {
                                    return new d1(b12.a(), (f0)m04);
                                }
                                m04 = p0.e(m04, m05);
                                return new d1(b12.a(), (f0)m04);
                            }
                            m0 m06 = this.e(m03, v02, n2);
                            h1 h12 = h1.d((f0)m06);
                            i.d(h12, "create(substitutedType)");
                            Iterator iterator = m06.S().iterator();
                            while (iterator.hasNext()) {
                                Object object = iterator.next();
                                int n5 = n3 + 1;
                                if (n3 < 0) {
                                    k.s.i.X();
                                    throw null;
                                }
                                b1 b14 = (b1)object;
                                if (!b14.c()) {
                                    f0 f03 = b14.b();
                                    i.d((Object)f03, "substitutedArgument.type");
                                    i.e((Object)f03, "<this>");
                                    if (!e.s.a.a.f0((f0)f03, (l)k.b0.x.b.x0.m.s1.a.k)) {
                                        b1 b15 = (b1)m03.S().get(n3);
                                        z0 z03 = (z0)m03.T().getParameters().get(n3);
                                        if (this.c) {
                                            w0 w02 = this.b;
                                            f0 f04 = b15.b();
                                            i.d((Object)f04, "unsubstitutedArgument.type");
                                            f0 f05 = b14.b();
                                            i.d((Object)f05, "substitutedArgument.type");
                                            i.d((Object)z03, "typeParameter");
                                            w02.c(h12, f04, f05, z03);
                                        }
                                    }
                                }
                                n3 = n5;
                            }
                            return new d1(b12.a(), (f0)m06);
                        }
                        if (!b13.c()) break block27;
                    }
                    i.c((Object)z02);
                    b1 b16 = j1.n(z02);
                    i.d((Object)b16, "makeStarProjection(typeParameterDescriptor!!)");
                    return b16;
                }
                m12 = b13.b().W();
                n13 = b13.a();
                i.d((Object)n13, "argument.projectionKind");
                n1 n14 = b12.a();
                i.d((Object)n14, "underlyingProjection.projectionKind");
                if (n14 != n13 && n14 != n12) {
                    if (n13 == n12) {
                        n13 = n14;
                    } else {
                        this.b.b(v02.b, z02, (f0)m12);
                    }
                }
                n1 n15 = z02 == null ? n12 : z02.d();
                i.d((Object)n15, "typeParameterDescriptor?\u2026nce ?: Variance.INVARIANT");
                if (n15 == n13 || n15 == n12) break block28;
                if (n13 == n12) break block29;
                this.b.b(v02.b, z02, (f0)m12);
            }
            n12 = n13;
        }
        this.a(f02.getAnnotations(), m12.getAnnotations());
        if (!(m12 instanceof w)) {
            m0 m07 = j1.m(e.s.a.a.x((f0)m12), f02.U());
            i.d((Object)m07, "makeNullableIfNeeded(thi\u2026romType.isMarkedNullable)");
            m02 = this.b(m07, f02.getAnnotations());
            return new d1(n12, (f0)m02);
        }
        w w2 = (w)m12;
        k.b0.x.b.x0.c.i1.h h4 = f02.getAnnotations();
        boolean bl = e.s.a.a.s2((f0)w2);
        k.b0.x.b.x0.c.i1.h h5 = w2.getAnnotations();
        if (!bl) {
            h5 = e.s.a.a.X((k.b0.x.b.x0.c.i1.h)h4, (k.b0.x.b.x0.c.i1.h)h5);
        }
        i.e((Object)h5, "newAnnotations");
        m02 = new w(e.s.a.a.k1((f0)w2.m), h5);
        return new d1(n12, (f0)m02);
    }

    public final m0 e(m0 m02, v0 v02, int n2) {
        y0 y02 = m02.T();
        List list = m02.S();
        ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
        Iterator iterator = list.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            Object object = iterator.next();
            int n4 = n3 + 1;
            if (n3 >= 0) {
                b1 b12 = (b1)object;
                b1 b13 = this.d(b12, v02, (z0)y02.getParameters().get(n3), n2 + 1);
                if (!b13.c()) {
                    b13 = new d1(b13.a(), j1.l(b13.b(), b12.b().U()));
                }
                arrayList.add((Object)b13);
                n3 = n4;
                continue;
            }
            k.s.i.X();
            throw null;
        }
        return e.s.a.a.o3((m0)m02, (List)arrayList, null, (int)2);
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

}

