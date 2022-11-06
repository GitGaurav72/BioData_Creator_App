/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.e1
 *  k.b0.x.b.x0.c.i1.c
 *  k.b0.x.b.x0.c.i1.e
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.i.c$a
 *  k.b0.x.b.x0.i.c$b
 *  k.b0.x.b.x0.i.c$c
 *  k.b0.x.b.x0.i.c$d
 *  k.b0.x.b.x0.i.c$e
 *  k.b0.x.b.x0.i.c$f
 *  k.b0.x.b.x0.i.c$g
 *  k.b0.x.b.x0.i.c$h
 *  k.b0.x.b.x0.i.c$i
 *  k.b0.x.b.x0.i.c$j
 *  k.b0.x.b.x0.i.d
 *  k.b0.x.b.x0.i.j
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.i;

import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.i.c;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.q;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public abstract class c {
    public static final c a;
    public static final c b;

    public static {
        k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)c.k);
        k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)a.k);
        k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)b.k);
        k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)d.k);
        k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)i.k);
        a = k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)f.k);
        k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)g.k);
        k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)j.k);
        b = k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)e.k);
        k.a((k.x.b.l<? super k.b0.x.b.x0.i.i, q>)h.k);
    }

    public static /* synthetic */ String r(c c2, k.b0.x.b.x0.c.i1.c c3, k.b0.x.b.x0.c.i1.e e2, int n2, Object object) {
        n2 & 2;
        return c2.q(c3, null);
    }

    public abstract String p(k.b0.x.b.x0.c.k var1);

    public abstract String q(k.b0.x.b.x0.c.i1.c var1, k.b0.x.b.x0.c.i1.e var2);

    public abstract String s(String var1, String var2, KotlinBuiltIns var3);

    public abstract String t(k.b0.x.b.x0.g.d var1);

    public abstract String u(k.b0.x.b.x0.g.e var1, boolean var2);

    public abstract String v(f0 var1);

    public abstract String w(b1 var1);

    public static final class k {
        public static final c a(k.x.b.l<? super k.b0.x.b.x0.i.i, q> l2) {
            k.x.c.i.e(l2, "changeOptions");
            k.b0.x.b.x0.i.j j2 = new k.b0.x.b.x0.i.j();
            l2.invoke((Object)j2);
            j2.b = true;
            return new k.b0.x.b.x0.i.d(j2);
        }
    }

    public static interface l {
        public void a(e1 var1, int var2, int var3, StringBuilder var4);

        public void b(int var1, StringBuilder var2);

        public void c(int var1, StringBuilder var2);

        public void d(e1 var1, int var2, int var3, StringBuilder var4);
    }

}

