/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  k.b0.x.b.x0.m.a
 *  k.b0.x.b.x0.m.d0
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.r
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.b0.x.b.x0.m.a;
import k.b0.x.b.x0.m.d0;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.r;
import k.b0.x.b.x0.m.y0;
import k.x.c.i;

public final class p0 {
    public static final m1 a(m1 m12, boolean bl) {
        i.e((Object)m12, "<this>");
        r r2 = r.l.a(m12, bl);
        if (r2 == null && (r2 = p0.c((f0)m12)) == null) {
            r2 = m12.X(false);
        }
        return r2;
    }

    public static /* synthetic */ m1 b(m1 m12, boolean bl, int n2) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        return p0.a(m12, bl);
    }

    public static final m0 c(f0 f02) {
        d0 d02;
        y0 y02 = f02.T();
        d0 d03 = y02 instanceof d0 ? (d0)y02 : null;
        if (d03 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = d03.b;
        ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)linkedHashSet, (int)10));
        Iterator iterator = linkedHashSet.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            f0 f03 = (f0)iterator.next();
            if (j1.h(f03)) {
                f03 = p0.b(f03.W(), false, 1);
                bl = true;
            }
            arrayList.add((Object)f03);
        }
        if (!bl) {
            d02 = null;
        } else {
            f0 f04 = d03.a;
            if (f04 == null) {
                f04 = null;
            } else if (j1.h(f04)) {
                f04 = p0.b(f04.W(), false, 1);
            }
            i.e((Object)arrayList, "typesToIntersect");
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet((Collection)arrayList);
            linkedHashSet2.hashCode();
            d02 = new d0((Collection)linkedHashSet2);
            d02.a = f04;
        }
        if (d02 == null) {
            return null;
        }
        return d02.b();
    }

    public static final m0 d(m0 m02, boolean bl) {
        i.e((Object)m02, "<this>");
        r r2 = r.l.a((m1)m02, bl);
        if (r2 == null && (r2 = p0.c((f0)m02)) == null) {
            r2 = m02.a0(false);
        }
        return r2;
    }

    public static final m0 e(m0 m02, m0 m03) {
        i.e((Object)m02, "<this>");
        i.e((Object)m03, "abbreviatedType");
        if (e.s.a.a.s2((f0)m02)) {
            return m02;
        }
        return new a(m02, m03);
    }
}

