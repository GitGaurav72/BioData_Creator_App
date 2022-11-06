/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 *  k.b0.f
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.reflect.Field;
import k.b0.f;
import k.b0.x.b.x0.c.m1.b.y;
import k.x.b.l;
import k.x.c.g;
import k.x.c.i;
import k.x.c.w;

public final class n
extends g
implements l<Field, y> {
    public static final n k = new n();

    public n() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final f getOwner() {
        return w.a(y.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    public Object invoke(Object object) {
        Field field = (Field)object;
        i.e((Object)field, "p0");
        return new y(field);
    }
}

