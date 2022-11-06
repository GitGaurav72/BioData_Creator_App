/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.f.z.d
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.k.b.f0.g
 *  k.b0.x.b.x0.k.b.x
 *  k.x.b.a
 *  k.x.b.l
 */
package k.b0.x.b.x0.k.b;

import java.util.Collection;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.f0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.f.l;
import k.b0.x.b.x0.f.m;
import k.b0.x.b.x0.f.z.d;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.k.b.f0.j;
import k.b0.x.b.x0.k.b.g;
import k.b0.x.b.x0.k.b.o;
import k.b0.x.b.x0.k.b.p;
import k.b0.x.b.x0.k.b.x;
import k.x.c.i;

public abstract class p
extends o {
    public final k.b0.x.b.x0.f.z.a l;
    public final k.b0.x.b.x0.k.b.f0.g m;
    public final d n;
    public final x o;
    public m p;
    public h q;

    public p(c c2, k.b0.x.b.x0.l.m m2, d0 d02, m m3, k.b0.x.b.x0.f.z.a a2, k.b0.x.b.x0.k.b.f0.g g2) {
        d d2;
        i.e(c2, "fqName");
        i.e(m2, "storageManager");
        i.e((Object)d02, "module");
        i.e((Object)m3, "proto");
        i.e(a2, "metadataVersion");
        super(c2, m2, d02);
        this.l = a2;
        this.m = null;
        k.b0.x.b.x0.f.p p2 = m3.p;
        i.d(p2, "proto.strings");
        k.b0.x.b.x0.f.o o2 = m3.q;
        i.d(o2, "proto.qualifiedNames");
        this.n = d2 = new d(p2, o2);
        this.o = new x(m3, (k.b0.x.b.x0.f.z.c)d2, a2, (k.x.b.l)new k.x.b.l<k.b0.x.b.x0.g.b, u0>(this){
            public final /* synthetic */ p k;
            {
                this.k = p2;
                super(1);
            }

            public Object invoke(Object object) {
                i.e((k.b0.x.b.x0.g.b)object, "it");
                k.b0.x.b.x0.k.b.f0.g g2 = this.k.m;
                if (g2 == null) {
                    g2 = u0.a;
                    i.d((Object)g2, "NO_SOURCE");
                }
                return g2;
            }
        });
        this.p = m3;
    }

    @Override
    public h getMemberScope() {
        h h2 = this.q;
        if (h2 != null) {
            return h2;
        }
        i.m("_memberScope");
        throw null;
    }

    @Override
    public g n() {
        return this.o;
    }

    @Override
    public void o(k.b0.x.b.x0.k.b.j j2) {
        i.e(j2, "components");
        m m2 = this.p;
        if (m2 != null) {
            this.p = null;
            l l2 = m2.r;
            i.d((Object)l2, "proto.`package`");
            j j3 = new j(this, l2, (k.b0.x.b.x0.f.z.c)this.n, this.l, this.m, j2, i.k("scope of ", this), (k.x.b.a<? extends Collection<e>>)new k.x.b.a<Collection<? extends e>>(this){
                public final /* synthetic */ p k;
                {
                    this.k = p2;
                    super(0);
                }

                public Object invoke() {
                    java.util.Set set = this.k.o.d.keySet();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (Object object : set) {
                        k.b0.x.b.x0.g.b b2 = (k.b0.x.b.x0.g.b)object;
                        boolean bl = !b2.k() && !k.b0.x.b.x0.k.b.h.b.contains((Object)b2);
                        if (!bl) continue;
                        arrayList.add(object);
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(e.s.a.a.U((java.lang.Iterable)arrayList, (int)10));
                    java.util.Iterator iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        arrayList2.add((Object)((k.b0.x.b.x0.g.b)iterator.next()).j());
                    }
                    return arrayList2;
                }
            });
            this.q = j3;
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }
}

