/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.x.b.x0.c.c0
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.g0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.j0
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.d0
 *  k.b0.x.b.x0.c.k1.d0$a
 *  k.b0.x.b.x0.c.k1.d0$b
 *  k.b0.x.b.x0.c.k1.l
 *  k.b0.x.b.x0.c.k1.m
 *  k.b0.x.b.x0.c.k1.w
 *  k.b0.x.b.x0.c.k1.x
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.x
 *  k.b0.x.b.x0.c.y
 *  k.b0.x.b.x0.c.z
 *  k.b0.x.b.x0.l.e
 *  k.b0.x.b.x0.l.e$m
 *  k.b0.x.b.x0.l.g
 *  k.s.i
 *  k.s.r
 *  k.s.s
 *  k.s.t
 *  k.x.b.a
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.c.k1;

import e.s.a.a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.c.c0;
import k.b0.x.b.x0.c.g0;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.j0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.d0;
import k.b0.x.b.x0.c.k1.l;
import k.b0.x.b.x0.c.k1.w;
import k.b0.x.b.x0.c.k1.x;
import k.b0.x.b.x0.c.k1.y;
import k.b0.x.b.x0.c.k1.z;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.l.e;
import k.b0.x.b.x0.l.g;
import k.e;
import k.s.i;
import k.s.r;
import k.s.s;
import k.s.t;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class a0
extends k.b0.x.b.x0.c.k1.m
implements k.b0.x.b.x0.c.d0 {
    public final k.b0.x.b.x0.l.m k;
    public final KotlinBuiltIns l;
    public final Map<c0<?>, Object> m;
    public final d0 n;
    public w o;
    public g0 p;
    public boolean q;
    public final g<c, j0> r;
    public final e s;

    public a0(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.l.m m2, KotlinBuiltIns kotlinBuiltIns, Map map, k.b0.x.b.x0.g.e e3, int n2) {
        Object object = (n2 & 16) != 0 ? s.k : null;
        k.x.c.i.e(e2, "moduleName");
        k.x.c.i.e(m2, "storageManager");
        k.x.c.i.e((Object)kotlinBuiltIns, "builtIns");
        k.x.c.i.e(object, "capabilities");
        Objects.requireNonNull((Object)h.g);
        super(h.a.b, e2);
        this.k = m2;
        this.l = kotlinBuiltIns;
        if (e2.l) {
            this.m = object;
            Objects.requireNonNull((Object)d0.a);
            d0 d02 = (d0)this.R(d0.a.b);
            if (d02 == null) {
                d02 = d0.b.b;
            }
            this.n = d02;
            this.q = true;
            this.r = m2.h(new z(this));
            this.s = a.J2((k.x.b.a)new y(this));
            return;
        }
        throw new IllegalArgumentException(k.x.c.i.k("Module name must be special: ", e2));
    }

    public boolean B(k.b0.x.b.x0.c.d0 d02) {
        k.x.c.i.e((Object)d02, "targetModule");
        if (k.x.c.i.a((Object)this, (Object)d02)) {
            return true;
        }
        w w2 = this.o;
        k.x.c.i.c((Object)w2);
        if (i.e((Iterable)w2.b(), (Object)d02)) {
            return true;
        }
        if (this.L().contains((Object)d02)) {
            return true;
        }
        return d02.L().contains((Object)this);
    }

    public List<k.b0.x.b.x0.c.d0> L() {
        w w2 = this.o;
        if (w2 != null) {
            return w2.c();
        }
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Dependencies of module ");
        stringBuilder.append(this.o());
        stringBuilder.append(" were not set");
        throw new AssertionError((Object)stringBuilder.toString());
    }

    public final /* varargs */ void P(a0 ... arra0) {
        k.x.c.i.e(arra0, "descriptors");
        List list = a.m4((Object[])arra0);
        k.x.c.i.e((Object)list, "descriptors");
        t t2 = t.k;
        k.x.c.i.e((Object)list, "descriptors");
        k.x.c.i.e((Object)t2, "friends");
        x x2 = new x(list, (Set)t2, (List)r.k, (Set)t2);
        k.x.c.i.e((Object)x2, "dependencies");
        this.o = x2;
    }

    public <T> T R(c0<T> c02) {
        k.x.c.i.e(c02, "capability");
        return (T)this.m.get(c02);
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        k.x.c.i.e((Object)this, "this");
        k.x.c.i.e(m2, "visitor");
        return (R)m2.j((k.b0.x.b.x0.c.d0)this, d2);
    }

    public KotlinBuiltIns getBuiltIns() {
        return this.l;
    }

    public k getContainingDeclaration() {
        k.x.c.i.e((Object)this, "this");
        return null;
    }

    public Collection<c> getSubPackagesOf(c c2, k.x.b.l<? super k.b0.x.b.x0.g.e, Boolean> l2) {
        k.x.c.i.e(c2, "fqName");
        k.x.c.i.e(l2, "nameFilter");
        this.n();
        return ((l)this.q()).getSubPackagesOf(c2, l2);
    }

    public void n() {
        if (!this.q) {
            k.x.c.i.e((Object)this, "<this>");
            k.b0.x.b.x0.c.z z2 = (k.b0.x.b.x0.c.z)this.R(k.b0.x.b.x0.c.y.a);
            if (z2 != null) {
                z2.a((k.b0.x.b.x0.c.d0)this);
                return;
            }
            throw new k.b0.x.b.x0.c.x(k.x.c.i.k("Accessing invalid module descriptor ", (Object)this));
        }
    }

    public final String o() {
        String string = this.getName().k;
        k.x.c.i.d(string, "name.toString()");
        return string;
    }

    public final g0 q() {
        this.n();
        return (l)this.s.getValue();
    }

    public j0 r(c c2) {
        k.x.c.i.e(c2, "fqName");
        this.n();
        return (j0)((e.m)this.r).invoke((Object)c2);
    }
}

