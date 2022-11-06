/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.u0
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.k.b;

import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.f.z.c;
import k.b0.x.b.x0.f.z.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class y {
    public final c a;
    public final e b;
    public final u0 c;

    public y(c c2, e e2, u0 u02, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = c2;
        this.b = e2;
        this.c = u02;
    }

    public abstract k.b0.x.b.x0.g.c a();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append((Object)this.a());
        return stringBuilder.toString();
    }
}

