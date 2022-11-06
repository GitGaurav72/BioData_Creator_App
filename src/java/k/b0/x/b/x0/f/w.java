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
 *  k.b0.x.b.x0.f.w$a
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
import k.b0.x.b.x0.f.v;
import k.b0.x.b.x0.f.w;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.q;
import k.b0.x.b.x0.h.r;

public final class w
extends h
implements q {
    public static final w k;
    public static r<w> l;
    public final c m;
    public List<v> n;
    public byte o;
    public int p;

    public static {
        w w2;
        l = new a();
        k = w2 = new w();
        w2.n = Collections.emptyList();
    }

    public w() {
        this.o = (byte)-1;
        this.p = -1;
        this.m = c.k;
    }

    /*
     * Exception decompiling
     */
    public w(d var1, f var2, k.b0.x.b.x0.f.a var3) {
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

    public w(h.b b2, k.b0.x.b.x0.f.a a2) {
        super(b2);
        this.o = (byte)-1;
        this.p = -1;
        this.m = b2.k;
    }

    public static b i(w w2) {
        b b2 = new b();
        b2.k(w2);
        return b2;
    }

    public p.a b() {
        return w.i(this);
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
        this.o = 1;
        return true;
    }

    public b j() {
        return w.i(this);
    }

    public static final class b
    extends h.b<w, b> {
        public int l;
        public List<v> m = Collections.emptyList();

        public p build() {
            w w2 = this.j();
            if (w2.f()) {
                return w2;
            }
            throw new k.b0.x.b.x0.h.v();
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

        public w j() {
            w w2 = new w(this, null);
            if ((1 & this.l) == 1) {
                this.m = Collections.unmodifiableList(this.m);
                this.l = -2 & this.l;
            }
            w2.n = this.m;
            return w2;
        }

        public b k(w w2) {
            if (w2 == w.k) {
                return this;
            }
            if (!w2.n.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = w2.n;
                    this.l = -2 & this.l;
                } else {
                    if ((1 & this.l) != 1) {
                        this.m = new ArrayList(this.m);
                        this.l = 1 | this.l;
                    }
                    this.m.addAll(w2.n);
                }
            }
            this.k = this.k.k(w2.m);
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
            w w2;
            w w3 = w.l.a(d2, f2);
            if (w3 == null) return this;
            this.k(w3);
            return this;
            {
                w w4;
                catch (Throwable throwable) {
                    w2 = null;
                }
                catch (j j2) {}
                {
                    w4 = (w)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    w2 = w4;
                }
            }
            if (w2 == null) throw var5_6;
            this.k(w2);
            throw var5_6;
        }
    }

}

