/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.c;

import java.util.List;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.y0;
import k.x.c.i;

public final class c
implements z0 {
    public final z0 k;
    public final k l;
    public final int m;

    public c(z0 z02, k k2, int n2) {
        i.e(z02, "originalDescriptor");
        i.e((Object)k2, "declarationDescriptor");
        this.k = z02;
        this.l = k2;
        this.m = n2;
    }

    @Override
    public k.b0.x.b.x0.l.m D() {
        return this.k.D();
    }

    @Override
    public boolean H() {
        return true;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)this.k.accept(m2, d2);
    }

    @Override
    public n1 d() {
        return this.k.d();
    }

    @Override
    public int e() {
        return this.m + this.k.e();
    }

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        return this.k.getAnnotations();
    }

    @Override
    public k getContainingDeclaration() {
        return this.l;
    }

    @Override
    public m0 getDefaultType() {
        return this.k.getDefaultType();
    }

    public e getName() {
        return this.k.getName();
    }

    @Override
    public z0 getOriginal() {
        z0 z02 = this.k.getOriginal();
        i.d(z02, "originalDescriptor.original");
        return z02;
    }

    public u0 getSource() {
        return this.k.getSource();
    }

    @Override
    public y0 getTypeConstructor() {
        return this.k.getTypeConstructor();
    }

    @Override
    public List<f0> getUpperBounds() {
        return this.k.getUpperBounds();
    }

    @Override
    public boolean m() {
        return this.k.m();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.k);
        stringBuilder.append("[inner-copy]");
        return stringBuilder.toString();
    }
}

