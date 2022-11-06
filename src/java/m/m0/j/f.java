/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.Collection
 *  java.util.LinkedHashMap
 *  java.util.LinkedHashSet
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.TimeUnit
 *  m.m0.j.f$a
 *  m.m0.j.f$c$a
 *  m.m0.j.f$d
 *  m.m0.j.f$e
 *  m.m0.j.f$f
 *  m.m0.j.s
 *  m.m0.j.t
 *  n.e
 *  n.f
 *  n.g
 */
package m.m0.j;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k.x.c.i;
import m.m0.j.f;
import m.m0.j.n;
import m.m0.j.o;
import m.m0.j.p;
import m.m0.j.s;
import m.m0.j.t;
import n.g;

/*
 * Exception performing whole class analysis.
 */
public final class f
implements Closeable {
    public static final t k;
    public static final f l;
    public long A;
    public long B;
    public long C;
    public long D;
    public final t E;
    public t F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final Socket K;
    public final p L;
    public final d M;
    public final Set<Integer> N;
    public final boolean m;
    public final c n;
    public final Map<Integer, o> o;
    public final String p;
    public int q;
    public int r;
    public boolean s;
    public final m.m0.f.d t;
    public final m.m0.f.c u;
    public final m.m0.f.c v;
    public final m.m0.f.c w;
    public final s x;
    public long y;
    public long z;

    public static {
        t t2 = new t();
        t2.c(7, 65535);
        t2.c(5, 16384);
        k = t2;
    }

    public f(b b2) {
        boolean bl;
        i.e(b2, "builder");
        this.m = bl = b2.h;
        this.n = b2.e;
        this.o = new LinkedHashMap();
        String string = b2.b;
        if (string != null) {
            m.m0.f.d d2;
            m.m0.f.c c2;
            t t2;
            this.p = string;
            int n2 = b2.h ? 3 : 2;
            this.r = n2;
            this.t = d2 = b2.i;
            this.u = c2 = d2.f();
            this.v = d2.f();
            this.w = d2.f();
            this.x = b2.f;
            t t3 = new t();
            if (b2.h) {
                t3.c(7, 16777216);
            }
            this.E = t3;
            this.F = t2 = k;
            this.J = t2.a();
            Socket socket = b2.a;
            if (socket != null) {
                this.K = socket;
                n.f f2 = b2.d;
                if (f2 != null) {
                    this.L = new p(f2, bl);
                    g g2 = b2.c;
                    if (g2 != null) {
                        this.M = new /* Unavailable Anonymous Inner Class!! */;
                        this.N = new LinkedHashSet();
                        int n3 = b2.g;
                        if (n3 != 0) {
                            long l2 = TimeUnit.MILLISECONDS.toNanos((long)n3);
                            String string2 = e.e.a.a.a.l((String)string, (String)" ping");
                            a a2 = new a(string2, string2, this, l2);
                            c2.c((m.m0.f.a)a2, l2);
                        }
                        return;
                    }
                    i.m("source");
                    throw null;
                }
                i.m("sink");
                throw null;
            }
            i.m("socket");
            throw null;
        }
        i.m("connectionName");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(m.m0.j.b var1_1, m.m0.j.b var2_2, IOException var3_3) {
        i.e((Object)var1_1, "connectionCode");
        i.e((Object)var2_2, "streamCode");
        try {
            this.q(var1_1);
        }
        catch (IOException v0) {}
        var16_4 = this;
        // MONITORENTER : var16_4
        var7_5 = true ^ this.o.isEmpty();
        var8_6 = 0;
        var9_7 = null;
        if (var7_5) {
            var10_8 = this.o.values().toArray((Object[])new o[0]);
            if (var10_8 == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            var9_7 = (o[])var10_8;
            this.o.clear();
        }
        // MONITOREXIT : var16_4
        if (var9_7 != null) {
            var13_9 = var9_7.length;
            while (var8_6 < var13_9) {
                var14_10 = var9_7[var8_6];
                try {
                    var14_10.c(var2_2, var3_3);
                }
                catch (IOException v1) {}
                ++var8_6;
            }
        }
        try {
            this.L.close();
            ** GOTO lbl-1000
        }
        catch (IOException v2) {
            try lbl-1000: // 2 sources:
            {
                this.K.close();
            }
            catch (IOException v3) {}
        }
        this.u.e();
        this.v.e();
        this.w.e();
    }

    public final o b(int n2) {
        f f2 = this;
        synchronized (f2) {
            o o2 = (o)this.o.get((Object)n2);
            return o2;
        }
    }

    public void close() {
        this.a(m.m0.j.b.k, m.m0.j.b.p, null);
    }

    public final boolean k(int n2) {
        return n2 != 0 && (n2 & 1) == 0;
    }

    public final o o(int n2) {
        f f2 = this;
        synchronized (f2) {
            o o2 = (o)this.o.remove((Object)n2);
            this.notifyAll();
            return o2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(m.m0.j.b b2) {
        p p2;
        i.e((Object)b2, "statusCode");
        p p3 = p2 = this.L;
        synchronized (p3) {
            int n2;
            f f2 = this;
            synchronized (f2) {
                boolean bl = this.s;
                if (bl) {
                    return;
                }
                this.s = true;
                n2 = this.q;
            }
            this.L.o(n2, b2, m.m0.c.a);
            return;
        }
    }

    public final void r(long l2) {
        f f2 = this;
        synchronized (f2) {
            long l3;
            this.G = l3 = l2 + this.G;
            long l4 = l3 - this.H;
            if (l4 >= (long)(this.E.a() / 2)) {
                this.y(0, l4);
                this.H = l4 + this.H;
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void u(int n2, boolean bl, n.e e2, long l2) {
        if (l2 == 0L) {
            this.L.b(bl, n2, e2, 0);
            return;
        }
        while (l2 > 0L) {
            long l3;
            long l4;
            f f2 = this;
            // MONITORENTER : f2
            while ((l4 = this.I) >= (l3 = this.J)) {
                if (!this.o.containsKey((Object)n2)) throw new IOException("stream closed");
                this.wait();
            }
            long l5 = l3 - l4;
            int n3 = Math.min((int)((int)Math.min((long)l2, (long)l5)), (int)this.L.m);
            long l6 = this.I;
            long l7 = n3;
            this.I = l6 + l7;
            // MONITOREXIT : f2
            p p2 = this.L;
            boolean bl2 = bl && (l2 -= l7) == 0L;
            p2.b(bl2, n2, e2, n3);
        }
        return;
        {
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (InterruptedException interruptedException) {}
            {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        }
    }

    public final void v(boolean bl, int n2, int n3) {
        try {
            this.L.r(bl, n2, n3);
            return;
        }
        catch (IOException iOException) {
            m.m0.j.b b2 = m.m0.j.b.l;
            this.a(b2, b2, iOException);
            return;
        }
    }

    public final void w(int n2, m.m0.j.b b2) {
        i.e((Object)b2, "errorCode");
        m.m0.f.c c2 = this.u;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.p);
        stringBuilder.append('[');
        stringBuilder.append(n2);
        stringBuilder.append("] writeSynReset");
        String string = stringBuilder.toString();
        e e2 = new e(string, true, string, true, this, n2, b2);
        c2.c((m.m0.f.a)e2, 0L);
    }

    public final void y(int n2, long l2) {
        m.m0.f.c c2 = this.u;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.p);
        stringBuilder.append('[');
        stringBuilder.append(n2);
        stringBuilder.append("] windowUpdate");
        String string = stringBuilder.toString();
        f f2 = new f(string, true, string, true, this, n2, l2);
        c2.c((m.m0.f.a)f2, 0L);
    }

    public static final class b {
        public Socket a;
        public String b;
        public g c;
        public n.f d;
        public c e;
        public s f;
        public int g;
        public boolean h;
        public final m.m0.f.d i;

        public b(boolean bl, m.m0.f.d d2) {
            i.e(d2, "taskRunner");
            this.h = bl;
            this.i = d2;
            this.e = c.a;
            this.f = s.a;
        }
    }

    public static abstract class c {
        public static final c a = new a();

        public void a(f f2, t t2) {
            i.e(f2, "connection");
            i.e((Object)t2, "settings");
        }

        public abstract void b(o var1);
    }

}

