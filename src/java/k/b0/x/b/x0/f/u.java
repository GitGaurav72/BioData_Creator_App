/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  k.b0.x.b.x0.f.u$a
 *  k.b0.x.b.x0.h.a
 *  k.b0.x.b.x0.h.a$a
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.h.p$a
 */
package k.b0.x.b.x0.f;

import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.u;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class u
extends h.d<u> {
    public static final u l;
    public static r<u> m;
    public final c n;
    public int o;
    public int p;
    public int q;
    public q r;
    public int s;
    public q t;
    public int u;
    public byte v;
    public int w;

    public static {
        q q2;
        u u2;
        m = new a();
        l = u2 = new u();
        u2.p = 0;
        u2.q = 0;
        u2.r = q2 = q.l;
        u2.s = 0;
        u2.t = q2;
        u2.u = 0;
    }

    public u() {
        this.v = (byte)-1;
        this.w = -1;
        this.n = c.k;
    }

    /*
     * Exception decompiling
     */
    public u(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl227.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public u(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.v = (byte)-1;
        this.w = -1;
        this.n = c2.k;
    }

    public p a() {
        return l;
    }

    public p.a b() {
        b b2 = new b();
        b2.l(this);
        return b2;
    }

    public void c(e e2) {
        this.d();
        h.a a2 = this.p();
        if ((1 & this.o) == 1) {
            e2.p(1, this.p);
        }
        if ((2 & this.o) == 2) {
            e2.p(2, this.q);
        }
        if ((4 & this.o) == 4) {
            e2.r(3, (p)this.r);
        }
        if ((16 & this.o) == 16) {
            e2.r(4, (p)this.t);
        }
        if ((8 & this.o) == 8) {
            e2.p(5, this.s);
        }
        if ((32 & this.o) == 32) {
            e2.p(6, this.u);
        }
        a2.a(200, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.w;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 1 & this.o;
        int n5 = 0;
        if (n4 == 1) {
            n5 = 0 + e.c(1, this.p);
        }
        if ((2 & this.o) == 2) {
            n5 += e.c(2, this.q);
        }
        if ((4 & this.o) == 4) {
            n5 += e.e(3, (p)this.r);
        }
        if ((16 & this.o) == 16) {
            n5 += e.e(4, (p)this.t);
        }
        if ((8 & this.o) == 8) {
            n5 += e.c(5, this.s);
        }
        if ((32 & this.o) == 32) {
            n5 += e.c(6, this.u);
        }
        this.w = n2 = n5 + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.v;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl = (2 & this.o) == 2;
        if (!bl) {
            this.v = 0;
            return false;
        }
        if (this.t() && !this.r.f()) {
            this.v = 0;
            return false;
        }
        if (this.u() && !this.t.f()) {
            this.v = 0;
            return false;
        }
        if (!this.i()) {
            this.v = 0;
            return false;
        }
        this.v = 1;
        return true;
    }

    public boolean t() {
        return (4 & this.o) == 4;
    }

    public boolean u() {
        return (16 & this.o) == 16;
    }

    public static final class b
    extends h.c<u, b> {
        public int n;
        public int o;
        public int p;
        public q q;
        public int r;
        public q s;
        public int t;

        public b() {
            q q2;
            this.q = q2 = q.l;
            this.s = q2;
        }

        public p build() {
            u u2 = this.k();
            if (u2.f()) {
                return u2;
            }
            throw new v();
        }

        @Override
        public Object clone() {
            b b2 = new b();
            b2.l(this.k());
            return b2;
        }

        @Override
        public h.b h() {
            b b2 = new b();
            b2.l(this.k());
            return b2;
        }

        public u k() {
            u u2 = new u(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            u2.p = this.o;
            if ((n2 & 2) == 2) {
                n4 |= 2;
            }
            u2.q = this.p;
            if ((n2 & 4) == 4) {
                n4 |= 4;
            }
            u2.r = this.q;
            if ((n2 & 8) == 8) {
                n4 |= 8;
            }
            u2.s = this.r;
            if ((n2 & 16) == 16) {
                n4 |= 16;
            }
            u2.t = this.s;
            if ((n2 & 32) == 32) {
                n4 |= 32;
            }
            u2.u = this.t;
            u2.o = n4;
            return u2;
        }

        public b l(u u2) {
            boolean bl;
            boolean bl2;
            if (u2 == u.l) {
                return this;
            }
            int n2 = u2.o;
            boolean bl3 = (n2 & 1) == 1;
            if (bl3) {
                int n3 = u2.p;
                this.n = 1 | this.n;
                this.o = n3;
            }
            if (bl2 = (n2 & 2) == 2) {
                int n4 = u2.q;
                this.n = 2 | this.n;
                this.p = n4;
            }
            if (u2.t()) {
                q q2;
                q q3 = u2.r;
                if ((4 & this.n) == 4 && (q2 = this.q) != q.l) {
                    q3 = e.e.a.a.a.A((q)q2, (q)q3);
                }
                this.q = q3;
                this.n = 4 | this.n;
            }
            if (bl = (8 & u2.o) == 8) {
                int n5 = u2.s;
                this.n = 8 | this.n;
                this.r = n5;
            }
            if (u2.u()) {
                q q4;
                q q5 = u2.t;
                if ((16 & this.n) == 16 && (q4 = this.s) != q.l) {
                    q5 = e.e.a.a.a.A((q)q4, (q)q5);
                }
                this.s = q5;
                this.n = 16 | this.n;
            }
            int n6 = 32 & u2.o;
            boolean bl4 = false;
            if (n6 == 32) {
                bl4 = true;
            }
            if (bl4) {
                int n7 = u2.u;
                this.n = 32 | this.n;
                this.t = n7;
            }
            this.j(u2);
            this.k = this.k.k(u2.n);
            return this;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public b m(d d2, f f2) {
            void var5_6;
            u u2;
            u u3 = u.m.a(d2, f2);
            if (u3 == null) return this;
            this.l(u3);
            return this;
            {
                u u4;
                catch (Throwable throwable) {
                    u2 = null;
                }
                catch (j j2) {}
                {
                    u4 = (u)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    u2 = u4;
                }
            }
            if (u2 == null) throw var5_6;
            this.l(u2);
            throw var5_6;
        }
    }

}

