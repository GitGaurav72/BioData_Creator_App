/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.f
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.k
 *  k.x.b.p
 *  k.x.c.b
 */
package k.b0.x.b.x0.m.p1;

import k.b0.f;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.p1.k;
import k.x.b.p;
import k.x.c.b;
import k.x.c.g;
import k.x.c.i;
import k.x.c.w;

public final class u
extends g
implements p<f0, f0, Boolean> {
    public u(Object object) {
        super(2, object);
    }

    public final String getName() {
        return "equalTypes";
    }

    public final f getOwner() {
        return w.a(k.class);
    }

    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public Object invoke(Object object, Object object2) {
        f0 f02 = (f0)object;
        f0 f03 = (f0)object2;
        i.e((Object)f02, "p0");
        i.e((Object)f03, "p1");
        return ((k)this.receiver).b(f02, f03);
    }
}

