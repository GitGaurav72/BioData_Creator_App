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
import k.b0.h;
import k.b0.k;
import k.x.c.b;
import k.x.c.c;
import k.x.c.l;

public class m
extends l {
    public m(f f2, String string, String string2) {
        super(b.NO_RECEIVER, ((c)f2).k(), string, string2, true ^ f2 instanceof d);
    }

    @Override
    public Object get(Object object) {
        return this.a().call(new Object[]{object});
    }

    public void r(Object object, Object object2) {
        this.c().call(new Object[]{object, object2});
    }
}

