/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.List
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.e1
 *  k.b0.x.b.x0.c.j
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.o0
 *  k.b0.x.b.x0.c.q0
 *  k.b0.x.b.x0.c.t0
 *  k.b0.x.b.x0.c.v
 *  k.b0.x.b.x0.e.b.k
 *  k.b0.x.b.x0.e.b.v
 *  k.b0.x.b.x0.m.f0
 *  k.x.b.q
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.e.b;

import e.s.a.a;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.o0;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.e.b.i;
import k.b0.x.b.x0.e.b.j;
import k.b0.x.b.x0.e.b.k;
import k.b0.x.b.x0.e.b.t;
import k.b0.x.b.x0.e.b.u;
import k.b0.x.b.x0.e.b.v;
import k.b0.x.b.x0.e.b.w;
import k.b0.x.b.x0.j.g;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.j1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class q {
    public static final void a(StringBuilder stringBuilder, f0 f02) {
        stringBuilder.append((Object)q.d(f02));
    }

    public static String b(k.b0.x.b.x0.c.v v2, boolean bl, boolean bl2, int n2) {
        StringBuilder stringBuilder;
        block12 : {
            boolean bl3;
            block13 : {
                block14 : {
                    int n3 = n2 & 1;
                    bl3 = true;
                    if (n3 != 0) {
                        bl = bl3;
                    }
                    if ((n2 & 2) != 0) {
                        bl2 = bl3;
                    }
                    k.x.c.i.e((Object)v2, "<this>");
                    stringBuilder = new StringBuilder();
                    if (bl2) {
                        String string;
                        if (v2 instanceof k.b0.x.b.x0.c.j) {
                            string = "<init>";
                        } else {
                            string = v2.getName().e();
                            k.x.c.i.d(string, "name.asString()");
                        }
                        stringBuilder.append(string);
                    }
                    stringBuilder.append("(");
                    q0 q02 = v2.getExtensionReceiverParameter();
                    if (q02 != null) {
                        f0 f02 = q02.b();
                        k.x.c.i.d((Object)f02, "it.type");
                        q.a(stringBuilder, f02);
                    }
                    Iterator iterator = v2.getValueParameters().iterator();
                    while (iterator.hasNext()) {
                        f0 f03 = ((e1)iterator.next()).b();
                        k.x.c.i.d((Object)f03, "parameter.type");
                        q.a(stringBuilder, f03);
                    }
                    stringBuilder.append(")");
                    if (!bl) break block12;
                    k.x.c.i.e((Object)v2, "descriptor");
                    if (v2 instanceof k.b0.x.b.x0.c.j) break block13;
                    f0 f04 = v2.getReturnType();
                    k.x.c.i.c((Object)f04);
                    if (!KotlinBuiltIns.isUnit((f0)f04)) break block14;
                    f0 f05 = v2.getReturnType();
                    k.x.c.i.c((Object)f05);
                    if (!j1.h(f05) && !(v2 instanceof o0)) break block13;
                }
                bl3 = false;
            }
            if (bl3) {
                stringBuilder.append("V");
            } else {
                f0 f06 = v2.getReturnType();
                k.x.c.i.c((Object)f06);
                k.x.c.i.d((Object)f06, "returnType!!");
                q.a(stringBuilder, f06);
            }
        }
        String string = stringBuilder.toString();
        k.x.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String c(k.b0.x.b.x0.c.a a2) {
        k.x.c.i.e((Object)a2, "<this>");
        t t2 = t.a;
        if (g.t((k.b0.x.b.x0.c.k)a2)) {
            return null;
        }
        k.b0.x.b.x0.c.k k2 = a2.getContainingDeclaration();
        e e2 = k2 instanceof e ? (e)k2 : null;
        if (e2 == null) {
            return null;
        }
        if (e2.getName().l) {
            return null;
        }
        k.b0.x.b.x0.c.a a3 = a2.getOriginal();
        t0 t02 = a3 instanceof t0 ? (t0)a3 : null;
        if (t02 == null) {
            return null;
        }
        return a.L3((t)t2, (e)e2, (String)q.b((k.b0.x.b.x0.c.v)t02, false, false, 3));
    }

    public static final i d(f0 f02) {
        k.x.c.i.e((Object)f02, "<this>");
        return (i)a.T2((f0)f02, (j)k.a, (w)w.c, (u)v.a, k.b0.x.b.x0.o.g.b);
    }
}

