/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Objects
 *  k.x.b.l
 *  l.a.g
 */
package l.a;

import e.e.a.a.a;
import java.util.Objects;
import k.q;
import k.x.b.l;
import k.x.c.i;
import l.a.g;

public final class s {
    public final Object a;
    public final g b;
    public final l<Throwable, q> c;
    public final Object d;
    public final Throwable e;

    public s(Object object, g g2, l<? super Throwable, q> l2, Object object2, Throwable throwable) {
        this.a = object;
        this.b = g2;
        this.c = l2;
        this.d = object2;
        this.e = throwable;
    }

    public s(Object object, g g2, l l2, Object object2, Throwable throwable, int n2) {
        if ((n2 & 2) != 0) {
            g2 = null;
        }
        if ((n2 & 4) != 0) {
            l2 = null;
        }
        if ((n2 & 8) != 0) {
            object2 = null;
        }
        if ((n2 & 16) != 0) {
            throwable = null;
        }
        this.a = object;
        this.b = g2;
        this.c = l2;
        this.d = object2;
        this.e = throwable;
    }

    public static s a(s s2, Object object, g g2, l l2, Object object2, Throwable throwable, int n2) {
        Object object3 = (n2 & 1) != 0 ? s2.a : null;
        if ((n2 & 2) != 0) {
            g2 = s2.b;
        }
        g g3 = g2;
        l<Throwable, q> l3 = (n2 & 4) != 0 ? s2.c : null;
        int n3 = n2 & 8;
        Object object4 = null;
        if (n3 != 0) {
            object4 = s2.d;
        }
        Object object5 = object4;
        if ((n2 & 16) != 0) {
            throwable = s2.e;
        }
        Throwable throwable2 = throwable;
        Objects.requireNonNull((Object)s2);
        s s3 = new s(object3, g3, l3, object5, throwable2);
        return s3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        if (!i.a(this.a, s2.a)) {
            return false;
        }
        if (!i.a((Object)this.b, (Object)s2.b)) {
            return false;
        }
        if (!i.a(this.c, s2.c)) {
            return false;
        }
        if (!i.a(this.d, s2.d)) {
            return false;
        }
        return i.a((Object)this.e, (Object)s2.e);
    }

    public int hashCode() {
        Object object = this.a;
        int n2 = object == null ? 0 : object.hashCode();
        int n3 = n2 * 31;
        g g2 = this.b;
        int n4 = g2 == null ? 0 : g2.hashCode();
        int n5 = 31 * (n3 + n4);
        l<Throwable, q> l2 = this.c;
        int n6 = l2 == null ? 0 : l2.hashCode();
        int n7 = 31 * (n5 + n6);
        Object object2 = this.d;
        int n8 = object2 == null ? 0 : object2.hashCode();
        int n9 = 31 * (n7 + n8);
        Throwable throwable = this.e;
        int n10 = throwable == null ? 0 : throwable.hashCode();
        return n9 + n10;
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"CompletedContinuation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cancelHandler=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", onCancellation=");
        stringBuilder.append(this.c);
        stringBuilder.append(", idempotentResume=");
        stringBuilder.append(this.d);
        stringBuilder.append(", cancelCause=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

