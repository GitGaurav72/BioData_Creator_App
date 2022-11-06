/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.c
 *  k.b0.k
 */
package k.x.c;

import k.b0.c;
import k.b0.k;
import k.b0.l;
import k.x.c.q;
import k.x.c.r;
import k.x.c.w;

public abstract class p
extends r
implements l {
    public p(Object object, Class class_, String string, String string2, int n2) {
        super(object, class_, string, string2, n2);
    }

    public l.a a() {
        return ((l)this.d()).a();
    }

    public c computeReflected() {
        return w.c(this);
    }

    public Object invoke(Object object) {
        return ((q)this).get(object);
    }
}

