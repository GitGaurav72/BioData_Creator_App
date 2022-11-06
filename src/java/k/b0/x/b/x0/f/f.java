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
 *  java.util.Objects
 *  k.b0.x.b.x0.f.f$a
 *  k.b0.x.b.x0.f.f$c
 *  k.b0.x.b.x0.f.f$d
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
import k.b0.x.b.x0.f.f;
import k.b0.x.b.x0.f.h;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.q;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.h.v;

public final class f
extends k.b0.x.b.x0.h.h
implements q {
    public static final f k;
    public static r<f> l;
    public final k.b0.x.b.x0.h.c m;
    public int n;
    public c o;
    public List<h> p;
    public h q;
    public d r;
    public byte s;
    public int t;

    public static {
        f f2;
        l = new a();
        k = f2 = new f();
        f2.o = c.k;
        f2.p = Collections.emptyList();
        f2.q = h.k;
        f2.r = d.k;
    }

    public f() {
        this.s = (byte)-1;
        this.t = -1;
        this.m = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public f(k.b0.x.b.x0.h.d var1, k.b0.x.b.x0.h.f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl219.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public f(h.b b2, k.b0.x.b.x0.f.a a2) {
        super(b2);
        this.s = (byte)-1;
        this.t = -1;
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
            e2.n(1, this.o.o);
        }
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            e2.r(2, (p)this.p.get(i2));
        }
        if ((2 & this.n) == 2) {
            e2.r(3, (p)this.q);
        }
        if ((4 & this.n) == 4) {
            e2.n(4, this.r.o);
        }
        e2.u(this.m);
    }

    public int d() {
        int n2;
        int n3;
        int n4 = this.t;
        if (n4 != -1) {
            return n4;
        }
        int n5 = 1 & this.n;
        int n6 = 0;
        if (n5 == 1) {
            n3 = 0 + e.b(1, this.o.o);
            n6 = 0;
        } else {
            n3 = 0;
        }
        while (n6 < this.p.size()) {
            n3 += e.e(2, (p)this.p.get(n6));
            ++n6;
        }
        if ((2 & this.n) == 2) {
            n3 += e.e(3, (p)this.q);
        }
        if ((4 & this.n) == 4) {
            n3 += e.b(4, this.r.o);
        }
        this.t = n2 = n3 + this.m.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    @Override
    public final boolean f() {
        byte by = this.s;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            if (((h)this.p.get(i2)).f()) continue;
            this.s = 0;
            return false;
        }
        boolean bl = (2 & this.n) == 2;
        if (bl && !this.q.f()) {
            this.s = 0;
            return false;
        }
        this.s = 1;
        return true;
    }

    public static final class b
    extends h.b<f, b> {
        public int l;
        public c m = c.k;
        public List<h> n = Collections.emptyList();
        public h o = h.k;
        public d p = d.k;

        public p build() {
            f f2 = this.j();
            if (f2.f()) {
                return f2;
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

        public f j() {
            f f2 = new f(this, null);
            int n2 = this.l;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            f2.o = this.m;
            if ((n2 & 2) == 2) {
                this.n = Collections.unmodifiableList(this.n);
                this.l = -3 & this.l;
            }
            f2.p = this.n;
            if ((n2 & 4) == 4) {
                n4 |= 2;
            }
            f2.q = this.o;
            if ((n2 & 8) == 8) {
                n4 |= 4;
            }
            f2.r = this.p;
            f2.n = n4;
            return f2;
        }

        public b k(f f2) {
            int n2;
            if (f2 == f.k) {
                return this;
            }
            int n3 = f2.n;
            int n4 = 1;
            int n5 = (n3 & n4) == n4 ? n4 : 0;
            if (n5 != 0) {
                c c2 = f2.o;
                Objects.requireNonNull((Object)c2);
                this.l = n4 | this.l;
                this.m = c2;
            }
            if (!f2.p.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = f2.p;
                    this.l = -3 & this.l;
                } else {
                    if ((2 & this.l) != 2) {
                        this.n = new ArrayList(this.n);
                        this.l = 2 | this.l;
                    }
                    this.n.addAll(f2.p);
                }
            }
            if ((n2 = (2 & f2.n) == 2 ? n4 : 0) != 0) {
                h h2;
                h h3 = f2.q;
                if ((4 & this.l) == 4 && (h2 = this.o) != h.k) {
                    h.b b2 = new h.b();
                    b2.k(h2);
                    b2.k(h3);
                    h3 = b2.j();
                }
                this.o = h3;
                this.l = 4 | this.l;
            }
            if ((4 & f2.n) != 4) {
                n4 = 0;
            }
            if (n4 != 0) {
                d d2 = f2.r;
                Objects.requireNonNull((Object)d2);
                this.l = 8 | this.l;
                this.p = d2;
            }
            this.k = this.k.k(f2.m);
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
        public b l(k.b0.x.b.x0.h.d d2, k.b0.x.b.x0.h.f f2) {
            void var5_6;
            f f3;
            f f4 = f.l.a(d2, f2);
            if (f4 == null) return this;
            this.k(f4);
            return this;
            {
                f f5;
                catch (Throwable throwable) {
                    f3 = null;
                }
                catch (j j2) {}
                {
                    f5 = (f)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    f3 = f5;
                }
            }
            if (f3 == null) throw var5_6;
            this.k(f3);
            throw var5_6;
        }
    }

}

