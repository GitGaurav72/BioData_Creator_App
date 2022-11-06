/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Objects
 *  k.b0.x.b.x0.f.v$a
 *  k.b0.x.b.x0.f.v$c
 *  k.b0.x.b.x0.f.v$d
 *  k.b0.x.b.x0.h.a
 *  k.b0.x.b.x0.h.a$a
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.h.p$a
 */
package k.b0.x.b.x0.f;

import java.util.Objects;
import k.b0.x.b.x0.f.v;
import k.b0.x.b.x0.h.a;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.q;
import k.b0.x.b.x0.h.r;

public final class v
extends h
implements q {
    public static final v k;
    public static r<v> l;
    public final k.b0.x.b.x0.h.c m;
    public int n;
    public int o;
    public int p;
    public c q;
    public int r;
    public int s;
    public d t;
    public byte u;
    public int v;

    public static {
        v v2;
        l = new a();
        k = v2 = new v();
        v2.o = 0;
        v2.p = 0;
        v2.q = c.l;
        v2.r = 0;
        v2.s = 0;
        v2.t = d.k;
    }

    public v() {
        this.u = (byte)-1;
        this.v = -1;
        this.m = k.b0.x.b.x0.h.c.k;
    }

    /*
     * Exception decompiling
     */
    public v(k.b0.x.b.x0.h.d var1, f var2, k.b0.x.b.x0.f.a var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl188.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    public v(h.b b2, k.b0.x.b.x0.f.a a2) {
        super(b2);
        this.u = (byte)-1;
        this.v = -1;
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
            e2.p(4, this.r);
        }
        if ((16 & this.n) == 16) {
            e2.p(5, this.s);
        }
        if ((32 & this.n) == 32) {
            e2.n(6, this.t.o);
        }
        e2.u(this.m);
    }

    public int d() {
        int n2;
        int n3 = this.v;
        if (n3 != -1) {
            return n3;
        }
        int n4 = 1 & this.n;
        int n5 = 0;
        if (n4 == 1) {
            n5 = 0 + e.c(1, this.o);
        }
        if ((2 & this.n) == 2) {
            n5 += e.c(2, this.p);
        }
        if ((4 & this.n) == 4) {
            n5 += e.b(3, this.q.o);
        }
        if ((8 & this.n) == 8) {
            n5 += e.c(4, this.r);
        }
        if ((16 & this.n) == 16) {
            n5 += e.c(5, this.s);
        }
        if ((32 & this.n) == 32) {
            n5 += e.b(6, this.t.o);
        }
        this.v = n2 = n5 + this.m.size();
        return n2;
    }

    public p.a e() {
        return new b();
    }

    @Override
    public final boolean f() {
        byte by = this.u;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.u = 1;
        return true;
    }

    public static final class b
    extends h.b<v, b> {
        public int l;
        public int m;
        public int n;
        public c o = c.l;
        public int p;
        public int q;
        public d r = d.k;

        public p build() {
            v v2 = this.j();
            if (v2.f()) {
                return v2;
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

        public v j() {
            v v2 = new v(this, null);
            int n2 = this.l;
            int n3 = n2 & 1;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 0;
            }
            v2.o = this.m;
            if ((n2 & 2) == 2) {
                n4 |= 2;
            }
            v2.p = this.n;
            if ((n2 & 4) == 4) {
                n4 |= 4;
            }
            v2.q = this.o;
            if ((n2 & 8) == 8) {
                n4 |= 8;
            }
            v2.r = this.p;
            if ((n2 & 16) == 16) {
                n4 |= 16;
            }
            v2.s = this.q;
            if ((n2 & 32) == 32) {
                n4 |= 32;
            }
            v2.t = this.r;
            v2.n = n4;
            return v2;
        }

        public b k(v v2) {
            boolean bl;
            boolean bl2;
            int n2;
            boolean bl3;
            boolean bl4;
            if (v2 == v.k) {
                return this;
            }
            int n3 = v2.n;
            boolean bl5 = (n3 & 1) == 1;
            if (bl5) {
                int n4 = v2.o;
                this.l = 1 | this.l;
                this.m = n4;
            }
            if (bl3 = (n3 & 2) == 2) {
                int n5 = v2.p;
                this.l = 2 | this.l;
                this.n = n5;
            }
            if (bl2 = (n3 & 4) == 4) {
                c c2 = v2.q;
                Objects.requireNonNull((Object)c2);
                this.l = 4 | this.l;
                this.o = c2;
            }
            if (bl4 = ((n2 = v2.n) & 8) == 8) {
                int n6 = v2.r;
                this.l = 8 | this.l;
                this.p = n6;
            }
            if (bl = (n2 & 16) == 16) {
                int n7 = v2.s;
                this.l = 16 | this.l;
                this.q = n7;
            }
            int n8 = n2 & 32;
            boolean bl6 = false;
            if (n8 == 32) {
                bl6 = true;
            }
            if (bl6) {
                d d2 = v2.t;
                Objects.requireNonNull((Object)d2);
                this.l = 32 | this.l;
                this.r = d2;
            }
            this.k = this.k.k(v2.m);
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
        public b l(k.b0.x.b.x0.h.d d2, f f2) {
            void var5_6;
            v v2;
            v v3 = v.l.a(d2, f2);
            if (v3 == null) return this;
            this.k(v3);
            return this;
            {
                v v4;
                catch (Throwable throwable) {
                    v2 = null;
                }
                catch (j j2) {}
                {
                    v4 = (v)j2.k;
                }
                try {
                    throw j2;
                }
                catch (Throwable throwable) {
                    v2 = v4;
                }
            }
            if (v2 == null) throw var5_6;
            this.k(v2);
            throw var5_6;
        }
    }

}

