/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 */
package k.b0.x.b.x0.e.a.r0;

import e.s.a.a;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.q;
import k.b0.x.b.x0.m.t;
import k.b0.x.b.x0.m.z;
import k.x.c.i;

public final class f
extends t
implements q {
    public final m0 l;

    public f(m0 m02) {
        i.e(m02, "delegate");
        this.l = m02;
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public m1 Z(h h2) {
        i.e((Object)h2, "newAnnotations");
        return new f(this.l.b0(h2));
    }

    @Override
    public m0 a0(boolean bl) {
        if (bl) {
            return this.l.a0(true);
        }
        return this;
    }

    @Override
    public m0 b0(h h2) {
        i.e((Object)h2, "newAnnotations");
        return new f(this.l.b0(h2));
    }

    @Override
    public m0 c0() {
        return this.l;
    }

    @Override
    public t e0(m0 m02) {
        i.e(m02, "delegate");
        return new f(m02);
    }

    public final m0 f0(m0 m02) {
        m0 m03 = m02.a0(false);
        if (!a.z2((f0)m02)) {
            return m03;
        }
        return new f(m03);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public f0 q(f0 f02) {
        i.e((Object)f02, "replacement");
        m1 m12 = f02.W();
        if (!a.z2((f0)m12) && !j1.h((f0)m12)) {
            return m12;
        }
        if (m12 instanceof m0) {
            return this.f0((m0)m12);
        }
        if (m12 instanceof z) {
            z z2 = (z)m12;
            return a.y4((m1)g0.c(this.f0(z2.l), this.f0(z2.m)), (f0)a.q1((f0)m12));
        }
        throw new IllegalStateException(i.k("Incorrect type: ", (Object)m12).toString());
    }
}

