/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.q.a.m
 *  e.q.a.r
 *  e.q.a.r$b
 *  e.q.a.v
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.q.a.b0;

import e.q.a.m;
import e.q.a.r;
import e.q.a.v;

public final class a<T>
extends m<T> {
    public final m<T> a;

    public a(m<T> m2) {
        this.a = m2;
    }

    public T a(r r2) {
        if (r2.z() == r.b.s) {
            r2.w();
            return null;
        }
        return (T)this.a.a(r2);
    }

    public void f(v v2, T t2) {
        if (t2 == null) {
            v2.v();
            return;
        }
        this.a.f(v2, t2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(".nullSafe()");
        return stringBuilder.toString();
    }
}

