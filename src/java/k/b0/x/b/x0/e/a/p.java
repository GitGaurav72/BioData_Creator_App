/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  kotlin.reflect.jvm.internal.impl.builtins.StandardNames
 *  kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames
 */
package k.b0.x.b.x0.e.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k.b0.x.b.x0.g.c;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;

public final class p {
    public static final p a;
    public static final HashMap<c, c> b;

    public static {
        b = new HashMap();
        p.b(StandardNames.FqNames.mutableList, p.a("java.util.ArrayList", "java.util.LinkedList"));
        p.b(StandardNames.FqNames.mutableSet, p.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        p.b(StandardNames.FqNames.mutableMap, p.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        p.b(new c("java.util.function.Function"), p.a("java.util.function.UnaryOperator"));
        p.b(new c("java.util.function.BiFunction"), p.a("java.util.function.BinaryOperator"));
    }

    public static final /* varargs */ List<c> a(String ... arrstring) {
        ArrayList arrayList = new ArrayList(arrstring.length);
        for (String string : arrstring) {
            arrayList.add((Object)new c(string));
        }
        return arrayList;
    }

    public static final void b(c c2, List<c> list) {
        HashMap<c, c> hashMap = b;
        for (Object object : list) {
            (c)object;
            hashMap.put(object, (Object)c2);
        }
    }
}

