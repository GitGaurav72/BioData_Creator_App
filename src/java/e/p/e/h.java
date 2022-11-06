/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.e.c0
 *  e.p.e.h0.a
 *  e.p.e.h0.c
 *  java.lang.Number
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicLong
 */
package e.p.e;

import e.p.e.c0;
import e.p.e.h0.a;
import e.p.e.h0.c;
import java.util.concurrent.atomic.AtomicLong;

public class h
extends c0<AtomicLong> {
    public final /* synthetic */ c0 a;

    public h(c0 c02) {
        this.a = c02;
    }

    public Object a(a a2) {
        return new AtomicLong(((Number)this.a.a(a2)).longValue());
    }

    public void b(c c2, Object object) {
        AtomicLong atomicLong = (AtomicLong)object;
        this.a.b(c2, (Object)atomicLong.get());
    }
}

