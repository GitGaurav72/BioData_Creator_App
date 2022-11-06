/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  k.b0.d
 *  k.b0.f
 *  k.b0.g
 *  k.b0.i
 *  k.b0.l
 *  k.x.c.d
 *  k.x.c.f
 *  k.x.c.g
 *  k.x.c.k
 *  k.x.c.l
 *  k.x.c.o
 *  k.x.c.p
 */
package k.x.c;

import java.lang.reflect.Type;
import k.b0.i;
import k.x.c.d;
import k.x.c.f;
import k.x.c.g;
import k.x.c.k;
import k.x.c.l;
import k.x.c.o;
import k.x.c.p;

public class x {
    public k.b0.g a(g g2) {
        return g2;
    }

    public k.b0.d b(Class class_) {
        return new d(class_);
    }

    public k.b0.f c(Class class_, String string) {
        return new o(class_, string);
    }

    public i d(l l2) {
        return l2;
    }

    public k.b0.l e(p p2) {
        return p2;
    }

    public String f(f f2) {
        String string = f2.getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        return string;
    }

    public String g(k k2) {
        return this.f((f)k2);
    }
}

