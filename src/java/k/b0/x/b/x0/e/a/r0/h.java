/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package k.b0.x.b.x0.e.a.r0;

import e.e.a.a.a;
import java.util.Objects;
import k.b0.x.b.x0.e.a.r0.g;
import k.x.c.i;

public final class h {
    public final g a;
    public final boolean b;

    public h(g g2, boolean bl) {
        i.e((Object)g2, "qualifier");
        this.a = g2;
        this.b = bl;
    }

    public static h a(h h2, g g2, boolean bl, int n2) {
        if ((n2 & 1) != 0) {
            g2 = h2.a;
        }
        if ((n2 & 2) != 0) {
            bl = h2.b;
        }
        Objects.requireNonNull((Object)h2);
        i.e((Object)g2, "qualifier");
        return new h(g2, bl);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        h h2 = (h)object;
        if (this.a != h2.a) {
            return false;
        }
        return this.b == h2.b;
    }

    public int hashCode() {
        int n2 = 31 * this.a.hashCode();
        int n3 = this.b ? 1 : 0;
        if (n3 != 0) {
            n3 = 1;
        }
        return n2 + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"NullabilityQualifierWithMigrationStatus(qualifier=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", isForWarningOnly=");
        return a.r((StringBuilder)stringBuilder, (boolean)this.b, (char)')');
    }
}

