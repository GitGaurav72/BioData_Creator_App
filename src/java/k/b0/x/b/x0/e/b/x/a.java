/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  k.b0.x.b.x0.f.a0.b.e
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.e.b.x;

import java.util.LinkedHashMap;
import java.util.Map;
import k.b0.x.b.x0.f.a0.b.e;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a {
    public final a a;
    public final e b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String f;
    public final int g;

    public a(a a2, e e2, String[] arrstring, String[] arrstring2, String[] arrstring3, String string, int n2, String string2, byte[] arrby) {
        i.e((Object)a2, "kind");
        i.e((Object)e2, "metadataVersion");
        this.a = a2;
        this.b = e2;
        this.c = arrstring;
        this.d = arrstring2;
        this.e = arrstring3;
        this.f = string;
        this.g = n2;
    }

    public final String a() {
        String string = this.f;
        boolean bl = this.a == a.r;
        if (bl) {
            return string;
        }
        return null;
    }

    public final boolean b(int n2, int n3) {
        return (n2 & n3) != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.a);
        stringBuilder.append(" version=");
        stringBuilder.append((Object)this.b);
        return stringBuilder.toString();
    }

    public static final class k.b0.x.b.x0.e.b.x.a$a
    extends Enum<k.b0.x.b.x0.e.b.x.a$a> {
        public static final a k;
        public static final Map<Integer, k.b0.x.b.x0.e.b.x.a$a> l;
        public static final /* enum */ k.b0.x.b.x0.e.b.x.a$a m;
        public static final /* enum */ k.b0.x.b.x0.e.b.x.a$a n;
        public static final /* enum */ k.b0.x.b.x0.e.b.x.a$a o;
        public static final /* enum */ k.b0.x.b.x0.e.b.x.a$a p;
        public static final /* enum */ k.b0.x.b.x0.e.b.x.a$a q;
        public static final /* enum */ k.b0.x.b.x0.e.b.x.a$a r;
        public static final /* synthetic */ k.b0.x.b.x0.e.b.x.a$a[] s;
        public final int t;

        public static {
            k.b0.x.b.x0.e.b.x.a$a a2;
            k.b0.x.b.x0.e.b.x.a$a a3;
            k.b0.x.b.x0.e.b.x.a$a a4;
            k.b0.x.b.x0.e.b.x.a$a a5;
            k.b0.x.b.x0.e.b.x.a$a a6;
            k.b0.x.b.x0.e.b.x.a$a a7;
            int n2 = 0;
            m = a7 = new k.b0.x.b.x0.e.b.x.a$a(0);
            n = a3 = new k.b0.x.b.x0.e.b.x.a$a(1);
            o = a5 = new k.b0.x.b.x0.e.b.x.a$a(2);
            p = a2 = new k.b0.x.b.x0.e.b.x.a$a(3);
            q = a4 = new k.b0.x.b.x0.e.b.x.a$a(4);
            r = a6 = new k.b0.x.b.x0.e.b.x.a$a(5);
            s = new k.b0.x.b.x0.e.b.x.a$a[]{a7, a3, a5, a2, a4, a6};
            k = new a(null);
            k.b0.x.b.x0.e.b.x.a$a[] arra = k.b0.x.b.x0.e.b.x.a$a.values();
            int n3 = e.s.a.a.R2((int)6);
            if (n3 < 16) {
                n3 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(n3);
            while (n2 < 6) {
                k.b0.x.b.x0.e.b.x.a$a a8 = arra[n2];
                ++n2;
                linkedHashMap.put((Object)a8.t, (Object)a8);
            }
            l = linkedHashMap;
        }

        public k.b0.x.b.x0.e.b.x.a$a(int n3) {
            this.t = n3;
        }

        public static k.b0.x.b.x0.e.b.x.a$a valueOf(String string) {
            return (k.b0.x.b.x0.e.b.x.a$a)Enum.valueOf(k.b0.x.b.x0.e.b.x.a$a.class, (String)string);
        }

        public static k.b0.x.b.x0.e.b.x.a$a[] values() {
            return (k.b0.x.b.x0.e.b.x.a$a[])s.clone();
        }

        public static final class a {
            public a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

    }

}

