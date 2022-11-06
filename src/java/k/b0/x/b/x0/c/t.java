/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.f
 *  k.x.b.l
 */
package k.b0.x.b.x0.c;

import k.b0.f;
import k.b0.x.b.x0.g.b;
import k.x.b.l;
import k.x.c.g;
import k.x.c.i;
import k.x.c.w;

public final class t
extends g
implements l<b, b> {
    public static final t k = new t();

    public t() {
        super(1);
    }

    public final String getName() {
        return "getOuterClassId";
    }

    public final f getOwner() {
        return w.a(b.class);
    }

    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    public Object invoke(Object object) {
        b b2 = (b)object;
        i.e(b2, "p0");
        return b2.g();
    }
}

