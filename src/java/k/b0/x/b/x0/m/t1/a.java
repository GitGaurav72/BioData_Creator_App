/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package k.b0.x.b.x0.m.t1;

import k.x.c.i;

public final class a<T> {
    public final T a;
    public final T b;

    public a(T t2, T t3) {
        this.a = t2;
        this.b = t3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        if (!i.a(this.a, a2.a)) {
            return false;
        }
        return i.a(this.b, a2.b);
    }

    public int hashCode() {
        T t2 = this.a;
        int n2 = t2 == null ? 0 : t2.hashCode();
        int n3 = n2 * 31;
        T t3 = this.b;
        int n4 = t3 == null ? 0 : t3.hashCode();
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"ApproximationBounds(lower=");
        stringBuilder.append(this.a);
        stringBuilder.append(", upper=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

