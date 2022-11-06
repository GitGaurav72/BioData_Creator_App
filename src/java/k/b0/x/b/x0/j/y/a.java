/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.util.Collection
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.c0
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.e1
 *  k.b0.x.b.x0.c.f0
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.i
 *  k.b0.x.b.x0.c.i1.c
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.m0
 *  k.b0.x.b.x0.c.n0
 *  k.b0.x.b.x0.j.y.a$a
 *  k.b0.x.b.x0.j.y.a$b
 *  k.b0.x.b.x0.j.y.b
 *  k.b0.x.b.x0.j.y.c
 *  k.b0.x.b.x0.j.y.d
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.p1.d$a
 *  k.b0.x.b.x0.m.y0
 *  k.c0.t
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.j.y;

import java.util.Collection;
import k.b0.x.b.x0.c.c0;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.i;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.m0;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.j.g;
import k.b0.x.b.x0.j.y.a;
import k.b0.x.b.x0.j.y.c;
import k.b0.x.b.x0.j.y.d;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.p1.m;
import k.b0.x.b.x0.m.y0;
import k.c0.t;
import k.x.b.l;
import k.x.c.v;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class a {
    public static final /* synthetic */ int a;

    public static {
        k.x.c.i.d(k.b0.x.b.x0.g.e.l("value"), "identifier(\"value\")");
    }

    public static final boolean a(e1 e12) {
        k.x.c.i.e((Object)e12, "<this>");
        Boolean bl = e.s.a.a.b2((Collection)e.s.a.a.N2((Object)e12), (k.b0.x.b.x0.o.c)a.a, (l)b.k);
        k.x.c.i.d((Object)bl, "ifAny(\n        listOf(th\u2026eclaresDefaultValue\n    )");
        return bl;
    }

    public static k.b0.x.b.x0.c.b b(k.b0.x.b.x0.c.b b2, boolean bl, l l2, int n2) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        k.x.c.i.e((Object)b2, "<this>");
        k.x.c.i.e((Object)l2, "predicate");
        v v2 = new v();
        return (k.b0.x.b.x0.c.b)e.s.a.a.L0((Collection)e.s.a.a.N2((Object)b2), (k.b0.x.b.x0.o.c)new k.b0.x.b.x0.j.y.b(bl), (k.b0.x.b.x0.o.d)new c(v2, l2));
    }

    public static final k.b0.x.b.x0.g.c c(k k2) {
        k.x.c.i.e((Object)k2, "<this>");
        k.b0.x.b.x0.g.d d2 = a.h(k2);
        if (!d2.f()) {
            d2 = null;
        }
        if (d2 == null) {
            return null;
        }
        return d2.i();
    }

    public static final e d(k.b0.x.b.x0.c.i1.c c2) {
        k.x.c.i.e((Object)c2, "<this>");
        h h2 = c2.b().T().getDeclarationDescriptor();
        if (h2 instanceof e) {
            return (e)h2;
        }
        return null;
    }

    public static final KotlinBuiltIns e(k k2) {
        k.x.c.i.e((Object)k2, "<this>");
        return a.j(k2).getBuiltIns();
    }

    public static final k.b0.x.b.x0.g.b f(h h2) {
        if (h2 == null) {
            return null;
        }
        k k2 = h2.getContainingDeclaration();
        if (k2 instanceof k.b0.x.b.x0.c.f0) {
            return new k.b0.x.b.x0.g.b(((k.b0.x.b.x0.c.f0)k2).getFqName(), h2.getName());
        }
        boolean bl = k2 instanceof i;
        k.b0.x.b.x0.g.b b2 = null;
        if (bl) {
            k.x.c.i.d((Object)k2, "owner");
            k.b0.x.b.x0.g.b b3 = a.f((h)k2);
            if (b3 == null) {
                return null;
            }
            b2 = b3.d(h2.getName());
        }
        return b2;
    }

    public static final k.b0.x.b.x0.g.c g(k k2) {
        k.x.c.i.e((Object)k2, "<this>");
        k.b0.x.b.x0.g.c c2 = g.h(k2);
        if (c2 == null) {
            c2 = g.i(k2).i();
        }
        if (c2 != null) {
            k.x.c.i.d(c2, "getFqNameSafe(this)");
            return c2;
        }
        g.a(4);
        throw null;
    }

    public static final k.b0.x.b.x0.g.d h(k k2) {
        k.x.c.i.e((Object)k2, "<this>");
        k.b0.x.b.x0.g.d d2 = g.g(k2);
        k.x.c.i.d(d2, "getFqName(this)");
        return d2;
    }

    public static final k.b0.x.b.x0.m.p1.d i(d0 d02) {
        k.x.c.i.e((Object)d02, "<this>");
        (m)d02.R(k.b0.x.b.x0.m.p1.e.a);
        return d.a.a;
    }

    public static final d0 j(k k2) {
        k.x.c.i.e((Object)k2, "<this>");
        d0 d02 = g.d(k2);
        k.x.c.i.d((Object)d02, "getContainingModule(this)");
        return d02;
    }

    public static final k.c0.h<k> k(k k2) {
        k.x.c.i.e((Object)k2, "<this>");
        k.x.c.i.e((Object)k2, "<this>");
        return t.c((k.c0.h)e.s.a.a.c1((Object)k2, (l)d.k), (int)1);
    }

    public static final k.b0.x.b.x0.c.b l(k.b0.x.b.x0.c.b b2) {
        k.x.c.i.e((Object)b2, "<this>");
        if (b2 instanceof m0) {
            b2 = ((m0)b2).O();
            k.x.c.i.d((Object)b2, "correspondingProperty");
        }
        return b2;
    }
}

