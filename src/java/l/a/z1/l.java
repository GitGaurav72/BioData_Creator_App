/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.locks.ReentrantLock
 *  k.x.b.l
 *  l.a.b2.i$b
 *  l.a.z1.a
 *  l.a.z1.c
 *  l.a.z1.i
 *  l.a.z1.p
 */
package l.a.z1;

import java.util.concurrent.locks.ReentrantLock;
import k.q;
import l.a.b2.i;
import l.a.b2.w;
import l.a.z1.a;
import l.a.z1.b;
import l.a.z1.c;
import l.a.z1.i;
import l.a.z1.p;
import l.a.z1.r;

public class l<E>
extends a<E> {
    public final ReentrantLock n = new ReentrantLock();
    public Object o = b.a;

    public l(k.x.b.l<? super E, q> l2) {
        super(l2);
    }

    public String f() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"(value=");
        stringBuilder.append(this.o);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object m(E e2) {
        ReentrantLock reentrantLock;
        block9 : {
            r r2;
            reentrantLock = this.n;
            reentrantLock.lock();
            i i2 = this.g();
            if (i2 == null) {
                if (this.o != b.a) break block9;
            } else {
                reentrantLock.unlock();
                return i2;
            }
            while ((r2 = this.n()) != null) {
                boolean bl = r2 instanceof i;
                if (!bl) break block10;
            }
            {
                block10 : {
                    reentrantLock.unlock();
                    return r2;
                }
                l.a.b2.q q2 = r2.g(e2, null);
                if (q2 == null) continue;
                reentrantLock.unlock();
                r2.f(e2);
                return r2.d();
            }
        }
        try {
            w w2 = this.w(e2);
            if (w2 != null) throw w2;
            l.a.b2.q q3 = b.b;
            return q3;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public boolean p(p<? super E> p2) {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            boolean bl = super.p(p2);
            return bl;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public final boolean q() {
        return false;
    }

    public final boolean r() {
        return this.o == b.a;
    }

    public void t(boolean bl) {
        ReentrantLock reentrantLock;
        w w2;
        block3 : {
            reentrantLock = this.n;
            reentrantLock.lock();
            w2 = this.w(b.a);
            super.t(bl);
            if (w2 != null) break block3;
            return;
        }
        throw w2;
        finally {
            reentrantLock.unlock();
        }
    }

    public Object v() {
        l.a.b2.q q2;
        ReentrantLock reentrantLock;
        Object object;
        block6 : {
            Object object2;
            block7 : {
                reentrantLock = this.n;
                reentrantLock.lock();
                object = this.o;
                q2 = b.a;
                if (object != q2) break block6;
                object2 = this.g();
                if (object2 != null) break block7;
                object2 = b.d;
            }
            return object2;
        }
        this.o = q2;
        reentrantLock.unlock();
        return object;
        finally {
            reentrantLock.unlock();
        }
    }

    public final w w(Object object) {
        k.x.b.l l2;
        Object object2 = this.o;
        w w2 = object2 == b.a ? null : ((l2 = ((c)this).l) == null ? null : e.s.a.a.E((k.x.b.l)l2, (Object)object2, null));
        this.o = object;
        return w2;
    }
}

