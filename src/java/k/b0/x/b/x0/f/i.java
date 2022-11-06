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
 *  k.b0.x.b.x0.f.i$a
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
import k.b0.x.b.x0.f.e;
import k.b0.x.b.x0.f.i;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.s;
import k.b0.x.b.x0.f.t;
import k.b0.x.b.x0.f.u;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class i
extends h.d<i> {
    public static final i l;
    public static r<i> m;
    public e A;
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
    public List<u> x;
    public t y;
    public List<Integer> z;

    public static {
        i i2;
        m = new a();
        l = i2 = new i();
        i2.w();
    }

    public i() {
        this.B = (byte)-1;
        this.C = -1;
        this.n = c.k;
    }

    /*
     * Exception decompiling
     */
    public i(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl447.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public i(h.c c2, k.b0.x.b.x0.f.a a2) {
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

    public void c(k.b0.x.b.x0.h.e e2) {
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
        for (int i3 = 0; i3 < this.x.size(); ++i3) {
            e2.r(6, (p)this.x.get(i3));
        }
        if ((16 & this.o) == 16) {
            e2.p(7, this.t);
        }
        if ((64 & this.o) == 64) {
            e2.p(8, this.w);
        }
        if ((1 & this.o) == 1) {
            e2.p(9, this.p);
        }
        int n2 = 128 & this.o;
        int n3 = 0;
        if (n2 == 128) {
            e2.r(30, (p)this.y);
        }
        while (n3 < this.z.size()) {
            e2.p(31, (Integer)this.z.get(n3));
            ++n3;
        }
        if ((256 & this.o) == 256) {
            e2.r(32, (p)this.A);
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
        int n6 = n4 == 2 ? 0 + k.b0.x.b.x0.h.e.c(1, this.q) : 0;
        if ((4 & this.o) == 4) {
            n6 += k.b0.x.b.x0.h.e.c(2, this.r);
        }
        if ((8 & this.o) == 8) {
            n6 += k.b0.x.b.x0.h.e.e(3, (p)this.s);
        }
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            n6 += k.b0.x.b.x0.h.e.e(4, (p)this.u.get(i2));
        }
        if ((32 & this.o) == 32) {
            n6 += k.b0.x.b.x0.h.e.e(5, (p)this.v);
        }
        for (int i3 = 0; i3 < this.x.size(); ++i3) {
            n6 += k.b0.x.b.x0.h.e.e(6, (p)this.x.get(i3));
        }
        if ((16 & this.o) == 16) {
            n6 += k.b0.x.b.x0.h.e.c(7, this.t);
        }
        if ((64 & this.o) == 64) {
            n6 += k.b0.x.b.x0.h.e.c(8, this.w);
        }
        if ((1 & this.o) == 1) {
            n6 += k.b0.x.b.x0.h.e.c(9, this.p);
        }
        if ((128 & this.o) == 128) {
            n6 += k.b0.x.b.x0.h.e.e(30, (p)this.y);
        }
        int n7 = 0;
        while (n5 < this.z.size()) {
            n7 += k.b0.x.b.x0.h.e.d((Integer)this.z.get(n5));
            ++n5;
        }
        int n8 = n6 + n7 + 2 * this.z.size();
        if ((256 & this.o) == 256) {
            n8 += k.b0.x.b.x0.h.e.e(32, (p)this.A);
        }
        this.C = n2 = n8 + this.j() + this.n.size();
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
        for (int i3 = 0; i3 < this.x.size(); ++i3) {
            if (((u)((Object)this.x.get(i3))).f()) continue;
            this.B = 0;
            return false;
        }
        boolean bl2 = (128 & this.o) == 128;
        if (bl2 && !this.y.f()) {
            this.B = 0;
            return false;
        }
        boolean bl3 = (256 & this.o) == 256;
        if (bl3 && !this.A.f()) {
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
        this.p = 6;
        this.q = 6;
        this.r = 0;
        this.s = q2 = q.l;
        this.t = 0;
        this.u = Collections.emptyList();
        this.v = q2;
        this.w = 0;
        this.x = Collections.emptyList();
        this.y = t.k;
        this.z = Collections.emptyList();
        this.A = e.k;
    }

    public static final class b
    extends h.c<i, b> {
        public int n;
        public int o = 6;
        public int p = 6;
        public int q;
        public q r;
        public int s;
        public List<s> t;
        public q u;
        public int v;
        public List<u> w;
        public t x;
        public List<Integer> y;
        public e z;

        public b() {
            q q2;
            this.r = q2 = q.l;
            this.t = Collections.emptyList();
            this.u = q2;
            this.w = Collections.emptyList();
            this.x = t.k;
            this.y = Collections.emptyList();
            this.z = e.k;
        }

        public p build() {
            i i2 = this.k();
            if (i2.f()) {
                return i2;
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

        public i k() {
            i i2 = new i(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            i2.p = this.o;
            if ((n2 & 2) == 2) {
                n4 |= 2;
            }
            i2.q = this.p;
            if ((n2 & 4) == 4) {
                n4 |= 4;
            }
            i2.r = this.q;
            if ((n2 & 8) == 8) {
                n4 |= 8;
            }
            i2.s = this.r;
            if ((n2 & 16) == 16) {
                n4 |= 16;
            }
            i2.t = this.s;
            if ((n2 & 32) == 32) {
                this.t = Collections.unmodifiableList(this.t);
                this.n = -33 & this.n;
            }
            i2.u = this.t;
            if ((n2 & 64) == 64) {
                n4 |= 32;
            }
            i2.v = this.u;
            if ((n2 & 128) == 128) {
                n4 |= 64;
            }
            i2.w = this.v;
            if ((256 & this.n) == 256) {
                this.w = Collections.unmodifiableList(this.w);
                this.n = -257 & this.n;
            }
            i2.x = this.w;
            if ((n2 & 512) == 512) {
                n4 |= 128;
            }
            i2.y = this.x;
            if ((1024 & this.n) == 1024) {
                this.y = Collections.unmodifiableList(this.y);
                this.n = -1025 & this.n;
            }
            i2.z = this.y;
            if ((n2 & 2048) == 2048) {
                n4 |= 256;
            }
            i2.A = this.z;
            i2.o = n4;
            return i2;
        }

        public b l(i i2) {
            boolean bl;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            if (i2 == i.l) {
                return this;
            }
            int n2 = i2.o;
            boolean bl5 = (n2 & 1) == 1;
            if (bl5) {
                int n3 = i2.p;
                this.n = 1 | this.n;
                this.o = n3;
            }
            if (bl4 = (n2 & 2) == 2) {
                int n4 = i2.q;
                this.n = 2 | this.n;
                this.p = n4;
            }
            if (bl = (n2 & 4) == 4) {
                int n5 = i2.r;
                this.n = 4 | this.n;
                this.q = n5;
            }
            if (i2.v()) {
                q q2;
                q q3 = i2.s;
                if ((8 & this.n) == 8 && (q2 = this.r) != q.l) {
                    q3 = e.e.a.a.a.A((q)q2, (q)q3);
                }
                this.r = q3;
                this.n = 8 | this.n;
            }
            if (bl3 = (16 & i2.o) == 16) {
                int n6 = i2.t;
                this.n = 16 | this.n;
                this.s = n6;
            }
            if (!i2.u.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = i2.u;
                    this.n = -33 & this.n;
                } else {
                    if ((32 & this.n) != 32) {
                        this.t = new ArrayList(this.t);
                        this.n = 32 | this.n;
                    }
                    this.t.addAll(i2.u);
                }
            }
            if (i2.t()) {
                q q4;
                q q5 = i2.v;
                if ((64 & this.n) == 64 && (q4 = this.u) != q.l) {
                    q5 = e.e.a.a.a.A((q)q4, (q)q5);
                }
                this.u = q5;
                this.n = 64 | this.n;
            }
            if (i2.u()) {
                int n7 = i2.w;
                this.n = 128 | this.n;
                this.v = n7;
            }
            if (!i2.x.isEmpty()) {
                if (this.w.isEmpty()) {
                    this.w = i2.x;
                    this.n = -257 & this.n;
                } else {
                    if ((256 & this.n) != 256) {
                        this.w = new ArrayList(this.w);
                        this.n = 256 | this.n;
                    }
                    this.w.addAll(i2.x);
                }
            }
            if (bl2 = (128 & i2.o) == 128) {
                t t2;
                t t3 = i2.y;
                if ((512 & this.n) == 512 && (t2 = this.x) != t.k) {
                    t.b b2 = t.i(t2);
                    b2.k(t3);
                    t3 = b2.j();
                }
                this.x = t3;
                this.n = 512 | this.n;
            }
            if (!i2.z.isEmpty()) {
                if (this.y.isEmpty()) {
                    this.y = i2.z;
                    this.n = -1025 & this.n;
                } else {
                    if ((1024 & this.n) != 1024) {
                        this.y = new ArrayList(this.y);
                        this.n = 1024 | this.n;
                    }
                    this.y.addAll(i2.z);
                }
            }
            int n8 = 256 & i2.o;
            boolean bl6 = false;
            if (n8 == 256) {
                bl6 = true;
            }
            if (bl6) {
                e e2;
                e e3 = i2.A;
                if ((2048 & this.n) == 2048 && (e2 = this.z) != e.k) {
                    e.b b3 = new e.b();
                    b3.k(e2);
                    b3.k(e3);
                    e3 = b3.j();
                }
                this.z = e3;
                this.n = 2048 | this.n;
            }
            this.j(i2);
            this.k = this.k.k(i2.n);
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
            i i2;
            i i3 = i.m.a(d2, f2);
            if (i3 == null) return this;
            this.l(i3);
            return this;
            {
                i i4;
                catch (Throwable throwable) {
                    i2 = null;
                }
                catch (j j2) {}
                {
                    i4 = (i)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    i2 = i4;
                }
            }
            if (i2 == null) throw var5_6;
            this.l(i2);
            throw var5_6;
        }
    }

}

