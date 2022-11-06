/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.NoSuchElementException
 *  java.util.Objects
 */
package k.b0.x.b.y0;

import java.util.NoSuchElementException;
import java.util.Objects;
import k.b0.x.b.y0.a;
import k.b0.x.b.y0.c;
import k.b0.x.b.y0.d;
import k.b0.x.b.y0.e;

public final class b<K, V> {
    public static final b<Object, Object> a = new b<K, V>(d.a, 0);
    public final d<a<e<K, V>>> b;
    public final int c;

    public b(d<a<e<K, V>>> d2, int n2) {
        this.b = d2;
        this.c = n2;
    }

    public b<K, V> a(K k2, V v2) {
        a<Object> a2;
        int n2;
        block7 : {
            block8 : {
                Object e2;
                int n3;
                block6 : {
                    int n4 = k2.hashCode();
                    a2 = (a<Object>)this.b.b.a(n4);
                    if (a2 == null) {
                        a2 = a.k;
                    }
                    n2 = a2.n;
                    n3 = 0;
                    a<Object> a3 = a2;
                    while (a3 != null && a3.n > 0) {
                        if (!((e)a3.l).k.equals(k2)) {
                            a3 = a3.m;
                            ++n3;
                            continue;
                        }
                        break block6;
                    }
                    n3 = -1;
                }
                if (n3 == -1) break block7;
                if (n3 < 0 || n3 > a2.n) break block8;
                try {
                    e2 = a2.k((int)n3).l;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw new IndexOutOfBoundsException(e.e.a.a.a.f((String)"Index: ", (int)n3));
                }
                a2 = a2.h(e2);
                break block7;
            }
            throw new IndexOutOfBoundsException();
        }
        e<K, V> e3 = new e<K, V>(k2, v2);
        Objects.requireNonNull(a2);
        a<Object> a4 = new a<Object>(e3, a2);
        d<a<Object>> d2 = this.b;
        int n5 = k2.hashCode();
        c<a<Object>> c2 = d2.b.b(n5, a4);
        if (c2 != d2.b) {
            d2 = new d<a<Object>>(c2);
        }
        return new b<K, V>(d2, this.c - n2 + a4.n);
    }
}

