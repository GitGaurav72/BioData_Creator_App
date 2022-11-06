/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.util.Objects
 *  m.m0.g.c$a
 *  m.m0.g.e
 *  m.m0.g.i
 *  m.m0.j.u
 *  m.u
 *  n.x
 */
package m.m0.g;

import java.io.IOException;
import java.util.Objects;
import m.c0;
import m.e0;
import m.f;
import m.g0;
import m.h0;
import m.k0;
import m.m0.g.c;
import m.m0.g.d;
import m.m0.g.e;
import m.m0.g.i;
import m.m0.j.b;
import m.u;
import n.x;

/*
 * Exception performing whole class analysis.
 */
public final class c {
    public boolean a;
    public final i b;
    public final e c;
    public final u d;
    public final d e;
    public final m.m0.h.d f;

    public c(e e2, u u2, d d2, m.m0.h.d d3) {
        k.x.c.i.e((Object)e2, "call");
        k.x.c.i.e((Object)u2, "eventListener");
        k.x.c.i.e(d2, "finder");
        k.x.c.i.e(d3, "codec");
        this.c = e2;
        this.d = u2;
        this.e = d2;
        this.f = d3;
        this.b = d3.e();
    }

    public final <E extends IOException> E a(long l2, boolean bl, boolean bl2, E e2) {
        if (e2 != null) {
            this.e(e2);
        }
        if (bl2) {
            u u2 = this.d;
            e e3 = this.c;
            if (e2 != null) {
                u2.b((f)e3, e2);
            } else {
                Objects.requireNonNull((Object)u2);
                k.x.c.i.e((Object)e3, "call");
            }
        }
        if (bl) {
            if (e2 != null) {
                this.d.c((f)this.c, e2);
            } else {
                u u3 = this.d;
                e e4 = this.c;
                Objects.requireNonNull((Object)u3);
                k.x.c.i.e((Object)e4, "call");
            }
        }
        return (E)((Object)this.c.j(this, bl2, bl, e2));
    }

    public final x b(e0 e02, boolean bl) {
        k.x.c.i.e(e02, "request");
        this.a = bl;
        g0 g02 = e02.e;
        k.x.c.i.c(g02);
        long l2 = g02.a();
        u u2 = this.d;
        e e2 = this.c;
        Objects.requireNonNull((Object)u2);
        k.x.c.i.e((Object)e2, "call");
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public final h0.a c(boolean bl) {
        h0.a a2;
        block3 : {
            try {
                a2 = this.f.d(bl);
                if (a2 == null) break block3;
            }
            catch (IOException iOException) {
                this.d.c((f)this.c, iOException);
                this.e(iOException);
                throw iOException;
            }
            k.x.c.i.e(this, "deferredTrailers");
            a2.m = this;
        }
        return a2;
    }

    public final void d() {
        u u2 = this.d;
        e e2 = this.c;
        Objects.requireNonNull((Object)u2);
        k.x.c.i.e((Object)e2, "call");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(IOException iOException) {
        this.e.c(iOException);
        i i2 = this.f.e();
        e e2 = this.c;
        i i3 = i2;
        synchronized (i3) {
            block6 : {
                block8 : {
                    block4 : {
                        block7 : {
                            block5 : {
                                int n2;
                                k.x.c.i.e((Object)e2, "call");
                                if (!(iOException instanceof m.m0.j.u)) break block4;
                                if (((m.m0.j.u)iOException).k != b.o) break block5;
                                i2.m = n2 = 1 + i2.m;
                                if (n2 <= 1) break block6;
                                break block7;
                            }
                            if (((m.m0.j.u)iOException).k == b.p && e2.w) break block6;
                        }
                        i2.i = true;
                        break block8;
                    }
                    if (i2.j() && !(iOException instanceof m.m0.j.a)) break block6;
                    i2.i = true;
                    if (i2.l != 0) break block6;
                    i2.d(e2.z, i2.q, iOException);
                }
                i2.k = 1 + i2.k;
            }
            return;
        }
    }
}

