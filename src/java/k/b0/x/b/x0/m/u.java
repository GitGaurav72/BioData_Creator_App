/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.m.m1
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.n;
import k.b0.x.b.x0.m.t;
import k.x.c.i;

public abstract class u
extends t {
    public final m0 l;

    public u(m0 m02) {
        i.e(m02, "delegate");
        this.l = m02;
    }

    @Override
    public m1 Z(h h2) {
        i.e((Object)h2, "newAnnotations");
        if (h2 != this.getAnnotations()) {
            return new n(this, h2);
        }
        return this;
    }

    @Override
    public m0 a0(boolean bl) {
        if (bl == this.U()) {
            return this;
        }
        return this.l.a0(bl).b0(this.getAnnotations());
    }

    @Override
    public m0 b0(h h2) {
        i.e((Object)h2, "newAnnotations");
        if (h2 != this.getAnnotations()) {
            return new n(this, h2);
        }
        return this;
    }

    @Override
    public m0 c0() {
        return this.l;
    }
}

