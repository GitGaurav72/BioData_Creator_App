/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.util.Arrays
 *  java.util.Objects
 *  k.b0.x.b.x0.c.m1.b.s
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import k.b0.x.b.x0.c.m1.b.s;
import k.x.b.l;
import k.x.c.i;
import k.x.c.k;

public final class q
extends k
implements l<Method, Boolean> {
    public final /* synthetic */ s k;

    public q(s s2) {
        this.k = s2;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object invoke(Object var1_1) {
        block3 : {
            block5 : {
                block4 : {
                    var2_2 = (Method)var1_1;
                    var3_3 = var2_2.isSynthetic();
                    var4_4 = 1;
                    if (var3_3) break block3;
                    if (this.k.x() == false) return (boolean)var4_4;
                    var5_5 = this.k;
                    i.d((Object)var2_2, "method");
                    Objects.requireNonNull((Object)var5_5);
                    var7_6 = var2_2.getName();
                    if (!i.a(var7_6, "values")) break block4;
                    var11_7 = var2_2.getParameterTypes();
                    i.d(var11_7, "method.parameterTypes");
                    if (var11_7.length != 0) ** GOTO lbl-1000
                    var8_8 = var4_4;
                    break block5;
                }
                if (i.a(var7_6, "valueOf")) {
                    var9_9 = var2_2.getParameterTypes();
                    var10_10 = new Class[var4_4];
                    var10_10[0] = String.class;
                    var8_8 = Arrays.equals((Object[])var9_9, (Object[])var10_10) ? 1 : 0;
                } else lbl-1000: // 2 sources:
                {
                    var8_8 = 0;
                }
            }
            if (var8_8 == 0) {
                return (boolean)var4_4;
            }
        }
        var4_4 = 0;
        return (boolean)var4_4;
    }
}

