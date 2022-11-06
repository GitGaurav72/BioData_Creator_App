/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.k.b.h$b
 *  k.b0.x.b.x0.l.h
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.StandardNames
 *  kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames
 */
package k.b0.x.b.x0.k.b;

import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.d;
import k.b0.x.b.x0.k.b.f;
import k.b0.x.b.x0.k.b.h;
import k.b0.x.b.x0.k.b.j;
import k.b0.x.b.x0.l.m;
import k.x.b.l;
import k.x.c.i;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;

public final class h {
    public static final h a;
    public static final Set<k.b0.x.b.x0.g.b> b;
    public final j c;
    public final l<a, e> d;

    public static {
        b = e.s.a.a.J3((Object)k.b0.x.b.x0.g.b.l(StandardNames.FqNames.cloneable.i()));
    }

    public h(j j2) {
        i.e(j2, "components");
        this.c = j2;
        this.d = j2.a.i(new b(this));
    }

    public static e a(h h2, k.b0.x.b.x0.g.b b2, f f2, int n2) {
        n2 & 2;
        Objects.requireNonNull((Object)h2);
        i.e(b2, "classId");
        return (e)h2.d.invoke((Object)new a(b2, null));
    }

    public static final class a {
        public final k.b0.x.b.x0.g.b a;
        public final f b;

        public a(k.b0.x.b.x0.g.b b2, f f2) {
            i.e(b2, "classId");
            this.a = b2;
            this.b = f2;
        }

        public boolean equals(Object object) {
            return object instanceof a && i.a(this.a, ((a)object).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

}

