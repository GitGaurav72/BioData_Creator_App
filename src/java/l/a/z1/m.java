/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  k.x.b.l
 *  l.a.b2.g
 *  l.a.z1.a
 *  l.a.z1.c
 *  l.a.z1.c$a
 *  l.a.z1.i
 *  l.a.z1.t
 */
package l.a.z1;

import java.util.ArrayList;
import k.q;
import k.x.b.l;
import l.a.b2.g;
import l.a.b2.w;
import l.a.z1.a;
import l.a.z1.b;
import l.a.z1.c;
import l.a.z1.i;
import l.a.z1.r;
import l.a.z1.t;

public class m<E>
extends a<E> {
    public m(l<? super E, q> l2) {
        super(l2);
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        return false;
    }

    public Object m(E e2) {
        Object object;
        block4 : {
            r r2;
            do {
                block5 : {
                    l.a.b2.i i2;
                    l.a.b2.q q2;
                    if ((object = c.super.m(e2)) == (q2 = b.b)) {
                        return q2;
                    }
                    if (object != b.c) break block4;
                    g g2 = ((c)this).m;
                    c.a a2 = new c.a(e2);
                    do {
                        if (!((i2 = g2.o()) instanceof r)) continue;
                        r2 = (r)((Object)i2);
                        break block5;
                    } while (!i2.i((l.a.b2.i)a2, (l.a.b2.i)g2));
                    r2 = null;
                }
                if (r2 != null) continue;
                return b.b;
            } while (!(r2 instanceof i));
            return r2;
        }
        if (object instanceof i) {
            return object;
        }
        throw new IllegalStateException(k.x.c.i.k("Invalid offerInternal result ", object).toString());
    }

    public final boolean q() {
        return true;
    }

    public final boolean r() {
        return true;
    }

    public void u(Object object, i<?> i2) {
        w w2;
        if (object == null) {
            w2 = null;
        } else if (!(object instanceof ArrayList)) {
            t t2 = (t)object;
            if (t2 instanceof c.a) {
                l l2 = ((c)this).l;
                w2 = l2 == null ? null : e.s.a.a.E((l)l2, (Object)((c.a)t2).n, null);
            } else {
                t2.y(i2);
                w2 = null;
            }
        } else {
            ArrayList arrayList = (ArrayList)object;
            int n2 = -1 + arrayList.size();
            w2 = null;
            if (n2 >= 0) {
                w w3 = null;
                do {
                    int n3 = n2 - 1;
                    t t3 = (t)arrayList.get(n2);
                    if (t3 instanceof c.a) {
                        l l3 = ((c)this).l;
                        w3 = l3 == null ? null : e.s.a.a.E((l)l3, (Object)((c.a)t3).n, w3);
                    } else {
                        t3.y(i2);
                    }
                    if (n3 < 0) {
                        w2 = w3;
                        break;
                    }
                    n2 = n3;
                } while (true);
            }
        }
        if (w2 == null) {
            return;
        }
        throw w2;
    }
}

