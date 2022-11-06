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
 *  k.b0.x.b.x0.f.t$a
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
import k.b0.x.b.x0.f.t;
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

public final class t
extends h
implements k.b0.x.b.x0.h.q {
    public static final t k;
    public static r<t> l;
    public final c m;
    public int n;
    public List<q> o;
    public int p;
    public byte q;
    public int r;

    public static {
        t t2;
        l = new a();
        k = t2 = new t();
        t2.o = Collections.emptyList();
        t2.p = -1;
    }

    public t() {
        this.q = (byte)-1;
        this.r = -1;
        this.m = c.k;
    }

    /*
     * Exception decompiling
     */
    public t(d var1, f var2, k.b0.x.b.x0.f.a var3) {
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

    public t(h.b b2, k.b0.x.b.x0.f.a a2) {
        super(b2);
        this.q = (byte)-1;
        this.r = -1;
        this.m = b2.k;
    }

    public static b i(t t2) {
        b b2 = new b();
        b2.k(t2);
        return b2;
    }

    public p.a b() {
        return t.i(this);
    }

    public void c(e e2) {
        this.d();
        for (int i2 = 0; i2 < this.o.size(); ++i2) {
            e2.r(1, (p)this.o.get(i2));
        }
        if ((1 & this.n) == 1) {
            e2.p(2, this.p);
        }
        e2.u(this.m);
    }

    public int d() {
        int n2;
        int n3 = this.r;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 0;
        for (int i2 = 0; i2 < this.o.size(); ++i2) {
            n4 += e.e(1, (p)this.o.get(i2));
        }
        if ((1 & this.n) == 1) {
            n4 += e.c(2, this.p);
        }
        this.r = n2 = n4 + this.m.size();
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
        for (int i2 = 0; i2 < this.o.size(); ++i2) {
            if (((q)((Object)this.o.get(i2))).f()) continue;
            this.q = 0;
            return false;
        }
        this.q = 1;
        return true;
    }

    public b j() {
        return t.i(this);
    }

    public static final class b
    extends h.b<t, b> {
        public int l;
        public List<q> m = Collections.emptyList();
        public int n = -1;

        public p build() {
            t t2 = this.j();
            if (t2.f()) {
                return t2;
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

        public t j() {
            t t2 = new t(this, null);
            int n2 = this.l;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 == n4) {
                this.m = Collections.unmodifiableList(this.m);
                this.l = -2 & this.l;
            }
            t2.o = this.m;
            if ((n2 & 2) != 2) {
                n4 = 0;
            }
            t2.p = this.n;
            t2.n = n4;
            return t2;
        }

        public b k(t t2) {
            if (t2 == t.k) {
                return this;
            }
            boolean bl = t2.o.isEmpty();
            int n2 = 1;
            if (!bl) {
                if (this.m.isEmpty()) {
                    this.m = t2.o;
                    this.l = -2 & this.l;
                } else {
                    if ((n2 & this.l) != n2) {
                        this.m = new ArrayList(this.m);
                        this.l = n2 | this.l;
                    }
                    this.m.addAll(t2.o);
                }
            }
            if ((n2 & t2.n) != n2) {
                n2 = 0;
            }
            if (n2 != 0) {
                int n3 = t2.p;
                this.l = 2 | this.l;
                this.n = n3;
            }
            this.k = this.k.k(t2.m);
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
            t t2;
            t t3 = t.l.a(d2, f2);
            if (t3 == null) return this;
            this.k(t3);
            return this;
            {
                t t4;
                catch (Throwable throwable) {
                    t2 = null;
                }
                catch (j j2) {}
                {
                    t4 = (t)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    t2 = t4;
                }
            }
            if (t2 == null) throw var5_6;
            this.k(t2);
            throw var5_6;
        }
    }

}

