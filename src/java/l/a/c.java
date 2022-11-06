/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  k.u.f$a
 *  k.x.b.p
 *  l.a.a1
 *  l.a.a1$a
 */
package l.a;

import e.s.a.a;
import k.g;
import k.u.d;
import k.u.f;
import k.x.b.p;
import k.x.c.a0;
import k.x.c.i;
import l.a.a1;
import l.a.b0;
import l.a.b2.q;
import l.a.b2.s;
import l.a.c0;
import l.a.f1;
import l.a.g1;
import l.a.t;

public abstract class c<T>
extends f1
implements a1,
d<T>,
b0 {
    public final f l;

    public c(f f2, boolean bl, boolean bl2) {
        super(bl2);
        if (bl) {
            this.I((a1)f2.get(a1.a.k));
        }
        this.l = f2.plus((f)((Object)this));
    }

    @Override
    public final void H(Throwable throwable) {
        a.V1((f)this.l, (Throwable)throwable);
    }

    @Override
    public String L() {
        return super.L();
    }

    @Override
    public final void O(Object object) {
        if (object instanceof t) {
            t t2 = (t)object;
            this.Y(t2.b, t2.a());
            return;
        }
        this.Z(object);
    }

    public void X(Object object) {
        this.l(object);
    }

    public void Y(Throwable throwable, boolean bl) {
    }

    public void Z(T t2) {
    }

    public final <R> void a0(c0 c02, R r2, p<? super R, ? super d<? super T>, ? extends Object> p2) {
        block13 : {
            int n2 = c02.ordinal();
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 == 3) {
                            Object object;
                            f f2;
                            Object object2;
                            block12 : {
                                i.e(this, "completion");
                                f2 = this.l;
                                object = s.b(f2, null);
                                if (p2 == null) break block12;
                                a0.b(p2, 2);
                                object2 = p2.invoke(r2, (Object)this);
                                s.a(f2, object);
                                if (object2 == k.u.i.a.k) break block13;
                            }
                            try {
                                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                            }
                            catch (Throwable throwable) {
                                try {
                                    s.a(f2, object);
                                    throw throwable;
                                }
                                catch (Throwable throwable2) {
                                    object2 = a.A0((Throwable)throwable2);
                                }
                            }
                            this.resumeWith(object2);
                            return;
                        }
                        throw new g();
                    }
                    i.e(p2, "<this>");
                    i.e(this, "completion");
                    a.i2((d)a.u0(p2, r2, (d)this)).resumeWith(k.q.a);
                    return;
                }
            } else {
                a.V3(p2, r2, (d)this, null, (int)4);
            }
        }
    }

    @Override
    public boolean b() {
        return super.b();
    }

    @Override
    public final f getContext() {
        return this.l;
    }

    @Override
    public f getCoroutineContext() {
        return this.l;
    }

    @Override
    public final void resumeWith(Object object) {
        Object object2 = this.K(a.r4((Object)object, null));
        if (object2 == g1.b) {
            return;
        }
        this.X(object2);
    }

    @Override
    public String s() {
        return i.k(this.getClass().getSimpleName(), " was cancelled");
    }
}

