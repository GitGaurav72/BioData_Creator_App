/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  k.b0.x.b.x0.j.w.b
 *  k.b0.x.b.x0.j.w.c
 *  k.b0.x.b.x0.j.w.d
 *  k.b0.x.b.x0.j.w.e
 *  k.b0.x.b.x0.j.w.i$a
 *  k.b0.x.b.x0.j.w.j
 *  k.b0.x.b.x0.j.w.m
 *  k.b0.x.b.x0.j.w.n
 *  k.b0.x.b.x0.j.w.t
 *  k.b0.x.b.x0.j.w.u
 *  k.b0.x.b.x0.j.w.v
 *  k.b0.x.b.x0.j.w.w
 *  k.s.i
 *  k.s.r
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
 */
package k.b0.x.b.x0.j.w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.j.w.b;
import k.b0.x.b.x0.j.w.c;
import k.b0.x.b.x0.j.w.d;
import k.b0.x.b.x0.j.w.e;
import k.b0.x.b.x0.j.w.g;
import k.b0.x.b.x0.j.w.i;
import k.b0.x.b.x0.j.w.j;
import k.b0.x.b.x0.j.w.m;
import k.b0.x.b.x0.j.w.n;
import k.b0.x.b.x0.j.w.t;
import k.b0.x.b.x0.j.w.u;
import k.b0.x.b.x0.j.w.v;
import k.b0.x.b.x0.j.w.w;
import k.s.r;
import k.x.b.l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

