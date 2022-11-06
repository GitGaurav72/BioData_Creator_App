/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.j.a0.n.c
 */
package k.b0.x.b.x0.c.k1;

import e.e.a.a.a;
import java.util.Objects;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.d;
import k.b0.x.b.x0.j.a0.n.c;

public class s
extends d {
    public final e k;
    public final c l;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 1 && n2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 1 && n2 != 2 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        arrobject[0] = n2 != 1 && n2 != 2 ? (n2 != 3 ? "descriptor" : "newOwner") : "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        arrobject[1] = n2 != 1 ? (n2 != 2 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor" : "getContainingDeclaration") : "getValue";
        if (n2 != 1 && n2 != 2) {
            arrobject[2] = n2 != 3 ? "<init>" : "copy";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 1 && n2 != 2 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public s(e e2) {
        if (e2 != null) {
            Objects.requireNonNull((Object)h.g);
            super(h.a.b);
            this.k = e2;
            this.l = new c(e2, null);
            return;
        }
        s.$$$reportNull$$$0(0);
        throw null;
    }

    @Override
    public k getContainingDeclaration() {
        e e2 = this.k;
        if (e2 != null) {
            return e2;
        }
        s.$$$reportNull$$$0(2);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.j.a0.n.d getValue() {
        c c2 = this.l;
        if (c2 != null) {
            return c2;
        }
        s.$$$reportNull$$$0(1);
        throw null;
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"class ");
        stringBuilder.append((Object)this.k.getName());
        stringBuilder.append("::this");
        return stringBuilder.toString();
    }
}

