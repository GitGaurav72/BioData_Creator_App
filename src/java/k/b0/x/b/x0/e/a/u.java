/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  k.b0.x.b.x0.c.f0
 *  k.b0.x.b.x0.c.h1
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.l1.a
 *  k.b0.x.b.x0.c.l1.b
 *  k.b0.x.b.x0.c.l1.c
 *  k.b0.x.b.x0.c.o
 *  k.b0.x.b.x0.c.p
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.e.a.u$a
 *  k.b0.x.b.x0.e.a.u$b
 *  k.b0.x.b.x0.e.a.u$c
 */
package k.b0.x.b.x0.e.a;

import java.util.HashMap;
import java.util.Map;
import k.b0.x.b.x0.c.f0;
import k.b0.x.b.x0.c.h1;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.o;
import k.b0.x.b.x0.c.p;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.e.a.u;
import k.b0.x.b.x0.j.a0.n.d;
import k.b0.x.b.x0.j.g;

public class u {
    public static final r a;
    public static final r b;
    public static final r c;
    public static final Map<h1, r> d;

    public static {
        a a2 = new a((h1)k.b0.x.b.x0.c.l1.a.c);
        a = a2;
        b b2 = new b((h1)k.b0.x.b.x0.c.l1.c.c);
        b = b2;
        c c2 = new c((h1)k.b0.x.b.x0.c.l1.b.c);
        c = c2;
        d = new HashMap();
        u.d((r)a2);
        u.d((r)b2);
        u.d((r)c2);
    }

    public static /* synthetic */ void a(int n2) {
        String string = n2 != 5 && n2 != 6 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 5 && n2 != 6 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "what";
                break;
            }
            case 5: 
            case 6: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            }
            case 4: {
                arrobject[0] = "visibility";
                break;
            }
            case 3: {
                arrobject[0] = "second";
                break;
            }
            case 2: {
                arrobject[0] = "first";
                break;
            }
            case 1: {
                arrobject[0] = "from";
            }
        }
        arrobject[1] = n2 != 5 && n2 != 6 ? "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities" : "toDescriptorVisibility";
        if (n2 != 2 && n2 != 3) {
            if (n2 != 4) {
                if (n2 != 5 && n2 != 6) {
                    arrobject[2] = "isVisibleForProtectedAndPackage";
                }
            } else {
                arrobject[2] = "toDescriptorVisibility";
            }
        } else {
            arrobject[2] = "areInSamePackage";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 5 && n2 != 6 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw object;
    }

    public static boolean b(d d2, o o2, k k2) {
        if (o2 != null) {
            if (k2 != null) {
                if (u.c((k)g.A(o2), k2)) {
                    return true;
                }
                return q.c.c(d2, o2, k2);
            }
            u.a(1);
            throw null;
        }
        u.a(0);
        throw null;
    }

    public static boolean c(k k2, k k3) {
        if (k2 != null) {
            if (k3 != null) {
                f0 f02 = g.k(k2, f0.class, false);
                f0 f03 = g.k(k3, f0.class, false);
                boolean bl = false;
                if (f03 != null) {
                    bl = false;
                    if (f02 != null) {
                        boolean bl2 = f02.getFqName().equals(f03.getFqName());
                        bl = false;
                        if (bl2) {
                            bl = true;
                        }
                    }
                }
                return bl;
            }
            u.a(3);
            throw null;
        }
        u.a(2);
        throw null;
    }

    public static void d(r r2) {
        d.put((Object)((p)r2).a, (Object)r2);
    }
}

