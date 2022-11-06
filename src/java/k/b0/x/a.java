/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.f
 *  k.b0.x.b.x0.c.t0
 *  k.b0.x.b.x0.f.i
 *  k.x.b.p
 *  kotlin.Metadata
 */
package k.b0.x;

import k.b0.f;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.f.i;
import k.b0.x.b.x0.k.b.v;
import k.x.b.p;
import k.x.c.g;
import k.x.c.w;
import kotlin.Metadata;

@Metadata(k=3, mv={1, 6, 0}, xi=48)
public final class a
extends g
implements p<v, i, t0> {
    public static final a k = new a();

    public a() {
        super(2);
    }

    public final String getName() {
        return "loadFunction";
    }

    public final f getOwner() {
        return w.a(v.class);
    }

    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    public Object invoke(Object object, Object object2) {
        v v2 = (v)object;
        i i2 = (i)object2;
        k.x.c.i.e(v2, "p0");
        k.x.c.i.e((Object)i2, "p1");
        return v2.f(i2);
    }
}

