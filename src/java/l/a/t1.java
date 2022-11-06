/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Thread
 *  java.lang.ThreadLocal
 *  l.a.f
 *  l.a.n0
 */
package l.a;

import l.a.f;
import l.a.n0;

public final class t1 {
    public static final t1 a;
    public static final ThreadLocal<n0> b;

    public static {
        b = new ThreadLocal();
    }

    public static final n0 a() {
        ThreadLocal<n0> threadLocal = b;
        n0 n02 = (n0)threadLocal.get();
        if (n02 == null) {
            n02 = new f(Thread.currentThread());
            threadLocal.set((Object)n02);
        }
        return n02;
    }
}

