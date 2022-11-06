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
import k.x.c.k;

public final class i
extends k
implements l<f0, q> {
    public final /* synthetic */ g k;

    public i(g g2) {
        this.k = g2;
        super(1);
    }

    public Object invoke(Object object) {
        f0 f02 = (f0)object;
        k.x.c.i.e((Object)f02, "it");
        this.k.reportScopesLoopError(f02);
        return q.a;
    }
}

