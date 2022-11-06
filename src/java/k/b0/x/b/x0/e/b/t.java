/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.LinkedHashSet
 *  java.util.Objects
 *  java.util.Set
 */
package k.b0.x.b.x0.e.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import k.x.c.i;

public final class t {
    public static final t a = new t();

    public final /* varargs */ String[] a(String ... arrstring) {
        i.e(arrstring, "signatures");
        ArrayList arrayList = new ArrayList(arrstring.length);
        for (String string : arrstring) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<init>(");
            stringBuilder.append(string);
            stringBuilder.append(")V");
            arrayList.add((Object)stringBuilder.toString());
        }
        Object[] arrobject = arrayList.toArray((Object[])new String[0]);
        Objects.requireNonNull((Object)arrobject, (String)"null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[])arrobject;
    }

    public final /* varargs */ Set<String> b(String string, String ... arrstring) {
        i.e(string, "internalName");
        i.e(arrstring, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String string2 : arrstring) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append('.');
            stringBuilder.append(string2);
            linkedHashSet.add((Object)stringBuilder.toString());
        }
        return linkedHashSet;
    }

    public final /* varargs */ Set<String> c(String string, String ... arrstring) {
        i.e(string, "name");
        i.e(arrstring, "signatures");
        return this.b(this.f(string), (String[])Arrays.copyOf((Object[])arrstring, (int)arrstring.length));
    }

    public final /* varargs */ Set<String> d(String string, String ... arrstring) {
        i.e(string, "name");
        i.e(arrstring, "signatures");
        return this.b(this.g(string), (String[])Arrays.copyOf((Object[])arrstring, (int)arrstring.length));
    }

    public final String e(String string) {
        i.e(string, "name");
        return i.k("java/util/function/", string);
    }

    public final String f(String string) {
        i.e(string, "name");
        return i.k("java/lang/", string);
    }

    public final String g(String string) {
        i.e(string, "name");
        return i.k("java/util/", string);
    }

    public final String h(String string, String string2) {
        i.e(string, "internalName");
        i.e(string2, "jvmDescriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append('.');
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

