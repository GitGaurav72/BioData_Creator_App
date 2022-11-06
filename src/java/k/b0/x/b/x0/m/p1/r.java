/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.j.w.o
 *  k.b0.x.b.x0.m.d0
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.a
 *  k.b0.x.b.x0.m.p1.f
 *  k.b0.x.b.x0.m.p1.h
 *  k.b0.x.b.x0.m.p1.j
 *  k.b0.x.b.x0.m.p1.k
 *  k.b0.x.b.x0.m.p1.n
 *  k.b0.x.b.x0.m.p1.r$a$a
 *  k.b0.x.b.x0.m.p1.r$a$b
 *  k.b0.x.b.x0.m.p1.r$a$c
 *  k.b0.x.b.x0.m.p1.r$a$d
 *  k.b0.x.b.x0.m.p1.s
 *  k.b0.x.b.x0.m.p1.t
 *  k.b0.x.b.x0.m.p1.u
 *  k.b0.x.b.x0.m.r
 *  k.b0.x.b.x0.m.r1.j
 *  k.b0.x.b.x0.m.t0
 *  k.b0.x.b.x0.m.x0$a$b
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  k.x.b.p
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.m.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.j.w.o;
import k.b0.x.b.x0.m.c;
import k.b0.x.b.x0.m.d0;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p0;
import k.b0.x.b.x0.m.p1.f;
import k.b0.x.b.x0.m.p1.h;
import k.b0.x.b.x0.m.p1.j;
import k.b0.x.b.x0.m.p1.k;
import k.b0.x.b.x0.m.p1.n;
import k.b0.x.b.x0.m.p1.r;
import k.b0.x.b.x0.m.p1.s;
import k.b0.x.b.x0.m.p1.t;
import k.b0.x.b.x0.m.p1.u;
import k.b0.x.b.x0.m.r1.b;
import k.b0.x.b.x0.m.t0;
import k.b0.x.b.x0.m.x0;
import k.b0.x.b.x0.m.y0;
import k.s.i;
import k.x.b.p;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r {
    public static final r a = new r();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Collection<m0> a(Collection<? extends m0> var1_1, p<? super m0, ? super m0, Boolean> var2_2) {
        var3_3 = new ArrayList(var1_1);
        var4_4 = var3_3.iterator();
        k.x.c.i.d((Object)var4_4, "filteredTypes.iterator()");
        while (var4_4.hasNext() != false) {
            block4 : {
                block5 : {
                    var5_5 = (m0)var4_4.next();
                    var6_6 = var3_3.isEmpty();
                    var7_7 = true;
                    if (var6_6) break block5;
                    for (m0 var9_9 : var3_3) {
                        if (var9_9 == var5_5) ** GOTO lbl-1000
                        k.x.c.i.d((Object)var9_9, "lower");
                        k.x.c.i.d((Object)var5_5, "upper");
                        if (((Boolean)var2_2.invoke((Object)var9_9, (Object)var5_5)).booleanValue()) {
                            var10_10 = var7_7;
                        } else lbl-1000: // 2 sources:
                        {
                            var10_10 = false;
                        }
                        if (!var10_10) continue;
                        break block4;
                    }
                }
                var7_7 = false;
            }
            if (!var7_7) continue;
            var4_4.remove();
        }
        return var3_3;
    }

    public final m0 b(List<? extends m0> list) {
        block22 : {
            m0 m02;
            block23 : {
                LinkedHashSet linkedHashSet;
                block24 : {
                    Object object;
                    block19 : {
                        Collection<m0> collection;
                        block21 : {
                            ArrayList arrayList;
                            block20 : {
                                block18 : {
                                    k.x.c.i.e(list, "types");
                                    list.size();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (m0 m03 : list) {
                                        if (m03.T() instanceof d0) {
                                            Collection collection2 = m03.T().getSupertypes();
                                            k.x.c.i.d((Object)collection2, "type.constructor.supertypes");
                                            ArrayList arrayList3 = new ArrayList(e.s.a.a.U((Iterable)collection2, (int)10));
                                            for (f0 f02 : collection2) {
                                                k.x.c.i.d((Object)f02, "it");
                                                m0 m04 = e.s.a.a.w4((f0)f02);
                                                if (m03.U()) {
                                                    m04 = m04.a0(true);
                                                }
                                                arrayList3.add((Object)m04);
                                            }
                                            arrayList2.addAll((Collection)arrayList3);
                                            continue;
                                        }
                                        arrayList2.add((Object)m03);
                                    }
                                    a a2 = a.k;
                                    Iterator iterator = arrayList2.iterator();
                                    while (iterator.hasNext()) {
                                        a2 = a2.b((m1)iterator.next());
                                    }
                                    linkedHashSet = new LinkedHashSet();
                                    for (m0 m05 : arrayList2) {
                                        if (a2 == a.n) {
                                            if (m05 instanceof f) {
                                                f f2 = (f)m05;
                                                k.x.c.i.e((Object)f2, "<this>");
                                                f f3 = new f(f2.l, f2.m, f2.n, f2.o, f2.p, true);
                                                m05 = f3;
                                            }
                                            m05 = p0.d(m05, false);
                                        }
                                        linkedHashSet.add((Object)m05);
                                    }
                                    if (linkedHashSet.size() != 1) break block18;
                                    object = i.S((Iterable)linkedHashSet);
                                    break block19;
                                }
                                new s((Set)linkedHashSet);
                                collection = this.a((Collection<? extends m0>)linkedHashSet, (p<? super m0, ? super m0, Boolean>)new t((Object)this));
                                arrayList = (ArrayList)collection;
                                arrayList.isEmpty();
                                k.x.c.i.e(collection, "types");
                                if (!arrayList.isEmpty()) break block20;
                                m02 = null;
                                break block21;
                            }
                            Iterator iterator = arrayList.iterator();
                            if (!iterator.hasNext()) break block22;
                            Object object2 = iterator.next();
                            while (iterator.hasNext()) {
                                m0 m06 = (m0)iterator.next();
                                if ((object2 = (m0)object2) != null && m06 != null) {
                                    y0 y02 = object2.T();
                                    y0 y03 = m06.T();
                                    boolean bl = y02 instanceof o;
                                    if (bl && y03 instanceof o) {
                                        o o2 = (o)y02;
                                        o o3 = (o)y03;
                                        Set set = o2.c;
                                        Set set2 = o3.c;
                                        k.x.c.i.e((Object)set, "<this>");
                                        k.x.c.i.e((Object)set2, "other");
                                        Set set3 = i.i0((Iterable)set);
                                        i.b((Collection)set3, (Iterable)set2);
                                        o o4 = new o(o2.a, o2.b, set3);
                                        Objects.requireNonNull((Object)k.b0.x.b.x0.c.i1.h.g);
                                        object2 = g0.d(h.a.b, o4, false);
                                        continue;
                                    }
                                    if (bl) {
                                        if (((o)y02).c.contains((Object)m06)) {
                                            object2 = m06;
                                            continue;
                                        }
                                    } else if (y03 instanceof o && ((o)y03).c.contains(object2)) continue;
                                }
                                object2 = null;
                            }
                            m02 = (m0)object2;
                        }
                        if (m02 != null) break block23;
                        Objects.requireNonNull((Object)j.b);
                        Collection<m0> collection3 = this.a(collection, (p<? super m0, ? super m0, Boolean>)new u((Object)j.a.b));
                        ArrayList arrayList = (ArrayList)collection3;
                        arrayList.isEmpty();
                        if (arrayList.size() >= 2) break block24;
                        object = i.S(collection3);
                    }
                    return (m0)object;
                }
                m02 = new d0((Collection)linkedHashSet).b();
            }
            return m02;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /*
     * Exception performing whole class analysis.
     */
    public static final abstract class k.b0.x.b.x0.m.p1.r$a
    extends Enum<k.b0.x.b.x0.m.p1.r$a> {
        public static final /* enum */ k.b0.x.b.x0.m.p1.r$a k;
        public static final /* enum */ k.b0.x.b.x0.m.p1.r$a l;
        public static final /* enum */ k.b0.x.b.x0.m.p1.r$a m;
        public static final /* enum */ k.b0.x.b.x0.m.p1.r$a n;
        public static final /* synthetic */ k.b0.x.b.x0.m.p1.r$a[] o;

        public static {
            c c2 = new /* Unavailable Anonymous Inner Class!! */;
            k = c2;
            a a2 = new /* Unavailable Anonymous Inner Class!! */;
            l = a2;
            d d2 = new /* Unavailable Anonymous Inner Class!! */;
            m = d2;
            b b2 = new /* Unavailable Anonymous Inner Class!! */;
            n = b2;
            o = new k.b0.x.b.x0.m.p1.r$a[]{c2, a2, d2, b2};
        }

        public k.b0.x.b.x0.m.p1.r$a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static k.b0.x.b.x0.m.p1.r$a valueOf(String string) {
            return (k.b0.x.b.x0.m.p1.r$a)Enum.valueOf(k.b0.x.b.x0.m.p1.r$a.class, (String)string);
        }

        public static k.b0.x.b.x0.m.p1.r$a[] values() {
            return (k.b0.x.b.x0.m.p1.r$a[])o.clone();
        }

        public abstract k.b0.x.b.x0.m.p1.r$a b(m1 var1);

        public final k.b0.x.b.x0.m.p1.r$a e(m1 m12) {
            k.b0.x.b.x0.m.p1.r$a a2 = n;
            k.b0.x.b.x0.m.p1.r$a a3 = m;
            k.x.c.i.e((Object)m12, "<this>");
            if (m12.U()) {
                return l;
            }
            if (m12 instanceof k.b0.x.b.x0.m.r && ((k.b0.x.b.x0.m.r)m12).m instanceof t0) {
                return a2;
            }
            if (!(m12 instanceof t0)) {
                k.x.c.i.e((Object)m12, "type");
                n n2 = n.a;
                k.x.c.i.e((Object)n2, "this");
                if (k.b0.x.b.x0.m.c.a(e.s.a.a.t0((boolean)false, (boolean)true, (k.b0.x.b.x0.m.p1.a)n2, null, null, (int)24), (k.b0.x.b.x0.m.r1.j)e.s.a.a.P2((f0)m12), (x0.a)x0.a.b.a)) {
                    return a2;
                }
            }
            return a3;
        }
    }

}

