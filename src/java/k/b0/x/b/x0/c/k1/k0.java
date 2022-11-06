/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.j0
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.j.a0.c$b
 *  k.b0.x.b.x0.j.a0.i
 *  k.s.r
 *  k.s.t
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.k1;

import e.s.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.j0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.a0.c;
import k.b0.x.b.x0.j.a0.d;
import k.b0.x.b.x0.j.a0.i;
import k.s.r;
import k.s.t;
import k.x.b.l;

public class k0
extends i {
    public final d0 b;
    public final c c;

    public k0(d0 d02, c c2) {
        k.x.c.i.e((Object)d02, "moduleDescriptor");
        k.x.c.i.e(c2, "fqName");
        this.b = d02;
        this.c = c2;
    }

    public Set<e> getClassifierNames() {
        return t.k;
    }

    public Collection<k> getContributedDescriptors(d d2, l<? super e, Boolean> l2) {
        k.x.c.i.e(d2, "kindFilter");
        k.x.c.i.e(l2, "nameFilter");
        if (!d2.a(d.f)) {
            return r.k;
        }
        if (this.c.d() && d2.t.contains((Object)c.b.a)) {
            return r.k;
        }
        Collection collection = this.b.getSubPackagesOf(this.c, l2);
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            j0 j02;
            e e2 = ((c)iterator.next()).g();
            k.x.c.i.d(e2, "subFqName.shortName()");
            if (!((Boolean)l2.invoke((Object)e2)).booleanValue()) continue;
            k.x.c.i.e(e2, "name");
            if (e2.l) {
                j02 = null;
            } else {
                d0 d02 = this.b;
                c c2 = this.c.c(e2);
                k.x.c.i.d(c2, "fqName.child(name)");
                j0 j03 = d02.r(c2);
                j02 = j03.isEmpty() ? null : j03;
            }
            a.n((Collection)arrayList, j02);
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"subpackages of ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(" from ");
        stringBuilder.append((Object)this.b);
        return stringBuilder.toString();
    }
}

