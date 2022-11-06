/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.o.a.a.a.a0
 *  e.o.a.a.a.g0
 *  java.lang.Object
 *  java.util.Objects
 *  java.util.function.BiFunction
 */
package e.o.a.a.a;

import e.o.a.a.a.a0;
import e.o.a.a.a.g0;
import e.o.a.a.a.x;
import java.util.Objects;
import java.util.function.BiFunction;

public final class j
implements BiFunction {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object[] c;

    public /* synthetic */ j(g0 g02, Object object, Object[] arrobject) {
        this.a = g02;
        this.b = object;
        this.c = arrobject;
    }

    public final Object apply(Object object, Object object2) {
        g0 g02 = this.a;
        Object[] arrobject = this.c;
        Objects.requireNonNull((Object)((a0)g02.n));
        arrobject[0] = object2;
        return null;
    }
}

