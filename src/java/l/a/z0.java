/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  k.x.b.l
 */
package l.a;

import k.q;
import k.x.b.l;
import l.a.e1;

public final class z0
extends e1 {
    public final l<Throwable, q> o;

    public z0(l<? super Throwable, q> l2) {
        this.o = l2;
    }

    public Object invoke(Object object) {
        Throwable throwable = (Throwable)object;
        this.o.invoke((Object)throwable);
        return q.a;
    }

    public void w(Throwable throwable) {
        this.o.invoke((Object)throwable);
    }
}

