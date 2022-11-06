/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.locks.ReentrantLock
 *  k.s.i
 *  k.x.b.l
 *  l.a.b2.i$b
 *  l.a.z1.a
 *  l.a.z1.c
 *  l.a.z1.i
 *  l.a.z1.p
 *  l.a.z1.t
 */
package l.a.z1;

import java.util.concurrent.locks.ReentrantLock;
import k.g;
import k.q;
import k.x.b.l;
import l.a.b2.i;
import l.a.b2.w;
import l.a.z1.a;
import l.a.z1.b;
import l.a.z1.c;
import l.a.z1.e;
import l.a.z1.i;
import l.a.z1.p;
import l.a.z1.r;
import l.a.z1.t;

public class d<E>
extends a<E> {
    public final int n;
    public final e o;
    public final ReentrantLock p;
    public Object[] q;
    public int r;
    private volatile /* synthetic */ int size;

    public d(int n2, e e2, l<? super E, q> l2) {
        super(l2);
        this.n = n2;
        this.o = e2;
        int n3 = 1;
        if (n2 < n3) {
            n3 = 0;
        }
        if (n3 != 0) {
            this.p = new ReentrantLock();
            Object[] arrobject = new Object[Math.min((int)n2, (int)8)];
            k.s.i.o((Object[])arrobject, (Object)b.a, (int)0, (int)0, (int)6);
            this.q = arrobject;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(e.e.a.a.a.g((String)"ArrayChannel capacity must be at least 1, but ", (int)n2, (String)" was specified").toString());
    }

    public Object d(t t2) {
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        try {
            Object object = c.super.d(t2);
            return object;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public String f() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"(buffer:capacity=");
        stringBuilder.append(this.n);
        stringBuilder.append(",size=");
        stringBuilder.append(this.size);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        return this.size == this.n && this.o == e.k;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object m(E e2) {
        ReentrantLock reentrantLock;
        int n2;
        block7 : {
            l.a.b2.q q2;
            r r2;
            block13 : {
                block11 : {
                    i i2;
                    block9 : {
                        block12 : {
                            block10 : {
                                reentrantLock = this.p;
                                reentrantLock.lock();
                                n2 = this.size;
                                i2 = this.g();
                                if (i2 != null) break block9;
                                if (n2 >= this.n) break block10;
                                this.size = n2 + 1;
                                break block11;
                            }
                            int n3 = this.o.ordinal();
                            if (n3 == 0) break block12;
                            if (n3 == 1) break block11;
                            if (n3 != 2) throw new g();
                            q2 = b.b;
                            break block13;
                        }
                        q2 = b.c;
                        break block13;
                    }
                    reentrantLock.unlock();
                    return i2;
                }
                q2 = null;
            }
            if (q2 != null) {
                reentrantLock.unlock();
                return q2;
            }
            if (n2 != 0) break block7;
            while ((r2 = this.n()) != null) {
                if (!(r2 instanceof i)) break block8;
                this.size = n2;
            }
            {
                block8 : {
                    reentrantLock.unlock();
                    return r2;
                }
                if (r2.g(e2, null) == null) continue;
                this.size = n2;
                reentrantLock.unlock();
                r2.f(e2);
                return r2.d();
            }
        }
        try {
            this.w(n2, e2);
            l.a.b2.q q3 = b.b;
            return q3;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public boolean p(p<? super E> p2) {
        ReentrantLock reentrantLock = this.p;
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
        return this.size == 0;
    }

    public boolean s() {
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        try {
            boolean bl = super.s();
            return bl;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t(boolean bl) {
        l l2 = ((c)this).l;
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        int n2 = this.size;
        w w2 = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = this.q[this.r];
            if (l2 != null && object != b.a) {
                w2 = e.s.a.a.E((l)l2, (Object)object, w2);
            }
            Object[] arrobject = this.q;
            int n3 = this.r;
            arrobject[n3] = b.a;
            this.r = (n3 + 1) % arrobject.length;
        }
        this.size = 0;
        super.t(bl);
        if (w2 != null) throw w2;
        return;
    }

    public Object v() {
        t t2;
        int n2;
        ReentrantLock reentrantLock;
        Object object;
        boolean bl;
        Object object2;
        block15 : {
            block13 : {
                Object object3;
                block14 : {
                    reentrantLock = this.p;
                    reentrantLock.lock();
                    n2 = this.size;
                    if (n2 != 0) break block13;
                    object3 = this.g();
                    if (object3 != null) break block14;
                    object3 = b.d;
                }
                return object3;
            }
            Object[] arrobject = this.q;
            int n3 = this.r;
            object = arrobject[n3];
            arrobject[n3] = null;
            this.size = n2 - 1;
            object2 = b.d;
            int n4 = this.n;
            t2 = null;
            bl = false;
            if (n2 != n4) break block15;
            t t3 = null;
            do {
                t t4;
                block17 : {
                    block16 : {
                        t4 = this.o();
                        if (t4 != null) break block16;
                        t2 = t3;
                        bl = false;
                        break;
                    }
                    if (t4.z(null) == null) break block17;
                    object2 = t4.x();
                    bl = true;
                    t2 = t4;
                    break;
                }
                t4.A();
                t3 = t4;
                continue;
                break;
            } while (true);
        }
        if (object2 != b.d && !(object2 instanceof i)) {
            this.size = n2;
            Object[] arrobject = this.q;
            arrobject[(n2 + this.r) % arrobject.length] = object2;
        }
        this.r = (1 + this.r) % this.q.length;
        reentrantLock.unlock();
        if (bl) {
            k.x.c.i.c((Object)t2);
            t2.w();
        }
        return object;
        finally {
            reentrantLock.unlock();
        }
    }

    public final void w(int n2, E e2) {
        int n3 = this.n;
        if (n2 < n3) {
            Object[] arrobject = this.q;
            if (n2 >= arrobject.length) {
                int n4 = Math.min((int)(2 * arrobject.length), (int)n3);
                Object[] arrobject2 = new Object[n4];
                if (n2 > 0) {
                    int n5 = 0;
                    do {
                        int n6 = n5 + 1;
                        Object[] arrobject3 = this.q;
                        arrobject2[n5] = arrobject3[(n5 + this.r) % arrobject3.length];
                        if (n6 >= n2) break;
                        n5 = n6;
                    } while (true);
                }
                k.s.i.n((Object[])arrobject2, (Object)b.a, (int)n2, (int)n4);
                this.q = arrobject2;
                this.r = 0;
            }
            Object[] arrobject4 = this.q;
            arrobject4[(n2 + this.r) % arrobject4.length] = e2;
            return;
        }
        Object[] arrobject = this.q;
        int n7 = this.r;
        arrobject[n7 % arrobject.length] = null;
        arrobject[(n2 + n7) % arrobject.length] = e2;
        this.r = (n7 + 1) % arrobject.length;
    }
}

