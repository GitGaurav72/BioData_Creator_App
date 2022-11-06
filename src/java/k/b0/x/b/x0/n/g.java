/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  k.b0.x.b.x0.c.v
 *  k.b0.x.b.x0.n.d
 *  k.b0.x.b.x0.n.f
 *  k.x.b.l
 */
package k.b0.x.b.x0.n;

import java.util.Arrays;
import java.util.Collection;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.n.b;
import k.b0.x.b.x0.n.d;
import k.b0.x.b.x0.n.f;
import k.x.b.l;
import k.x.c.i;

public final class g {
    public final e a;
    public final k.d0.d b;
    public final Collection<e> c;
    public final l<v, String> d;
    public final b[] e;

    public g(Collection<e> collection, b[] arrb, l<? super v, String> l2) {
        i.e(collection, "nameList");
        i.e(arrb, "checks");
        i.e(l2, "additionalChecks");
        this(null, null, collection, l2, (b[])Arrays.copyOf((Object[])arrb, (int)arrb.length));
    }

    public /* synthetic */ g(Collection collection, b[] arrb, l l2, int n2) {
        Object object = (n2 & 4) != 0 ? f.k : null;
        this((Collection<e>)collection, arrb, (l<? super v, String>)object);
    }

    public /* varargs */ g(e e2, k.d0.d d2, Collection<e> collection, l<? super v, String> l2, b ... arrb) {
        this.a = null;
        this.b = d2;
        this.c = collection;
        this.d = l2;
        this.e = arrb;
    }

    public g(e e2, b[] arrb, l<? super v, String> l2) {
        i.e(e2, "name");
        i.e(arrb, "checks");
        i.e(l2, "additionalChecks");
        b[] arrb2 = (b[])Arrays.copyOf((Object[])arrb, (int)arrb.length);
        this.a = e2;
        this.b = null;
        this.c = null;
        this.d = l2;
        this.e = arrb2;
    }

    public /* synthetic */ g(e e2, b[] arrb, l l2, int n2) {
        Object object = (n2 & 4) != 0 ? d.k : null;
        this(e2, arrb, (l<? super v, String>)object);
    }
}

