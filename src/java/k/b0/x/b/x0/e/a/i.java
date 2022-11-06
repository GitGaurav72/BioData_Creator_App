/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Set
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.v
 *  k.b0.x.b.x0.e.a.l0
 *  k.s.i
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.e.a;

import java.util.Set;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.e.a.l0;
import k.b0.x.b.x0.e.b.q;
import k.x.b.l;
import k.x.c.k;

public final class i
extends k
implements l<b, Boolean> {
    public static final i k = new i();

    public i() {
        super(1);
    }

    public Object invoke(Object object) {
        b b2 = (b)object;
        k.x.c.i.e((Object)b2, "it");
        boolean bl = b2 instanceof v && k.s.i.e((Iterable)l0.g, (Object)q.c((a)b2));
        return bl;
    }
}

