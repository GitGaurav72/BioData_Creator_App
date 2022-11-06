/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.e.a.m0.k
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.d1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.r0
 */
package k.b0.x.b.x0.e.a.o0.n;

import java.util.Set;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.e.a.m0.k;
import k.b0.x.b.x0.e.a.o0.n.a;
import k.b0.x.b.x0.e.a.o0.n.b;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.d1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.r0;
import k.x.c.i;

public final class e {
    public static final c a = new c("java.lang.Class");

    public static final b1 a(z0 z02, a a2) {
        i.e((Object)z02, "typeParameter");
        i.e(a2, "attr");
        if (a2.a == k.k) {
            return new d1(e.s.a.a.T3((z0)z02));
        }
        return new r0(z02);
    }

    public static a b(k k2, boolean bl, z0 z02, int n2) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        boolean bl2 = bl;
        if ((n2 & 2) != 0) {
            z02 = null;
        }
        i.e((Object)k2, "<this>");
        Set set = z02 == null ? null : e.s.a.a.J3((Object)z02);
        a a2 = new a(k2, null, bl2, set, null, 18);
        return a2;
    }
}

