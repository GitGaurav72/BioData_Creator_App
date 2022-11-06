/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  l.a.z1.h$a
 */
package l.a.z1;

import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.a.z1.h;

public final class h<T> {
    public static final b a = new b(null);
    public final Object b;

    public /* synthetic */ h(Object object) {
        this.b = object;
    }

    public boolean equals(Object object) {
        Object object2 = this.b;
        if (!(object instanceof h)) {
            return false;
        }
        return i.a(object2, ((h)object).b);
    }

    public int hashCode() {
        Object object = this.b;
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }

    public String toString() {
        Object object = this.b;
        if (object instanceof a) {
            return object.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value(");
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static class c {
    }

}

