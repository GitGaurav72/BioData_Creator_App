/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Constructor
 *  k.b0.f
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.reflect.Constructor;
import k.b0.f;
import k.b0.x.b.x0.c.m1.b.v;
import k.x.c.g;
import k.x.c.i;
import k.x.c.w;

public final class l
extends g
implements k.x.b.l<Constructor<?>, v> {
    public static final l k = new l();

    public l() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final f getOwner() {
        return w.a(v.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    public Object invoke(Object object) {
        Constructor constructor = (Constructor)object;
        i.e((Object)constructor, "p0");
        return new v(constructor);
    }
}

