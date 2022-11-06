/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e.a.a;

public final class a
extends Enum<a> {
    public static final /* enum */ a k;
    public static final /* synthetic */ a[] l;

    public static {
        a a2;
        a[] arra = new a[2];
        arra[0] = new a();
        k = a2 = new a();
        arra[1] = a2;
        l = arra;
    }

    public static a valueOf(String string2) {
        return (a)Enum.valueOf(a.class, (String)string2);
    }

    public static a[] values() {
        return (a[])l.clone();
    }
}

