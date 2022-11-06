/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.j.v.a.b
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 *  k.s.r
 *  k.x.b.a
 *  k.x.c.k
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.m.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.y0;
import k.e;
import k.f;
import k.s.r;
import k.x.c.i;
import k.x.c.k;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class h
implements k.b0.x.b.x0.j.v.a.b {
    public final b1 a;
    public k.x.b.a<? extends List<? extends m1>> b;
    public final h c;
    public final z0 d;
    public final e e;

    public h(b1 b12, k.x.b.a<? extends List<? extends m1>> a2, h h2, z0 z02) {
        i.e((Object)b12, "projection");
        this.a = b12;
        this.b = a2;
        this.c = h2;
        this.d = z02;
        this.e = e.s.a.a.I2((f)f.l, (k.x.b.a)new k.x.b.a<List<? extends m1>>(){

            public Object invoke() {
                k.x.b.a<? extends List<? extends m1>> a2 = this.b;
                if (a2 == null) {
                    return null;
                }
                return (List)a2.invoke();
            }
        });
    }

    public /* synthetic */ h(b1 b12, k.x.b.a a2, h h2, z0 z02, int n2) {
        if ((n2 & 2) != 0) {
            a2 = null;
        }
        if ((n2 & 4) != 0) {
            h2 = null;
        }
        if ((n2 & 8) != 0) {
            z02 = null;
        }
        this(b12, (k.x.b.a<? extends List<? extends m1>>)a2, h2, z02);
    }

    public b1 a() {
        return this.a;
    }

    public h b(final d d2) {
        i.e((Object)d2, "kotlinTypeRefiner");
        b1 b12 = this.a.refine(d2);
        i.d((Object)b12, "projection.refine(kotlinTypeRefiner)");
        k.x.b.a<List<? extends m1>> a2 = this.b == null ? null : new k.x.b.a<List<? extends m1>>(){

            public Object invoke() {
                List list = (List)this.e.getValue();
                if (list == null) {
                    list = r.k;
                }
                d d22 = d2;
                ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    arrayList.add((Object)((m1)iterator.next()).Y(d22));
                }
                return arrayList;
            }
        };
        h h2 = this.c;
        if (h2 == null) {
            h2 = this;
        }
        return new h(b12, (k.x.b.a<? extends List<? extends m1>>)a2, h2, this.d);
    }

    public boolean equals(Object object) {
        h h2;
        if (this == object) {
            return true;
        }
        Class class_ = object == null ? null : object.getClass();
        if (!i.a(h.class, (Object)class_)) {
            return false;
        }
        Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        h h3 = (h)object;
        h h4 = this.c;
        if (h4 == null) {
            h4 = this;
        }
        if ((h2 = h3.c) != null) {
            h3 = h2;
        }
        return h4 == h3;
    }

    public KotlinBuiltIns getBuiltIns() {
        f0 f02 = this.a.b();
        i.d((Object)f02, "projection.type");
        return e.s.a.a.k1((f0)f02);
    }

    public k.b0.x.b.x0.c.h getDeclarationDescriptor() {
        return null;
    }

    public List<z0> getParameters() {
        return r.k;
    }

    public Collection getSupertypes() {
        List list = (List)this.e.getValue();
        if (list == null) {
            list = r.k;
        }
        return list;
    }

    public int hashCode() {
        h h2 = this.c;
        if (h2 == null) {
            return super.hashCode();
        }
        return h2.hashCode();
    }

    public boolean isDenotable() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"CapturedType(");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

}

