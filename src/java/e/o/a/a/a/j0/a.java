/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package e.o.a.a.a.j0;

import java.util.Objects;

public final class a {
    public static final a a = a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L);
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    @Deprecated
    public a(long l2, long l3, long l4, long l5, long l6, long l7, long l8) {
        if (l2 >= 0L && l3 >= 0L && l4 >= 0L && l5 >= 0L && l6 >= 0L && l7 >= 0L && l8 >= 0L) {
            this.b = l2;
            this.c = l3;
            this.d = l4;
            this.e = l5;
            this.f = l6;
            this.g = l7;
            this.h = l8;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static a a(long l2, long l3, long l4, long l5, long l6, long l7, long l8) {
        a a2 = new a(l2, l3, l4, l5, l6, l7, l8);
        return a2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.b == a2.b && this.c == a2.c && this.d == a2.d && this.e == a2.e && this.f == a2.f && this.g == a2.g && this.h == a2.h;
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h};
        return Objects.hash((Object[])arrobject);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.class.getSimpleName());
        stringBuilder.append('{');
        stringBuilder.append("hitCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", missCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", loadSuccessCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", loadFailureCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", totalLoadTime=");
        stringBuilder.append(this.f);
        stringBuilder.append(", evictionCount=");
        stringBuilder.append(this.g);
        stringBuilder.append(", evictionWeight=");
        stringBuilder.append(this.h);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

