/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.y0
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.y0
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.m.s1;

import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.y0;
import k.x.b.l;
import k.x.c.i;

public final class a
extends k.x.c.k
implements l<m1, Boolean> {
    public static final a k = new a();

    public a() {
        super(1);
    }

    public Object invoke(Object object) {
        boolean bl;
        m1 m12 = (m1)object;
        i.e((Object)m12, "it");
        h h2 = m12.T().getDeclarationDescriptor();
        if (h2 == null) {
            bl = false;
        } else {
            i.e((Object)h2, "<this>");
            boolean bl2 = h2 instanceof z0;
            bl = false;
            if (bl2) {
                boolean bl3 = ((z0)h2).getContainingDeclaration() instanceof k.b0.x.b.x0.c.y0;
                bl = false;
                if (bl3) {
                    bl = true;
                }
            }
        }
        return bl;
    }
}

