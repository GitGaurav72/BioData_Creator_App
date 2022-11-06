/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  k.x.b.l
 *  k.x.b.p
 *  l.a.a2.g.c
 *  l.a.z1.f
 */
package l.a.a2.g;

import java.util.Objects;
import k.q;
import k.u.j.a.i;
import k.x.b.p;
import l.a.a2.d;
import l.a.a2.e;
import l.a.a2.g.b;
import l.a.a2.g.c;
import l.a.b0;
import l.a.c0;
import l.a.x;
import l.a.z1.f;
import l.a.z1.l;
import l.a.z1.m;
import l.a.z1.n;
import l.a.z1.s;

@k.u.j.a.e(c="kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f="ChannelFlow.kt", l={123}, m="invokeSuspend")
public final class a
extends i
implements p<b0, k.u.d<? super q>, Object> {
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ d<T> m;
    public final /* synthetic */ c<T> n;

    public a(d<? super T> d2, c<T> c2, k.u.d<? super a> d3) {
        this.m = d2;
        this.n = c2;
        super(2, d3);
    }

    public final k.u.d<q> create(Object object, k.u.d<?> d2) {
        a a2 = new a(this.m, this.n, d2);
        a2.l = object;
        return a2;
    }

    public Object invoke(Object object, Object object2) {
        b0 b02 = (b0)object;
        k.u.d d2 = (k.u.d)object2;
        a a2 = new a(this.m, this.n, d2);
        a2.l = b02;
        return a2.invokeSuspend(q.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        k.u.i.a a2 = k.u.i.a.k;
        int n2 = this.k;
        if (n2 != 0) {
            if (n2 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            e.s.a.a.e4((Object)object);
            return q.a;
        } else {
            void var14_20;
            e.s.a.a.e4((Object)object);
            b0 b02 = (b0)this.l;
            d<T> d2 = this.m;
            c<T> c2 = this.n;
            k.u.f f2 = c2.a;
            int n3 = c2.b;
            if (n3 == -3) {
                n3 = -2;
            }
            l.a.z1.e e2 = c2.c;
            c0 c02 = c0.m;
            b b2 = new b(c2, null);
            l.a.z1.e e3 = l.a.z1.e.k;
            if (n3 != -2) {
                if (n3 != -1) {
                    if (n3 != 0) {
                        if (n3 != Integer.MAX_VALUE) {
                            if (n3 == 1 && e2 == l.a.z1.e.l) {
                                l l2 = new l(null);
                            } else {
                                l.a.z1.d d3 = new l.a.z1.d(n3, e2, null);
                            }
                        } else {
                            m m2 = new m(null);
                        }
                    } else if (e2 == e3) {
                        s s2 = new s(null);
                    } else {
                        l.a.z1.d d4 = new l.a.z1.d(1, e2, null);
                    }
                } else {
                    boolean bl = false;
                    if (e2 == e3) {
                        bl = true;
                    }
                    if (!bl) throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
                    l l3 = new l(null);
                }
            } else {
                int n4;
                if (e2 == e3) {
                    Objects.requireNonNull((Object)f.j);
                    n4 = f.a.b;
                } else {
                    n4 = 1;
                }
                l.a.z1.d d5 = new l.a.z1.d(n4, e2, null);
            }
            n n5 = new n(x.a(b02, f2), var14_20);
            n5.a0(c02, n5, b2);
            this.k = 1;
            Object object2 = e.a(d2, n5, true, (k.u.d<? super q>)((Object)this));
            if (object2 != a2) {
                object2 = q.a;
            }
            if (object2 != a2) return q.a;
            return a2;
        }
    }
}

