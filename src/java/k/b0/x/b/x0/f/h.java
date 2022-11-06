/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.f.h$a
 *  k.b0.x.b.x0.f.h$c
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
import k.b0.x.b.x0.f.h;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class h
extends k.b0.x.b.x0.h.h
implements k.b0.x.b.x0.h.q {
    public static final h k;
    public static r<h> l;
    public final k.b0.x.b.x0.h.c m;
    public int n;
    public int o;
    public int p;
    public c q;
    public q r;
    public int s;
    public List<h> t;
    public List<h> u;
    public byte v;
    public int w;

    public static {
        h h2;
        l = new a();
        k = h2 = new h();
        h2.i();
    }

    public h() {
        this.v = (byte)-1;
        this.w = -1;
        this.m = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public h(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl256.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public h(h.b b2, k.b0.x.b.x0.f.a a2) {
        super(b2);
        this.v = (byte)-1;
        this.w = -1;
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
        if ((8 & this.n) == 8) {
            e2.r(4, (p)this.r);
        }
        if ((16 & this.n) == 16) {
            e2.p(5, this.s);
        }
        int n2 = 0;
        do {
            int n3 = this.t.size();
            if (n2 >= n3) break;
            e2.r(6, (p)this.t.get(n2));
            ++n2;
        } while (true);
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            e2.r(7, (p)this.u.get(i2));
        }
        e2.u(this.m);
    }

    public int d() {
        int n2;
        int n3 = this.w;
        if (n3 != -1) {
            return n3;
        }
        int n4 = (1 & this.n) == 1 ? 0 + e.c(1, this.o) : 0;
        if ((2 & this.n) == 2) {
            n4 += e.c(2, this.p);
        }
        if ((4 & this.n) == 4) {
            n4 += e.b(3, this.q.o);
        }
        if ((8 & this.n) == 8) {
            n4 += e.e(4, (p)this.r);
        }
        if ((16 & this.n) == 16) {
            n4 += e.c(5, this.s);
        }
        int n5 = 0;
        do {
            int n6 = this.t.size();
            if (n5 >= n6) break;
            n4 += e.e(6, (p)this.t.get(n5));
            ++n5;
        } while (true);
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            n4 += e.e(7, (p)this.u.get(i2));
        }
        this.w = n2 = n4 + this.m.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    @Override
    public final boolean f() {
        byte by = this.v;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl = (8 & this.n) == 8;
        if (bl && !this.r.f()) {
            this.v = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.t.size(); ++i2) {
            if (((h)this.t.get(i2)).f()) continue;
            this.v = 0;
            return false;
        }
        for (int i3 = 0; i3 < this.u.size(); ++i3) {
            if (((h)this.u.get(i3)).f()) continue;
            this.v = 0;
            return false;
        }
        this.v = 1;
        return true;
    }

    public final void i() {
        this.o = 0;
        this.p = 0;
        this.q = c.k;
        this.r = q.l;
        this.s = 0;
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
    }

    public static final class b
    extends h.b<h, b> {
        public int l;
        public int m;
        public int n;
        public c o = c.k;
        public q p = q.l;
        public int q;
        public List<h> r = Collections.emptyList();
        public List<h> s = Collections.emptyList();

        public p build() {
            h h2 = this.j();
            if (h2.f()) {
                return h2;
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

        public h j() {
            h h2 = new h(this, null);
            int n2 = this.l;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            h2.o = this.m;
            if ((n2 & 2) == 2) {
                n4 |= 2;
            }
            h2.p = this.n;
            if ((n2 & 4) == 4) {
                n4 |= 4;
            }
            h2.q = this.o;
            if ((n2 & 8) == 8) {
                n4 |= 8;
            }
            h2.r = this.p;
            if ((n2 & 16) == 16) {
                n4 |= 16;
            }
            h2.s = this.q;
            if ((n2 & 32) == 32) {
                this.r = Collections.unmodifiableList(this.r);
                this.l = -33 & this.l;
            }
            h2.t = this.r;
            if ((64 & this.l) == 64) {
                this.s = Collections.unmodifiableList(this.s);
                this.l = -65 & this.l;
            }
            h2.u = this.s;
            h2.n = n4;
            return h2;
        }

        public b k(h h2) {
            boolean bl;
            boolean bl2;
            boolean bl3;
            if (h2 == h.k) {
                return this;
            }
            int n2 = h2.n;
            boolean bl4 = (n2 & 1) == 1;
            if (bl4) {
                int n3 = h2.o;
                this.l = 1 | this.l;
                this.m = n3;
            }
            if (bl3 = (n2 & 2) == 2) {
                int n4 = h2.p;
                this.l = 2 | this.l;
                this.n = n4;
            }
            if (bl = (n2 & 4) == 4) {
                c c2 = h2.q;
                Objects.requireNonNull((Object)c2);
                this.l = 4 | this.l;
                this.o = c2;
            }
            if (bl2 = (8 & h2.n) == 8) {
                q q2;
                q q3 = h2.r;
                if ((8 & this.l) == 8 && (q2 = this.p) != q.l) {
                    q3 = e.e.a.a.a.A((q)q2, (q)q3);
                }
                this.p = q3;
                this.l = 8 | this.l;
            }
            int n5 = 16 & h2.n;
            boolean bl5 = false;
            if (n5 == 16) {
                bl5 = true;
            }
            if (bl5) {
                int n6 = h2.s;
                this.l = 16 | this.l;
                this.q = n6;
            }
            if (!h2.t.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = h2.t;
                    this.l = -33 & this.l;
                } else {
                    if ((32 & this.l) != 32) {
                        this.r = new ArrayList(this.r);
                        this.l = 32 | this.l;
                    }
                    this.r.addAll(h2.t);
                }
            }
            if (!h2.u.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = h2.u;
                    this.l = -65 & this.l;
                } else {
                    if ((64 & this.l) != 64) {
                        this.s = new ArrayList(this.s);
                        this.l = 64 | this.l;
                    }
                    this.s.addAll(h2.u);
                }
            }
            this.k = this.k.k(h2.m);
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
            h h2;
            h h3 = h.l.a(d2, f2);
            if (h3 == null) return this;
            this.k(h3);
            return this;
            {
                h h4;
                catch (Throwable throwable) {
                    h2 = null;
                }
                catch (j j2) {}
                {
                    h4 = (h)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    h2 = h4;
                }
            }
            if (h2 == null) throw var5_6;
            this.k(h2);
            throw var5_6;
        }
    }

}

