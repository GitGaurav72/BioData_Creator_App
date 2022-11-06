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

public final class h
implements BiFunction {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ h(g0 g02, Object object, Object object2, Object[] arrobject) {
        this.a = g02;
        this.b = object;
        this.c = object2;
        this.d = arrobject;
    }

    public final Object apply(Object object, Object object2) {
        g0 g02 = this.a;
        Object object3 = this.b;
        Object[] arrobject = this.d;
        Objects.requireNonNull((Object)g02);
        if (object2.equals(object3)) {
            Objects.requireNonNull((Object)((a0)g02.n));
            arrobject[0] = object2;
            object2 = null;
        }
        return object2;
    }
}

