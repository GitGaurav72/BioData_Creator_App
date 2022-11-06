/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.y0
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g;
import k.b0.x.b.x0.m.y0;
import k.x.b.l;
import k.x.c.i;
import k.x.c.k;

public final class h
extends k
implements l<y0, Iterable<? extends f0>> {
    public final /* synthetic */ g k;

    public h(g g2) {
        this.k = g2;
        super(1);
    }

    public Object invoke(Object object) {
        y0 y02 = (y0)object;
        i.e((Object)y02, "it");
        return g.access$computeNeighbours(this.k, y02, true);
    }
}

