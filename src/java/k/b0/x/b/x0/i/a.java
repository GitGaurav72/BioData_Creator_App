/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package k.b0.x.b.x0.i;

public final class a
extends Enum<a> {
    public static final /* enum */ a k;
    public static final /* enum */ a l;
    public static final /* enum */ a m;
    public static final /* synthetic */ a[] n;
    public final boolean o;
    public final boolean p;

    public static {
        a a2;
        a a3;
        a a4;
        k = a3 = new a(false, false, 3);
        l = a4 = new a(true, false, 2);
        m = a2 = new a(true, true);
        n = new a[]{a3, a4, a2};
    }

    public a(boolean bl, boolean bl2) {
        this.o = bl;
        this.p = bl2;
    }

    public a(boolean bl, boolean bl2, int n3) {
        if ((n3 & 1) != 0) {
            bl = false;
        }
        if ((n3 & 2) != 0) {
            bl2 = false;
        }
        this.o = bl;
        this.p = bl2;
    }

    public static a valueOf(String string) {
        return (a)Enum.valueOf(a.class, (String)string);
    }

    public static a[] values() {
        return (a[])n.clone();
    }
}

