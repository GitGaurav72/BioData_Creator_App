/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  k.s.r
 */
package k.b0.x.b.x0.m;

import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.y0;
import k.s.r;
import k.x.c.i;

public class x
extends m0 {
    public final y0 l;
    public final h m;
    public final List<b1> n;
    public final boolean o;
    public final String p;

    public x(y0 y02, h h2) {
        i.e((Object)y02, "constructor");
        i.e((Object)h2, "memberScope");
        this(y02, h2, null, false, null, 28);
    }

    public x(y0 y02, h h2, List list, boolean bl, String string, int n2) {
        if ((n2 & 4) != 0) {
            list = r.k;
        }
        if ((n2 & 8) != 0) {
            bl = false;
        }
        String string2 = (n2 & 16) != 0 ? "???" : null;
        i.e((Object)y02, "constructor");
        i.e((Object)h2, "memberScope");
        i.e((Object)list, "arguments");
        i.e(string2, "presentableName");
        this.l = y02;
        this.m = h2;
        this.n = list;
        this.o = bl;
        this.p = string2;
    }

    public List<b1> S() {
        return this.n;
    }

    public y0 T() {
        return this.l;
    }

    public boolean U() {
        return this.o;
    }

    @Override
    public m1 Z(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        return this;
    }

    @Override
    public m0 a0(boolean bl) {
        x x2 = new x(this.l, this.m, this.n, bl, null, 16);
        return x2;
    }

    @Override
    public m0 b0(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        return this;
    }

    public String c0() {
        return this.p;
    }

    public x d0(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        Objects.requireNonNull((Object)k.b0.x.b.x0.c.i1.h.g);
        return h.a.b;
    }

    public h getMemberScope() {
        return this.m;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.l);
        String string = this.n.isEmpty() ? "" : k.s.i.z(this.n, (CharSequence)", ", (CharSequence)"<", (CharSequence)">", (int)-1, (CharSequence)"...", null);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

