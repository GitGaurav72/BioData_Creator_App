/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  k.d0.g
 *  k.s.i
 */
package k.b0.x.b.x0.f.a0.b;

import e.e.a.a.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.d0.g;
import k.x.c.i;

public final class b {
    public static final String a;
    public static final Map<String, String> b;

    public static {
        Object[] arrobject = new Character[6];
        Character c2 = Character.valueOf((char)'k');
        int n2 = 0;
        arrobject[0] = c2;
        arrobject[1] = Character.valueOf((char)'o');
        arrobject[2] = Character.valueOf((char)'t');
        arrobject[3] = Character.valueOf((char)'l');
        arrobject[4] = Character.valueOf((char)'i');
        arrobject[5] = Character.valueOf((char)'n');
        a = k.s.i.A((Iterable)k.s.i.E((Object[])arrobject), (CharSequence)"", null, null, (int)0, null, null, (int)62);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = k.s.i.E((Object[])new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int n3 = e.s.a.a.P1((int)0, (int)(-1 + list.size()), (int)2);
        if (n3 >= 0) {
            int n4 = 0;
            do {
                int n5 = n4 + 2;
                StringBuilder stringBuilder = new StringBuilder();
                String string = a;
                stringBuilder.append(string);
                stringBuilder.append('/');
                stringBuilder.append((String)list.get(n4));
                String string2 = stringBuilder.toString();
                int n6 = n4 + 1;
                linkedHashMap.put((Object)string2, list.get(n6));
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string);
                stringBuilder2.append('/');
                linkedHashMap.put((Object)a.q((StringBuilder)stringBuilder2, (String)((String)list.get(n4)), (String)"Array"), (Object)i.k("[", list.get(n6)));
                if (n4 == n3) break;
                n4 = n5;
            } while (true);
        }
        linkedHashMap.put((Object)i.k(a, "/Unit"), (Object)"V");
        b.a((Map<String, String>)linkedHashMap, "Any", "java/lang/Object");
        b.a((Map<String, String>)linkedHashMap, "Nothing", "java/lang/Void");
        b.a((Map<String, String>)linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String string : k.s.i.E((Object[])new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            b.a((Map<String, String>)linkedHashMap, string, i.k("java/lang/", string));
        }
        for (String string : k.s.i.E((Object[])new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            b.a((Map<String, String>)linkedHashMap, i.k("collections/", string), i.k("java/util/", string));
            b.a((Map<String, String>)linkedHashMap, i.k("collections/Mutable", string), i.k("java/util/", string));
        }
        b.a((Map<String, String>)linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        b.a((Map<String, String>)linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        b.a((Map<String, String>)linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        b.a((Map<String, String>)linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        while (n2 < 23) {
            int n7 = n2 + 1;
            String string = i.k("Function", n2);
            StringBuilder stringBuilder = new StringBuilder();
            String string3 = a;
            stringBuilder.append(string3);
            stringBuilder.append("/jvm/functions/Function");
            stringBuilder.append(n2);
            b.a((Map<String, String>)linkedHashMap, string, stringBuilder.toString());
            b.a((Map<String, String>)linkedHashMap, i.k("reflect/KFunction", n2), i.k(string3, "/reflect/KFunction"));
            n2 = n7;
        }
        for (String string : k.s.i.E((Object[])new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            String string4 = i.k(string, ".Companion");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("/jvm/internal/");
            stringBuilder.append(string);
            stringBuilder.append("CompanionObject");
            b.a((Map<String, String>)linkedHashMap, string4, stringBuilder.toString());
        }
        b = linkedHashMap;
    }

    public static final void a(Map<String, String> map, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append('/');
        stringBuilder.append(string);
        String string3 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append('L');
        stringBuilder2.append(string2);
        stringBuilder2.append(';');
        map.put((Object)string3, (Object)stringBuilder2.toString());
    }

    public static final String b(String string) {
        i.e(string, "classId");
        String string2 = (String)b.get((Object)string);
        if (string2 == null) {
            StringBuilder stringBuilder = a.s((char)'L');
            stringBuilder.append(g.v((String)string, (char)'.', (char)'$', (boolean)false, (int)4));
            stringBuilder.append(';');
            string2 = stringBuilder.toString();
        }
        return string2;
    }
}

