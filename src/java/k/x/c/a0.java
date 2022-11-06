/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 *  k.a
 *  k.x.b.a
 *  k.x.b.b
 *  k.x.b.c
 *  k.x.b.d
 *  k.x.b.e
 *  k.x.b.f
 *  k.x.b.g
 *  k.x.b.h
 *  k.x.b.i
 *  k.x.b.j
 *  k.x.b.k
 *  k.x.b.l
 *  k.x.b.m
 *  k.x.b.n
 *  k.x.b.o
 *  k.x.b.p
 *  k.x.b.q
 *  k.x.b.r
 *  k.x.b.s
 *  k.x.b.t
 *  k.x.b.u
 *  k.x.b.v
 *  k.x.b.w
 *  k.x.c.b0.c
 *  k.x.c.f
 */
package k.x.c;

import java.util.Set;
import k.x.b.b;
import k.x.b.d;
import k.x.b.e;
import k.x.b.g;
import k.x.b.h;
import k.x.b.j;
import k.x.b.k;
import k.x.b.l;
import k.x.b.m;
import k.x.b.n;
import k.x.b.o;
import k.x.b.p;
import k.x.b.q;
import k.x.b.r;
import k.x.b.s;
import k.x.b.t;
import k.x.b.u;
import k.x.b.v;
import k.x.b.w;
import k.x.c.b0.a;
import k.x.c.b0.c;
import k.x.c.f;
import k.x.c.i;

public class a0 {
    public static Set a(Object object) {
        if (object instanceof a && !(object instanceof c)) {
            a0.c(object, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            Set set = (Set)object;
            return set;
        }
        catch (ClassCastException classCastException) {
            i.j(classCastException, a0.class.getName());
            throw classCastException;
        }
    }

    public static Object b(Object object, int n2) {
        if (object != null) {
            int n3;
            boolean bl = object instanceof k.a;
            int n4 = 1;
            if (!bl || (n3 = object instanceof f ? ((f)object).getArity() : (object instanceof k.x.b.a ? 0 : (object instanceof l ? n4 : (object instanceof p ? 2 : (object instanceof q ? 3 : (object instanceof r ? 4 : (object instanceof s ? 5 : (object instanceof t ? 6 : (object instanceof u ? 7 : (object instanceof v ? 8 : (object instanceof w ? 9 : (object instanceof b ? 10 : (object instanceof k.x.b.c ? 11 : (object instanceof d ? 12 : (object instanceof e ? 13 : (object instanceof k.x.b.f ? 14 : (object instanceof g ? 15 : (object instanceof h ? 16 : (object instanceof k.x.b.i ? 17 : (object instanceof j ? 18 : (object instanceof k ? 19 : (object instanceof m ? 20 : (object instanceof n ? 21 : (object instanceof o ? 22 : -1)))))))))))))))))))))))) != n2) {
                n4 = 0;
            }
            if (n4 != 0) {
                return object;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.jvm.functions.Function");
            stringBuilder.append(n2);
            a0.c(object, stringBuilder.toString());
            throw null;
        }
        return object;
    }

    public static void c(Object object, String string) {
        String string2 = object == null ? "null" : object.getClass().getName();
        ClassCastException classCastException = new ClassCastException(e.e.a.a.a.m((String)string2, (String)" cannot be cast to ", (String)string));
        i.j(classCastException, a0.class.getName());
        throw classCastException;
    }
}

