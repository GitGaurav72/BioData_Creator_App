/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.d.a.d
 *  k.b0.x.b.x0.e.a.o0.m.a
 *  k.b0.x.b.x0.e.a.o0.m.q
 *  k.b0.x.b.x0.e.a.o0.m.r
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.m.p1.j
 *  k.s.i
 *  k.s.t
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.StandardNames
 *  kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
 */
package k.b0.x.b.x0.e.a.o0.m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.e.a.o0.d;
import k.b0.x.b.x0.e.a.o0.h;
import k.b0.x.b.x0.e.a.o0.m.e;
import k.b0.x.b.x0.e.a.o0.m.k;
import k.b0.x.b.x0.e.a.o0.m.n;
import k.b0.x.b.x0.e.a.o0.m.o;
import k.b0.x.b.x0.e.a.o0.m.q;
import k.b0.x.b.x0.e.a.o0.m.r;
import k.b0.x.b.x0.e.a.o0.m.s;
import k.b0.x.b.x0.e.a.q0.g;
import k.b0.x.b.x0.j.m;
import k.b0.x.b.x0.m.p1.j;
import k.b0.x.b.x0.o.c;
import k.s.i;
import k.s.t;
import k.x.b.l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;

public final class o
extends s {
    public final g n;
    public final e o;

    public o(h h2, g g2, e e2) {
        k.x.c.i.e(h2, "c");
        k.x.c.i.e(g2, "jClass");
        k.x.c.i.e(e2, "ownerDescriptor");
        super(h2);
        this.n = g2;
        this.o = e2;
    }

    @Override
    public Set<k.b0.x.b.x0.g.e> a(k.b0.x.b.x0.j.a0.d d2, l<? super k.b0.x.b.x0.g.e, Boolean> l2) {
        k.x.c.i.e(d2, "kindFilter");
        return t.k;
    }

    @Override
    public Set<k.b0.x.b.x0.g.e> b(k.b0.x.b.x0.j.a0.d d2, l<? super k.b0.x.b.x0.g.e, Boolean> l2) {
        k.x.c.i.e(d2, "kindFilter");
        Set set = i.i0(((k.b0.x.b.x0.e.a.o0.m.b)this.f.invoke()).a());
        o o2 = e.s.a.a.O1((k.b0.x.b.x0.c.e)this.o);
        t t2 = o2 == null ? null : o2.getFunctionNames();
        if (t2 == null) {
            t2 = t.k;
        }
        set.addAll((Collection)t2);
        if (this.n.x()) {
            Object[] arrobject = new k.b0.x.b.x0.g.e[]{StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES};
            set.addAll((Collection)i.E((Object[])arrobject));
        }
        set.addAll((Collection)this.c.a.x.getStaticFunctionNames((k.b0.x.b.x0.c.e)this.o));
        return set;
    }

    @Override
    public void c(Collection<t0> collection, k.b0.x.b.x0.g.e e2) {
        k.x.c.i.e(collection, "result");
        k.x.c.i.e(e2, "name");
        this.c.a.x.generateStaticFunctions((k.b0.x.b.x0.c.e)this.o, e2, collection);
    }

    @Override
    public k.b0.x.b.x0.e.a.o0.m.b d() {
        return new k.b0.x.b.x0.e.a.o0.m.a(this.n, (l)n.k);
    }

    @Override
    public void f(Collection<t0> collection, k.b0.x.b.x0.g.e e2) {
        block2 : {
            String string;
            t0 t02;
            block4 : {
                block3 : {
                    k.x.c.i.e(collection, "result");
                    k.x.c.i.e(e2, "name");
                    o o2 = e.s.a.a.O1((k.b0.x.b.x0.c.e)this.o);
                    Object object = o2 == null ? t.k : i.j0(o2.getContributedFunctions(e2, (k.b0.x.b.x0.d.a.b)k.b0.x.b.x0.d.a.d.y));
                    t t2 = object;
                    e e3 = this.o;
                    d d2 = this.c.a;
                    Collection collection2 = e.s.a.a.z3((k.b0.x.b.x0.g.e)e2, (Collection)t2, collection, (k.b0.x.b.x0.c.e)e3, (k.b0.x.b.x0.k.b.q)d2.f, (m)d2.u.a());
                    k.x.c.i.d((Object)collection2, "resolveOverridesForStati\u2026.overridingUtil\n        )");
                    collection.addAll(collection2);
                    if (!this.n.x()) break block2;
                    if (!k.x.c.i.a(e2, StandardNames.ENUM_VALUE_OF)) break block3;
                    t02 = e.s.a.a.x0((k.b0.x.b.x0.c.e)this.o);
                    string = "createEnumValueOfMethod(ownerDescriptor)";
                    break block4;
                }
                if (!k.x.c.i.a(e2, StandardNames.ENUM_VALUES)) break block2;
                t02 = e.s.a.a.y0((k.b0.x.b.x0.c.e)this.o);
                string = "createEnumValuesMethod(ownerDescriptor)";
            }
            k.x.c.i.d(t02, string);
            collection.add((Object)t02);
        }
    }

    @Override
    public void g(k.b0.x.b.x0.g.e e2, Collection<n0> collection) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e(collection, "result");
        e e3 = this.o;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        l<k.b0.x.b.x0.j.a0.h, Collection<? extends n0>> l2 = new l<k.b0.x.b.x0.j.a0.h, Collection<? extends n0>>(e2){
            public final /* synthetic */ k.b0.x.b.x0.g.e k;
            {
                this.k = e2;
                super(1);
            }

            public Object invoke(Object object) {
                k.b0.x.b.x0.j.a0.h h2 = (k.b0.x.b.x0.j.a0.h)object;
                k.x.c.i.e((Object)h2, "it");
                return h2.getContributedVariables(this.k, (k.b0.x.b.x0.d.a.b)k.b0.x.b.x0.d.a.d.y);
            }
        };
        e.s.a.a.L0((Collection)e.s.a.a.N2((Object)e3), (c)q.a, (k.b0.x.b.x0.o.d)new r((k.b0.x.b.x0.c.e)e3, (Set)linkedHashSet, (l)l2));
        if (true ^ collection.isEmpty()) {
            e e4 = this.o;
            d d2 = this.c.a;
            Collection collection2 = e.s.a.a.z3((k.b0.x.b.x0.g.e)e2, (Collection)linkedHashSet, collection, (k.b0.x.b.x0.c.e)e4, (k.b0.x.b.x0.k.b.q)d2.f, (m)d2.u.a());
            k.x.c.i.d((Object)collection2, "resolveOverridesForStati\u2026ingUtil\n                )");
            collection.addAll(collection2);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object object : linkedHashSet) {
            n0 n02 = this.o((n0)object);
            Object object2 = linkedHashMap.get((Object)n02);
            if (object2 == null) {
                object2 = new ArrayList();
                linkedHashMap.put((Object)n02, object2);
            }
            ((List)object2).add(object);
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Collection collection3 = (Collection)((Map.Entry)iterator.next()).getValue();
            e e5 = this.o;
            d d3 = this.c.a;
            Collection collection4 = e.s.a.a.z3((k.b0.x.b.x0.g.e)e2, (Collection)collection3, collection, (k.b0.x.b.x0.c.e)e5, (k.b0.x.b.x0.k.b.q)d3.f, (m)d3.u.a());
            k.x.c.i.d((Object)collection4, "resolveOverridesForStati\u2026ingUtil\n                )");
            i.b((Collection)arrayList, (Iterable)collection4);
        }
        collection.addAll((Collection)arrayList);
    }

    public k.b0.x.b.x0.c.h getContributedClassifier(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        return null;
    }

    @Override
    public Set<k.b0.x.b.x0.g.e> h(k.b0.x.b.x0.j.a0.d d2, l<? super k.b0.x.b.x0.g.e, Boolean> l2) {
        k.x.c.i.e(d2, "kindFilter");
        Set set = i.i0(((k.b0.x.b.x0.e.a.o0.m.b)this.f.invoke()).e());
        e e2 = this.o;
        b b2 = b.k;
        e.s.a.a.L0((Collection)e.s.a.a.N2((Object)e2), (c)q.a, (k.b0.x.b.x0.o.d)new r((k.b0.x.b.x0.c.e)e2, set, (l)b2));
        return set;
    }

    @Override
    public k.b0.x.b.x0.c.k j() {
        return this.o;
    }

    public final n0 o(n0 n02) {
        if (n02.getKind().b()) {
            return n02;
        }
        Collection<? extends n0> collection = n02.getOverriddenDescriptors();
        k.x.c.i.d(collection, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(e.s.a.a.U(collection, (int)10));
        for (n0 n03 : collection) {
            k.x.c.i.d(n03, "it");
            arrayList.add((Object)this.o(n03));
        }
        return (n0)i.T((List)i.k((Iterable)arrayList));
    }
}

