/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.e.a.l0
 *  k.b0.x.b.x0.e.a.l0$b
 *  k.b0.x.b.x0.e.a.l0$c
 *  k.s.i
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.e.a;

import java.util.List;
import java.util.Map;
import java.util.Set;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.e.a.i;
import k.b0.x.b.x0.e.a.l0;
import k.b0.x.b.x0.e.b.q;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.y.a;
import k.x.b.l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class k0
extends k.x.c.k
implements l<b, Boolean> {
    public static final k0 k = new k0();

    public k0() {
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object invoke(Object object) {
        b b2 = (b)object;
        k.x.c.i.e((Object)b2, "it");
        boolean bl = KotlinBuiltIns.isBuiltIn((k)b2);
        int n2 = 1;
        if (bl) {
            l0.b b3;
            k.x.c.i.e((Object)b2, "<this>");
            if (!l0.f.contains((Object)b2.getName())) {
                b3 = null;
            } else {
                b b4 = a.b(b2, false, i.k, n2);
                String string = b4 == null ? null : q.c((k.b0.x.b.x0.c.a)b4);
                if (string == null) {
                    b3 = null;
                } else {
                    k.x.c.i.e(string, "builtinSignature");
                    l0.b b5 = l0.c.contains((Object)string) ? l0.b.k : ((l0.c)k.s.i.w((Map)l0.e, (Object)string) == l0.c.k ? l0.b.m : l0.b.l);
                    b3 = b5;
                }
            }
            if (b3 != null) {
                return (boolean)n2;
            }
        }
        n2 = 0;
        return (boolean)n2;
    }
}

