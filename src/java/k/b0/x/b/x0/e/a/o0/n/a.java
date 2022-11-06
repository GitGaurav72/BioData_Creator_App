/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.e.a.m0.k
 *  k.b0.x.b.x0.m.m0
 */
package k.b0.x.b.x0.e.a.o0.n;

import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.e.a.m0.k;
import k.b0.x.b.x0.e.a.o0.n.b;
import k.b0.x.b.x0.m.m0;
import k.x.c.i;

public final class a {
    public final k a;
    public final b b;
    public final boolean c;
    public final Set<z0> d;
    public final m0 e;

    public a(k k2, b b2, boolean bl, Set<? extends z0> set, m0 m02) {
        i.e((Object)k2, "howThisTypeIsUsed");
        i.e((Object)b2, "flexibility");
        this.a = k2;
        this.b = b2;
        this.c = bl;
        this.d = set;
        this.e = m02;
    }

    public /* synthetic */ a(k k2, b b2, boolean bl, Set set, m0 m02, int n2) {
        b b3 = (n2 & 2) != 0 ? b.k : null;
        if ((n2 & 4) != 0) {
            bl = false;
        }
        boolean bl2 = bl;
        Set set2 = (n2 & 8) != 0 ? null : set;
        n2 & 16;
        this(k2, b3, bl2, (Set<? extends z0>)set2, null);
    }

    public static a a(a a2, k k2, b b2, boolean bl, Set set, m0 m02, int n2) {
        k k3 = (n2 & 1) != 0 ? a2.a : null;
        k k4 = k3;
        if ((n2 & 2) != 0) {
            b2 = a2.b;
        }
        b b3 = b2;
        if ((n2 & 4) != 0) {
            bl = a2.c;
        }
        boolean bl2 = bl;
        if ((n2 & 8) != 0) {
            set = a2.d;
        }
        Set<z0> set2 = set;
        if ((n2 & 16) != 0) {
            m02 = a2.e;
        }
        m0 m03 = m02;
        Objects.requireNonNull((Object)a2);
        i.e((Object)k4, "howThisTypeIsUsed");
        i.e((Object)b3, "flexibility");
        a a3 = new a(k4, b3, bl2, set2, m03);
        return a3;
    }

    public final a b(b b2) {
        i.e((Object)b2, "flexibility");
        return a.a(this, null, b2, false, null, null, 29);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        if (this.a != a2.a) {
            return false;
        }
        if (this.b != a2.b) {
            return false;
        }
        if (this.c != a2.c) {
            return false;
        }
        if (!i.a(this.d, a2.d)) {
            return false;
        }
        return i.a((Object)this.e, (Object)a2.e);
    }

    public int hashCode() {
        int n2 = 31 * (31 * this.a.hashCode() + this.b.hashCode());
        int n3 = this.c ? 1 : 0;
        if (n3 != 0) {
            n3 = 1;
        }
        int n4 = 31 * (n2 + n3);
        Set<z0> set = this.d;
        int n5 = set == null ? 0 : set.hashCode();
        int n6 = 31 * (n4 + n5);
        m0 m02 = this.e;
        int n7 = m02 == null ? 0 : m02.hashCode();
        return n6 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"JavaTypeAttributes(howThisTypeIsUsed=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", flexibility=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", isForAnnotationParameter=");
        stringBuilder.append(this.c);
        stringBuilder.append(", visitedTypeParameters=");
        stringBuilder.append(this.d);
        stringBuilder.append(", defaultType=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

