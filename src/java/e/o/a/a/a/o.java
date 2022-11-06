/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.o.a.a.a.b
 *  e.o.a.a.a.b0
 *  e.o.a.a.a.g0
 *  java.lang.Object
 *  java.util.Objects
 *  java.util.function.Function
 */
package e.o.a.a.a;

import e.o.a.a.a.b;
import e.o.a.a.a.b0;
import e.o.a.a.a.g0;
import java.util.Objects;
import java.util.function.Function;

public final class o
implements Function {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o(g0 g02, boolean[] arrbl, boolean bl, Function function, boolean bl2, Object object) {
        this.a = g02;
        this.b = arrbl;
        this.c = bl;
        this.d = function;
        this.e = bl2;
        this.f = object;
    }

    public final Object apply(Object object) {
        g0 g02 = this.a;
        boolean[] arrbl = this.b;
        boolean bl = this.c;
        Function function = this.d;
        boolean bl2 = this.e;
        Object object2 = this.f;
        Objects.requireNonNull((Object)g02);
        arrbl[0] = true;
        if (bl && g02.b()) {
            function = new b((b0)g02, function, bl2);
        }
        return function.apply(object2);
    }
}

