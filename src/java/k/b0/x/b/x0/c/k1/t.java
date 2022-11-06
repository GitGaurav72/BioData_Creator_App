/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  k.b0.f
 *  k.b0.k
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.f0
 *  k.b0.x.b.x0.c.g0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.j0
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.m
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.j.a0.b
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.l.i
 *  k.s.i
 *  k.x.b.a
 *  k.x.c.k
 *  k.x.c.p
 *  k.x.c.q
 */
package k.b0.x.b.x0.c.k1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k.b0.f;
import k.b0.k;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.f0;
import k.b0.x.b.x0.c.g0;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.j0;
import k.b0.x.b.x0.c.k1.a0;
import k.b0.x.b.x0.c.k1.k0;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.a0.g;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.l.i;
import k.x.c.p;
import k.x.c.q;
import k.x.c.w;

public class t
extends k.b0.x.b.x0.c.k1.m
implements j0 {
    public static final /* synthetic */ k<Object>[] k;
    public final a0 l;
    public final k.b0.x.b.x0.g.c m;
    public final i n;
    public final i o;
    public final k.b0.x.b.x0.j.a0.h p;

    public static {
        k[] arrk = new k[]{w.c((p)new q((f)w.a(t.class), "fragments", "getFragments()Ljava/util/List;")), w.c((p)new q((f)w.a(t.class), "empty", "getEmpty()Z"))};
        k = arrk;
    }

    public t(a0 a02, k.b0.x.b.x0.g.c c2, k.b0.x.b.x0.l.m m2) {
        k.x.c.i.e((Object)a02, "module");
        k.x.c.i.e(c2, "fqName");
        k.x.c.i.e(m2, "storageManager");
        Objects.requireNonNull((Object)h.g);
        super(h.a.b, c2.h());
        this.l = a02;
        this.m = c2;
        this.n = m2.d(new k.x.b.a<List<? extends f0>>(){

            public Object invoke() {
                return e.s.a.a.Z2((g0)this.l.q(), (k.b0.x.b.x0.g.c)this.m);
            }
        });
        this.o = m2.d(new k.x.b.a<Boolean>(){

            public Object invoke() {
                return e.s.a.a.q2((g0)this.l.q(), (k.b0.x.b.x0.g.c)this.m);
            }
        });
        this.p = new g(m2, (k.x.b.a<? extends k.b0.x.b.x0.j.a0.h>)new k.x.b.a<k.b0.x.b.x0.j.a0.h>(){

            public Object invoke() {
                if (((Boolean)e.s.a.a.T1((i)this.o, t.k[1])).booleanValue()) {
                    return h.b.b;
                }
                List<f0> list = this.p();
                ArrayList arrayList = new ArrayList(e.s.a.a.U(list, (int)10));
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    arrayList.add((Object)((f0)iterator.next()).getMemberScope());
                }
                t t2 = this;
                List list2 = k.s.i.N((Collection)arrayList, (Object)((Object)new k0(t2.l, t2.m)));
                StringBuilder stringBuilder = e.e.a.a.a.t((String)"package view scope for ");
                stringBuilder.append((Object)this.m);
                stringBuilder.append(" in ");
                stringBuilder.append((Object)this.l.getName());
                return k.b0.x.b.x0.j.a0.b.a((String)stringBuilder.toString(), (Iterable)list2);
            }
        });
    }

    public d0 N() {
        return this.l;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        k.x.c.i.e(m2, "visitor");
        return (R)m2.c((j0)this, d2);
    }

    public boolean equals(Object object) {
        j0 j02 = object instanceof j0 ? (j0)object : null;
        if (j02 == null) {
            return false;
        }
        boolean bl = k.x.c.i.a(this.m, j02.getFqName());
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = k.x.c.i.a((Object)this.l, (Object)j02.N());
            bl2 = false;
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public k.b0.x.b.x0.c.k getContainingDeclaration() {
        if (this.m.d()) {
            return null;
        }
        a0 a02 = this.l;
        k.b0.x.b.x0.g.c c2 = this.m.e();
        k.x.c.i.d(c2, "fqName.parent()");
        return a02.r(c2);
    }

    public k.b0.x.b.x0.g.c getFqName() {
        return this.m;
    }

    public k.b0.x.b.x0.j.a0.h getMemberScope() {
        return this.p;
    }

    public int hashCode() {
        return 31 * this.l.hashCode() + this.m.hashCode();
    }

    public boolean isEmpty() {
        return (Boolean)e.s.a.a.T1((i)this.o, k[1]);
    }

    public List<f0> p() {
        return (List)e.s.a.a.T1((i)this.n, k[0]);
    }

}

