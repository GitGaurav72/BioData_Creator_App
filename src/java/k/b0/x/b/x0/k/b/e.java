/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  k.a0.c
 *  k.a0.d
 *  k.b0.x.b.x0.c.d
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.e0
 *  k.b0.x.b.x0.c.e1
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.i1.c
 *  k.b0.x.b.x0.c.i1.d
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.f.b
 *  k.b0.x.b.x0.f.b$b
 *  k.b0.x.b.x0.f.b$b$c
 *  k.b0.x.b.x0.f.b$b$c$c
 *  k.b0.x.b.x0.f.z.b$b
 *  k.b0.x.b.x0.j.w.a
 *  k.b0.x.b.x0.j.w.a0
 *  k.b0.x.b.x0.j.w.b
 *  k.b0.x.b.x0.j.w.c
 *  k.b0.x.b.x0.j.w.d
 *  k.b0.x.b.x0.j.w.e
 *  k.b0.x.b.x0.j.w.j
 *  k.b0.x.b.x0.j.w.k
 *  k.b0.x.b.x0.j.w.l
 *  k.b0.x.b.x0.j.w.l$a
 *  k.b0.x.b.x0.j.w.m
 *  k.b0.x.b.x0.j.w.n
 *  k.b0.x.b.x0.j.w.s
 *  k.b0.x.b.x0.j.w.t
 *  k.b0.x.b.x0.j.w.v
 *  k.b0.x.b.x0.j.w.w
 *  k.b0.x.b.x0.j.w.x
 *  k.b0.x.b.x0.j.w.y
 *  k.b0.x.b.x0.j.w.z
 *  k.b0.x.b.x0.k.b.m
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  k.s.s
 *  k.s.x
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.k.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b0.x.b.x0.c.d;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.e0;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.f.b;
import k.b0.x.b.x0.f.z.b;
import k.b0.x.b.x0.g.b;
import k.b0.x.b.x0.j.w.a0;
import k.b0.x.b.x0.j.w.c;
import k.b0.x.b.x0.j.w.g;
import k.b0.x.b.x0.j.w.j;
import k.b0.x.b.x0.j.w.l;
import k.b0.x.b.x0.j.w.n;
import k.b0.x.b.x0.j.w.t;
import k.b0.x.b.x0.j.w.v;
import k.b0.x.b.x0.j.w.w;
import k.b0.x.b.x0.j.w.z;
import k.b0.x.b.x0.k.b.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.i;
import k.s.s;
import k.s.x;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class e {
    public final d0 a;
    public final e0 b;

    public e(d0 d02, e0 e02) {
        k.x.c.i.e((Object)d02, "module");
        k.x.c.i.e((Object)e02, "notFoundClasses");
        this.a = d02;
        this.b = e02;
    }

    public final k.b0.x.b.x0.c.i1.c a(k.b0.x.b.x0.f.b b2, k.b0.x.b.x0.f.z.c c2) {
        k.x.c.i.e((Object)b2, "proto");
        k.x.c.i.e(c2, "nameResolver");
        b b3 = e.s.a.a.m1((k.b0.x.b.x0.f.z.c)c2, (int)b2.o);
        k.b0.x.b.x0.c.e e2 = e.s.a.a.W0((d0)this.a, (b)b3, (e0)this.b);
        s s2 = s.k;
        if (b2.p.size() != 0 && !y.i((k)e2) && k.b0.x.b.x0.j.g.m((k)e2)) {
            Collection collection = e2.getConstructors();
            k.x.c.i.d((Object)collection, "annotationClass.constructors");
            d d2 = (d)k.s.i.U((Iterable)collection);
            if (d2 != null) {
                List list = d2.getValueParameters();
                k.x.c.i.d((Object)list, "constructor.valueParameters");
                int n2 = e.s.a.a.R2((int)e.s.a.a.U((Iterable)list, (int)10));
                if (n2 < 16) {
                    n2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(n2);
                for (Object object : list) {
                    linkedHashMap.put((Object)((e1)object).getName(), object);
                }
                List list2 = b2.p;
                k.x.c.i.d((Object)list2, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (b.b b4 : list2) {
                    i i2;
                    k.x.c.i.d((Object)b4, "it");
                    e1 e12 = (e1)linkedHashMap.get((Object)e.s.a.a.J1((k.b0.x.b.x0.f.z.c)c2, (int)b4.o));
                    if (e12 == null) {
                        i2 = null;
                    } else {
                        k.b0.x.b.x0.g.e e3 = e.s.a.a.J1((k.b0.x.b.x0.f.z.c)c2, (int)b4.o);
                        f0 f02 = e12.b();
                        k.x.c.i.d((Object)f02, "parameter.type");
                        b.b.c c3 = b4.p;
                        k.x.c.i.d((Object)c3, "proto.value");
                        l.a a2 = this.c(f02, c3, c2);
                        boolean bl = this.b((g<?>)a2, f02, c3);
                        l.a a3 = null;
                        if (bl) {
                            a3 = a2;
                        }
                        if (a3 == null) {
                            StringBuilder stringBuilder = e.e.a.a.a.t((String)"Unexpected argument value: actual type ");
                            stringBuilder.append((Object)c3.o);
                            stringBuilder.append(" != expected type ");
                            stringBuilder.append((Object)f02);
                            String string = stringBuilder.toString();
                            k.x.c.i.e(string, "message");
                            a3 = new l.a(string);
                        }
                        i2 = new i(e3, (g<?>)a3);
                    }
                    if (i2 == null) continue;
                    arrayList.add(i2);
                }
                s2 = k.s.i.c0((Iterable)arrayList);
            }
        }
        return new k.b0.x.b.x0.c.i1.d((f0)e2.getDefaultType(), (Map)s2, u0.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b(g<?> g2, f0 f02, b.b.c c2) {
        b.b.c.c c3 = c2.o;
        int n2 = c3 == null ? -1 : a.a[c3.ordinal()];
        boolean bl = true;
        if (n2 != 10) {
            g g3;
            b.b.c c4;
            if (n2 != 13) {
                return k.x.c.i.a((Object)g2.a(this.a), (Object)f02);
            }
            boolean bl2 = g2 instanceof k.b0.x.b.x0.j.w.b && ((List)((k.b0.x.b.x0.j.w.b)g2).a).size() == c2.w.size() ? bl : false;
            if (!bl2) throw new IllegalStateException(k.x.c.i.k("Deserialized ArrayValue should have the same number of elements as the original array value: ", g2).toString());
            f0 f03 = this.a.getBuiltIns().getArrayElementType(f02);
            k.x.c.i.d((Object)f03, "builtIns.getArrayElementType(expectedType)");
            k.b0.x.b.x0.j.w.b b2 = (k.b0.x.b.x0.j.w.b)g2;
            Collection collection = (Collection)b2.a;
            k.x.c.i.e((Object)collection, "<this>");
            k.a0.d d2 = new k.a0.d(0, -1 + collection.size());
            if (d2 instanceof Collection && ((Collection)d2).isEmpty()) {
                return bl;
            }
            Iterator iterator = d2.iterator();
            do {
                if (!((k.a0.c)iterator).m) return bl;
                int n3 = ((x)iterator).nextInt();
                g3 = (g)((List)b2.a).get(n3);
                c4 = (b.b.c)c2.w.get(n3);
                k.x.c.i.d((Object)c4, "value.getArrayElement(i)");
            } while (this.b(g3, f03, c4));
            return false;
        } else {
            h h2 = f02.T().getDeclarationDescriptor();
            k.b0.x.b.x0.c.e e2 = h2 instanceof k.b0.x.b.x0.c.e ? (k.b0.x.b.x0.c.e)h2 : null;
            if (e2 == null) return bl;
            if (!KotlinBuiltIns.isKClass((k.b0.x.b.x0.c.e)e2)) return false;
            return bl;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final g<?> c(f0 f02, b.b.c c2, k.b0.x.b.x0.f.z.c c3) {
        StringBuilder stringBuilder;
        block18 : {
            k.x.c.i.e((Object)f02, "expectedType");
            k.x.c.i.e((Object)c2, "value");
            k.x.c.i.e(c3, "nameResolver");
            boolean bl = e.e.a.a.a.F(k.b0.x.b.x0.f.z.b.N, (int)c2.y, (String)"IS_UNSIGNED.get(value.flags)");
            b.b.c.c c4 = c2.o;
            int n2 = c4 == null ? -1 : a.a[c4.ordinal()];
            switch (n2) {
                default: {
                    stringBuilder = e.e.a.a.a.t((String)"Unsupported annotation argument type: ");
                    break block18;
                }
                case 13: {
                    List list = c2.w;
                    k.x.c.i.d((Object)list, "value.arrayElementList");
                    ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
                    Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        b.b.c c5 = (b.b.c)iterator.next();
                        m0 m02 = this.a.getBuiltIns().getAnyType();
                        k.x.c.i.d((Object)m02, "builtIns.anyType");
                        k.x.c.i.d((Object)c5, "it");
                        arrayList.add(this.c((f0)m02, c5, c3));
                    }
                    return new m((List)arrayList, f02);
                }
                case 12: {
                    k.b0.x.b.x0.f.b b2 = c2.v;
                    k.x.c.i.d((Object)b2, "value.annotation");
                    return new k.b0.x.b.x0.j.w.a(this.a(b2, c3));
                }
                case 11: {
                    return new k.b0.x.b.x0.j.w.k(e.s.a.a.m1((k.b0.x.b.x0.f.z.c)c3, (int)c2.t), e.s.a.a.J1((k.b0.x.b.x0.f.z.c)c3, (int)c2.u));
                }
                case 10: {
                    return new k.b0.x.b.x0.j.w.s(e.s.a.a.m1((k.b0.x.b.x0.f.z.c)c3, (int)c2.t), c2.x);
                }
                case 9: {
                    return new w(c3.b(c2.s));
                }
                case 8: {
                    boolean bl2 = c2.p != 0L;
                    return new c(bl2);
                }
                case 7: {
                    return new j(c2.r);
                }
                case 6: {
                    return new k.b0.x.b.x0.j.w.m(c2.q);
                }
                case 5: {
                    void var13_19;
                    long l2 = c2.p;
                    if (bl) {
                        z z2 = new z(l2);
                        return var13_19;
                    } else {
                        t t2 = new t(l2);
                    }
                    return var13_19;
                }
                case 4: {
                    int n3 = (int)c2.p;
                    if (!bl) return new n(n3);
                    return new k.b0.x.b.x0.j.w.y(n3);
                }
                case 3: {
                    short s2 = (short)c2.p;
                    if (!bl) return new v(s2);
                    return new a0(s2);
                }
                case 2: {
                    return new k.b0.x.b.x0.j.w.e((char)c2.p);
                }
                case 1: 
            }
            byte by = (byte)c2.p;
            if (!bl) return new k.b0.x.b.x0.j.w.d(by);
            return new k.b0.x.b.x0.j.w.x(by);
        }
        stringBuilder.append((Object)c2.o);
        stringBuilder.append(" (expected ");
        stringBuilder.append((Object)f02);
        stringBuilder.append(')');
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public final class a {
        public static final /* synthetic */ int[] a;

        public static {
            b.b.c.c.values();
            a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        }
    }

}

