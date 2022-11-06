/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package l.a;

import e.s.a.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k.u.d;
import l.a.b2.f;
import l.a.b2.p;
import l.a.g1;
import l.a.t;

public final class h0<T>
extends p<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n;
    private volatile /* synthetic */ int _decision;

    public static {
        n = AtomicIntegerFieldUpdater.newUpdater(h0.class, (String)"_decision");
    }

    public h0(k.u.f f2, d<? super T> d2) {
        super(f2, d2);
        this._decision = 0;
    }

    @Override
    public void X(Object object) {
        boolean bl;
        block3 : {
            do {
                int n2;
                if ((n2 = this._decision) == 0) continue;
                if (n2 == 1) {
                    bl = false;
                    break block3;
                }
                throw new IllegalStateException("Already resumed".toString());
            } while (!n.compareAndSet((Object)this, 0, 2));
            bl = true;
        }
        if (bl) {
            return;
        }
        f.b(a.i2(this.m), a.j3((Object)object, this.m), null, 2);
    }

    public final Object b0() {
        boolean bl;
        block4 : {
            do {
                int n2;
                if ((n2 = this._decision) == 0) continue;
                if (n2 == 2) {
                    bl = false;
                    break block4;
                }
                throw new IllegalStateException("Already suspended".toString());
            } while (!n.compareAndSet((Object)this, 0, 1));
            bl = true;
        }
        if (bl) {
            return k.u.i.a.k;
        }
        Object object = g1.a(this.F());
        if (!(object instanceof t)) {
            return object;
        }
        throw ((t)object).b;
    }

    @Override
    public void l(Object object) {
        this.X(object);
    }
}

