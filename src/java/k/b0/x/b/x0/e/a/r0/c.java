/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.k
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.e.a.o0.n.g
 *  k.b0.x.b.x0.e.a.r0.b
 *  k.b0.x.b.x0.e.a.r0.f
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.l0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.y0
 *  k.b0.x.b.x0.m.z
 *  k.s.i
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper
 */
package k.b0.x.b.x0.e.a.r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.i1.k;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.e.a.r0.d;
import k.b0.x.b.x0.e.a.r0.e;
import k.b0.x.b.x0.e.a.r0.f;
import k.b0.x.b.x0.e.a.r0.s;
import k.b0.x.b.x0.e.a.r0.u;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.l0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.p0;
import k.b0.x.b.x0.m.y0;
import k.b0.x.b.x0.m.z;
import k.g;
import k.x.b.l;
import k.x.c.i;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;

public final class c {
    public final k.b0.x.b.x0.e.a.o0.e a;

    public c(k.b0.x.b.x0.e.a.o0.e e2) {
        i.e(e2, "javaResolverSettings");
        this.a = e2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final b a(m0 var1_1, l<? super Integer, d> var2_2, int var3_3, s var4_4, boolean var5_5, boolean var6_6) {
        block35 : {
            block34 : {
                var7_7 = var2_2;
                var8_8 = e.s.a.a.K3((s)var4_4);
                var9_9 = !var6_6 || !var5_5;
                if (!var8_8 && var1_1.S().isEmpty()) {
                    return new b(null, 1, false);
                }
                var10_10 = var1_1.T().getDeclarationDescriptor();
                if (var10_10 == null) {
                    return new b(null, 1, false);
                }
                var11_11 = (d)var7_7.invoke((Object)var3_3);
                var13_12 = JavaToKotlinClassMapper.INSTANCE;
                if (!e.s.a.a.K3((s)var4_4) || !(var10_10 instanceof k.b0.x.b.x0.c.e)) ** GOTO lbl-1000
                if (var11_11.d == e.k && var4_4 == s.k && var13_12.isMutable(var61_13 = (k.b0.x.b.x0.c.e)var10_10)) {
                    var14_14 = var13_12.convertMutableToReadOnly(var61_13);
                } else if (var11_11.d == e.l && var4_4 == s.l && var13_12.isReadOnly(var60_15 = (k.b0.x.b.x0.c.e)var10_10)) {
                    var14_14 = var13_12.convertReadOnlyToMutable(var60_15);
                } else lbl-1000: // 2 sources:
                {
                    var14_14 = null;
                }
                if (!e.s.a.a.K3((s)var4_4)) ** GOTO lbl-1000
                var15_16 = var11_11.c;
                var16_17 = var15_16 == null ? -1 : u.a.a[var15_16.ordinal()];
                if (var16_17 != 1) {
                    ** if (var16_17 == 2) goto lbl-1000
                }
                break block34;
lbl-1000: // 2 sources:
                {
                    var17_18 = null;
                    ** GOTO lbl31
                }
lbl-1000: // 1 sources:
                {
                    var17_18 = Boolean.FALSE;
                }
                break block35;
            }
            var17_18 = Boolean.TRUE;
        }
        var18_19 = var14_14 == null ? var1_1.T() : var14_14.getTypeConstructor();
        i.d((Object)var18_19, "enhancedClassifier?.typeConstructor ?: constructor");
        var19_20 = var3_3 + 1;
        var20_21 = var1_1.S();
        var21_22 = var18_19.getParameters();
        i.d((Object)var21_22, "typeConstructor.parameters");
        var22_23 = var20_21.iterator();
        var23_24 = var21_22.iterator();
        var24_25 = new ArrayList(Math.min((int)e.s.a.a.U((Iterable)var20_21, (int)10), (int)e.s.a.a.U((Iterable)var21_22, (int)10)));
        while (var22_23.hasNext() && var23_24.hasNext()) {
            var51_26 = var22_23.next();
            var52_27 = (z0)var23_24.next();
            var53_28 = (b1)var51_26;
            if (!var9_9) {
                var54_29 = new a(null, 0);
            } else if (!var53_28.c()) {
                var54_29 = this.b(var53_28.b().W(), var7_7, var19_20, var6_6);
            } else if (((d)var7_7.invoke((Object)Integer.valueOf((int)var19_20))).c == k.b0.x.b.x0.e.a.r0.g.k) {
                var59_33 = var53_28.b().W();
                var54_29 = new a((f0)g0.c(e.s.a.a.P2((f0)var59_33).a0(false), e.s.a.a.w4((f0)var59_33).a0(true)), 1);
            } else {
                var54_29 = new a(null, 1);
            }
            var19_20 += var54_29.b;
            var55_30 = var54_29.a;
            if (var55_30 != null) ** GOTO lbl62
            if (var14_14 != null && !var53_28.c()) {
                var55_30 = var53_28.b();
                i.d((Object)var55_30, "arg.type");
lbl62: // 2 sources:
                var58_32 = var53_28.a();
                i.d((Object)var58_32, "arg.projectionKind");
                var56_31 = e.s.a.a.F0((f0)var55_30, (n1)var58_32, (z0)var52_27);
            } else {
                var56_31 = var14_14 != null ? j1.n(var52_27) : null;
            }
            var24_25.add((Object)var56_31);
            var7_7 = var2_2;
        }
        var25_34 = var19_20 - var3_3;
        if (var14_14 == null && var17_18 == null) {
            if (!var24_25.isEmpty()) {
                var48_35 = var24_25.iterator();
                while (var48_35.hasNext()) {
                    var50_36 = (b1)var48_35.next() == null;
                    if (var50_36) continue;
                    var49_37 = false;
                    break;
                }
            } else {
                var49_37 = true;
            }
            if (var49_37) {
                return new b(null, var25_34, false);
            }
        }
        var26_38 = new k.b0.x.b.x0.c.i1.h[3];
        var26_38[0] = var1_1.getAnnotations();
        var27_39 = u.b;
        var28_40 = var14_14 != null;
        if (!var28_40) {
            var27_39 = null;
        }
        var26_38[1] = var27_39;
        var29_41 = u.a;
        var30_42 = var17_18 != null;
        if (var30_42) {
            var31_43 = var29_41;
        } else {
            var31_44 = null;
        }
        var26_38[2] = var31_45;
        var32_46 = k.s.i.G((Object[])var26_38);
        var33_47 = ((ArrayList)var32_46).size();
        if (var33_47 == 0) throw new IllegalStateException("At least one Annotations object expected".toString());
        if (var33_47 != 1) {
            var34_48 = new k(k.s.i.b0((Iterable)var32_46));
        } else {
            var34_49 = (k.b0.x.b.x0.c.i1.h)k.s.i.T((List)var32_46);
        }
        var35_51 = var1_1.S();
        var36_52 = var24_25.iterator();
        var37_53 = var35_51.iterator();
        var38_54 = new ArrayList(Math.min((int)e.s.a.a.U((Iterable)var24_25, (int)10), (int)e.s.a.a.U((Iterable)var35_51, (int)10)));
        while (var36_52.hasNext() && var37_53.hasNext()) {
            var44_55 = var36_52.next();
            var45_56 = (b1)var37_53.next();
            var46_57 = (b1)var44_55;
            if (var46_57 != null) {
                var45_56 = var46_57;
            }
            var38_54.add((Object)var45_56);
        }
        var39_58 = var17_18 == null ? var1_1.U() : var17_18.booleanValue();
        var40_59 = g0.g((k.b0.x.b.x0.c.i1.h)var34_50, var18_19, (List)var38_54, var39_58, null, 16);
        if (var11_11.e) {
            if (this.a.a()) {
                var41_60 = true;
                var40_59 = p0.d(var40_59, var41_60);
            } else {
                var41_60 = true;
                var40_59 = new f(var40_59);
            }
        } else {
            var41_60 = true;
        }
        var42_61 = false;
        if (var17_18 == null) return new b(var40_59, var25_34, var42_61);
        var43_62 = var11_11.f;
        var42_61 = false;
        if (var43_62 == false) return new b(var40_59, var25_34, var42_61);
        var42_61 = var41_60;
        return new b(var40_59, var25_34, var42_61);
    }

    public final a b(m1 m12, l<? super Integer, d> l2, int n2, boolean bl) {
        if (e.s.a.a.s2((f0)m12)) {
            return new a(null, 1);
        }
        if (m12 instanceof z) {
            m1 m13;
            boolean bl2 = m12 instanceof l0;
            z z2 = (z)m12;
            b b2 = this.a(z2.l, l2, n2, s.k, bl2, bl);
            b b3 = this.a(z2.m, l2, n2, s.l, bl2, bl);
            m0 m02 = b2.a;
            if (m02 == null && b3.a == null) {
                m13 = null;
            } else if (!b2.c && !b3.c) {
                if (bl2) {
                    m0 m03;
                    if (m02 == null) {
                        m02 = z2.l;
                    }
                    if ((m03 = b3.a) == null) {
                        m03 = z2.m;
                    }
                    m13 = new k.b0.x.b.x0.e.a.o0.n.g(m02, m03);
                } else {
                    m0 m04;
                    if (m02 == null) {
                        m02 = z2.l;
                    }
                    if ((m04 = b3.a) == null) {
                        m04 = z2.m;
                    }
                    m13 = g0.c(m02, m04);
                }
            } else {
                m0 m05 = b3.a;
                if (m05 == null) {
                    i.c((Object)m02);
                } else {
                    if (m02 == null) {
                        m02 = m05;
                    }
                    m02 = g0.c(m02, m05);
                }
                m13 = e.s.a.a.y4((m1)m12, (f0)m02);
            }
            return new a((f0)m13, b2.b);
        }
        if (m12 instanceof m0) {
            b b4 = this.a((m0)m12, l2, n2, s.m, false, bl);
            Object object = b4.c ? e.s.a.a.y4((m1)m12, (f0)b4.a) : b4.a;
            return new a((f0)object, b4.b);
        }
        throw new g();
    }

    public static final class a {
        public final f0 a;
        public final int b;

        public a(f0 f02, int n2) {
            this.a = f02;
            this.b = n2;
        }
    }

    public static final class b {
        public final m0 a;
        public final int b;
        public final boolean c;

        public b(m0 m02, int n2, boolean bl) {
            this.a = m02;
            this.b = n2;
            this.c = bl;
        }
    }

}

