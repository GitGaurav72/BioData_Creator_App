/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
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
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.e0
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.j1.e
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.y0
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.f.q
 *  k.b0.x.b.x0.f.q$b
 *  k.b0.x.b.x0.f.q$b$c
 *  k.b0.x.b.x0.f.s
 *  k.b0.x.b.x0.f.z.b$b
 *  k.b0.x.b.x0.k.b.c0$a
 *  k.b0.x.b.x0.k.b.c0$b
 *  k.b0.x.b.x0.k.b.c0$c
 *  k.b0.x.b.x0.k.b.c0$d
 *  k.b0.x.b.x0.k.b.c0$e
 *  k.b0.x.b.x0.k.b.c0$f
 *  k.b0.x.b.x0.k.b.f0.a
 *  k.b0.x.b.x0.k.b.f0.n
 *  k.b0.x.b.x0.l.h
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.d1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.q0
 *  k.b0.x.b.x0.m.r
 *  k.b0.x.b.x0.m.r0
 *  k.b0.x.b.x0.m.y0
 *  k.c0.t
 *  k.s.i
 *  k.s.r
 *  k.s.s
 *  k.x.b.a
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 *  kotlin.reflect.jvm.internal.impl.builtins.StandardNames
 */
package k.b0.x.b.x0.k.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b0.x.b.x0.c.e0;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.y0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.z.b;
import k.b0.x.b.x0.k.b.b0;
import k.b0.x.b.x0.k.b.c0;
import k.b0.x.b.x0.k.b.d0;
import k.b0.x.b.x0.k.b.f0.n;
import k.b0.x.b.x0.k.b.j;
import k.b0.x.b.x0.k.b.l;
import k.b0.x.b.x0.k.b.r;
import k.b0.x.b.x0.k.b.u;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.d1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.p0;
import k.b0.x.b.x0.m.q0;
import k.b0.x.b.x0.m.r;
import k.b0.x.b.x0.m.r0;
import k.b0.x.b.x0.m.y;
import k.c0.t;
import k.g;
import k.s.i;
import k.s.s;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;

public final class c0 {
    public final l a;
    public final c0 b;
    public final String c;
    public final String d;
    public final k.x.b.l<Integer, h> e;
    public final k.x.b.l<Integer, h> f;
    public final Map<Integer, z0> g;

