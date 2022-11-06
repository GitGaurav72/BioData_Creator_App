/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.c.i1.h
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.t;
import k.b0.x.b.x0.m.u;
import k.x.c.i;

public final class n
extends u {
    public final h m;

    public n(m0 m02, h h2) {
        i.e(m02, "delegate");
        i.e((Object)h2, "annotations");
        super(m02);
        this.m = h2;
    }

    @Override
    public t e0(m0 m02) {
        i.e(m02, "delegate");
        return new n(m02, this.m);
    }

    @Override
    public h getAnnotations() {
        return this.m;
    }
}

