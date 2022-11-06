/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  k.x.b.l
 *  k.x.c.k
 */
package l.a.b2;

import e.s.a.a;
import k.q;
import k.u.f;
import k.x.b.l;
import k.x.c.k;
import l.a.b2.w;

public final class m
extends k
implements l<Throwable, q> {
    public final /* synthetic */ l<E, q> k;
    public final /* synthetic */ E l;
    public final /* synthetic */ f m;

    public m(l<? super E, q> l2, E e2, f f2) {
        this.k = l2;
        this.l = e2;
        this.m = f2;
        super(1);
    }

    public Object invoke(Object object) {
        (Throwable)object;
        l<E, q> l2 = this.k;
        E e2 = this.l;
        f f2 = this.m;
        w w2 = a.E(l2, e2, null);
        if (w2 != null) {
            a.V1((f)f2, (Throwable)w2);
        }
        return q.a;
    }
}

