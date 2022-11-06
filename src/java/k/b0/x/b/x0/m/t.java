/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.m;

import java.util.List;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.y0;

public abstract class t
extends m0 {
    public List<b1> S() {
        return this.c0().S();
    }

    public y0 T() {
        return this.c0().T();
    }

    public boolean U() {
        return this.c0().U();
    }

    public abstract m0 c0();

    public m0 d0(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return this.e0((m0)d2.h((i)((Object)this.c0())));
    }

    public abstract t e0(m0 var1);

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        return this.c0().getAnnotations();
    }

    public h getMemberScope() {
        return this.c0().getMemberScope();
    }
}

