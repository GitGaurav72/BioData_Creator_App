/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  k.x.b.l
 *  kotlin.Metadata
 */
package k.b0;

import k.x.b.l;
import k.x.c.h;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(k=3, mv={1, 6, 0}, xi=48)
public final class u
extends h
implements l<Class<?>, Class<?>> {
    public static final u k = new u();

    public u() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    public Object invoke(Object object) {
        Class class_ = (Class)object;
        i.e((Object)class_, "p0");
        return class_.getComponentType();
    }
}

