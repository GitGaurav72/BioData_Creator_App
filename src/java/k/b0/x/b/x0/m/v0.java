/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.Map
 *  k.b0.x.b.x0.c.y0
 *  k.b0.x.b.x0.c.z0
 *  k.b0.x.b.x0.m.b1
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.m;

import java.util.List;
import java.util.Map;
import k.b0.x.b.x0.c.y0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.m.b1;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class v0 {
    public final v0 a;
    public final y0 b;
    public final List<b1> c;
    public final Map<z0, b1> d;

    public v0(v0 v02, y0 y02, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = v02;
        this.b = y02;
        this.c = list;
        this.d = map;
    }

    public final boolean a(y0 y02) {
        boolean bl;
        block3 : {
            block2 : {
                i.e((Object)y02, "descriptor");
                if (i.a((Object)this.b, (Object)y02)) break block2;
                v0 v02 = this.a;
                boolean bl2 = v02 == null ? false : v02.a(y02);
                bl = false;
                if (!bl2) break block3;
            }
            bl = true;
        }
        return bl;
    }
}

