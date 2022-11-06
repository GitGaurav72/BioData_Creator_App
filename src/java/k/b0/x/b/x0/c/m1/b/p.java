/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.c.m1.b;

import k.b0.x.b.x0.g.e;
import k.x.b.l;
import k.x.c.k;

public final class p
extends k
implements l<Class<?>, e> {
    public static final p k = new p();

    public p() {
        super(1);
    }

    public Object invoke(Object object) {
        String string = ((Class)object).getSimpleName();
        if (!e.m(string)) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        return e.l(string);
    }
}

