/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.c1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.c1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.p1.d;
import k.x.c.i;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class q0
extends c1 {
    public final f0 a;

    public q0(KotlinBuiltIns kotlinBuiltIns) {
        i.e((Object)kotlinBuiltIns, "kotlinBuiltIns");
        m0 m02 = kotlinBuiltIns.getNullableAnyType();
        i.d(m02, "kotlinBuiltIns.nullableAnyType");
        this.a = m02;
    }

    public n1 a() {
        return n1.m;
    }

    public f0 b() {
        return this.a;
    }

    public boolean c() {
        return true;
    }

    public b1 refine(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }
}

