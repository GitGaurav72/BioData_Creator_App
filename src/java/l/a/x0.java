/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  k.x.b.l
 */
package l.a;

import e.s.a.a;
import k.q;
import k.x.b.l;
import l.a.g;

public final class x0
extends g {
    public final l<Throwable, q> k;

    public x0(l<? super Throwable, q> l2) {
        this.k = l2;
    }

    public void b(Throwable throwable) {
        this.k.invoke((Object)throwable);
    }

    public Object invoke(Object object) {
        Throwable throwable = (Throwable)object;
        this.k.invoke((Object)throwable);
        return q.a;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"InvokeOnCancel[");
        stringBuilder.append(a.n1(this.k));
        stringBuilder.append('@');
        stringBuilder.append(a.w1((Object)this));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

