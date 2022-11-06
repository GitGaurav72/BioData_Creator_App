/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Type
 *  java.util.Collection
 *  java.util.Iterator
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.w
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import k.b0.x.b.x0.e.a.q0.a;
import k.b0.x.b.x0.e.a.q0.w;
import k.b0.x.b.x0.g.b;
import k.b0.x.b.x0.g.c;
import k.x.c.i;

public abstract class g0
implements w {
    public abstract Type M();

    public a e(c c2) {
        Object object;
        block1 : {
            c c3;
            b b2;
            Object object2;
            i.e(this, "this");
            i.e(c2, "fqName");
            i.e(this, "this");
            i.e(c2, "fqName");
            Iterator iterator = this.getAnnotations().iterator();
            do {
                boolean bl = iterator.hasNext();
                object = null;
                if (!bl) break block1;
            } while (!i.a(c3 = (b2 = ((a)(object2 = iterator.next())).c()) == null ? null : b2.b(), c2));
            object = object2;
        }
        return (a)object;
    }

    public boolean equals(Object object) {
        return object instanceof g0 && i.a((Object)this.M(), (Object)((g0)object).M());
    }

    public int hashCode() {
        return this.M().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append((Object)this.M());
        return stringBuilder.toString();
    }
}

