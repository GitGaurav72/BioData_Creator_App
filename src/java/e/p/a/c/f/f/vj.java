/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.a.c.f.f.a0
 *  e.p.a.c.f.f.p
 *  e.p.a.c.f.f.uj
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 */
package e.p.a.c.f.f;

import e.p.a.c.f.f.a0;
import e.p.a.c.f.f.p;
import e.p.a.c.f.f.uj;

public final class vj {
    public final uj a;

    public vj(uj uj2) {
        this.a = uj2;
        uj2.c = this;
    }

    public final void a(int n, int n2) {
        this.a.t(n, n2 + n2 ^ n2 >> 31);
    }

    public final void b(int n, long l) {
        this.a.v(n, l + l ^ l >> 63);
    }

    public final void c(int n, double d2) {
        this.a.m(n, Double.doubleToRawLongBits((double)d2));
    }

    public final void d(int n, float f) {
        this.a.k(n, Float.floatToRawIntBits((float)f));
    }

    public final void e(int n, Object object, a0 a02) {
        uj uj2 = this.a;
        p p2 = (p)object;
        uj2.s(n, 3);
        a02.i((Object)p2, uj2.c);
        uj2.s(n, 4);
    }

    public final void f(int n, Object object, a0 a02) {
        this.a.q(n, (p)object, a02);
    }
}

