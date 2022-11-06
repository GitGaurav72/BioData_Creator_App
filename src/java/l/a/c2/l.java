/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 *  k.a0.e
 *  l.a.c2.f
 */
package l.a.c2;

import e.s.a.a;
import java.util.concurrent.TimeUnit;
import k.a0.e;
import l.a.b2.r;
import l.a.c2.f;
import l.a.c2.h;

public final class l {
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    public static h e;

    public static {
        int n2;
        a = a.c4((String)"kotlinx.coroutines.scheduler.resolution.ns", (long)100000L, (long)0L, (long)0L, (int)12, null);
        a.b4((String)"kotlinx.coroutines.scheduler.blocking.parallelism", (int)16, (int)0, (int)0, (int)12, null);
        int n3 = r.a;
        int n4 = n3 < 2 ? 2 : n3;
        b = n2 = a.b4((String)"kotlinx.coroutines.scheduler.core.pool.size", (int)n4, (int)1, (int)0, (int)8, null);
        c = a.b4((String)"kotlinx.coroutines.scheduler.max.pool.size", (int)e.a((int)(n3 * 128), (int)n2, (int)2097150), (int)0, (int)2097150, (int)4, null);
        d = TimeUnit.SECONDS.toNanos(a.c4((String)"kotlinx.coroutines.scheduler.keep.alive.sec", (long)60L, (long)0L, (long)0L, (int)12, null));
        e = f.a;
    }
}

