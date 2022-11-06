/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  k.b0.x.b.x0.f.v
 *  k.b0.x.b.x0.f.w
 *  k.s.r
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.f.z;

import java.util.List;
import k.b0.x.b.x0.f.v;
import k.b0.x.b.x0.f.w;
import k.s.r;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f {
    public static final a a = new a(null);
    public static final f b = new f((List<v>)r.k);
    public final List<v> c;

    public f(List<v> list) {
        this.c = list;
    }

    public f(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.c = list;
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final f a(w w2) {
            i.e((Object)w2, "table");
            if (w2.n.size() == 0) {
                return f.b;
            }
            List list = w2.n;
            i.d((Object)list, "table.requirementList");
            return new f(list, null);
        }
    }

}

