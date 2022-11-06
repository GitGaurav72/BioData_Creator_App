/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package k.b0.x.b.x0.k.b;

import e.e.a.a.a;
import k.b0.x.b.x0.g.b;
import k.x.c.i;

public final class s<T> {
    public final T a;
    public final T b;
    public final String c;
    public final b d;

    public s(T t2, T t3, String string, b b2) {
        i.e(string, "filePath");
        i.e(b2, "classId");
        this.a = t2;
        this.b = t3;
        this.c = string;
        this.d = b2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        if (!i.a(this.a, s2.a)) {
            return false;
        }
        if (!i.a(this.b, s2.b)) {
            return false;
        }
        if (!i.a(this.c, s2.c)) {
            return false;
        }
        return i.a(this.d, s2.d);
    }

    public int hashCode() {
        T t2 = this.a;
        int n2 = t2 == null ? 0 : t2.hashCode();
        int n3 = n2 * 31;
        T t3 = this.b;
        int n4 = t3 == null ? 0 : t3.hashCode();
        return 31 * (31 * (n3 + n4) + this.c.hashCode()) + this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"IncompatibleVersionErrorData(actualVersion=");
        stringBuilder.append(this.a);
        stringBuilder.append(", expectedVersion=");
        stringBuilder.append(this.b);
        stringBuilder.append(", filePath=");
        stringBuilder.append(this.c);
        stringBuilder.append(", classId=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

