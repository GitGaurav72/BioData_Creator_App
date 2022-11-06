/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package k.b0.x.b.x0.m;

public final class n1
extends Enum<n1> {
    public static final /* enum */ n1 k;
    public static final /* enum */ n1 l;
    public static final /* enum */ n1 m;
    public static final /* synthetic */ n1[] n;
    public final String o;
    public final boolean p;

    public static {
        n1 n12;
        n1 n13;
        n1 n14;
        k = n12 = new n1("", true, true, 0);
        l = n13 = new n1("in", true, false, -1);
        m = n14 = new n1("out", false, true, 1);
        n = new n1[]{n12, n13, n14};
    }

    public n1(String string2, boolean bl, boolean bl2, int n3) {
        this.o = string2;
        this.p = bl2;
    }

    public static n1 valueOf(String string) {
        return (n1)Enum.valueOf(n1.class, (String)string);
    }

    public static n1[] values() {
        return (n1[])n.clone();
    }

    public String toString() {
        return this.o;
    }
}

