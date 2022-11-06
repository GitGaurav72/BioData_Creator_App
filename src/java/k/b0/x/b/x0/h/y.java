/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.h.y$a
 *  k.b0.x.b.x0.h.y$b
 *  k.b0.x.b.x0.h.y$c
 *  k.b0.x.b.x0.h.y$d
 */
package k.b0.x.b.x0.h;

import k.b0.x.b.x0.h.x;
import k.b0.x.b.x0.h.y;
import k.b0.x.b.x0.h.z;

public class y
extends Enum<y> {
    public static final /* enum */ y A;
    public static final /* enum */ y B;
    public static final /* synthetic */ y[] C;
    public static final /* enum */ y k;
    public static final /* enum */ y l;
    public static final /* enum */ y m;
    public static final /* enum */ y n;
    public static final /* enum */ y o;
    public static final /* enum */ y p;
    public static final /* enum */ y q;
    public static final /* enum */ y r;
    public static final /* enum */ y s;
    public static final /* enum */ y t;
    public static final /* enum */ y u;
    public static final /* enum */ y v;
    public static final /* enum */ y w;
    public static final /* enum */ y x;
    public static final /* enum */ y y;
    public static final /* enum */ y z;
    public final z D;
    public final int E;

    public static {
        y y2;
        y y3;
        y y4;
        y y5;
        y y6;
        y y7;
        y y8;
        y y9;
        y y10;
        y y11;
        y y12;
        y y13;
        y y14;
        y y15;
        k = y5 = new y(z.n, 1);
        l = y7 = new y(z.m, 5);
        z z2 = z.l;
        m = y8 = new y(z2, 0);
        n = y15 = new y(z2, 0);
        z z3 = z.k;
        o = y6 = new y(z3, 0);
        p = y14 = new y(z2, 1);
        q = y12 = new y(z3, 5);
        r = y3 = new y(z.o, 0);
        a a2 = new a("STRING", 8, z.p, 2);
        s = a2;
        z z4 = z.s;
        b b2 = new b("GROUP", 9, z4, 3);
        t = b2;
        c c2 = new c("MESSAGE", 10, z4, 2);
        u = c2;
        d d2 = new d("BYTES", 11, z.q, 2);
        v = d2;
        w = y2 = new y(z3, 0);
        x = y13 = new y(z.r, 0);
        y = y10 = new y(z3, 5);
        z = y9 = new y(z2, 1);
        A = y4 = new y(z3, 0);
        B = y11 = new y(z2, 0);
        C = new y[]{y5, y7, y8, y15, y6, y14, y12, y3, a2, b2, c2, d2, y2, y13, y10, y9, y4, y11};
    }

    public y(z z2, int n3) {
        this.D = z2;
        this.E = n3;
    }

    public y(z z2, int n3, x x2) {
        this.D = z2;
        this.E = n3;
    }

    public static y valueOf(String string) {
        return (y)Enum.valueOf(y.class, (String)string);
    }

    public static y[] values() {
        return (y[])C.clone();
    }

    public boolean b() {
        return true ^ this instanceof a;
    }
}

