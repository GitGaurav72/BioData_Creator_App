/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.f.c
 */
package k.b0.x.b.x0.k.b;

import e.e.a.a.a;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.f.z.c;
import k.x.c.i;

public final class f {
    public final c a;
    public final k.b0.x.b.x0.f.c b;
    public final k.b0.x.b.x0.f.z.a c;
    public final u0 d;

    public f(c c2, k.b0.x.b.x0.f.c c3, k.b0.x.b.x0.f.z.a a2, u0 u02) {
        i.e(c2, "nameResolver");
        i.e((Object)c3, "classProto");
        i.e(a2, "metadataVersion");
        i.e((Object)u02, "sourceElement");
        this.a = c2;
        this.b = c3;
        this.c = a2;
        this.d = u02;
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
        if (!i.a((Object)this.b, (Object)f2.b)) {
            return false;
        }
        if (!i.a(this.c, f2.c)) {
            return false;
        }
        return i.a((Object)this.d, (Object)f2.d);
    }

    public int hashCode() {
        return 31 * (31 * (31 * this.a.hashCode() + this.b.hashCode()) + this.c.hashCode()) + this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"ClassData(nameResolver=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", classProto=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", metadataVersion=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", sourceElement=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

