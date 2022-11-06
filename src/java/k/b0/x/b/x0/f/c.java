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
 *  k.b0.x.b.x0.f.c$a
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
import k.b0.x.b.x0.f.c;
import k.b0.x.b.x0.f.d;
import k.b0.x.b.x0.f.g;
import k.b0.x.b.x0.f.i;
import k.b0.x.b.x0.f.n;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.r;
import k.b0.x.b.x0.f.s;
import k.b0.x.b.x0.f.t;
import k.b0.x.b.x0.f.w;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.v;

public final class c
extends h.d<c> {
    public static final c l;
    public static k.b0.x.b.x0.h.r<c> m;
    public List<n> A;
    public List<r> B;
    public List<g> C;
    public List<Integer> D;
    public int E;
    public int F;
    public q G;
    public int H;
    public t I;
    public List<Integer> J;
    public w K;
    public byte L;
    public int M;
    public final k.b0.x.b.x0.h.c n;
    public int o;
    public int p;
    public int q;
    public int r;
    public List<s> s;
    public List<q> t;
    public List<Integer> u;
    public int v;
    public List<Integer> w;
    public int x;
    public List<d> y;
    public List<i> z;

    public static {
        c c2;
        m = new a();
        l = c2 = new c();
        c2.u();
    }

    public c() {
        this.v = -1;
        this.x = -1;
        this.E = -1;
        this.L = (byte)-1;
        this.M = -1;
        this.n = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public c(k.b0.x.b.x0.h.d var1_1, f var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CASE]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    public c(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.v = -1;
        this.x = -1;
        this.E = -1;
        this.L = (byte)-1;
        this.M = -1;
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
        if (this.u.size() > 0) {
            e2.y(18);
            e2.y(this.v);
        }
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            e2.q((Integer)this.u.get(i2));
        }
        if ((2 & this.o) == 2) {
            e2.p(3, this.q);
        }
        if ((4 & this.o) == 4) {
            e2.p(4, this.r);
        }
        for (int i3 = 0; i3 < this.s.size(); ++i3) {
            e2.r(5, (p)this.s.get(i3));
        }
        for (int i4 = 0; i4 < this.t.size(); ++i4) {
            e2.r(6, (p)this.t.get(i4));
        }
        if (this.w.size() > 0) {
            e2.y(58);
            e2.y(this.x);
        }
        for (int i5 = 0; i5 < this.w.size(); ++i5) {
            e2.q((Integer)this.w.get(i5));
        }
        for (int i6 = 0; i6 < this.y.size(); ++i6) {
            e2.r(8, (p)this.y.get(i6));
        }
        for (int i7 = 0; i7 < this.z.size(); ++i7) {
            e2.r(9, (p)this.z.get(i7));
        }
        for (int i8 = 0; i8 < this.A.size(); ++i8) {
            e2.r(10, (p)this.A.get(i8));
        }
        for (int i9 = 0; i9 < this.B.size(); ++i9) {
            e2.r(11, (p)this.B.get(i9));
        }
        for (int i10 = 0; i10 < this.C.size(); ++i10) {
            e2.r(13, (p)this.C.get(i10));
        }
        if (this.D.size() > 0) {
            e2.y(130);
            e2.y(this.E);
        }
        for (int i11 = 0; i11 < this.D.size(); ++i11) {
            e2.q((Integer)this.D.get(i11));
        }
        if ((8 & this.o) == 8) {
            e2.p(17, this.F);
        }
        if ((16 & this.o) == 16) {
            e2.r(18, (p)this.G);
        }
        if ((32 & this.o) == 32) {
            e2.p(19, this.H);
        }
        int n2 = 64 & this.o;
        int n3 = 0;
        if (n2 == 64) {
            e2.r(30, (p)this.I);
        }
        while (n3 < this.J.size()) {
            e2.p(31, (Integer)this.J.get(n3));
            ++n3;
        }
        if ((128 & this.o) == 128) {
            e2.r(32, (p)this.K);
        }
        a2.a(19000, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.M;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 1 & this.o;
        int n5 = 0;
        int n6 = n4 == 1 ? 0 + e.c(1, this.p) : 0;
        int n7 = 0;
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            n7 += e.d((Integer)this.u.get(i2));
        }
        int n8 = n6 + n7;
        if (!this.u.isEmpty()) {
            n8 = n8 + 1 + e.d(n7);
        }
        this.v = n7;
        if ((2 & this.o) == 2) {
            n8 += e.c(3, this.q);
        }
        if ((4 & this.o) == 4) {
            n8 += e.c(4, this.r);
        }
        for (int i3 = 0; i3 < this.s.size(); ++i3) {
            n8 += e.e(5, (p)this.s.get(i3));
        }
        for (int i4 = 0; i4 < this.t.size(); ++i4) {
            n8 += e.e(6, (p)this.t.get(i4));
        }
        int n9 = 0;
        for (int i5 = 0; i5 < this.w.size(); ++i5) {
            n9 += e.d((Integer)this.w.get(i5));
        }
        int n10 = n8 + n9;
        if (!this.w.isEmpty()) {
            n10 = n10 + 1 + e.d(n9);
        }
        this.x = n9;
        for (int i6 = 0; i6 < this.y.size(); ++i6) {
            n10 += e.e(8, (p)this.y.get(i6));
        }
        for (int i7 = 0; i7 < this.z.size(); ++i7) {
            n10 += e.e(9, (p)this.z.get(i7));
        }
        for (int i8 = 0; i8 < this.A.size(); ++i8) {
            n10 += e.e(10, (p)this.A.get(i8));
        }
        for (int i9 = 0; i9 < this.B.size(); ++i9) {
            n10 += e.e(11, (p)this.B.get(i9));
        }
        for (int i10 = 0; i10 < this.C.size(); ++i10) {
            n10 += e.e(13, (p)this.C.get(i10));
        }
        int n11 = 0;
        for (int i11 = 0; i11 < this.D.size(); ++i11) {
            n11 += e.d((Integer)this.D.get(i11));
        }
        int n12 = n10 + n11;
        if (!this.D.isEmpty()) {
            n12 = n12 + 2 + e.d(n11);
        }
        this.E = n11;
        if ((8 & this.o) == 8) {
            n12 += e.c(17, this.F);
        }
        if ((16 & this.o) == 16) {
            n12 += e.e(18, (p)this.G);
        }
        if ((32 & this.o) == 32) {
            n12 += e.c(19, this.H);
        }
        if ((64 & this.o) == 64) {
            n12 += e.e(30, (p)this.I);
        }
        int n13 = 0;
        while (n5 < this.J.size()) {
            n13 += e.d((Integer)this.J.get(n5));
            ++n5;
        }
        int n14 = n12 + n13 + 2 * this.J.size();
        if ((128 & this.o) == 128) {
            n14 += e.e(32, (p)this.K);
        }
        this.M = n2 = n14 + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.L;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl = (2 & this.o) == 2;
        if (!bl) {
            this.L = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            if (((s)((Object)this.s.get(i2))).f()) continue;
            this.L = 0;
            return false;
        }
        for (int i3 = 0; i3 < this.t.size(); ++i3) {
            if (((q)((Object)this.t.get(i3))).f()) continue;
            this.L = 0;
            return false;
        }
        for (int i4 = 0; i4 < this.y.size(); ++i4) {
            if (((d)((Object)this.y.get(i4))).f()) continue;
            this.L = 0;
            return false;
        }
        for (int i5 = 0; i5 < this.z.size(); ++i5) {
            if (((i)((Object)this.z.get(i5))).f()) continue;
            this.L = 0;
            return false;
        }
        for (int i6 = 0; i6 < this.A.size(); ++i6) {
            if (((n)((Object)this.A.get(i6))).f()) continue;
            this.L = 0;
            return false;
        }
        for (int i7 = 0; i7 < this.B.size(); ++i7) {
            if (((r)((Object)this.B.get(i7))).f()) continue;
            this.L = 0;
            return false;
        }
        for (int i8 = 0; i8 < this.C.size(); ++i8) {
            if (((g)((Object)this.C.get(i8))).f()) continue;
            this.L = 0;
            return false;
        }
        if (this.t() && !this.G.f()) {
            this.L = 0;
            return false;
        }
        boolean bl2 = (64 & this.o) == 64;
        if (bl2 && !this.I.f()) {
            this.L = 0;
            return false;
        }
        if (!this.i()) {
            this.L = 0;
            return false;
        }
        this.L = 1;
        return true;
    }

    public boolean t() {
        return (16 & this.o) == 16;
    }

    public final void u() {
        this.p = 6;
        this.q = 0;
        this.r = 0;
        this.s = Collections.emptyList();
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
        this.w = Collections.emptyList();
        this.y = Collections.emptyList();
        this.z = Collections.emptyList();
        this.A = Collections.emptyList();
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        this.D = Collections.emptyList();
        this.F = 0;
        this.G = q.l;
        this.H = 0;
        this.I = t.k;
        this.J = Collections.emptyList();
        this.K = w.k;
    }

    public static final class b
    extends h.c<c, b> {
        public List<Integer> A = Collections.emptyList();
        public int B;
        public q C = q.l;
        public int D;
        public t E = t.k;
        public List<Integer> F = Collections.emptyList();
        public w G = w.k;
        public int n;
        public int o = 6;
        public int p;
        public int q;
        public List<s> r = Collections.emptyList();
        public List<q> s = Collections.emptyList();
        public List<Integer> t = Collections.emptyList();
        public List<Integer> u = Collections.emptyList();
        public List<d> v = Collections.emptyList();
        public List<i> w = Collections.emptyList();
        public List<n> x = Collections.emptyList();
        public List<r> y = Collections.emptyList();
        public List<g> z = Collections.emptyList();

        public p build() {
            c c2 = this.k();
            if (c2.f()) {
                return c2;
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

        public c k() {
            c c2 = new c(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            c2.p = this.o;
            if ((n2 & 2) == 2) {
                n4 |= 2;
            }
            c2.q = this.p;
            if ((n2 & 4) == 4) {
                n4 |= 4;
            }
            c2.r = this.q;
            if ((n2 & 8) == 8) {
                this.r = Collections.unmodifiableList(this.r);
                this.n = -9 & this.n;
            }
            c2.s = this.r;
            if ((16 & this.n) == 16) {
                this.s = Collections.unmodifiableList(this.s);
                this.n = -17 & this.n;
            }
            c2.t = this.s;
            if ((32 & this.n) == 32) {
                this.t = Collections.unmodifiableList(this.t);
                this.n = -33 & this.n;
            }
            c2.u = this.t;
            if ((64 & this.n) == 64) {
                this.u = Collections.unmodifiableList(this.u);
                this.n = -65 & this.n;
            }
            c2.w = this.u;
            if ((128 & this.n) == 128) {
                this.v = Collections.unmodifiableList(this.v);
                this.n = -129 & this.n;
            }
            c2.y = this.v;
            if ((256 & this.n) == 256) {
                this.w = Collections.unmodifiableList(this.w);
                this.n = -257 & this.n;
            }
            c2.z = this.w;
            if ((512 & this.n) == 512) {
                this.x = Collections.unmodifiableList(this.x);
                this.n = -513 & this.n;
            }
            c2.A = this.x;
            if ((1024 & this.n) == 1024) {
                this.y = Collections.unmodifiableList(this.y);
                this.n = -1025 & this.n;
            }
            c2.B = this.y;
            if ((2048 & this.n) == 2048) {
                this.z = Collections.unmodifiableList(this.z);
                this.n = -2049 & this.n;
            }
            c2.C = this.z;
            if ((4096 & this.n) == 4096) {
                this.A = Collections.unmodifiableList(this.A);
                this.n = -4097 & this.n;
            }
            c2.D = this.A;
            if ((n2 & 8192) == 8192) {
                n4 |= 8;
            }
            c2.F = this.B;
            if ((n2 & 16384) == 16384) {
                n4 |= 16;
            }
            c2.G = this.C;
            if ((n2 & 32768) == 32768) {
                n4 |= 32;
            }
            c2.H = this.D;
            if ((n2 & 65536) == 65536) {
                n4 |= 64;
            }
            c2.I = this.E;
            if ((131072 & this.n) == 131072) {
                this.F = Collections.unmodifiableList(this.F);
                this.n = -131073 & this.n;
            }
            c2.J = this.F;
            if ((n2 & 262144) == 262144) {
                n4 |= 128;
            }
            c2.K = this.G;
            c2.o = n4;
            return c2;
        }

        public b l(c c2) {
            boolean bl;
            boolean bl2;
            boolean bl3;
            int n2;
            boolean bl4;
            boolean bl5;
            if (c2 == c.l) {
                return this;
            }
            int n3 = c2.o;
            boolean bl6 = (n3 & 1) == 1;
            if (bl6) {
                int n4 = c2.p;
                this.n = 1 | this.n;
                this.o = n4;
            }
            if (bl5 = (n3 & 2) == 2) {
                int n5 = c2.q;
                this.n = 2 | this.n;
                this.p = n5;
            }
            if (bl2 = (n3 & 4) == 4) {
                int n6 = c2.r;
                this.n = 4 | this.n;
                this.q = n6;
            }
            if (!c2.s.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = c2.s;
                    this.n = -9 & this.n;
                } else {
                    if ((8 & this.n) != 8) {
                        this.r = new ArrayList(this.r);
                        this.n = 8 | this.n;
                    }
                    this.r.addAll(c2.s);
                }
            }
            if (!c2.t.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = c2.t;
                    this.n = -17 & this.n;
                } else {
                    if ((16 & this.n) != 16) {
                        this.s = new ArrayList(this.s);
                        this.n = 16 | this.n;
                    }
                    this.s.addAll(c2.t);
                }
            }
            if (!c2.u.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = c2.u;
                    this.n = -33 & this.n;
                } else {
                    if ((32 & this.n) != 32) {
                        this.t = new ArrayList(this.t);
                        this.n = 32 | this.n;
                    }
                    this.t.addAll(c2.u);
                }
            }
            if (!c2.w.isEmpty()) {
                if (this.u.isEmpty()) {
                    this.u = c2.w;
                    this.n = -65 & this.n;
                } else {
                    if ((64 & this.n) != 64) {
                        this.u = new ArrayList(this.u);
                        this.n = 64 | this.n;
                    }
                    this.u.addAll(c2.w);
                }
            }
            if (!c2.y.isEmpty()) {
                if (this.v.isEmpty()) {
                    this.v = c2.y;
                    this.n = -129 & this.n;
                } else {
                    if ((128 & this.n) != 128) {
                        this.v = new ArrayList(this.v);
                        this.n = 128 | this.n;
                    }
                    this.v.addAll(c2.y);
                }
            }
            if (!c2.z.isEmpty()) {
                if (this.w.isEmpty()) {
                    this.w = c2.z;
                    this.n = -257 & this.n;
                } else {
                    if ((256 & this.n) != 256) {
                        this.w = new ArrayList(this.w);
                        this.n = 256 | this.n;
                    }
                    this.w.addAll(c2.z);
                }
            }
            if (!c2.A.isEmpty()) {
                if (this.x.isEmpty()) {
                    this.x = c2.A;
                    this.n = -513 & this.n;
                } else {
                    if ((512 & this.n) != 512) {
                        this.x = new ArrayList(this.x);
                        this.n = 512 | this.n;
                    }
                    this.x.addAll(c2.A);
                }
            }
            if (!c2.B.isEmpty()) {
                if (this.y.isEmpty()) {
                    this.y = c2.B;
                    this.n = -1025 & this.n;
                } else {
                    if ((1024 & this.n) != 1024) {
                        this.y = new ArrayList(this.y);
                        this.n = 1024 | this.n;
                    }
                    this.y.addAll(c2.B);
                }
            }
            if (!c2.C.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = c2.C;
                    this.n = -2049 & this.n;
                } else {
                    if ((2048 & this.n) != 2048) {
                        this.z = new ArrayList(this.z);
                        this.n = 2048 | this.n;
                    }
                    this.z.addAll(c2.C);
                }
            }
            if (!c2.D.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = c2.D;
                    this.n = -4097 & this.n;
                } else {
                    if ((4096 & this.n) != 4096) {
                        this.A = new ArrayList(this.A);
                        this.n = 4096 | this.n;
                    }
                    this.A.addAll(c2.D);
                }
            }
            if (bl4 = (8 & c2.o) == 8) {
                int n7 = c2.F;
                this.n = 8192 | this.n;
                this.B = n7;
            }
            if (c2.t()) {
                q q2;
                q q3 = c2.G;
                if ((16384 & this.n) == 16384 && (q2 = this.C) != q.l) {
                    q3 = e.e.a.a.a.A((q)q2, (q)q3);
                }
                this.C = q3;
                this.n = 16384 | this.n;
            }
            if (bl = ((n2 = c2.o) & 32) == 32) {
                int n8 = c2.H;
                this.n = 32768 | this.n;
                this.D = n8;
            }
            if (bl3 = (n2 & 64) == 64) {
                t t2;
                t t3 = c2.I;
                if ((65536 & this.n) == 65536 && (t2 = this.E) != t.k) {
                    t.b b2 = t.i(t2);
                    b2.k(t3);
                    t3 = b2.j();
                }
                this.E = t3;
                this.n = 65536 | this.n;
            }
            if (!c2.J.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = c2.J;
                    this.n = -131073 & this.n;
                } else {
                    if ((131072 & this.n) != 131072) {
                        this.F = new ArrayList(this.F);
                        this.n = 131072 | this.n;
                    }
                    this.F.addAll(c2.J);
                }
            }
            int n9 = 128 & c2.o;
            boolean bl7 = false;
            if (n9 == 128) {
                bl7 = true;
            }
            if (bl7) {
                w w2;
                w w3 = c2.K;
                if ((262144 & this.n) == 262144 && (w2 = this.G) != w.k) {
                    w.b b3 = w.i(w2);
                    b3.k(w3);
                    w3 = b3.j();
                }
                this.G = w3;
                this.n = 262144 | this.n;
            }
            this.j(c2);
            this.k = this.k.k(c2.n);
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
        public b m(k.b0.x.b.x0.h.d d2, f f2) {
            void var5_6;
            c c2;
            c c3 = c.m.a(d2, f2);
            if (c3 == null) return this;
            this.l(c3);
            return this;
            {
                c c4;
                catch (Throwable throwable) {
                    c2 = null;
                }
                catch (j j2) {}
                {
                    c4 = (c)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    c2 = c4;
                }
            }
            if (c2 == null) throw var5_6;
            this.l(c2);
            throw var5_6;
        }
    }

}

