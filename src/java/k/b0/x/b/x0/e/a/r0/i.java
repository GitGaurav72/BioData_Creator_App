/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  k.b0.x.b.x0.e.a.r0.i$a
 *  k.b0.x.b.x0.e.a.r0.i$a0
 *  k.b0.x.b.x0.e.a.r0.i$b
 *  k.b0.x.b.x0.e.a.r0.i$b0
 *  k.b0.x.b.x0.e.a.r0.i$c
 *  k.b0.x.b.x0.e.a.r0.i$d
 *  k.b0.x.b.x0.e.a.r0.i$e
 *  k.b0.x.b.x0.e.a.r0.i$f
 *  k.b0.x.b.x0.e.a.r0.i$g
 *  k.b0.x.b.x0.e.a.r0.i$h
 *  k.b0.x.b.x0.e.a.r0.i$i
 *  k.b0.x.b.x0.e.a.r0.i$j
 *  k.b0.x.b.x0.e.a.r0.i$k
 *  k.b0.x.b.x0.e.a.r0.i$l
 *  k.b0.x.b.x0.e.a.r0.i$m
 *  k.b0.x.b.x0.e.a.r0.i$n
 *  k.b0.x.b.x0.e.a.r0.i$o
 *  k.b0.x.b.x0.e.a.r0.i$p
 *  k.b0.x.b.x0.e.a.r0.i$q
 *  k.b0.x.b.x0.e.a.r0.i$r
 *  k.b0.x.b.x0.e.a.r0.i$s
 *  k.b0.x.b.x0.e.a.r0.i$t
 *  k.b0.x.b.x0.e.a.r0.i$u
 *  k.b0.x.b.x0.e.a.r0.i$v
 *  k.b0.x.b.x0.e.a.r0.i$w
 *  k.b0.x.b.x0.e.a.r0.i$x
 *  k.b0.x.b.x0.e.a.r0.i$y
 *  k.b0.x.b.x0.e.a.r0.i$z
 *  k.x.b.l
 */
package k.b0.x.b.x0.e.a.r0;

import java.util.Map;
import k.b0.x.b.x0.e.a.r0.i;
import k.b0.x.b.x0.e.a.r0.q;

public final class i {
    public static final k.b0.x.b.x0.e.a.r0.d a;
    public static final k.b0.x.b.x0.e.a.r0.d b;
    public static final k.b0.x.b.x0.e.a.r0.d c;
    public static final Map<String, k.b0.x.b.x0.e.a.r0.j> d;

    public static {
        k.b0.x.b.x0.e.a.r0.d d2;
        k.b0.x.b.x0.e.a.r0.d d3;
        k.b0.x.b.x0.e.a.r0.d d4;
        a = d4 = new k.b0.x.b.x0.e.a.r0.d(k.b0.x.b.x0.e.a.r0.g.l, null, false, false, 8);
        k.b0.x.b.x0.e.a.r0.g g2 = k.b0.x.b.x0.e.a.r0.g.m;
        b = d2 = new k.b0.x.b.x0.e.a.r0.d(g2, null, false, false, 8);
        c = d3 = new k.b0.x.b.x0.e.a.r0.d(g2, null, true, false, 8);
        k.b0.x.b.x0.e.b.t t2 = k.b0.x.b.x0.e.b.t.a;
        String string = t2.f("Object");
        String string2 = t2.e("Predicate");
        String string3 = t2.e("Function");
        String string4 = t2.e("Consumer");
        String string5 = t2.e("BiFunction");
        String string6 = t2.e("BiConsumer");
        String string7 = t2.e("UnaryOperator");
        String string8 = t2.g("stream/Stream");
        String string9 = t2.g("Optional");
        k.b0.x.b.x0.e.a.r0.q q2 = new k.b0.x.b.x0.e.a.r0.q();
        new q.a(q2, t2.g("Iterator")).a("forEachRemaining", (k.x.b.l<? super q.a.a, k.q>)new a(string4));
        new q.a(q2, t2.f("Iterable")).a("spliterator", (k.x.b.l<? super q.a.a, k.q>)new g(t2));
        q.a a2 = new q.a(q2, t2.g("Collection"));
        a2.a("removeIf", (k.x.b.l<? super q.a.a, k.q>)new h(string2));
        a2.a("stream", (k.x.b.l<? super q.a.a, k.q>)new i(string8));
        a2.a("parallelStream", (k.x.b.l<? super q.a.a, k.q>)new j(string8));
        new q.a(q2, t2.g("List")).a("replaceAll", (k.x.b.l<? super q.a.a, k.q>)new k(string7));
        q.a a3 = new q.a(q2, t2.g("Map"));
        a3.a("forEach", (k.x.b.l<? super q.a.a, k.q>)new l(string6));
        a3.a("putIfAbsent", (k.x.b.l<? super q.a.a, k.q>)new m(string));
        a3.a("replace", (k.x.b.l<? super q.a.a, k.q>)new n(string));
        a3.a("replace", (k.x.b.l<? super q.a.a, k.q>)new o(string));
        a3.a("replaceAll", (k.x.b.l<? super q.a.a, k.q>)new p(string5));
        a3.a("compute", (k.x.b.l<? super q.a.a, k.q>)new q(string, string5));
        a3.a("computeIfAbsent", (k.x.b.l<? super q.a.a, k.q>)new r(string, string3));
        a3.a("computeIfPresent", (k.x.b.l<? super q.a.a, k.q>)new s(string, string5));
        a3.a("merge", (k.x.b.l<? super q.a.a, k.q>)new t(string, string5));
        q.a a4 = new q.a(q2, string9);
        a4.a("empty", (k.x.b.l<? super q.a.a, k.q>)new u(string9));
        a4.a("of", (k.x.b.l<? super q.a.a, k.q>)new v(string, string9));
        a4.a("ofNullable", (k.x.b.l<? super q.a.a, k.q>)new w(string, string9));
        a4.a("get", (k.x.b.l<? super q.a.a, k.q>)new x(string));
        a4.a("ifPresent", (k.x.b.l<? super q.a.a, k.q>)new y(string4));
        new q.a(q2, t2.f("ref/Reference")).a("get", (k.x.b.l<? super q.a.a, k.q>)new z(string));
        new q.a(q2, string2).a("test", (k.x.b.l<? super q.a.a, k.q>)new a0(string));
        new q.a(q2, t2.e("BiPredicate")).a("test", (k.x.b.l<? super q.a.a, k.q>)new b0(string));
        new q.a(q2, string4).a("accept", (k.x.b.l<? super q.a.a, k.q>)new b(string));
        new q.a(q2, string6).a("accept", (k.x.b.l<? super q.a.a, k.q>)new c(string));
        new q.a(q2, string3).a("apply", (k.x.b.l<? super q.a.a, k.q>)new d(string));
        new q.a(q2, string5).a("apply", (k.x.b.l<? super q.a.a, k.q>)new e(string));
        new q.a(q2, t2.e("Supplier")).a("get", (k.x.b.l<? super q.a.a, k.q>)new f(string));
        d = q2.a;
    }
}

