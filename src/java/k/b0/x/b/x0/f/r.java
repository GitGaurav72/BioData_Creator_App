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
 *  k.b0.x.b.x0.f.r$a
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
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.r;
import k.b0.x.b.x0.f.s;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.v;

public final class r
extends h.d<r> {
    public static final r l;
    public static k.b0.x.b.x0.h.r<r> m;
    public final c n;
    public int o;
    public int p;
    public int q;
    public List<s> r;
    public q s;
    public int t;
    public q u;
    public int v;
    public List<k.b0.x.b.x0.f.b> w;
    public List<Integer> x;
    public byte y;
    public int z;

    public static {
        r r2;
        m = new a();
        l = r2 = new r();
        r2.v();
    }

    public r() {
        this.y = (byte)-1;
        this.z = -1;
        this.n = c.k;
    }

    /*
     * Exception decompiling
     */
    public r(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl336.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public r(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.y = (byte)-1;
        this.z = -1;
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
        for (int i2 = 0; i2 < this.r.size(); ++i2) {
            e2.r(3, (p)this.r.get(i2));
        }
        if ((4 & this.o) == 4) {
            e2.r(4, (p)this.s);
        }
        if ((8 & this.o) == 8) {
            e2.p(5, this.t);
        }
        if ((16 & this.o) == 16) {
            e2.r(6, (p)this.u);
        }
        if ((32 & this.o) == 32) {
            e2.p(7, this.v);
        }
        int n2 = 0;
        do {
            int n3 = this.w.size();
            if (n2 >= n3) break;
            e2.r(8, (p)this.w.get(n2));
            ++n2;
        } while (true);
        for (int i3 = 0; i3 < this.x.size(); ++i3) {
            e2.p(31, (Integer)this.x.get(i3));
        }
        a2.a(200, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.z;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 1 & this.o;
        int n5 = 0;
        int n6 = n4 == 1 ? 0 + e.c(1, this.p) : 0;
        if ((2 & this.o) == 2) {
            n6 += e.c(2, this.q);
        }
        for (int i2 = 0; i2 < this.r.size(); ++i2) {
            n6 += e.e(3, (p)this.r.get(i2));
        }
        if ((4 & this.o) == 4) {
            n6 += e.e(4, (p)this.s);
        }
        if ((8 & this.o) == 8) {
            n6 += e.c(5, this.t);
        }
        if ((16 & this.o) == 16) {
            n6 += e.e(6, (p)this.u);
        }
        if ((32 & this.o) == 32) {
            n6 += e.c(7, this.v);
        }
        for (int i3 = 0; i3 < this.w.size(); ++i3) {
            n6 += e.e(8, (p)this.w.get(i3));
        }
        int n7 = 0;
        while (n5 < this.x.size()) {
            n7 += e.d((Integer)this.x.get(n5));
            ++n5;
        }
        this.z = n2 = n6 + n7 + 2 * this.x.size() + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl = (2 & this.o) == 2;
        if (!bl) {
            this.y = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.r.size(); ++i2) {
            if (((s)((Object)this.r.get(i2))).f()) continue;
            this.y = 0;
            return false;
        }
        if (this.u() && !this.s.f()) {
            this.y = 0;
            return false;
        }
        if (this.t() && !this.u.f()) {
            this.y = 0;
            return false;
        }
        for (int i3 = 0; i3 < this.w.size(); ++i3) {
            if (((k.b0.x.b.x0.f.b)this.w.get(i3)).f()) continue;
            this.y = 0;
            return false;
        }
        if (!this.i()) {
            this.y = 0;
            return false;
        }
        this.y = 1;
        return true;
    }

    public boolean t() {
        return (16 & this.o) == 16;
    }

    public boolean u() {
        return (4 & this.o) == 4;
    }

    public final void v() {
        q q2;
        this.p = 6;
        this.q = 0;
        this.r = Collections.emptyList();
        this.s = q2 = q.l;
        this.t = 0;
        this.u = q2;
        this.v = 0;
        this.w = Collections.emptyList();
        this.x = Collections.emptyList();
    }

    public static final class b
    extends h.c<r, b> {
        public int n;
        public int o = 6;
        public int p;
        public List<s> q = Collections.emptyList();
        public q r;
        public int s;
        public q t;
        public int u;
        public List<k.b0.x.b.x0.f.b> v;
        public List<Integer> w;

        public b() {
            q q2;
            this.r = q2 = q.l;
            this.t = q2;
            this.v = Collections.emptyList();
            this.w = Collections.emptyList();
        }

        public p build() {
            r r2 = this.k();
            if (r2.f()) {
                return r2;
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

        public r k() {
            r r2 = new r(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            r2.p = this.o;
            if ((n2 & 2) == 2) {
                n4 |= 2;
            }
            r2.q = this.p;
            if ((n2 & 4) == 4) {
                this.q = Collections.unmodifiableList(this.q);
                this.n = -5 & this.n;
            }
            r2.r = this.q;
            if ((n2 & 8) == 8) {
                n4 |= 4;
            }
            r2.s = this.r;
            if ((n2 & 16) == 16) {
                n4 |= 8;
            }
            r2.t = this.s;
            if ((n2 & 32) == 32) {
                n4 |= 16;
            }
            r2.u = this.t;
            if ((n2 & 64) == 64) {
                n4 |= 32;
            }
            r2.v = this.u;
            if ((128 & this.n) == 128) {
                this.v = Collections.unmodifiableList(this.v);
                this.n = -129 & this.n;
            }
            r2.w = this.v;
            if ((256 & this.n) == 256) {
                this.w = Collections.unmodifiableList(this.w);
                this.n = -257 & this.n;
            }
            r2.x = this.w;
            r2.o = n4;
            return r2;
        }

        public b l(r r2) {
            boolean bl;
            boolean bl2;
            if (r2 == r.l) {
                return this;
            }
            int n2 = r2.o;
            boolean bl3 = (n2 & 1) == 1;
            if (bl3) {
                int n3 = r2.p;
                this.n = 1 | this.n;
                this.o = n3;
            }
            if (bl2 = (n2 & 2) == 2) {
                int n4 = r2.q;
                this.n = 2 | this.n;
                this.p = n4;
            }
            if (!r2.r.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = r2.r;
                    this.n = -5 & this.n;
                } else {
                    if ((4 & this.n) != 4) {
                        this.q = new ArrayList(this.q);
                        this.n = 4 | this.n;
                    }
                    this.q.addAll(r2.r);
                }
            }
            if (r2.u()) {
                q q2;
                q q3 = r2.s;
                if ((8 & this.n) == 8 && (q2 = this.r) != q.l) {
                    q3 = e.e.a.a.a.A((q)q2, (q)q3);
                }
                this.r = q3;
                this.n = 8 | this.n;
            }
            if (bl = (8 & r2.o) == 8) {
                int n5 = r2.t;
                this.n = 16 | this.n;
                this.s = n5;
            }
            if (r2.t()) {
                q q4;
                q q5 = r2.u;
                if ((32 & this.n) == 32 && (q4 = this.t) != q.l) {
                    q5 = e.e.a.a.a.A((q)q4, (q)q5);
                }
                this.t = q5;
                this.n = 32 | this.n;
            }
            int n6 = 32 & r2.o;
            boolean bl4 = false;
            if (n6 == 32) {
                bl4 = true;
            }
            if (bl4) {
                int n7 = r2.v;
                this.n = 64 | this.n;
                this.u = n7;
            }
            if (!r2.w.isEmpty()) {
                if (this.v.isEmpty()) {
                    this.v = r2.w;
                    this.n = -129 & this.n;
                } else {
                    if ((128 & this.n) != 128) {
                        this.v = new ArrayList(this.v);
                        this.n = 128 | this.n;
                    }
                    this.v.addAll(r2.w);
                }
            }
            if (!r2.x.isEmpty()) {
                if (this.w.isEmpty()) {
                    this.w = r2.x;
                    this.n = -257 & this.n;
                } else {
                    if ((256 & this.n) != 256) {
                        this.w = new ArrayList(this.w);
                        this.n = 256 | this.n;
                    }
                    this.w.addAll(r2.x);
                }
            }
            this.j(r2);
            this.k = this.k.k(r2.n);
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
            r r2;
            r r3 = r.m.a(d2, f2);
            if (r3 == null) return this;
            this.l(r3);
            return this;
            {
                r r4;
                catch (Throwable throwable) {
                    r2 = null;
                }
                catch (j j2) {}
                {
                    r4 = (r)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    r2 = r4;
                }
            }
            if (r2 == null) throw var5_6;
            this.l(r2);
            throw var5_6;
        }
    }

}

