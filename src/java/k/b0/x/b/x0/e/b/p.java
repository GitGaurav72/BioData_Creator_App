/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.f.a0.b.d$a
 *  k.b0.x.b.x0.f.a0.b.d$b
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.e.b;

import e.e.a.a.a;
import k.b0.x.b.x0.f.a0.b.d;
import k.g;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class p {
    public final String a;

    public p(String string, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = string;
    }

    public static final p a(String string, String string2) {
        i.e(string, "name");
        i.e(string2, "desc");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append('#');
        stringBuilder.append(string2);
        return new p(stringBuilder.toString(), null);
    }

    public static final p b(d d2) {
        i.e(d2, "signature");
        if (d2 instanceof d.b) {
            return p.c(d2.c(), d2.b());
        }
        if (d2 instanceof d.a) {
            return p.a(d2.c(), d2.b());
        }
        throw new g();
    }

    public static final p c(String string, String string2) {
        i.e(string, "name");
        i.e(string2, "desc");
        return new p(i.k(string, string2), null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        p p2 = (p)object;
        return i.a(this.a, p2.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.p((StringBuilder)a.t((String)"MemberSignature(signature="), (String)this.a, (char)')');
    }
}

