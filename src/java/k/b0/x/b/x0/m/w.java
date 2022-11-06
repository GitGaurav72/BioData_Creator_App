/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.r1.f
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.m;

import e.s.a.a;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.i.c;
import k.b0.x.b.x0.i.i;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.r1.f;
import k.b0.x.b.x0.m.z;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class w
extends z
implements f {
    public final h n;

    public w(KotlinBuiltIns kotlinBuiltIns, h h2) {
        k.x.c.i.e((Object)kotlinBuiltIns, "builtIns");
        k.x.c.i.e((Object)h2, "annotations");
        m0 m02 = kotlinBuiltIns.getNothingType();
        k.x.c.i.d(m02, "builtIns.nothingType");
        m0 m03 = kotlinBuiltIns.getNullableAnyType();
        k.x.c.i.d(m03, "builtIns.nullableAnyType");
        super(m02, m03);
        this.n = h2;
    }

    @Override
    public boolean U() {
        return false;
    }

    public f0 V(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }

    public m1 X(boolean bl) {
        return this;
    }

    public m1 Y(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }

    public m1 Z(h h2) {
        k.x.c.i.e((Object)h2, "newAnnotations");
        return new w(a.k1((f0)this.m), h2);
    }

    @Override
    public m0 a0() {
        return this.m;
    }

    @Override
    public String b0(c c2, i i2) {
        k.x.c.i.e(c2, "renderer");
        k.x.c.i.e(i2, "options");
        return "dynamic";
    }

    @Override
    public h getAnnotations() {
        return this.n;
    }
}

