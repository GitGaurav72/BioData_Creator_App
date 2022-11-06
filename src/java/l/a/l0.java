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
import l.a.g;
import l.a.k0;

public final class l0
extends g {
    public final k0 k;

    public l0(k0 k02) {
        this.k = k02;
    }

    public void b(Throwable throwable) {
        this.k.dispose();
    }

    public Object invoke(Object object) {
        (Throwable)object;
        this.k.dispose();
        return q.a;
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"DisposeOnCancel[");
        stringBuilder.append((Object)this.k);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

