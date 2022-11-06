/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.f.q$a
 *  k.b0.x.b.x0.f.q$b$a
 *  k.b0.x.b.x0.f.q$b$c
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
import java.util.Objects;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class q
extends h.d<q> {
    public static final q l;
    public static r<q> m;
    public q A;
    public int B;
    public int C;
    public byte D;
    public int E;
    public final k.b0.x.b.x0.h.c n;
    public int o;
    public List<b> p;
    public boolean q;
    public int r;
    public q s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public q y;
    public int z;

    public static {
        q q2;
        m = new a();
        l = q2 = new q();
        q2.y();
    }

    public q() {
        this.D = (byte)-1;
        this.E = -1;
        this.n = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public q(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl337.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public q(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.D = (byte)-1;
        this.E = -1;
        this.n = c2.k;
    }

    public static c z(q q2) {
        c c2 = new c();
        c2.l(q2);
        return c2;
    }

    public c A() {
        return q.z(this);
    }

    public p a() {
        return l;
    }

    public void c(e e2) {
        this.d();
        h.a a2 = this.p();
        if ((4096 & this.o) == 4096) {
            e2.p(1, this.C);
        }
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            e2.r(2, (p)this.p.get(i2));
        }
        if ((1 & this.o) == 1) {
            int n2 = this.q;
            e2.y(24);
            e2.t(n2);
        }
        if ((2 & this.o) == 2) {
            e2.p(4, this.r);
        }
        if ((4 & this.o) == 4) {
            e2.r(5, (p)this.s);
        }
        if ((16 & this.o) == 16) {
            e2.p(6, this.u);
        }
        if ((32 & this.o) == 32) {
            e2.p(7, this.v);
        }
        if ((8 & this.o) == 8) {
            e2.p(8, this.t);
        }
        if ((64 & this.o) == 64) {
            e2.p(9, this.w);
        }
        if ((256 & this.o) == 256) {
            e2.r(10, (p)this.y);
        }
        if ((512 & this.o) == 512) {
            e2.p(11, this.z);
        }
        if ((128 & this.o) == 128) {
            e2.p(12, this.x);
        }
        if ((1024 & this.o) == 1024) {
            e2.r(13, (p)this.A);
        }
        if ((2048 & this.o) == 2048) {
            e2.p(14, this.B);
        }
        a2.a(200, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3;
        int n4 = this.E;
        if (n4 != -1) {
            return n4;
        }
        int n5 = 4096 & this.o;
        int n6 = 0;
        if (n5 == 4096) {
            n3 = 0 + e.c(1, this.C);
            n6 = 0;
        } else {
            n3 = 0;
        }
        while (n6 < this.p.size()) {
            n3 += e.e(2, (p)this.p.get(n6));
            ++n6;
        }
        if ((1 & this.o) == 1) {
            n3 += 1 + e.i(3);
        }
        if ((2 & this.o) == 2) {
            n3 += e.c(4, this.r);
        }
        if ((4 & this.o) == 4) {
            n3 += e.e(5, (p)this.s);
        }
        if ((16 & this.o) == 16) {
            n3 += e.c(6, this.u);
        }
        if ((32 & this.o) == 32) {
            n3 += e.c(7, this.v);
        }
        if ((8 & this.o) == 8) {
            n3 += e.c(8, this.t);
        }
        if ((64 & this.o) == 64) {
            n3 += e.c(9, this.w);
        }
        if ((256 & this.o) == 256) {
            n3 += e.e(10, (p)this.y);
        }
        if ((512 & this.o) == 512) {
            n3 += e.c(11, this.z);
        }
        if ((128 & this.o) == 128) {
            n3 += e.c(12, this.x);
        }
        if ((1024 & this.o) == 1024) {
            n3 += e.e(13, (p)this.A);
        }
        if ((2048 & this.o) == 2048) {
            n3 += e.c(14, this.B);
        }
        this.E = n2 = n3 + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new c();
    }

    public final boolean f() {
        byte by = this.D;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            if (((b)this.p.get(i2)).f()) continue;
            this.D = 0;
            return false;
        }
        if (this.v() && !this.s.f()) {
            this.D = 0;
            return false;
        }
        if (this.w() && !this.y.f()) {
            this.D = 0;
            return false;
        }
        if (this.t() && !this.A.f()) {
            this.D = 0;
            return false;
        }
        if (!this.i()) {
            this.D = 0;
            return false;
        }
        this.D = 1;
        return true;
    }

    public boolean t() {
        return (1024 & this.o) == 1024;
    }

    public boolean u() {
        return (16 & this.o) == 16;
    }

    public boolean v() {
        return (4 & this.o) == 4;
    }

    public boolean w() {
        return (256 & this.o) == 256;
    }

    public boolean x() {
        return (128 & this.o) == 128;
    }

    public final void y() {
        q q2;
        this.p = Collections.emptyList();
        this.q = false;
        this.r = 0;
        this.s = q2 = l;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = q2;
        this.z = 0;
        this.A = q2;
        this.B = 0;
        this.C = 0;
    }

    public static final class k.b0.x.b.x0.f.q$b
    extends h
    implements k.b0.x.b.x0.h.q {
        public static final k.b0.x.b.x0.f.q$b k;
        public static r<k.b0.x.b.x0.f.q$b> l;
        public final k.b0.x.b.x0.h.c m;
        public int n;
        public c o;
        public q p;
        public int q;
        public byte r;
        public int s;

        public static {
            k.b0.x.b.x0.f.q$b b2;
            l = new a();
            k = b2 = new k.b0.x.b.x0.f.q$b();
            b2.o = c.m;
            b2.p = q.l;
            b2.q = 0;
        }

        public k.b0.x.b.x0.f.q$b() {
            this.r = (byte)-1;
            this.s = -1;
            this.m = k.b0.x.b.x0.h.c.k;
        }

        /*
         * Exception decompiling
         */
        public k.b0.x.b.x0.f.q$b(d var1, f var2, k.b0.x.b.x0.f.a var3) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl157.1 : ALOAD_0 : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        public k.b0.x.b.x0.f.q$b(h.b b2, k.b0.x.b.x0.f.a a2) {
            super(b2);
            this.r = (byte)-1;
            this.s = -1;
            this.m = b2.k;
        }

        public p.a b() {
            b b2 = new b();
            b2.k(this);
            return b2;
        }

        public void c(e e2) {
            this.d();
            if ((1 & this.n) == 1) {
                e2.n(1, this.o.p);
            }
            if ((2 & this.n) == 2) {
                e2.r(2, (p)this.p);
            }
            if ((4 & this.n) == 4) {
                e2.p(3, this.q);
            }
            e2.u(this.m);
        }

        public int d() {
            int n2;
            int n3 = this.s;
            if (n3 != -1) {
                return n3;
            }
            int n4 = 1 & this.n;
            int n5 = 0;
            if (n4 == 1) {
                n5 = 0 + e.b(1, this.o.p);
            }
            if ((2 & this.n) == 2) {
                n5 += e.e(2, (p)this.p);
            }
            if ((4 & this.n) == 4) {
                n5 += e.c(3, this.q);
            }
            this.s = n2 = n5 + this.m.size();
            return n2;
        }

        public p.a e() {
            return new b();
        }

        @Override
        public final boolean f() {
            byte by = this.r;
            if (by == 1) {
                return true;
            }
            if (by == 0) {
                return false;
            }
            if (this.i() && !this.p.f()) {
                this.r = 0;
                return false;
            }
            this.r = 1;
            return true;
        }

        public boolean i() {
            return (2 & this.n) == 2;
        }

        public static final class b
        extends h.b<k.b0.x.b.x0.f.q$b, b> {
            public int l;
            public c m = c.m;
            public q n = q.l;
            public int o;

            public p build() {
                k.b0.x.b.x0.f.q$b b2 = this.j();
                if (b2.f()) {
                    return b2;
                }
                throw new v();
            }

            @Override
            public Object clone() {
                b b2 = new b();
                b2.k(this.j());
                return b2;
            }

            @Override
            public h.b h() {
                b b2 = new b();
                b2.k(this.j());
                return b2;
            }

            public k.b0.x.b.x0.f.q$b j() {
                k.b0.x.b.x0.f.q$b b2 = new k.b0.x.b.x0.f.q$b(this, null);
                int n2 = this.l;
                int n3 = n2 & 1;
                int n4 = 1;
                if (n3 != n4) {
                    n4 = 0;
                }
                b2.o = this.m;
                if ((n2 & 2) == 2) {
                    n4 |= 2;
                }
                b2.p = this.n;
                if ((n2 & 4) == 4) {
                    n4 |= 4;
                }
                b2.q = this.o;
                b2.n = n4;
                return b2;
            }

            public b k(k.b0.x.b.x0.f.q$b b2) {
                if (b2 == k.b0.x.b.x0.f.q$b.k) {
                    return this;
                }
                int n2 = b2.n;
                int n3 = 1;
                int n4 = (n2 & n3) == n3 ? n3 : 0;
                if (n4 != 0) {
                    c c2 = b2.o;
                    Objects.requireNonNull((Object)c2);
                    this.l = n3 | this.l;
                    this.m = c2;
                }
                if (b2.i()) {
                    q q2;
                    q q3 = b2.p;
                    if ((2 & this.l) == 2 && (q2 = this.n) != q.l) {
                        q3 = e.e.a.a.a.A((q)q2, (q)q3);
                    }
                    this.n = q3;
                    this.l = 2 | this.l;
                }
                if ((4 & b2.n) != 4) {
                    n3 = 0;
                }
                if (n3 != 0) {
                    int n5 = b2.q;
                    this.l = 4 | this.l;
                    this.o = n5;
                }
                this.k = this.k.k(b2.m);
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
            public b l(d d2, f f2) {
                void var5_6;
                k.b0.x.b.x0.f.q$b b2;
                k.b0.x.b.x0.f.q$b b3 = k.b0.x.b.x0.f.q$b.l.a(d2, f2);
                if (b3 == null) return this;
                this.k(b3);
                return this;
                {
                    k.b0.x.b.x0.f.q$b b4;
                    catch (Throwable throwable) {
                        b2 = null;
                    }
                    catch (j j2) {}
                    {
                        b4 = (k.b0.x.b.x0.f.q$b)j2.k;
                    }
                    try {
                        throw j2;
                    }
                    catch (Throwable throwable) {
                        b2 = b4;
                    }
                }
                if (b2 == null) throw var5_6;
                this.k(b2);
                throw var5_6;
            }
        }

    }

    public static final class c
    extends h.c<q, c> {
        public int A;
        public int B;
        public int n;
        public List<b> o = Collections.emptyList();
        public boolean p;
        public int q;
        public q r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public q x;
        public int y;
        public q z;

        public c() {
            q q2;
            this.r = q2 = q.l;
            this.x = q2;
            this.z = q2;
        }

        public p build() {
            q q2 = this.k();
            if (q2.f()) {
                return q2;
            }
            throw new v();
        }

        @Override
        public Object clone() {
            c c2 = new c();
            c2.l(this.k());
            return c2;
        }

        @Override
        public h.b h() {
            c c2 = new c();
            c2.l(this.k());
            return c2;
        }

        public q k() {
            q q2 = new q(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 == n4) {
                this.o = Collections.unmodifiableList(this.o);
                this.n = -2 & this.n;
            }
            q2.p = this.o;
            if ((n2 & 2) != 2) {
                n4 = 0;
            }
            q2.q = this.p;
            if ((n2 & 4) == 4) {
                n4 |= 2;
            }
            q2.r = this.q;
            if ((n2 & 8) == 8) {
                n4 |= 4;
            }
            q2.s = this.r;
            if ((n2 & 16) == 16) {
                n4 |= 8;
            }
            q2.t = this.s;
            if ((n2 & 32) == 32) {
                n4 |= 16;
            }
            q2.u = this.t;
            if ((n2 & 64) == 64) {
                n4 |= 32;
            }
            q2.v = this.u;
            if ((n2 & 128) == 128) {
                n4 |= 64;
            }
            q2.w = this.v;
            if ((n2 & 256) == 256) {
                n4 |= 128;
            }
            q2.x = this.w;
            if ((n2 & 512) == 512) {
                n4 |= 256;
            }
            q2.y = this.x;
            if ((n2 & 1024) == 1024) {
                n4 |= 512;
            }
            q2.z = this.y;
            if ((n2 & 2048) == 2048) {
                n4 |= 1024;
            }
            q2.A = this.z;
            if ((n2 & 4096) == 4096) {
                n4 |= 2048;
            }
            q2.B = this.A;
            if ((n2 & 8192) == 8192) {
                n4 |= 4096;
            }
            q2.C = this.B;
            q2.o = n4;
            return q2;
        }

        public c l(q q2) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            q q3 = q.l;
            if (q2 == q3) {
                return this;
            }
            boolean bl = q2.p.isEmpty();
            int n12 = 1;
            if (!bl) {
                if (this.o.isEmpty()) {
                    this.o = q2.p;
                    this.n = -2 & this.n;
                } else {
                    if ((n12 & this.n) != n12) {
                        this.o = new ArrayList(this.o);
                        this.n = n12 | this.n;
                    }
                    this.o.addAll(q2.p);
                }
            }
            if ((n6 = ((n5 = q2.o) & 1) == n12 ? n12 : 0) != 0) {
                boolean bl2 = q2.q;
                this.n = 2 | this.n;
                this.p = bl2;
            }
            if ((n10 = (n5 & 2) == 2 ? n12 : 0) != 0) {
                int n13 = q2.r;
                this.n = 4 | this.n;
                this.q = n13;
            }
            if (q2.v()) {
                q q4;
                q q5 = q2.s;
                if ((8 & this.n) == 8 && (q4 = this.r) != q3) {
                    q5 = e.e.a.a.a.A((q)q4, (q)q5);
                }
                this.r = q5;
                this.n = 8 | this.n;
            }
            if ((n7 = (8 & q2.o) == 8 ? n12 : 0) != 0) {
                int n14 = q2.t;
                this.n = 16 | this.n;
                this.s = n14;
            }
            if (q2.u()) {
                int n15 = q2.u;
                this.n = 32 | this.n;
                this.t = n15;
            }
            if ((n3 = ((n4 = q2.o) & 32) == 32 ? n12 : 0) != 0) {
                int n16 = q2.v;
                this.n = 64 | this.n;
                this.u = n16;
            }
            if ((n9 = (n4 & 64) == 64 ? n12 : 0) != 0) {
                int n17 = q2.w;
                this.n = 128 | this.n;
                this.v = n17;
            }
            if (q2.x()) {
                int n18 = q2.x;
                this.n = 256 | this.n;
                this.w = n18;
            }
            if (q2.w()) {
                q q6;
                q q7 = q2.y;
                if ((512 & this.n) == 512 && (q6 = this.x) != q3) {
                    q7 = e.e.a.a.a.A((q)q6, (q)q7);
                }
                this.x = q7;
                this.n = 512 | this.n;
            }
            if ((n11 = (512 & q2.o) == 512 ? n12 : 0) != 0) {
                int n19 = q2.z;
                this.n = 1024 | this.n;
                this.y = n19;
            }
            if (q2.t()) {
                q q8;
                q q9 = q2.A;
                if ((2048 & this.n) == 2048 && (q8 = this.z) != q3) {
                    q9 = e.e.a.a.a.A((q)q8, (q)q9);
                }
                this.z = q9;
                this.n = 2048 | this.n;
            }
            if ((n8 = ((n2 = q2.o) & 2048) == 2048 ? n12 : 0) != 0) {
                int n20 = q2.B;
                this.n = 4096 | this.n;
                this.A = n20;
            }
            if ((n2 & 4096) != 4096) {
                n12 = 0;
            }
            if (n12 != 0) {
                int n21 = q2.C;
                this.n = 8192 | this.n;
                this.B = n21;
            }
            this.j(q2);
            this.k = this.k.k(q2.n);
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
        public c m(d d2, f f2) {
            void var5_6;
            q q2;
            q q3 = q.m.a(d2, f2);
            if (q3 == null) return this;
            this.l(q3);
            return this;
            {
                q q4;
                catch (Throwable throwable) {
                    q2 = null;
                }
                catch (j j2) {}
                {
                    q4 = (q)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    q2 = q4;
                }
            }
            if (q2 == null) throw var5_6;
            this.l(q2);
            throw var5_6;
        }
    }

}