public final class i {
    public static final b a(List<?> list, PrimitiveType primitiveType) {
        List list2 = k.s.i.b0(list);
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            g<?> g2 = i.b(iterator.next());
            if (g2 == null) continue;
            arrayList.add(g2);
        }
        return new b((List)arrayList, (l)new a(primitiveType));
    }

    public static final g<?> b(Object object) {
        block54 : {
            r r2;
            PrimitiveType primitiveType;
            block23 : {
                block57 : {
                    r r3;
                    block58 : {
                        block55 : {
                            boolean[] arrbl;
                            block56 : {
                                int n2;
                                block49 : {
                                    block52 : {
                                        r r4;
                                        block53 : {
                                            block50 : {
                                                double[] arrd;
                                                block51 : {
                                                    block44 : {
                                                        block47 : {
                                                            r r5;
                                                            block48 : {
                                                                block45 : {
                                                                    float[] arrf;
                                                                    block46 : {
                                                                        block39 : {
                                                                            block42 : {
                                                                                r r6;
                                                                                block43 : {
                                                                                    block40 : {
                                                                                        char[] arrc;
                                                                                        block41 : {
                                                                                            block34 : {
                                                                                                block37 : {
                                                                                                    r r7;
                                                                                                    block38 : {
                                                                                                        block35 : {
                                                                                                            long[] arrl;
                                                                                                            block36 : {
                                                                                                                block29 : {
                                                                                                                    block32 : {
                                                                                                                        r r8;
                                                                                                                        block33 : {
                                                                                                                            block30 : {
                                                                                                                                int[] arrn;
                                                                                                                                block31 : {
                                                                                                                                    block24 : {
                                                                                                                                        block27 : {
                                                                                                                                            r r9;
                                                                                                                                            block28 : {
                                                                                                                                                block25 : {
                                                                                                                                                    short[] arrs;
                                                                                                                                                    block26 : {
                                                                                                                                                        block22 : {
                                                                                                                                                            if (object instanceof Byte) {
                                                                                                                                                                return new d(((Number)object).byteValue());
                                                                                                                                                            }
                                                                                                                                                            if (object instanceof Short) {
                                                                                                                                                                return new v(((Number)object).shortValue());
                                                                                                                                                            }
                                                                                                                                                            if (object instanceof Integer) {
                                                                                                                                                                return new n(((Number)object).intValue());
                                                                                                                                                            }
                                                                                                                                                            if (object instanceof Long) {
                                                                                                                                                                return new t(((Number)object).longValue());
                                                                                                                                                            }
                                                                                                                                                            if (object instanceof Character) {
                                                                                                                                                                return new e(((Character)object).charValue());
                                                                                                                                                            }
                                                                                                                                                            if (object instanceof Float) {
                                                                                                                                                                return new m(((Number)object).floatValue());
                                                                                                                                                            }
                                                                                                                                                            if (object instanceof Double) {
                                                                                                                                                                return new j(((Number)object).doubleValue());
                                                                                                                                                            }
                                                                                                                                                            if (object instanceof Boolean) {
                                                                                                                                                                return new c(((Boolean)object).booleanValue());
                                                                                                                                                            }
                                                                                                                                                            if (object instanceof String) {
                                                                                                                                                                return new w((String)object);
                                                                                                                                                            }
                                                                                                                                                            boolean bl = object instanceof byte[];
                                                                                                                                                            if (!bl) break block22;
                                                                                                                                                            byte[] arrby = (byte[])object;
                                                                                                                                                            k.x.c.i.e(arrby, "<this>");
                                                                                                                                                            int n3 = arrby.length;
                                                                                                                                                            if (n3 != 0) {
                                                                                                                                                                if (n3 != 1) {
                                                                                                                                                                    k.x.c.i.e(arrby, "<this>");
                                                                                                                                                                    r2 = new ArrayList(arrby.length);
                                                                                                                                                                    for (byte by : arrby) {
                                                                                                                                                                        r2.add((Object)by);
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    r2 = e.s.a.a.N2((Object)arrby[0]);
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                r2 = r.k;
                                                                                                                                                            }
                                                                                                                                                            primitiveType = PrimitiveType.BYTE;
                                                                                                                                                            break block23;
                                                                                                                                                        }
                                                                                                                                                        if (!(object instanceof short[])) break block24;
                                                                                                                                                        arrs = (short[])object;
                                                                                                                                                        k.x.c.i.e(arrs, "<this>");
                                                                                                                                                        int n4 = arrs.length;
                                                                                                                                                        if (n4 == 0) break block25;
                                                                                                                                                        if (n4 == 1) break block26;
                                                                                                                                                        k.x.c.i.e(arrs, "<this>");
                                                                                                                                                        r2 = new ArrayList(arrs.length);
                                                                                                                                                        int n5 = arrs.length;
                                                                                                                                                        while (n2 < n5) {
                                                                                                                                                            short s2 = arrs[n2];
                                                                                                                                                            ++n2;
                                                                                                                                                            r2.add((Object)s2);
                                                                                                                                                        }
                                                                                                                                                        break block27;
                                                                                                                                                    }
                                                                                                                                                    r9 = e.s.a.a.N2((Object)arrs[0]);
                                                                                                                                                    break block28;
                                                                                                                                                }
                                                                                                                                                r9 = r.k;
                                                                                                                                            }
                                                                                                                                            r2 = r9;
                                                                                                                                        }
                                                                                                                                        primitiveType = PrimitiveType.SHORT;
                                                                                                                                        break block23;
                                                                                                                                    }
                                                                                                                                    if (!(object instanceof int[])) break block29;
                                                                                                                                    arrn = (int[])object;
                                                                                                                                    k.x.c.i.e(arrn, "<this>");
                                                                                                                                    int n6 = arrn.length;
                                                                                                                                    if (n6 == 0) break block30;
                                                                                                                                    if (n6 == 1) break block31;
                                                                                                                                    k.x.c.i.e(arrn, "<this>");
                                                                                                                                    r2 = new ArrayList(arrn.length);
                                                                                                                                    int n7 = arrn.length;
                                                                                                                                    while (n2 < n7) {
                                                                                                                                        int n8 = arrn[n2];
                                                                                                                                        ++n2;
                                                                                                                                        r2.add((Object)n8);
                                                                                                                                    }
                                                                                                                                    break block32;
                                                                                                                                }
                                                                                                                                r8 = e.s.a.a.N2((Object)arrn[0]);
                                                                                                                                break block33;
                                                                                                                            }
                                                                                                                            r8 = r.k;
                                                                                                                        }
                                                                                                                        r2 = r8;
                                                                                                                    }
                                                                                                                    primitiveType = PrimitiveType.INT;
                                                                                                                    break block23;
                                                                                                                }
                                                                                                                if (!(object instanceof long[])) break block34;
                                                                                                                arrl = (long[])object;
                                                                                                                k.x.c.i.e(arrl, "<this>");
                                                                                                                int n9 = arrl.length;
                                                                                                                if (n9 == 0) break block35;
                                                                                                                if (n9 == 1) break block36;
                                                                                                                k.x.c.i.e(arrl, "<this>");
                                                                                                                r2 = new ArrayList(arrl.length);
                                                                                                                int n10 = arrl.length;
                                                                                                                while (n2 < n10) {
                                                                                                                    long l2 = arrl[n2];
                                                                                                                    ++n2;
                                                                                                                    r2.add((Object)l2);
                                                                                                                }
                                                                                                                break block37;
                                                                                                            }
                                                                                                            r7 = e.s.a.a.N2((Object)arrl[0]);
                                                                                                            break block38;
                                                                                                        }
                                                                                                        r7 = r.k;
                                                                                                    }
                                                                                                    r2 = r7;
                                                                                                }
                                                                                                primitiveType = PrimitiveType.LONG;
                                                                                                break block23;
                                                                                            }
                                                                                            if (!(object instanceof char[])) break block39;
                                                                                            arrc = (char[])object;
                                                                                            k.x.c.i.e(arrc, "<this>");
                                                                                            int n11 = arrc.length;
                                                                                            if (n11 == 0) break block40;
                                                                                            if (n11 == 1) break block41;
                                                                                            k.x.c.i.e(arrc, "<this>");
                                                                                            r2 = new ArrayList(arrc.length);
                                                                                            int n12 = arrc.length;
                                                                                            while (n2 < n12) {
                                                                                                char c2 = arrc[n2];
                                                                                                ++n2;
                                                                                                r2.add((Object)Character.valueOf((char)c2));
                                                                                            }
                                                                                            break block42;
                                                                                        }
                                                                                        r6 = e.s.a.a.N2((Object)Character.valueOf((char)arrc[0]));
                                                                                        break block43;
                                                                                    }
                                                                                    r6 = r.k;
                                                                                }
                                                                                r2 = r6;
                                                                            }
                                                                            primitiveType = PrimitiveType.CHAR;
                                                                            break block23;
                                                                        }
                                                                        if (!(object instanceof float[])) break block44;
                                                                        arrf = (float[])object;
                                                                        k.x.c.i.e(arrf, "<this>");
                                                                        int n13 = arrf.length;
                                                                        if (n13 == 0) break block45;
                                                                        if (n13 == 1) break block46;
                                                                        k.x.c.i.e(arrf, "<this>");
                                                                        r2 = new ArrayList(arrf.length);
                                                                        int n14 = arrf.length;
                                                                        while (n2 < n14) {
                                                                            float f2 = arrf[n2];
                                                                            ++n2;
                                                                            r2.add((Object)Float.valueOf((float)f2));
                                                                        }
                                                                        break block47;
                                                                    }
                                                                    r5 = e.s.a.a.N2((Object)Float.valueOf((float)arrf[0]));
                                                                    break block48;
                                                                }
                                                                r5 = r.k;
                                                            }
                                                            r2 = r5;
                                                        }
                                                        primitiveType = PrimitiveType.FLOAT;
                                                        break block23;
                                                    }
                                                    if (!(object instanceof double[])) break block49;
                                                    arrd = (double[])object;
                                                    k.x.c.i.e(arrd, "<this>");
                                                    int n15 = arrd.length;
                                                    if (n15 == 0) break block50;
                                                    if (n15 == 1) break block51;
                                                    k.x.c.i.e(arrd, "<this>");
                                                    r2 = new ArrayList(arrd.length);
                                                    int n16 = arrd.length;
                                                    while (n2 < n16) {
                                                        double d2 = arrd[n2];
                                                        ++n2;
                                                        r2.add((Object)d2);
                                                    }
                                                    break block52;
                                                }
                                                r4 = e.s.a.a.N2((Object)arrd[0]);
                                                break block53;
                                            }
                                            r4 = r.k;
                                        }
                                        r2 = r4;
                                    }
                                    primitiveType = PrimitiveType.DOUBLE;
                                    break block23;
                                }
                                if (!(object instanceof boolean[])) break block54;
                                arrbl = (boolean[])object;
                                k.x.c.i.e(arrbl, "<this>");
                                int n17 = arrbl.length;
                                if (n17 == 0) break block55;
                                if (n17 == 1) break block56;
                                k.x.c.i.e(arrbl, "<this>");
                                r2 = new ArrayList(arrbl.length);
                                int n18 = arrbl.length;
                                while (n2 < n18) {
                                    boolean bl = arrbl[n2];
                                    ++n2;
                                    r2.add((Object)bl);
                                }
                                break block57;
                            }
                            r3 = e.s.a.a.N2((Object)arrbl[0]);
                            break block58;
                        }
                        r3 = r.k;
                    }
                    r2 = r3;
                }
                primitiveType = PrimitiveType.BOOLEAN;
            }
            return i.a(r2, primitiveType);
        }
        if (object == null) {
            return new u();
        }
        return null;
    }
}

