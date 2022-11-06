/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.Reference
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.TimeUnit
 *  m.m0.g.e
 *  m.m0.g.i
 *  m.m0.g.j$a
 *  m.m0.k.h
 *  m.z
 */
package m.m0.g;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import m.k0;
import m.m0.c;
import m.m0.f.d;
import m.m0.g.e;
import m.m0.g.i;
import m.m0.g.j;
import m.m0.k.h;
import m.z;

public final class j {
    public final long a;
    public final m.m0.f.c b;
    public final a c;
    public final ConcurrentLinkedQueue<i> d;
    public final int e;

    public j(d d2, int n2, long l2, TimeUnit timeUnit) {
        k.x.c.i.e(d2, "taskRunner");
        k.x.c.i.e((Object)timeUnit, "timeUnit");
        this.e = n2;
        this.a = timeUnit.toNanos(l2);
        this.b = d2.f();
        this.c = new a(this, e.e.a.a.a.q((StringBuilder)new StringBuilder(), (String)c.h, (String)" ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
        boolean bl = l2 > 0L;
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(e.e.a.a.a.i((String)"keepAliveDuration <= 0: ", (long)l2).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(m.a a2, e e2, List<k0> list, boolean bl) {
        k.x.c.i.e(a2, "address");
        k.x.c.i.e((Object)e2, "call");
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            i i2 = (i)iterator.next();
            k.x.c.i.d((Object)i2, "connection");
            i i3 = i2;
            synchronized (i3) {
                boolean bl2;
                if ((!bl || i2.j()) && (bl2 = i2.h(a2, list))) {
                    e2.b(i2);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(i i2, long l2) {
        List list = i2.o;
        int n2 = 0;
        while (n2 < list.size()) {
            Reference reference = (Reference)list.get(n2);
            if (reference.get() != null) {
                ++n2;
                continue;
            }
            e.b b2 = (e.b)reference;
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"A connection to ");
            stringBuilder.append((Object)i2.q.a.a);
            stringBuilder.append(" was leaked. ");
            stringBuilder.append("Did you forget to close a response body?");
            String string = stringBuilder.toString();
            h.a.k(string, b2.a);
            list.remove(n2);
            i2.i = true;
            if (!list.isEmpty()) continue;
            i2.p = l2 - this.a;
            return 0;
        }
        return list.size();
    }
}

