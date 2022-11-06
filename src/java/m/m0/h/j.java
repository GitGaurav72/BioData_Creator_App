/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.ProtocolException
 *  k.d0.g
 */
package m.m0.h;

import e.e.a.a.a;
import java.net.ProtocolException;
import k.d0.g;
import k.x.c.i;
import m.d0;

public final class j {
    public final d0 a;
    public final int b;
    public final String c;

    public j(d0 d02, int n2, String string) {
        i.e((Object)d02, "protocol");
        i.e(string, "message");
        this.a = d02;
        this.b = n2;
        this.c = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final j a(String string) {
        int n2;
        int n3;
        int n4;
        String string2;
        d0 d02 = d0.k;
        i.e(string, "statusLine");
        boolean bl = g.E((String)string, (String)"HTTP/1.", (boolean)false, (int)2);
        int n5 = 9;
        if (bl) {
            if (string.length() < n5 || string.charAt(8) != ' ') throw new ProtocolException(a.l((String)"Unexpected status line: ", (String)string));
            int n6 = -48 + string.charAt(7);
            if (n6 != 0) {
                if (n6 != 1) throw new ProtocolException(a.l((String)"Unexpected status line: ", (String)string));
                d02 = d0.l;
            }
        } else {
            if (!g.E((String)string, (String)"ICY ", (boolean)false, (int)2)) throw new ProtocolException(a.l((String)"Unexpected status line: ", (String)string));
            n5 = 4;
        }
        if ((n2 = string.length()) < (n4 = n5 + 3)) throw new ProtocolException(a.l((String)"Unexpected status line: ", (String)string));
        try {
            String string3 = string.substring(n5, n4);
            i.d(string3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            n3 = Integer.parseInt((String)string3);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ProtocolException(a.l((String)"Unexpected status line: ", (String)string));
        }
        if (string.length() > n4) {
            if (string.charAt(n4) != ' ') throw new ProtocolException(a.l((String)"Unexpected status line: ", (String)string));
            string2 = string.substring(n5 + 4);
            i.d(string2, "(this as java.lang.String).substring(startIndex)");
            return new j(d02, n3, string2);
        } else {
            string2 = "";
        }
        return new j(d02, n3, string2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.a == d0.k ? "HTTP/1.0" : "HTTP/1.1";
        stringBuilder.append(string);
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
        stringBuilder.append(' ');
        stringBuilder.append(this.c);
        String string2 = stringBuilder.toString();
        i.d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}

