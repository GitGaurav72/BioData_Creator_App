/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package k.b0.x.b.x0.e.a.o0;

import k.b0.x.b.x0.e.a.o0.l;
import k.b0.x.b.x0.e.a.o0.n.d;
import k.b0.x.b.x0.e.a.z;
import k.e;
import k.x.c.i;

public final class h {
    public final k.b0.x.b.x0.e.a.o0.d a;
    public final l b;
    public final e<z> c;
    public final e d;
    public final d e;

    public h(k.b0.x.b.x0.e.a.o0.d d2, l l2, e<z> e2) {
        i.e(d2, "components");
        i.e(l2, "typeParameterResolver");
        i.e(e2, "delegateForDefaultTypeQualifiers");
        this.a = d2;
        this.b = l2;
        this.c = e2;
        this.d = e2;
        this.e = new d(this, l2);
    }

    public final z a() {
        return (z)this.d.getValue();
    }
}

