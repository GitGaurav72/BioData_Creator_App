/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  k.b0.x.b.x0.f.d$a
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
import k.b0.x.b.x0.f.d;
import k.b0.x.b.x0.f.u;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class d
extends h.d<d> {
    public static final d l;
    public static r<d> m;
    public final c n;
    public int o;
    public int p;
    public List<u> q;
    public List<Integer> r;
    public byte s;
    public int t;

    public static {
        d d2;
        m = new a();
        l = d2 = new d();
        d2.p = 6;
        d2.q = Collections.emptyList();
        d2.r = Collections.emptyList();
    }

    public d() {
        this.s = (byte)-1;
        this.t = -1;
        this.n = c.k;
    }

    /*
     * Exception decompiling
     */
    public d(k.b0.x.b.x0.h.d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl207.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public d(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.s = (byte)-1;
        this.t = -1;
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
        int n2 = 0;
        do {
            int n3 = this.q.size();
            if (n2 >= n3) break;
            e2.r(2, (p)this.q.get(n2));
            ++n2;
        } while (true);
        for (int i2 = 0; i2 < this.r.size(); ++i2) {
            e2.p(31, (Integer)this.r.get(i2));
        }
        a2.a(19000, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.t;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 1 & this.o;
        int n5 = 0;
        int n6 = n4 == 1 ? 0 + e.c(1, this.p) : 0;
        for (int i2 = 0; i2 < this.q.size(); ++i2) {
            n6 += e.e(2, (p)this.q.get(i2));
        }
        int n7 = 0;
        while (n5 < this.r.size()) {
            n7 += e.d((Integer)this.r.get(n5));
            ++n5;
        }
        this.t = n2 = n6 + n7 + 2 * this.r.size() + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.s;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.q.size(); ++i2) {
            if (((u)((Object)this.q.get(i2))).f()) continue;
            this.s = 0;
            return false;
        }
        if (!this.i()) {
            this.s = 0;
            return false;
        }
        this.s = 1;
        return true;
    }

    public static final class b
    extends h.c<d, b> {
        public int n;
        public int o = 6;
        public List<u> p = Collections.emptyList();
        public List<Integer> q = Collections.emptyList();

        public p build() {
            d d2 = this.k();
            if (d2.f()) {
                return d2;
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

        public d k() {
            d d2 = new d(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            d2.p = this.o;
            if ((n2 & 2) == 2) {
                this.p = Collections.unmodifiableList(this.p);
                this.n = -3 & this.n;
            }
            d2.q = this.p;
            if ((4 & this.n) == 4) {
                this.q = Collections.unmodifiableList(this.q);
                this.n = -5 & this.n;
            }
            d2.r = this.q;
            d2.o = n4;
            return d2;
        }

        public b l(d d2) {
            if (d2 == d.l) {
                return this;
            }
            boolean bl = (1 & d2.o) == 1;
            if (bl) {
                int n2 = d2.p;
                this.n = 1 | this.n;
                this.o = n2;
            }
            if (!d2.q.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = d2.q;
                    this.n = -3 & this.n;
                } else {
                    if ((2 & this.n) != 2) {
                        this.p = new ArrayList(this.p);
                        this.n = 2 | this.n;
                    }
                    this.p.addAll(d2.q);
                }
            }
            if (!d2.r.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = d2.r;
                    this.n = -5 & this.n;
                } else {
                    if ((4 & this.n) != 4) {
                        this.q = new ArrayList(this.q);
                        this.n = 4 | this.n;
                    }
                    this.q.addAll(d2.r);
                }
            }
            this.j(d2);
            this.k = this.k.k(d2.n);
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
            d d3;
            d d4 = d.m.a(d2, f2);
            if (d4 == null) return this;
            this.l(d4);
            return this;
            {
                d d5;
                catch (Throwable throwable) {
                    d3 = null;
                }
                catch (j j2) {}
                {
                    d5 = (d)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    d3 = d5;
                }
            }
            if (d3 == null) throw var5_6;
            this.l(d3);
            throw var5_6;
        }
    }

}

