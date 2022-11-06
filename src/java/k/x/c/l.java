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
import k.b0.h;
import k.b0.i;
import k.b0.k;
import k.b0.l;
import k.x.c.m;
import k.x.c.n;
import k.x.c.w;

public abstract class l
extends n
implements i {
    public l(Object object, Class class_, String string, String string2, int n2) {
        super(object, class_, string, string2, n2);
    }

    @Override
    public l.a a() {
        return ((i)this.d()).a();
    }

    public i.a c() {
        return ((i)this.d()).c();
    }

    public c computeReflected() {
        return w.b(this);
    }

    public Object invoke(Object object) {
        return ((m)this).get(object);
    }
}

