/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.d0.g
 */
package k.b0.x.b.x0.g;

import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.g.g;
import k.x.c.i;

public final class a {
    @Deprecated
    public static final e a;
    public final c b;
    public final c c;
    public final e d;
    public final c e;

    public static {
        e e2;
        a = e2 = g.g;
        i.d(c.k(e2), "topLevel(LOCAL_NAME)");
    }

    public a(c c2, e e2) {
        i.e(c2, "packageName");
        i.e(e2, "callableName");
        i.e(c2, "packageName");
        i.e(e2, "callableName");
        this.b = c2;
        this.c = null;
        this.d = e2;
        this.e = null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        if (!i.a(this.b, a2.b)) {
            return false;
        }
        if (!i.a(this.c, a2.c)) {
            return false;
        }
        if (!i.a(this.d, a2.d)) {
            return false;
        }
        return i.a(this.e, a2.e);
    }

    public int hashCode() {
        int n2 = 31 * this.b.hashCode();
        c c2 = this.c;
        int n3 = c2 == null ? 0 : c2.hashCode();
        int n4 = 31 * (31 * (n2 + n3) + this.d.hashCode());
        c c3 = this.e;
        int n5 = c3 == null ? 0 : c3.hashCode();
        return n4 + n5;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.b.b();
        i.d(string, "packageName.asString()");
        stringBuilder.append(k.d0.g.v((String)string, (char)'.', (char)'/', (boolean)false, (int)4));
        stringBuilder.append("/");
        c c2 = this.c;
        if (c2 != null) {
            stringBuilder.append((Object)c2);
            stringBuilder.append(".");
        }
        stringBuilder.append((Object)this.d);
        String string2 = stringBuilder.toString();
        i.d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}

