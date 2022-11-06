/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.q.a.m
 *  e.q.a.r
 *  e.q.a.v
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.q.a;

import e.q.a.m;
import e.q.a.r;
import e.q.a.v;

public class l
extends m<T> {
    public final /* synthetic */ m a;

    public l(m m2, m m3) {
        this.a = m3;
    }

    public T a(r r2) {
        return (T)this.a.a(r2);
    }

    public boolean c() {
        return this.a.c();
    }

    public void f(v v2, T t2) {
        boolean bl = v2.o;
        v2.o = true;
        try {
            this.a.f(v2, t2);
            return;
        }
        finally {
            v2.o = bl;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.a);
        stringBuilder.append(".serializeNulls()");
        return stringBuilder.toString();
    }
}

