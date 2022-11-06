/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.f.b$a
 *  k.b0.x.b.x0.f.b$b$a
 *  k.b0.x.b.x0.f.b$b$c$a
 *  k.b0.x.b.x0.f.b$b$c$c
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
import k.b0.x.b.x0.f.b;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.q;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class b
extends h
implements q {
    public static final b k;
    public static r<b> l;
    public final k.b0.x.b.x0.h.c m;
    public int n;
    public int o;
    public List<b> p;
    public byte q;
    public int r;

    public static {
        b b2;
        l = new a();
        k = b2 = new b();
        b2.o = 0;
        b2.p = Collections.emptyList();
    }

    public b() {
        this.q = (byte)-1;
        this.r = -1;
        this.m = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public b(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl121.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public b(h.b b2, k.b0.x.b.x0.f.a a2) {
        super(b2);
        this.q = (byte)-1;
        this.r = -1;
        this.m = b2.k;
    }

    public p.a b() {
        c c2 = new c();
        c2.k(this);
        return c2;
    }

    public void c(e e2) {
        this.d();
        if ((1 & this.n) == 1) {
            e2.p(1, this.o);
        }
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            e2.r(2, (p)this.p.get(i2));
        }
        e2.u(this.m);
    }

    public int d() {
        int n2;
        int n3;
        int n4 = this.r;
        if (n4 != -1) {
            return n4;
        }
        int n5 = 1 & this.n;
        int n6 = 0;
        if (n5 == 1) {
            n3 = 0 + e.c(1, this.o);
            n6 = 0;
        } else {
            n3 = 0;
        }
        while (n6 < this.p.size()) {
            n3 += e.e(2, (p)this.p.get(n6));
            ++n6;
        }
        this.r = n2 = n3 + this.m.size();
        return n2;
    }

    public p.a e() {
        return new c();
    }

    @Override
    public final boolean f() {
        byte by = this.q;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl = (1 & this.n) == 1;
        if (!bl) {
            this.q = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            if (((b)this.p.get(i2)).f()) continue;
            this.q = 0;
            return false;
        }
        this.q = 1;
        return true;
    }

    public static final class k.b0.x.b.x0.f.b$b
    extends h
    implements q {
        public static final k.b0.x.b.x0.f.b$b k;
        public static r<k.b0.x.b.x0.f.b$b> l;
        public final k.b0.x.b.x0.h.c m;
        public int n;
        public int o;
        public c p;
        public byte q;
        public int r;

        public static {
            k.b0.x.b.x0.f.b$b b2;
            l = new a();
            k = b2 = new k.b0.x.b.x0.f.b$b();
            b2.o = 0;
            b2.p = c.k;
        }

        public k.b0.x.b.x0.f.b$b() {
            this.q = (byte)-1;
            this.r = -1;
            this.m = k.b0.x.b.x0.h.c.k;
        }

        /*
         * Exception decompiling
         */
        public k.b0.x.b.x0.f.b$b(d var1, f var2, k.b0.x.b.x0.f.a var3) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl138.1 : ALOAD_0 : trying to set 1 previously set to 0
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

        public k.b0.x.b.x0.f.b$b(h.b b2, k.b0.x.b.x0.f.a a2) {
            super(b2);
            this.q = (byte)-1;
            this.r = -1;
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
                e2.p(1, this.o);
            }
            if ((2 & this.n) == 2) {
                e2.r(2, (p)this.p);
            }
            e2.u(this.m);
        }

        public int d() {
            int n2;
            int n3 = this.r;
            if (n3 != -1) {
                return n3;
            }
            int n4 = 1 & this.n;
            int n5 = 0;
            if (n4 == 1) {
                n5 = 0 + e.c(1, this.o);
            }
            if ((2 & this.n) == 2) {
                n5 += e.e(2, (p)this.p);
            }
            this.r = n2 = n5 + this.m.size();
            return n2;
        }

        public p.a e() {
            return new b();
        }

        @Override
        public final boolean f() {
            byte by = this.q;
            if (by == 1) {
                return true;
            }
            if (by == 0) {
                return false;
            }
            int n2 = this.n;
            boolean bl = (n2 & 1) == 1;
            if (!bl) {
                this.q = 0;
                return false;
            }
            boolean bl2 = (n2 & 2) == 2;
            if (!bl2) {
                this.q = 0;
                return false;
            }
            if (!this.p.f()) {
                this.q = 0;
                return false;
            }
            this.q = 1;
            return true;
        }

        public static final class b
        extends h.b<k.b0.x.b.x0.f.b$b, b> {
            public int l;
            public int m;
            public c n = c.k;

            public p build() {
                k.b0.x.b.x0.f.b$b b2 = this.j();
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

            public k.b0.x.b.x0.f.b$b j() {
                k.b0.x.b.x0.f.b$b b2 = new k.b0.x.b.x0.f.b$b(this, null);
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
                b2.n = n4;
                return b2;
            }

            public b k(k.b0.x.b.x0.f.b$b b2) {
                if (b2 == k.b0.x.b.x0.f.b$b.k) {
                    return this;
                }
                int n2 = b2.n;
                boolean bl = (n2 & 1) == 1;
                if (bl) {
                    int n3 = b2.o;
                    this.l = 1 | this.l;
                    this.m = n3;
                }
                int n4 = n2 & 2;
                boolean bl2 = false;
                if (n4 == 2) {
                    bl2 = true;
                }
                if (bl2) {
                    c c2;
                    c c3 = b2.p;
                    if ((2 & this.l) == 2 && (c2 = this.n) != c.k) {
                        c.b b3 = new c.b();
                        b3.k(c2);
                        b3.k(c3);
                        c3 = b3.j();
                    }
                    this.n = c3;
                    this.l = 2 | this.l;
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
                k.b0.x.b.x0.f.b$b b2;
                k.b0.x.b.x0.f.b$b b3 = k.b0.x.b.x0.f.b$b.l.a(d2, f2);
                if (b3 == null) return this;
                this.k(b3);
                return this;
                {
                    k.b0.x.b.x0.f.b$b b4;
                    catch (Throwable throwable) {
                        b2 = null;
                    }
                    catch (j j2) {}
                    {
                        b4 = (k.b0.x.b.x0.f.b$b)j2.k;
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

        public static final class k.b0.x.b.x0.f.b$b$c
        extends h
        implements q {
            public static final k.b0.x.b.x0.f.b$b$c k;
            public static r<k.b0.x.b.x0.f.b$b$c> l;
            public int A;
            public final k.b0.x.b.x0.h.c m;
            public int n;
            public c o;
            public long p;
            public float q;
            public double r;
            public int s;
            public int t;
            public int u;
            public k.b0.x.b.x0.f.b v;
            public List<k.b0.x.b.x0.f.b$b$c> w;
            public int x;
            public int y;
            public byte z;

            public static {
                k.b0.x.b.x0.f.b$b$c c2;
                l = new a();
                k = c2 = new k.b0.x.b.x0.f.b$b$c();
                c2.i();
            }

            public k.b0.x.b.x0.f.b$b$c() {
                this.z = (byte)-1;
                this.A = -1;
                this.m = k.b0.x.b.x0.h.c.k;
            }

            /*
             * Exception decompiling
             */
            public k.b0.x.b.x0.f.b$b$c(d var1, f var2, k.b0.x.b.x0.f.a var3) {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl277.1 : ALOAD_0 : trying to set 1 previously set to 0
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

            public k.b0.x.b.x0.f.b$b$c(h.b b2, k.b0.x.b.x0.f.a a2) {
                super(b2);
                this.z = (byte)-1;
                this.A = -1;
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
                    e2.n(1, this.o.y);
                }
                if ((2 & this.n) == 2) {
                    long l2 = this.p;
                    e2.y(16);
                    e2.z(l2 << 1 ^ l2 >> 63);
                }
                if ((4 & this.n) == 4) {
                    float f2 = this.q;
                    e2.y(29);
                    e2.w(Float.floatToRawIntBits((float)f2));
                }
                if ((8 & this.n) == 8) {
                    double d2 = this.r;
                    e2.y(33);
                    e2.x(Double.doubleToRawLongBits((double)d2));
                }
                if ((16 & this.n) == 16) {
                    e2.p(5, this.s);
                }
                if ((32 & this.n) == 32) {
                    e2.p(6, this.t);
                }
                if ((64 & this.n) == 64) {
                    e2.p(7, this.u);
                }
                if ((128 & this.n) == 128) {
                    e2.r(8, (p)this.v);
                }
                for (int i2 = 0; i2 < this.w.size(); ++i2) {
                    e2.r(9, (p)this.w.get(i2));
                }
                if ((512 & this.n) == 512) {
                    e2.p(10, this.y);
                }
                if ((256 & this.n) == 256) {
                    e2.p(11, this.x);
                }
                e2.u(this.m);
            }

            public int d() {
                int n2;
                int n3 = this.A;
                if (n3 != -1) {
                    return n3;
                }
                int n4 = (1 & this.n) == 1 ? 0 + e.b(1, this.o.y) : 0;
                if ((2 & this.n) == 2) {
                    long l2 = this.p;
                    n4 += e.i(2) + e.h(l2 << 1 ^ l2 >> 63);
                }
                if ((4 & this.n) == 4) {
                    n4 += 4 + e.i(3);
                }
                if ((8 & this.n) == 8) {
                    n4 += 8 + e.i(4);
                }
                if ((16 & this.n) == 16) {
                    n4 += e.c(5, this.s);
                }
                if ((32 & this.n) == 32) {
                    n4 += e.c(6, this.t);
                }
                if ((64 & this.n) == 64) {
                    n4 += e.c(7, this.u);
                }
                int n5 = 128 & this.n;
                int n6 = 0;
                if (n5 == 128) {
                    n4 += e.e(8, (p)this.v);
                }
                while (n6 < this.w.size()) {
                    n4 += e.e(9, (p)this.w.get(n6));
                    ++n6;
                }
                if ((512 & this.n) == 512) {
                    n4 += e.c(10, this.y);
                }
                if ((256 & this.n) == 256) {
                    n4 += e.c(11, this.x);
                }
                this.A = n2 = n4 + this.m.size();
                return n2;
            }

            public p.a e() {
                return new b();
            }

            @Override
            public final boolean f() {
                byte by = this.z;
                if (by == 1) {
                    return true;
                }
                if (by == 0) {
                    return false;
                }
                boolean bl = (128 & this.n) == 128;
                if (bl && !this.v.f()) {
                    this.z = 0;
                    return false;
                }
                for (int i2 = 0; i2 < this.w.size(); ++i2) {
                    if (((k.b0.x.b.x0.f.b$b$c)this.w.get(i2)).f()) continue;
                    this.z = 0;
                    return false;
                }
                this.z = 1;
                return true;
            }

            public final void i() {
                this.o = c.k;
                this.p = 0L;
                this.q = 0.0f;
                this.r = 0.0;
                this.s = 0;
                this.t = 0;
                this.u = 0;
                this.v = k.b0.x.b.x0.f.b.k;
                this.w = Collections.emptyList();
                this.x = 0;
                this.y = 0;
            }

            public static final class b
            extends h.b<k.b0.x.b.x0.f.b$b$c, b> {
                public int l;
                public c m = c.k;
                public long n;
                public float o;
                public double p;
                public int q;
                public int r;
                public int s;
                public k.b0.x.b.x0.f.b t = k.b0.x.b.x0.f.b.k;
                public List<k.b0.x.b.x0.f.b$b$c> u = Collections.emptyList();
                public int v;
                public int w;

                public p build() {
                    k.b0.x.b.x0.f.b$b$c c2 = this.j();
                    if (c2.f()) {
                        return c2;
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

                public k.b0.x.b.x0.f.b$b$c j() {
                    k.b0.x.b.x0.f.b$b$c c2 = new k.b0.x.b.x0.f.b$b$c(this, null);
                    int n2 = this.l;
                    int n3 = n2 & 1;
                    int n4 = 1;
                    if (n3 != n4) {
                        n4 = 0;
                    }
                    c2.o = this.m;
                    if ((n2 & 2) == 2) {
                        n4 |= 2;
                    }
                    c2.p = this.n;
                    if ((n2 & 4) == 4) {
                        n4 |= 4;
                    }
                    c2.q = this.o;
                    if ((n2 & 8) == 8) {
                        n4 |= 8;
                    }
                    c2.r = this.p;
                    if ((n2 & 16) == 16) {
                        n4 |= 16;
                    }
                    c2.s = this.q;
                    if ((n2 & 32) == 32) {
                        n4 |= 32;
                    }
                    c2.t = this.r;
                    if ((n2 & 64) == 64) {
                        n4 |= 64;
                    }
                    c2.u = this.s;
                    if ((n2 & 128) == 128) {
                        n4 |= 128;
                    }
                    c2.v = this.t;
                    if ((n2 & 256) == 256) {
                        this.u = Collections.unmodifiableList(this.u);
                        this.l = -257 & this.l;
                    }
                    c2.w = this.u;
                    if ((n2 & 512) == 512) {
                        n4 |= 256;
                    }
                    c2.x = this.v;
                    if ((n2 & 1024) == 1024) {
                        n4 |= 512;
                    }
                    c2.y = this.w;
                    c2.n = n4;
                    return c2;
                }

                public b k(k.b0.x.b.x0.f.b$b$c c2) {
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
                    if (c2 == k.b0.x.b.x0.f.b$b$c.k) {
                        return this;
                    }
                    int n12 = c2.n;
                    int n13 = 1;
                    int n14 = (n12 & n13) == n13 ? n13 : 0;
                    if (n14 != 0) {
                        c c3 = c2.o;
                        Objects.requireNonNull((Object)c3);
                        this.l = n13 | this.l;
                        this.m = c3;
                    }
                    if ((n3 = ((n10 = c2.n) & 2) == 2 ? n13 : 0) != 0) {
                        long l2 = c2.p;
                        this.l = 2 | this.l;
                        this.n = l2;
                    }
                    if ((n8 = (n10 & 4) == 4 ? n13 : 0) != 0) {
                        float f2 = c2.q;
                        this.l = 4 | this.l;
                        this.o = f2;
                    }
                    if ((n6 = (n10 & 8) == 8 ? n13 : 0) != 0) {
                        double d2 = c2.r;
                        this.l = 8 | this.l;
                        this.p = d2;
                    }
                    if ((n5 = (n10 & 16) == 16 ? n13 : 0) != 0) {
                        int n15 = c2.s;
                        this.l = 16 | this.l;
                        this.q = n15;
                    }
                    if ((n4 = (n10 & 32) == 32 ? n13 : 0) != 0) {
                        int n16 = c2.t;
                        this.l = 32 | this.l;
                        this.r = n16;
                    }
                    if ((n7 = (n10 & 64) == 64 ? n13 : 0) != 0) {
                        int n17 = c2.u;
                        this.l = 64 | this.l;
                        this.s = n17;
                    }
                    if ((n11 = (n10 & 128) == 128 ? n13 : 0) != 0) {
                        k.b0.x.b.x0.f.b b2;
                        k.b0.x.b.x0.f.b b3 = c2.v;
                        if ((128 & this.l) == 128 && (b2 = this.t) != k.b0.x.b.x0.f.b.k) {
                            k.b0.x.b.x0.f.b$c c4 = new k.b0.x.b.x0.f.b$c();
                            c4.k(b2);
                            c4.k(b3);
                            b3 = c4.j();
                        }
                        this.t = b3;
                        this.l = 128 | this.l;
                    }
                    if (!c2.w.isEmpty()) {
                        if (this.u.isEmpty()) {
                            this.u = c2.w;
                            this.l = -257 & this.l;
                        } else {
                            if ((256 & this.l) != 256) {
                                this.u = new ArrayList(this.u);
                                this.l = 256 | this.l;
                            }
                            this.u.addAll(c2.w);
                        }
                    }
                    if ((n9 = ((n2 = c2.n) & 256) == 256 ? n13 : 0) != 0) {
                        int n18 = c2.x;
                        this.l = 512 | this.l;
                        this.v = n18;
                    }
                    if ((n2 & 512) != 512) {
                        n13 = 0;
                    }
                    if (n13 != 0) {
                        int n19 = c2.y;
                        this.l = 1024 | this.l;
                        this.w = n19;
                    }
                    this.k = this.k.k(c2.m);
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
                    k.b0.x.b.x0.f.b$b$c c2;
                    k.b0.x.b.x0.f.b$b$c c3 = k.b0.x.b.x0.f.b$b$c.l.a(d2, f2);
                    if (c3 == null) return this;
                    this.k(c3);
                    return this;
                    {
                        k.b0.x.b.x0.f.b$b$c c4;
                        catch (Throwable throwable) {
                            c2 = null;
                        }
                        catch (j j2) {}
                        {
                            c4 = (k.b0.x.b.x0.f.b$b$c)j2.k;
                        }
                        try {
                            throw j2;
                        }
                        catch (Throwable throwable) {
                            c2 = c4;
                        }
                    }
                    if (c2 == null) throw var5_6;
                    this.k(c2);
                    throw var5_6;
                }
            }

        }

    }

    public static final class c
    extends h.b<b, c> {
        public int l;
        public int m;
        public List<b> n = Collections.emptyList();

        public p build() {
            b b2 = this.j();
            if (b2.f()) {
                return b2;
            }
            throw new v();
        }

        @Override
        public Object clone() {
            c c2 = new c();
            c2.k(this.j());
            return c2;
        }

        @Override
        public h.b h() {
            c c2 = new c();
            c2.k(this.j());
            return c2;
        }

        public b j() {
            b b2 = new b(this, null);
            int n2 = this.l;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            b2.o = this.m;
            if ((n2 & 2) == 2) {
                this.n = Collections.unmodifiableList(this.n);
                this.l = -3 & this.l;
            }
            b2.p = this.n;
            b2.n = n4;
            return b2;
        }

        public c k(b b2) {
            if (b2 == b.k) {
                return this;
            }
            boolean bl = (1 & b2.n) == 1;
            if (bl) {
                int n2 = b2.o;
                this.l = 1 | this.l;
                this.m = n2;
            }
            if (!b2.p.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = b2.p;
                    this.l = -3 & this.l;
                } else {
                    if ((2 & this.l) != 2) {
                        this.n = new ArrayList(this.n);
                        this.l = 2 | this.l;
                    }
                    this.n.addAll(b2.p);
                }
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
        public c l(d d2, f f2) {
            void var5_6;
            b b2;
            b b3 = b.l.a(d2, f2);
            if (b3 == null) return this;
            this.k(b3);
            return this;
            {
                b b4;
                catch (Throwable throwable) {
                    b2 = null;
                }
                catch (j j2) {}
                {
                    b4 = (b)j2.k;
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

