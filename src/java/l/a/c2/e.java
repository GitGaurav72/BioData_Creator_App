/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.Executor
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package l.a.c2;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k.u.f;
import l.a.c2.a;
import l.a.c2.c;
import l.a.c2.i;
import l.a.c2.j;
import l.a.e0;
import l.a.s0;
import l.a.z;

public final class e
extends s0
implements j,
Executor {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k;
    private volatile /* synthetic */ int inFlightTasks;
    public final c l;
    public final int m;
    public final String n;
    public final int o;
    public final ConcurrentLinkedQueue<Runnable> p;

    public static {
        k = AtomicIntegerFieldUpdater.newUpdater(e.class, (String)"inFlightTasks");
    }

    public e(c c2, int n2, String string, int n3) {
        this.l = c2;
        this.m = n2;
        this.n = string;
        this.o = n3;
        this.p = new ConcurrentLinkedQueue();
        this.inFlightTasks = 0;
    }

    public final void B(Runnable runnable, boolean bl) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            if ((atomicIntegerFieldUpdater = k).incrementAndGet((Object)this) <= this.m) {
                c c2 = this.l;
                Objects.requireNonNull((Object)((Object)c2));
                try {
                    c2.o.o(runnable, this, bl);
                    return;
                }
                catch (RejectedExecutionException rejectedExecutionException) {
                    e0.p.S(c2.o.b(runnable, this));
                    return;
                }
            }
            this.p.add((Object)runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet((Object)this) < this.m) continue;
            return;
        } while ((runnable = (Runnable)this.p.poll()) != null);
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override
    public void dispatch(f f2, Runnable runnable) {
        this.B(runnable, false);
    }

    @Override
    public void dispatchYield(f f2, Runnable runnable) {
        this.B(runnable, true);
    }

    public void execute(Runnable runnable) {
        this.B(runnable, false);
    }

    @Override
    public void k() {
        Runnable runnable = (Runnable)this.p.poll();
        if (runnable != null) {
            c c2 = this.l;
            Objects.requireNonNull((Object)((Object)c2));
            try {
                c2.o.o(runnable, this, true);
                return;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                e0.p.S(c2.o.b(runnable, this));
                return;
            }
        }
        k.decrementAndGet((Object)this);
        Runnable runnable2 = (Runnable)this.p.poll();
        if (runnable2 == null) {
            return;
        }
        this.B(runnable2, true);
    }

    @Override
    public String toString() {
        String string = this.n;
        if (string == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(z.super.toString());
            stringBuilder.append("[dispatcher = ");
            stringBuilder.append((Object)this.l);
            stringBuilder.append(']');
            string = stringBuilder.toString();
        }
        return string;
    }

    @Override
    public int u() {
        return this.o;
    }
}

