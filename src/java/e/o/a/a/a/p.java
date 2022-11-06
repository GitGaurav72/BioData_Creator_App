/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.o.a.a.a.d0
 *  e.o.a.a.a.g0
 *  java.lang.Object
 *  java.util.Objects
 *  java.util.function.BiFunction
 */
package e.o.a.a.a;

import e.o.a.a.a.d0;
import e.o.a.a.a.g0;
import java.util.Objects;
import java.util.function.BiFunction;

public final class p
implements BiFunction {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ BiFunction b;
    public final /* synthetic */ d0[] c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ p(g0 g02, BiFunction biFunction, d0[] arrd0, Object[] arrobject) {
        this.a = g02;
        this.b = biFunction;
        this.c = arrd0;
        this.d = arrobject;
    }

    public final Object apply(Object object, Object object2) {
        g0 g02 = this.a;
        BiFunction biFunction = this.b;
        d0[] arrd0 = this.c;
        Objects.requireNonNull((Object)g02);
        Object object3 = biFunction.apply(object, object2);
        if (object2 == null && object3 == null) {
            return null;
        }
        d0 d02 = object3 == null ? d0.k : d0.l;
        arrd0[0] = d02;
        return object3;
    }
}

