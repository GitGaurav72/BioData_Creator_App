/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package m.m0.f;

import k.x.c.i;
import m.m0.f.c;

public abstract class a {
    public c a;
    public long b;
    public final String c;
    public final boolean d;

    public a(String string, boolean bl) {
        i.e(string, "name");
        this.c = string;
        this.d = bl;
        this.b = -1L;
    }

    public abstract long a();

    public String toString() {
        return this.c;
    }
}

