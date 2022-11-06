/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  k.x.b.l
 *  l.a.i
 *  l.a.z1.v
 */
package l.a.z1;

import e.s.a.a;
import k.q;
import k.u.f;
import k.x.b.l;
import l.a.i;
import l.a.z1.v;

public final class w<E>
extends v<E> {
    public final l<E, q> p;

    public w(E e2, i<? super q> i2, l<? super E, q> l2) {
        super(e2, i2);
        this.p = l2;
    }

    public void A() {
        l<E, q> l2 = this.p;
        Object object = this.n;
        f f2 = this.o.getContext();
        l.a.b2.w w2 = a.E(l2, (Object)object, null);
        if (w2 == null) {
            return;
        }
        a.V1((f)f2, (Throwable)w2);
    }

    public boolean t() {
        if (!l.a.b2.i.super.t()) {
            return false;
        }
        this.A();
        return true;
    }
}

