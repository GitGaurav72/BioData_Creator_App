/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  k.b0.x.b.x0.f.n$a
 *  k.b0.x.b.x0.h.a
 *  k.b0.x.b.x0.h.a$a
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.h.p$a
 */
package k.b0.x.b.x0.f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k.b0.x.b.x0.f.n;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.s;
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

public final class n
extends h.d<n> {
    public static final n l;
    public static r<n> m;
    public List<Integer> A;
    public byte B;
    public int C;
    public final c n;
    public int o;
    public int p;
    public int q;
    public int r;
    public q s;
    public int t;
    public List<s> u;
    public q v;
    public int w;
    public u x;
    public int y;
    public int z;

    public static {
        n n2;
        m = new a();
        l = n2 = new n();
        n2.w();
    }

    public n() {
        this.B = (byte)-1;
        this.C = -1;
        this.n = c.k;
    }

    /*
     * Exception decompiling
     */
    public n(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl391.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public n(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.B = (byte)-1;
        this.C = -1;
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
        if ((2 & this.o) == 2) {
            e2.p(1, this.q);
        }
        if ((4 & this.o) == 4) {
            e2.p(2, this.r);
        }
        if ((8 & this.o) == 8) {
            e2.r(3, (p)this.s);
        }
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            e2.r(4, (p)this.u.get(i2));
        }
        if ((32 & this.o) == 32) {
            e2.r(5, (p)this.v);
        }
        if ((128 & this.o) == 128) {
            e2.r(6, (p)this.x);
        }
        if ((256 & this.o) == 256) {
            e2.p(7, this.y);
        }
        if ((512 & this.o) == 512) {
            e2.p(8, this.z);
        }
        if ((16 & this.o) == 16) {
            e2.p(9, this.t);
        }
        if ((64 & this.o) == 64) {
            e2.p(10, this.w);
        }
        int n2 = 1 & this.o;
        int n3 = 0;
        if (n2 == 1) {
            e2.p(11, this.p);
        }
        while (n3 < this.A.size()) {
            e2.p(31, (Integer)this.A.get(n3));
            ++n3;
        }
        a2.a(19000, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.C;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 2 & this.o;
        int n5 = 0;
        int n6 = n4 == 2 ? 0 + e.c(1, this.q) : 0;
        if ((4 & this.o) == 4) {
            n6 += e.c(2, this.r);
        }
        if ((8 & this.o) == 8) {
            n6 += e.e(3, (p)this.s);
        }
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            n6 += e.e(4, (p)this.u.get(i2));
        }
        if ((32 & this.o) == 32) {
            n6 += e.e(5, (p)this.v);
        }
        if ((128 & this.o) == 128) {
            n6 += e.e(6, (p)this.x);
        }
        if ((256 & this.o) == 256) {
            n6 += e.c(7, this.y);
        }
        if ((512 & this.o) == 512) {
            n6 += e.c(8, this.z);
        }
        if ((16 & this.o) == 16) {
            n6 += e.c(9, this.t);
        }
        if ((64 & this.o) == 64) {
            n6 += e.c(10, this.w);
        }
        if ((1 & this.o) == 1) {
            n6 += e.c(11, this.p);
        }
        int n7 = 0;
        while (n5 < this.A.size()) {
            n7 += e.d((Integer)this.A.get(n5));
            ++n5;
        }
        this.C = n2 = n6 + n7 + 2 * this.A.size() + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.B;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl = (4 & this.o) == 4;
        if (!bl) {
            this.B = 0;
            return false;
        }
        if (this.v() && !this.s.f()) {
            this.B = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            if (((s)((Object)this.u.get(i2))).f()) continue;
            this.B = 0;
            return false;
        }
        if (this.t() && !this.v.f()) {
            this.B = 0;
            return false;
        }
        boolean bl2 = (128 & this.o) == 128;
        if (bl2 && !this.x.f()) {
            this.B = 0;
            return false;
        }
        if (!this.i()) {
            this.B = 0;
            return false;
        }
        this.B = 1;
        return true;
    }

    public boolean t() {
        return (32 & this.o) == 32;
    }

    public boolean u() {
        return (64 & this.o) == 64;
    }

    public boolean v() {
        return (8 & this.o) == 8;
    }

    public final void w() {
        q q2;
        this.p = 518;
        this.q = 2054;
        this.r = 0;
        this.s = q2 = q.l;
        this.t = 0;
        this.u = Collections.emptyList();
        this.v = q2;
        this.w = 0;
        this.x = u.l;
        this.y = 0;
        this.z = 0;
        this.A = Collections.emptyList();
    }

    public static final class b
    extends h.c<n, b> {
        public int n;
        public int o = 518;
        public int p = 2054;
        public int q;
        public q r;
        public int s;
        public List<s> t;
        public q u;
        public int v;
        public u w;
        public int x;
        public int y;
        public List<Integer> z;

        public b() {
            q q2;
            this.r = q2 = q.l;
            this.t = Collections.emptyList();
            this.u = q2;
            this.w = u.l;
            this.z = Collections.emptyList();
        }

        public p build() {
            n n2 = this.k();
            if (n2.f()) {
                return n2;
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

        public n k() {
            n n2 = new n(this, null);
            int n3 = this.n;
            int n4 = n3 & 1;
            int n5 = 1;
            if (n4 != n5) {
                n5 = 0;
            }
            n2.p = this.o;
            if ((n3 & 2) == 2) {
                n5 |= 2;
            }
            n2.q = this.p;
            if ((n3 & 4) == 4) {
                n5 |= 4;
            }
            n2.r = this.q;
            if ((n3 & 8) == 8) {
                n5 |= 8;
            }
            n2.s = this.r;
            if ((n3 & 16) == 16) {
                n5 |= 16;
            }
            n2.t = this.s;
            if ((n3 & 32) == 32) {
                this.t = Collections.unmodifiableList(this.t);
                this.n = -33 & this.n;
            }
            n2.u = this.t;
            if ((n3 & 64) == 64) {
                n5 |= 32;
            }
            n2.v = this.u;
            if ((n3 & 128) == 128) {
                n5 |= 64;
            }
            n2.w = this.v;
            if ((n3 & 256) == 256) {
                n5 |= 128;
            }
            n2.x = this.w;
            if ((n3 & 512) == 512) {
                n5 |= 256;
            }
            n2.y = this.x;
            if ((n3 & 1024) == 1024) {
                n5 |= 512;
            }
            n2.z = this.y;
            if ((2048 & this.n) == 2048) {
                this.z = Collections.unmodifiableList(this.z);
                this.n = -2049 & this.n;
            }
            n2.A = this.z;
            n2.o = n5;
            return n2;
        }

        public b l(n n2) {
            boolean bl;
            boolean bl2;
            int n3;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            if (n2 == n.l) {
                return this;
            }
            int n4 = n2.o;
            boolean bl6 = (n4 & 1) == 1;
            if (bl6) {
                int n5 = n2.p;
                this.n = 1 | this.n;
                this.o = n5;
            }
            if (bl4 = (n4 & 2) == 2) {
                int n6 = n2.q;
                this.n = 2 | this.n;
                this.p = n6;
            }
            if (bl = (n4 & 4) == 4) {
                int n7 = n2.r;
                this.n = 4 | this.n;
                this.q = n7;
            }
            if (n2.v()) {
                q q2;
                q q3 = n2.s;
                if ((8 & this.n) == 8 && (q2 = this.r) != q.l) {
                    q3 = e.e.a.a.a.A((q)q2, (q)q3);
                }
                this.r = q3;
                this.n = 8 | this.n;
            }
            if (bl3 = (16 & n2.o) == 16) {
                int n8 = n2.t;
                this.n = 16 | this.n;
                this.s = n8;
            }
            if (!n2.u.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = n2.u;
                    this.n = -33 & this.n;
                } else {
                    if ((32 & this.n) != 32) {
                        this.t = new ArrayList(this.t);
                        this.n = 32 | this.n;
                    }
                    this.t.addAll(n2.u);
                }
            }
            if (n2.t()) {
                q q4;
                q q5 = n2.v;
                if ((64 & this.n) == 64 && (q4 = this.u) != q.l) {
                    q5 = e.e.a.a.a.A((q)q4, (q)q5);
                }
                this.u = q5;
                this.n = 64 | this.n;
            }
            if (n2.u()) {
                int n9 = n2.w;
                this.n = 128 | this.n;
                this.v = n9;
            }
            if (bl2 = (128 & n2.o) == 128) {
                u u2;
                u u3 = n2.x;
                if ((256 & this.n) == 256 && (u2 = this.w) != u.l) {
                    u.b b2 = new u.b();
                    b2.l(u2);
                    b2.l(u3);
                    u3 = b2.k();
                }
                this.w = u3;
                this.n = 256 | this.n;
            }
            if (bl5 = ((n3 = n2.o) & 256) == 256) {
                int n10 = n2.y;
                this.n = 512 | this.n;
                this.x = n10;
            }
            int n11 = n3 & 512;
            boolean bl7 = false;
            if (n11 == 512) {
                bl7 = true;
            }
            if (bl7) {
                int n12 = n2.z;
                this.n = 1024 | this.n;
                this.y = n12;
            }
            if (!n2.A.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = n2.A;
                    this.n = -2049 & this.n;
                } else {
                    if ((2048 & this.n) != 2048) {
                        this.z = new ArrayList(this.z);
                        this.n = 2048 | this.n;
                    }
                    this.z.addAll(n2.A);
                }
            }
            this.j(n2);
            this.k = this.k.k(n2.n);
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
            n n2;
            n n3 = n.m.a(d2, f2);
            if (n3 == null) return this;
            this.l(n3);
            return this;
            {
                n n4;
                catch (Throwable throwable) {
                    n2 = null;
                }
                catch (j j2) {}
                {
                    n4 = (n)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    n2 = n4;
                }
            }
            if (n2 == null) throw var5_6;
            this.l(n2);
            throw var5_6;
        }
    }

}

