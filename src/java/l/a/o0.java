/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.ThreadLocal
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  java.util.concurrent.locks.LockSupport
 *  l.a.i0
 *  l.a.o0$a
 *  l.a.o0$b
 */
package l.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k.u.f;
import k.x.c.i;
import l.a.b2.k;
import l.a.b2.q;
import l.a.e0;
import l.a.i0;
import l.a.n0;
import l.a.o0;
import l.a.p0;
import l.a.q0;
import l.a.t1;

/*
 * Exception performing whole class analysis.
 */
public abstract class o0
extends p0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    private volatile /* synthetic */ Object _delayed;
    private volatile /* synthetic */ int _isCompleted;
    private volatile /* synthetic */ Object _queue;

    public static {
        n = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, (String)"_queue");
        o = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, (String)"_delayed");
    }

    public o0() {
        this._queue = null;
        this._delayed = null;
        this._isCompleted = 0;
    }

    public final void S(Runnable runnable) {
        if (this.U(runnable)) {
            Thread thread = this.R();
            if (Thread.currentThread() != thread) {
                LockSupport.unpark((Thread)thread);
                return;
            }
        } else {
            e0.p.S(runnable);
        }
    }

    public final boolean U(Runnable runnable) {
        do {
            Object object = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (object == null) {
                if (!n.compareAndSet((Object)this, null, (Object)runnable)) continue;
                return true;
            }
            if (object instanceof k) {
                k k2 = (k)object;
                int n2 = k2.a(runnable);
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) continue;
                        return false;
                    }
                    n.compareAndSet((Object)this, object, k2.e());
                    continue;
                }
                return true;
            }
            if (object == q0.b) {
                return false;
            }
            k<Runnable> k3 = new k<Runnable>(8, true);
            k3.a((Runnable)object);
            k3.a(runnable);
            if (n.compareAndSet((Object)this, object, k3)) break;
        } while (true);
        return true;
    }

    public boolean X() {
        l.a.b2.a<i0<?>> a2 = this.m;
        boolean bl = a2 == null || a2.b == a2.c;
        if (!bl) {
            return false;
        }
        b b2 = this._delayed;
        if (b2 != null && !b2.c()) {
            return false;
        }
        Object object = this._queue;
        if (object == null) {
            return true;
        }
        if (object instanceof k) {
            return ((k)object).d();
        }
        return object == q0.b;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public long Y() {
        block24 : {
            var1_1 = this.P();
            var2_2 = 0L;
            if (var1_1) {
                return var2_2;
            }
            var4_3 = this._delayed;
            var5_4 = true;
            if (var4_3 != null && !var4_3.c()) {
                var21_5 = System.nanoTime();
                do {
                    var29_11 = var4_3;
                    // MONITORENTER : var29_11
                    var24_6 = var4_3.b();
                    if (var24_6 == null) {
                        // MONITOREXIT : var29_11
                        var28_10 = null;
                        continue;
                    }
                    var25_7 = var24_6;
                    var26_8 = var21_5 - var25_7.k >= var2_2 ? var5_4 : false;
                    var27_9 = var26_8 != false ? this.U((Runnable)var25_7) : false;
                    var28_10 = var27_9 != false ? var4_3.d(0) : null;
                    // MONITOREXIT : var29_11
                } while (var28_10 != null);
            }
            do {
                block26 : {
                    block25 : {
                        if ((var6_12 = this._queue) == null) break block25;
                        if (var6_12 instanceof k) {
                            var18_13 = (k)var6_12;
                            var19_14 = var18_13.f();
                            if (var19_14 != k.d) {
                                var7_15 = (Runnable)var19_14;
                                break block24;
                            }
                            o0.n.compareAndSet((Object)this, var6_12, var18_13.e());
                            continue;
                        }
                        if (var6_12 != q0.b) break block26;
                    }
                    var7_15 = null;
                    break block24;
                }
                if (o0.n.compareAndSet((Object)this, var6_12, null)) break;
            } while (true);
            var7_15 = (Runnable)var6_12;
        }
        if (var7_15 != null) {
            var7_15.run();
            return var2_2;
        }
        var8_16 = this.m;
        if (var8_16 == null) ** GOTO lbl-1000
        if (var8_16.b != var8_16.c) {
            var5_4 = false;
        }
        if (var5_4) lbl-1000: // 2 sources:
        {
            var9_17 = Long.MAX_VALUE;
        } else {
            var9_17 = var2_2;
        }
        if (var9_17 == var2_2) {
            return var2_2;
        }
        var11_18 = this._queue;
        if (var11_18 != null) {
            if (var11_18 instanceof k) {
                if (!((k)var11_18).d()) {
                    return var2_2;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000: // 3 sources:
        {
            if ((var12_19 = this._delayed) == null) {
                return Long.MAX_VALUE;
            }
            var30_21 = var12_19;
            // MONITORENTER : var30_21
            var17_22 = var12_19.b();
            // MONITOREXIT : var30_21
            var13_20 = var17_22;
            if (var13_20 == null) return Long.MAX_VALUE;
            var14_23 = var13_20.k - System.nanoTime();
            if (var14_23 >= var2_2) return var14_23;
            return var2_2;
        }
        if (var11_18 != q0.b) return var2_2;
        return Long.MAX_VALUE;
    }

    public final void b0() {
        this._queue = null;
        this._delayed = null;
    }

    @Override
    public final void dispatch(f f2, Runnable runnable) {
        this.S(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void g0(long l2, a a2) {
        int n2;
        a a3;
        block23 : {
            block25 : {
                b b2;
                long l3;
                long l4;
                block29 : {
                    long l5;
                    block28 : {
                        a a4;
                        block27 : {
                            block26 : {
                                block24 : {
                                    block22 : {
                                        if (this._isCompleted == 0) break block22;
                                        n2 = 1;
                                        break block23;
                                    }
                                    b2 = this._delayed;
                                    if (b2 == null) {
                                        o.compareAndSet((Object)this, null, (Object)new /* Unavailable Anonymous Inner Class!! */);
                                        Object object = this._delayed;
                                        i.c(object);
                                        b2 = object;
                                    }
                                    a a5 = a2;
                                    // MONITORENTER : a5
                                    if (a2.l != q0.a) break block24;
                                    n2 = 2;
                                    break block25;
                                }
                                b b3 = b2;
                                // MONITORENTER : b3
                                a4 = b2.b();
                                int n3 = this._isCompleted;
                                if (n3 == 0) break block26;
                                // MONITOREXIT : b3
                                n2 = 1;
                                break block25;
                            }
                            if (a4 != null) break block27;
                            l5 = l2;
                            break block28;
                        }
                        l5 = a4.k;
                        if (l5 - l2 >= 0L) {
                            l5 = l2;
                        }
                        if (l5 - b2.b <= 0L) break block29;
                    }
                    b2.b = l5;
                }
                if ((l4 = a2.k) - (l3 = b2.b) < 0L) {
                    a2.k = l3;
                }
                b2.a(a2);
                // MONITOREXIT : b3
                n2 = 0;
            }
            // MONITOREXIT : a5
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) throw new IllegalStateException("unexpected result".toString());
                return;
            }
            e0.p.g0(l2, a2);
            return;
        }
        b b4 = this._delayed;
        if (b4 == null) {
            a3 = null;
        } else {
            b b5 = b4;
            // MONITORENTER : b5
            Object t2 = b4.b();
            // MONITOREXIT : b5
            a3 = t2;
        }
        boolean bl = false;
        if (a3 == a2) {
            bl = true;
        }
        if (!bl) return;
        Thread thread = this.R();
        if (Thread.currentThread() == thread) return;
        LockSupport.unpark((Thread)thread);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void shutdown() {
        t1.b.set(null);
        this._isCompleted = 1;
        do lbl-1000: // 3 sources:
        {
            block6 : {
                if ((var2_1 = this._queue) != null) break block6;
                if (!o0.n.compareAndSet((Object)this, null, (Object)q0.b)) ** GOTO lbl-1000
                break;
            }
            if (var2_1 instanceof k) {
                ((k)var2_1).b();
                break;
            }
            if (var2_1 == q0.b) break;
            var3_2 = new k<Runnable>(8, true);
            var3_2.a((Runnable)var2_1);
        } while (!o0.n.compareAndSet((Object)this, var2_1, var3_2));
        while (this.Y() <= 0L) {
        }
        var5_3 = System.nanoTime();
        do {
            if ((var7_4 = this._delayed) == null) {
                return;
            }
            var8_5 = var7_4.e();
            if (var8_5 == null) {
                return;
            }
            e0.p.g0(var5_3, var8_5);
        } while (true);
    }
}

