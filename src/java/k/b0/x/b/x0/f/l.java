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
 *  k.b0.x.b.x0.f.l$a
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
import k.b0.x.b.x0.f.i;
import k.b0.x.b.x0.f.l;
import k.b0.x.b.x0.f.n;
import k.b0.x.b.x0.f.r;
import k.b0.x.b.x0.f.t;
import k.b0.x.b.x0.f.w;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.v;

public final class l
extends h.d<l> {
    public static final l l;
    public static k.b0.x.b.x0.h.r<l> m;
    public final c n;
    public int o;
    public List<i> p;
    public List<n> q;
    public List<r> r;
    public t s;
    public w t;
    public byte u;
    public int v;

    public static {
        l l2;
        m = new a();
        l = l2 = new l();
        l2.t();
    }

    public l() {
        this.u = (byte)-1;
        this.v = -1;
        this.n = c.k;
    }

    /*
     * Exception decompiling
     */
    public l(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl274.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public l(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.u = (byte)-1;
        this.v = -1;
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
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            e2.r(3, (p)this.p.get(i2));
        }
        int n2 = 0;
        do {
            int n3 = this.q.size();
            if (n2 >= n3) break;
            e2.r(4, (p)this.q.get(n2));
            ++n2;
        } while (true);
        for (int i3 = 0; i3 < this.r.size(); ++i3) {
            e2.r(5, (p)this.r.get(i3));
        }
        if ((1 & this.o) == 1) {
            e2.r(30, (p)this.s);
        }
        if ((2 & this.o) == 2) {
            e2.r(32, (p)this.t);
        }
        a2.a(200, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.v;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 0;
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            n4 += e.e(3, (p)this.p.get(i2));
        }
        int n5 = 0;
        do {
            int n6 = this.q.size();
            if (n5 >= n6) break;
            n4 += e.e(4, (p)this.q.get(n5));
            ++n5;
        } while (true);
        for (int i3 = 0; i3 < this.r.size(); ++i3) {
            n4 += e.e(5, (p)this.r.get(i3));
        }
        if ((1 & this.o) == 1) {
            n4 += e.e(30, (p)this.s);
        }
        if ((2 & this.o) == 2) {
            n4 += e.e(32, (p)this.t);
        }
        this.v = n2 = n4 + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.u;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            if (((i)((Object)this.p.get(i2))).f()) continue;
            this.u = 0;
            return false;
        }
        for (int i3 = 0; i3 < this.q.size(); ++i3) {
            if (((n)((Object)this.q.get(i3))).f()) continue;
            this.u = 0;
            return false;
        }
        for (int i4 = 0; i4 < this.r.size(); ++i4) {
            if (((r)((Object)this.r.get(i4))).f()) continue;
            this.u = 0;
            return false;
        }
        boolean bl = (1 & this.o) == 1;
        if (bl && !this.s.f()) {
            this.u = 0;
            return false;
        }
        if (!this.i()) {
            this.u = 0;
            return false;
        }
        this.u = 1;
        return true;
    }

    public final void t() {
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
        this.r = Collections.emptyList();
        this.s = t.k;
        this.t = w.k;
    }

    public static final class b
    extends h.c<l, b> {
        public int n;
        public List<i> o = Collections.emptyList();
        public List<n> p = Collections.emptyList();
        public List<r> q = Collections.emptyList();
        public t r = t.k;
        public w s = w.k;

        public p build() {
            l l2 = this.k();
            if (l2.f()) {
                return l2;
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

        public l k() {
            l l2 = new l(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 == n4) {
                this.o = Collections.unmodifiableList(this.o);
                this.n = -2 & this.n;
            }
            l2.p = this.o;
            if ((2 & this.n) == 2) {
                this.p = Collections.unmodifiableList(this.p);
                this.n = -3 & this.n;
            }
            l2.q = this.p;
            if ((4 & this.n) == 4) {
                this.q = Collections.unmodifiableList(this.q);
                this.n = -5 & this.n;
            }
            l2.r = this.q;
            if ((n2 & 8) != 8) {
                n4 = 0;
            }
            l2.s = this.r;
            if ((n2 & 16) == 16) {
                n4 |= 2;
            }
            l2.t = this.s;
            l2.o = n4;
            return l2;
        }

        public b l(l l2) {
            int n2;
            if (l2 == l.l) {
                return this;
            }
            boolean bl = l2.p.isEmpty();
            int n3 = 1;
            if (!bl) {
                if (this.o.isEmpty()) {
                    this.o = l2.p;
                    this.n = -2 & this.n;
                } else {
                    if ((n3 & this.n) != n3) {
                        this.o = new ArrayList(this.o);
                        this.n = n3 | this.n;
                    }
                    this.o.addAll(l2.p);
                }
            }
            if (!l2.q.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = l2.q;
                    this.n = -3 & this.n;
                } else {
                    if ((2 & this.n) != 2) {
                        this.p = new ArrayList(this.p);
                        this.n = 2 | this.n;
                    }
                    this.p.addAll(l2.q);
                }
            }
            if (!l2.r.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = l2.r;
                    this.n = -5 & this.n;
                } else {
                    if ((4 & this.n) != 4) {
                        this.q = new ArrayList(this.q);
                        this.n = 4 | this.n;
                    }
                    this.q.addAll(l2.r);
                }
            }
            if ((n2 = (n3 & l2.o) == n3 ? n3 : 0) != 0) {
                t t2;
                t t3 = l2.s;
                if ((8 & this.n) == 8 && (t2 = this.r) != t.k) {
                    t.b b2 = t.i(t2);
                    b2.k(t3);
                    t3 = b2.j();
                }
                this.r = t3;
                this.n = 8 | this.n;
            }
            if ((2 & l2.o) != 2) {
                n3 = 0;
            }
            if (n3 != 0) {
                w w2;
                w w3 = l2.t;
                if ((16 & this.n) == 16 && (w2 = this.s) != w.k) {
                    w.b b3 = w.i(w2);
                    b3.k(w3);
                    w3 = b3.j();
                }
                this.s = w3;
                this.n = 16 | this.n;
            }
            this.j(l2);
            this.k = this.k.k(l2.n);
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
            l l2;
            l l3 = l.m.a(d2, f2);
            if (l3 == null) return this;
            this.l(l3);
            return this;
            {
                l l4;
                catch (Throwable throwable) {
                    l2 = null;
                }
                catch (j j2) {}
                {
                    l4 = (l)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    l2 = l4;
                }
            }
            if (l2 == null) throw var5_6;
            this.l(l2);
            throw var5_6;
        }
    }

}

