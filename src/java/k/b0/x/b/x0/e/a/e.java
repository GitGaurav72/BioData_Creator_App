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
 *  java.util.EnumSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Objects
 *  k.b0.x.b.x0.c.i1.n
 *  k.b0.x.b.x0.e.a.a
 *  k.b0.x.b.x0.e.a.c
 *  k.b0.x.b.x0.e.a.m0.d
 *  k.b0.x.b.x0.j.w.k
 *  k.s.t
 *  k.x.b.p
 *  k.x.c.k
 */
package k.b0.x.b.x0.e.a;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import k.b0.x.b.x0.c.i1.n;
import k.b0.x.b.x0.e.a.a;
import k.b0.x.b.x0.e.a.c;
import k.b0.x.b.x0.e.a.m0.d;
import k.b0.x.b.x0.j.w.k;
import k.s.t;
import k.x.b.p;
import k.x.c.i;

public final class e
extends k.x.c.k
implements p<k, a, Boolean> {
    public final /* synthetic */ c k;

    public e(c c2) {
        this.k = c2;
        super(2);
    }

    public Object invoke(Object object, Object object2) {
        k k2 = (k)object;
        a a2 = (a)object2;
        i.e((Object)k2, "$this$mapConstantToQualifierApplicabilityTypes");
        i.e((Object)a2, "it");
        c c2 = this.k;
        String string = a2.r;
        Objects.requireNonNull((Object)c2);
        EnumSet enumSet = (EnumSet)d.b.get((Object)string);
        if (enumSet == null) {
            enumSet = t.k;
        }
        ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)enumSet, (int)10));
        Iterator iterator = enumSet.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((n)iterator.next()).name());
        }
        return arrayList.contains((Object)k2.c.h());
    }
}

