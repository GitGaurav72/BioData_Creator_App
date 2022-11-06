/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Member
 *  java.lang.reflect.Method
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 *  java.lang.reflect.WildcardType
 *  java.util.ArrayList
 *  java.util.List
 *  k.b0.x.b.x0.c.m1.b.g
 *  k.b0.x.b.x0.c.m1.b.i
 *  k.b0.x.b.x0.c.m1.b.t
 *  k.b0.x.b.x0.c.m1.b.x
 *  k.b0.x.b.x0.c.m1.b.z
 *  k.b0.x.b.x0.e.a.q0.w
 *  k.b0.x.b.x0.e.a.q0.z
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import k.b0.x.b.x0.c.m1.b.a0;
import k.b0.x.b.x0.c.m1.b.e0;
import k.b0.x.b.x0.c.m1.b.g;
import k.b0.x.b.x0.c.m1.b.g0;
import k.b0.x.b.x0.c.m1.b.h0;
import k.b0.x.b.x0.c.m1.b.i;
import k.b0.x.b.x0.c.m1.b.j;
import k.b0.x.b.x0.c.m1.b.j0;
import k.b0.x.b.x0.c.m1.b.t;
import k.b0.x.b.x0.c.m1.b.u;
import k.b0.x.b.x0.c.m1.b.x;
import k.b0.x.b.x0.c.m1.b.z;
import k.b0.x.b.x0.e.a.q0.b;
import k.b0.x.b.x0.e.a.q0.q;
import k.b0.x.b.x0.e.a.q0.w;
import k.b0.x.b.x0.g.e;

public final class b0
extends a0
implements q {
    public final Method a;

    public b0(Method method) {
        k.x.c.i.e((Object)method, "member");
        this.a = method;
    }

    @Override
    public boolean H() {
        k.x.c.i.e(this, "this");
        return this.O() != null;
    }

    @Override
    public Member M() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public b O() {
        Object object = this.a.getDefaultValue();
        if (object == null) {
            return null;
        }
        k.x.c.i.e(object, "value");
        Class class_ = object.getClass();
        k.x.c.i.e((Object)class_, "<this>");
        if (Enum.class.isAssignableFrom(class_)) {
            return new x(null, (Enum)object);
        }
        if (object instanceof Annotation) {
            return new g(null, (Annotation)object);
        }
        if (object instanceof Object[]) {
            return new i(null, (Object[])object);
        }
        if (!(object instanceof Class)) return new z(null, object);
        return new t(null, (Class)object);
    }

    @Override
    public w getReturnType() {
        Class class_;
        Type type = this.a.getGenericReturnType();
        k.x.c.i.d((Object)type, "member.genericReturnType");
        k.x.c.i.e((Object)type, "type");
        boolean bl = type instanceof Class;
        if (bl && (class_ = (Class)type).isPrimitive()) {
            return new e0(class_);
        }
        g0 g02 = !(type instanceof GenericArrayType || bl && ((Class)type).isArray()) ? (type instanceof WildcardType ? new j0((WildcardType)type) : new u(type)) : new j(type);
        return g02;
    }

    public List<h0> getTypeParameters() {
        TypeVariable[] arrtypeVariable = this.a.getTypeParameters();
        k.x.c.i.d(arrtypeVariable, "member.typeParameters");
        ArrayList arrayList = new ArrayList(arrtypeVariable.length);
        for (TypeVariable typeVariable : arrtypeVariable) {
            arrayList.add((Object)new h0(typeVariable));
        }
        return arrayList;
    }

    @Override
    public List<k.b0.x.b.x0.e.a.q0.z> getValueParameters() {
        Type[] arrtype = this.a.getGenericParameterTypes();
        k.x.c.i.d(arrtype, "member.genericParameterTypes");
        Annotation[][] arrannotation = this.a.getParameterAnnotations();
        k.x.c.i.d(arrannotation, "member.parameterAnnotations");
        return this.N(arrtype, arrannotation, this.a.isVarArgs());
    }
}

