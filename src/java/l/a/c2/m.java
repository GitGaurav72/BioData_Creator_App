/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceArray
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package l.a.c2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.a.c2.h;
import l.a.c2.i;
import l.a.c2.j;
import l.a.c2.l;

public final class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    private volatile /* synthetic */ int blockingTasksInBuffer;
    private volatile /* synthetic */ int consumerIndex;
    public final AtomicReferenceArray<i> e = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask;
    private volatile /* synthetic */ int producerIndex;

    public static {
        a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, (String)"lastScheduledTask");
        b = AtomicIntegerFieldUpdater.newUpdater(m.class, (String)"producerIndex");
        c = AtomicIntegerFieldUpdater.newUpdater(m.class, (String)"consumerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater(m.class, (String)"blockingTasksInBuffer");
    }

    public m() {
        this.lastScheduledTask = null;
        this.producerIndex = 0;
        this.consumerIndex = 0;
        this.blockingTasksInBuffer = 0;
    }

    public final i a(i i2, boolean bl) {
        if (bl) {
            return this.b(i2);
        }
        i i3 = (i)a.getAndSet((Object)this, (Object)i2);
        if (i3 == null) {
            return null;
        }
        return this.b(i3);
    }

    public final i b(i i2) {
        int n2;
        int n3 = i2.l.u();
        if (n3 != (n2 = 1)) {
            n2 = 0;
        }
        if (n2 != 0) {
            d.incrementAndGet((Object)this);
        }
        if (this.c() == 127) {
            return i2;
        }
        int n4 = 127 & this.producerIndex;
        while (this.e.get(n4) != null) {
            Thread.yield();
        }
        this.e.lazySet(n4, (Object)i2);
        b.incrementAndGet((Object)this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        if (this.lastScheduledTask != null) {
            return 1 + this.c();
        }
        return this.c();
    }

    public final i e() {
        i i2 = (i)a.getAndSet((Object)this, null);
        if (i2 == null) {
            i2 = this.f();
        }
        return i2;
    }

    public final i f() {
        i i2;
        int n2;
        int n3;
        int n4;
        do {
            if ((n4 = this.consumerIndex) - this.producerIndex == 0) {
                return null;
            }
            n3 = n4 & 127;
        } while (!c.compareAndSet((Object)this, n4, n4 + 1) || (i2 = (i)this.e.getAndSet(n3, null)) == null);
        int n5 = i2.l.u();
        if (n5 != (n2 = 1)) {
            n2 = 0;
        }
        if (n2 != 0) {
            d.decrementAndGet((Object)this);
        }
        return i2;
    }

    public final long g(m m2) {
        int n2;
        int n3 = m2.consumerIndex;
        int n4 = m2.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = m2.e;
        do {
            n2 = 1;
            if (n3 == n4) break;
            int n5 = n3 & 127;
            if (m2.blockingTasksInBuffer == 0) break;
            i i2 = (i)atomicReferenceArray.get(n5);
            if (i2 != null) {
                if (i2.l.u() != n2) {
                    n2 = 0;
                }
                if (n2 != 0 && atomicReferenceArray.compareAndSet(n5, (Object)i2, null)) {
                    d.decrementAndGet((Object)m2);
                    this.a(i2, false);
                    return -1L;
                }
            }
            ++n3;
        } while (true);
        return this.h(m2, (boolean)n2);
    }

    public final long h(m m2, boolean bl) {
        i i2;
        do {
            long l2;
            long l3;
            if ((i2 = (i)m2.lastScheduledTask) == null) {
                return -2L;
            }
            if (bl) {
                int n2;
                int n3 = i2.l.u();
                if (n3 != (n2 = 1)) {
                    n2 = 0;
                }
                if (n2 == 0) {
                    return -2L;
                }
            }
            if ((l3 = l.e.a() - i2.k) >= (l2 = l.a)) continue;
            return l2 - l3;
        } while (!a.compareAndSet((Object)m2, (Object)i2, null));
        this.a(i2, false);
        return -1L;
    }
}

