/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  n.h
 *  n.h$a
 */
package m.m0.j;

import k.x.c.i;
import n.h;

public final class c {
    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public final int g;
    public final h h;
    public final h i;

    public static {
        h.a a2 = h.l;
        a = a2.b(":");
        b = a2.b(":status");
        c = a2.b(":method");
        d = a2.b(":path");
        e = a2.b(":scheme");
        f = a2.b(":authority");
    }

    public c(String string, String string2) {
        i.e(string, "name");
        i.e(string2, "value");
        h.a a2 = h.l;
        this(a2.b(string), a2.b(string2));
    }

    public c(h h2, String string) {
        i.e((Object)h2, "name");
        i.e(string, "value");
        this(h2, h.l.b(string));
    }

    public c(h h2, h h3) {
        i.e((Object)h2, "name");
        i.e((Object)h3, "value");
        this.h = h2;
        this.i = h3;
        this.g = 32 + h2.n() + h3.n();
    }

    public boolean equals(Object object) {
        block2 : {
            block3 : {
                if (this == object) break block2;
                if (!(object instanceof c)) break block3;
                c c2 = (c)object;
                if (i.a((Object)this.h, (Object)c2.h) && i.a((Object)this.i, (Object)c2.i)) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        h h2 = this.h;
        int n2 = h2 != null ? h2.hashCode() : 0;
        int n3 = n2 * 31;
        h h3 = this.i;
        int n4 = 0;
        if (h3 != null) {
            n4 = h3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h.w());
        stringBuilder.append(": ");
        stringBuilder.append(this.i.w());
        return stringBuilder.toString();
    }
}

