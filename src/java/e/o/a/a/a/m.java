/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.o.a.a.a.a0
 *  e.o.a.a.a.g0
 *  java.lang.Object
 *  java.util.Objects
 *  java.util.function.Function
 */
package e.o.a.a.a;

import e.o.a.a.a.a0;
import e.o.a.a.a.g0;
import e.o.a.a.a.x;
import java.util.Objects;
import java.util.function.Function;

public final class m
implements Function {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean[] d;

    public /* synthetic */ m(g0 g02, Object object, Object object2, boolean[] arrbl) {
        this.a = g02;
        this.b = object;
        this.c = object2;
        this.d = arrbl;
    }

    public final Object apply(Object object) {
        g0 g02 = this.a;
        Object object2 = this.c;
        boolean[] arrbl = this.d;
        Objects.requireNonNull((Object)((a0)g02.n));
        arrbl[0] = true;
        return object2;
    }
}

