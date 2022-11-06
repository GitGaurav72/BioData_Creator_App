/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  k.b0.x.b.x0.m.r1.a
 *  k.b0.x.b.x0.m.r1.c
 *  k.b0.x.b.x0.m.r1.d
 *  k.b0.x.b.x0.m.r1.e
 *  k.b0.x.b.x0.m.r1.g
 *  k.b0.x.b.x0.m.r1.h
 *  k.b0.x.b.x0.m.r1.j
 *  k.b0.x.b.x0.m.r1.o
 *  k.b0.x.b.x0.m.r1.q
 *  k.b0.x.b.x0.m.x0$a$b
 *  k.b0.x.b.x0.m.x0$a$c
 *  k.b0.x.b.x0.m.x0$a$d
 *  k.s.i
 *  k.s.r
 */
package k.b0.x.b.x0.m;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k.b0.x.b.x0.m.c;
import k.b0.x.b.x0.m.d;
import k.b0.x.b.x0.m.r1.a;
import k.b0.x.b.x0.m.r1.b;
import k.b0.x.b.x0.m.r1.e;
import k.b0.x.b.x0.m.r1.h;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.r1.j;
import k.b0.x.b.x0.m.r1.k;
import k.b0.x.b.x0.m.r1.l;
import k.b0.x.b.x0.m.r1.m;
import k.b0.x.b.x0.m.r1.n;
import k.b0.x.b.x0.m.r1.o;
import k.b0.x.b.x0.m.r1.q;
import k.b0.x.b.x0.m.r1.r;
import k.b0.x.b.x0.m.x0;
import k.g;

public final class f {
    public static final f a = new f();

