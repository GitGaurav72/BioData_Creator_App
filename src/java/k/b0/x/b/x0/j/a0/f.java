/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.i
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.y0
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.j.a0.i
 *  k.s.r
 *  k.x.b.l
 */
package k.b0.x.b.x0.j.a0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.y0;
import k.b0.x.b.x0.d.a.b;
import k.b0.x.b.x0.j.a0.c;
import k.b0.x.b.x0.j.a0.d;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.j.a0.i;
import k.s.r;
import k.x.b.l;

public final class f
extends i {
    public final h b;

    public f(h h2) {
        k.x.c.i.e((Object)h2, "workerScope");
        this.b = h2;
    }

    public Set<k.b0.x.b.x0.g.e> getClassifierNames() {
        return this.b.getClassifierNames();
    }

    public k.b0.x.b.x0.c.h getContributedClassifier(k.b0.x.b.x0.g.e e2, b b2) {
        e e3;
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        k.b0.x.b.x0.c.h h2 = this.b.getContributedClassifier(e2, b2);
        if (h2 == null) {
            return null;
        }
        e e4 = h2 instanceof e ? (e)h2 : null;
        if (e4 == null) {
            boolean bl = h2 instanceof y0;
            e3 = null;
            if (bl) {
                return (y0)h2;
            }
        } else {
            e3 = e4;
        }
        return e3;
    }

    public Collection getContributedDescriptors(d d2, l l2) {
        k.x.c.i.e(d2, "kindFilter");
        k.x.c.i.e((Object)l2, "nameFilter");
        int n2 = d.j & d2.u;
        d d3 = n2 == 0 ? null : new d(n2, d2.t);
        if (d3 == null) {
            return r.k;
        }
        Collection<k> collection = this.b.getContributedDescriptors(d3, (l<? super k.b0.x.b.x0.g.e, Boolean>)l2);
        ArrayList arrayList = new ArrayList();
        for (Object object : collection) {
            if (!(object instanceof k.b0.x.b.x0.c.i)) continue;
            arrayList.add(object);
        }
        return arrayList;
    }

    public Set<k.b0.x.b.x0.g.e> getFunctionNames() {
        return this.b.getFunctionNames();
    }

    public Set<k.b0.x.b.x0.g.e> getVariableNames() {
        return this.b.getVariableNames();
    }

    public void recordLookup(k.b0.x.b.x0.g.e e2, b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        this.b.recordLookup(e2, b2);
    }

    public String toString() {
        return k.x.c.i.k("Classes from ", (Object)this.b);
    }
}

