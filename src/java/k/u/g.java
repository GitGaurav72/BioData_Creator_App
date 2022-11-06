/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.u.c
 *  k.u.e
 *  k.u.e$a
 *  k.u.f$a
 *  k.u.h
 *  k.x.b.p
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.u;

import k.u.c;
import k.u.e;
import k.u.f;
import k.u.h;
import k.x.b.p;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class g
extends k
implements p<f, f.a, f> {
    public static final g k = new g();

    public g() {
        super(2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object invoke(Object object, Object object2) {
        f f2 = (f)object;
        f.a a2 = object2;
        i.e(f2, "acc");
        i.e((Object)a2, "element");
        f f3 = f2.minusKey(a2.getKey());
        h h2 = h.k;
        if (f3 == h2) {
            return a2;
        }
        e.a a3 = e.a.k;
        e e2 = (e)f3.get(a3);
        if (e2 == null) {
            return new c(f3, a2);
        }
        f f4 = f3.minusKey((f.b<?>)a3);
        if (f4 != h2) return new c((f)new c(f4, a2), e2);
        return new c((f)a2, e2);
    }
}

