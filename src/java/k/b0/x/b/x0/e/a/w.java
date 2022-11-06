/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  k.b0.x.b.x0.e.a.f0
 *  k.b0.x.b.x0.e.a.g0
 *  k.b0.x.b.x0.e.a.h0
 *  k.s.i
 */
package k.b0.x.b.x0.e.a;

import java.util.Map;
import k.b0.x.b.x0.e.a.f0;
import k.b0.x.b.x0.e.a.g0;
import k.b0.x.b.x0.e.a.h0;
import k.b0.x.b.x0.e.a.x;
import k.b0.x.b.x0.g.c;
import k.d;
import k.i;

public final class w {
    public static final c a;
    public static final c b;
    public static final f0<x> c;
    public static final x d;

    public static {
        c c2;
        c c3;
        a = c2 = new c("org.jspecify.nullness");
        b = c3 = new c("org.checkerframework.checker.nullness.compatqual");
        i[] arri = new i[16];
        c c4 = new c("org.jetbrains.annotations");
        x x2 = x.b;
        arri[0] = new i<c, x>(c4, x2);
        arri[1] = new i<c, x>(new c("androidx.annotation"), x2);
        arri[2] = new i<c, x>(new c("android.support.annotation"), x2);
        arri[3] = new i<c, x>(new c("android.annotation"), x2);
        arri[4] = new i<c, x>(new c("com.android.annotations"), x2);
        arri[5] = new i<c, x>(new c("org.eclipse.jdt.annotation"), x2);
        arri[6] = new i<c, x>(new c("org.checkerframework.checker.nullness.qual"), x2);
        arri[7] = new i<c, x>(c3, x2);
        arri[8] = new i<c, x>(new c("javax.annotation"), x2);
        arri[9] = new i<c, x>(new c("edu.umd.cs.findbugs.annotations"), x2);
        arri[10] = new i<c, x>(new c("io.reactivex.annotations"), x2);
        c c5 = new c("androidx.annotation.RecentlyNullable");
        h0 h02 = h0.l;
        arri[11] = new i<c, x>(c5, new x(h02, null, null, 4));
        arri[12] = new i<c, x>(new c("androidx.annotation.RecentlyNonNull"), new x(h02, null, null, 4));
        arri[13] = new i<c, x>(new c("lombok"), x2);
        d d2 = new d(1, 7, 0);
        h0 h03 = h0.m;
        arri[14] = new i<c, x>(c2, new x(h02, d2, h03));
        arri[15] = new i<c, x>(new c("io.reactivex.rxjava3.annotations"), new x(h02, new d(1, 7, 0), h03));
        c = new g0(k.s.i.H((i[])arri));
        d = new x(h02, null, null, 4);
    }
}

