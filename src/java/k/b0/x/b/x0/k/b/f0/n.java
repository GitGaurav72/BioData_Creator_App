/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.i1.c
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.x0
 *  k.b0.x.b.x0.c.x0$a
 *  k.b0.x.b.x0.f.s$c
 *  k.b0.x.b.x0.k.b.f0.a
 *  k.b0.x.b.x0.m.f0
 *  k.x.b.a
 */
package k.b0.x.b.x0.k.b.f0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.c;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.x0;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.s;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.k.b.c0;
import k.b0.x.b.x0.k.b.f0.n;
import k.b0.x.b.x0.k.b.j;
import k.b0.x.b.x0.k.b.l;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.g;
import k.x.c.i;

public final class n
extends c {
    public final l q;
    public final s r;
    public final k.b0.x.b.x0.k.b.f0.a s;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public n(l l2, s s2, int n2) {
        n1 n12;
        i.e(l2, "c");
        i.e((Object)s2, "proto");
        m m2 = l2.a.a;
        k k2 = l2.c;
        Objects.requireNonNull((Object)h.g);
        h h2 = h.a.b;
        e e2 = e.s.a.a.J1((k.b0.x.b.x0.f.z.c)l2.b, (int)s2.q);
        s.c c2 = s2.s;
        i.d((Object)c2, "proto.variance");
        i.e((Object)c2, "variance");
        int n3 = c2.ordinal();
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) throw new g();
                n12 = n1.k;
            } else {
                n12 = n1.m;
            }
        } else {
            n12 = n1.l;
        }
        super(m2, k2, h2, e2, n12, s2.r, n2, u0.a, (x0)x0.a.a);
        this.q = l2;
        this.r = s2;
        this.s = new k.b0.x.b.x0.k.b.f0.a(l2.a.a, (k.x.b.a)new k.x.b.a<List<? extends k.b0.x.b.x0.c.i1.c>>(this){
            public final /* synthetic */ n k;
            {
                this.k = n2;
                super(0);
            }

            public Object invoke() {
                n n2 = this.k;
                l l2 = n2.q;
                return k.s.i.b0(l2.a.e.a(n2.r, l2.b));
            }
        });
    }

    public h getAnnotations() {
        return this.s;
    }

    @Override
    public void o(f0 f02) {
        i.e((Object)f02, "type");
        throw new IllegalStateException(i.k("There should be no cycles for deserialized type parameters, but found for: ", this));
    }

    @Override
    public List<f0> q() {
        s s2 = this.r;
        k.b0.x.b.x0.f.z.e e2 = this.q.d;
        i.e((Object)s2, "<this>");
        i.e(e2, "typeTable");
        ArrayList arrayList = s2.t;
        if (!(true ^ arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = s2.u;
            i.d(list, "upperBoundIdList");
            arrayList = new ArrayList(e.s.a.a.U(list, (int)10));
            for (Integer n2 : list) {
                i.d((Object)n2, "it");
                arrayList.add((Object)e2.a(n2));
            }
        }
        if (arrayList.isEmpty()) {
            return e.s.a.a.N2((Object)k.b0.x.b.x0.j.y.a.e((k)this).getDefaultBound());
        }
        c0 c02 = this.q.h;
        ArrayList arrayList2 = new ArrayList(e.s.a.a.U(arrayList, (int)10));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            arrayList2.add((Object)c02.h((q)((Object)iterator.next())));
        }
        return arrayList2;
    }
}

