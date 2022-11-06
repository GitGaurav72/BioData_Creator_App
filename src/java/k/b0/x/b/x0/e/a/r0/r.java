/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.e.a.r0;

import e.e.a.a.a;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.e.a.t;
import k.b0.x.b.x0.m.f0;
import k.x.c.i;

public final class r {
    public final f0 a;
    public final t b;
    public final z0 c;
    public final boolean d;

    public r(f0 f02, t t2, z0 z02, boolean bl) {
        i.e((Object)f02, "type");
        this.a = f02;
        this.b = t2;
        this.c = z02;
        this.d = bl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof r)) {
            return false;
        }
        r r2 = (r)object;
        if (!i.a((Object)this.a, (Object)r2.a)) {
            return false;
        }
        if (!i.a(this.b, r2.b)) {
            return false;
        }
        if (!i.a((Object)this.c, (Object)r2.c)) {
            return false;
        }
        return this.d == r2.d;
    }

    public int hashCode() {
        int n2 = 31 * this.a.hashCode();
        t t2 = this.b;
        int n3 = t2 == null ? 0 : t2.hashCode();
        int n4 = 31 * (n2 + n3);
        z0 z02 = this.c;
        int n5 = z02 == null ? 0 : z02.hashCode();
        int n6 = 31 * (n4 + n5);
        int n7 = this.d ? 1 : 0;
        if (n7 != 0) {
            n7 = 1;
        }
        return n6 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"TypeAndDefaultQualifiers(type=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", defaultQualifiers=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", typeParameterForArgument=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", isFromStarProjection=");
        return a.r((StringBuilder)stringBuilder, (boolean)this.d, (char)')');
    }
}

