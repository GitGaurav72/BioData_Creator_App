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
 *  k.b0.x.b.x0.f.m$a
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
import k.b0.x.b.x0.f.l;
import k.b0.x.b.x0.f.m;
import k.b0.x.b.x0.f.o;
import k.b0.x.b.x0.f.p;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class m
extends h.d<m> {
    public static final m l;
    public static r<m> m;
    public final k.b0.x.b.x0.h.c n;
    public int o;
    public p p;
    public o q;
    public l r;
    public List<c> s;
    public byte t;
    public int u;

    public static {
        m m2;
        m = new a();
        l = m2 = new m();
        m2.p = p.k;
        m2.q = o.k;
        m2.r = l.l;
        m2.s = Collections.emptyList();
    }

    public m() {
        this.t = (byte)-1;
        this.u = -1;
        this.n = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public m(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl279.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public m(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.t = (byte)-1;
        this.u = -1;
        this.n = c2.k;
    }

    public k.b0.x.b.x0.h.p a() {
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
            e2.r(1, (k.b0.x.b.x0.h.p)this.p);
        }
        if ((2 & this.o) == 2) {
            e2.r(2, (k.b0.x.b.x0.h.p)this.q);
        }
        if ((4 & this.o) == 4) {
            e2.r(3, (k.b0.x.b.x0.h.p)this.r);
        }
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            e2.r(4, (k.b0.x.b.x0.h.p)this.s.get(i2));
        }
        a2.a(200, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.u;
        if (n3 != -1) {
            return n3;
        }
        int n4 = (1 & this.o) == 1 ? 0 + e.e(1, (k.b0.x.b.x0.h.p)this.p) : 0;
        if ((2 & this.o) == 2) {
            n4 += e.e(2, (k.b0.x.b.x0.h.p)this.q);
        }
        int n5 = 4 & this.o;
        int n6 = 0;
        if (n5 == 4) {
            n4 += e.e(3, (k.b0.x.b.x0.h.p)this.r);
        }
        while (n6 < this.s.size()) {
            n4 += e.e(4, (k.b0.x.b.x0.h.p)this.s.get(n6));
            ++n6;
        }
        this.u = n2 = n4 + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.t;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl = (2 & this.o) == 2;
        if (bl && !this.q.f()) {
            this.t = 0;
            return false;
        }
        boolean bl2 = (4 & this.o) == 4;
        if (bl2 && !this.r.f()) {
            this.t = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            if (((c)((Object)this.s.get(i2))).f()) continue;
            this.t = 0;
            return false;
        }
        if (!this.i()) {
            this.t = 0;
            return false;
        }
        this.t = 1;
        return true;
    }

    public static final class b
    extends h.c<m, b> {
        public int n;
        public p o = p.k;
        public o p = o.k;
        public l q = l.l;
        public List<c> r = Collections.emptyList();

        public k.b0.x.b.x0.h.p build() {
            m m2 = this.k();
            if (m2.f()) {
                return m2;
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

        public m k() {
            m m2 = new m(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            m2.p = this.o;
            if ((n2 & 2) == 2) {
                n4 |= 2;
            }
            m2.q = this.p;
            if ((n2 & 4) == 4) {
                n4 |= 4;
            }
            m2.r = this.q;
            if ((n2 & 8) == 8) {
                this.r = Collections.unmodifiableList(this.r);
                this.n = -9 & this.n;
            }
            m2.s = this.r;
            m2.o = n4;
            return m2;
        }

        public b l(m m2) {
            int n2;
            if (m2 == m.l) {
                return this;
            }
            int n3 = m2.o;
            int n4 = 1;
            int n5 = (n3 & n4) == n4 ? n4 : 0;
            if (n5 != 0) {
                p p2;
                p p3 = m2.p;
                if ((n4 & this.n) == n4 && (p2 = this.o) != p.k) {
                    p.b b2 = new p.b();
                    b2.k(p2);
                    b2.k(p3);
                    p3 = b2.j();
                }
                this.o = p3;
                this.n = n4 | this.n;
            }
            if ((n2 = (2 & m2.o) == 2 ? n4 : 0) != 0) {
                o o2;
                o o3 = m2.q;
                if ((2 & this.n) == 2 && (o2 = this.p) != o.k) {
                    o.b b3 = new o.b();
                    b3.k(o2);
                    b3.k(o3);
                    o3 = b3.j();
                }
                this.p = o3;
                this.n = 2 | this.n;
            }
            if ((4 & m2.o) != 4) {
                n4 = 0;
            }
            if (n4 != 0) {
                l l2;
                l l3 = m2.r;
                if ((4 & this.n) == 4 && (l2 = this.q) != l.l) {
                    l.b b4 = new l.b();
                    b4.l(l2);
                    b4.l(l3);
                    l3 = b4.k();
                }
                this.q = l3;
                this.n = 4 | this.n;
            }
            if (!m2.s.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = m2.s;
                    this.n = -9 & this.n;
                } else {
                    if ((8 & this.n) != 8) {
                        this.r = new ArrayList(this.r);
                        this.n = 8 | this.n;
                    }
                    this.r.addAll(m2.s);
                }
            }
            this.j(m2);
            this.k = this.k.k(m2.n);
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
            m m2;
            m m3 = m.m.a(d2, f2);
            if (m3 == null) return this;
            this.l(m3);
            return this;
            {
                m m4;
                catch (Throwable throwable) {
                    m2 = null;
                }
                catch (j j2) {}
                {
                    m4 = (m)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    m2 = m4;
                }
            }
            if (m2 == null) throw var5_6;
            this.l(m2);
            throw var5_6;
        }
    }

}

