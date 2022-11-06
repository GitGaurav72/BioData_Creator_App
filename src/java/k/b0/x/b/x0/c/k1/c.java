/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.x0
 */
package k.b0.x.b.x0.c.k1;

import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.g;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.x0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.n1;

public abstract class c
extends g {
    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        Object[] arrobject = new Object[3];
        switch (n2) {
            default: {
                arrobject[0] = "storageManager";
                break;
            }
            case 6: {
                arrobject[0] = "supertypeLoopChecker";
                break;
            }
            case 5: {
                arrobject[0] = "source";
                break;
            }
            case 4: {
                arrobject[0] = "variance";
                break;
            }
            case 3: {
                arrobject[0] = "name";
                break;
            }
            case 2: {
                arrobject[0] = "annotations";
                break;
            }
            case 1: {
                arrobject[0] = "containingDeclaration";
            }
        }
        arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        arrobject[2] = "<init>";
        throw new IllegalArgumentException(String.format((String)"Argument for @NotNull parameter '%s' of %s.%s must not be null", (Object[])arrobject));
    }

    public c(m m2, k k2, h h2, e e2, n1 n12, boolean bl, int n2, u0 u02, x0 x02) {
        if (m2 != null) {
            if (k2 != null) {
                if (h2 != null) {
                    if (e2 != null) {
                        if (x02 != null) {
                            super(m2, k2, h2, e2, n12, bl, n2, u02, x02);
                            return;
                        }
                        c.$$$reportNull$$$0(6);
                        throw null;
                    }
                    c.$$$reportNull$$$0(3);
                    throw null;
                }
                c.$$$reportNull$$$0(2);
                throw null;
            }
            c.$$$reportNull$$$0(1);
            throw null;
        }
        c.$$$reportNull$$$0(0);
        throw null;
    }

    public String toString() {
        Object[] arrobject = new Object[3];
        boolean bl = this.l;
        String string = "";
        String string2 = bl ? "reified " : string;
        arrobject[0] = string2;
        if (this.d() != n1.k) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)this.d());
            stringBuilder.append(" ");
            string = stringBuilder.toString();
        }
        arrobject[1] = string;
        arrobject[2] = this.getName();
        return String.format((String)"%s%s%s", (Object[])arrobject);
    }
}

