/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  k.b0.f
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.j
 *  k.b0.x.b.x0.m.p1.k
 *  k.x.b.p
 *  k.x.c.b
 */
package k.b0.x.b.x0.m.p1;

import java.util.Objects;
import k.b0.f;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.p1.j;
import k.b0.x.b.x0.m.p1.k;
import k.b0.x.b.x0.m.p1.r;
import k.x.b.p;
import k.x.c.b;
import k.x.c.g;
import k.x.c.i;
import k.x.c.w;

public final class t
extends g
implements p<f0, f0, Boolean> {
    public t(Object object) {
        super(2, object);
    }

    public final String getName() {
        return "isStrictSupertype";
    }

    public final f getOwner() {
        return w.a(r.class);
    }

    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public Object invoke(Object object, Object object2) {
        f0 f02 = (f0)object;
        f0 f03 = (f0)object2;
        i.e((Object)f02, "p0");
        i.e((Object)f03, "p1");
        Objects.requireNonNull((Object)((r)this.receiver));
        Objects.requireNonNull((Object)j.b);
        k k2 = j.a.b;
        boolean bl = k2.d(f02, f03) && !k2.d(f03, f02);
        return bl;
    }
}

