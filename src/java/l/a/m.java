/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  l.a.a1
 *  l.a.b2.e
 *  l.a.j
 */
package l.a;

import k.q;
import k.u.d;
import l.a.a1;
import l.a.b2.e;
import l.a.c1;
import l.a.f1;
import l.a.j;

public final class m
extends c1 {
    public final j<?> o;

    public m(j<?> j2) {
        this.o = j2;
    }

    public void w(Throwable throwable) {
        j<?> j2 = this.o;
        Throwable throwable2 = j2.r((a1)this.x());
        boolean bl = !j2.v() ? false : ((e)j2.p).m(throwable2);
        if (bl) {
            return;
        }
        j2.n(throwable2);
        j2.p();
    }
}

