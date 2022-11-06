/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.e.a.h0
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.e.a;

import k.b0.x.b.x0.e.a.h0;
import k.d;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class x {
    public static final a a = new a(null);
    public static final x b = new x(h0.m, null, null, 6);
    public final h0 c;
    public final d d;
    public final h0 e;

    public x(h0 h02, d d2, h0 h03) {
        i.e((Object)h02, "reportLevelBefore");
        i.e((Object)h03, "reportLevelAfter");
        this.c = h02;
        this.d = d2;
        this.e = h03;
    }

    public x(h0 h02, d d2, h0 h03, int n2) {
        d d3 = (n2 & 2) != 0 ? new d(1, 0, 0) : null;
        int n3 = n2 & 4;
        h0 h04 = null;
        if (n3 != 0) {
            h04 = h02;
        }
        this(h02, d3, h04);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x)) {
            return false;
        }
        x x2 = (x)object;
        if (this.c != x2.c) {
            return false;
        }
        if (!i.a(this.d, x2.d)) {
            return false;
        }
        return this.e == x2.e;
    }

    public int hashCode() {
        int n2 = 31 * this.c.hashCode();
        d d2 = this.d;
        int n3 = d2 == null ? 0 : d2.o;
        return 31 * (n2 + n3) + this.e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"JavaNullabilityAnnotationsStatus(reportLevelBefore=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", sinceVersion=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", reportLevelAfter=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

}

