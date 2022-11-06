/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.c
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.h.p
 *  k.s.r
 *  k.x.b.a
 *  k.x.c.k
 */
package k.b0.x.b.x0.k.b;

import java.util.List;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.j.w.g;
import k.b0.x.b.x0.k.b.b;
import k.b0.x.b.x0.k.b.c;
import k.b0.x.b.x0.k.b.j;
import k.b0.x.b.x0.k.b.l;
import k.b0.x.b.x0.k.b.v;
import k.b0.x.b.x0.k.b.y;
import k.s.r;
import k.x.b.a;

public final class w
extends k.x.c.k
implements a<List<? extends k.b0.x.b.x0.c.i1.c>> {
    public final /* synthetic */ v k;
    public final /* synthetic */ p l;
    public final /* synthetic */ b m;

    public w(v v2, p p2, b b2) {
        this.k = v2;
        this.l = p2;
        this.m = b2;
        super(0);
    }

    public Object invoke() {
        List<k.b0.x.b.x0.c.i1.c> list;
        v v2 = this.k;
        y y2 = v2.a(v2.a.c);
        if (y2 == null) {
            list = null;
        } else {
            v v3 = this.k;
            p p2 = this.l;
            b b2 = this.m;
            list = v3.a.a.e.h(y2, p2, b2);
        }
        if (list == null) {
            list = r.k;
        }
        return list;
    }
}

