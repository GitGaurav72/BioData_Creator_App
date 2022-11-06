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
 *  k.b0.x.b.x0.f.e$a
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
import k.b0.x.b.x0.f.f;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.q;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class e
extends h
implements q {
    public static final e k;
    public static r<e> l;
    public final c m;
    public List<f> n;
    public byte o;
    public int p;

    public static {
        e e2;
        l = new a();
        k = e2 = new e();
        e2.n = Collections.emptyList();
    }

    public e() {
        this.o = (byte)-1;
        this.p = -1;
        this.m = c.k;
    }

    /*
     * Exception decompiling
     */
    public e(d var1, k.b0.x.b.x0.h.f var2, k.b0.x.b.x0.f.a var3) {
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

    public e(h.b b2, k.b0.x.b.x0.f.a a2) {
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

    public void c(k.b0.x.b.x0.h.e e2) {
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
            n4 += k.b0.x.b.x0.h.e.e(1, (p)this.n.get(i2));
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
            if (((f)this.n.get(i2)).f()) continue;
            this.o = 0;
            return false;
        }
        this.o = 1;
        return true;
    }

    public static final class b
    extends h.b<e, b> {
        public int l;
        public List<f> m = Collections.emptyList();

        public p build() {
            e e2 = this.j();
            if (e2.f()) {
                return e2;
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

        public e j() {
            e e2 = new e(this, null);
            if ((1 & this.l) == 1) {
                this.m = Collections.unmodifiableList(this.m);
                this.l = -2 & this.l;
            }
            e2.n = this.m;
            return e2;
        }

        public b k(e e2) {
            if (e2 == e.k) {
                return this;
            }
            if (!e2.n.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = e2.n;
                    this.l = -2 & this.l;
                } else {
                    if ((1 & this.l) != 1) {
                        this.m = new ArrayList(this.m);
                        this.l = 1 | this.l;
                    }
                    this.m.addAll(e2.n);
                }
            }
            this.k = this.k.k(e2.m);
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
        public b l(d d2, k.b0.x.b.x0.h.f f2) {
            void var5_6;
            e e2;
            e e3 = e.l.a(d2, f2);
            if (e3 == null) return this;
            this.k(e3);
            return this;
            {
                e e4;
                catch (Throwable throwable) {
                    e2 = null;
                }
                catch (j j2) {}
                {
                    e4 = (e)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    e2 = e4;
                }
            }
            if (e2 == null) throw var5_6;
            this.k(e2);
            throw var5_6;
        }
    }

}

