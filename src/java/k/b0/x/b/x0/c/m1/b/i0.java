/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.util.Collection
 *  k.b0.x.b.x0.c.m1.b.w
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.w
 *  k.b0.x.b.x0.e.a.q0.z
 */
package k.b0.x.b.x0.c.m1.b;

import e.e.a.a.a;
import java.lang.annotation.Annotation;
import java.util.Collection;
import k.b0.x.b.x0.c.m1.b.g0;
import k.b0.x.b.x0.c.m1.b.w;
import k.b0.x.b.x0.e.a.q0.z;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.x.c.i;

public final class i0
extends w
implements z {
    public final g0 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public i0(g0 g02, Annotation[] arrannotation, String string, boolean bl) {
        i.e(g02, "type");
        i.e(arrannotation, "reflectAnnotations");
        this.a = g02;
        this.b = arrannotation;
        this.c = string;
        this.d = bl;
    }

    public k.b0.x.b.x0.e.a.q0.w b() {
        return this.a;
    }

    public k.b0.x.b.x0.e.a.q0.a e(c c2) {
        i.e(c2, "fqName");
        return e.s.a.a.S0((Annotation[])this.b, (c)c2);
    }

    public boolean f() {
        return this.d;
    }

    public Collection getAnnotations() {
        return e.s.a.a.h1((Annotation[])this.b);
    }

    public e getName() {
        String string = this.c;
        if (string == null) {
            return null;
        }
        return e.k(string);
    }

    public boolean l() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        a.B(i0.class, (StringBuilder)stringBuilder, (String)": ");
        String string = this.d ? "vararg " : "";
        stringBuilder.append(string);
        String string2 = this.c;
        e e2 = string2 == null ? null : e.k(string2);
        stringBuilder.append((Object)e2);
        stringBuilder.append(": ");
        stringBuilder.append((Object)this.a);
        return stringBuilder.toString();
    }
}

