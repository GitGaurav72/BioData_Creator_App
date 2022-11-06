/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 */
package l.a.b2;

import e.s.a.a;
import k.u.j.a.d;
import l.a.b2.f;
import l.a.c;

public class p<T>
extends c<T>
implements d {
    public final k.u.d<T> m;

    public p(k.u.f f2, k.u.d<? super T> d2) {
        super(f2, true, true);
        this.m = d2;
    }

    @Override
    public final boolean J() {
        return true;
    }

    @Override
    public void X(Object object) {
        k.u.d<T> d2 = this.m;
        d2.resumeWith(a.j3((Object)object, d2));
    }

    @Override
    public final d getCallerFrame() {
        k.u.d<T> d2 = this.m;
        if (d2 instanceof d) {
            return (d)((Object)d2);
        }
        return null;
    }

    @Override
    public void l(Object object) {
        f.b(a.i2(this.m), a.j3((Object)object, this.m), null, 2);
    }
}

