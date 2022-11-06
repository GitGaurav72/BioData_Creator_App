/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.c
 *  k.b0.f
 *  k.b0.k
 *  k.x.c.b
 */
package k.x.c;

import e.e.a.a.a;
import k.b0.c;
import k.b0.f;
import k.b0.k;
import k.x.c.b;
import k.x.c.i;

public abstract class r
extends b
implements k {
    public r() {
    }

    public r(Object object, Class class_, String string, String string2, int n2) {
        int n3 = 1;
        if ((n2 & n3) != n3) {
            n3 = 0;
        }
        super(object, class_, string, string2, (boolean)n3);
    }

    public k d() {
        return (k)super.getReflected();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof r) {
            r r2 = (r)((Object)object);
            return this.getOwner().equals((Object)r2.getOwner()) && this.getName().equals((Object)r2.getName()) && this.getSignature().equals((Object)r2.getSignature()) && i.a(this.getBoundReceiver(), r2.getBoundReceiver());
        }
        if (object instanceof k) {
            return object.equals((Object)this.compute());
        }
        return false;
    }

    public int hashCode() {
        return 31 * (31 * this.getOwner().hashCode() + this.getName().hashCode()) + this.getSignature().hashCode();
    }

    public String toString() {
        c c2 = this.compute();
        if (c2 != this) {
            return c2.toString();
        }
        StringBuilder stringBuilder = a.t((String)"property ");
        stringBuilder.append(this.getName());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

