/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.util.Collection
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.v
 *  k.b0.x.b.x0.d.a.b
 *  k.x.b.l
 */
package k.b0.x.b.x0.j.a0;

import java.util.Collection;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.d.a.b;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.a0.d;
import k.x.b.l;

public interface j {
    public h getContributedClassifier(e var1, b var2);

    public Collection<k> getContributedDescriptors(d var1, l<? super e, Boolean> var2);

    public Collection<? extends v> getContributedFunctions(e var1, b var2);

    public void recordLookup(e var1, b var2);
}

