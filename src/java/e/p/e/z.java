/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.e.a0
 *  e.p.e.z$a
 *  e.p.e.z$b
 *  e.p.e.z$c
 *  e.p.e.z$d
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e.p.e;

import e.p.e.a0;
import e.p.e.z;

public abstract class z
extends Enum<z>
implements a0 {
    public static final /* enum */ z k;
    public static final /* enum */ z l;
    public static final /* enum */ z m;
    public static final /* enum */ z n;
    public static final /* synthetic */ z[] o;

    public static {
        a a2 = new a("DOUBLE", 0);
        k = a2;
        b b2 = new b("LAZILY_PARSED_NUMBER", 1);
        l = b2;
        c c2 = new c("LONG_OR_DOUBLE", 2);
        m = c2;
        d d2 = new d("BIG_DECIMAL", 3);
        n = d2;
        o = new z[]{a2, b2, c2, d2};
    }

    public z(a a2) {
    }

    public static z valueOf(String string) {
        return (z)Enum.valueOf(z.class, (String)string);
    }

    public static z[] values() {
        return (z[])o.clone();
    }
}

