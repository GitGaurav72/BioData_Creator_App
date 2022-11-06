/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package m;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k.x.c.i;

public final class j {
    public final Map<String, String> a;
    public final String b;

    public j(String string, Map<String, String> map) {
        i.e(string, "scheme");
        i.e(map, "authParams");
        this.b = string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String string2;
            String string3 = (String)entry.getKey();
            String string4 = (String)entry.getValue();
            if (string3 != null) {
                Locale locale = Locale.US;
                i.d((Object)locale, "US");
                string2 = string3.toLowerCase(locale);
                i.d(string2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                string2 = null;
            }
            linkedHashMap.put(string2, (Object)string4);
        }
        Map map2 = Collections.unmodifiableMap((Map)linkedHashMap);
        i.d((Object)map2, "unmodifiableMap<String?, String>(newAuthParams)");
        this.a = map2;
    }

    public boolean equals(Object object) {
        if (object instanceof j) {
            j j2 = (j)object;
            if (i.a(j2.b, this.b) && i.a(j2.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * (899 + this.b.hashCode()) + this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(" authParams=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}

