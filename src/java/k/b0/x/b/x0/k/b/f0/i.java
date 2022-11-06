/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 *  k.b0.f
 *  k.b0.k
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n0
 *  k.b0.x.b.x0.c.t0
 *  k.b0.x.b.x0.c.y0
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.f.i
 *  k.b0.x.b.x0.f.n
 *  k.b0.x.b.x0.f.r
 *  k.b0.x.b.x0.j.a0.i
 *  k.b0.x.b.x0.k.b.f0.i$b
 *  k.b0.x.b.x0.k.b.f0.i$c
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.l.j
 *  k.s.i
 *  k.x.b.a
 *  k.x.b.l
 *  k.x.c.k
 *  k.x.c.p
 *  k.x.c.q
 */
package k.b0.x.b.x0.k.b.f0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import k.b0.f;
import k.b0.k;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.c.y0;
import k.b0.x.b.x0.f.n;
import k.b0.x.b.x0.f.r;
import k.b0.x.b.x0.k.b.f0.i;
import k.b0.x.b.x0.k.b.j;
import k.b0.x.b.x0.k.b.l;
import k.b0.x.b.x0.l.m;
import k.x.c.p;
import k.x.c.q;
import k.x.c.w;

/*
 * Exception performing whole class analysis.
 */
public abstract class i
extends k.b0.x.b.x0.j.a0.i {
    public static final /* synthetic */ k<Object>[] b;
    public final l c;
    public final a d;
    public final k.b0.x.b.x0.l.i e;
    public final k.b0.x.b.x0.l.j f;

    public static {
        k[] arrk = new k[]{w.c((p)new q((f)w.a(i.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), w.c((p)new q((f)w.a(i.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
        b = arrk;
    }

    public i(l l2, List<k.b0.x.b.x0.f.i> list, List<n> list2, List<r> list3, final k.x.b.a<? extends Collection<k.b0.x.b.x0.g.e>> a2) {
        k.x.c.i.e(l2, "c");
        k.x.c.i.e(list, "functionList");
        k.x.c.i.e(list2, "propertyList");
        k.x.c.i.e(list3, "typeAliasList");
        k.x.c.i.e(a2, "classNames");
        this.c = l2;
        Object object = l2.a.c.a() ? new /* Unavailable Anonymous Inner Class!! */ : new /* Unavailable Anonymous Inner Class!! */;
        this.d = object;
        this.e = l2.a.a.d(new k.x.b.a<Set<? extends k.b0.x.b.x0.g.e>>(){

            public Object invoke() {
                return k.s.i.j0((Iterable)((Iterable)a2.invoke()));
            }
        });
        this.f = l2.a.a.f(new k.x.b.a<Set<? extends k.b0.x.b.x0.g.e>>(){

            public Object invoke() {
                Set<k.b0.x.b.x0.g.e> set = this.g();
                if (set == null) {
                    return null;
                }
                return k.s.i.O((Set)k.s.i.O(this.f(), this.d.a()), set);
            }
        });
    }

    public abstract void a(Collection<k.b0.x.b.x0.c.k> var1, k.x.b.l<? super k.b0.x.b.x0.g.e, Boolean> var2);

    public final Collection<k.b0.x.b.x0.c.k> b(k.b0.x.b.x0.j.a0.d d2, k.x.b.l<? super k.b0.x.b.x0.g.e, Boolean> l2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(d2, "kindFilter");
        k.x.c.i.e(l2, "nameFilter");
        k.x.c.i.e((Object)b2, "location");
        ArrayList arrayList = new ArrayList(0);
        if (d2.a(k.b0.x.b.x0.j.a0.d.d)) {
            this.a((Collection<k.b0.x.b.x0.c.k>)arrayList, l2);
        }
        this.d.b((Collection<k.b0.x.b.x0.c.k>)arrayList, d2, l2, b2);
        if (d2.a(k.b0.x.b.x0.j.a0.d.j)) {
            for (k.b0.x.b.x0.g.e e2 : this.f()) {
                if (!((Boolean)l2.invoke((Object)e2)).booleanValue()) continue;
                e.s.a.a.n((Collection)arrayList, (Object)this.c.a.b(this.e(e2)));
            }
        }
        if (d2.a(k.b0.x.b.x0.j.a0.d.e)) {
            for (k.b0.x.b.x0.g.e e3 : this.d.a()) {
                if (!((Boolean)l2.invoke((Object)e3)).booleanValue()) continue;
                e.s.a.a.n((Collection)arrayList, (Object)this.d.c(e3));
            }
        }
        return e.s.a.a.V((ArrayList)arrayList);
    }

    public void c(k.b0.x.b.x0.g.e e2, List<t0> list) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e(list, "functions");
    }

    public void d(k.b0.x.b.x0.g.e e2, List<n0> list) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e(list, "descriptors");
    }

    public abstract k.b0.x.b.x0.g.b e(k.b0.x.b.x0.g.e var1);

    public final Set<k.b0.x.b.x0.g.e> f() {
        return (Set)e.s.a.a.T1((k.b0.x.b.x0.l.i)this.e, b[0]);
    }

    public abstract Set<k.b0.x.b.x0.g.e> g();

    public Set<k.b0.x.b.x0.g.e> getClassifierNames() {
        k.b0.x.b.x0.l.j j2 = this.f;
        k<Object> k2 = b[1];
        k.x.c.i.e((Object)j2, "<this>");
        k.x.c.i.e(k2, "p");
        return (Set)j2.invoke();
    }

    public h getContributedClassifier(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        if (this.j(e2)) {
            return this.c.a.b(this.e(e2));
        }
        if (this.d.a().contains((Object)e2)) {
            return this.d.c(e2);
        }
        return null;
    }

    public Collection<t0> getContributedFunctions(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        return this.d.getContributedFunctions(e2, b2);
    }

    public Collection<n0> getContributedVariables(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        return this.d.getContributedVariables(e2, b2);
    }

    public Set<k.b0.x.b.x0.g.e> getFunctionNames() {
        return this.d.getFunctionNames();
    }

    public Set<k.b0.x.b.x0.g.e> getVariableNames() {
        return this.d.getVariableNames();
    }

    public abstract Set<k.b0.x.b.x0.g.e> h();

    public abstract Set<k.b0.x.b.x0.g.e> i();

    public boolean j(k.b0.x.b.x0.g.e e2) {
        k.x.c.i.e(e2, "name");
        return this.f().contains((Object)e2);
    }

    public boolean k(t0 t02) {
        k.x.c.i.e((Object)t02, "function");
        return true;
    }

}

