/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.m.f0
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g;
import k.q;
import k.x.b.l;
import k.x.c.i;

public final class k
extends k.x.c.k
implements l<f0, q> {
    public final /* synthetic */ g k;

    public k(g g2) {
        this.k = g2;
        super(1);
    }

    public Object invoke(Object object) {
        f0 f02 = (f0)object;
        i.e((Object)f02, "it");
        this.k.reportSupertypeLoopError(f02);
        return q.a;
    }
}

