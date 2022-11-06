/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.j
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n0
 *  k.b0.x.b.x0.c.q0
 *  k.b0.x.b.x0.c.v
 *  k.b0.x.b.x0.c.y0
 */
package k.b0.x.b.x0.j;

import java.util.Comparator;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.y0;
import k.b0.x.b.x0.j.g;

public class j
implements Comparator<k> {
    public static final j k = new j();

    public static int a(k k2) {
        if (g.r(k2)) {
            return 8;
        }
        if (k2 instanceof k.b0.x.b.x0.c.j) {
            return 7;
        }
        if (k2 instanceof n0) {
            if (((n0)k2).getExtensionReceiverParameter() == null) {
                return 6;
            }
            return 5;
        }
        if (k2 instanceof v) {
            if (((v)k2).getExtensionReceiverParameter() == null) {
                return 4;
            }
            return 3;
        }
        if (k2 instanceof e) {
            return 2;
        }
        return k2 instanceof y0;
    }

    public int compare(Object object, Object object2) {
        Object object3;
        k k2 = (k)object;
        k k3 = (k)object2;
        int n2 = j.a(k3) - j.a(k2);
        if (n2 != 0) {
            object3 = n2;
        } else if (g.r(k2) && g.r(k3)) {
            object3 = 0;
        } else {
            k.b0.x.b.x0.g.e e2 = k2.getName();
            k.b0.x.b.x0.g.e e3 = k3.getName();
            int n3 = e2.k.compareTo(e3.k);
            object3 = n3 != 0 ? Integer.valueOf((int)n3) : null;
        }
        int n4 = 0;
        if (object3 != null) {
            n4 = object3;
        }
        return n4;
    }
}

