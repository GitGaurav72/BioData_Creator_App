/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Set
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.m
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.j.a0.n.g
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.c.k1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.i0;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.g;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.h1;
import k.b0.x.b.x0.m.n1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class d
extends k.b0.x.b.x0.c.k1.m
implements q0 {
    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "annotations";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            }
            case 1: {
                arrobject[0] = "substitutor";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            }
            case 8: {
                arrobject[1] = "getSource";
                break;
            }
            case 7: {
                arrobject[1] = "getOriginal";
                break;
            }
            case 6: {
                arrobject[1] = "getVisibility";
                break;
            }
            case 5: {
                arrobject[1] = "getOverriddenDescriptors";
                break;
            }
            case 4: {
                arrobject[1] = "getValueParameters";
                break;
            }
            case 3: {
                arrobject[1] = "getType";
                break;
            }
            case 2: {
                arrobject[1] = "getTypeParameters";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 1: {
                arrobject[2] = "substitute";
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                object = new IllegalArgumentException(string2);
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public d(h h2) {
        if (h2 != null) {
            super(h2, g.e);
            return;
        }
        d.$$$reportNull$$$0(0);
        throw null;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)m2.l((q0)this, d2);
    }

    @Override
    public f0 b() {
        f0 f02 = this.getValue().b();
        if (f02 != null) {
            return f02;
        }
        d.$$$reportNull$$$0(3);
        throw null;
    }

    @Override
    public q0 getDispatchReceiverParameter() {
        return null;
    }

    @Override
    public q0 getExtensionReceiverParameter() {
        return null;
    }

    @Override
    public a getOriginal() {
        return this;
    }

    public k getOriginal() {
        return this;
    }

    @Override
    public Collection<? extends a> getOverriddenDescriptors() {
        Set set = Collections.emptySet();
        if (set != null) {
            return set;
        }
        d.$$$reportNull$$$0(5);
        throw null;
    }

    @Override
    public f0 getReturnType() {
        return this.b();
    }

    public u0 getSource() {
        return u0.a;
    }

    @Override
    public List<z0> getTypeParameters() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        d.$$$reportNull$$$0(2);
        throw null;
    }

    @Override
    public List<e1> getValueParameters() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        d.$$$reportNull$$$0(4);
        throw null;
    }

    public r getVisibility() {
        r r2 = q.f;
        if (r2 != null) {
            return r2;
        }
        d.$$$reportNull$$$0(6);
        throw null;
    }

    @Override
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override
    public q0 substitute(h1 h12) {
        if (h12 != null) {
            n1 n12;
            f0 f02;
            if (h12.h()) {
                return this;
            }
            if (this.getContainingDeclaration() instanceof e) {
                f02 = this.b();
                n12 = n1.m;
            } else {
                f02 = this.b();
                n12 = n1.k;
            }
            f0 f03 = h12.k(f02, n12);
            if (f03 == null) {
                return null;
            }
            if (f03 == this.b()) {
                return this;
            }
            return new i0(this.getContainingDeclaration(), (k.b0.x.b.x0.j.a0.n.d)new k.b0.x.b.x0.j.a0.n.g(f03), this.getAnnotations());
        }
        d.$$$reportNull$$$0(1);
        throw null;
    }
}

