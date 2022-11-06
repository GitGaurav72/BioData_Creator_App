/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.f.q
 *  k.b0.x.b.x0.f.q$c
 *  k.b0.x.b.x0.f.t
 *  k.s.i
 */
package k.b0.x.b.x0.f.z;

import e.s.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.t;
import k.b0.x.b.x0.h.v;
import k.x.c.i;

public final class e {
    public final List<q> a;

    public e(t t2) {
        i.e((Object)t2, "typeTable");
        List list = t2.o;
        int n2 = 1 & t2.n;
        int n3 = 0;
        boolean bl = n2 == 1;
        if (bl) {
            int n4 = t2.p;
            i.d((Object)list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(a.U((Iterable)list, (int)10));
            for (Object object : list) {
                int n5 = n3 + 1;
                if (n3 >= 0) {
                    q q2 = (q)object;
                    if (n3 >= n4) {
                        Objects.requireNonNull((Object)q2);
                        q.c c2 = q.z((q)q2);
                        c2.n = 2 | c2.n;
                        c2.p = true;
                        q2 = c2.k();
                        if (!q2.f()) {
                            throw new v();
                        }
                    }
                    arrayList.add((Object)q2);
                    n3 = n5;
                    continue;
                }
                k.s.i.X();
                throw null;
            }
            list = arrayList;
        }
        i.d((Object)list, "run {\n        val origin\u2026 else originalTypes\n    }");
        this.a = list;
    }

    public final q a(int n2) {
        return (q)this.a.get(n2);
    }
}

