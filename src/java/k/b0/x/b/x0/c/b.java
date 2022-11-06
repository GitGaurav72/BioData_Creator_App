/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.r
 */
package k.b0.x.b.x0.c;

import java.util.Collection;
import k.b0.x.b.x0.c.a0;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.r;

public interface b
extends k.b0.x.b.x0.c.a,
a0 {
    public b copy(k var1, b0 var2, r var3, a var4, boolean var5);

    public a getKind();

    @Override
    public b getOriginal();

    public Collection<? extends b> getOverriddenDescriptors();

    public void setOverriddenDescriptors(Collection<? extends b> var1);
}

