/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.io.Closeable
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  m.m0.j.t
 *  n.e
 *  n.f
 */
package m.m0.j;

import e.e.a.a.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.x.c.i;
import m.m0.j.b;
import m.m0.j.c;
import m.m0.j.d;
import m.m0.j.e;
import m.m0.j.t;
import n.f;

public final class p
implements Closeable {
    public static final Logger k = Logger.getLogger((String)e.class.getName());
    public final n.e l;
    public int m;
    public boolean n;
    public final d.b o;
    public final f p;
    public final boolean q;

    public p(f f2, boolean bl) {
        n.e e2;
        i.e((Object)f2, "sink");
        this.p = f2;
        this.q = bl;
        this.l = e2 = new n.e();
        this.m = 16384;
        this.o = new d.b(0, false, e2, 3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(t t2) {
        p p2 = this;
        synchronized (p2) {
            int n2;
            i.e((Object)t2, "peerSettings");
            if (this.n) {
                throw new IOException("closed");
            }
            int n3 = this.m;
            int n4 = t2.a;
            if ((n4 & 32) != 0) {
                n3 = t2.b[5];
            }
            this.m = n3;
            int n5 = n4 & 2;
            int n6 = n5 != 0 ? t2.b[1] : n2;
            if (n6 != (n2 = -1)) {
                d.b b2 = this.o;
                if (n5 != 0) {
                    n2 = t2.b[1];
                }
                b2.h = n2;
                int n7 = b2.c;
                int n8 = Math.min((int)n2, (int)16384);
                if (n7 != n8) {
                    if (n8 < n7) {
                        b2.a = Math.min((int)b2.a, (int)n8);
                    }
                    b2.b = true;
                    b2.c = n8;
                    int n9 = b2.g;
                    if (n8 < n9) {
                        if (n8 == 0) {
                            b2.a();
                        } else {
                            b2.b(n9 - n8);
                        }
                    }
                }
            }
            this.k(0, 0, 4, 1);
            this.p.flush();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean bl, int n2, n.e e2, int n3) {
        p p2 = this;
        synchronized (p2) {
            if (this.n) {
                throw new IOException("closed");
            }
            int n4 = bl ? 1 : 0;
            this.k(n2, n3, 0, n4);
            if (n3 > 0) {
                f f2 = this.p;
                i.c((Object)e2);
                f2.D(e2, (long)n3);
            }
            return;
        }
    }

    public void close() {
        p p2 = this;
        synchronized (p2) {
            this.n = true;
            this.p.close();
            return;
        }
    }

    public final void flush() {
        p p2 = this;
        synchronized (p2) {
            if (!this.n) {
                this.p.flush();
                return;
            }
            throw new IOException("closed");
        }
    }

    public final void k(int n2, int n3, int n4, int n5) {
        Logger logger = k;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.e.b(false, n2, n3, n4, n5));
        }
        int n6 = this.m;
        boolean bl = true;
        boolean bl2 = n3 <= n6 ? bl : false;
        if (bl2) {
            if ((n2 & (int)0x80000000L) != 0) {
                bl = false;
            }
            if (bl) {
                f f2 = this.p;
                i.e((Object)f2, "$this$writeMedium");
                f2.n(255 & n3 >>> 16);
                f2.n(255 & n3 >>> 8);
                f2.n(n3 & 255);
                this.p.n(n4 & 255);
                this.p.n(n5 & 255);
                this.p.h(n2 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(a.f((String)"reserved bit set: ", (int)n2).toString());
        }
        StringBuilder stringBuilder = a.t((String)"FRAME_SIZE_ERROR length > ");
        stringBuilder.append(this.m);
        stringBuilder.append(": ");
        stringBuilder.append(n3);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o(int n2, b b2, byte[] arrby) {
        p p2 = this;
        synchronized (p2) {
            i.e((Object)b2, "errorCode");
            i.e(arrby, "debugData");
            if (this.n) {
                throw new IOException("closed");
            }
            boolean bl = b2.s != -1;
            if (!bl) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            this.k(0, 8 + arrby.length, 7, 0);
            this.p.h(n2);
            this.p.h(b2.s);
            int n3 = arrby.length;
            boolean bl2 = false;
            if (n3 == 0) {
                bl2 = true;
            }
            if (bl2 ^ true) {
                this.p.Q(arrby);
            }
            this.p.flush();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(boolean bl, int n2, List<c> list) {
        p p2 = this;
        synchronized (p2) {
            i.e(list, "headerBlock");
            if (this.n) {
                throw new IOException("closed");
            }
            this.o.e(list);
            long l2 = this.l.l;
            long l3 = Math.min((long)this.m, (long)l2);
            long l4 = l2 LCMP l3;
            int n3 = l4 == false ? 4 : 0;
            if (bl) {
                n3 |= 1;
            }
            this.k(n2, (int)l3, 1, n3);
            this.p.D(this.l, l3);
            if (l4 > 0) {
                this.w(n2, l2 - l3);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r(boolean bl, int n2, int n3) {
        p p2 = this;
        synchronized (p2) {
            if (this.n) {
                throw new IOException("closed");
            }
            int n4 = bl ? 1 : 0;
            this.k(0, 8, 6, n4);
            this.p.h(n2);
            this.p.h(n3);
            this.p.flush();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u(int n2, b b2) {
        p p2 = this;
        synchronized (p2) {
            i.e((Object)b2, "errorCode");
            if (this.n) {
                throw new IOException("closed");
            }
            boolean bl = b2.s != -1;
            if (bl) {
                this.k(n2, 4, 3, 0);
                this.p.h(b2.s);
                this.p.flush();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void v(int n2, long l2) {
        p p2 = this;
        synchronized (p2) {
            if (this.n) {
                throw new IOException("closed");
            }
            boolean bl = l2 != 0L && l2 <= Integer.MAX_VALUE;
            if (bl) {
                this.k(n2, 4, 8, 0);
                this.p.h((int)l2);
                this.p.flush();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
    }

    public final void w(int n2, long l2) {
        while (l2 > 0L) {
            long l3 = Math.min((long)this.m, (long)l2);
            int n3 = (int)l3;
            int n4 = (l2 -= l3) == 0L ? 4 : 0;
            this.k(n2, n3, 9, n4);
            this.p.D(this.l, l3);
        }
    }
}

