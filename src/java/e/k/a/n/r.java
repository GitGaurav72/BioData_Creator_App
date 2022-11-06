/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e.k.a.n;

public final class r
extends Enum<r> {
    public static final /* enum */ r k;
    public static final /* enum */ r l;
    public static final /* synthetic */ r[] m;

    public static {
        r r2;
        r r3;
        k = r3 = new r();
        l = r2 = new r();
        m = new r[]{r3, r2};
    }

    public static r valueOf(String string) {
        return (r)Enum.valueOf(r.class, (String)string);
    }

    public static r[] values() {
        return (r[])m.clone();
    }
}

