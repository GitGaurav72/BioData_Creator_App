/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 */
package k.b0.x.b.x0.c.k1;

import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.b;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.l.m;

public abstract class j
extends b {
    public final k k;
    public final u0 l;
    public final boolean m;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 4 && n2 != 5 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 4 && n2 != 5 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        arrobject[0] = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 && n2 != 5 ? "storageManager" : "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase") : "source") : "name") : "containingDeclaration";
        arrobject[1] = n2 != 4 ? (n2 != 5 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase" : "getSource") : "getContainingDeclaration";
        if (n2 != 4 && n2 != 5) {
            arrobject[2] = "<init>";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 4 && n2 != 5 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public j(m m2, k k2, e e2, u0 u02, boolean bl) {
        if (m2 != null) {
            if (k2 != null) {
                if (e2 != null) {
                    if (u02 != null) {
                        super(m2, e2);
                        this.k = k2;
                        this.l = u02;
                        this.m = bl;
                        return;
                    }
                    j.$$$reportNull$$$0(3);
                    throw null;
                }
                j.$$$reportNull$$$0(2);
                throw null;
            }
            j.$$$reportNull$$$0(1);
            throw null;
        }
        j.$$$reportNull$$$0(0);
        throw null;
    }

    @Override
    public k getContainingDeclaration() {
        k k2 = this.k;
        if (k2 != null) {
            return k2;
        }
        j.$$$reportNull$$$0(4);
        throw null;
    }

    public u0 getSource() {
        u0 u02 = this.l;
        if (u02 != null) {
            return u02;
        }
        j.$$$reportNull$$$0(5);
        throw null;
    }

    @Override
    public boolean isExternal() {
        return this.m;
    }
}

