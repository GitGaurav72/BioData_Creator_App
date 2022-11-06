/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.p.a.c.b.a
 *  e.q.a.m
 *  e.q.a.m$a
 *  e.q.a.o
 *  e.q.a.r
 *  e.q.a.v
 *  e.q.a.w
 *  e.q.a.y
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Properties
 *  java.util.Set
 */
package e.q.a;

import e.q.a.m;
import e.q.a.o;
import e.q.a.r;
import e.q.a.s;
import e.q.a.v;
import e.q.a.w;
import e.q.a.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public final class x<K, V>
extends m<Map<K, V>> {
    public static final m.a a = new m.a(){

        public m<?> a(Type type, Set<? extends Annotation> set, y y2) {
            Type type2;
            if (!set.isEmpty()) {
                return null;
            }
            Class class_ = e.p.a.c.b.a.a0((Type)type);
            if (class_ != Map.class) {
                return null;
            }
            Type[] arrtype = type == Properties.class ? new Type[]{String.class, String.class} : ((type2 = e.p.a.c.b.a.c0((Type)type, (Class)class_, Map.class)) instanceof ParameterizedType ? ((ParameterizedType)type2).getActualTypeArguments() : new Type[]{Object.class, Object.class});
            return new x(y2, arrtype[0], arrtype[1]).d();
        }
    };
    public final m<K> b;
    public final m<V> c;

    public x(y y2, Type type, Type type2) {
        this.b = y2.b(type);
        this.c = y2.b(type2);
    }

    public Object a(r r2) {
        w w2 = new w();
        r2.b();
        while (r2.r()) {
            Object object;
            Object object2;
            Object object3;
            s s2 = (s)r2;
            if (s2.r()) {
                s2.y = s2.Y();
                s2.v = 11;
            }
            if ((object2 = w2.put(object = this.b.a(r2), object3 = this.c.a(r2))) == null) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Map key '");
            stringBuilder.append(object);
            stringBuilder.append("' has multiple values at path ");
            stringBuilder.append(r2.q());
            stringBuilder.append(": ");
            stringBuilder.append(object2);
            stringBuilder.append(" and ");
            stringBuilder.append(object3);
            throw new o(stringBuilder.toString());
        }
        r2.o();
        return w2;
    }

    public void f(v v2, Object object) {
        Map map = (Map)object;
        v2.b();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                int n2 = v2.w();
                if (n2 != 5 && n2 != 3) {
                    throw new IllegalStateException("Nesting problem.");
                }
                v2.p = true;
                this.b.f(v2, entry.getKey());
                this.c.f(v2, entry.getValue());
                continue;
            }
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"Map key is null at ");
            stringBuilder.append(v2.r());
            throw new o(stringBuilder.toString());
        }
        v2.q();
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"JsonAdapter(");
        stringBuilder.append(this.b);
        stringBuilder.append("=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

}

