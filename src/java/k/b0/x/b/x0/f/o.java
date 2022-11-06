/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.f.o$a
 *  k.b0.x.b.x0.f.o$c$a
 *  k.b0.x.b.x0.f.o$c$c
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
import k.b0.x.b.x0.f.o;
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

public final class o
extends h
implements q {
    public static final o k;
    public static r<o> l;
    public final k.b0.x.b.x0.h.c m;
    public List<c> n;
    public byte o;
    public int p;

    public static {
        o o2;
        l = new a();
        k = o2 = new o();
        o2.n = Collections.emptyList();
    }

    public o() {
        this.o = (byte)-1;
        this.p = -1;
        this.m = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public o(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl104.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public o(h.b b2, k.b0.x.b.x0.f.a a2) {
        super(b2);
        this.o = (byte)-1;
        this.p = -1;
        this.m = b2.k;
    }

    public p.a b() {
        b b2 = new b();
        b2.k(this);
        return b2;
    }

    public void c(e e2) {
        this.d();
        for (int i2 = 0; i2 < this.n.size(); ++i2) {
            e2.r(1, (p)this.n.get(i2));
        }
        e2.u(this.m);
    }

    public int d() {
        int n2;
        int n3 = this.p;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 0;
        for (int i2 = 0; i2 < this.n.size(); ++i2) {
            n4 += e.e(1, (p)this.n.get(i2));
        }
        this.p = n2 = n4 + this.m.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    @Override
    public final boolean f() {
        byte by = this.o;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.n.size(); ++i2) {
            if (((c)this.n.get(i2)).f()) continue;
            this.o = 0;
            return false;
        }
        this.o = 1;
        return true;
    }

    public static final class b
    extends h.b<o, b> {
        public int l;
        public List<c> m = Collections.emptyList();

        public p build() {
            o o2 = this.j();
            if (o2.f()) {
                return o2;
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

        public o j() {
            o o2 = new o(this, null);
            if ((1 & this.l) == 1) {
                this.m = Collections.unmodifiableList(this.m);
                this.l = -2 & this.l;
            }
            o2.n = this.m;
            return o2;
        }

        public b k(o o2) {
            if (o2 == o.k) {
                return this;
            }
            if (!o2.n.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = o2.n;
                    this.l = -2 & this.l;
                } else {
                    if ((1 & this.l) != 1) {
                        this.m = new ArrayList(this.m);
                        this.l = 1 | this.l;
                    }
                    this.m.addAll(o2.n);
                }
            }
            this.k = this.k.k(o2.m);
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
            o o2;
            o o3 = o.l.a(d2, f2);
            if (o3 == null) return this;
            this.k(o3);
            return this;
            {
                o o4;
                catch (Throwable throwable) {
                    o2 = null;
                }
                catch (j j2) {}
                {
                    o4 = (o)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    o2 = o4;
                }
            }
            if (o2 == null) throw var5_6;
            this.k(o2);
            throw var5_6;
        }
    }

    public static final class k.b0.x.b.x0.f.o$c
    extends h
    implements q {
        public static final k.b0.x.b.x0.f.o$c k;
        public static r<k.b0.x.b.x0.f.o$c> l;
        public final k.b0.x.b.x0.h.c m;
        public int n;
        public int o;
        public int p;
        public c q;
        public byte r;
        public int s;

        public static {
            k.b0.x.b.x0.f.o$c c2;
            l = new a();
            k = c2 = new k.b0.x.b.x0.f.o$c();
            c2.o = -1;
            c2.p = 0;
            c2.q = c.l;
        }

        public k.b0.x.b.x0.f.o$c() {
            this.r = (byte)-1;
            this.s = -1;
            this.m = k.b0.x.b.x0.h.c.k;
        }

        /*
         * Exception decompiling
         */
        public k.b0.x.b.x0.f.o$c(d var1, f var2, k.b0.x.b.x0.f.a var3) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl128.1 : ALOAD_0 : trying to set 1 previously set to 0
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

        public k.b0.x.b.x0.f.o$c(h.b b2, k.b0.x.b.x0.f.a a2) {
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
                e2.p(1, this.o);
            }
            if ((2 & this.n) == 2) {
                e2.p(2, this.p);
            }
            if ((4 & this.n) == 4) {
                e2.n(3, this.q.o);
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
                n5 = 0 + e.c(1, this.o);
            }
            if ((2 & this.n) == 2) {
                n5 += e.c(2, this.p);
            }
            if ((4 & this.n) == 4) {
                n5 += e.b(3, this.q.o);
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
            boolean bl = (2 & this.n) == 2;
            if (!bl) {
                this.r = 0;
                return false;
            }
            this.r = 1;
            return true;
        }

        public static final class b
        extends h.b<k.b0.x.b.x0.f.o$c, b> {
            public int l;
            public int m = -1;
            public int n;
            public c o = c.l;

            public p build() {
                k.b0.x.b.x0.f.o$c c2 = this.j();
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

            public k.b0.x.b.x0.f.o$c j() {
                k.b0.x.b.x0.f.o$c c2 = new k.b0.x.b.x0.f.o$c(this, null);
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
                c2.n = n4;
                return c2;
            }

            public b k(k.b0.x.b.x0.f.o$c c2) {
                boolean bl;
                if (c2 == k.b0.x.b.x0.f.o$c.k) {
                    return this;
                }
                int n2 = c2.n;
                boolean bl2 = (n2 & 1) == 1;
                if (bl2) {
                    int n3 = c2.o;
                    this.l = 1 | this.l;
                    this.m = n3;
                }
                if (bl = (n2 & 2) == 2) {
                    int n4 = c2.p;
                    this.l = 2 | this.l;
                    this.n = n4;
                }
                int n5 = n2 & 4;
                boolean bl3 = false;
                if (n5 == 4) {
                    bl3 = true;
                }
                if (bl3) {
                    c c3 = c2.q;
                    Objects.requireNonNull((Object)c3);
                    this.l = 4 | this.l;
                    this.o = c3;
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
                k.b0.x.b.x0.f.o$c c2;
                k.b0.x.b.x0.f.o$c c3 = k.b0.x.b.x0.f.o$c.l.a(d2, f2);
                if (c3 == null) return this;
                this.k(c3);
                return this;
                {
                    k.b0.x.b.x0.f.o$c c4;
                    catch (Throwable throwable) {
                        c2 = null;
                    }
                    catch (j j2) {}
                    {
                        c4 = (k.b0.x.b.x0.f.o$c)j2.k;
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

