/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.m.r1.e
 *  k.b0.x.b.x0.m.r1.g
 *  k.b0.x.b.x0.m.r1.j
 *  k.b0.x.b.x0.m.r1.o
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.m.r1.e;
import k.b0.x.b.x0.m.r1.g;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.r1.j;
import k.b0.x.b.x0.m.r1.l;
import k.b0.x.b.x0.m.r1.m;
import k.b0.x.b.x0.m.r1.o;
import k.b0.x.b.x0.m.r1.r;

public final class d {
    public static final boolean a(o o2, j j2, j j3) {
        boolean bl;
        boolean bl2;
        if (o2.h((i)j2) == o2.h((i)j3) && o2.Q(j2) == o2.Q(j3) && (bl = o2.i0(j2) == null) == (bl2 = o2.i0(j3) == null)) {
            if (!o2.p0(o2.b(j2), o2.b(j3))) {
                return false;
            }
            if (o2.j0(j2, j3)) {
                return true;
            }
            int n2 = o2.h((i)j2);
            int n3 = 0;
            while (n3 < n2) {
                int n4 = n3 + 1;
                l l2 = o2.Y((i)j2, n3);
                l l3 = o2.Y((i)j3, n3);
                if (o2.F(l2) != o2.F(l3)) {
                    return false;
                }
                if (!o2.F(l2)) {
                    if (o2.a0(l2) != o2.a0(l3)) {
                        return false;
                    }
                    if (!d.b(o2, o2.n0(l2), o2.n0(l3))) {
                        return false;
                    }
                }
                n3 = n4;
            }
            return true;
        }
        return false;
    }

    public static final boolean b(o o2, i i2, i i3) {
        if (i2 == i3) {
            return true;
        }
        j j2 = o2.a(i2);
        j j3 = o2.a(i3);
        if (j2 != null && j3 != null) {
            return d.a(o2, j2, j3);
        }
        g g2 = o2.G(i2);
        g g3 = o2.G(i3);
        if (g2 != null && g3 != null) {
            return d.a(o2, o2.f(g2), o2.f(g3)) && d.a(o2, o2.d(g2), o2.d(g3));
        }
        return false;
    }
}

