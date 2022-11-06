/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.c1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 *  k.x.b.a
 *  k.x.c.k
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.c1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.p1.d;
import k.e;
import k.f;
import k.x.c.i;
import k.x.c.k;

public final class r0
extends c1 {
    public final z0 a;
    public final e b;

    public r0(z0 z02) {
        i.e((Object)z02, "typeParameter");
        this.a = z02;
        this.b = e.s.a.a.I2((f)f.l, (k.x.b.a)new k.x.b.a<f0>(){

            public Object invoke() {
                return e.s.a.a.T3((z0)this.a);
            }
        });
    }

    public n1 a() {
        return n1.m;
    }

    public f0 b() {
        return (f0)this.b.getValue();
    }

    public boolean c() {
        return true;
    }

    public b1 refine(d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        return this;
    }

}

