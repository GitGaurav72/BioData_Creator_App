/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Type
 *  java.lang.reflect.WildcardType
 *  java.util.Collection
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.w
 *  k.s.r
 */
package k.b0.x.b.x0.c.m1.b;

import e.s.a.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import k.b0.x.b.x0.c.m1.b.e0;
import k.b0.x.b.x0.c.m1.b.g0;
import k.b0.x.b.x0.c.m1.b.j;
import k.b0.x.b.x0.c.m1.b.u;
import k.b0.x.b.x0.e.a.q0.a0;
import k.b0.x.b.x0.e.a.q0.w;
import k.s.r;
import k.x.c.i;

public final class j0
extends g0
implements a0 {
    public final WildcardType a;
    public final Collection<k.b0.x.b.x0.e.a.q0.a> b;

    public j0(WildcardType wildcardType) {
        i.e((Object)wildcardType, "reflectType");
        this.a = wildcardType;
        this.b = r.k;
    }

    @Override
    public boolean F() {
        Object[] arrobject = this.a.getUpperBounds();
        i.d(arrobject, "reflectType.upperBounds");
        return true ^ i.a(a.Y0((Object[])arrobject), Object.class);
    }

    @Override
    public Type M() {
        return this.a;
    }

    public Collection<k.b0.x.b.x0.e.a.q0.a> getAnnotations() {
        return this.b;
    }

    public boolean l() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public w y() {
        Class class_;
        void var5_11;
        Object[] arrobject = this.a.getUpperBounds();
        Object[] arrobject2 = this.a.getLowerBounds();
        if (arrobject.length > 1) throw new UnsupportedOperationException(i.k("Wildcard types with many bounds are not yet supported: ", (Object)this.a));
        if (arrobject2.length > 1) throw new UnsupportedOperationException(i.k("Wildcard types with many bounds are not yet supported: ", (Object)this.a));
        if (arrobject2.length == 1) {
            Class class_2;
            i.d(arrobject2, "lowerBounds");
            Object object = a.N3((Object[])arrobject2);
            i.d(object, "lowerBounds.single()");
            Type type = (Type)object;
            i.e((Object)type, "type");
            boolean bl = type instanceof Class;
            if (bl && (class_2 = (Class)type).isPrimitive()) {
                return new e0(class_2);
            }
            if (!(type instanceof GenericArrayType || bl && ((Class)type).isArray())) {
                if (type instanceof WildcardType) {
                    j0 j02 = new j0((WildcardType)type);
                    return var5_11;
                } else {
                    u u2 = new u(type);
                }
                return var5_11;
            } else {
                j j2 = new j(type);
            }
            do {
                return var5_11;
                break;
            } while (true);
        }
        if (arrobject.length != 1) return null;
        i.d(arrobject, "upperBounds");
        Type type = (Type)a.N3((Object[])arrobject);
        if (i.a((Object)type, Object.class)) return null;
        i.d((Object)type, "ub");
        i.e((Object)type, "type");
        boolean bl = type instanceof Class;
        if (bl && (class_ = (Class)type).isPrimitive()) {
            return new e0(class_);
        }
        if (!(type instanceof GenericArrayType || bl && ((Class)type).isArray())) {
            if (type instanceof WildcardType) {
                j0 j03 = new j0((WildcardType)type);
                return var5_11;
            }
            u u3 = new u(type);
            return var5_11;
        }
        j j3 = new j(type);
        return var5_11;
    }
}

