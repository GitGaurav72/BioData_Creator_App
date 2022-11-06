/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  k.b0.x.b.x0.f.g$a
 *  k.b0.x.b.x0.h.a
 *  k.b0.x.b.x0.h.a$a
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.h.p$a
 */
package k.b0.x.b.x0.f;

import k.b0.x.b.x0.f.g;
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

public final class g
extends h.d<g> {
    public static final g l;
    public static r<g> m;
    public final c n;
    public int o;
    public int p;
    public byte q;
    public int r;

    public static {
        g g2;
        m = new a();
        l = g2 = new g();
        g2.p = 0;
    }

    public g() {
        this.q = (byte)-1;
        this.r = -1;
        this.n = c.k;
    }

    /*
     * Exception decompiling
     */
    public g(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl82.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public g(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.q = (byte)-1;
        this.r = -1;
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
        a2.a(200, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.r;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 1 & this.o;
        int n5 = 0;
        if (n4 == 1) {
            n5 = 0 + e.c(1, this.p);
        }
        this.r = n2 = n5 + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.q;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.i()) {
            this.q = 0;
            return false;
        }
        this.q = 1;
        return true;
    }

    public static final class b
    extends h.c<g, b> {
        public int n;
        public int o;

        public p build() {
            g g2 = this.k();
            if (g2.f()) {
                return g2;
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

        public g k() {
            g g2 = new g(this, null);
            int n2 = this.n;
            int n3 = 1;
            if ((n2 & n3) != n3) {
                n3 = 0;
            }
            g2.p = this.o;
            g2.o = n3;
            return g2;
        }

        public b l(g g2) {
            if (g2 == g.l) {
                return this;
            }
            boolean bl = (1 & g2.o) == 1;
            if (bl) {
                int n2 = g2.p;
                this.n = 1 | this.n;
                this.o = n2;
            }
            this.j(g2);
            this.k = this.k.k(g2.n);
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
            g g2;
            g g3 = g.m.a(d2, f2);
            if (g3 == null) return this;
            this.l(g3);
            return this;
            {
                g g4;
                catch (Throwable throwable) {
                    g2 = null;
                }
                catch (j j2) {}
                {
                    g4 = (g)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    g2 = g4;
                }
            }
            if (g2 == null) throw var5_6;
            this.l(g2);
            throw var5_6;
        }
    }

}

