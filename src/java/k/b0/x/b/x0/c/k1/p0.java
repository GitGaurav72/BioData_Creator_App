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
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.c.k1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.f1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.f0;

public abstract class p0
extends k.b0.x.b.x0.c.k1.n
implements f1 {
    public f0 k;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            }
            case 9: {
                arrobject[1] = "getReturnType";
                break;
            }
            case 8: {
                arrobject[1] = "getTypeParameters";
                break;
            }
            case 7: {
                arrobject[1] = "getOverriddenDescriptors";
                break;
            }
            case 6: {
                arrobject[1] = "getValueParameters";
                break;
            }
            case 5: {
                arrobject[1] = "getOriginal";
                break;
            }
            case 4: {
                arrobject[1] = "getType";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                object = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public p0(k k2, h h2, e e2, f0 f02, u0 u02) {
        if (k2 != null) {
            if (h2 != null) {
                if (e2 != null) {
                    if (u02 != null) {
                        super(k2, h2, e2, u02);
                        this.k = f02;
                        return;
                    }
                    p0.$$$reportNull$$$0(3);
                    throw null;
                }
                p0.$$$reportNull$$$0(2);
                throw null;
            }
            p0.$$$reportNull$$$0(1);
            throw null;
        }
        p0.$$$reportNull$$$0(0);
        throw null;
    }

    @Override
    public f0 b() {
        f0 f02 = this.k;
        if (f02 != null) {
            return f02;
        }
        p0.$$$reportNull$$$0(4);
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
    public Collection<? extends a> getOverriddenDescriptors() {
        Set set = Collections.emptySet();
        if (set != null) {
            return set;
        }
        p0.$$$reportNull$$$0(7);
        throw null;
    }

    @Override
    public f0 getReturnType() {
        f0 f02 = this.b();
        if (f02 != null) {
            return f02;
        }
        p0.$$$reportNull$$$0(9);
        throw null;
    }

    @Override
    public List<z0> getTypeParameters() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        p0.$$$reportNull$$$0(8);
        throw null;
    }

    @Override
    public List<e1> getValueParameters() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        p0.$$$reportNull$$$0(6);
        throw null;
    }

    @Override
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    public f1 n() {
        f1 f12 = (f1)super.getOriginal();
        if (f12 != null) {
            return f12;
        }
        p0.$$$reportNull$$$0(5);
        throw null;
    }
}

