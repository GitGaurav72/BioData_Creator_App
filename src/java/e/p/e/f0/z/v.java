/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.p.e.c0
 *  e.p.e.d0
 *  e.p.e.f0.z.v$a
 *  e.p.e.g0.a
 *  e.p.e.j
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.p.e.f0.z;

import e.p.e.c0;
import e.p.e.d0;
import e.p.e.f0.z.v;
import e.p.e.j;

public class v
implements d0 {
    public final /* synthetic */ Class k;
    public final /* synthetic */ c0 l;

    public v(Class class_, c0 c02) {
        this.k = class_;
        this.l = c02;
    }

    public <T2> c0<T2> a(j j2, e.p.e.g0.a<T2> a2) {
        Class class_ = a2.a;
        if (!this.k.isAssignableFrom(class_)) {
            return null;
        }
        return new a(this, class_);
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Factory[typeHierarchy=");
        e.e.a.a.a.B((Class)this.k, (StringBuilder)stringBuilder, (String)",adapter=");
        stringBuilder.append((Object)this.l);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

