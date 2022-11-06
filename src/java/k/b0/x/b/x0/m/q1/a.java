/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Objects
 *  k.b0.x.b.x0.c.a$a
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.v$a
 *  k.b0.x.b.x0.m.q1.a$a
 *  k.b0.x.b.x0.m.y$d
 */
package k.b0.x.b.x0.m.q1;

import java.util.Collection;
import java.util.Objects;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.j0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.m.q1.a;
import k.b0.x.b.x0.m.y;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
extends j0 {
    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 6 && n2 != 7 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 6 && n2 != 7 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 8: {
                arrobject[0] = "overriddenDescriptors";
                break;
            }
            case 6: 
            case 7: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
                break;
            }
            case 5: {
                arrobject[0] = "source";
                break;
            }
            case 4: {
                arrobject[0] = "annotations";
                break;
            }
            case 3: {
                arrobject[0] = "kind";
                break;
            }
            case 2: {
                arrobject[0] = "newOwner";
                break;
            }
            case 1: {
                arrobject[0] = "ownerScope";
            }
        }
        arrobject[1] = n2 != 6 ? (n2 != 7 ? "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl" : "copy") : "createSubstitutedCopy";
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 8: {
                arrobject[2] = "setOverriddenDescriptors";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                arrobject[2] = "createSubstitutedCopy";
            }
            case 6: 
            case 7: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 6 && n2 != 7 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public a(e e2, y.d d2) {
        if (e2 != null) {
            if (d2 != null) {
                Objects.requireNonNull((Object)h.g);
                super((k)e2, null, h.a.b, k.b0.x.b.x0.g.e.n("<ERROR FUNCTION>"), b.a.k, u0.a);
                return;
            }
            a.$$$reportNull$$$0(1);
            throw null;
        }
        a.$$$reportNull$$$0(0);
        throw null;
    }

    @Override
    public b copy(k k2, b0 b02, r r2, b.a a2, boolean bl) {
        return this;
    }

    @Override
    public t0 copy(k k2, b0 b02, r r2, b.a a2, boolean bl) {
        return this;
    }

    @Override
    public v copy(k k2, b0 b02, r r2, b.a a2, boolean bl) {
        return this;
    }

    @Override
    public k.b0.x.b.x0.c.k1.r createSubstitutedCopy(k k2, v v2, b.a a2, k.b0.x.b.x0.g.e e2, h h2, u0 u02) {
        if (k2 != null) {
            if (a2 != null) {
                if (h2 != null) {
                    if (u02 != null) {
                        return this;
                    }
                    a.$$$reportNull$$$0(5);
                    throw null;
                }
                a.$$$reportNull$$$0(4);
                throw null;
            }
            a.$$$reportNull$$$0(3);
            throw null;
        }
        a.$$$reportNull$$$0(2);
        throw null;
    }

    @Override
    public <V> V getUserData(a.a<V> a2) {
        return null;
    }

    @Override
    public boolean isSuspend() {
        return false;
    }

    @Override
    public v.a<? extends t0> newCopyBuilder() {
        return new a(this);
    }

    @Override
    public void setOverriddenDescriptors(Collection<? extends b> collection) {
        if (collection != null) {
            return;
        }
        a.$$$reportNull$$$0(8);
        throw null;
    }
}

