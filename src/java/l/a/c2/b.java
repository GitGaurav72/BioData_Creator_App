/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package l.a.c2;

import e.s.a.a;
import l.a.b2.r;
import l.a.c2.c;
import l.a.c2.e;
import l.a.z;

public final class b
extends c {
    public static final b p;
    public static final z q;

    public static {
        b b2;
        p = b2 = new b();
        int n2 = r.a;
        int n3 = 64 < n2 ? n2 : 64;
        q = new e(b2, a.b4((String)"kotlinx.coroutines.io.parallelism", (int)n3, (int)0, (int)0, (int)12, null), "Dispatchers.IO", 1);
    }

    public b() {
        super(0, 0, null, 7);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public String toString() {
        return "Dispatchers.Default";
    }
}

