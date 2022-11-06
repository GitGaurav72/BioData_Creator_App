/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  m.i0
 *  m.x
 *  m.y
 *  m.y$a
 *  m.z
 *  n.e
 *  n.g
 */
package m;

import java.io.Closeable;
import java.io.EOFException;
import java.util.Objects;
import k.x.c.i;
import m.b0;
import m.d0;
import m.e0;
import m.i0;
import m.j0;
import m.m0.g.c;
import m.x;
import m.y;
import m.z;
import n.e;
import n.g;

public final class h0
implements Closeable {
    public final e0 k;
    public final d0 l;
    public final String m;
    public final int n;
    public final x o;
    public final y p;
    public final j0 q;
    public final h0 r;
    public final h0 s;
    public final h0 t;
    public final long u;
    public final long v;
    public final c w;

    public h0(e0 e02, d0 d02, String string, int n2, x x2, y y2, j0 j02, h0 h02, h0 h03, h0 h04, long l2, long l3, c c2) {
        i.e(e02, "request");
        i.e((Object)d02, "protocol");
        i.e(string, "message");
        i.e((Object)y2, "headers");
        this.k = e02;
        this.l = d02;
        this.m = string;
        this.n = n2;
        this.o = x2;
        this.p = y2;
        this.q = j02;
        this.r = h02;
        this.s = h03;
        this.t = h04;
        this.u = l2;
        this.v = l3;
        this.w = c2;
    }

    public static String a(h0 h02, String string, String string2, int n2) {
        n2 & 2;
        Objects.requireNonNull((Object)h02);
        i.e(string, "name");
        String string3 = h02.p.h(string);
        String string4 = null;
        if (string3 != null) {
            string4 = string3;
        }
        return string4;
    }

    public final j0 b(long l2) {
        long l3;
        j0 j02 = this.q;
        i.c(j02);
        g g2 = j02.k().c0();
        e e2 = new e();
        g2.K(l2);
        i.e((Object)g2, "source");
        for (long i2 = java.lang.Math.min((long)l2, (long)g2.getBuffer().l); i2 > 0L; i2 -= l3) {
            l3 = g2.W(e2, i2);
            if (l3 != -1L) {
                continue;
            }
            throw new EOFException();
        }
        b0 b02 = this.q.b();
        long l4 = e2.l;
        i.e((Object)e2, "$this$asResponseBody");
        return new i0((g)e2, b02, l4);
    }

    public void close() {
        j0 j02 = this.q;
        if (j02 != null) {
            j02.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean isSuccessful() {
        int n2 = this.n;
        return 200 <= n2 && 299 >= n2;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Response{protocol=");
        stringBuilder.append((Object)this.l);
        stringBuilder.append(", code=");
        stringBuilder.append(this.n);
        stringBuilder.append(", message=");
        stringBuilder.append(this.m);
        stringBuilder.append(", url=");
        stringBuilder.append((Object)this.k.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class a {
        public e0 a;
        public d0 b;
        public int c;
        public String d;
        public x e;
        public y.a f;
        public j0 g;
        public h0 h;
        public h0 i;
        public h0 j;
        public long k;
        public long l;
        public c m;

        public a() {
            this.c = -1;
            this.f = new y.a();
        }

        public a(h0 h02) {
            i.e(h02, "response");
            this.c = -1;
            this.a = h02.k;
            this.b = h02.l;
            this.c = h02.n;
            this.d = h02.m;
            this.e = h02.o;
            this.f = h02.p.l();
            this.g = h02.q;
            this.h = h02.r;
            this.i = h02.s;
            this.j = h02.t;
            this.k = h02.u;
            this.l = h02.v;
            this.m = h02.w;
        }

        public h0 a() {
            int n2 = this.c;
            boolean bl = n2 >= 0;
            if (bl) {
                e0 e02 = this.a;
                if (e02 != null) {
                    d0 d02 = this.b;
                    if (d02 != null) {
                        String string = this.d;
                        if (string != null) {
                            x x2 = this.e;
                            y y2 = this.f.b();
                            j0 j02 = this.g;
                            h0 h02 = this.h;
                            h0 h03 = this.i;
                            h0 h04 = this.j;
                            long l2 = this.k;
                            long l3 = this.l;
                            c c2 = this.m;
                            h0 h05 = new h0(e02, d02, string, n2, x2, y2, j02, h02, h03, h04, l2, l3, c2);
                            return h05;
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"code < 0: ");
            stringBuilder.append(this.c);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }

        public a b(h0 h02) {
            this.c("cacheResponse", h02);
            this.i = h02;
            return this;
        }

        public final void c(String string, h0 h02) {
            if (h02 != null) {
                j0 j02 = h02.q;
                boolean bl = true;
                boolean bl2 = j02 == null ? bl : false;
                if (bl2) {
                    boolean bl3 = h02.r == null ? bl : false;
                    if (bl3) {
                        boolean bl4 = h02.s == null ? bl : false;
                        if (bl4) {
                            if (h02.t != null) {
                                bl = false;
                            }
                            if (bl) {
                                return;
                            }
                            throw new IllegalArgumentException(e.e.a.a.a.l((String)string, (String)".priorResponse != null").toString());
                        }
                        throw new IllegalArgumentException(e.e.a.a.a.l((String)string, (String)".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(e.e.a.a.a.l((String)string, (String)".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(e.e.a.a.a.l((String)string, (String)".body != null").toString());
            }
        }

        public a d(y y2) {
            i.e((Object)y2, "headers");
            this.f = y2.l();
            return this;
        }

        public a e(String string) {
            i.e(string, "message");
            this.d = string;
            return this;
        }

        public a f(d0 d02) {
            i.e((Object)d02, "protocol");
            this.b = d02;
            return this;
        }

        public a g(e0 e02) {
            i.e(e02, "request");
            this.a = e02;
            return this;
        }
    }

}

