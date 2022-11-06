/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  l.a.a1
 *  l.a.f1$c
 *  l.a.z1.f
 */
package l.a.z1;

import java.util.concurrent.CancellationException;
import k.q;
import k.u.d;
import l.a.a1;
import l.a.b1;
import l.a.c;
import l.a.f1;
import l.a.t;
import l.a.z1.f;
import l.a.z1.h;

public class g<E>
extends c<q>
implements f<E> {
    public final f<E> m;

    public g(k.u.f f2, f<E> f3, boolean bl, boolean bl2) {
        super(f2, bl, bl2);
        this.m = f3;
    }

    @Override
    public final void a(CancellationException cancellationException) {
        Object object = this.F();
        boolean bl = object instanceof t || object instanceof f1.c && (object).f();
        if (bl) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b1(((f1)this).s(), null, this);
        }
        this.n((Throwable)cancellationException);
    }

    public Object c(d<? super h<? extends E>> d2) {
        Object object = this.m.c(d2);
        return object;
    }

    public boolean e(Throwable throwable) {
        return this.m.e(throwable);
    }

    public Object h(E e2, d<? super q> d2) {
        return this.m.h(e2, d2);
    }

    public boolean i() {
        return this.m.i();
    }

    @Override
    public void n(Throwable throwable) {
        CancellationException cancellationException = f1.U(this, throwable, null, 1, null);
        this.m.a(cancellationException);
        this.m((Object)cancellationException);
    }
}

