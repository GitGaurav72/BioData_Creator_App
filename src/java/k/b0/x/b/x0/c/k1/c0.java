/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.u0
 */
package k.b0.x.b.x0.c.k1;

import java.util.Objects;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.f0;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.n;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.x.c.i;

public abstract class c0
extends n
implements f0 {
    private final String debugString;
    private final c fqName;

    public c0(d0 d02, c c2) {
        i.e((Object)d02, "module");
        i.e(c2, "fqName");
        Objects.requireNonNull((Object)h.g);
        super((k)d02, h.a.b, c2.h(), u0.a);
        this.fqName = c2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package ");
        stringBuilder.append((Object)c2);
        stringBuilder.append(" of ");
        stringBuilder.append((Object)d02);
        this.debugString = stringBuilder.toString();
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        i.e(m2, "visitor");
        return (R)m2.f((f0)this, d2);
    }

    @Override
    public d0 getContainingDeclaration() {
        return (d0)super.getContainingDeclaration();
    }

    @Override
    public final c getFqName() {
        return this.fqName;
    }

    @Override
    public u0 getSource() {
        u0 u02 = u0.a;
        i.d((Object)u02, "NO_SOURCE");
        return u02;
    }

    public String toString() {
        return this.debugString;
    }
}

