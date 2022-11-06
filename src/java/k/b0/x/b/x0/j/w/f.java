/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package k.b0.x.b.x0.j.w;

import k.b0.x.b.x0.g.b;
import k.x.c.i;

public final class f {
    public final b a;
    public final int b;

    public f(b b2, int n2) {
        i.e(b2, "classId");
        this.a = b2;
        this.b = n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        f f2 = (f)object;
        if (!i.a(this.a, f2.a)) {
            return false;
        }
        return this.b == f2.b;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.b;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append("kotlin/Array<");
        }
        stringBuilder.append((Object)this.a);
        int n4 = this.b;
        while (n3 < n4) {
            ++n3;
            stringBuilder.append(">");
        }
        String string = stringBuilder.toString();
        i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

