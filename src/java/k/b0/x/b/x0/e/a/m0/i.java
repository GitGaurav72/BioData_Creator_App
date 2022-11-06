/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  k.b0.f
 *  k.b0.k
 *  k.b0.x.b.x0.e.a.m0.b
 *  k.b0.x.b.x0.e.a.m0.c
 *  k.b0.x.b.x0.e.a.m0.d
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.e
 *  k.b0.x.b.x0.e.a.q0.m
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

import java.util.List;
import java.util.Map;
import k.b0.f;
import k.b0.k;
import k.b0.x.b.x0.e.a.m0.b;
import k.b0.x.b.x0.e.a.m0.c;
import k.b0.x.b.x0.e.a.m0.d;
import k.b0.x.b.x0.e.a.o0.h;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.w.g;
import k.b0.x.b.x0.l.m;
import k.s.s;
import k.x.c.p;
import k.x.c.q;
import k.x.c.w;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;

public final class i
extends b {
    public static final /* synthetic */ k<Object>[] g;
    public final k.b0.x.b.x0.l.i h;

    public static {
        k[] arrk = new k[]{w.c((p)new q((f)w.a(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
        g = arrk;
    }

    public i(k.b0.x.b.x0.e.a.q0.a a2, h h2) {
        k.x.c.i.e((Object)a2, "annotation");
        k.x.c.i.e(h2, "c");
        super(h2, a2, StandardNames.FqNames.target);
        this.h = h2.a.a.d(new k.x.b.a<Map<e, ? extends g<? extends Object>>>(){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public Object invoke() {
                block4 : {
                    var1_1 = this.e;
                    if (!(var1_1 instanceof k.b0.x.b.x0.e.a.q0.e)) break block4;
                    var5_2 = d.a;
                    var6_3 = ((k.b0.x.b.x0.e.a.q0.e)var1_1).e();
                    ** GOTO lbl10
                }
                if (var1_1 instanceof k.b0.x.b.x0.e.a.q0.m) {
                    var5_2 = d.a;
                    var6_3 = e.s.a.a.N2((Object)var1_1);
lbl10: // 2 sources:
                    var2_4 = var5_2.a(var6_3);
                } else {
                    var2_4 = null;
                }
                if (var2_4 == null) {
                    var3_5 = null;
                } else {
                    var3_6 = e.s.a.a.S2(new k.i<e, g>(c.c, var2_4));
                }
                if (var3_7 != null) return var3_9;
                var3_8 = s.k;
                return var3_9;
            }
        });
    }

    public Map<e, g<Object>> a() {
        return (Map)e.s.a.a.T1((k.b0.x.b.x0.l.i)this.h, g[0]);
    }

}

