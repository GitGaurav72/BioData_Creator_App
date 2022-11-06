/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.a.c.f.f.eg
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.p.a.c.f.f;

import e.p.a.c.f.f.eg;

public class wf {
    public final String a;
    public final eg b;

    public wf(String string, eg eg2) {
        this.a = string;
        this.b = eg2;
    }

    public final String a(String string, String string2) {
        String string3 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(string);
        stringBuilder.append("?key=");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

