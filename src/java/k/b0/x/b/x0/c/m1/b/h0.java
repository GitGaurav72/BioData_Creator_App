/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.AnnotatedElement
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  k.b0.x.b.x0.c.m1.b.h
 *  k.b0.x.b.x0.c.m1.b.w
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.s.i
 *  k.s.r
 */
package k.b0.x.b.x0.c.m1.b;

import e.e.a.a.a;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k.b0.x.b.x0.c.m1.b.h;
import k.b0.x.b.x0.c.m1.b.u;
import k.b0.x.b.x0.c.m1.b.w;
import k.b0.x.b.x0.e.a.q0.x;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.s.r;
import k.x.c.i;

public final class h0
extends w
implements h,
x {
    public final TypeVariable<?> a;

    public h0(TypeVariable<?> typeVariable) {
        i.e(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    public AnnotatedElement a() {
        TypeVariable<?> typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement)typeVariable;
        }
        return null;
    }

    public k.b0.x.b.x0.e.a.q0.a e(c c2) {
        return e.s.a.a.R0((h)this, (c)c2);
    }

    public boolean equals(Object object) {
        return object instanceof h0 && i.a(this.a, ((h0)object).a);
    }

    public Collection getAnnotations() {
        return e.s.a.a.g1((h)this);
    }

    public e getName() {
        e e2 = e.l(this.a.getName());
        i.d(e2, "identifier(typeVariable.name)");
        return e2;
    }

    public Collection getUpperBounds() {
        Type[] arrtype = this.a.getBounds();
        i.d(arrtype, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(arrtype.length);
        for (Type type : arrtype) {
            arrayList.add((Object)new u(type));
        }
        u u2 = (u)k.s.i.V((List)arrayList);
        Type type = u2 == null ? null : u2.a;
        if (i.a((Object)type, Object.class)) {
            arrayList = r.k;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean l() {
        e.s.a.a.o2((h)this);
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        a.B(h0.class, (StringBuilder)stringBuilder, (String)": ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}

