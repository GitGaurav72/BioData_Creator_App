/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.List
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.j.v.a.b
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 *  k.s.r
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.j.v.a;

import e.e.a.a.a;
import java.util.Collection;
import java.util.List;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.v.a.b;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.p1.h;
import k.b0.x.b.x0.m.y0;
import k.s.r;
import k.x.c.i;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class c
implements b {
    public final b1 a;
    public h b;

    public c(b1 b12) {
        i.e((Object)b12, "projection");
        this.a = b12;
        b12.a();
    }

    public b1 a() {
        return this.a;
    }

    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns kotlinBuiltIns = this.a.b().T().getBuiltIns();
        i.d((Object)kotlinBuiltIns, "projection.type.constructor.builtIns");
        return kotlinBuiltIns;
    }

    public List<z0> getParameters() {
        return r.k;
    }

    public Collection<f0> getSupertypes() {
        Object object = this.a.a() == n1.m ? this.a.b() : this.getBuiltIns().getNullableAnyType();
        i.d(object, "if (projection.projectio\u2026 builtIns.nullableAnyType");
        return e.s.a.a.N2((Object)object);
    }

    public boolean isDenotable() {
        return false;
    }

    public y0 refine(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        b1 b12 = this.a.refine(d2);
        i.d((Object)b12, "projection.refine(kotlinTypeRefiner)");
        return new c(b12);
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"CapturedTypeConstructor(");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

