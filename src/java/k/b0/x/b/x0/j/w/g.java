/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.j.w;

import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.m.f0;
import k.x.c.i;

public abstract class g<T> {
    public final T a;

    public g(T t2) {
        this.a = t2;
    }

    public abstract f0 a(d0 var1);

    public T b() {
        return this.a;
    }

    public boolean equals(Object object) {
        g g2;
        Object var4_4;
        T t2;
        return this == object || i.a(t2 = this.b(), var4_4 = (g2 = object instanceof g ? (g)object : null) == null ? null : g2.b());
        {
        }
    }

    public int hashCode() {
        T t2 = this.b();
        if (t2 == null) {
            return 0;
        }
        return t2.hashCode();
    }

    public String toString() {
        return String.valueOf(this.b());
    }
}

