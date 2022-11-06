/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  k.b0.x.b.x0.c.b
 */
package k.b0.x.b.x0.j;

import java.util.Collection;
import k.b0.x.b.x0.c.b;
import k.x.c.i;

public abstract class l {
    public abstract void a(b var1);

    public abstract void b(b var1, b var2);

    public abstract void c(b var1, b var2);

    public void d(b b2, Collection<? extends b> collection) {
        i.e((Object)b2, "member");
        i.e(collection, "overridden");
        b2.setOverriddenDescriptors(collection);
    }
}

