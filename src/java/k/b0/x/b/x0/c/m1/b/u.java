/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 *  java.lang.reflect.WildcardType
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.m1.b.d
 *  k.b0.x.b.x0.c.m1.b.w
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.i
 *  k.b0.x.b.x0.e.a.q0.w
 *  k.s.r
 */
package k.b0.x.b.x0.c.m1.b;

import e.s.a.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.m1.b.d;
import k.b0.x.b.x0.c.m1.b.e0;
import k.b0.x.b.x0.c.m1.b.g0;
import k.b0.x.b.x0.c.m1.b.h0;
import k.b0.x.b.x0.c.m1.b.j;
import k.b0.x.b.x0.c.m1.b.j0;
import k.b0.x.b.x0.c.m1.b.s;
import k.b0.x.b.x0.c.m1.b.w;
import k.b0.x.b.x0.e.a.q0.i;
import k.b0.x.b.x0.g.c;
import k.s.r;

public final class u
extends g0
implements k.b0.x.b.x0.e.a.q0.j {
    public final Type a;
    public final i b;

    public u(Type type) {
        block5 : {
            w w2;
            block3 : {
                block4 : {
                    block2 : {
                        k.x.c.i.e((Object)type, "reflectType");
                        this.a = type;
                        if (!(type instanceof Class)) break block2;
                        w2 = new s((Class)type);
                        break block3;
                    }
                    if (!(type instanceof TypeVariable)) break block4;
                    w2 = new h0((TypeVariable)type);
                    break block3;
                }
                if (!(type instanceof ParameterizedType)) break block5;
                Type type2 = ((ParameterizedType)type).getRawType();
                Objects.requireNonNull((Object)type2, (String)"null cannot be cast to non-null type java.lang.Class<*>");
                w2 = new s((Class)type2);
            }
            this.b = w2;
            return;
        }
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Not a classifier type (");
        stringBuilder.append((Object)type.getClass());
        stringBuilder.append("): ");
        stringBuilder.append((Object)type);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public List<k.b0.x.b.x0.e.a.q0.w> B() {
        List list = d.c((Type)this.a);
        ArrayList arrayList = new ArrayList(a.U((Iterable)list, (int)10));
        for (Type type : list) {
            Class class_;
            g0 g02;
            k.x.c.i.e((Object)type, "type");
            boolean bl = type instanceof Class;
            if (bl && (class_ = (Class)type).isPrimitive()) {
                g02 = new e0(class_);
            } else {
                g0 g03 = !(type instanceof GenericArrayType || bl && ((Class)type).isArray()) ? (type instanceof WildcardType ? new j0((WildcardType)type) : new u(type)) : new j(type);
                g02 = g03;
            }
            arrayList.add((Object)g02);
        }
        return arrayList;
    }

    @Override
    public Type M() {
        return this.a;
    }

    @Override
    public k.b0.x.b.x0.e.a.q0.a e(c c2) {
        k.x.c.i.e(c2, "fqName");
        return null;
    }

    public Collection<k.b0.x.b.x0.e.a.q0.a> getAnnotations() {
        return r.k;
    }

    @Override
    public i i() {
        return this.b;
    }

    public boolean l() {
        return false;
    }

    @Override
    public String n() {
        return this.a.toString();
    }

    @Override
    public boolean t() {
        Type type = this.a;
        boolean bl = type instanceof Class;
        boolean bl2 = false;
        if (bl) {
            TypeVariable[] arrtypeVariable = ((Class)type).getTypeParameters();
            k.x.c.i.d(arrtypeVariable, "getTypeParameters()");
            boolean bl3 = arrtypeVariable.length == 0;
            boolean bl4 = bl3 ^ true;
            bl2 = false;
            if (bl4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    @Override
    public String u() {
        throw new UnsupportedOperationException(k.x.c.i.k("Type not found: ", (Object)this.a));
    }
}

