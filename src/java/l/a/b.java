/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicInteger
 */
package l.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k.x.c.i;

public final class b
implements ThreadFactory {
    public final /* synthetic */ AtomicInteger a;

    public /* synthetic */ b(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, i.k("CommonPool-worker-", this.a.incrementAndGet()));
        thread.setDaemon(true);
        return thread;
    }
}

