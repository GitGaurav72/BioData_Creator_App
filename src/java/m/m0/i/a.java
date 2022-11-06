/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Objects
 *  k.d0.g
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  m.y
 *  n.g
 */
package m.m0.i;

import java.util.ArrayList;
import java.util.Objects;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.y;
import n.g;

public final class a {
    public long a;
    public final g b;

    public a(g g2) {
        i.e((Object)g2, "source");
        this.b = g2;
        this.a = 262144;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final y a() {
        ArrayList arrayList = new ArrayList(20);
        do {
            boolean bl;
            String string;
            if (bl = (string = this.b()).length() == 0) {
                Object[] arrobject = arrayList.toArray((Object[])new String[0]);
                Objects.requireNonNull((Object)arrobject, (String)"null cannot be cast to non-null type kotlin.Array<T>");
                return new y((String[])arrobject, null);
            }
            i.e(string, "line");
            int n2 = k.d0.g.k((CharSequence)string, (char)':', (int)1, (boolean)false, (int)4);
            if (n2 != -1) {
                String string2 = string.substring(0, n2);
                i.d(string2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                string = string.substring(n2 + 1);
                i.d(string, "(this as java.lang.String).substring(startIndex)");
                i.e(string2, "name");
                i.e(string, "value");
                arrayList.add((Object)string2);
            } else {
                if (string.charAt(0) == ':') {
                    string = string.substring(1);
                    i.d(string, "(this as java.lang.String).substring(startIndex)");
                }
                i.e("", "name");
                i.e(string, "value");
                arrayList.add((Object)"");
            }
            arrayList.add((Object)k.d0.g.O((CharSequence)string).toString());
        } while (true);
    }

    public final String b() {
        String string = this.b.t(this.a);
        this.a -= (long)string.length();
        return string;
    }
}

