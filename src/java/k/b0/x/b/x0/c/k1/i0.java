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
 */
package k.b0.x.b.x0.c.k1;

import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.d;

public class i0
extends d {
    public final k k;
    public k.b0.x.b.x0.j.a0.n.d l;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 3 && n2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 3 && n2 != 4 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 6: {
                arrobject[0] = "outType";
                break;
            }
            case 5: {
                arrobject[0] = "newOwner";
                break;
            }
            case 3: 
            case 4: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            }
            case 2: {
                arrobject[0] = "annotations";
                break;
            }
            case 1: {
                arrobject[0] = "value";
            }
        }
        arrobject[1] = n2 != 3 ? (n2 != 4 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl" : "getContainingDeclaration") : "getValue";
        if (n2 != 3 && n2 != 4) {
            arrobject[2] = n2 != 5 ? (n2 != 6 ? "<init>" : "setOutType") : "copy";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 3 && n2 != 4 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public i0(k k2, k.b0.x.b.x0.j.a0.n.d d2, h h2) {
        if (k2 != null) {
            if (h2 != null) {
                super(h2);
                this.k = k2;
                this.l = d2;
                return;
            }
            i0.$$$reportNull$$$0(2);
            throw null;
        }
        i0.$$$reportNull$$$0(0);
        throw null;
    }

    @Override
    public k getContainingDeclaration() {
        k k2 = this.k;
        if (k2 != null) {
            return k2;
        }
        i0.$$$reportNull$$$0(4);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.j.a0.n.d getValue() {
        k.b0.x.b.x0.j.a0.n.d d2 = this.l;
        if (d2 != null) {
            return d2;
        }
        i0.$$$reportNull$$$0(3);
        throw null;
    }
}

