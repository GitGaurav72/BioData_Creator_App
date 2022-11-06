/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Collection
 *  k.b0.x.b.x0.f.p$a
 *  k.b0.x.b.x0.h.a
 *  k.b0.x.b.x0.h.a$a
 *  k.b0.x.b.x0.h.m
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.h.p$a
 */
package k.b0.x.b.x0.f;

import java.util.Collection;
import k.b0.x.b.x0.f.p;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.m;
import k.b0.x.b.x0.h.n;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.q;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class p
extends h
implements q {
    public static final p k;
    public static r<p> l;
    public final c m;
    public n n;
    public byte o;
    public int p;

    public static {
        p p2;
        l = new a();
        k = p2 = new p();
        p2.n = m.k;
    }

    public p() {
        this.o = (byte)-1;
        this.p = -1;
        this.m = c.k;
    }

    /*
     * Exception decompiling
     */
    public p(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl103.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public p(h.b b2, k.b0.x.b.x0.f.a a2) {
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
            c c2 = this.n.A(i2);
            e2.y(10);
            e2.m(c2);
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
            n4 += e.a(this.n.A(i2));
        }
        this.p = n2 = 0 + n4 + 1 * this.n.size() + this.m.size();
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
        this.o = 1;
        return true;
    }

    public static final class b
    extends h.b<p, b> {
        public int l;
        public n m = m.k;

        public k.b0.x.b.x0.h.p build() {
            p p2 = this.j();
            if (p2.f()) {
                return p2;
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

        public p j() {
            p p2 = new p(this, null);
            if ((1 & this.l) == 1) {
                this.m = this.m.C();
                this.l = -2 & this.l;
            }
            p2.n = this.m;
            return p2;
        }

        public b k(p p2) {
            if (p2 == p.k) {
                return this;
            }
            if (!p2.n.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = p2.n;
                    this.l = -2 & this.l;
                } else {
                    if ((1 & this.l) != 1) {
                        this.m = new m(this.m);
                        this.l = 1 | this.l;
                    }
                    this.m.addAll((Collection)p2.n);
                }
            }
            this.k = this.k.k(p2.m);
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
            p p2;
            p p3 = p.l.a(d2, f2);
            if (p3 == null) return this;
            this.k(p3);
            return this;
            {
                p p4;
                catch (Throwable throwable) {
                    p2 = null;
                }
                catch (j j2) {}
                {
                    p4 = (p)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    p2 = p4;
                }
            }
            if (p2 == null) throw var5_6;
            this.k(p2);
            throw var5_6;
        }
    }

}

