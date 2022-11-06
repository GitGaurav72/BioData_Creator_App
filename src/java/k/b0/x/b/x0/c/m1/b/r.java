/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 *  k.b0.f
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.reflect.Method;
import k.b0.f;
import k.b0.x.b.x0.c.m1.b.b0;
import k.x.b.l;
import k.x.c.g;
import k.x.c.i;
import k.x.c.w;

public final class r
extends g
implements l<Method, b0> {
    public static final r k = new r();

    public r() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final f getOwner() {
        return w.a(b0.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    public Object invoke(Object object) {
        Method method = (Method)object;
        i.e((Object)method, "p0");
        return new b0(method);
    }
}

