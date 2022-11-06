/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.a.c.b.a
 *  e.q.a.m
 *  e.q.a.m$a
 *  e.q.a.r
 *  e.q.a.v
 *  e.q.a.y
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Array
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Set
 */
package e.q.a;

import e.q.a.m;
import e.q.a.r;
import e.q.a.v;
import e.q.a.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

public final class a
extends m<Object> {
    public static final m.a a = new m.a(){

        public m<?> a(Type type, Set<? extends Annotation> set, y y2) {
            Object object = type instanceof GenericArrayType ? ((GenericArrayType)type).getGenericComponentType() : (type instanceof Class ? ((Class)type).getComponentType() : null);
            if (object == null) {
                return null;
            }
            if (!set.isEmpty()) {
                return null;
            }
            return new a(e.p.a.c.b.a.a0((Type)object), (m<Object>)y2.b(object)).d();
        }
    };
    public final Class<?> b;
    public final m<Object> c;

    public a(Class<?> class_, m<Object> m2) {
        this.b = class_;
        this.c = m2;
    }

    public Object a(r r2) {
        ArrayList arrayList = new ArrayList();
        r2.a();
        while (r2.r()) {
            arrayList.add(this.c.a(r2));
        }
        r2.k();
        Object object = Array.newInstance(this.b, (int)arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            Array.set((Object)object, (int)i2, (Object)arrayList.get(i2));
        }
        return object;
    }

    public void f(v v2, Object object) {
        v2.a();
        int n = Array.getLength((Object)object);
        for (int i2 = 0; i2 < n; ++i2) {
            this.c.f(v2, Array.get((Object)object, (int)i2));
        }
        v2.o();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append(".array()");
        return stringBuilder.toString();
    }

}

