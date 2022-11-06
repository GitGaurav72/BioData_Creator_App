/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  k.b0.f
 *  k.b0.k
 *  k.b0.x.b.x0.c.i1.m
 *  k.b0.x.b.x0.e.a.m0.b
 *  k.b0.x.b.x0.e.a.m0.c
 *  k.b0.x.b.x0.e.a.m0.d
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.m
 *  k.b0.x.b.x0.j.w.k
 *  k.b0.x.b.x0.l.i
 *  k.s.s
 *  k.x.b.a
 *  k.x.c.k
 *  k.x.c.p
 *  k.x.c.q
 *  kotlin.reflect.jvm.internal.impl.builtins.StandardNames
 *  kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames
 */
package k.b0.x.b.x0.e.a.m0;

import java.util.Map;
import k.b0.f;
import k.b0.k;
import k.b0.x.b.x0.c.i1.m;
import k.b0.x.b.x0.e.a.m0.b;
import k.b0.x.b.x0.e.a.m0.c;
import k.b0.x.b.x0.e.a.m0.d;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.w.g;
import k.i;
import k.s.s;
import k.x.c.p;
import k.x.c.q;
import k.x.c.w;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;

public final class h
extends b {
    public static final /* synthetic */ k<Object>[] g;
    public final k.b0.x.b.x0.l.i h;

    public static {
        k[] arrk = new k[]{w.c((p)new q((f)w.a(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
        g = arrk;
    }

    public h(k.b0.x.b.x0.e.a.q0.a a2, k.b0.x.b.x0.e.a.o0.h h2) {
        k.x.c.i.e((Object)a2, "annotation");
        k.x.c.i.e(h2, "c");
        super(h2, a2, StandardNames.FqNames.retention);
        this.h = h2.a.a.d(new k.x.b.a<Map<e, ? extends g<?>>>(){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public Object invoke() {
                var2_1 = this.e;
                var3_2 = var2_1 instanceof k.b0.x.b.x0.e.a.q0.m != false ? (k.b0.x.b.x0.e.a.q0.m)var2_1 : null;
                if (var3_2 == null) ** GOTO lbl-1000
                var4_3 = d.c;
                var5_4 = var3_2.d();
                var6_5 = var5_4 == null ? null : var5_4.e();
                var7_6 = (m)var4_3.get((Object)var6_5);
                if (var7_6 == null) lbl-1000: // 2 sources:
                {
                    var10_7 = null;
                } else {
                    var8_8 = k.b0.x.b.x0.g.b.l(StandardNames.FqNames.annotationRetention);
                    k.x.c.i.d(var8_8, "topLevel(StandardNames.F\u2026ames.annotationRetention)");
                    var9_9 = e.l(var7_6.name());
                    k.x.c.i.d(var9_9, "identifier(retention.name)");
                    var10_7 = new k.b0.x.b.x0.j.w.k(var8_8, var9_9);
                }
                if (var10_7 == null) {
                    var11_10 = null;
                } else {
                    var11_11 = e.s.a.a.S2(new i<e, Object>(c.d, var10_7));
                }
                if (var11_12 != null) return var11_14;
                var11_13 = s.k;
                return var11_14;
            }
        });
    }

    public Map<e, g<?>> a() {
        return (Map)e.s.a.a.T1((k.b0.x.b.x0.l.i)this.h, g[0]);
    }

}

