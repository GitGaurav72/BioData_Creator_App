/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.e.c0
 *  e.p.e.h0.a
 *  e.p.e.h0.c
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.concurrent.atomic.AtomicLongArray
 */
package e.p.e;

import e.p.e.c0;
import e.p.e.h0.a;
import e.p.e.h0.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

public class i
extends c0<AtomicLongArray> {
    public final /* synthetic */ c0 a;

    public i(c0 c02) {
        this.a = c02;
    }

    public Object a(a a2) {
        ArrayList arrayList = new ArrayList();
        a2.a();
        while (a2.w()) {
            arrayList.add((Object)((Number)this.a.a(a2)).longValue());
        }
        a2.q();
        int n = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(n);
        for (int i2 = 0; i2 < n; ++i2) {
            atomicLongArray.set(i2, ((Long)arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }

    public void b(c c2, Object object) {
        AtomicLongArray atomicLongArray = (AtomicLongArray)object;
        c2.b();
        int n = atomicLongArray.length();
        for (int i2 = 0; i2 < n; ++i2) {
            this.a.b(c2, (Object)atomicLongArray.get(i2));
        }
        c2.q();
    }
}

