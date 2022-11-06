/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Member
 *  java.lang.reflect.Modifier
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 *  java.util.ArrayList
 *  java.util.List
 *  k.b0.x.b.x0.e.a.q0.z
 *  k.s.i
 *  k.s.r
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import k.b0.x.b.x0.c.m1.b.a0;
import k.b0.x.b.x0.c.m1.b.h0;
import k.b0.x.b.x0.e.a.q0.k;
import k.b0.x.b.x0.e.a.q0.z;
import k.s.r;
import k.x.c.i;

public final class v
extends a0
implements k {
    public final Constructor<?> a;

    public v(Constructor<?> constructor) {
        i.e(constructor, "member");
        this.a = constructor;
    }

    @Override
    public Member M() {
        return this.a;
    }

    public List<h0> getTypeParameters() {
        TypeVariable[] arrtypeVariable = this.a.getTypeParameters();
        i.d(arrtypeVariable, "member.typeParameters");
        ArrayList arrayList = new ArrayList(arrtypeVariable.length);
        for (TypeVariable typeVariable : arrtypeVariable) {
            arrayList.add((Object)new h0(typeVariable));
        }
        return arrayList;
    }

    @Override
    public List<z> getValueParameters() {
        Annotation[][] arrannotation;
        Object[] arrobject = this.a.getGenericParameterTypes();
        i.d(arrobject, "types");
        boolean bl = arrobject.length == 0;
        if (bl) {
            return r.k;
        }
        Class class_ = this.a.getDeclaringClass();
        if (class_.getDeclaringClass() != null && !Modifier.isStatic((int)class_.getModifiers())) {
            arrobject = (Type[])k.s.i.j((Object[])arrobject, (int)1, (int)arrobject.length);
        }
        if ((arrannotation = this.a.getParameterAnnotations()).length >= arrobject.length) {
            if (arrannotation.length > arrobject.length) {
                i.d(arrannotation, "annotations");
                arrannotation = (Annotation[][])k.s.i.j((Object[])arrannotation, (int)(arrannotation.length - arrobject.length), (int)arrannotation.length);
            }
            i.d(arrobject, "realTypes");
            i.d(arrannotation, "realAnnotations");
            return this.N((Type[])arrobject, arrannotation, this.a.isVarArgs());
        }
        throw new IllegalStateException(i.k("Illegal generic signature: ", this.a));
    }
}

