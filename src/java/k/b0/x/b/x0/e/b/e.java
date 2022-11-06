/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Set
 *  k.b0.x.b.x0.c.f0
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.e.b.e$b
 *  k.b0.x.b.x0.e.b.h
 *  k.b0.x.b.x0.e.b.o
 *  k.b0.x.b.x0.f.a0.b.e
 *  k.b0.x.b.x0.f.a0.b.f
 *  k.b0.x.b.x0.f.c
 *  k.b0.x.b.x0.f.l
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.k.b.f0.g
 *  k.b0.x.b.x0.k.b.f0.j
 *  k.s.i
 *  k.x.b.a
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.e.b;

import java.util.Set;
import k.b0.x.b.x0.c.f0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.e.b.e;
import k.b0.x.b.x0.e.b.h;
import k.b0.x.b.x0.e.b.m;
import k.b0.x.b.x0.e.b.o;
import k.b0.x.b.x0.e.b.x.a;
import k.b0.x.b.x0.f.c;
import k.b0.x.b.x0.f.l;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.k.b.f;
import k.b0.x.b.x0.k.b.f0.g;
import k.b0.x.b.x0.k.b.k;
import k.b0.x.b.x0.k.b.s;
import k.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e {
    public static final a a = new a(null);
    public static final Set<a.a> b = e.s.a.a.J3((Object)((Object)a.a.n));
    public static final Set<a.a> c;
    public static final k.b0.x.b.x0.f.a0.b.e d;
    public static final k.b0.x.b.x0.f.a0.b.e e;
    public static final k.b0.x.b.x0.f.a0.b.e f;
    public k.b0.x.b.x0.k.b.j g;

    public static {
        a.a[] arra = new a.a[]{a.a.o, a.a.r};
        c = k.s.i.R((Object[])arra);
        d = new k.b0.x.b.x0.f.a0.b.e(new int[]{1, 1, 2});
        e = new k.b0.x.b.x0.f.a0.b.e(new int[]{1, 1, 11});
        f = new k.b0.x.b.x0.f.a0.b.e(new int[]{1, 1, 13});
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final k.b0.x.b.x0.j.a0.h a(f0 f02, m m2) {
        i<k.b0.x.b.x0.f.a0.b.f, l> i2;
        block7 : {
            k.x.c.i.e((Object)f02, "descriptor");
            k.x.c.i.e(m2, "kotlinClass");
            String[] arrstring = this.g(m2, c);
            if (arrstring == null) {
                return null;
            }
            String[] arrstring2 = m2.a().e;
            if (arrstring2 == null) {
                return null;
            }
            try {
                try {
                    i2 = k.b0.x.b.x0.f.a0.b.g.g(arrstring, arrstring2);
                    break block7;
                }
                catch (j j2) {
                    throw new IllegalStateException(k.x.c.i.k("Could not read data from ", m2.b()), (Throwable)j2);
                }
            }
            catch (Throwable throwable2) {}
            if (this.c().c.d()) throw throwable2;
            if (m2.a().b.c()) throw throwable2;
            return null;
        }
        if (i2 == null) {
            return null;
        }
        k.b0.x.b.x0.f.a0.b.f f2 = (k.b0.x.b.x0.f.a0.b.f)i2.k;
        l l2 = (l)i2.l;
        h h2 = new h(m2, l2, (k.b0.x.b.x0.f.z.c)f2, this.d(m2), this.e(m2), this.b(m2));
        k.b0.x.b.x0.f.a0.b.e e2 = m2.a().b;
        k.b0.x.b.x0.k.b.j j3 = this.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("scope for ");
        stringBuilder.append((Object)h2);
        stringBuilder.append(" in ");
        stringBuilder.append((Object)f02);
        return new k.b0.x.b.x0.k.b.f0.j(f02, l2, (k.b0.x.b.x0.f.z.c)f2, (k.b0.x.b.x0.f.z.a)e2, (g)h2, j3, stringBuilder.toString(), (k.x.b.a)b.k);
    }

    public final k.b0.x.b.x0.k.b.f0.f b(m m2) {
        k.b0.x.b.x0.k.b.f0.f f2 = k.b0.x.b.x0.k.b.f0.f.k;
        if (this.c().c.b()) {
            return f2;
        }
        k.b0.x.b.x0.e.b.x.a a2 = m2.a();
        boolean bl = a2.b(a2.g, 64);
        boolean bl2 = true;
        boolean bl3 = bl && !a2.b(a2.g, 32) ? bl2 : false;
        if (bl3) {
            return k.b0.x.b.x0.k.b.f0.f.l;
        }
        k.b0.x.b.x0.e.b.x.a a3 = m2.a();
        if (!a3.b(a3.g, 16) || a3.b(a3.g, 32)) {
            bl2 = false;
        }
        if (bl2) {
            f2 = k.b0.x.b.x0.k.b.f0.f.m;
        }
        return f2;
    }

    public final k.b0.x.b.x0.k.b.j c() {
        k.b0.x.b.x0.k.b.j j2 = this.g;
        if (j2 != null) {
            return j2;
        }
        k.x.c.i.m("components");
        throw null;
    }

    public final s<k.b0.x.b.x0.f.a0.b.e> d(m m2) {
        if (!this.c().c.d() && !m2.a().b.c()) {
            return new s<k.b0.x.b.x0.f.a0.b.e>(m2.a().b, k.b0.x.b.x0.f.a0.b.e.f, m2.b(), m2.c());
        }
        return null;
    }

    public final boolean e(m m2) {
        k.b0.x.b.x0.e.b.x.a a2;
        boolean bl = this.c().c.e();
        boolean bl2 = true;
        if (!bl || !(a2 = m2.a()).b(a2.g, 2) && !k.x.c.i.a((Object)m2.a().b, (Object)d)) {
            k.b0.x.b.x0.e.b.x.a a3;
            boolean bl3 = !this.c().c.c() && (a3 = m2.a()).b(a3.g, 2) && k.x.c.i.a((Object)m2.a().b, (Object)e) ? bl2 : false;
            if (bl3) {
                return bl2;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final f f(m m2) {
        i<k.b0.x.b.x0.f.a0.b.f, c> i2;
        block7 : {
            k.x.c.i.e(m2, "kotlinClass");
            String[] arrstring = this.g(m2, b);
            if (arrstring == null) {
                return null;
            }
            String[] arrstring2 = m2.a().e;
            if (arrstring2 == null) {
                return null;
            }
            try {
                try {
                    i2 = k.b0.x.b.x0.f.a0.b.g.f(arrstring, arrstring2);
                    break block7;
                }
                catch (j j2) {
                    throw new IllegalStateException(k.x.c.i.k("Could not read data from ", m2.b()), (Throwable)j2);
                }
            }
            catch (Throwable throwable2) {}
            if (this.c().c.d()) throw throwable2;
            if (m2.a().b.c()) throw throwable2;
            return null;
        }
        if (i2 == null) {
            return null;
        }
        k.b0.x.b.x0.f.a0.b.f f2 = (k.b0.x.b.x0.f.a0.b.f)i2.k;
        c c2 = (c)i2.l;
        o o2 = new o(m2, this.d(m2), this.e(m2), this.b(m2));
        return new f((k.b0.x.b.x0.f.z.c)f2, c2, (k.b0.x.b.x0.f.z.a)m2.a().b, (u0)o2);
    }

    public final String[] g(m m2, Set<? extends a.a> set) {
        k.b0.x.b.x0.e.b.x.a a2 = m2.a();
        String[] arrstring = a2.c;
        if (arrstring == null) {
            arrstring = a2.d;
        }
        if (arrstring != null && set.contains((Object)a2.a)) {
            return arrstring;
        }
        return null;
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

}

