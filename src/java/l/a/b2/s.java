/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  k.u.f$a
 *  k.x.b.p
 *  l.a.b2.s$a
 *  l.a.b2.s$b
 *  l.a.b2.s$c
 *  l.a.s1
 */
package l.a.b2;

import java.util.Objects;
import k.u.f;
import k.x.b.p;
import k.x.c.i;
import l.a.b2.q;
import l.a.b2.s;
import l.a.b2.v;
import l.a.s1;

public final class s {
    public static final q a = new q("NO_THREAD_ELEMENTS");
    public static final p<Object, f.a, Object> b = a.k;
    public static final p<s1<?>, f.a, s1<?>> c = b.k;
    public static final p<v, f.a, v> d = c.k;

    public static final void a(f f2, Object object) {
        if (object == a) {
            return;
        }
        if (object instanceof v) {
            v v2 = (v)object;
            int n2 = -1 + v2.c.length;
            if (n2 >= 0) {
                do {
                    int n3 = n2 - 1;
                    s1<Object> s12 = v2.c[n2];
                    i.c(s12);
                    s12.v(f2, v2.b[n2]);
                    if (n3 < 0) {
                        return;
                    }
                    n2 = n3;
                } while (true);
            }
        } else {
            s1<?> s13 = f2.fold(null, c);
            Objects.requireNonNull(s13, (String)"null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            s13.v(f2, object);
        }
    }

    public static final Object b(f f2, Object object) {
        Integer n2 = 0;
        if (object == null) {
            object = f2.fold(n2, b);
            i.c(object);
        }
        if (object == n2) {
            return a;
        }
        if (object instanceof Integer) {
            return f2.fold(new v(f2, ((Number)object).intValue()), d);
        }
        return ((s1)object).y(f2);
    }
}

