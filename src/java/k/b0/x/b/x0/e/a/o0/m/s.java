/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.List
 *  k.b0.x.b.x0.m.f0
 *  k.s.r
 */
package k.b0.x.b.x0.e.a.o0.m;

import java.util.Collection;
import java.util.List;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.e.a.o0.h;
import k.b0.x.b.x0.e.a.o0.m.k;
import k.b0.x.b.x0.e.a.q0.q;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.f0;
import k.s.r;
import k.x.c.i;

public abstract class s
extends k {
    public s(h h2) {
        i.e(h2, "c");
        super(h2, null);
    }

    @Override
    public void g(e e2, Collection<n0> collection) {
        i.e(e2, "name");
        i.e(collection, "result");
    }

    @Override
    public q0 i() {
        return null;
    }

    @Override
    public k.a l(q q2, List<? extends z0> list, f0 f02, List<? extends e1> list2) {
        i.e(q2, "method");
        i.e(list, "methodTypeParameters");
        i.e((Object)f02, "returnType");
        i.e(list2, "valueParameters");
        Object object = new Object(f02, null, list2, list, false, (List<String>)r.k){
            public final f0 a;
            public final f0 b;
            public final List<e1> c;
            public final List<z0> d;
            public final boolean e;
            public final List<String> f;
            {
                i.e((Object)f02, "returnType");
                i.e(list, "valueParameters");
                i.e(list2, "typeParameters");
                i.e(list3, "errors");
                this.a = f02;
                this.b = null;
                this.c = list;
                this.d = list2;
                this.e = bl;
                this.f = list3;
            }

            public boolean equals(Object object) {
                if (this == object) {
                    return true;
                }
                if (!(object instanceof k.a)) {
                    return false;
                }
                k.a a2 = object;
                if (!i.a((Object)this.a, (Object)a2.a)) {
                    return false;
                }
                if (!i.a((Object)this.b, (Object)a2.b)) {
                    return false;
                }
                if (!i.a(this.c, a2.c)) {
                    return false;
                }
                if (!i.a(this.d, a2.d)) {
                    return false;
                }
                if (this.e != a2.e) {
                    return false;
                }
                return i.a(this.f, a2.f);
            }

            public int hashCode() {
                int n2 = 31 * this.a.hashCode();
                f0 f02 = this.b;
                int n3 = f02 == null ? 0 : f02.hashCode();
                int n4 = 31 * (31 * (31 * (n2 + n3) + this.c.hashCode()) + this.d.hashCode());
                int n5 = this.e ? 1 : 0;
                if (n5 != 0) {
                    n5 = 1;
                }
                return 31 * (n4 + n5) + this.f.hashCode();
            }

            public String toString() {
                java.lang.StringBuilder stringBuilder = e.e.a.a.a.t((String)"MethodSignatureData(returnType=");
                stringBuilder.append((Object)this.a);
                stringBuilder.append(", receiverType=");
                stringBuilder.append((Object)this.b);
                stringBuilder.append(", valueParameters=");
                stringBuilder.append(this.c);
                stringBuilder.append(", typeParameters=");
                stringBuilder.append(this.d);
                stringBuilder.append(", hasStableParameterNames=");
                stringBuilder.append(this.e);
                stringBuilder.append(", errors=");
                stringBuilder.append(this.f);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        };
        return object;
    }
}

