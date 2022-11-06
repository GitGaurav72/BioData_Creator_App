/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e.p.a.a;

public final class b
extends Enum<b> {
    public static final /* enum */ b k;
    public static final /* enum */ b l;
    public static final /* enum */ b m;
    public static final /* synthetic */ b[] n;

    public static {
        b b2;
        b b3;
        b b4;
        k = b3 = new b();
        l = b2 = new b();
        m = b4 = new b();
        n = new b[]{b3, b2, b4};
    }

    public static b valueOf(String string) {
        return (b)Enum.valueOf(b.class, (String)string);
    }

    public static b[] values() {
        return (b[])n.clone();
    }
}

