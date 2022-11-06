/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
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
import k.b0.x.b.x0.m.x;
import k.b0.x.b.x0.m.y0;
import k.x.c.i;

public final class l1
extends x {
    public final String q;

    public l1(String string, y0 y02, h h2, List<? extends b1> list, boolean bl) {
        i.e(string, "presentableName");
        i.e((Object)y02, "constructor");
        i.e((Object)h2, "memberScope");
        i.e(list, "arguments");
        super(y02, h2, list, bl, null, 16);
        this.q = string;
    }

    @Override
    public f0 V(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }

    @Override
    public m1 Y(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }

    @Override
    public m0 a0(boolean bl) {
        l1 l12 = new l1(this.q, this.l, this.m, this.n, bl);
        return l12;
    }

    @Override
    public String c0() {
        return this.q;
    }

    @Override
    public x d0(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }
}

