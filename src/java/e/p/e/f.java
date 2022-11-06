/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.e.c0
 *  e.p.e.h0.a
 *  e.p.e.h0.b
 *  e.p.e.h0.c
 *  e.p.e.j
 *  java.lang.Float
 *  java.lang.Number
 *  java.lang.Object
 */
package e.p.e;

import e.p.e.c0;
import e.p.e.h0.a;
import e.p.e.h0.b;
import e.p.e.h0.c;
import e.p.e.j;

public class f
extends c0<Number> {
    public f(j j2) {
    }

    public Object a(a a2) {
        if (a2.Y() == b.s) {
            a2.R();
            return null;
        }
        return Float.valueOf((float)((float)a2.F()));
    }

    public void b(c c2, Object object) {
        Number number = (Number)object;
        if (number == null) {
            c2.w();
            return;
        }
        j.a((double)number.floatValue());
        c2.L(number);
    }
}

