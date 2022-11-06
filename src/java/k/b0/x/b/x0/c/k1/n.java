/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.m
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.u0
 */
package k.b0.x.b.x0.c.k1;

import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.m;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.g.e;

public abstract class n
extends m
implements l {
    private final k containingDeclaration;
    private final u0 source;

    private static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 4 && n2 != 5 && n2 != 6 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 4 && n2 != 5 && n2 != 6 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            }
            case 3: {
                arrobject[0] = "source";
                break;
            }
            case 2: {
                arrobject[0] = "name";
                break;
            }
            case 1: {
                arrobject[0] = "annotations";
            }
        }
        arrobject[1] = n2 != 4 ? (n2 != 5 ? (n2 != 6 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl" : "getSource") : "getContainingDeclaration") : "getOriginal";
        if (n2 != 4 && n2 != 5 && n2 != 6) {
            arrobject[2] = "<init>";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 4 && n2 != 5 && n2 != 6 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public n(k k2, h h2, e e2, u0 u02) {
        if (k2 == null) {
            n.$$$reportNull$$$0(0);
        }
        if (h2 == null) {
            n.$$$reportNull$$$0(1);
        }
        if (e2 == null) {
            n.$$$reportNull$$$0(2);
        }
        if (u02 == null) {
            n.$$$reportNull$$$0(3);
        }
        super(h2, e2);
        this.containingDeclaration = k2;
        this.source = u02;
    }

    @Override
    public k getContainingDeclaration() {
        k k2 = this.containingDeclaration;
        if (k2 == null) {
            n.$$$reportNull$$$0(5);
        }
        return k2;
    }

    public k.b0.x.b.x0.c.n getOriginal() {
        k.b0.x.b.x0.c.n n2 = (k.b0.x.b.x0.c.n)super.getOriginal();
        if (n2 == null) {
            n.$$$reportNull$$$0(4);
        }
        return n2;
    }

    public u0 getSource() {
        u0 u02 = this.source;
        if (u02 == null) {
            n.$$$reportNull$$$0(6);
        }
        return u02;
    }
}

