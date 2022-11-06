/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.e.b;

import k.x.b.l;
import k.x.c.i;
import k.x.c.k;

public final class s
extends k
implements l<String, CharSequence> {
    public static final s k = new s();

    public s() {
        super(1);
    }

    public Object invoke(Object object) {
        String string = (String)object;
        i.e(string, "it");
        if (string.length() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('L');
            stringBuilder.append(string);
            stringBuilder.append(';');
            string = stringBuilder.toString();
        }
        return string;
    }
}

