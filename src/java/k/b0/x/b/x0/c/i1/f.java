/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.m.f0
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.c.i1;

import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.x.b.l;
import k.x.c.i;
import k.x.c.k;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class f
extends k
implements l<d0, f0> {
    public final /* synthetic */ KotlinBuiltIns k;

    public f(KotlinBuiltIns kotlinBuiltIns) {
        this.k = kotlinBuiltIns;
        super(1);
    }

    public Object invoke(Object object) {
        d0 d02 = (d0)object;
        i.e((Object)d02, "module");
        m0 m02 = d02.getBuiltIns().getArrayType(n1.k, (f0)this.k.getStringType());
        i.d(m02, "module.builtIns.getArray\u2026ce.INVARIANT, stringType)");
        return m02;
    }
}

