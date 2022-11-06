/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k.x.b.p
 *  l.a.a2.g.c
 *  l.a.z1.o
 */
package l.a.a2.g;

import e.s.a.a;
import k.q;
import k.u.d;
import k.u.j.a.e;
import k.u.j.a.i;
import k.x.b.p;
import l.a.a2.g.c;
import l.a.z1.o;

@e(c="kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f="ChannelFlow.kt", l={60}, m="invokeSuspend")
public final class b
extends i
implements p<o<? super T>, d<? super q>, Object> {
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c<T> m;

    public b(c<T> c2, d<? super b> d2) {
        this.m = c2;
        super(2, d2);
    }

    public final d<q> create(Object object, d<?> d2) {
        b b2 = new b(this.m, d2);
        b2.l = object;
        return b2;
    }

    public Object invoke(Object object, Object object2) {
        o o2 = (o)object;
        d d2 = (d)object2;
        b b2 = new b(this.m, d2);
        b2.l = o2;
        return b2.invokeSuspend(q.a);
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
            a.e4((Object)object);
            return q.a;
        } else {
            a.e4((Object)object);
            o o2 = (o)this.l;
            c<T> c2 = this.m;
            this.k = 1;
            if (c2.b(o2, (d)((Object)this)) != a2) return q.a;
            return a2;
        }
    }
}

