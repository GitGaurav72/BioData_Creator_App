/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.ArrayDeque
 *  java.util.Objects
 *  m.m0.j.o$a
 *  m.m0.j.o$b
 *  m.m0.j.o$c
 *  m.m0.j.t
 *  m.m0.j.u
 *  m.y
 *  n.x
 */
package m.m0.j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.Objects;
import k.x.c.i;
import m.m0.j.f;
import m.m0.j.o;
import m.m0.j.p;
import m.m0.j.t;
import m.m0.j.u;
import m.y;
import n.x;

/*
 * Exception performing whole class analysis.
 */
public final class o {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque<y> e;
    public boolean f;
    public final b g;
    public final a h;
    public final c i;
    public final c j;
    public m.m0.j.b k;
    public IOException l;
    public final int m;
    public final f n;

    public o(int n2, f f2, boolean bl, boolean bl2, y y2) {
        ArrayDeque arrayDeque;
        i.e(f2, "connection");
        this.m = n2;
        this.n = f2;
        this.d = f2.F.a();
        this.e = arrayDeque = new ArrayDeque();
        this.g = new /* Unavailable Anonymous Inner Class!! */;
        this.h = new /* Unavailable Anonymous Inner Class!! */;
        this.i = new /* Unavailable Anonymous Inner Class!! */;
        this.j = new /* Unavailable Anonymous Inner Class!! */;
        if (y2 != null) {
            if (true ^ this.h()) {
                arrayDeque.add((Object)y2);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        }
        if (this.h()) {
            return;
        }
        throw new IllegalStateException("remotely-initiated streams should have headers".toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        var8_1 = this;
        // MONITORENTER : var8_1
        var3_2 = this.g;
        if (var3_2.o || !var3_2.m) ** GOTO lbl-1000
        var7_3 = this.h;
        if (var7_3.m || var7_3.l) {
            var4_4 = true;
        } else lbl-1000: // 2 sources:
        {
            var4_4 = false;
        }
        var5_5 = this.i();
        // MONITOREXIT : var8_1
        if (var4_4) {
            this.c(m.m0.j.b.p, null);
            return;
        }
        if (var5_5 != false) return;
        this.n.o(this.m);
    }

    public final void b() {
        a a2 = this.h;
        if (!a2.l) {
            if (!a2.m) {
                if (this.k != null) {
                    IOException iOException = this.l;
                    if (iOException == null) {
                        m.m0.j.b b2 = this.k;
                        i.c((Object)b2);
                        iOException = new u(b2);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(m.m0.j.b b2, IOException iOException) {
        i.e((Object)b2, "rstStatusCode");
        if (!this.d(b2, iOException)) {
            return;
        }
        f f2 = this.n;
        int n2 = this.m;
        Objects.requireNonNull((Object)f2);
        i.e((Object)b2, "statusCode");
        f2.L.u(n2, b2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d(m.m0.j.b b2, IOException iOException) {
        o o2 = this;
        synchronized (o2) {
            boolean bl;
            m.m0.j.b b3 = this.k;
            if (b3 != null) {
                return false;
            }
            if (this.g.o && (bl = this.h.m)) {
                return false;
            }
            this.k = b2;
            this.l = iOException;
            this.notifyAll();
        }
        this.n.o(this.m);
        return true;
    }

    public final void e(m.m0.j.b b2) {
        i.e((Object)b2, "errorCode");
        if (!this.d(b2, null)) {
            return;
        }
        this.n.w(this.m, b2);
    }

    public final m.m0.j.b f() {
        o o2 = this;
        synchronized (o2) {
            m.m0.j.b b2 = this.k;
            return b2;
        }
    }

    public final x g() {
        o o2 = this;
        synchronized (o2) {
            block4 : {
                boolean bl;
                boolean bl2 = this.f || (bl = this.h());
                if (!bl2) break block4;
                return this.h;
            }
            throw new IllegalStateException("reply before requesting the sink".toString());
        }
    }

    public final boolean h() {
        boolean bl = (1 & this.m) == 1;
        return this.n.m == bl;
    }

    public final boolean i() {
        o o2 = this;
        synchronized (o2) {
            block5 : {
                boolean bl;
                block4 : {
                    m.m0.j.b b2 = this.k;
                    if (b2 == null) break block4;
                    return false;
                }
                b b3 = this.g;
                if (!b3.o && !b3.m) break block5;
                a a2 = this.h;
                if (!a2.m && !a2.l || !(bl = this.f)) break block5;
                return false;
            }
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void j(y y2, boolean bl) {
        i.e((Object)y2, "headers");
        o o2 = this;
        // MONITORENTER : o2
        if (this.f && bl) {
            Objects.requireNonNull((Object)this.g);
        } else {
            this.f = true;
            this.e.add((Object)y2);
        }
        if (bl) {
            this.g.o = true;
        }
        boolean bl2 = this.i();
        this.notifyAll();
        // MONITOREXIT : o2
        if (bl2) return;
        this.n.o(this.m);
    }

    public final void k(m.m0.j.b b2) {
        o o2 = this;
        synchronized (o2) {
            i.e((Object)b2, "errorCode");
            if (this.k == null) {
                this.k = b2;
                this.notifyAll();
            }
            return;
        }
    }

    public final void l() {
        try {
            this.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}

