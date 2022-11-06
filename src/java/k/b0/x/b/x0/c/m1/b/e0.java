/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Void
 *  java.lang.reflect.Type
 *  java.util.Collection
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.s.r
 *  kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
 *  kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.reflect.Type;
import java.util.Collection;
import k.b0.x.b.x0.c.m1.b.g0;
import k.b0.x.b.x0.e.a.q0.a;
import k.b0.x.b.x0.e.a.q0.u;
import k.s.r;
import k.x.c.i;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public final class e0
extends g0
implements u {
    public final Class<?> a;
    public final Collection<a> b;

    public e0(Class<?> class_) {
        i.e(class_, "reflectType");
        this.a = class_;
        this.b = r.k;
    }

    @Override
    public Type M() {
        return this.a;
    }

    @Override
    public PrimitiveType b() {
        if (i.a(this.a, (Object)Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get((String)this.a.getName()).getPrimitiveType();
    }

    public Collection<a> getAnnotations() {
        return this.b;
    }

    public boolean l() {
        return false;
    }
}

