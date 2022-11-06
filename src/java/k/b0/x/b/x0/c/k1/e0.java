/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  k.b0.x.b.x0.c.a$a
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 */
package k.b0.x.b.x0.c.k1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.m0;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.o0;
import k.b0.x.b.x0.c.p0;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.h1;

public abstract class e0
extends k.b0.x.b.x0.c.k1.n
implements m0 {
    public boolean k;
    public final boolean l;
    public final b0 m;
    public final n0 n;
    public final boolean o;
    public final b.a p;
    public r q;
    public v r;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "modality";
                break;
            }
            case 14: {
                arrobject[0] = "overriddenDescriptors";
                break;
            }
            case 7: {
                arrobject[0] = "substitutor";
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            }
            case 5: {
                arrobject[0] = "source";
                break;
            }
            case 4: {
                arrobject[0] = "name";
                break;
            }
            case 3: {
                arrobject[0] = "annotations";
                break;
            }
            case 2: {
                arrobject[0] = "correspondingProperty";
                break;
            }
            case 1: {
                arrobject[0] = "visibility";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            }
            case 13: {
                arrobject[1] = "getOverriddenDescriptors";
                break;
            }
            case 12: {
                arrobject[1] = "getCorrespondingProperty";
                break;
            }
            case 11: {
                arrobject[1] = "getCorrespondingVariable";
                break;
            }
            case 10: {
                arrobject[1] = "getVisibility";
                break;
            }
            case 9: {
                arrobject[1] = "getModality";
                break;
            }
            case 8: {
                arrobject[1] = "getTypeParameters";
                break;
            }
            case 6: {
                arrobject[1] = "getKind";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 14: {
                arrobject[2] = "setOverriddenDescriptors";
                break;
            }
            case 7: {
                arrobject[2] = "substitute";
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                object = new IllegalArgumentException(string2);
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public e0(b0 b02, r r2, n0 n02, h h2, e e2, boolean bl, boolean bl2, boolean bl3, b.a a2, u0 u02) {
        if (b02 != null) {
            if (r2 != null) {
                if (h2 != null) {
                    if (u02 != null) {
                        super(n02.getContainingDeclaration(), h2, e2, u02);
                        this.r = null;
                        this.m = b02;
                        this.q = r2;
                        this.n = n02;
                        this.k = bl;
                        this.l = bl2;
                        this.o = bl3;
                        this.p = a2;
                        return;
                    }
                    e0.$$$reportNull$$$0(5);
                    throw null;
                }
                e0.$$$reportNull$$$0(3);
                throw null;
            }
            e0.$$$reportNull$$$0(1);
            throw null;
        }
        e0.$$$reportNull$$$0(0);
        throw null;
    }

    @Override
    public n0 O() {
        n0 n02 = this.n;
        if (n02 != null) {
            return n02;
        }
        e0.$$$reportNull$$$0(12);
        throw null;
    }

    @Override
    public b copy(k k2, b0 b02, r r2, b.a a2, boolean bl) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override
    public q0 getDispatchReceiverParameter() {
        return this.O().getDispatchReceiverParameter();
    }

    @Override
    public q0 getExtensionReceiverParameter() {
        return this.O().getExtensionReceiverParameter();
    }

    @Override
    public v getInitialSignatureDescriptor() {
        return this.r;
    }

    @Override
    public b.a getKind() {
        b.a a2 = this.p;
        if (a2 != null) {
            return a2;
        }
        e0.$$$reportNull$$$0(6);
        throw null;
    }

    @Override
    public b0 getModality() {
        b0 b02 = this.m;
        if (b02 != null) {
            return b02;
        }
        e0.$$$reportNull$$$0(9);
        throw null;
    }

    @Override
    public List<z0> getTypeParameters() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        e0.$$$reportNull$$$0(8);
        throw null;
    }

    @Override
    public <V> V getUserData(a.a<V> a2) {
        return null;
    }

    @Override
    public r getVisibility() {
        r r2 = this.q;
        if (r2 != null) {
            return r2;
        }
        e0.$$$reportNull$$$0(10);
        throw null;
    }

    @Override
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override
    public boolean isActual() {
        return false;
    }

    @Override
    public boolean isExpect() {
        return false;
    }

    @Override
    public boolean isExternal() {
        return this.l;
    }

    @Override
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return false;
    }

    @Override
    public boolean isHiddenToOvercomeSignatureClash() {
        return false;
    }

    @Override
    public boolean isInfix() {
        return false;
    }

    @Override
    public boolean isInline() {
        return this.o;
    }

    @Override
    public boolean isOperator() {
        return false;
    }

    @Override
    public boolean isSuspend() {
        return false;
    }

    @Override
    public boolean isTailrec() {
        return false;
    }

    public abstract m0 n();

    public Collection<m0> o(boolean bl) {
        ArrayList arrayList = new ArrayList(0);
        for (n0 n02 : this.O().getOverriddenDescriptors()) {
            m0 m02 = bl ? n02.a() : n02.c();
            if (m02 == null) continue;
            arrayList.add((Object)m02);
        }
        return arrayList;
    }

    @Override
    public void setOverriddenDescriptors(Collection<? extends b> collection) {
    }

    @Override
    public v substitute(h1 h12) {
        if (h12 == null) {
            e0.$$$reportNull$$$0(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean u() {
        return this.k;
    }
}

