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
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.f
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.w
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.c.k1;

import e.e.a.a.a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.d;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.f;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k1.j;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.w;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.o;
import k.b0.x.b.x0.m.y0;

public class k
extends j {
    public final b0 n;
    public final f o;
    public final y0 p;
    public k.b0.x.b.x0.j.a0.h q;
    public Set<d> r;
    public d s;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 12: {
                arrobject[0] = "kotlinTypeRefiner";
                break;
            }
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            }
            case 8: {
                arrobject[0] = "constructors";
                break;
            }
            case 7: {
                arrobject[0] = "unsubstitutedMemberScope";
                break;
            }
            case 6: {
                arrobject[0] = "storageManager";
                break;
            }
            case 5: {
                arrobject[0] = "source";
                break;
            }
            case 4: {
                arrobject[0] = "supertypes";
                break;
            }
            case 3: {
                arrobject[0] = "kind";
                break;
            }
            case 2: {
                arrobject[0] = "modality";
                break;
            }
            case 1: {
                arrobject[0] = "name";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            }
            case 19: {
                arrobject[1] = "getSealedSubclasses";
                break;
            }
            case 18: {
                arrobject[1] = "getDeclaredTypeParameters";
                break;
            }
            case 17: {
                arrobject[1] = "getVisibility";
                break;
            }
            case 16: {
                arrobject[1] = "getModality";
                break;
            }
            case 15: {
                arrobject[1] = "getKind";
                break;
            }
            case 14: {
                arrobject[1] = "getStaticScope";
                break;
            }
            case 13: {
                arrobject[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 11: {
                arrobject[1] = "getConstructors";
                break;
            }
            case 10: {
                arrobject[1] = "getTypeConstructor";
                break;
            }
            case 9: {
                arrobject[1] = "getAnnotations";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 12: {
                arrobject[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 7: 
            case 8: {
                arrobject[2] = "initialize";
            }
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                object = new IllegalArgumentException(string2);
                break;
            }
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public k(k.b0.x.b.x0.c.k k2, k.b0.x.b.x0.g.e e2, b0 b02, f f2, Collection<f0> collection, u0 u02, boolean bl, m m2) {
        if (k2 != null) {
            if (e2 != null) {
                if (collection != null) {
                    if (m2 != null) {
                        super(m2, k2, e2, u02, bl);
                        this.n = b02;
                        this.o = f2;
                        this.p = new o(this, (List<? extends z0>)Collections.emptyList(), collection, m2);
                        return;
                    }
                    k.$$$reportNull$$$0(6);
                    throw null;
                }
                k.$$$reportNull$$$0(4);
                throw null;
            }
            k.$$$reportNull$$$0(1);
            throw null;
        }
        k.$$$reportNull$$$0(0);
        throw null;
    }

    public h getAnnotations() {
        Objects.requireNonNull((Object)h.g);
        h h2 = h.a.b;
        if (h2 != null) {
            return h2;
        }
        k.$$$reportNull$$$0(9);
        throw null;
    }

    @Override
    public e getCompanionObjectDescriptor() {
        return null;
    }

    @Override
    public Collection<d> getConstructors() {
        Set<d> set = this.r;
        if (set != null) {
            return set;
        }
        k.$$$reportNull$$$0(11);
        throw null;
    }

    @Override
    public List<z0> getDeclaredTypeParameters() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        k.$$$reportNull$$$0(18);
        throw null;
    }

    @Override
    public w<m0> getInlineClassRepresentation() {
        return null;
    }

    @Override
    public f getKind() {
        f f2 = this.o;
        if (f2 != null) {
            return f2;
        }
        k.$$$reportNull$$$0(15);
        throw null;
    }

    @Override
    public b0 getModality() {
        b0 b02 = this.n;
        if (b02 != null) {
            return b02;
        }
        k.$$$reportNull$$$0(16);
        throw null;
    }

    @Override
    public Collection<e> getSealedSubclasses() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        k.$$$reportNull$$$0(19);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getStaticScope() {
        h.b b2 = h.b.b;
        if (b2 != null) {
            return b2;
        }
        k.$$$reportNull$$$0(14);
        throw null;
    }

    @Override
    public y0 getTypeConstructor() {
        y0 y02 = this.p;
        if (y02 != null) {
            return y02;
        }
        k.$$$reportNull$$$0(10);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getUnsubstitutedMemberScope(k.b0.x.b.x0.m.p1.d d2) {
        if (d2 != null) {
            k.b0.x.b.x0.j.a0.h h2 = this.q;
            if (h2 != null) {
                return h2;
            }
            k.$$$reportNull$$$0(13);
            throw null;
        }
        k.$$$reportNull$$$0(12);
        throw null;
    }

    @Override
    public d getUnsubstitutedPrimaryConstructor() {
        return this.s;
    }

    @Override
    public r getVisibility() {
        r r2 = q.e;
        if (r2 != null) {
            return r2;
        }
        k.$$$reportNull$$$0(17);
        throw null;
    }

    @Override
    public boolean isActual() {
        return false;
    }

    @Override
    public boolean isCompanionObject() {
        return false;
    }

    @Override
    public boolean isData() {
        return false;
    }

    @Override
    public boolean isExpect() {
        return false;
    }

    @Override
    public boolean isFun() {
        return false;
    }

    @Override
    public boolean isInline() {
        return false;
    }

    @Override
    public boolean isInner() {
        return false;
    }

    @Override
    public boolean isValue() {
        return false;
    }

    public final void n(k.b0.x.b.x0.j.a0.h h2, Set<d> set, d d2) {
        if (h2 != null) {
            if (set != null) {
                this.q = h2;
                this.r = set;
                this.s = d2;
                return;
            }
            k.$$$reportNull$$$0(8);
            throw null;
        }
        k.$$$reportNull$$$0(7);
        throw null;
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"class ");
        stringBuilder.append((Object)this.getName());
        return stringBuilder.toString();
    }
}

