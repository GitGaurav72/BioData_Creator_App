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
 *  java.util.Objects
 *  k.b0.x.b.x0.f.s$a
 *  k.b0.x.b.x0.f.s$c
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
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.s;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class s
extends h.d<s> {
    public static final s l;
    public static r<s> m;
    public final k.b0.x.b.x0.h.c n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public c s;
    public List<q> t;
    public List<Integer> u;
    public int v;
    public byte w;
    public int x;

    public static {
        s s2;
        m = new a();
        l = s2 = new s();
        s2.t();
    }

    public s() {
        this.v = -1;
        this.w = (byte)-1;
        this.x = -1;
        this.n = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public s(d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl259.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public s(h.c c2, k.b0.x.b.x0.f.a a2) {
        super(c2);
        this.v = -1;
        this.w = (byte)-1;
        this.x = -1;
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
        if ((2 & this.o) == 2) {
            e2.p(2, this.q);
        }
        if ((4 & this.o) == 4) {
            int n2 = this.r;
            e2.y(24);
            e2.t(n2);
        }
        if ((8 & this.o) == 8) {
            e2.n(4, this.s.o);
        }
        for (int i2 = 0; i2 < this.t.size(); ++i2) {
            e2.r(5, (p)this.t.get(i2));
        }
        int n3 = this.u.size();
        int n4 = 0;
        if (n3 > 0) {
            e2.y(50);
            e2.y(this.v);
        }
        while (n4 < this.u.size()) {
            e2.q((Integer)this.u.get(n4));
            ++n4;
        }
        a2.a(1000, e2);
        e2.u(this.n);
    }

    public int d() {
        int n2;
        int n3 = this.x;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 1 & this.o;
        int n5 = 0;
        int n6 = n4 == 1 ? 0 + e.c(1, this.p) : 0;
        if ((2 & this.o) == 2) {
            n6 += e.c(2, this.q);
        }
        if ((4 & this.o) == 4) {
            n6 += 1 + e.i(3);
        }
        if ((8 & this.o) == 8) {
            n6 += e.b(4, this.s.o);
        }
        for (int i2 = 0; i2 < this.t.size(); ++i2) {
            n6 += e.e(5, (p)this.t.get(i2));
        }
        int n7 = 0;
        while (n5 < this.u.size()) {
            n7 += e.d((Integer)this.u.get(n5));
            ++n5;
        }
        int n8 = n6 + n7;
        if (!this.u.isEmpty()) {
            n8 = n8 + 1 + e.d(n7);
        }
        this.v = n7;
        this.x = n2 = n8 + this.j() + this.n.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    public final boolean f() {
        byte by = this.w;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        int n2 = this.o;
        boolean bl = (n2 & 1) == 1;
        if (!bl) {
            this.w = 0;
            return false;
        }
        boolean bl2 = (n2 & 2) == 2;
        if (!bl2) {
            this.w = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.t.size(); ++i2) {
            if (((q)((Object)this.t.get(i2))).f()) continue;
            this.w = 0;
            return false;
        }
        if (!this.i()) {
            this.w = 0;
            return false;
        }
        this.w = 1;
        return true;
    }

    public final void t() {
        this.p = 0;
        this.q = 0;
        this.r = false;
        this.s = c.m;
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
    }

    public static final class b
    extends h.c<s, b> {
        public int n;
        public int o;
        public int p;
        public boolean q;
        public c r = c.m;
        public List<q> s = Collections.emptyList();
        public List<Integer> t = Collections.emptyList();

        public p build() {
            s s2 = this.k();
            if (s2.f()) {
                return s2;
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

        public s k() {
            s s2 = new s(this, null);
            int n2 = this.n;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            s2.p = this.o;
            if ((n2 & 2) == 2) {
                n4 |= 2;
            }
            s2.q = this.p;
            if ((n2 & 4) == 4) {
                n4 |= 4;
            }
            s2.r = this.q;
            if ((n2 & 8) == 8) {
                n4 |= 8;
            }
            s2.s = this.r;
            if ((n2 & 16) == 16) {
                this.s = Collections.unmodifiableList(this.s);
                this.n = -17 & this.n;
            }
            s2.t = this.s;
            if ((32 & this.n) == 32) {
                this.t = Collections.unmodifiableList(this.t);
                this.n = -33 & this.n;
            }
            s2.u = this.t;
            s2.o = n4;
            return s2;
        }

        public b l(s s2) {
            boolean bl;
            boolean bl2;
            if (s2 == s.l) {
                return this;
            }
            int n2 = s2.o;
            boolean bl3 = (n2 & 1) == 1;
            if (bl3) {
                int n3 = s2.p;
                this.n = 1 | this.n;
                this.o = n3;
            }
            if (bl2 = (n2 & 2) == 2) {
                int n4 = s2.q;
                this.n = 2 | this.n;
                this.p = n4;
            }
            if (bl = (n2 & 4) == 4) {
                boolean bl4 = s2.r;
                this.n = 4 | this.n;
                this.q = bl4;
            }
            int n5 = n2 & 8;
            boolean bl5 = false;
            if (n5 == 8) {
                bl5 = true;
            }
            if (bl5) {
                c c2 = s2.s;
                Objects.requireNonNull((Object)c2);
                this.n = 8 | this.n;
                this.r = c2;
            }
            if (!s2.t.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = s2.t;
                    this.n = -17 & this.n;
                } else {
                    if ((16 & this.n) != 16) {
                        this.s = new ArrayList(this.s);
                        this.n = 16 | this.n;
                    }
                    this.s.addAll(s2.t);
                }
            }
            if (!s2.u.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = s2.u;
                    this.n = -33 & this.n;
                } else {
                    if ((32 & this.n) != 32) {
                        this.t = new ArrayList(this.t);
                        this.n = 32 | this.n;
                    }
                    this.t.addAll(s2.u);
                }
            }
            this.j(s2);
            this.k = this.k.k(s2.n);
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
            s s2;
            s s3 = s.m.a(d2, f2);
            if (s3 == null) return this;
            this.l(s3);
            return this;
            {
                s s4;
                catch (Throwable throwable) {
                    s2 = null;
                }
                catch (j j2) {}
                {
                    s4 = (s)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    s2 = s4;
                }
            }
            if (s2 == null) throw var5_6;
            this.l(s2);
            throw var5_6;
        }
    }

}

