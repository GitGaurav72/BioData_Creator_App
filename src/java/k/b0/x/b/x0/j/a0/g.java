/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.j.a0.a
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.l.i
 *  k.x.b.a
 *  k.x.c.k
 */
package k.b0.x.b.x0.j.a0;

import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.l.i;
import k.b0.x.b.x0.l.m;
import k.x.c.k;

public final class g
extends k.b0.x.b.x0.j.a0.a {
    public final i<h> b;

    public g(m m2, final k.x.b.a<? extends h> a2) {
        k.x.c.i.e(m2, "storageManager");
        k.x.c.i.e(a2, "getScope");
        this.b = m2.d(new k.x.b.a<h>(){

            public Object invoke() {
                h h2 = (h)a2.invoke();
                if (h2 instanceof k.b0.x.b.x0.j.a0.a) {
                    h2 = ((k.b0.x.b.x0.j.a0.a)h2).a();
                }
                return h2;
            }
        });
    }

    public h b() {
        return (h)this.b.invoke();
    }

}

