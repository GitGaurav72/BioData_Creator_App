/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package k.b0.x.b.y0;

public final class c<V> {
    public static final c<Object> a = new c<V>();
    public final long b;
    public final V c;
    public final c<V> d;
    public final c<V> e;
    public final int f;

    public c() {
        this.f = 0;
        this.b = 0L;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public c(long l2, V v2, c<V> c2, c<V> c3) {
        this.b = l2;
        this.c = v2;
        this.d = c2;
        this.e = c3;
        this.f = 1 + c2.f + c3.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public V a(long l2) {
        c<V> c2;
        if (this.f == 0) {
            return null;
        }
        long l3 = this.b;
        if (l2 < l3) {
            c2 = this.d;
            do {
                return c2.a(l2 - l3);
                break;
            } while (true);
        }
        if (l2 <= l3) return this.c;
        c2 = this.e;
        return c2.a(l2 - l3);
    }

    public c<V> b(long l2, V v2) {
        if (this.f == 0) {
            c<V> c2 = new c<V>(l2, v2, this, this);
            return c2;
        }
        long l3 = this.b;
        if (l2 < l3) {
            return this.c(this.d.b(l2 - l3, v2), this.e);
        }
        if (l2 > l3) {
            return this.c(this.d, this.e.b(l2 - l3, v2));
        }
        if (v2 == this.c) {
            return this;
        }
        c<V> c3 = new c<V>(l2, v2, this.d, this.e);
        return c3;
    }

    public final c<V> c(c<V> c2, c<V> c3) {
        if (c2 == this.d && c3 == this.e) {
            return this;
        }
        long l2 = this.b;
        V v2 = this.c;
        int n2 = c2.f;
        int n3 = c3.f;
        if (n2 + n3 > 1) {
            if (n2 >= n3 * 5) {
                c<V> c4 = c2.d;
                c<V> c5 = c2.e;
                if (c5.f < 2 * c4.f) {
                    long l3 = c2.b;
                    long l4 = l3 + l2;
                    V v3 = c2.c;
                    c<V> c6 = new c<V>(-l3, v2, c5.d(l3 + c5.b), c3);
                    c<V> c7 = new c<V>(l4, v3, c4, c6);
                    return c7;
                }
                c<V> c8 = c5.d;
                c<V> c9 = c5.e;
                long l5 = c5.b;
                long l6 = l2 + (l5 + c2.b);
                V v4 = c5.c;
                c<V> c10 = new c<V>(-l5, c2.c, c4, c8.d(l5 + c8.b));
                long l7 = c2.b;
                long l8 = -l7;
                long l9 = c5.b;
                c<V> c11 = new c<V>(l8 - l9, v2, c9.d(l7 + (l9 + c9.b)), c3);
                c<V> c12 = new c<V>(l6, v4, c10, c11);
                return c12;
            }
            if (n3 >= n2 * 5) {
                c<V> c13 = c3.d;
                c<V> c14 = c3.e;
                if (c13.f < 2 * c14.f) {
                    long l10 = c3.b;
                    long l11 = l10 + l2;
                    V v5 = c3.c;
                    c<V> c15 = new c<V>(-l10, v2, c2, c13.d(l10 + c13.b));
                    c<V> c16 = new c<V>(l11, v5, c15, c14);
                    return c16;
                }
                c<V> c17 = c13.d;
                c<V> c18 = c13.e;
                long l12 = c13.b;
                long l13 = c3.b;
                long l14 = l2 + (l12 + l13);
                V v6 = c13.c;
                c<V> c19 = new c<V>(-l13 - l12, v2, c2, c17.d(l13 + (l12 + c17.b)));
                long l15 = c13.b;
                c<V> c20 = new c<V>(-l15, c3.c, c18.d(l15 + c18.b), c14);
                c<V> c21 = new c<V>(l14, v6, c19, c20);
                return c21;
            }
        }
        c<V> c22 = new c<V>(l2, v2, c2, c3);
        return c22;
    }

    public final c<V> d(long l2) {
        if (this.f != 0) {
            if (l2 == this.b) {
                return this;
            }
            c<V> c2 = new c<V>(l2, this.c, this.d, this.e);
            return c2;
        }
        return this;
    }
}

