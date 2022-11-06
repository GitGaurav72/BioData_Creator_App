/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.List
 *  k.b0.f
 *  k.b0.k
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.t0
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.j.a0.i
 *  k.b0.x.b.x0.l.i
 *  k.s.i
 *  k.x.b.a
 *  k.x.b.l
 *  k.x.c.k
 *  k.x.c.p
 *  k.x.c.q
 */
package k.b0.x.b.x0.j.a0;

import java.util.Collection;
import java.util.List;
import k.b0.f;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.d.a.b;
import k.b0.x.b.x0.j.a0.d;
import k.b0.x.b.x0.j.a0.i;
import k.b0.x.b.x0.l.m;
import k.x.b.l;
import k.x.c.p;
import k.x.c.q;
import k.x.c.w;

public final class k
extends i {
    public static final /* synthetic */ k.b0.k<Object>[] b;
    public final e c;
    public final k.b0.x.b.x0.l.i d;

    public static {
        k.b0.k[] arrk = new k.b0.k[]{w.c((p)new q((f)w.a(k.class), "functions", "getFunctions()Ljava/util/List;"))};
        b = arrk;
    }

    public k(m m2, e e2) {
        k.x.c.i.e(m2, "storageManager");
        k.x.c.i.e((Object)e2, "containingClass");
        this.c = e2;
        this.d = m2.d(new k.x.b.a<List<? extends t0>>(){

            public Object invoke() {
                Object[] arrobject = new t0[]{e.s.a.a.x0((e)this.c), e.s.a.a.y0((e)this.c)};
                return k.s.i.E((Object[])arrobject);
            }
        });
    }

    public h getContributedClassifier(k.b0.x.b.x0.g.e e2, b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        return null;
    }

    public Collection getContributedDescriptors(d d2, l l2) {
        k.x.c.i.e(d2, "kindFilter");
        k.x.c.i.e((Object)l2, "nameFilter");
        return (List)e.s.a.a.T1((k.b0.x.b.x0.l.i)this.d, b[0]);
    }

    public Collection getContributedFunctions(k.b0.x.b.x0.g.e e2, b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        List list = (List)e.s.a.a.T1((k.b0.x.b.x0.l.i)this.d, b[0]);
        k.b0.x.b.x0.o.h<Object> h2 = new k.b0.x.b.x0.o.h<Object>();
        for (Object object : list) {
            if (!k.x.c.i.a(((t0)object).getName(), e2)) continue;
            h2.add(object);
        }
        return h2;
    }

}

