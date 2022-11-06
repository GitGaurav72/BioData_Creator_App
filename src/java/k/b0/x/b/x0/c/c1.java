/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.List
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.z0
 *  k.s.i
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.c;

import java.util.List;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.z0;
import k.c0.h;
import k.s.i;
import k.x.b.l;

public final class c1
extends k.x.c.k
implements l<k, h<? extends z0>> {
    public static final c1 k = new c1();

    public c1() {
        super(1);
    }

    public Object invoke(Object object) {
        k k2 = (k)object;
        k.x.c.i.e((Object)k2, "it");
        List list = ((a)k2).getTypeParameters();
        k.x.c.i.d((Object)list, "it as CallableDescriptor).typeParameters");
        return i.d((Iterable)list);
    }
}

