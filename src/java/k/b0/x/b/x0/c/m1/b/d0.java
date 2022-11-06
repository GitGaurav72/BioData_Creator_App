/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  k.b0.x.b.x0.c.m1.b.w
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.t
 *  k.s.r
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.m1.b;

import e.e.a.a.a;
import java.util.Collection;
import k.b0.x.b.x0.c.m1.b.w;
import k.b0.x.b.x0.e.a.q0.g;
import k.b0.x.b.x0.e.a.q0.t;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.s.r;
import k.x.b.l;
import k.x.c.i;

public final class d0
extends w
implements t {
    public final c a;

    public d0(c c2) {
        i.e(c2, "fqName");
        this.a = c2;
    }

    public k.b0.x.b.x0.e.a.q0.a e(c c2) {
        i.e(c2, "fqName");
        return null;
    }

    public boolean equals(Object object) {
        return object instanceof d0 && i.a(this.a, ((d0)object).a);
    }

    public c getFqName() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean l() {
        return false;
    }

    public Collection<g> o(l<? super e, Boolean> l2) {
        i.e(l2, "nameFilter");
        return r.k;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        a.B(d0.class, (StringBuilder)stringBuilder, (String)": ");
        stringBuilder.append((Object)this.a);
        return stringBuilder.toString();
    }

    public Collection<t> w() {
        return r.k;
    }
}

