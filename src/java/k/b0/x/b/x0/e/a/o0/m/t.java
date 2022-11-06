/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.i1.a
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.x0
 *  k.b0.x.b.x0.e.a.a
 *  k.b0.x.b.x0.e.a.m0.k
 *  k.b0.x.b.x0.e.a.o0.f
 *  k.b0.x.b.x0.e.a.q0.d
 *  k.b0.x.b.x0.e.a.q0.w
 *  k.b0.x.b.x0.m.f0
 *  k.s.r
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.e.a.o0.m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.c;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.x0;
import k.b0.x.b.x0.e.a.a;
import k.b0.x.b.x0.e.a.o0.d;
import k.b0.x.b.x0.e.a.o0.f;
import k.b0.x.b.x0.e.a.o0.h;
import k.b0.x.b.x0.e.a.q0.j;
import k.b0.x.b.x0.e.a.q0.w;
import k.b0.x.b.x0.e.a.q0.x;
import k.b0.x.b.x0.e.a.r0.k;
import k.b0.x.b.x0.e.a.r0.p;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.s.r;
import k.x.b.l;
import k.x.c.i;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class t
extends c {
    public final h q;
    public final x r;

    public t(h h2, x x2, int n2, k k2) {
        i.e(h2, "c");
        i.e(x2, "javaTypeParameter");
        i.e((Object)k2, "containingDeclaration");
        super(h2.a.a, k2, (k.b0.x.b.x0.c.i1.h)new f(h2, (k.b0.x.b.x0.e.a.q0.d)x2, false), x2.getName(), n1.k, false, n2, u0.a, h2.a.m);
        this.q = h2;
        this.r = x2;
    }

    public List<f0> n(List<? extends f0> list) {
        i.e(list, "bounds");
        h h2 = this.q;
        k.b0.x.b.x0.e.a.r0.k k2 = h2.a.r;
        Objects.requireNonNull((Object)k2);
        i.e(this, "typeParameter");
        i.e(list, "bounds");
        i.e(h2, "context");
        ArrayList arrayList = new ArrayList(e.s.a.a.U(list, (int)10));
        for (f0 f02 : list) {
            if (!e.s.a.a.f0((f0)f02, (l)p.k)) {
                k.b b2 = new k.b(k2, (k.b0.x.b.x0.c.i1.a)this, f02, (Collection)r.k, false, h2, a.o, true, false, 128);
                f02 = k.b.d((k.b)b2, null, (boolean)false, (int)3).a;
            }
            arrayList.add((Object)f02);
        }
        return arrayList;
    }

    @Override
    public void o(f0 f02) {
        i.e((Object)f02, "type");
    }

    @Override
    public List<f0> q() {
        Collection<j> collection = this.r.getUpperBounds();
        if (collection.isEmpty()) {
            m0 m02 = this.q.a.o.getBuiltIns().getAnyType();
            i.d(m02, "c.module.builtIns.anyType");
            m0 m03 = this.q.a.o.getBuiltIns().getNullableAnyType();
            i.d(m03, "c.module.builtIns.nullableAnyType");
            return e.s.a.a.N2((Object)g0.c(m02, m03));
        }
        ArrayList arrayList = new ArrayList(e.s.a.a.U(collection, (int)10));
        for (j j2 : collection) {
            arrayList.add((Object)this.q.e.e(j2, k.b0.x.b.x0.e.a.o0.n.e.b(k.b0.x.b.x0.e.a.m0.k.l, false, this, 1)));
        }
        return arrayList;
    }
}

