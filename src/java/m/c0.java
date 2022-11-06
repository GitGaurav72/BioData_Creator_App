/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Cloneable
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.ProxySelector
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  java.util.concurrent.TimeUnit
 *  javax.net.SocketFactory
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSocketFactory
 *  javax.net.ssl.X509TrustManager
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  m.m
 *  m.m0.a
 *  m.m0.g.e
 *  m.m0.k.h
 *  m.m0.l.a
 *  m.m0.m.c
 *  m.m0.m.d
 *  m.n
 *  m.q
 *  m.r
 *  m.t
 *  m.u
 *  m.u$b
 */
package m;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.a0;
import m.c;
import m.d0;
import m.e0;
import m.f;
import m.h;
import m.m;
import m.m0.g.e;
import m.m0.g.k;
import m.m0.m.d;
import m.n;
import m.q;
import m.r;
import m.t;
import m.u;

public class c0
implements Cloneable {
    public static final List<d0> k;
    public static final List<n> l;
    public static final b m;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public final X509TrustManager C;
    public final List<n> D;
    public final List<d0> E;
    public final HostnameVerifier F;
    public final h G;
    public final m.m0.m.c H;
    public final int I;
    public final int J;
    public final int K;
    public final k L;
    public final r n;
    public final m o;
    public final List<a0> p;
    public final List<a0> q;
    public final u.b r;
    public final boolean s;
    public final c t;
    public final boolean u;
    public final boolean v;
    public final q w;
    public final t x;
    public final ProxySelector y;
    public final c z;

    public static {
        m = new b(null);
        d0[] arrd0 = new d0[]{d0.n, d0.l};
        k = m.m0.c.l(arrd0);
        n[] arrn = new n[]{n.c, n.d};
        l = m.m0.c.l(arrn);
    }

    public c0() {
        this(new a());
    }

    public c0(a a2) {
        h h2;
        boolean bl;
        i.e(a2, "builder");
        this.n = a2.a;
        this.o = a2.b;
        this.p = m.m0.c.z(a2.c);
        this.q = m.m0.c.z(a2.d);
        this.r = a2.e;
        this.s = a2.f;
        this.t = a2.g;
        this.u = a2.h;
        this.v = a2.i;
        this.w = a2.j;
        this.x = a2.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        if (proxySelector == null) {
            proxySelector = m.m0.l.a.a;
        }
        this.y = proxySelector;
        this.z = a2.l;
        this.A = a2.m;
        List<n> list = a2.p;
        this.D = list;
        this.E = a2.q;
        this.F = a2.r;
        this.I = a2.u;
        this.J = a2.v;
        this.K = a2.w;
        this.L = new k();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((n)iterator.next()).e) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        if (bl) {
            this.B = null;
            this.H = null;
            this.C = null;
            h2 = h.a;
        } else {
            m.m0.m.c c2;
            SSLSocketFactory sSLSocketFactory = a2.n;
            if (sSLSocketFactory != null) {
                this.B = sSLSocketFactory;
                c2 = a2.t;
                i.c((Object)c2);
                this.H = c2;
                X509TrustManager x509TrustManager = a2.o;
                i.c((Object)x509TrustManager);
                this.C = x509TrustManager;
            } else {
                X509TrustManager x509TrustManager;
                this.C = x509TrustManager = m.m0.k.h.a.n();
                m.m0.k.h h3 = m.m0.k.h.a;
                i.c((Object)x509TrustManager);
                this.B = h3.m(x509TrustManager);
                i.c((Object)x509TrustManager);
                i.e((Object)x509TrustManager, "trustManager");
                this.H = c2 = m.m0.k.h.a.b(x509TrustManager);
            }
            h h4 = a2.s;
            i.c((Object)c2);
            h2 = h4.b(c2);
        }
        this.G = h2;
        List<a0> list2 = this.p;
        Objects.requireNonNull(list2, (String)"null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (true ^ list2.contains(null)) {
            List<a0> list3 = this.q;
            Objects.requireNonNull(list3, (String)"null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (true ^ list3.contains(null)) {
                boolean bl2;
                List<n> list4 = this.D;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator iterator = list4.iterator();
                    while (iterator.hasNext()) {
                        if (!((n)iterator.next()).e) continue;
                        bl2 = false;
                        break;
                    }
                } else {
                    bl2 = true;
                }
                if (bl2) {
                    boolean bl3 = this.B == null;
                    if (bl3) {
                        boolean bl4 = this.H == null;
                        if (bl4) {
                            X509TrustManager x509TrustManager = this.C;
                            boolean bl5 = false;
                            if (x509TrustManager == null) {
                                bl5 = true;
                            }
                            if (bl5) {
                                if (i.a(this.G, h.a)) {
                                    return;
                                }
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (this.B != null) {
                    if (this.H != null) {
                        if (this.C != null) {
                            return;
                        }
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                }
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"Null network interceptor: ");
            stringBuilder.append(this.q);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Null interceptor: ");
        stringBuilder.append(this.p);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public f a(e0 e02) {
        i.e(e02, "request");
        return new e(this, e02, false);
    }

    public Object clone() {
        return super.clone();
    }

    public static final class a {
        public r a = new r();
        public m b = new m();
        public final List<a0> c = new ArrayList();
        public final List<a0> d = new ArrayList();
        public u.b e;
        public boolean f;
        public c g;
        public boolean h;
        public boolean i;
        public q j;
        public t k;
        public c l;
        public SocketFactory m;
        public SSLSocketFactory n;
        public X509TrustManager o;
        public List<n> p;
        public List<? extends d0> q;
        public HostnameVerifier r;
        public h s;
        public m.m0.m.c t;
        public int u;
        public int v;
        public int w;
        public long x;

        public a() {
            c c2;
            u u2 = u.a;
            i.e((Object)u2, "$this$asFactory");
            this.e = new m.m0.a(u2);
            this.f = true;
            this.g = c2 = c.a;
            this.h = true;
            this.i = true;
            this.j = q.a;
            this.k = t.a;
            this.l = c2;
            SocketFactory socketFactory = SocketFactory.getDefault();
            i.d((Object)socketFactory, "SocketFactory.getDefault()");
            this.m = socketFactory;
            this.p = c0.l;
            this.q = c0.k;
            this.r = d.a;
            this.s = h.a;
            this.u = 10000;
            this.v = 10000;
            this.w = 10000;
            this.x = 1024L;
        }

        public final a a(a0 a02) {
            i.e(a02, "interceptor");
            this.c.add((Object)a02);
            return this;
        }

        public final a b(long l2, TimeUnit timeUnit) {
            i.e((Object)timeUnit, "unit");
            this.u = m.m0.c.b("timeout", l2, timeUnit);
            return this;
        }

        public final a c(long l2, TimeUnit timeUnit) {
            i.e((Object)timeUnit, "unit");
            this.v = m.m0.c.b("timeout", l2, timeUnit);
            return this;
        }

        public final a d(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            i.e((Object)sSLSocketFactory, "sslSocketFactory");
            i.e((Object)x509TrustManager, "trustManager");
            if (!(true ^ i.a((Object)sSLSocketFactory, (Object)this.n))) {
                true ^ i.a((Object)x509TrustManager, (Object)this.o);
            }
            this.n = sSLSocketFactory;
            i.e((Object)x509TrustManager, "trustManager");
            this.t = m.m0.k.h.a.b(x509TrustManager);
            this.o = x509TrustManager;
            return this;
        }

        public final a e(long l2, TimeUnit timeUnit) {
            i.e((Object)timeUnit, "unit");
            this.w = m.m0.c.b("timeout", l2, timeUnit);
            return this;
        }
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

}

