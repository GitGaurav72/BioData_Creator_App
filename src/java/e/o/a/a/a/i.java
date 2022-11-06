/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.o.a.a.a.g0
 *  java.lang.Object
 *  java.util.Objects
 *  java.util.function.BiFunction
 */
package e.o.a.a.a;

import e.o.a.a.a.g0;
import java.util.Objects;
import java.util.function.BiFunction;

public final class i
implements BiFunction {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ BiFunction c;

    public /* synthetic */ i(g0 g02, Object object, BiFunction biFunction) {
        this.a = g02;
        this.b = object;
        this.c = biFunction;
    }

    public final Object apply(Object object, Object object2) {
        g0 g02 = this.a;
        Object object3 = this.b;
        BiFunction biFunction = this.c;
        Objects.requireNonNull((Object)g02);
        if (object2 == null) {
            return object3;
        }
        return g02.a(biFunction, true, true, true).apply(object2, object3);
    }
}

