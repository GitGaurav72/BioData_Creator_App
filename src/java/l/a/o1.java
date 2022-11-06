/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package l.a;

import e.e.a.a.a;
import k.q;
import l.a.b2.i;
import l.a.e;

public final class o1
extends e {
    public final i k;

    public o1(i i2) {
        this.k = i2;
    }

    public void b(Throwable throwable) {
        this.k.t();
    }

    public Object invoke(Object object) {
        (Throwable)object;
        this.k.t();
        return q.a;
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"RemoveOnCancel[");
        stringBuilder.append((Object)this.k);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

