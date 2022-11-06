/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayDeque
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Set
 *  k.b0.x.b.x0.m.r1.j
 *  k.b0.x.b.x0.m.r1.o
 *  k.b0.x.b.x0.m.x0$a$c
 *  k.s.i
 */
package k.b0.x.b.x0.m;

import e.e.a.a.a;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.r1.j;
import k.b0.x.b.x0.m.r1.m;
import k.b0.x.b.x0.m.r1.o;
import k.b0.x.b.x0.m.x0;

public final class c {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean a(x0 x02, j j2, x0.a a2) {
        k.x.c.i.e(x02, "<this>");
        k.x.c.i.e((Object)j2, "type");
        k.x.c.i.e(a2, "supertypesPolicy");
        o o2 = x02.d;
        if (o2.l0(j2)) {
            if (!o2.Q(j2)) return true;
        }
        if (o2.y((i)j2)) {
            return true;
        }
        boolean bl = false;
        if (bl) return true;
        x02.c();
        ArrayDeque<j> arrayDeque = x02.i;
        k.x.c.i.c(arrayDeque);
        Set<j> set = x02.j;
        k.x.c.i.c(set);
        arrayDeque.push((Object)j2);
        while (true ^ arrayDeque.isEmpty()) {
            if (set.size() <= 1000) {
                j j3 = (j)arrayDeque.pop();
                k.x.c.i.d((Object)j3, "current");
                if (!set.add((Object)j3)) continue;
                Object object = o2.Q(j3) ? x0.a.c.a : a2;
                if (!(true ^ k.x.c.i.a(object, (Object)x0.a.c.a))) {
                    object = null;
                }
                if (object == null) continue;
                o o3 = x02.d;
                Iterator iterator = o3.q(o3.b(j3)).iterator();
                while (iterator.hasNext()) {
                    j j4 = ((x0.a)object).a(x02, (i)iterator.next());
                    boolean bl2 = o2.l0(j4) && !o2.Q(j4) || o2.y((i)j4);
                    if (bl2) {
                        x02.b();
                        return true;
                    }
                    arrayDeque.add((Object)j4);
                }
                continue;
            }
            StringBuilder stringBuilder = a.z((String)"Too many supertypes for type: ", (j)j2, (String)". Supertypes = ");
            stringBuilder.append(k.s.i.A(set, null, null, null, (int)0, null, null, (int)63));
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        x02.b();
        return false;
    }
}

