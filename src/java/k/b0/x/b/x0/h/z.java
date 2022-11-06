/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package k.b0.x.b.x0.h;

import k.b0.x.b.x0.h.c;

public final class z
extends Enum<z> {
    public static final /* enum */ z k;
    public static final /* enum */ z l;
    public static final /* enum */ z m;
    public static final /* enum */ z n;
    public static final /* enum */ z o;
    public static final /* enum */ z p;
    public static final /* enum */ z q;
    public static final /* enum */ z r;
    public static final /* enum */ z s;
    public static final /* synthetic */ z[] t;
    public final Object u;

    public static {
        z z2;
        z z3;
        z z4;
        z z5;
        z z6;
        z z7;
        z z8;
        z z9;
        z z10;
        k = z2 = new z(0);
        l = z3 = new z(0L);
        m = z10 = new z((Object)Float.valueOf((float)0.0f));
        n = z7 = new z(0.0);
        o = z9 = new z((Object)Boolean.FALSE);
        p = z4 = new z("");
        q = z6 = new z(c.k);
        r = z8 = new z(null);
        s = z5 = new z(null);
        t = new z[]{z2, z3, z10, z7, z9, z4, z6, z8, z5};
    }

    public z(Object object) {
        this.u = object;
    }

    public static z valueOf(String string) {
        return (z)Enum.valueOf(z.class, (String)string);
    }

    public static z[] values() {
        return (z[])t.clone();
    }
}

