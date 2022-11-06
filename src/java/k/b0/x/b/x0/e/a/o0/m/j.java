/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.Set
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.e.a.o0.m.b$a
 *  k.b0.x.b.x0.e.a.q0.t
 *  k.b0.x.b.x0.l.h
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.l.j
 *  k.s.r
 *  k.s.t
 *  k.x.b.a
 *  k.x.b.l
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.e.a.o0.m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.e.a.o0.h;
import k.b0.x.b.x0.e.a.o0.m.b;
import k.b0.x.b.x0.e.a.o0.m.i;
import k.b0.x.b.x0.e.a.o0.m.j;
import k.b0.x.b.x0.e.a.o0.m.k;
import k.b0.x.b.x0.e.a.o0.m.s;
import k.b0.x.b.x0.e.a.q0.b0;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.o.g;
import k.s.r;
import k.s.t;
import k.x.b.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j
extends s {
    public final k.b0.x.b.x0.e.a.q0.t n;
    public final i o;
    public final k.b0.x.b.x0.l.j<Set<String>> p;
    public final k.b0.x.b.x0.l.h<a, e> q;

    public j(h h2, k.b0.x.b.x0.e.a.q0.t t2, i i2) {
        k.x.c.i.e(h2, "c");
        k.x.c.i.e((Object)t2, "jPackage");
        k.x.c.i.e(i2, "ownerDescriptor");
        super(h2);
        this.n = t2;
        this.o = i2;
        this.p = h2.a.a.f(new k.x.b.a<Set<? extends String>>(h2, this){
            public final /* synthetic */ h k;
            public final /* synthetic */ j l;
            {
                this.k = h2;
                this.l = j2;
                super(0);
            }

            public Object invoke() {
                return this.k.a.b.c(this.l.o.getFqName());
            }
        });
        this.q = h2.a.a.i(new l<a, e>(this, h2){
            public final /* synthetic */ j k;
            public final /* synthetic */ h l;
            {
                this.k = j2;
                this.l = h2;
                super(1);
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public Object invoke(Object var1_1) {
                block15 : {
                    block14 : {
                        var2_2 = var1_1;
                        k.x.c.i.e(var2_2, "request");
                        var3_3 = new k.b0.x.b.x0.g.b(this.k.o.getFqName(), var2_2.a);
                        var4_4 = var2_2.b;
                        var5_5 = var4_4 != null ? this.l.a.c.a(var4_4) : this.l.a.c.c(var3_3);
                        var6_6 = var5_5 == null ? null : var5_5.a();
                        var7_7 = var6_6 == null ? null : var6_6.c();
                        if (var7_7 != null) {
                            var39_8 = var7_7.k();
                            var27_9 = null;
                            if (var39_8 != false) return var27_9;
                            if (var7_7.c) {
                                return null;
                            }
                        }
                        var8_10 = this.k;
                        java.util.Objects.requireNonNull((Object)var8_10);
                        if (var6_6 == null) ** GOTO lbl-1000
                        if (var6_6.a().a == k.b0.x.b.x0.e.b.x.a$a.n) {
                            var32_11 = var8_10.c.a.d;
                            java.util.Objects.requireNonNull((Object)var32_11);
                            k.x.c.i.e(var6_6, "kotlinClass");
                            var34_12 = var32_11.f(var6_6);
                            if (var34_12 == null) {
                                var35_13 = null;
                            } else {
                                var36_14 = var32_11.c().t;
                                var37_15 = var6_6.c();
                                java.util.Objects.requireNonNull((Object)var36_14);
                                k.x.c.i.e(var37_15, "classId");
                                var35_13 = (e)var36_14.d.invoke((Object)new k.b0.x.b.x0.k.b.h$a(var37_15, var34_12));
                            }
                            ** if (var35_13 == null) goto lbl-1000
lbl-1000: // 1 sources:
                            {
                                var10_16 = new /* Unavailable Anonymous Inner Class!! */;
                                ** GOTO lbl38
                            }
                        }
                        break block14;
lbl-1000: // 2 sources:
                        {
                            var10_16 = k.b0.x.b.x0.e.a.o0.m.j$b$b.a;
                        }
                        break block15;
                    }
                    var10_16 = k.b0.x.b.x0.e.a.o0.m.j$b$c.a;
                }
                if (var10_16 instanceof k.b0.x.b.x0.e.a.o0.m.j$b$a) {
                    return (var10_16).a;
                }
                if (var10_16 instanceof k.b0.x.b.x0.e.a.o0.m.j$b$c) {
                    return null;
                }
                if (var10_16 instanceof k.b0.x.b.x0.e.a.o0.m.j$b$b == false) throw new k.g();
                var11_17 = var2_2.b;
                if (var11_17 == null) {
                    var30_18 = this.l.a.b;
                    if (var5_5 != null) {
                        if (!(var5_5 instanceof k.b0.x.b.x0.e.b.l$a$a)) {
                            var5_5 = null;
                        }
                        var5_5;
                    }
                    var11_17 = var30_18.a(new k.b0.x.b.x0.e.a.r$a(var3_3, null, null, 4));
                }
                if ((var12_19 = var11_17 == null ? null : var11_17.E()) == b0.l) {
                    var13_20 = new java.lang.StringBuilder();
                    var13_20.append("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                    var13_20.append((Object)var11_17);
                    var13_20.append("\nClassId: ");
                    var13_20.append((Object)var3_3);
                    var13_20.append("\nfindKotlinClass(JavaClass) = ");
                    var19_21 = this.l.a.c;
                    k.x.c.i.e((Object)var19_21, "<this>");
                    k.x.c.i.e(var11_17, "javaClass");
                    var20_22 = var19_21.a(var11_17);
                    var21_23 = var20_22 == null ? null : var20_22.a();
                    var13_20.append((Object)var21_23);
                    var13_20.append("\nfindKotlinClass(ClassId) = ");
                    var13_20.append((Object)e.s.a.a.V0((k.b0.x.b.x0.e.b.l)this.l.a.c, (k.b0.x.b.x0.g.b)var3_3));
                    var13_20.append('\n');
                    throw new java.lang.IllegalStateException(var13_20.toString());
                }
                var26_24 = var11_17 == null ? null : var11_17.getFqName();
                var27_9 = null;
                if (var26_24 == null) return var27_9;
                var28_25 = var26_24.d();
                var27_9 = null;
                if (var28_25 != false) return var27_9;
                if (!k.x.c.i.a(var26_24.e(), this.k.o.getFqName())) {
                    return null;
                }
                var29_26 = new k.b0.x.b.x0.e.a.o0.m.e(this.l, (k.b0.x.b.x0.c.k)this.k.o, var11_17, null);
                this.l.a.s.a(var29_26);
                return var29_26;
            }
        });
    }

    @Override
    public Set<k.b0.x.b.x0.g.e> a(k.b0.x.b.x0.j.a0.d d2, l<? super k.b0.x.b.x0.g.e, Boolean> object) {
        k.x.c.i.e(d2, "kindFilter");
        if (!d2.a(k.b0.x.b.x0.j.a0.d.c)) {
            return t.k;
        }
        Set set = (Set)this.p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                hashSet.add((Object)k.b0.x.b.x0.g.e.l((String)iterator.next()));
            }
            return hashSet;
        }
        k.b0.x.b.x0.e.a.q0.t t2 = this.n;
        if (object == null) {
            object = g.a;
        }
        Collection collection = t2.o(object);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k.b0.x.b.x0.e.a.q0.g g2 : collection) {
            k.b0.x.b.x0.g.e e2 = g2.E() == b0.k ? null : g2.getName();
            if (e2 == null) continue;
            linkedHashSet.add((Object)e2);
        }
        return linkedHashSet;
    }

    @Override
    public Set<k.b0.x.b.x0.g.e> b(k.b0.x.b.x0.j.a0.d d2, l<? super k.b0.x.b.x0.g.e, Boolean> l2) {
        k.x.c.i.e(d2, "kindFilter");
        return t.k;
    }

    @Override
    public k.b0.x.b.x0.e.a.o0.m.b d() {
        return b.a.a;
    }

    @Override
    public void f(Collection<t0> collection, k.b0.x.b.x0.g.e e2) {
        k.x.c.i.e(collection, "result");
        k.x.c.i.e(e2, "name");
    }

    public k.b0.x.b.x0.c.h getContributedClassifier(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        return this.o(e2, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public Collection<k.b0.x.b.x0.c.k> getContributedDescriptors(k.b0.x.b.x0.j.a0.d var1_1, l<? super k.b0.x.b.x0.g.e, Boolean> var2_2) {
        k.x.c.i.e(var1_1, "kindFilter");
        k.x.c.i.e(var2_2, "nameFilter");
        if (!var1_1.a(k.b0.x.b.x0.j.a0.d.j | k.b0.x.b.x0.j.a0.d.c)) {
            return r.k;
        }
        var4_3 = (Iterable)this.e.invoke();
        var5_4 = new ArrayList();
        var6_5 = var4_3.iterator();
        while (var6_5.hasNext() != false) {
            var7_6 = var6_5.next();
            var8_7 = (k.b0.x.b.x0.c.k)var7_6;
            if (!(var8_7 instanceof e)) ** GOTO lbl-1000
            var11_9 = ((e)var8_7).getName();
            k.x.c.i.d(var11_9, "it.name");
            if (((Boolean)var2_2.invoke((Object)var11_9)).booleanValue()) {
                var9_8 = true;
            } else lbl-1000: // 2 sources:
            {
                var9_8 = false;
            }
            if (!var9_8) continue;
            var5_4.add(var7_6);
        }
        return var5_4;
    }

    @Override
    public Collection<n0> getContributedVariables(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
        k.x.c.i.e(e2, "name");
        k.x.c.i.e((Object)b2, "location");
        return r.k;
    }

    @Override
    public Set<k.b0.x.b.x0.g.e> h(k.b0.x.b.x0.j.a0.d d2, l<? super k.b0.x.b.x0.g.e, Boolean> l2) {
        k.x.c.i.e(d2, "kindFilter");
        return t.k;
    }

    @Override
    public k.b0.x.b.x0.c.k j() {
        return this.o;
    }

    public final e o(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.e.a.q0.g g2) {
        k.x.c.i.e(e2, "name");
        String string = e2.e();
        k.x.c.i.d(string, "name.asString()");
        int n2 = string.length();
        boolean bl = true;
        boolean bl2 = n2 > 0 ? bl : false;
        if (!bl2 || e2.l) {
            bl = false;
        }
        if (!bl) {
            return null;
        }
        Set set = (Set)this.p.invoke();
        if (g2 == null && set != null && !set.contains((Object)e2.e())) {
            return null;
        }
        return (e)this.q.invoke(new Object(e2, g2){
            public final k.b0.x.b.x0.g.e a;
            public final k.b0.x.b.x0.e.a.q0.g b;
            {
                k.x.c.i.e(e2, "name");
                this.a = e2;
                this.b = g2;
            }

            public boolean equals(Object object) {
                return object instanceof a && k.x.c.i.a(this.a, (object).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }
        });
    }

}

