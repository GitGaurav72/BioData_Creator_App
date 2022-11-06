/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.l.j
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.c.k1;

import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.p0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.w.g;
import k.b0.x.b.x0.l.j;
import k.b0.x.b.x0.m.f0;

public abstract class q0
extends p0 {
    public final boolean l;
    public j<g<?>> m;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        Object[] arrobject = new Object[3];
        arrobject[0] = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? "containingDeclaration" : "compileTimeInitializer") : "source") : "name") : "annotations";
        arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        arrobject[2] = n2 != 4 ? "<init>" : "setCompileTimeInitializer";
        throw new IllegalArgumentException(String.format((String)"Argument for @NotNull parameter '%s' of %s.%s must not be null", (Object[])arrobject));
    }

    public q0(k k2, h h2, e e2, f0 f02, boolean bl, u0 u02) {
        if (k2 != null) {
            if (h2 != null) {
                if (e2 != null) {
                    if (u02 != null) {
                        super(k2, h2, e2, null, u02);
                        this.l = bl;
                        return;
                    }
                    q0.$$$reportNull$$$0(3);
                    throw null;
                }
                q0.$$$reportNull$$$0(2);
                throw null;
            }
            q0.$$$reportNull$$$0(1);
            throw null;
        }
        q0.$$$reportNull$$$0(0);
        throw null;
    }

    @Override
    public boolean E() {
        return this.l;
    }

    public void o(j<g<?>> j2) {
        if (j2 != null) {
            this.m = j2;
            return;
        }
        q0.$$$reportNull$$$0(4);
        throw null;
    }

    @Override
    public g<?> w() {
        j<g<?>> j2 = this.m;
        if (j2 != null) {
            return (g)j2.invoke();
        }
        return null;
    }
}

