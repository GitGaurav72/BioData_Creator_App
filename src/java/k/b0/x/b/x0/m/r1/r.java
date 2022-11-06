/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package k.b0.x.b.x0.m.r1;

public final class r
extends Enum<r> {
    public static final /* enum */ r k;
    public static final /* enum */ r l;
    public static final /* enum */ r m;
    public static final /* synthetic */ r[] n;
    public final String o;

    public static {
        r r2;
        r r3;
        r r4;
        k = r4 = new r("in");
        l = r2 = new r("out");
        m = r3 = new r("");
        n = new r[]{r4, r2, r3};
    }

    public r(String string2) {
        this.o = string2;
    }

    public static r valueOf(String string) {
        return (r)Enum.valueOf(r.class, (String)string);
    }

    public static r[] values() {
        return (r[])n.clone();
    }

    public String toString() {
        return this.o;
    }
}

