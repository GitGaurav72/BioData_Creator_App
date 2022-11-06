/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Set
 *  k.s.i
 */
package k.b0.x.b.x0.i;

import e.s.a.a;
import java.util.ArrayList;
import java.util.Set;
import k.s.i;

public final class h
extends Enum<h> {
    public static final /* synthetic */ h[] A;
    public static final Set<h> k;
    public static final Set<h> l;
    public static final /* enum */ h m;
    public static final /* enum */ h n;
    public static final /* enum */ h o;
    public static final /* enum */ h p;
    public static final /* enum */ h q;
    public static final /* enum */ h r;
    public static final /* enum */ h s;
    public static final /* enum */ h t;
    public static final /* enum */ h u;
    public static final /* enum */ h v;
    public static final /* enum */ h w;
    public static final /* enum */ h x;
    public static final /* enum */ h y;
    public static final /* enum */ h z;
    public final boolean B;

    public static {
        h h2;
        h h3;
        h h4;
        h h5;
        h h6;
        h h7;
        h h8;
        h h9;
        h h10;
        h h11;
        h h12;
        h h13;
        h h14;
        h h15;
        m = h9 = new h(true);
        n = h12 = new h(true);
        o = h2 = new h(true);
        p = h13 = new h(false);
        q = h7 = new h(true);
        r = h3 = new h(true);
        s = h11 = new h(true);
        t = h6 = new h(true);
        u = h4 = new h(true);
        v = h8 = new h(true);
        w = h5 = new h(true);
        x = h10 = new h(true);
        y = h14 = new h(true);
        z = h15 = new h(true);
        A = new h[]{h9, h12, h2, h13, h7, h3, h11, h6, h4, h8, h5, h10, h14, h15};
        h[] arrh = h.values();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 14; ++i2) {
            h h16 = arrh[i2];
            if (!h16.B) continue;
            arrayList.add((Object)h16);
        }
        k = i.j0((Iterable)arrayList);
        l = a.p4((Object[])h.values());
    }

    public h(boolean bl) {
        this.B = bl;
    }

    public static h valueOf(String string) {
        return (h)Enum.valueOf(h.class, (String)string);
    }

    public static h[] values() {
        return (h[])A.clone();
    }
}

