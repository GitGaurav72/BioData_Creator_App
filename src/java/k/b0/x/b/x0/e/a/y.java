/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  k.b0.x.b.x0.e.a.b0
 *  k.b0.x.b.x0.e.a.h0
 *  k.b0.x.b.x0.e.a.y$a
 *  k.x.b.l
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.e.a;

import java.util.Map;
import k.b0.x.b.x0.e.a.b0;
import k.b0.x.b.x0.e.a.h0;
import k.b0.x.b.x0.e.a.w;
import k.b0.x.b.x0.e.a.x;
import k.b0.x.b.x0.e.a.y;
import k.b0.x.b.x0.g.c;
import k.d;
import k.x.b.l;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class y {
    public static final b a = new b(null);
    public static final y b;
    public final b0 c;
    public final l<c, h0> d;
    public final boolean e;

    public static {
        d d2 = d.k;
        i.e(d2, "configuredKotlinVersion");
        x x2 = w.d;
        d d3 = x2.d;
        h0 h02 = d3 != null && d3.b(d2) <= 0 ? x2.e : x2.c;
        i.e((Object)h02, "globalReportLevel");
        h0 h03 = h02 == h0.l ? null : h02;
        b = new y(new b0(h02, h03, null, 4), (l<? super c, ? extends h0>)a.k);
    }

    public y(b0 b02, l<? super c, ? extends h0> l2) {
        c c2;
        i.e((Object)b02, "jsr305");
        i.e(l2, "getReportLevelForAnnotation");
        this.c = b02;
        this.d = l2;
        boolean bl = b02.e || ((a)l2).invoke((Object)(c2 = w.a)) == h0.k;
        this.e = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"JavaTypeEnhancementState(jsr305=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", getReportLevelForAnnotation=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

}