    public c0(l l2, c0 c02, List<k.b0.x.b.x0.f.s> list, String string, String string2) {
        s s2;
        k.x.c.i.e(l2, "c");
        k.x.c.i.e(list, "typeParameterProtos");
        k.x.c.i.e(string, "debugName");
        k.x.c.i.e(string2, "containerPresentableName");
        this.a = l2;
        this.b = c02;
        this.c = string;
        this.d = string2;
        this.e = l2.a.a.i(new a(this));
        this.f = l2.a.a.i(new c(this));
        if (list.isEmpty()) {
            s2 = s.k;
        } else {
            s2 = new LinkedHashMap();
            Iterator iterator = list.iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                int n3 = n2 + 1;
                k.b0.x.b.x0.f.s s3 = (k.b0.x.b.x0.f.s)iterator.next();
                s2.put((Object)s3.p, (Object)new n(this.a, s3, n2));
                n2 = n3;
            }
        }
        this.g = s2;
    }

    public static final List<q.b> f(q q2, c0 c02) {
        List list = q2.p;
        k.x.c.i.d((Object)list, "argumentList");
        q q3 = e.s.a.a.Y2((q)q2, (k.b0.x.b.x0.f.z.e)c02.a.d);
        k.s.r r2 = q3 == null ? null : c0.f(q3, c02);
        if (r2 == null) {
            r2 = k.s.r.k;
        }
        return i.M((Collection)list, (Iterable)r2);
    }

    public static /* synthetic */ m0 g(c0 c02, q q2, boolean bl, int n2) {
        if ((n2 & 2) != 0) {
            bl = true;
        }
        return c02.e(q2, bl);
    }

    public static final k.b0.x.b.x0.c.e i(c0 c02, q q2, int n2) {
        ArrayList arrayList;
        k.b0.x.b.x0.g.b b2 = e.s.a.a.m1((k.b0.x.b.x0.f.z.c)c02.a.b, (int)n2);
        List list = t.k((k.c0.h)t.g((k.c0.h)e.s.a.a.c1((Object)q2, (k.x.b.l)new e(c02)), (k.x.b.l)f.k));
        int n3 = t.b((k.c0.h)e.s.a.a.c1((Object)b2, (k.x.b.l)d.k));
        while ((arrayList = (ArrayList)list).size() < n3) {
            arrayList.add((Object)0);
        }
        return c02.a.a.l.a(b2, list);
    }

    public final m0 a(int n2) {
        if (e.s.a.a.m1((k.b0.x.b.x0.f.z.c)this.a.b, (int)n2).c) {
            return this.a.a.g.a();
        }
        return null;
    }

    public final m0 b(f0 f02, f0 f03) {
        KotlinBuiltIns kotlinBuiltIns = e.s.a.a.k1((f0)f02);
        k.b0.x.b.x0.c.i1.h h2 = f02.getAnnotations();
        f0 f04 = FunctionTypesKt.getReceiverTypeFromFunctionType((f0)f02);
        List list = i.m((List)FunctionTypesKt.getValueParameterTypesFromFunctionType((f0)f02), (int)1);
        ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((b1)iterator.next()).b());
        }
        return FunctionTypesKt.createFunctionType((KotlinBuiltIns)kotlinBuiltIns, (k.b0.x.b.x0.c.i1.h)h2, (f0)f04, (List)arrayList, null, (f0)f03, (boolean)true).a0(f02.U());
    }

    public final List<z0> c() {
        return i.b0((Iterable)this.g.values());
    }

    public final z0 d(int n2) {
        z0 z02 = (z0)this.g.get((Object)n2);
        if (z02 == null) {
            c0 c02 = this.b;
            if (c02 == null) {
                return null;
            }
            z02 = c02.d(n2);
        }
        return z02;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final m0 e(q var1_1, boolean var2_2) {
        block43 : {
            block47 : {
                block44 : {
                    block46 : {
                        block45 : {
                            block42 : {
                                block38 : {
                                    block41 : {
                                        block35 : {
                                            block36 : {
                                                block39 : {
                                                    block40 : {
                                                        block32 : {
                                                            block37 : {
                                                                block34 : {
                                                                    block33 : {
                                                                        k.x.c.i.e((Object)var1_1, "proto");
                                                                        if (!var1_1.u()) break block33;
                                                                        var71_3 = var1_1.u;
                                                                        ** GOTO lbl8
                                                                    }
                                                                    if (var1_1.x()) {
                                                                        var71_3 = var1_1.x;
lbl8: // 2 sources:
                                                                        var3_4 = this.a(var71_3);
                                                                    } else {
                                                                        var3_4 = null;
                                                                    }
                                                                    if (var3_4 != null) {
                                                                        return var3_4;
                                                                    }
                                                                    var4_5 = var1_1.u();
                                                                    var5_6 = 1;
                                                                    if (!var4_5) break block34;
                                                                    var58_7 = (h)this.e.invoke((Object)var1_1.u);
                                                                    if (var58_7 != null) break block35;
                                                                    var59_8 = var1_1.u;
                                                                    break block36;
                                                                }
                                                                var6_9 = var1_1.o;
                                                                var7_10 = (var6_9 & 32) == 32 ? var5_6 : 0;
                                                                if (var7_10 == 0) break block37;
                                                                var58_7 = this.d(var1_1.v);
                                                                if (var58_7 != null) break block35;
                                                                var66_11 = e.e.a.a.a.t((String)"Unknown type parameter ");
                                                                var66_11.append(var1_1.v);
                                                                var66_11.append(". Please try recompiling module containing \"");
                                                                var66_11.append(this.d);
                                                                var66_11.append('\"');
                                                                var9_12 = y.e(var66_11.toString());
                                                                var10_13 = "createErrorTypeConstruct\u2026\\\"\"\n                    )";
                                                                break block38;
                                                            }
                                                            var8_14 = (var6_9 & 64) == 64 ? var5_6 : 0;
                                                            if (var8_14 == 0) break block39;
                                                            var60_15 = this.a.b.b(var1_1.w);
                                                            for (Object var62_17 : this.c()) {
                                                                if (!k.x.c.i.a(((z0)var62_17).getName().e(), var60_15)) continue;
                                                                break block32;
                                                            }
                                                            var62_17 = null;
                                                        }
                                                        var63_18 = (z0)var62_17;
                                                        if (var63_18 != null) break block40;
                                                        var64_19 = e.e.a.a.a.y((String)"Deserialized type parameter ", (String)var60_15, (String)" in ");
                                                        var64_19.append((Object)this.a.c);
                                                        var9_12 = y.e(var64_19.toString());
                                                        var10_13 = "createErrorTypeConstruct\u2026.containingDeclaration}\")";
                                                        break block38;
                                                    }
                                                    var58_7 = var63_18;
                                                    break block35;
                                                }
                                                if (!var1_1.x()) break block41;
                                                var58_7 = (h)this.f.invoke((Object)var1_1.x);
                                                if (var58_7 != null) break block35;
                                                var59_8 = var1_1.x;
                                            }
                                            var58_7 = c0.i(this, var1_1, var59_8);
                                        }
                                        var9_12 = var58_7.getTypeConstructor();
                                        var10_13 = "classifier.typeConstructor";
                                        break block38;
                                    }
                                    var9_12 = y.e("Unknown type");
                                    var10_13 = "createErrorTypeConstructor(\"Unknown type\")";
                                }
                                k.x.c.i.d((Object)var9_12, var10_13);
                                if (y.i((k)var9_12.getDeclarationDescriptor())) {
                                    var57_20 = y.h(var9_12.toString(), var9_12);
                                    k.x.c.i.d((Object)var57_20, "createErrorTypeWithCusto\u2026.toString(), constructor)");
                                    return var57_20;
                                }
                                var11_21 = new k.b0.x.b.x0.k.b.f0.a(this.a.a.a, (k.x.b.a)new b(this, var1_1));
                                var12_22 = c0.f(var1_1, this);
                                var13_23 = new ArrayList(e.s.a.a.U(var12_22, (int)10));
                                var14_24 = var12_22.iterator();
                                var15_25 = 0;
                                while (var14_24.hasNext()) {
                                    var44_26 = var14_24.next();
                                    var45_27 = var15_25 + 1;
                                    if (var15_25 < 0) {
                                        i.X();
                                        throw null;
                                    }
                                    var46_28 = (q.b)var44_26;
                                    var47_29 = var9_12.getParameters();
                                    k.x.c.i.d((Object)var47_29, "constructor.parameters");
                                    var48_30 = (z0)i.v((List)var47_29, (int)var15_25);
                                    var49_31 = var46_28.o;
                                    if (var49_31 == q.b.c.n) {
                                        var55_37 /* !! */  = var48_30 == null ? new q0(this.a.a.b.getBuiltIns()) : new r0(var48_30);
                                    } else {
                                        k.x.c.i.d((Object)var49_31, "typeArgumentProto.projection");
                                        k.x.c.i.e((Object)var49_31, "projection");
                                        var50_32 = var49_31.ordinal();
                                        if (var50_32 != 0) {
                                            if (var50_32 != var5_6) {
                                                if (var50_32 != 2) {
                                                    if (var50_32 == 3) throw new IllegalArgumentException(k.x.c.i.k("Only IN, OUT and INV are supported. Actual argument: ", (Object)var49_31));
                                                    throw new g();
                                                }
                                                var51_33 = n1.k;
                                            } else {
                                                var51_33 = n1.m;
                                            }
                                        } else {
                                            var51_33 = n1.l;
                                        }
                                        var52_34 = this.a.d;
                                        k.x.c.i.e((Object)var46_28, "<this>");
                                        k.x.c.i.e(var52_34, "typeTable");
                                        if (var46_28.i()) {
                                            var54_36 /* !! */  = var46_28.p;
                                        } else {
                                            var53_35 = (4 & var46_28.n) == 4 ? var5_6 : 0;
                                            var54_36 /* !! */  = var53_35 != 0 ? var52_34.a(var46_28.q) : null;
                                        }
                                        var55_37 /* !! */  = var54_36 /* !! */  == null ? new d1((f0)y.d("No type recorded")) : new d1(var51_33, this.h(var54_36 /* !! */ ));
                                    }
                                    var13_23.add((Object)var55_37 /* !! */ );
                                    var15_25 = var45_27;
                                }
                                var16_38 = i.b0((Iterable)var13_23);
                                var17_39 = var9_12.getDeclarationDescriptor();
                                if (!var2_2 || !(var17_39 instanceof y0)) break block42;
                                var42_40 = g0.b((y0)var17_39, (List<? extends b1>)var16_38);
                                var43_41 = !e.s.a.a.w2((f0)var42_40) && !var1_1.q ? 0 : var5_6;
                                var19_42 = var42_40.a0((boolean)var43_41).b0(k.b0.x.b.x0.c.i1.h.g.a(i.K((Iterable)var11_21, (Iterable)var42_40.getAnnotations())));
                                break block43;
                            }
                            if (!e.e.a.a.a.F(k.b0.x.b.x0.f.z.b.a, (int)var1_1.C, (String)"SUSPEND_TYPE.get(proto.flags)")) break block44;
                            var28_43 = var1_1.q;
                            var29_44 = var9_12.getParameters().size() - var16_38.size();
                            if (var29_44 == 0) break block45;
                            if (var29_44 != var5_6 || (var39_45 = var16_38.size() - var5_6) < 0) ** GOTO lbl-1000
                            var40_46 = var9_12.getBuiltIns().getSuspendFunction(var39_45).getTypeConstructor();
                            k.x.c.i.d((Object)var40_46, "functionTypeConstructor.\u2026on(arity).typeConstructor");
                            var23_47 = g0.g((k.b0.x.b.x0.c.i1.h)var11_21, var40_46, var16_38, var28_43, null, 16);
                            break block46;
                        }
                        var23_47 = g0.g((k.b0.x.b.x0.c.i1.h)var11_21, var9_12, var16_38, var28_43, null, 16);
                        if (!FunctionTypesKt.isFunctionType((f0)var23_47) || (var30_48 = (b1)i.D((List)FunctionTypesKt.getValueParameterTypesFromFunctionType((f0)var23_47))) == null) lbl-1000: // 2 sources:
                        {
                            var23_47 = null;
                        } else {
                            var31_49 = var30_48.b();
                            k.x.c.i.d((Object)var31_49, "funType.getValueParamete\u2026ll()?.type ?: return null");
                            var32_50 = var31_49.T().getDeclarationDescriptor();
                            var33_51 = var32_50 == null ? null : k.b0.x.b.x0.j.y.a.g((k)var32_50);
                            if (var31_49.S().size() == var5_6 && (k.x.c.i.a(var33_51, StandardNames.CONTINUATION_INTERFACE_FQ_NAME) || k.x.c.i.a(var33_51, d0.a))) {
                                var34_52 = ((b1)i.T((List)var31_49.S())).b();
                                k.x.c.i.d((Object)var34_52, "continuationArgumentType.arguments.single().type");
                                var35_53 = this.a.c;
                                if (!(var35_53 instanceof k.b0.x.b.x0.c.a)) {
                                    var35_53 = null;
                                }
                                var37_55 = (var36_54 = (k.b0.x.b.x0.c.a)var35_53) == null ? null : k.b0.x.b.x0.j.y.a.c((k)var36_54);
                                k.x.c.i.a(var37_55, b0.a);
                                var23_47 = this.b((f0)var23_47, var34_52);
                            }
                        }
                    }
                    if (var23_47 != null) break block47;
                    var19_42 = y.g(k.x.c.i.k("Bad suspend function in metadata with constructor: ", (Object)var9_12), (List<b1>)var16_38);
                    k.x.c.i.d((Object)var19_42, "createErrorTypeWithArgum\u2026      arguments\n        )");
                    break block43;
                }
                var18_56 = var1_1.q;
                var19_42 = g0.g((k.b0.x.b.x0.c.i1.h)var11_21, var9_12, var16_38, var18_56, null, 16);
                if (e.e.a.a.a.F(k.b0.x.b.x0.f.z.b.b, (int)var1_1.C, (String)"DEFINITELY_NOT_NULL_TYPE.get(proto.flags)")) {
                    var23_47 = k.b0.x.b.x0.m.r.l.a((m1)var19_42, false);
                    if (var23_47 == null) {
                        var24_57 = new StringBuilder();
                        var24_57.append("null DefinitelyNotNullType for '");
                        var24_57.append((Object)var19_42);
                        var24_57.append('\'');
                        throw new IllegalStateException(var24_57.toString().toString());
                    } else {
                        ** GOTO lbl169
                    }
                }
                break block43;
            }
            var19_42 = var23_47;
        }
        var20_58 = this.a.d;
        k.x.c.i.e((Object)var1_1, "<this>");
        k.x.c.i.e(var20_58, "typeTable");
        if (var1_1.t()) {
            var21_59 = var1_1.A;
        } else {
            if ((2048 & var1_1.o) != 2048) {
                var5_6 = 0;
            }
            var21_59 = null;
            if (var5_6 != 0) {
                var21_59 = var20_58.a(var1_1.B);
            }
        }
        if (var21_59 != null) {
            var19_42 = p0.e(var19_42, this.e(var21_59, false));
        }
        if (var1_1.u() == false) return var19_42;
        var22_60 = e.s.a.a.m1((k.b0.x.b.x0.f.z.c)this.a.b, (int)var1_1.u);
        return this.a.a.s.a(var22_60, var19_42);
    }

    public final f0 h(q q2) {
        k.x.c.i.e((Object)q2, "proto");
        boolean bl = (2 & q2.o) == 2;
        if (bl) {
            Object object;
            String string = this.a.b.b(q2.r);
            m0 m02 = this.e(q2, true);
            k.b0.x.b.x0.f.z.e e2 = this.a.d;
            k.x.c.i.e((Object)q2, "<this>");
            k.x.c.i.e(e2, "typeTable");
            if (q2.v()) {
                object = q2.s;
            } else {
                int n2 = 8 & q2.o;
                boolean bl2 = false;
                if (n2 == 8) {
                    bl2 = true;
                }
                object = bl2 ? e2.a(q2.t) : null;
            }
            k.x.c.i.c(object);
            m0 m03 = this.e((q)object, true);
            return this.a.a.j.a(q2, string, m02, m03);
        }
        return this.e(q2, true);
    }

    public String toString() {
        String string = this.c;
        c0 c02 = this.b;
        String string2 = c02 == null ? "" : k.x.c.i.k(". Child of ", c02.c);
        return k.x.c.i.k(string, string2);
    }
}