    public static final boolean a(o o2, x0 x02, j j2, j j3, boolean bl) {
        Collection collection = o2.s(j2);
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (i i2 : collection) {
                boolean bl2 = k.x.c.i.a(o2.t(i2), o2.b(j3)) || bl && f.h(a, x02, (i)j3, i2, false, 8);
                if (!bl2) continue;
                return true;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean h(f var0, x0 var1_1, i var2_2, i var3_3, boolean var4_4, int var5_5) {
        block97 : {
            block96 : {
                block72 : {
                    block92 : {
                        block73 : {
                            block94 : {
                                block95 : {
                                    block93 : {
                                        block91 : {
                                            block90 : {
                                                block89 : {
                                                    block88 : {
                                                        block86 : {
                                                            block85 : {
                                                                block74 : {
                                                                    block76 : {
                                                                        block84 : {
                                                                            block83 : {
                                                                                block81 : {
                                                                                    block82 : {
                                                                                        block77 : {
                                                                                            block80 : {
                                                                                                block79 : {
                                                                                                    block78 : {
                                                                                                        block75 : {
                                                                                                            k.x.c.i.e(var1_1, "state");
                                                                                                            k.x.c.i.e(var2_2, "subType");
                                                                                                            k.x.c.i.e(var3_3, "superType");
                                                                                                            var6_6 = true;
                                                                                                            if (var2_2 == var3_3) {
                                                                                                                return var6_6;
                                                                                                            }
                                                                                                            k.x.c.i.e(var2_2, "subType");
                                                                                                            k.x.c.i.e(var3_3, "superType");
                                                                                                            var7_7 = var1_1.d;
                                                                                                            var8_8 = var1_1.d(var1_1.e(var2_2));
                                                                                                            var9_9 = var1_1.d(var1_1.e(var3_3));
                                                                                                            var10_10 = f.a;
                                                                                                            var11_11 = var7_7.Z(var8_8);
                                                                                                            var12_12 = var7_7.N(var9_9);
                                                                                                            var13_13 = var1_1.d;
                                                                                                            if (var13_13.R((i)var11_11) || var13_13.R((i)var12_12)) break block74;
                                                                                                            if (!var13_13.m0(var11_11) || !var13_13.m0(var12_12)) break block75;
                                                                                                            var135_14 = var13_13.i0(var11_11);
                                                                                                            var136_15 = var135_14 == null ? var11_11 : var13_13.D(var135_14);
                                                                                                            var137_16 = var13_13.i0(var12_12);
                                                                                                            var138_17 = var137_16 == null ? var12_12 : var13_13.D(var137_16);
                                                                                                            var139_18 = var13_13.b(var136_15) != var13_13.b(var138_17) || var13_13.y((i)var11_11) == false && var13_13.y((i)var12_12) != false || var13_13.Q(var11_11) != false && var13_13.Q(var12_12) == false ? false : var6_6;
                                                                                                            if (!var139_18 && !var1_1.b) ** GOTO lbl-1000
                                                                                                            ** GOTO lbl91
                                                                                                        }
                                                                                                        if (var13_13.d0(var11_11) || var13_13.d0(var12_12)) break block76;
                                                                                                        var120_19 = var13_13.i0(var12_12);
                                                                                                        var121_20 = var120_19 == null ? var12_12 : var13_13.D(var120_19);
                                                                                                        var122_21 = var13_13.e(var121_20);
                                                                                                        var123_22 = var122_21 == null ? null : var13_13.O(var122_21);
                                                                                                        if (var122_21 == null || var123_22 == null) break block77;
                                                                                                        if (!var13_13.Q(var12_12)) break block78;
                                                                                                        var134_23 = var13_13.C(var123_22, var6_6);
                                                                                                        break block79;
                                                                                                    }
                                                                                                    if (!var13_13.y((i)var12_12)) break block80;
                                                                                                    var134_23 = var13_13.K(var123_22);
                                                                                                }
                                                                                                var123_22 = var134_23;
                                                                                            }
                                                                                            k.x.c.i.e((Object)var11_11, "subType");
                                                                                            k.x.c.i.e((Object)var122_21, "superType");
                                                                                            if (f.h(var10_10, var1_1, (i)var11_11, var123_22, false, 8)) ** GOTO lbl-1000
                                                                                        }
                                                                                        if (!var13_13.S(var124_24 = var13_13.b(var12_12))) break block81;
                                                                                        var13_13.Q(var12_12);
                                                                                        var131_25 = var13_13.q(var124_24);
                                                                                        if (!(var131_25 instanceof Collection) || !var131_25.isEmpty()) {
                                                                                            for (i var133_27 : var131_25) {
                                                                                                if (f.h(f.a, var1_1, (i)var11_11, var133_27, false, 8)) continue;
                                                                                            }
                                                                                        }
                                                                                        break block82;
lbl-1000: // 2 sources:
                                                                                        {
                                                                                            var6_6 = false;
                                                                                            ** GOTO lbl91
                                                                                        }
                                                                                    }
                                                                                    var6_6 = true;
                                                                                    ** GOTO lbl91
                                                                                }
                                                                                var125_28 = var13_13.b(var11_11);
                                                                                if (var11_11 instanceof k.b0.x.b.x0.m.r1.d) break block83;
                                                                                if (!var13_13.S(var125_28)) break block84;
                                                                                var127_29 = var13_13.q(var125_28);
                                                                                if (!(var127_29 instanceof Collection) || !var127_29.isEmpty()) {
                                                                                    var128_30 = var127_29.iterator();
                                                                                    while (var128_30.hasNext()) {
                                                                                        if ((i)var128_30.next() instanceof k.b0.x.b.x0.m.r1.d) continue;
                                                                                        var129_31 = false;
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    var129_31 = true;
                                                                                }
                                                                                if (!var129_31) break block84;
                                                                            }
                                                                            if ((var126_32 = f.a.e(var1_1.d, (i)var12_12, (i)var11_11)) != null && var13_13.l(var126_32, var13_13.b(var12_12))) ** GOTO lbl-1000
                                                                        }
                                                                        var16_33 = null;
                                                                        break block85;
                                                                    }
                                                                    var6_6 = var1_1.b;
                                                                    ** GOTO lbl91
                                                                }
                                                                if (var1_1.a) lbl-1000: // 3 sources:
                                                                {
                                                                    var16_33 = Boolean.TRUE;
                                                                } else if (var13_13.Q(var11_11) && !var13_13.Q(var12_12)) {
                                                                    var16_33 = Boolean.FALSE;
                                                                } else {
                                                                    var14_34 = var13_13.c(var11_11, false);
                                                                    var15_35 = var13_13.c(var12_12, false);
                                                                    k.x.c.i.e((Object)var13_13, "context");
                                                                    k.x.c.i.e((Object)var14_34, "a");
                                                                    k.x.c.i.e((Object)var15_35, "b");
                                                                    var6_6 = d.b(var13_13, (i)var14_34, (i)var15_35);
lbl91: // 5 sources:
                                                                    var16_33 = var6_6;
                                                                }
                                                            }
                                                            if (var16_33 != null) {
                                                                var17_107 = var16_33;
                                                                var1_1.a(var8_8, var9_9);
                                                                return var17_107;
                                                            }
                                                            var1_1.a(var8_8, var9_9);
                                                            var20_36 = var7_7.Z(var8_8);
                                                            var21_37 = var7_7.N(var9_9);
                                                            var22_38 = var1_1.d;
                                                            k.x.c.i.e(var1_1, "state");
                                                            k.x.c.i.e((Object)var20_36, "subType");
                                                            k.x.c.i.e((Object)var21_37, "superType");
                                                            var23_39 = var1_1.d;
                                                            var24_40 = var23_39.Q(var21_37);
                                                            var25_41 = 1000;
                                                            if (var24_40 || var23_39.y((i)var20_36) || var20_36 instanceof k.b0.x.b.x0.m.r1.d && var23_39.i((k.b0.x.b.x0.m.r1.d)var20_36) || c.a(var1_1, var20_36, (x0.a)x0.a.b.a)) break block86;
                                                            if (var23_39.y((i)var21_37) || c.a(var1_1, var21_37, (x0.a)x0.a.d.a) || var23_39.l0(var20_36)) return false;
                                                            var26_42 = var23_39.b(var21_37);
                                                            k.x.c.i.e(var1_1, "state");
                                                            k.x.c.i.e((Object)var20_36, "start");
                                                            k.x.c.i.e(var26_42, "end");
                                                            var27_43 = var1_1.d;
                                                            if (var27_43.X((i)var20_36)) ** GOTO lbl-1000
                                                            if (var27_43.Q(var20_36)) {
                                                                var28_44 = false;
                                                            } else if (var1_1.b && var27_43.d0(var20_36)) lbl-1000: // 2 sources:
                                                            {
                                                                var28_44 = true;
                                                            } else {
                                                                var28_44 = var27_43.p0(var27_43.b(var20_36), var26_42);
                                                            }
                                                            if (var28_44) break block86;
                                                            var1_1.c();
                                                            var29_45 = var1_1.i;
                                                            k.x.c.i.c(var29_45);
                                                            var30_46 = var1_1.j;
                                                            k.x.c.i.c(var30_46);
                                                            var29_45.push((Object)var20_36);
                                                            block2 : do {
                                                                if (true ^ var29_45.isEmpty()) {
                                                                    if (var30_46.size() > var25_41) {
                                                                        var107_58 = e.e.a.a.a.z((String)"Too many supertypes for type: ", (j)var20_36, (String)". Supertypes = ");
                                                                        var107_58.append(k.s.i.A(var30_46, null, null, null, (int)0, null, null, (int)63));
                                                                        throw new IllegalStateException(var107_58.toString().toString());
                                                                    }
                                                                    var109_47 = (j)var29_45.pop();
                                                                    k.x.c.i.d((Object)var109_47, "current");
                                                                    if (!var30_46.add((Object)var109_47)) continue;
                                                                    var110_48 /* !! */  = var27_43.Q(var109_47) != false ? x0.a.c.a : x0.a.b.a;
                                                                    if (!(true ^ k.x.c.i.a((Object)var110_48 /* !! */ , (Object)x0.a.c.a))) {
                                                                        var110_48 /* !! */  = null;
                                                                    }
                                                                    if (var110_48 /* !! */  != null) {
                                                                        var111_49 = var1_1.d;
                                                                        var112_50 = var111_49.q(var111_49.b(var109_47)).iterator();
                                                                        break;
                                                                    }
                                                                } else {
                                                                    var1_1.b();
                                                                    return false;
                                                                }
                                                                do {
                                                                    var119_56 = var27_43;
                                                                    var25_41 = 1000;
                                                                    var27_43 = var119_56;
                                                                    continue block2;
                                                                    break;
                                                                } while (true);
                                                                break;
                                                            } while (true);
                                                            do {
                                                                block87 : {
                                                                    if (!var112_50.hasNext()) ** continue;
                                                                    var113_51 = var110_48 /* !! */ .a(var1_1, (i)var112_50.next());
                                                                    var114_52 = var27_43;
                                                                    var115_53 = var1_1.d;
                                                                    if (!var115_53.X((i)var113_51)) break block87;
                                                                    var116_54 = var110_48 /* !! */ ;
                                                                    ** GOTO lbl-1000
                                                                }
                                                                if (var115_53.Q(var113_51)) {
                                                                    var116_54 = var110_48 /* !! */ ;
                                                                    var117_55 = false;
                                                                } else {
                                                                    var116_54 = var110_48 /* !! */ ;
                                                                    if (var1_1.b && var115_53.d0(var113_51)) lbl-1000: // 2 sources:
                                                                    {
                                                                        var117_55 = true;
                                                                    } else {
                                                                        var117_55 = var115_53.p0(var115_53.b(var113_51), var26_42);
                                                                    }
                                                                }
                                                                if (var117_55) {
                                                                    var1_1.b();
                                                                    break;
                                                                }
                                                                var29_45.add((Object)var113_51);
                                                                var110_48 /* !! */  = var116_54;
                                                                var27_43 = var114_52;
                                                            } while (true);
                                                        }
                                                        var31_57 = true;
                                                        if (!var31_57) {
                                                            return false;
                                                        }
                                                        var32_59 = var22_38.Z((i)var20_36);
                                                        var33_60 = var22_38.N((i)var21_37);
                                                        var34_61 = var1_1.d;
                                                        if (var34_61.E(var32_59) || var34_61.E(var33_60)) break block88;
                                                        var36_62 = null;
                                                        break block89;
                                                    }
                                                    if (!var34_61.E(var32_59) || !var34_61.E(var33_60)) break block90;
                                                    var36_62 = Boolean.TRUE;
                                                }
                                                var35_63 = 0;
                                                break block72;
                                            }
                                            if (!var34_61.E(var32_59)) break block91;
                                            if (!f.a(var34_61, var1_1, var32_59, var33_60, false)) break block92;
                                            break block93;
                                        }
                                        if (!var34_61.E(var33_60)) break block92;
                                        var100_64 = var34_61.b(var32_59);
                                        if (!(var100_64 instanceof h)) ** GOTO lbl-1000
                                        var102_66 = var34_61.q(var100_64);
                                        if (var102_66 instanceof Collection && var102_66.isEmpty()) break block94;
                                        var103_67 = var102_66.iterator();
                                        break block95;
                                    }
lbl207: // 2 sources:
                                    do {
                                        var35_63 = 0;
                                        var36_62 = Boolean.TRUE;
                                        break block72;
                                        break;
                                    } while (true);
                                }
                                while (var103_67.hasNext()) {
                                    var105_69 = var34_61.a((i)var103_67.next());
                                    var106_70 = var105_69 != null && var34_61.E(var105_69) == true;
                                    if (!var106_70) continue;
                                    var104_68 = true;
                                    break block73;
                                }
                            }
                            var104_68 = false;
                        }
                        if (var104_68) {
                            var101_65 = true;
                        } else lbl-1000: // 2 sources:
                        {
                            var101_65 = false;
                        }
                        ** while (var101_65 || f.a((o)var34_61, (x0)var1_1, (j)var33_60, (j)var32_59, (boolean)true))
                    }
                    var35_63 = 0;
                    var36_62 = null;
                }
                if (var36_62 != null) {
                    var37_118 = var36_62;
                    var1_1.a((i)var20_36, (i)var21_37);
                    return var37_118;
                }
                var39_71 = var22_38.b(var21_37);
                if (var22_38.p0(var22_38.b(var20_36), var39_71) && var22_38.g(var39_71) == 0) {
                    return true;
                }
                if (var22_38.b0(var22_38.b(var21_37))) {
                    return true;
                }
                var40_72 = f.a;
                k.x.c.i.e(var1_1, "state");
                k.x.c.i.e((Object)var20_36, "subType");
                k.x.c.i.e(var39_71, "superConstructor");
                var41_73 = var1_1.d;
                if (var41_73.l0(var20_36)) {
                    var45_74 = var40_72.c(var1_1, var20_36, var39_71);
                } else if (!var41_73.P(var39_71) && !var41_73.g0(var39_71)) {
                    var45_74 = var40_72.b(var1_1, var20_36, var39_71);
                } else {
                    var42_75 = new k.b0.x.b.x0.o.h<j>();
                    var1_1.c();
                    var43_76 = var1_1.i;
                    k.x.c.i.c(var43_76);
                    var44_77 = var1_1.j;
                    k.x.c.i.c(var44_77);
                    var43_76.push((Object)var20_36);
                    while (true ^ var43_76.isEmpty()) {
                        if (var44_77.size() > 1000) {
                            var92_82 = e.e.a.a.a.z((String)"Too many supertypes for type: ", (j)var20_36, (String)". Supertypes = ");
                            var92_82.append(k.s.i.A(var44_77, null, null, null, (int)0, null, null, (int)63));
                            throw new IllegalStateException(var92_82.toString().toString());
                        }
                        var94_78 = (j)var43_76.pop();
                        k.x.c.i.d((Object)var94_78, "current");
                        if (!var44_77.add((Object)var94_78)) continue;
                        if (var41_73.l0(var94_78)) {
                            var42_75.add(var94_78);
                            var95_79 = x0.a.c.a;
                        } else {
                            var95_79 = x0.a.b.a;
                        }
                        if (!(true ^ k.x.c.i.a((Object)var95_79, (Object)x0.a.c.a))) {
                            var95_79 = null;
                        }
                        if (var95_79 == null) continue;
                        var96_80 = var1_1.d;
                        var97_81 = var96_80.q(var96_80.b(var94_78)).iterator();
                        while (var97_81.hasNext()) {
                            var43_76.add((Object)var95_79.a(var1_1, (i)var97_81.next()));
                        }
                    }
                    var1_1.b();
                    var45_74 = new ArrayList();
                    var46_83 = var42_75.iterator();
                    while (var46_83.hasNext()) {
                        var89_84 = (j)var46_83.next();
                        var90_85 = f.a;
                        k.x.c.i.d((Object)var89_84, "it");
                        k.s.i.b((Collection)var45_74, var90_85.c(var1_1, var89_84, var39_71));
                    }
                }
                var47_86 = 10;
                var48_87 = new ArrayList(e.s.a.a.U(var45_74, (int)var47_86));
                for (j var86_89 : var45_74) {
                    var87_90 = var22_38.a(var1_1.d((i)var86_89));
                    if (var87_90 != null) {
                        var86_89 = var87_90;
                    }
                    var48_87.add((Object)var86_89);
                }
                var50_91 = var48_87.size();
                if (var50_91 != 0) break block96;
                var51_108 = var1_1.d;
                var52_109 = var51_108.b(var20_36);
                if (var51_108.P(var52_109)) {
                    return var51_108.m(var52_109);
                }
                if (var51_108.m(var51_108.b(var20_36))) {
                    return true;
                }
                break block97;
            }
            if (var50_91 == 1) {
                return f.a.g(var1_1, var22_38.o((j)k.s.i.r((List)var48_87)), var21_37);
            }
            var63_92 = new a(var22_38.g(var39_71));
            var64_93 = var22_38.g(var39_71);
            var65_94 = false;
            do {
                block100 : {
                    block101 : {
                        block98 : {
                            block99 : {
                                if (var35_63 >= var64_93) break block98;
                                var68_95 = var35_63 + 1;
                                var65_94 = var65_94 || var22_38.H(var22_38.z(var39_71, var35_63)) != r.l;
                                if (!var65_94) break block99;
                                var71_98 = var39_71;
                                break block100;
                            }
                            var69_96 = new ArrayList(e.s.a.a.U((Iterable)var48_87, (int)var47_86));
                            var70_97 = var48_87.iterator();
                            break block101;
                        }
                        if (!var65_94 && f.a.g(var1_1, (k)var63_92, var21_37)) {
                            return true;
                        }
                        if (var48_87.isEmpty()) {
                            return false;
                        }
                        var66_105 = var48_87.iterator();
                        do {
                            if (var66_105.hasNext() == false) return false;
                        } while (!f.a.g(var1_1, var22_38.o(var67_106 = (j)var66_105.next()), var21_37));
                        return true;
                    }
                    while (var70_97.hasNext()) {
                        block104 : {
                            block103 : {
                                block102 : {
                                    var73_99 = (j)var70_97.next();
                                    var74_100 = var22_38.r0(var73_99, var35_63);
                                    if (var74_100 != null) break block102;
                                    var76_102 = var39_71;
                                    break block103;
                                }
                                var75_101 = var22_38.a0(var74_100);
                                var76_102 = var39_71;
                                var77_103 = var75_101 == r.m;
                                if (var77_103) break block104;
                            }
                            var74_100 = null;
                        }
                        if (var74_100 == null) {
                            var78_104 = new StringBuilder();
                            var78_104.append("Incorrect type: ");
                            var78_104.append((Object)var73_99);
                            var78_104.append(", subType: ");
                            var78_104.append((Object)var20_36);
                            var78_104.append(", superType: ");
                            var78_104.append((Object)var21_37);
                            throw new IllegalStateException(var78_104.toString().toString());
                        }
                        var69_96.add((Object)var22_38.n0(var74_100));
                        var39_71 = var76_102;
                    }
                    var71_98 = var39_71;
                    var63_92.add((Object)var22_38.V(var22_38.I((List)var69_96)));
                }
                var47_86 = 10;
                var39_71 = var71_98;
                var35_63 = var68_95;
            } while (true);
        }
        var1_1.c();
        var53_110 = var1_1.i;
        k.x.c.i.c(var53_110);
        var54_111 = var1_1.j;
        k.x.c.i.c(var54_111);
        var53_110.push((Object)var20_36);
        block14 : do lbl-1000: // 4 sources:
        {
            if (!(true ^ var53_110.isEmpty())) {
                var1_1.b();
                return false;
            }
            if (var54_111.size() > 1000) {
                var55_117 = e.e.a.a.a.z((String)"Too many supertypes for type: ", (j)var20_36, (String)". Supertypes = ");
                var55_117.append(k.s.i.A(var54_111, null, null, null, (int)0, null, null, (int)63));
                throw new IllegalStateException(var55_117.toString().toString());
            }
            var57_112 = (j)var53_110.pop();
            k.x.c.i.d((Object)var57_112, "current");
            if (!var54_111.add((Object)var57_112)) ** GOTO lbl-1000
            var58_113 /* !! */  = var51_108.l0(var57_112) != false ? x0.a.c.a : x0.a.b.a;
            if (!(true ^ k.x.c.i.a((Object)var58_113 /* !! */ , (Object)x0.a.c.a))) {
                var58_113 /* !! */  = null;
            }
            if (var58_113 /* !! */  == null) ** GOTO lbl-1000
            var59_114 = var1_1.d;
            var60_115 = var59_114.q(var59_114.b(var57_112)).iterator();
            do {
                if (!var60_115.hasNext()) continue block14;
                var61_116 = var58_113 /* !! */ .a(var1_1, (i)var60_115.next());
                if (var51_108.m(var51_108.b(var61_116))) {
                    var1_1.b();
                    return true;
                }
                var53_110.add((Object)var61_116);
            } while (true);
            break;
        } while (true);
    }

    public final List<j> b(x0 x02, j j2, m m2) {
        b b2 = b.k;
        o o2 = x02.d;
        Object object = o2.k(j2, m2);
        if (object == null) {
            if (!o2.P(m2) && o2.l0(j2)) {
                return k.s.r.k;
            }
            if (o2.k0(m2)) {
                if (o2.p0(o2.b(j2), m2)) {
                    j j3 = o2.h0(j2, b2);
                    if (j3 != null) {
                        j2 = j3;
                    }
                    return e.s.a.a.N2((Object)j2);
                }
                return k.s.r.k;
            }
            object = new k.b0.x.b.x0.o.h();
            x02.c();
            ArrayDeque<j> arrayDeque = x02.i;
            k.x.c.i.c(arrayDeque);
            Set<j> set = x02.j;
            k.x.c.i.c(set);
            arrayDeque.push((Object)j2);
            while (true ^ arrayDeque.isEmpty()) {
                if (set.size() <= 1000) {
                    Object object2;
                    j j4 = (j)arrayDeque.pop();
                    k.x.c.i.d((Object)j4, "current");
                    if (!set.add((Object)j4)) continue;
                    j j5 = o2.h0(j4, b2);
                    if (j5 == null) {
                        j5 = j4;
                    }
                    if (o2.p0(o2.b(j5), m2)) {
                        object.add((Object)j5);
                        object2 = x0.a.c.a;
                    } else {
                        object2 = o2.h((i)j5) == 0 ? x0.a.b.a : x02.d.w(j5);
                    }
                    if (!(true ^ k.x.c.i.a(object2, (Object)x0.a.c.a))) {
                        object2 = null;
                    }
                    if (object2 == null) continue;
                    o o3 = x02.d;
                    Iterator iterator = o3.q(o3.b(j4)).iterator();
                    while (iterator.hasNext()) {
                        arrayDeque.add((Object)((x0.a)object2).a(x02, (i)iterator.next()));
                    }
                    continue;
                }
                StringBuilder stringBuilder = e.e.a.a.a.z((String)"Too many supertypes for type: ", (j)j2, (String)". Supertypes = ");
                stringBuilder.append(k.s.i.A(set, null, null, null, (int)0, null, null, (int)63));
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            x02.b();
        }
        return object;
    }

    public final List<j> c(x0 x02, j j2, m m2) {
        boolean bl;
        ArrayList arrayList = this.b(x02, j2, m2);
        o o2 = x02.d;
        if (arrayList.size() < 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator iterator = arrayList.iterator();
        do {
            boolean bl2 = iterator.hasNext();
            bl = true;
            if (!bl2) break;
            Object object = iterator.next();
            k k2 = o2.o((j)object);
            int n2 = o2.L(k2);
            int n3 = 0;
            while (n3 < n2) {
                int n4 = n3 + 1;
                boolean bl3 = o2.G(o2.n0(o2.r(k2, n3))) == null ? bl : false;
                if (!bl3) {
                    bl = false;
                    break;
                }
                n3 = n4;
            }
            if (!bl) continue;
            arrayList2.add(object);
        } while (true);
        if (bl ^ arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final boolean d(x0 x02, i i2, i i3) {
        k.x.c.i.e(x02, "state");
        k.x.c.i.e(i2, "a");
        k.x.c.i.e(i3, "b");
        o o2 = x02.d;
        boolean bl = true;
        if (i2 == i3) {
            return bl;
        }
        f f2 = a;
        if (f2.f(o2, i2) && f2.f(o2, i3)) {
            i i4 = x02.d(x02.e(i2));
            i i5 = x02.d(x02.e(i3));
            j j2 = o2.Z(i4);
            if (!o2.p0(o2.t(i4), o2.t(i5))) {
                return false;
            }
            if (o2.h((i)j2) == 0) {
                if (!o2.v(i4)) {
                    if (o2.v(i5)) {
                        return bl;
                    }
                    if (o2.Q(j2) == o2.Q(o2.Z(i5))) {
                        return bl;
                    }
                    bl = false;
                }
                return bl;
            }
        }
        if (f.h(f2, x02, i2, i3, false, 8) && f.h(f2, x02, i3, i2, false, 8)) {
            return bl;
        }
        return false;
    }

    public final n e(o o2, i i2, i i3) {
        int n2 = o2.h(i2);
        int n3 = 0;
        while (n3 < n2) {
            block7 : {
                n n4;
                block8 : {
                    int n5;
                    block6 : {
                        n5 = n3 + 1;
                        l l2 = o2.Y(i2, n3);
                        boolean bl = o2.F(l2);
                        boolean bl2 = true;
                        boolean bl3 = bl ^ bl2;
                        l l3 = null;
                        if (bl3) {
                            l3 = l2;
                        }
                        if (l3 == null) break block6;
                        i i4 = o2.n0(l3);
                        if (!o2.x((i)o2.Z(i4)) || !o2.x((i)o2.Z(i3))) {
                            bl2 = false;
                        }
                        if (k.x.c.i.a(i4, i3) || bl2 && k.x.c.i.a(o2.t(i4), o2.t(i3))) break block7;
                        n4 = this.e(o2, i4, i3);
                        if (n4 != null) break block8;
                    }
                    n3 = n5;
                    continue;
                }
                return n4;
            }
            return o2.z(o2.t(i2), n3);
        }
        return null;
    }

    public final boolean f(o o2, i i2) {
        return o2.u(o2.t(i2)) && !o2.p(i2) && !o2.y(i2) && k.x.c.i.a(o2.b(o2.Z(i2)), o2.b(o2.N(i2)));
    }

    public final boolean g(x0 x02, k k2, j j2) {
        block7 : {
            k.x.c.i.e(x02, "<this>");
            k.x.c.i.e(k2, "capturedSubArguments");
            k.x.c.i.e((Object)j2, "superType");
            o o2 = x02.d;
            m m2 = o2.b(j2);
            int n2 = o2.L(k2);
            int n3 = o2.g(m2);
            if (n2 != n3) break block7;
            if (n2 != o2.h((i)j2)) {
                return false;
            }
            int n4 = 0;
            while (n4 < n3) {
                i i2;
                block9 : {
                    int n5;
                    block8 : {
                        boolean bl;
                        block13 : {
                            i i3;
                            f f2;
                            i i4;
                            block14 : {
                                block10 : {
                                    block11 : {
                                        block12 : {
                                            n5 = n4 + 1;
                                            l l2 = o2.Y((i)j2, n4);
                                            if (o2.F(l2)) break block8;
                                            i3 = o2.n0(l2);
                                            l l3 = o2.r(k2, n4);
                                            o2.a0(l3);
                                            r r2 = r.m;
                                            i2 = o2.n0(l3);
                                            f2 = a;
                                            r r3 = o2.H(o2.z(m2, n4));
                                            r r4 = o2.a0(l2);
                                            k.x.c.i.e((Object)r3, "declared");
                                            k.x.c.i.e((Object)r4, "useSite");
                                            if (r3 == r2) {
                                                r3 = r4;
                                            } else if (r4 != r2 && r3 != r4) {
                                                r3 = null;
                                            }
                                            if (r3 == null) {
                                                return x02.a;
                                            }
                                            boolean bl2 = r3 == r2 && (f2.i(o2, i2, i3, m2) || f2.i(o2, i3, i2, m2));
                                            if (bl2) break block8;
                                            int n6 = x02.g;
                                            if (n6 > 100) break block9;
                                            x02.g = n6 + 1;
                                            int n7 = r3.ordinal();
                                            if (n7 == 0) break block10;
                                            if (n7 == 1) break block11;
                                            if (n7 != 2) break block12;
                                            bl = f2.d(x02, i2, i3);
                                            break block13;
                                        }
                                        throw new g();
                                    }
                                    i4 = i2;
                                    break block14;
                                }
                                i4 = i3;
                                i3 = i2;
                            }
                            bl = f.h(f2, x02, i4, i3, false, 8);
                        }
                        x02.g = -1 + x02.g;
                        if (!bl) {
                            return false;
                        }
                    }
                    n4 = n5;
                    continue;
                }
                throw new IllegalStateException(k.x.c.i.k("Arguments depth is too high. Some related argument: ", i2).toString());
            }
            return true;
        }
        return false;
    }

    public final boolean i(o o2, i i2, i i3, m m2) {
        j j2 = o2.a(i2);
        boolean bl = j2 instanceof k.b0.x.b.x0.m.r1.d;
        boolean bl2 = false;
        if (bl) {
            k.b0.x.b.x0.m.r1.d d2 = (k.b0.x.b.x0.m.r1.d)j2;
            boolean bl3 = o2.n(d2);
            bl2 = false;
            if (!bl3) {
                if (!o2.F(o2.M(o2.W(d2)))) {
                    return false;
                }
                if (o2.J(d2) != b.k) {
                    return false;
                }
                m m3 = o2.t(i3);
                q q2 = m3 instanceof q ? (q)m3 : null;
                if (q2 == null) {
                    return false;
                }
                n n2 = o2.c0(q2);
                if (n2 == null) {
                    return false;
                }
                boolean bl4 = o2.l(n2, m2);
                bl2 = false;
                if (bl4) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }
}

