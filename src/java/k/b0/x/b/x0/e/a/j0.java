/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.t0
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.e.a;

import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.e.a.f;
import k.b0.x.b.x0.j.y.a;
import k.x.b.l;
import k.x.c.i;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class j0
extends k.x.c.k
implements l<b, Boolean> {
    public static final j0 k = new j0();

    public j0() {
        super(1);
    }

    public Object invoke(Object object) {
        b b2 = (b)object;
        i.e((Object)b2, "it");
        t0 t02 = (t0)b2;
        i.e((Object)t02, "functionDescriptor");
        boolean bl = KotlinBuiltIns.isBuiltIn((k)t02);
        int n2 = 1;
        if (!bl || a.b((b)t02, false, new f(t02), n2) == null) {
            n2 = 0;
        }
        return (boolean)n2;
    }
}

