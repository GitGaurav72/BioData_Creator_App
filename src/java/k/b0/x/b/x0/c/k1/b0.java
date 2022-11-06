/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
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
 *  k.b0.x.b.x0.c.k1.m
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.w
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.c.k1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.c.d;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.f;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.j;
import k.b0.x.b.x0.c.k1.m;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.w;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.y0;

public class b0
extends j {
    public final f n;
    public final boolean o;
    public k.b0.x.b.x0.c.b0 p;
    public r q;
    public y0 r;
    public List<z0> s;
    public final Collection<f0> t;
    public final k.b0.x.b.x0.l.m u;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
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
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
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
            case 16: {
                arrobject[0] = "kotlinTypeRefiner";
                break;
            }
            case 14: {
                arrobject[0] = "typeParameters";
                break;
            }
            case 12: {
                arrobject[0] = "supertype";
                break;
            }
            case 9: {
                arrobject[0] = "visibility";
                break;
            }
            case 6: {
                arrobject[0] = "modality";
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            }
            case 4: {
                arrobject[0] = "storageManager";
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
                arrobject[0] = "kind";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            }
            case 19: {
                arrobject[1] = "getSealedSubclasses";
                break;
            }
            case 18: {
                arrobject[1] = "getStaticScope";
                break;
            }
            case 17: {
                arrobject[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 15: {
                arrobject[1] = "getDeclaredTypeParameters";
                break;
            }
            case 13: {
                arrobject[1] = "getConstructors";
                break;
            }
            case 11: {
                arrobject[1] = "getTypeConstructor";
                break;
            }
            case 10: {
                arrobject[1] = "getVisibility";
                break;
            }
            case 8: {
                arrobject[1] = "getKind";
                break;
            }
            case 7: {
                arrobject[1] = "getModality";
                break;
            }
            case 5: {
                arrobject[1] = "getAnnotations";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 16: {
                arrobject[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 14: {
                arrobject[2] = "setTypeParameterDescriptors";
                break;
            }
            case 12: {
                arrobject[2] = "addSupertype";
                break;
            }
            case 9: {
                arrobject[2] = "setVisibility";
                break;
            }
            case 6: {
                arrobject[2] = "setModality";
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
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
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public b0(k k2, f f2, boolean bl, boolean bl2, k.b0.x.b.x0.g.e e2, u0 u02, k.b0.x.b.x0.l.m m2) {
        if (e2 != null) {
            if (m2 != null) {
                super(m2, k2, e2, u02, bl2);
                this.t = new ArrayList();
                this.u = m2;
                this.n = f2;
                this.o = bl;
                return;
            }
            b0.$$$reportNull$$$0(4);
            throw null;
        }
        b0.$$$reportNull$$$0(2);
        throw null;
    }

    public h getAnnotations() {
        Objects.requireNonNull((Object)h.g);
        h h2 = h.a.b;
        if (h2 != null) {
            return h2;
        }
        b0.$$$reportNull$$$0(5);
        throw null;
    }

    @Override
    public e getCompanionObjectDescriptor() {
        return null;
    }

    public Collection getConstructors() {
        Set set = Collections.emptySet();
        if (set != null) {
            return set;
        }
        b0.$$$reportNull$$$0(13);
        throw null;
    }

    @Override
    public List<z0> getDeclaredTypeParameters() {
        List<z0> list = this.s;
        if (list != null) {
            return list;
        }
        b0.$$$reportNull$$$0(15);
        throw null;
    }

    @Override
    public w<m0> getInlineClassRepresentation() {
        return null;
    }

    @Override
    public f getKind() {
        f f2 = this.n;
        if (f2 != null) {
            return f2;
        }
        b0.$$$reportNull$$$0(8);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.c.b0 getModality() {
        k.b0.x.b.x0.c.b0 b02 = this.p;
        if (b02 != null) {
            return b02;
        }
        b0.$$$reportNull$$$0(7);
        throw null;
    }

    @Override
    public Collection<e> getSealedSubclasses() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        b0.$$$reportNull$$$0(19);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getStaticScope() {
        h.b b2 = h.b.b;
        if (b2 != null) {
            return b2;
        }
        b0.$$$reportNull$$$0(18);
        throw null;
    }

    @Override
    public y0 getTypeConstructor() {
        y0 y02 = this.r;
        if (y02 != null) {
            return y02;
        }
        b0.$$$reportNull$$$0(11);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getUnsubstitutedMemberScope(k.b0.x.b.x0.m.p1.d d2) {
        if (d2 != null) {
            h.b b2 = h.b.b;
            if (b2 != null) {
                return b2;
            }
            b0.$$$reportNull$$$0(17);
            throw null;
        }
        b0.$$$reportNull$$$0(16);
        throw null;
    }

    @Override
    public d getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override
    public r getVisibility() {
        r r2 = this.q;
        if (r2 != null) {
            return r2;
        }
        b0.$$$reportNull$$$0(10);
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
        return this.o;
    }

    @Override
    public boolean isValue() {
        return false;
    }

    public String toString() {
        return m.toString((k)this);
    }
}

