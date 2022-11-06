/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 */
package k.x.c;

import java.util.Arrays;
import k.c;
import k.p;

public class i {
    public static boolean a(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public static void b(Object object, String string) {
        if (object != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(e.e.a.a.a.l((String)string, (String)" must not be null"));
        i.j(illegalStateException, i.class.getName());
        throw illegalStateException;
    }

    public static void c(Object object) {
        if (object != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        i.j(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void d(Object object, String string) {
        if (object != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(e.e.a.a.a.l((String)string, (String)" must not be null"));
        i.j(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void e(Object object, String string) {
        if (object != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i.h(string));
        i.j(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void f(Object object, String string) {
        if (object != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i.h(string));
        i.j(illegalArgumentException, i.class.getName());
        throw illegalArgumentException;
    }

    public static int g(int n2, int n3) {
        if (n2 < n3) {
            return -1;
        }
        return n2 != n3;
    }

    public static String h(String string) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String string2 = stackTraceElement.getClassName();
        String string3 = stackTraceElement.getMethodName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameter specified as non-null is null: method ");
        stringBuilder.append(string2);
        stringBuilder.append(".");
        stringBuilder.append(string3);
        stringBuilder.append(", parameter ");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static void i() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static <T extends Throwable> T j(T t2, String string) {
        Object[] arrobject = t2.getStackTrace();
        int n2 = arrobject.length;
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals((Object)arrobject[i2].getClassName())) continue;
            n3 = i2;
        }
        t2.setStackTrace((StackTraceElement[])Arrays.copyOfRange((Object[])arrobject, (int)(n3 + 1), (int)n2));
        return t2;
    }

    public static String k(String string, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public static void l() {
        c c2 = new c();
        i.j(c2, i.class.getName());
        throw c2;
    }

    public static void m(String string) {
        p p2 = new p(e.e.a.a.a.m((String)"lateinit property ", (String)string, (String)" has not been initialized"));
        i.j(p2, i.class.getName());
        throw p2;
    }

    public static class a {
    }

}

