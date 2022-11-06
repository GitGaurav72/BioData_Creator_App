/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.y0
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.y0
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.m.s1;

import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.y0;
import k.x.b.l;
import k.x.c.i;
import k.x.c.k;

public final class b
extends k
implements l<m1, Boolean> {
    public static final b k = new b();

    public b() {
        super(1);
    }

    public Object invoke(Object object) {
        boolean bl;
        block3 : {
            block4 : {
                h h2;
                block2 : {
                    m1 m12 = (m1)object;
                    i.e((Object)m12, "it");
                    h2 = m12.T().getDeclarationDescriptor();
                    if (h2 != null) break block2;
                    bl = false;
                    break block3;
                }
                if (h2 instanceof k.b0.x.b.x0.c.y0) break block4;
                boolean bl2 = h2 instanceof z0;
                bl = false;
                if (!bl2) break block3;
            }
            bl = true;
        }
        return bl;
    }
}

