/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  k.u.f$a
 *  l.a.w1
 */
package l.a;

import e.s.a.a;
import k.u.d;
import k.u.f;
import l.a.b2.p;
import l.a.b2.q;
import l.a.b2.s;
import l.a.w1;
import l.a.x;

public final class v1<T>
extends p<T> {
    public f n;
    public Object o;

    public v1(f f2, d<? super T> d2) {
        w1 w12 = w1.k;
        if (f2.get(w12) == null) {
            f2 = f2.plus((f)w12);
        }
        super(f2, d2);
    }

    @Override
    public void X(Object object) {
        f f2 = this.n;
        if (f2 != null) {
            s.a(f2, this.o);
            this.n = null;
            this.o = null;
        }
        Object object2 = a.j3((Object)object, this.m);
        d d2 = this.m;
        f f3 = d2.getContext();
        Object object3 = s.b(f3, null);
        q q2 = s.a;
        v1<?> v12 = null;
        if (object3 != q2) {
            v12 = x.b(d2, f3, object3);
        }
        try {
            this.m.resumeWith(object2);
            return;
        }
        finally {
            if (v12 == null || v12.b0()) {
                s.a(f3, object3);
            }
        }
    }

    public final boolean b0() {
        if (this.n == null) {
            return false;
        }
        this.n = null;
        this.o = null;
        return true;
    }
}

