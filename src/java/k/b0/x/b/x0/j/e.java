/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collection
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.a0
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.f0
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.j.b
 *  k.b0.x.b.x0.j.c
 *  k.b0.x.b.x0.j.d
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.p1.d$a
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  k.x.b.p
 */
package k.b0.x.b.x0.j;

import java.util.Collection;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.a0;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.f0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.b;
import k.b0.x.b.x0.j.c;
import k.b0.x.b.x0.j.d;
import k.b0.x.b.x0.j.g;
import k.b0.x.b.x0.j.m;
import k.b0.x.b.x0.m.p1.b;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.y0;
import k.x.b.p;
import k.x.c.i;

public final class e {
    public static final e a = new e();

    public final boolean a(k object, k object2, boolean bl, boolean bl2) {
        block6 : {
            block8 : {
                block7 : {
                    if (object instanceof k.b0.x.b.x0.c.e && object2 instanceof k.b0.x.b.x0.c.e) {
                        k.b0.x.b.x0.c.e e2 = (k.b0.x.b.x0.c.e)object;
                        k.b0.x.b.x0.c.e e3 = (k.b0.x.b.x0.c.e)object2;
                        return i.a((Object)e2.getTypeConstructor(), (Object)e3.getTypeConstructor());
                    }
                    if (object instanceof z0 && object2 instanceof z0) {
                        return this.b((z0)object, (z0)object2, bl, (p<? super k, ? super k, Boolean>)d.k);
                    }
                    if (!(object instanceof a) || !(object2 instanceof a)) break block6;
                    a a2 = (a)object;
                    a a3 = (a)object2;
                    d.a a4 = d.a.a;
                    i.e((Object)a2, "a");
                    i.e((Object)a3, "b");
                    i.e((Object)a4, "kotlinTypeRefiner");
                    if (i.a((Object)a2, (Object)a3)) break block7;
                    if (!i.a(a2.getName(), a3.getName()) || bl2 && a2 instanceof a0 && a3 instanceof a0 && ((a0)a2).isExpect() != ((a0)a3).isExpect() || i.a((Object)a2.getContainingDeclaration(), (Object)a3.getContainingDeclaration()) && (!bl || !i.a((Object)this.d(a2), (Object)this.d(a3))) || g.t((k)a2) || g.t((k)a3) || !this.c((k)a2, (k)a3, (p<? super k, ? super k, Boolean>)b.k, bl)) break block8;
                    m m2 = new m((b.a)new c(bl, a2, a3), (k.b0.x.b.x0.m.p1.d)a4);
                    i.d(m2, "a: CallableDescriptor,\n \u2026= a && y == b }\n        }");
                    m.c.a a5 = m2.m(a2, a3, null, true).c();
                    m.c.a a6 = m.c.a.k;
                    if (a5 != a6 || m2.m(a3, a2, null, true).c() != a6) break block8;
                }
                return true;
            }
            return false;
        }
        if (object instanceof f0 && object2 instanceof f0) {
            object = ((f0)object).getFqName();
            object2 = ((f0)object2).getFqName();
        }
        return i.a(object, object2);
    }

    public final boolean b(z0 z02, z0 z03, boolean bl, p<? super k, ? super k, Boolean> p2) {
        i.e((Object)z02, "a");
        i.e((Object)z03, "b");
        i.e(p2, "equivalentCallables");
        if (i.a((Object)z02, (Object)z03)) {
            return true;
        }
        if (i.a((Object)z02.getContainingDeclaration(), (Object)z03.getContainingDeclaration())) {
            return false;
        }
        if (!this.c((k)z02, (k)z03, p2, bl)) {
            return false;
        }
        return z02.e() == z03.e();
    }

    public final boolean c(k k2, k k3, p<? super k, ? super k, Boolean> p2, boolean bl) {
        k k4 = k2.getContainingDeclaration();
        k k5 = k3.getContainingDeclaration();
        if (!(k4 instanceof k.b0.x.b.x0.c.b) && !(k5 instanceof k.b0.x.b.x0.c.b)) {
            return this.a(k4, k5, bl, true);
        }
        return (Boolean)p2.invoke((Object)k4, (Object)k5);
    }

    public final u0 d(a a2) {
        k.b0.x.b.x0.c.b b2;
        while (a2 instanceof k.b0.x.b.x0.c.b && (b2 = (k.b0.x.b.x0.c.b)a2).getKind() == b.a.l) {
            Collection collection = b2.getOverriddenDescriptors();
            i.d((Object)collection, "overriddenDescriptors");
            a2 = (k.b0.x.b.x0.c.b)k.s.i.U((Iterable)collection);
            if (a2 != null) continue;
            return null;
        }
        return a2.getSource();
    }
}

