/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.e.a.r0;

import e.s.a.a;
import k.b0.x.b.x0.e.a.r0.d;
import k.x.c.k;

public final class l
extends k
implements k.x.b.l<Integer, d> {
    public final /* synthetic */ d[] k;

    public l(d[] arrd) {
        this.k = arrd;
        super(1);
    }

    public Object invoke(Object object) {
        int n2 = ((Number)object).intValue();
        Object[] arrobject = this.k;
        if (n2 >= 0 && n2 <= a.H1((Object[])arrobject)) {
            return arrobject[n2];
        }
        return d.b;
    }
}

