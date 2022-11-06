/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Type
 *  java.lang.reflect.WildcardType
 *  java.util.Collection
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.w
 *  k.s.r
 */
package k.b0.x.b.x0.c.m1.b;

import e.e.a.a.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import k.b0.x.b.x0.c.m1.b.e0;
import k.b0.x.b.x0.c.m1.b.g0;
import k.b0.x.b.x0.c.m1.b.j0;
import k.b0.x.b.x0.c.m1.b.u;
import k.b0.x.b.x0.e.a.q0.f;
import k.b0.x.b.x0.e.a.q0.w;
import k.s.r;
import k.x.c.i;

public final class j
extends g0
implements f {
    public final Type a;
    public final g0 b;
    public final Collection<k.b0.x.b.x0.e.a.q0.a> c;

    /*
     * Enabled aggressive block sorting
     */
    public j(Type type) {
        block17 : {
            void var9_7;
            block15 : {
                void var8_11;
                block16 : {
                    Class class_;
                    block13 : {
                        Type type2;
                        boolean bl;
                        block14 : {
                            Class class_2;
                            i.e((Object)type, "reflectType");
                            this.a = type;
                            if (!(type instanceof GenericArrayType)) break block13;
                            type2 = ((GenericArrayType)type).getGenericComponentType();
                            i.d((Object)type2, "genericComponentType");
                            i.e((Object)type2, "type");
                            bl = type2 instanceof Class;
                            if (!bl || !(class_2 = (Class)type2).isPrimitive()) break block14;
                            e0 e02 = new e0(class_2);
                            break block15;
                        }
                        if (!(type2 instanceof GenericArrayType || bl && ((Class)type2).isArray())) {
                            if (type2 instanceof WildcardType) {
                                j0 j02 = new j0((WildcardType)type2);
                            } else {
                                u u2 = new u(type2);
                            }
                        } else {
                            j j2 = new j(type2);
                        }
                        break block16;
                    }
                    if (!(type instanceof Class) || !(class_ = (Class)type).isArray()) break block17;
                    Class class_3 = class_.getComponentType();
                    i.d((Object)class_3, "getComponentType()");
                    i.e((Object)class_3, "type");
                    if (class_3.isPrimitive()) {
                        e0 e03 = new e0(class_3);
                    } else if (!(class_3 instanceof GenericArrayType) && !class_3.isArray()) {
                        if (class_3 instanceof WildcardType) {
                            j0 j03 = new j0((WildcardType)class_3);
                        } else {
                            u u3 = new u((Type)class_3);
                        }
                    } else {
                        j j3 = new j((Type)class_3);
                    }
                }
                void var9_6 = var8_11;
            }
            this.b = var9_7;
            this.c = r.k;
            return;
        }
        StringBuilder stringBuilder = a.t((String)"Not an array type (");
        stringBuilder.append((Object)type.getClass());
        stringBuilder.append("): ");
        stringBuilder.append((Object)type);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public Type M() {
        return this.a;
    }

    public Collection<k.b0.x.b.x0.e.a.q0.a> getAnnotations() {
        return this.c;
    }

    public boolean l() {
        return false;
    }

    @Override
    public w m() {
        return this.b;
    }
}

