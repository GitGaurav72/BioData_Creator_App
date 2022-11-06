/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Field
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Member
 *  java.lang.reflect.Type
 *  java.lang.reflect.WildcardType
 *  k.b0.x.b.x0.e.a.q0.w
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import k.b0.x.b.x0.c.m1.b.a0;
import k.b0.x.b.x0.c.m1.b.e0;
import k.b0.x.b.x0.c.m1.b.g0;
import k.b0.x.b.x0.c.m1.b.j;
import k.b0.x.b.x0.c.m1.b.j0;
import k.b0.x.b.x0.c.m1.b.u;
import k.b0.x.b.x0.e.a.q0.n;
import k.b0.x.b.x0.e.a.q0.w;
import k.x.c.i;

public final class y
extends a0
implements n {
    public final Field a;

    public y(Field field) {
        i.e((Object)field, "member");
        this.a = field;
    }

    @Override
    public boolean C() {
        return this.a.isEnumConstant();
    }

    @Override
    public boolean K() {
        return false;
    }

    @Override
    public Member M() {
        return this.a;
    }

    @Override
    public w b() {
        Class class_;
        Type type = this.a.getGenericType();
        i.d((Object)type, "member.genericType");
        i.e((Object)type, "type");
        boolean bl = type instanceof Class;
        if (bl && (class_ = (Class)type).isPrimitive()) {
            return new e0(class_);
        }
        g0 g02 = !(type instanceof GenericArrayType || bl && ((Class)type).isArray()) ? (type instanceof WildcardType ? new j0((WildcardType)type) : new u(type)) : new j(type);
        return g02;
    }
}

