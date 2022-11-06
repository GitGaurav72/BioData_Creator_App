/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.io.Closeable
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Objects
 *  java.util.concurrent.Executor
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicLongFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceArray
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  java.util.concurrent.locks.LockSupport
 *  l.a.c2.d
 *  l.a.c2.g
 *  l.a.c2.k
 */
package l.a.c2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k.z.c;
import l.a.b2.q;
import l.a.c2.d;
import l.a.c2.g;
import l.a.c2.h;
import l.a.c2.i;
import l.a.c2.j;
import l.a.c2.k;
import l.a.c2.l;
import l.a.c2.m;

public final class a
implements Executor,
Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater k;
    public static final /* synthetic */ AtomicLongFieldUpdater l;
    public static final /* synthetic */ AtomicIntegerFieldUpdater m;
    public static final q n = new q("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public final int o;
    public final int p;
    private volatile /* synthetic */ long parkedWorkersStack;
    public final long q;
    public final String r;
    public final d s;
    public final d t;
    public final AtomicReferenceArray<a> u;

    public static {
        k = AtomicLongFieldUpdater.newUpdater(a.class, (String)"parkedWorkersStack");
        l = AtomicLongFieldUpdater.newUpdater(a.class, (String)"controlState");
        m = AtomicIntegerFieldUpdater.newUpdater(a.class, (String)"_isTerminated");
    }

    public a(int n2, int n3, long l2, String string) {
        this.o = n2;
        this.p = n3;
        this.q = l2;
        this.r = string;
        boolean bl = n2 >= 1;
        if (bl) {
            boolean bl2 = n3 >= n2;
            if (bl2) {
                boolean bl3 = n3 <= 2097150;
                if (bl3) {
                    boolean bl4 = l2 > 0L;
                    if (bl4) {
                        this.s = new d();
                        this.t = new d();
                        this.parkedWorkersStack = 0L;
                        this.u = new AtomicReferenceArray(n3 + 1);
                        this.controlState = (long)n2 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Idle worker keep alive time ");
                    stringBuilder.append(l2);
                    stringBuilder.append(" must be positive");
                    throw new IllegalArgumentException(stringBuilder.toString().toString());
                }
                throw new IllegalArgumentException(e.e.a.a.a.g((String)"Max pool size ", (int)n3, (String)" should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(e.e.a.a.a.h((String)"Max pool size ", (int)n3, (String)" should be greater than or equals to core pool size ", (int)n2).toString());
        }
        throw new IllegalArgumentException(e.e.a.a.a.g((String)"Core pool size ", (int)n2, (String)" should be at least 1").toString());
    }

    public static /* synthetic */ void q(a a2, Runnable runnable, j j2, boolean bl, int n2) {
        Object object = (n2 & 2) != 0 ? g.k : null;
        if ((n2 & 4) != 0) {
            bl = false;
        }
        a2.o(runnable, (j)object, bl);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean B() {
        do lbl-1000: // 3 sources:
        {
            if ((var4_3 = (a)this.u.get(var3_2 = (int)(0x1FFFFFL & (var1_1 = this.parkedWorkersStack)))) == null) {
                return false;
            }
            var5_4 = -2097152L & 0x200000L + var1_1;
            var7_5 = this.r(var4_3);
            if (var7_5 < 0 || !a.k.compareAndSet((Object)this, var1_1, var5_4 | (long)var7_5)) ** GOTO lbl-1000
            var4_3.g(a.n);
            if (var4_3 != null) continue;
            return false;
        } while (!a.k.compareAndSet((Object)var4_3, -1, 0));
        LockSupport.unpark((Thread)var4_3);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        AtomicReferenceArray<a> atomicReferenceArray;
        AtomicReferenceArray<a> atomicReferenceArray2 = atomicReferenceArray = this.u;
        synchronized (atomicReferenceArray2) {
            int n2;
            int n3 = this._isTerminated;
            if (n3 != 0) {
                return -1;
            }
            long l2 = this.controlState;
            int n4 = (int)(l2 & 0x1FFFFFL);
            int n5 = n4 - (int)((l2 & 4398044413952L) >> 21);
            if (n5 < 0) {
                n5 = 0;
            }
            if (n5 >= (n2 = this.o)) {
                return 0;
            }
            int n6 = this.p;
            if (n4 >= n6) {
                return 0;
            }
            int n7 = 1 + (int)(0x1FFFFFL & this.controlState);
            boolean bl = n7 > 0 && this.u.get(n7) == null;
            if (!bl) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            a a2 = new a(n7);
            this.u.set(n7, (Object)a2);
            int n8 = (int)(0x1FFFFFL & l.incrementAndGet((Object)this));
            boolean bl2 = false;
            if (n7 == n8) {
                bl2 = true;
            }
            if (!bl2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            a2.start();
            return n5 + 1;
        }
    }

    public final i b(Runnable runnable, j j2) {
        long l2 = l.e.a();
        if (runnable instanceof i) {
            i i2 = (i)runnable;
            i2.k = l2;
            i2.l = j2;
            return i2;
        }
        return new k(runnable, l2, j2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void close() {
        AtomicReferenceArray<a> atomicReferenceArray;
        if (!m.compareAndSet((Object)this, 0, 1)) {
            return;
        }
        a a2 = this.k();
        AtomicReferenceArray<a> atomicReferenceArray2 = atomicReferenceArray = this.u;
        // MONITORENTER : atomicReferenceArray2
        long l2 = this.controlState;
        int n2 = (int)(l2 & 0x1FFFFFL);
        // MONITOREXIT : atomicReferenceArray2
        if (1 <= n2) {
            int n3 = 1;
            do {
                int n4 = n3 + 1;
                Object object = this.u.get(n3);
                k.x.c.i.c(object);
                a a3 = (a)((Object)object);
                if (a3 != a2) {
                    boolean bl;
                    while (a3.isAlive()) {
                        LockSupport.unpark((Thread)a3);
                        a3.join(10000L);
                    }
                    m m2 = a3.l;
                    d d2 = this.t;
                    Objects.requireNonNull((Object)m2);
                    i i2 = (i)m.a.getAndSet((Object)m2, null);
                    if (i2 != null) {
                        d2.a(i2);
                    }
                    do {
                        i i3;
                        if ((i3 = m2.f()) == null) {
                            bl = false;
                            continue;
                        }
                        d2.a(i3);
                        bl = true;
                    } while (bl);
                }
                if (n3 == n2) break;
                n3 = n4;
            } while (true);
        }
        this.t.b();
        this.s.b();
        do {
            i i4;
            if ((i4 = a2 == null ? null : a2.a(true)) == null && (i4 = (i)this.s.d()) == null && (i4 = (i)this.t.d()) == null) {
                if (a2 != null) {
                    a2.h(b.o);
                }
                this.parkedWorkersStack = 0L;
                this.controlState = 0L;
                return;
            }
            this.w(i4);
        } while (true);
    }

    public void execute(Runnable runnable) {
        a.q(this, runnable, null, false, 6);
    }

    public final boolean isTerminated() {
        return (boolean)this._isTerminated;
    }

    public final a k() {
        Thread thread = Thread.currentThread();
        a a2 = thread instanceof a ? (a)thread : null;
        if (a2 == null) {
            return null;
        }
        boolean bl = k.x.c.i.a(a2.a.this, this);
        a a3 = null;
        if (bl) {
            a3 = a2;
        }
        return a3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void o(Runnable runnable, j j2, boolean bl) {
        int n2;
        i i2;
        d d2;
        i i3 = this.b(runnable, j2);
        a a2 = this.k();
        int n3 = 1;
        if (a2 == null || a2.m == b.o || i3.l.u() == 0 && a2.m == b.l) {
            i2 = i3;
        } else {
            a2.q = n3;
            i2 = a2.l.a(i3, bl);
        }
        if (i2 != null && !(d2 = (n2 = i2.l.u() == n3 ? n3 : 0) != 0 ? this.t : this.s).a(i2)) {
            throw new RejectedExecutionException(k.x.c.i.k(this.r, " was terminated"));
        }
        if (!bl || a2 == null) {
            n3 = 0;
        }
        if (i3.l.u() == 0) {
            if (n3 != 0) {
                return;
            }
            this.y();
            return;
        }
        long l2 = l.addAndGet((Object)this, 0x200000L);
        if (n3 != 0) {
            return;
        }
        if (this.B()) {
            return;
        }
        if (this.z(l2)) {
            return;
        }
        this.B();
    }

    public final int r(a a2) {
        int n2;
        Object object;
        do {
            if ((object = a2.c()) == n) {
                return -1;
            }
            if (object != null) continue;
            return 0;
        } while ((n2 = (a2 = (a)((Object)object)).b()) == 0);
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        int n2;
        int n3;
        int n4;
        ArrayList arrayList;
        int n5;
        int n6;
        block4 : {
            int n7;
            block3 : {
                arrayList = new ArrayList();
                n7 = this.u.length();
                n6 = 0;
                if (1 < n7) break block3;
                n5 = 0;
                n3 = 0;
                n4 = 0;
                n2 = 0;
                break block4;
            }
            n3 = 0;
            int n8 = 0;
            n4 = 0;
            n2 = 0;
            int n9 = 1;
            do {
                int n10;
                block5 : {
                    int n11;
                    StringBuilder stringBuilder;
                    block10 : {
                        int n12;
                        block6 : {
                            block7 : {
                                block8 : {
                                    block9 : {
                                        n10 = n9 + 1;
                                        a a2 = (a)((Object)this.u.get(n9));
                                        if (a2 == null) break block5;
                                        n12 = a2.l.d();
                                        int n13 = a2.m.ordinal();
                                        if (n13 == 0) break block6;
                                        if (n13 == 1) break block7;
                                        if (n13 == 2) break block8;
                                        if (n13 == 3) break block9;
                                        if (n13 == 4) {
                                            ++n2;
                                        }
                                        break block5;
                                    }
                                    ++n4;
                                    if (n12 <= 0) break block5;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(n12);
                                    n11 = 100;
                                    break block10;
                                }
                                ++n6;
                                break block5;
                            }
                            ++n3;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(n12);
                            n11 = 98;
                            break block10;
                        }
                        ++n8;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(n12);
                        n11 = 99;
                    }
                    stringBuilder.append((char)n11);
                    arrayList.add((Object)stringBuilder.toString());
                }
                if (n10 >= n7) {
                    n5 = n6;
                    n6 = n8;
                    break;
                }
                n9 = n10;
            } while (true);
        }
        long l2 = this.controlState;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.r);
        stringBuilder.append('@');
        stringBuilder.append(e.s.a.a.w1((Object)this));
        stringBuilder.append("[Pool Size {core = ");
        stringBuilder.append(this.o);
        stringBuilder.append(", max = ");
        stringBuilder.append(this.p);
        stringBuilder.append("}, Worker States {CPU = ");
        stringBuilder.append(n6);
        stringBuilder.append(", blocking = ");
        stringBuilder.append(n3);
        stringBuilder.append(", parked = ");
        stringBuilder.append(n5);
        stringBuilder.append(", dormant = ");
        stringBuilder.append(n4);
        stringBuilder.append(", terminated = ");
        stringBuilder.append(n2);
        stringBuilder.append("}, running workers queues = ");
        stringBuilder.append((Object)arrayList);
        stringBuilder.append(", global CPU queue size = ");
        stringBuilder.append(this.s.c());
        stringBuilder.append(", global blocking queue size = ");
        stringBuilder.append(this.t.c());
        stringBuilder.append(", Control State {created workers= ");
        stringBuilder.append((int)(0x1FFFFFL & l2));
        stringBuilder.append(", blocking tasks = ");
        stringBuilder.append((int)((4398044413952L & l2) >> 21));
        stringBuilder.append(", CPUs acquired = ");
        stringBuilder.append(this.o - (int)((9223367638808264704L & l2) >> 42));
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    public final boolean u(a a2) {
        int n2;
        long l2;
        long l3;
        if (a2.c() != n) {
            return false;
        }
        do {
            l2 = this.parkedWorkersStack;
            int n3 = (int)(0x1FFFFFL & l2);
            l3 = -2097152L & 0x200000L + l2;
            n2 = a2.b();
            a2.g(this.u.get(n3));
        } while (!k.compareAndSet((Object)this, l2, l3 | (long)n2));
        return true;
    }

    public final void v(a a2, int n2, int n3) {
        long l2;
        int n4;
        long l3;
        do {
            l3 = this.parkedWorkersStack;
            n4 = (int)(0x1FFFFFL & l3);
            l2 = -2097152L & 0x200000L + l3;
            if (n4 != n2) continue;
            n4 = n3 == 0 ? this.r(a2) : n3;
        } while (n4 < 0 || !k.compareAndSet((Object)this, l3, l2 | (long)n4));
    }

    public final void w(i i2) {
        try {
            i2.run();
            return;
        }
        catch (Throwable throwable) {
            Thread thread = Thread.currentThread();
            thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
            return;
        }
    }

    public final void y() {
        if (this.B()) {
            return;
        }
        if (this.z(this.controlState)) {
            return;
        }
        this.B();
    }

    public final boolean z(long l2) {
        int n2 = (int)(0x1FFFFFL & l2) - (int)((l2 & 4398044413952L) >> 21);
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 < this.o) {
            int n3 = this.a();
            if (n3 == 1 && this.o > 1) {
                this.a();
            }
            if (n3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final class a
    extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater k;
        private volatile int indexInArray;
        public final m l;
        public b m;
        public long n;
        private volatile Object nextParkedWorker;
        public long o;
        public int p;
        public boolean q;
        public volatile /* synthetic */ int workerCtl;

        public static {
            k = AtomicIntegerFieldUpdater.newUpdater(a.class, (String)"workerCtl");
        }

        public a(int n2) {
            a.this = a.this;
            this.setDaemon(true);
            this.l = new m();
            this.m = b.n;
            this.workerCtl = 0;
            this.nextParkedWorker = a.n;
            this.p = c.l.a();
            this.f(n2);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public final i a(boolean var1_1) {
            block9 : {
                var2_2 = b.k;
                var3_3 = this.m;
                var4_4 = true;
                if (var3_3 == var2_2) ** GOTO lbl15
                var5_5 = a.this;
                do {
                    if ((int)((9223367638808264704L & (var6_6 = var5_5.controlState)) >> 42) != 0) continue;
                    var8_8 = false;
                    break block9;
                } while (!a.l.compareAndSet((Object)var5_5, var6_6, var12_7 = var6_6 - 0x40000000000L));
                var8_8 = var4_4;
            }
            if (var8_8) {
                this.m = var2_2;
lbl15: // 2 sources:
                var9_9 = var4_4;
            } else {
                var9_9 = false;
            }
            if (var9_9) {
                if (var1_1) {
                    if (this.d(2 * a.this.o) != 0) {
                        var4_4 = false;
                    }
                    if (var4_4) {
                        var11_10 = this.e();
                        if (var11_10 != null) return var11_10;
                    }
                    if ((var11_10 = this.l.e()) != null) return var11_10;
                    if (var4_4 != false) return this.i(false);
                    var11_10 = this.e();
                    if (var11_10 != null) return var11_10;
                    return this.i(false);
                } else {
                    var11_10 = this.e();
                    if (var11_10 != null) return var11_10;
                }
                return this.i(false);
            }
            if (!var1_1 || (var10_11 = this.l.e()) == null) {
                var10_11 = (i)a.this.t.d();
            }
            if (var10_11 != null) return var10_11;
            return this.i(var4_4);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int n2) {
            int n3;
            int n4 = this.p;
            int n5 = n4 ^ n4 << 13;
            int n6 = n5 ^ n5 >> 17;
            this.p = n3 = n6 ^ n6 << 5;
            int n7 = n2 - 1;
            if ((n7 & n2) == 0) {
                return n3 & n7;
            }
            return (n3 & Integer.MAX_VALUE) % n2;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final i e() {
            d d2;
            if (this.d(2) == 0) {
                i i2 = (i)a.this.s.d();
                if (i2 != null) return i2;
                d2 = a.this.t;
                do {
                    return (i)d2.d();
                    break;
                } while (true);
            }
            i i3 = (i)a.this.t.d();
            if (i3 != null) return i3;
            d2 = a.this.s;
            return (i)d2.d();
        }

        public final void f(int n2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a.this.r);
            stringBuilder.append("-worker-");
            String string = n2 == 0 ? "TERMINATED" : String.valueOf((int)n2);
            stringBuilder.append(string);
            this.setName(stringBuilder.toString());
            this.indexInArray = n2;
        }

        public final void g(Object object) {
            this.nextParkedWorker = object;
        }

        public final boolean h(b b2) {
            b b3 = this.m;
            boolean bl = b3 == b.k;
            if (bl) {
                a a2 = a.this;
                a.l.addAndGet((Object)a2, 0x40000000000L);
            }
            if (b3 != b2) {
                this.m = b2;
            }
            return bl;
        }

        public final i i(boolean bl) {
            int n2 = (int)(0x1FFFFFL & a.this.controlState);
            if (n2 < 2) {
                return null;
            }
            int n3 = this.d(n2);
            a a2 = a.this;
            long l2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < n2; ++i2) {
                a a3;
                long l3;
                if (++n3 > n2) {
                    n3 = 1;
                }
                if ((a3 = (a)((Object)a2.u.get(n3))) == null || a3 == this) continue;
                m m2 = this.l;
                m m3 = a3.l;
                if (bl) {
                    l3 = m2.g(m3);
                } else {
                    Objects.requireNonNull((Object)m2);
                    i i3 = m3.f();
                    if (i3 != null) {
                        m2.a(i3, false);
                        l3 = -1L;
                    } else {
                        l3 = m2.h(m3, false);
                    }
                }
                if (l3 == -1L) {
                    return this.l.e();
                }
                if (l3 <= 0L) continue;
                l2 = Math.min((long)l2, (long)l3);
            }
            if (l2 == Long.MAX_VALUE) {
                l2 = 0L;
            }
            this.o = l2;
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void run() {
            b b2 = b.m;
            b b3 = b.o;
            block3 : do {
                boolean bl = false;
                while (!a.this.isTerminated() && this.m != b3) {
                    boolean bl2;
                    i i2 = this.a(this.q);
                    if (i2 != null) {
                        this.o = 0L;
                        b b4 = b.l;
                        int n2 = i2.l.u();
                        this.n = 0L;
                        if (this.m == b2) {
                            this.m = b4;
                        }
                        if (n2 != 0 && this.h(b4)) {
                            a.this.y();
                        }
                        a.this.w(i2);
                        if (n2 == 0) continue block3;
                        a a2 = a.this;
                        a.l.addAndGet((Object)a2, -2097152L);
                        if (this.m == b3) continue block3;
                        this.m = b.n;
                        continue block3;
                    }
                    this.q = false;
                    if (this.o != 0L) {
                        if (!bl) {
                            bl = true;
                            continue;
                        }
                        this.h(b2);
                        Thread.interrupted();
                        LockSupport.parkNanos((long)this.o);
                        this.o = 0L;
                        continue block3;
                    }
                    boolean bl3 = this.nextParkedWorker != a.n;
                    if (!bl3) {
                        a.this.u(this);
                        continue;
                    }
                    this.workerCtl = -1;
                    while ((bl2 = this.nextParkedWorker != a.n) && this.workerCtl == -1 && !a.this.isTerminated() && this.m != b3) {
                        AtomicReferenceArray<a> atomicReferenceArray;
                        this.h(b2);
                        Thread.interrupted();
                        if (this.n == 0L) {
                            this.n = System.nanoTime() + a.this.q;
                        }
                        LockSupport.parkNanos((long)a.this.q);
                        if (System.nanoTime() - this.n < 0L) continue;
                        this.n = 0L;
                        a a3 = a.this;
                        AtomicReferenceArray<a> atomicReferenceArray2 = atomicReferenceArray = a3.u;
                        synchronized (atomicReferenceArray2) {
                            boolean bl4;
                            if (a3.isTerminated() || (int)(0x1FFFFFL & a3.controlState) <= a3.o || !(bl4 = k.compareAndSet((Object)this, -1, 1))) {
                                continue;
                            }
                            int n3 = this.indexInArray;
                            this.f(0);
                            a3.v(this, n3, 0);
                            int n4 = (int)(0x1FFFFFL & a.l.getAndDecrement((Object)a3));
                            if (n4 != n3) {
                                Object object = a3.u.get(n4);
                                k.x.c.i.c(object);
                                a a4 = (a)((Object)object);
                                a3.u.set(n3, (Object)a4);
                                a4.f(n3);
                                a3.v(a4, n4, n3);
                            }
                            a3.u.set(n4, null);
                        }
                        this.m = b3;
                    }
                }
                break;
            } while (true);
            this.h(b3);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b k;
        public static final /* enum */ b l;
        public static final /* enum */ b m;
        public static final /* enum */ b n;
        public static final /* enum */ b o;
        public static final /* synthetic */ b[] p;

        public static {
            b b2;
            b b3;
            b b4;
            b b5;
            b b6;
            k = b3 = new b();
            l = b5 = new b();
            m = b4 = new b();
            n = b2 = new b();
            o = b6 = new b();
            p = new b[]{b3, b5, b4, b2, b6};
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])p.clone();
        }
    }

}

