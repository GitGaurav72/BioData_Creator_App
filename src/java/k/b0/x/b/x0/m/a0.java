/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.m;

import e.e.a.a.a;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.i.c;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.q;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.y0;
import k.b0.x.b.x0.m.z;
import k.g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class a0
extends z
implements q {
    public a0(m0 m02, m0 m03) {
        k.x.c.i.e(m02, "lowerBound");
        k.x.c.i.e(m03, "upperBound");
        super(m02, m03);
    }

    public m1 X(boolean bl) {
        return g0.c(this.l.a0(bl), this.m.a0(bl));
    }

    public m1 Z(k.b0.x.b.x0.c.i1.h h2) {
        k.x.c.i.e((Object)h2, "newAnnotations");
        return g0.c(this.l.b0(h2), this.m.b0(h2));
    }

    @Override
    public m0 a0() {
        return this.l;
    }

    @Override
    public String b0(c c2, k.b0.x.b.x0.i.i i2) {
        k.x.c.i.e(c2, "renderer");
        k.x.c.i.e(i2, "options");
        if (i2.n()) {
            StringBuilder stringBuilder = a.s((char)'(');
            stringBuilder.append(c2.v((f0)this.l));
            stringBuilder.append("..");
            stringBuilder.append(c2.v((f0)this.m));
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
        return c2.s(c2.v((f0)this.l), c2.v((f0)this.m), e.s.a.a.k1((f0)this));
    }

    public z c0(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return new a0((m0)d2.h((i)((Object)this.l)), (m0)d2.h((i)((Object)this.m)));
    }

    @Override
    public boolean n() {
        return this.l.T().getDeclarationDescriptor() instanceof z0 && k.x.c.i.a((Object)this.l.T(), (Object)this.m.T());
    }

    @Override
    public f0 q(f0 f02) {
        block4 : {
            m1 m12;
            m1 m13;
            block3 : {
                block2 : {
                    k.x.c.i.e((Object)f02, "replacement");
                    m13 = f02.W();
                    if (!(m13 instanceof z)) break block2;
                    m12 = m13;
                    break block3;
                }
                if (!(m13 instanceof m0)) break block4;
                m0 m02 = (m0)m13;
                m12 = g0.c(m02, m02.a0(true));
            }
            return e.s.a.a.h2((m1)m12, (f0)m13);
        }
        throw new g();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = a.s((char)'(');
        stringBuilder.append((Object)this.l);
        stringBuilder.append("..");
        stringBuilder.append((Object)this.m);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

