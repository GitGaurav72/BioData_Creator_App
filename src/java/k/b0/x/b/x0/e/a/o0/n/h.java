/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.e.a.m0.k
 *  k.b0.x.b.x0.e.a.o0.n.f
 *  k.b0.x.b.x0.e.a.o0.n.h$b
 *  k.b0.x.b.x0.e.a.o0.n.h$c
 *  k.b0.x.b.x0.l.e
 *  k.b0.x.b.x0.l.e$m
 *  k.b0.x.b.x0.l.g
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.x.b.a
 *  k.x.b.l
 */
package k.b0.x.b.x0.e.a.o0.n;

import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.e.a.m0.k;
import k.b0.x.b.x0.e.a.o0.n.f;
import k.b0.x.b.x0.e.a.o0.n.h;
import k.b0.x.b.x0.l.e;
import k.b0.x.b.x0.l.g;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.e;
import k.x.b.l;
import k.x.c.i;

public final class h {
    public final k.b0.x.b.x0.l.e a;
    public final e b;
    public final f c;
    public final g<a, f0> d;

    public h(f f2) {
        k.b0.x.b.x0.l.e e2;
        this.a = e2 = new k.b0.x.b.x0.l.e("Type parameter upper bound erasion results");
        this.b = e.s.a.a.J2((k.x.b.a)new b(this));
        if (f2 == null) {
            f2 = new f(this);
        }
        this.c = f2;
        g g2 = e2.h((l)new c(this));
        i.d((Object)g2, "storage.createMemoizedFu\u2026 isRaw, typeAttr) }\n    }");
        this.d = g2;
    }

    public final f0 a(k.b0.x.b.x0.e.a.o0.n.a a2) {
        m0 m02 = a2.e;
        if (m02 == null) {
            m0 m03 = (m0)this.b.getValue();
            i.d((Object)m03, "erroneousErasedBound");
            return m03;
        }
        return e.s.a.a.r3((f0)m02);
    }

    public final f0 b(z0 z02, boolean bl, k.b0.x.b.x0.e.a.o0.n.a a2) {
        i.e((Object)z02, "typeParameter");
        i.e(a2, "typeAttr");
        g<a, f0> g2 = this.d;
        a a3 = new a(z02, bl, a2);
        return (f0)((e.m)g2).invoke((Object)a3);
    }

    public static final class a {
        public final z0 a;
        public final boolean b;
        public final k.b0.x.b.x0.e.a.o0.n.a c;

        public a(z0 z02, boolean bl, k.b0.x.b.x0.e.a.o0.n.a a2) {
            i.e((Object)z02, "typeParameter");
            i.e(a2, "typeAttr");
            this.a = z02;
            this.b = bl;
            this.c = a2;
        }

        public boolean equals(Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            a a2 = (a)object;
            boolean bl = i.a((Object)a2.a, (Object)this.a);
            boolean bl2 = false;
            if (bl) {
                boolean bl3 = a2.b;
                boolean bl4 = this.b;
                bl2 = false;
                if (bl3 == bl4) {
                    k.b0.x.b.x0.e.a.o0.n.a a3 = a2.c;
                    k.b0.x.b.x0.e.a.o0.n.b b2 = a3.b;
                    k.b0.x.b.x0.e.a.o0.n.a a4 = this.c;
                    k.b0.x.b.x0.e.a.o0.n.b b3 = a4.b;
                    bl2 = false;
                    if (b2 == b3) {
                        k k2 = a3.a;
                        k k3 = a4.a;
                        bl2 = false;
                        if (k2 == k3) {
                            boolean bl5 = a3.c;
                            boolean bl6 = a4.c;
                            bl2 = false;
                            if (bl5 == bl6) {
                                boolean bl7 = i.a((Object)a3.e, (Object)a4.e);
                                bl2 = false;
                                if (bl7) {
                                    bl2 = true;
                                }
                            }
                        }
                    }
                }
            }
            return bl2;
        }

        public int hashCode() {
            int n2 = this.a.hashCode();
            int n3 = n2 + (n2 * 31 + this.b);
            int n4 = n3 + (n3 * 31 + this.c.b.hashCode());
            int n5 = n4 + (n4 * 31 + this.c.a.hashCode());
            int n6 = n5 * 31;
            k.b0.x.b.x0.e.a.o0.n.a a2 = this.c;
            int n7 = n5 + (n6 + a2.c);
            int n8 = n7 * 31;
            m0 m02 = a2.e;
            int n9 = m02 == null ? 0 : m02.hashCode();
            return n7 + (n8 + n9);
        }

        public String toString() {
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"DataToEraseUpperBound(typeParameter=");
            stringBuilder.append((Object)this.a);
            stringBuilder.append(", isRaw=");
            stringBuilder.append(this.b);
            stringBuilder.append(", typeAttr=");
            stringBuilder.append((Object)this.c);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

}

