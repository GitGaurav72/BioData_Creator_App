/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.i.q$a
 *  k.b0.x.b.x0.i.q$b
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.i;

import k.b0.x.b.x0.i.q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/*
 * Exception performing whole class analysis.
 */
public abstract class q
extends Enum<q> {
    public static final /* enum */ q k;
    public static final /* enum */ q l;
    public static final /* synthetic */ q[] m;

    public static {
        b b2 = new /* Unavailable Anonymous Inner Class!! */;
        k = b2;
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        l = a2;
        m = new q[]{b2, a2};
    }

    public q(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static q valueOf(String string) {
        return (q)Enum.valueOf(q.class, (String)string);
    }

    public static q[] values() {
        return (q[])m.clone();
    }

    public abstract String b(String var1);
}

