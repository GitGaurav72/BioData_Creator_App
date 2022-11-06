/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.c.d0
 */
package k.b0.x.b.x0.k.b;

import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.k1.c0;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.k.b.g;
import k.b0.x.b.x0.k.b.j;
import k.b0.x.b.x0.l.m;
import k.x.c.i;

public abstract class o
extends c0 {
    public final m k;

    public o(c c2, m m2, d0 d02) {
        i.e(c2, "fqName");
        i.e(m2, "storageManager");
        i.e((Object)d02, "module");
        super(d02, c2);
        this.k = m2;
    }

    public abstract g n();

    public abstract void o(j var1);
}

