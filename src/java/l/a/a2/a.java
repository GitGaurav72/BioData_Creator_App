/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k.u.h
 *  k.u.j.a.c
 *  k.x.b.p
 *  l.a.a2.b
 *  l.a.z1.o
 */
package l.a.a2;

import k.q;
import k.u.d;
import k.u.f;
import k.u.h;
import k.u.j.a.c;
import k.u.j.a.e;
import k.x.b.p;
import l.a.a2.b;
import l.a.z1.o;

public final class a<T>
extends b<T> {
    public final p<o<? super T>, d<? super q>, Object> e;

    public a(p p2, f f2, int n2, l.a.z1.e e2, int n3) {
        Object object = (n3 & 2) != 0 ? h.k : null;
        if ((n3 & 4) != 0) {
            n2 = -2;
        }
        int n4 = n3 & 8;
        l.a.z1.e e3 = null;
        if (n4 != 0) {
            e3 = l.a.z1.e.k;
        }
        super(p2, (f)object, n2, e3);
        this.e = p2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object b(o<? super T> var1_1, d<? super q> var2_2) {
        if (!(var2_2 instanceof a)) ** GOTO lbl-1000
        var3_3 = var2_2;
        var8_4 = var3_3.n;
        if ((var8_4 & Integer.MIN_VALUE) != 0) {
            var3_3.n = var8_4 + Integer.MIN_VALUE;
        } else lbl-1000: // 2 sources:
        {
            var3_3 = new c(var2_2){
                public Object k;
                public /* synthetic */ Object l;
                public int n;

                public final Object invokeSuspend(Object object) {
                    this.l = object;
                    this.n = Integer.MIN_VALUE | this.n;
                    return this.b(null, (d<q>)((Object)this));
                }
            };
        }
        var4_5 = var3_3.l;
        var5_6 = k.u.i.a.k;
        var6_7 = var3_3.n;
        if (var6_7 != 0) {
            if (var6_7 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            var1_1 = (o)var3_3.k;
            e.s.a.a.e4((Object)var4_5);
        } else {
            e.s.a.a.e4((Object)var4_5);
            var3_3.k = var1_1;
            var3_3.n = 1;
            var7_8 = this.d.invoke((Object)var1_1, (Object)var3_3);
            if (var7_8 != var5_6) {
                var7_8 = q.a;
            }
            if (var7_8 == var5_6) {
                return var5_6;
            }
        }
        if (var1_1.i() == false) throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return q.a;
    }

}

