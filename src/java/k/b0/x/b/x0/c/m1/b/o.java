/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.c.m1.b;

import k.x.b.l;
import k.x.c.i;
import k.x.c.k;

public final class o
extends k
implements l<Class<?>, Boolean> {
    public static final o k = new o();

    public o() {
        super(1);
    }

    public Object invoke(Object object) {
        String string = ((Class)object).getSimpleName();
        i.d(string, "it.simpleName");
        boolean bl = string.length() == 0;
        return bl;
    }
}

