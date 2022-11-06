/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.d
 *  k.b0.f
 *  k.b0.k
 *  k.x.c.b
 *  k.x.c.c
 */
package k.x.c;

import k.b0.d;
import k.b0.f;
import k.b0.k;
import k.x.c.b;
import k.x.c.c;
import k.x.c.p;

public class q
extends p {
    public q(f f2, String string, String string2) {
        super(b.NO_RECEIVER, ((c)f2).k(), string, string2, true ^ f2 instanceof d);
    }

    public Object get(Object object) {
        return this.a().call(new Object[]{object});
    }
}

