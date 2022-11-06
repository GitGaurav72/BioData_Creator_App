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
 *  java.util.List
 *  java.util.Map$Entry
 *  java.util.Set
 *  k.b0.f
 *  k.b0.k
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n0
 *  k.b0.x.b.x0.c.t0
 *  k.b0.x.b.x0.c.v
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.j.a0.e$b
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.j.a0.i
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  k.s.r
 *  k.x.b.a
 *  k.x.b.l
 *  k.x.c.k
 *  k.x.c.p
 *  k.x.c.q
 */
package k.b0.x.b.x0.j.a0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.b0.f;
import k.b0.k;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.j.a0.d;
import k.b0.x.b.x0.j.a0.e;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.j.a0.i;
import k.b0.x.b.x0.j.a0.j;
import k.b0.x.b.x0.j.l;
import k.b0.x.b.x0.j.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.y0;
import k.s.r;
import k.x.c.p;
import k.x.c.q;
import k.x.c.w;

public abstract class e
extends i {
    public static final /* synthetic */ k<Object>[] $$delegatedProperties;
    private final k.b0.x.b.x0.l.i allDescriptors$delegate;
    private final k.b0.x.b.x0.c.e containingClass;

    public static {
        k[] arrk = new k[]{w.c((p)new q((f)w.a(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
        $$delegatedProperties = arrk;
    }

    public e(k.b0.x.b.x0.l.m m2, k.b0.x.b.x0.c.e e2) {
        k.x.c.i.e(m2, "storageManager");
        k.x.c.i.e((Object)e2, "containingClass");
        this.containingClass = e2;
        this.allDescriptors$delegate = m2.d(new k.x.b.a<List<? extends k.b0.x.b.x0.c.k>>(){

            public Object invoke() {
                List<v> list = this.computeDeclaredFunctions();
                return k.s.i.M(list, (Iterable)this.createFakeOverrides((List<? extends v>)list));
            }
        });
    }

    private final List<k.b0.x.b.x0.c.k> createFakeOverrides(List<? extends v> list) {
        ArrayList arrayList = new ArrayList(3);
        Collection collection = this.containingClass.getTypeConstructor().getSupertypes();
        k.x.c.i.d((Object)collection, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            k.s.i.b((Collection)arrayList2, (Iterable)e.s.a.a.o1((j)((f0)iterator.next()).getMemberScope(), null, null, (int)3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object object : arrayList2) {
            if (!(object instanceof k.b0.x.b.x0.c.b)) continue;
            arrayList3.add(object);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object object : arrayList3) {
            k.b0.x.b.x0.g.e e2 = ((k.b0.x.b.x0.c.b)object).getName();
            Object object2 = linkedHashMap.get((Object)e2);
            if (object2 == null) {
                object2 = new ArrayList();
                linkedHashMap.put((Object)e2, object2);
            }
            ((List)object2).add(object);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            k.b0.x.b.x0.g.e e3 = (k.b0.x.b.x0.g.e)entry.getKey();
            List list2 = (List)entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object object : list2) {
                Boolean bl = (k.b0.x.b.x0.c.b)object instanceof v;
                Object object3 = linkedHashMap2.get((Object)bl);
                if (object3 == null) {
                    object3 = new ArrayList();
                    linkedHashMap2.put((Object)bl, object3);
                }
                ((List)object3).add(object);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                r r2;
                boolean bl = (Boolean)entry2.getKey();
                List list3 = (List)entry2.getValue();
                m m2 = m.b;
                if (bl) {
                    r2 = new ArrayList();
                    for (Object object : list) {
                        if (!k.x.c.i.a(((v)object).getName(), e3)) continue;
                        r2.add(object);
                    }
                } else {
                    r2 = r.k;
                }
                m2.h(e3, (Collection<? extends k.b0.x.b.x0.c.b>)list3, (Collection<? extends k.b0.x.b.x0.c.b>)r2, this.containingClass, (l)new b(arrayList, this));
            }
        }
        return e.s.a.a.V((ArrayList)arrayList);
    }

    private final List<k.b0.x.b.x0.c.k> getAllDescriptors() {
        return (List)e.s.a.a.T1((k.b0.x.b.x0.l.i)this.allDescriptors$delegate, $$delegatedProperties[0]);
    }

    public abstract List<v> computeDeclaredFunctions();

    public final k.b0.x.b.x0.c.e getContainingClass() {
        return this.containingClass;
    }

    public Collection<k.b0.x.b.x0.c.k> getContributedDescriptors(d d2, k.x.b.l<? super k.b0.x.b.x0.g.e, Boolean> l2) {
        k.x.c.i.e(d2, "kindFilter");
        k.x.c.i.e(l2, "nameFilter");
        if (!d2.a(d.n.u)) {
            return r.k;
        }
        return this.getAllDescriptors();
    }

    public Collection<t0> getContributedFunctions(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        List<k.b0.x.b.x0.c.k> list = this.getAllDescriptors();
        k.b0.x.b.x0.o.h<E> h2 = new k.b0.x.b.x0.o.h<E>();
        for (Object object : list) {
            if (!(object instanceof t0) || !k.x.c.i.a(((t0)object).getName(), e2)) continue;
            h2.add(object);
        }
        return h2;
    }

    public Collection<n0> getContributedVariables(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        List<k.b0.x.b.x0.c.k> list = this.getAllDescriptors();
        k.b0.x.b.x0.o.h<E> h2 = new k.b0.x.b.x0.o.h<E>();
        for (Object object : list) {
            if (!(object instanceof n0) || !k.x.c.i.a(((n0)object).getName(), e2)) continue;
            h2.add(object);
        }
        return h2;
    }

}

