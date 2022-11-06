/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.function.Supplier
 *  java.util.logging.Logger
 */
package e.o.a.a.a;

import e.o.a.a.a.j0.d;
import e.o.a.a.a.q;
import java.util.function.Supplier;
import java.util.logging.Logger;

public final class y<K, V> {
    public static final Logger a = Logger.getLogger((String)y.class.getName());
    public static final Supplier<d> b = q.a;
    public long c = -1L;
    public long d = -1L;
    public long e = -1L;
    public Supplier<d> f;

    public static /* varargs */ void b(boolean bl, String string, Object ... arrobject) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.format((String)string, (Object[])arrobject));
    }

    public static /* varargs */ void c(boolean bl, String string, Object ... arrobject) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.format((String)string, (Object[])arrobject));
    }

    public boolean a() {
        return this.f != null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(75);
        stringBuilder.append(y.class.getSimpleName());
        stringBuilder.append('{');
        int n2 = stringBuilder.length();
        if (this.c != -1L) {
            stringBuilder.append("maximumSize=");
            stringBuilder.append(this.c);
            stringBuilder.append(", ");
        }
        if (this.d != -1L) {
            stringBuilder.append("expireAfterWrite=");
            stringBuilder.append(this.d);
            stringBuilder.append("ns, ");
        }
        if (this.e != -1L) {
            stringBuilder.append("expireAfterAccess=");
            stringBuilder.append(this.e);
            stringBuilder.append("ns, ");
        }
        if (stringBuilder.length() > n2) {
            stringBuilder.deleteCharAt(-2 + stringBuilder.length());
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

