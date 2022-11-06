/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  k.b0.x.b.x0.e.a.a
 */
package k.b0.x.b.x0.e.a;

import java.util.Collection;
import k.b0.x.b.x0.e.a.a;
import k.b0.x.b.x0.e.a.r0.g;
import k.b0.x.b.x0.e.a.r0.h;
import k.x.c.i;

public final class t {
    public final h a;
    public final Collection<a> b;
    public final boolean c;

    public t(h h2, Collection<? extends a> collection, boolean bl) {
        i.e(h2, "nullabilityQualifier");
        i.e(collection, "qualifierApplicabilityTypes");
        this.a = h2;
        this.b = collection;
        this.c = bl;
    }

    public t(h h2, Collection collection, boolean bl, int n2) {
        if ((n2 & 4) != 0) {
            bl = h2.a == g.m;
        }
        this(h2, (Collection<? extends a>)collection, bl);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof t)) {
            return false;
        }
        t t2 = (t)object;
        if (!i.a(this.a, t2.a)) {
            return false;
        }
        if (!i.a(this.b, t2.b)) {
            return false;
        }
        return this.c == t2.c;
    }

    public int hashCode() {
        int n2 = 31 * (31 * this.a.hashCode() + this.b.hashCode());
        int n3 = this.c ? 1 : 0;
        if (n3 != 0) {
            n3 = 1;
        }
        return n2 + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"JavaDefaultQualifiers(nullabilityQualifier=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", qualifierApplicabilityTypes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", definitelyNotNull=");
        return e.e.a.a.a.r((StringBuilder)stringBuilder, (boolean)this.c, (char)')');
    }
}

