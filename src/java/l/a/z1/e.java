/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package l.a.z1;

public final class e
extends Enum<e> {
    public static final /* enum */ e k;
    public static final /* enum */ e l;
    public static final /* enum */ e m;
    public static final /* synthetic */ e[] n;

    public static {
        e e2;
        e e3;
        e e4;
        k = e4 = new e();
        l = e3 = new e();
        m = e2 = new e();
        n = new e[]{e4, e3, e2};
    }

    public static e valueOf(String string) {
        return (e)Enum.valueOf(e.class, (String)string);
    }

    public static e[] values() {
        return (e[])n.clone();
    }
}

