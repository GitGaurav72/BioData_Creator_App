/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.a.c.f.f.a0
 *  e.p.a.c.f.f.b0
 *  e.p.a.c.f.f.c0
 *  e.p.a.c.f.f.ck
 *  e.p.a.c.f.f.d
 *  e.p.a.c.f.f.h
 *  e.p.a.c.f.f.k
 *  e.p.a.c.f.f.l
 *  e.p.a.c.f.f.lk
 *  e.p.a.c.f.f.m
 *  e.p.a.c.f.f.n
 *  e.p.a.c.f.f.n0
 *  e.p.a.c.f.f.p
 *  e.p.a.c.f.f.r
 *  e.p.a.c.f.f.s
 *  e.p.a.c.f.f.t
 *  e.p.a.c.f.f.zj
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package e.p.a.c.f.f;

import e.p.a.c.f.f.a0;
import e.p.a.c.f.f.b0;
import e.p.a.c.f.f.c0;
import e.p.a.c.f.f.ck;
import e.p.a.c.f.f.d;
import e.p.a.c.f.f.h;
import e.p.a.c.f.f.k;
import e.p.a.c.f.f.l;
import e.p.a.c.f.f.lk;
import e.p.a.c.f.f.m;
import e.p.a.c.f.f.n;
import e.p.a.c.f.f.n0;
import e.p.a.c.f.f.p;
import e.p.a.c.f.f.r;
import e.p.a.c.f.f.s;
import e.p.a.c.f.f.t;
import e.p.a.c.f.f.u;
import e.p.a.c.f.f.zj;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class w {
    public static final w a = new w();
    public final b0 b = new h();
    public final ConcurrentMap c = new ConcurrentHashMap();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final a0 a(Class var1_1) {
        block10 : {
            block11 : {
                block9 : {
                    Objects.requireNonNull((Object)var1_1, (String)"messageType");
                    var4_2 = (a0)this.c.get((Object)var1_1);
                    if (var4_2 != null) return var4_2;
                    var5_3 = (h)this.b;
                    Objects.requireNonNull((Object)var5_3);
                    if (!lk.class.isAssignableFrom(var1_1) && (var37_4 = c0.a) != null) {
                        if (var37_4.isAssignableFrom(var1_1) == false) throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    }
                    var8_5 = var5_3.b.a(var1_1);
                    var9_6 = var8_5.c();
                    var10_7 = lk.class.isAssignableFrom(var1_1);
                    if (!var9_6) break block9;
                    if (var10_7) {
                        var35_8 = c0.d;
                        var34_9 = new s(var35_8, ck.a, var8_5.a());
                    } else {
                        var32_11 = c0.b;
                        var33_12 = ck.b;
                        if (var33_12 == null) throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        var34_9 = new s(var32_11, var33_12, var8_5.a());
                    }
                    var23_10 = var34_9;
                    break block10;
                }
                var11_13 = null;
                if (!var10_7) break block11;
                var29_14 = var8_5.d();
                var30_15 = false;
                if (var29_14 == 1) {
                    var30_15 = true;
                }
                if (var30_15) {
                    var14_16 = u.b;
                    var15_17 = d.b;
                    var16_18 = c0.d;
                    var11_13 = ck.a;
                } else {
                    var14_16 = u.b;
                    var15_17 = d.b;
                    var16_18 = c0.d;
                }
                var17_19 = l.b;
                ** GOTO lbl61
            }
            var12_20 = var8_5.d();
            var13_21 = false;
            if (var12_20 == 1) {
                var13_21 = true;
            }
            if (var13_21) {
                var25_22 = u.a;
                var26_23 = d.a;
                var27_24 = c0.b;
                var28_25 = ck.b;
                if (var28_25 == null) throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                var18_26 = l.a;
                var19_27 = var28_25;
                var22_28 = var25_22;
                var21_29 = var27_24;
                var20_30 = var26_23;
            } else {
                var14_16 = u.a;
                var15_17 = d.a;
                var16_18 = c0.c;
                var17_19 = l.a;
lbl61: // 2 sources:
                var18_26 = var17_19;
                var19_27 = var11_13;
                var20_30 = var15_17;
                var21_29 = var16_18;
                var22_28 = var14_16;
            }
            var23_10 = r.G((m)var8_5, (t)var22_28, (d)var20_30, (n0)var21_29, (zj)var19_27, (k)var18_26);
        }
        var24_31 = (a0)this.c.putIfAbsent((Object)var1_1, (Object)var23_10);
        if (var24_31 != null) return var24_31;
        return var23_10;
    }
}

