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
 *  k.b0.g
 *  k.x.c.b
 *  k.x.c.f
 */
package k.x.c;

import e.e.a.a.a;
import k.b0.c;
import k.x.c.b;
import k.x.c.f;
import k.x.c.i;
import k.x.c.w;
import k.x.c.x;

public class g
extends b
implements f,
k.b0.g {
    private final int arity;
    private final int flags;

    public g(int n2) {
        this(n2, b.NO_RECEIVER, null, null, null, 0);
    }

    public g(int n2, Object object) {
        this(n2, object, null, null, null, 0);
    }

    public g(int n2, Object object, Class class_, String string, String string2, int n3) {
        boolean bl = (n3 & 1) == 1;
        super(object, class_, string, string2, bl);
        this.arity = n2;
        this.flags = n3 >> 1;
    }

    public c computeReflected() {
        return w.a.a(this);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            g g2 = (g)((Object)object);
            return i.a((Object)this.getOwner(), (Object)g2.getOwner()) && this.getName().equals((Object)g2.getName()) && this.getSignature().equals((Object)g2.getSignature()) && this.flags == g2.flags && this.arity == g2.arity && i.a(this.getBoundReceiver(), g2.getBoundReceiver());
        }
        if (object instanceof k.b0.g) {
            return object.equals((Object)this.compute());
        }
        return false;
    }

    public int getArity() {
        return this.arity;
    }

    public k.b0.g getReflected() {
        return (k.b0.g)super.getReflected();
    }

    public int hashCode() {
        int n2 = this.getOwner() == null ? 0 : 31 * this.getOwner().hashCode();
        return 31 * (n2 + this.getName().hashCode()) + this.getSignature().hashCode();
    }

    public boolean isExternal() {
        return this.getReflected().isExternal();
    }

    public boolean isInfix() {
        return this.getReflected().isInfix();
    }

    public boolean isInline() {
        return this.getReflected().isInline();
    }

    public boolean isOperator() {
        return this.getReflected().isOperator();
    }

    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }

    public String toString() {
        c c2 = this.compute();
        if (c2 != this) {
            return c2.toString();
        }
        if ("<init>".equals((Object)this.getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder stringBuilder = a.t((String)"function ");
        stringBuilder.append(this.getName());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

