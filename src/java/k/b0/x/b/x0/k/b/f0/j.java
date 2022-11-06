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
 *  java.util.List
 *  java.util.Set
 *  k.b0.x.b.x0.c.j1.b
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.d.a.c
 *  k.b0.x.b.x0.d.a.d
 *  k.b0.x.b.x0.k.b.f0.g
 *  k.s.i
 *  k.s.t
 *  k.x.b.a
 *  k.x.b.l
 */
package k.b0.x.b.x0.k.b.f0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k.b0.x.b.x0.c.f0;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.j1.b;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.f.n;
import k.b0.x.b.x0.f.r;
import k.b0.x.b.x0.f.t;
import k.b0.x.b.x0.f.w;
import k.b0.x.b.x0.f.z.f;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.a0.d;
import k.b0.x.b.x0.k.b.f0.g;
import k.b0.x.b.x0.k.b.f0.i;
import k.b0.x.b.x0.k.b.l;
import k.x.b.a;

public class j
extends i {
    public final f0 g;
    public final String h;
    public final c i;

    public j(f0 f02, k.b0.x.b.x0.f.l l2, k.b0.x.b.x0.f.z.c c2, k.b0.x.b.x0.f.z.a a2, g g2, k.b0.x.b.x0.k.b.j j2, String string, a<? extends Collection<e>> a3) {
        k.x.c.i.e(f02, "packageDescriptor");
        k.x.c.i.e((Object)l2, "proto");
        k.x.c.i.e(c2, "nameResolver");
        k.x.c.i.e(a2, "metadataVersion");
        k.x.c.i.e(j2, "components");
        k.x.c.i.e(string, "debugName");
        k.x.c.i.e(a3, "classNames");
        t t2 = l2.s;
        k.x.c.i.d(t2, "proto.typeTable");
        k.b0.x.b.x0.f.z.e e2 = new k.b0.x.b.x0.f.z.e(t2);
        f.a a4 = f.a;
        w w2 = l2.t;
        k.x.c.i.d(w2, "proto.versionRequirementTable");
        l l3 = j2.a(f02, c2, e2, a4.a(w2), a2, g2);
        List<k.b0.x.b.x0.f.i> list = l2.p;
        k.x.c.i.d(list, "proto.functionList");
        List<n> list2 = l2.q;
        k.x.c.i.d(list2, "proto.propertyList");
        List<r> list3 = l2.r;
        k.x.c.i.d(list3, "proto.typeAliasList");
        super(l3, list, list2, list3, a3);
        this.g = f02;
        this.h = string;
        this.i = f02.getFqName();
    }

    @Override
    public void a(Collection<k> collection, k.x.b.l<? super e, Boolean> l2) {
        k.x.c.i.e(collection, "result");
        k.x.c.i.e(l2, "nameFilter");
    }

    @Override
    public k.b0.x.b.x0.g.b e(e e2) {
        k.x.c.i.e(e2, "name");
        return new k.b0.x.b.x0.g.b(this.i, e2);
    }

    @Override
    public Set<e> g() {
        return k.s.t.k;
    }

    @Override
    public h getContributedClassifier(e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        this.recordLookup(e2, b2);
        return super.getContributedClassifier(e2, b2);
    }

    public Collection getContributedDescriptors(d d2, k.x.b.l l2) {
        k.x.c.i.e(d2, "kindFilter");
        k.x.c.i.e((Object)l2, "nameFilter");
        Collection<k> collection = this.b(d2, (k.x.b.l<? super e, Boolean>)l2, (k.b0.x.b.x0.d.a.b)k.b0.x.b.x0.d.a.d.w);
        Iterable<b> iterable = this.c.a.k;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            k.s.i.b((Collection)arrayList, (Iterable)((b)iterator.next()).getAllContributedClassesIfPossible(this.i));
        }
        return k.s.i.M(collection, (Iterable)arrayList);
    }

    @Override
    public Set<e> h() {
        return k.s.t.k;
    }

    @Override
    public Set<e> i() {
        return k.s.t.k;
    }

    @Override
    public boolean j(e e2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e(e2, "name");
        boolean bl = this.f().contains((Object)e2);
        boolean bl2 = true;
        if (!bl) {
            boolean bl3;
            Iterable<b> iterable = this.c.a.k;
            if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    if (!((b)iterator.next()).shouldCreateClass(this.i, e2)) continue;
                    bl3 = bl2;
                    break;
                }
            } else {
                bl3 = false;
            }
            if (bl3) {
                return bl2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void recordLookup(e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        e.s.a.a.h3((k.b0.x.b.x0.d.a.c)this.c.a.i, (k.b0.x.b.x0.d.a.b)b2, (f0)this.g, (e)e2);
    }

    public String toString() {
        return this.h;
    }
}

