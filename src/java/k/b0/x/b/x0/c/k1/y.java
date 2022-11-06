/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.AssertionError
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  k.b0.x.b.x0.c.g0
 *  k.b0.x.b.x0.c.k1.l
 *  k.b0.x.b.x0.c.k1.w
 *  k.x.b.a
 *  k.x.c.k
 */
package k.b0.x.b.x0.c.k1;

import e.e.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.c.g0;
import k.b0.x.b.x0.c.k1.a0;
import k.b0.x.b.x0.c.k1.l;
import k.b0.x.b.x0.c.k1.w;
import k.b0.x.b.x0.g.e;
import k.x.c.i;
import k.x.c.k;

public final class y
extends k
implements k.x.b.a<l> {
    public final /* synthetic */ a0 k;

    public y(a0 a02) {
        this.k = a02;
        super(0);
    }

    public Object invoke() {
        a0 a02 = this.k;
        w w2 = a02.o;
        if (w2 != null) {
            List list = w2.a();
            this.k.n();
            list.contains((Object)this.k);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
            }
            ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
            Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                g0 g02 = ((a0)iterator2.next()).p;
                i.c((Object)g02);
                arrayList.add((Object)g02);
            }
            return new l((List)arrayList, i.k("CompositeProvider@ModuleDescriptor for ", this.k.getName()));
        }
        StringBuilder stringBuilder = a.t((String)"Dependencies of module ");
        stringBuilder.append(a02.o());
        stringBuilder.append(" were not set before querying module content");
        throw new AssertionError((Object)stringBuilder.toString());
    }
}

