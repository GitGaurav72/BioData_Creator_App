/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.a.c.b.a
 *  e.q.a.i
 *  e.q.a.j
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
 *  java.lang.reflect.Type
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 */
package e.q.a;

import e.q.a.i;
import e.q.a.j;
import e.q.a.m;
import e.q.a.r;
import e.q.a.v;
import e.q.a.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public abstract class h<C extends Collection<T>, T>
extends m<C> {
    public static final m.a a = new m.a(){

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public m<?> a(Type type, Set<? extends Annotation> set, y y2) {
            i i2;
            Class class_ = e.p.a.c.b.a.a0((Type)type);
            if (!set.isEmpty()) {
                return null;
            }
            if (class_ != List.class && class_ != Collection.class) {
                if (class_ != Set.class) return null;
                i2 = new j(y2.b(e.p.a.c.b.a.C((Type)type, Collection.class)));
                do {
                    return i2.d();
                    break;
                } while (true);
            }
            i2 = new i(y2.b(e.p.a.c.b.a.C((Type)type, Collection.class)));
            return i2.d();
        }
    };
    public final m<T> b;

    public h(m m2, a a2) {
        this.b = m2;
    }

    public C g(r r2) {
        C c2 = this.h();
        r2.a();
        while (r2.r()) {
            c2.add(this.b.a(r2));
        }
        r2.k();
        return c2;
    }

    public abstract C h();

    public void i(v v2, C c2) {
        v2.a();
        for (Object object : c2) {
            this.b.f(v2, object);
        }
        v2.o();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(".collection()");
        return stringBuilder.toString();
    }

}

