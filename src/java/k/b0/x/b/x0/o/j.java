/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package k.b0.x.b.x0.o;

import k.x.c.i;

public class j {
    public static final Object a = new Object(){

        public String toString() {
            return "NULL_VALUE";
        }
    };

    public static <V> V a(Object object) {
        j.b(object);
        if (object == a) {
            object = null;
        }
        return (V)object;
    }

    public static <V> V b(Object object) {
        if (object instanceof b) {
            Throwable throwable = ((b)object).a;
            if (throwable != null) {
                i.e((Object)throwable, "e");
                throw throwable;
            }
            b.a(1);
            throw null;
        }
        return (V)object;
    }

    public static final class b {
        public final Throwable a;

        public b(Throwable throwable, a a2) {
            if (throwable != null) {
                this.a = throwable;
                return;
            }
            b.a(0);
            throw null;
        }

        public static /* synthetic */ void a(int n2) {
            String string = n2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            int n3 = n2 != 1 ? 3 : 2;
            Object[] arrobject = new Object[n3];
            arrobject[0] = n2 != 1 ? "throwable" : "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            arrobject[1] = n2 != 1 ? "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper" : "getThrowable";
            if (n2 != 1) {
                arrobject[2] = "<init>";
            }
            String string2 = String.format((String)string, (Object[])arrobject);
            Object object = n2 != 1 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
            throw object;
        }

        public String toString() {
            return this.a.toString();
        }
    }

}

