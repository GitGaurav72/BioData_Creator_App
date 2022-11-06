/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  l.a.j
 */
package l.a;

import e.s.a.a;
import k.q;
import l.a.e1;
import l.a.f1;
import l.a.g1;
import l.a.j;
import l.a.t;

public final class p1<T>
extends e1 {
    public final j<T> o;

    public p1(j<? super T> j2) {
        this.o = j2;
    }

    public void w(Throwable throwable) {
        Object object;
        j<T> j2;
        Object object2 = this.x().F();
        if (object2 instanceof t) {
            j2 = this.o;
            object = a.A0((Throwable)((t)object2).b);
        } else {
            j2 = this.o;
            object = g1.a(object2);
        }
        j2.resumeWith(object);
    }
}

