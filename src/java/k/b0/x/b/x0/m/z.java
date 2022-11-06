/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.r1.g
 *  k.b0.x.b.x0.m.y0
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.m;

import java.util.List;
import k.b0.x.b.x0.i.c;
import k.b0.x.b.x0.i.i;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.r1.g;
import k.b0.x.b.x0.m.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class z
extends m1
implements g {
    public final m0 l;
    public final m0 m;

    public z(m0 m02, m0 m03) {
        k.x.c.i.e(m02, "lowerBound");
        k.x.c.i.e(m03, "upperBound");
        super(null);
        this.l = m02;
        this.m = m03;
    }

    public List<b1> S() {
        return this.a0().S();
    }

    public y0 T() {
        return this.a0().T();
    }

    public boolean U() {
        return this.a0().U();
    }

    public abstract m0 a0();

    public abstract String b0(c var1, i var2);

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        return this.a0().getAnnotations();
    }

    public h getMemberScope() {
        return this.a0().getMemberScope();
    }

    public String toString() {
        return c.b.v((f0)this);
    }
}

