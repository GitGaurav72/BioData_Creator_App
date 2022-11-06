/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.Throwable
 *  l.a.z1.f
 *  l.a.z1.o
 */
package l.a.z1;

import e.s.a.a;
import k.q;
import l.a.c;
import l.a.z1.f;
import l.a.z1.g;
import l.a.z1.o;

public class n<E>
extends g<E>
implements o<E> {
    public n(k.u.f f2, f<E> f3) {
        super(f2, f3, true, true);
    }

    @Override
    public void Y(Throwable throwable, boolean bl) {
        if (!this.m.e(throwable) && !bl) {
            a.V1((k.u.f)this.l, (Throwable)throwable);
        }
    }

    @Override
    public void Z(Object object) {
        (q)object;
        a.Q(this.m, null, (int)1, null);
    }

    @Override
    public boolean b() {
        return c.super.b();
    }
}

