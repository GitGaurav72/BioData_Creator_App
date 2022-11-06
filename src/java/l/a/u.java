/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  k.x.b.l
 */
package l.a;

import e.e.a.a.a;
import k.q;
import k.x.b.l;
import k.x.c.i;

public final class u {
    public final Object a;
    public final l<Throwable, q> b;

    public u(Object object, l<? super Throwable, q> l2) {
        this.a = object;
        this.b = l2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        u u2 = (u)object;
        if (!i.a(this.a, u2.a)) {
            return false;
        }
        return i.a(this.b, u2.b);
    }

    public int hashCode() {
        Object object = this.a;
        int n2 = object == null ? 0 : object.hashCode();
        return n2 * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"CompletedWithCancellation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", onCancellation=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

