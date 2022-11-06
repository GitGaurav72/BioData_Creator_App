/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  k.b0.x.b.x0.h.h
 *  k.b0.x.b.x0.h.h$e
 */
package k.b0.x.b.x0.h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k.b0.x.b.x0.h.h;

public class f {
    public static final f a = new f(true);
    public final Map<a, h.f<?, ?>> b;

    public f() {
        this.b = new HashMap();
    }

    public f(boolean bl) {
        this.b = Collections.emptyMap();
    }

    public final void a(h.f<?, ?> f2) {
        this.b.put((Object)new a(f2.a, f2.d.l), f2);
    }

    public static final class a {
        public final Object a;
        public final int b;

        public a(Object object, int n2) {
            this.a = object;
            this.b = n2;
        }

        public boolean equals(Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            a a2 = (a)object;
            Object object2 = this.a;
            Object object3 = a2.a;
            boolean bl = false;
            if (object2 == object3) {
                int n2 = this.b;
                int n3 = a2.b;
                bl = false;
                if (n2 == n3) {
                    bl = true;
                }
            }
            return bl;
        }

        public int hashCode() {
            return 65535 * System.identityHashCode((Object)this.a) + this.b;
        }
    }

}

