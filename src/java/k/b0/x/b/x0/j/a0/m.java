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
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n0
 *  k.b0.x.b.x0.c.t0
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.j.a0.a
 *  k.b0.x.b.x0.j.a0.b
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.f0
 *  k.s.i
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.j.a0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.f0;
import k.x.b.l;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m
extends k.b0.x.b.x0.j.a0.a {
    public static final /* synthetic */ int b;
    public final h c;

    public m(String string, h h2, DefaultConstructorMarker defaultConstructorMarker) {
        this.c = h2;
    }

    public h b() {
        return this.c;
    }

    public Collection<k> getContributedDescriptors(k.b0.x.b.x0.j.a0.d d2, l<? super e, Boolean> l2) {
        i.e(d2, "kindFilter");
        i.e(l2, "nameFilter");
        Collection collection = super.getContributedDescriptors(d2, l2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object object : collection) {
            if ((k)object instanceof k.b0.x.b.x0.c.a) {
                arrayList.add(object);
                continue;
            }
            arrayList2.add(object);
        }
        List list = (List)arrayList;
        List list2 = (List)arrayList2;
        return k.s.i.M((Collection)e.s.a.a.G3((Collection)list, (l)b.k), (Iterable)list2);
    }

    public Collection<t0> getContributedFunctions(e e2, k.b0.x.b.x0.d.a.b b2) {
        i.e(e2, "name");
        i.e((Object)b2, "location");
        return e.s.a.a.G3((Collection)super.getContributedFunctions(e2, b2), (l)c.k);
    }

    public Collection<n0> getContributedVariables(e e2, k.b0.x.b.x0.d.a.b b2) {
        i.e(e2, "name");
        i.e((Object)b2, "location");
        return e.s.a.a.G3((Collection)super.getContributedVariables(e2, b2), (l)d.k);
    }

}

