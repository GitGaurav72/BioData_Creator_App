/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  k.u.f$a
 *  k.x.b.l
 *  l.a.a1
 *  l.a.a1$a
 *  l.a.b2.e
 *  l.a.i0
 *  l.a.n0
 *  l.a.v1
 *  l.a.z
 */
package l.a.b2;

import e.s.a.a;
import java.util.concurrent.CancellationException;
import k.u.d;
import k.u.f;
import k.x.b.l;
import l.a.a1;
import l.a.b2.e;
import l.a.b2.q;
import l.a.b2.s;
import l.a.i0;
import l.a.n0;
import l.a.t1;
import l.a.u;
import l.a.v1;
import l.a.x;
import l.a.z;

public final class f {
    public static final q a = new q("UNDEFINED");
    public static final q b = new q("REUSABLE_CLAIMED");

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final <T> void a(d<? super T> var0, Object var1_1, l<? super Throwable, k.q> var2_2) {
        if (!(var0 instanceof e)) {
            var0.resumeWith(var1_1);
            return;
        }
        var3_3 = (e)var0;
        var4_4 = a.r4((Object)var1_1, var2_2);
        if (var3_3.o.isDispatchNeeded(var3_3.getContext())) {
            var3_3.q = var4_4;
            var3_3.m = 1;
            var3_3.o.dispatch(var3_3.getContext(), (Runnable)var3_3);
            return;
        }
        var6_5 = t1.a();
        if (var6_5.L()) {
            var3_3.q = var4_4;
            var3_3.m = 1;
            var6_5.I((i0)var3_3);
            return;
        }
        var6_5.J(true);
        var9_6 = (a1)var3_3.getContext().get(a1.a.k);
        if (var9_6 != null && !var9_6.b()) {
            var18_7 = var9_6.q();
            if (var4_4 instanceof u) {
                ((u)var4_4).b.invoke((Object)var18_7);
            }
            var3_3.resumeWith(a.A0((Throwable)var18_7));
            var10_8 = true;
        } else {
            var10_8 = false;
        }
        if (var10_8) ** GOTO lbl47
        var11_9 = var3_3.p;
        var12_10 = var3_3.r;
        var13_11 = var11_9.getContext();
        var14_12 = s.b(var13_11, var12_10);
        var15_13 = var14_12 != s.a ? x.b(var11_9, var13_11, var14_12) : null;
        var3_3.p.resumeWith(var1_1);
        if (var15_13 == null) ** GOTO lbl44
        {
            catch (Throwable var16_14) {
                if (var15_13 != null) {
                    if (var15_13.b0() == false) throw var16_14;
                }
                s.a(var13_11, var14_12);
                throw var16_14;
            }
        }
        try {
            block18 : {
                if (!var15_13.b0()) break block18;
lbl44: // 2 sources:
                s.a(var13_11, var14_12);
            }
            while (var17_15 = var6_5.P()) {
            }
            return;
        }
        catch (Throwable var7_16) {
            try {
                var3_3.h(var7_16, null);
                return;
            }
            finally {
                var6_5.B(true);
            }
        }
    }

    public static /* synthetic */ void b(d d2, Object object, l l2, int n2) {
        n2 & 2;
        f.a(d2, object, null);
    }
}

