/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.f
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.u$a
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.v$a
 *  k.b0.x.b.x0.c.w
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.j.a0.l
 *  k.b0.x.b.x0.l.e
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.p1.d$a
 *  k.b0.x.b.x0.m.r1.j
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.k1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.d;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.f;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.u;
import k.b0.x.b.x0.c.k1.v;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.w;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.j.g;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.e1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g0;
import k.b0.x.b.x0.m.h1;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.o;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.r1.j;
import k.b0.x.b.x0.m.y0;
import k.s.i;

public class u
extends v {
    public final v k;
    public final h1 l;
    public h1 m;
    public List<z0> n;
    public List<z0> o;
    public y0 p;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        Object[] arrobject;
        block28 : {
            block25 : {
                block26 : {
                    block27 : {
                        string = n2 != 2 && n2 != 3 && n2 != 5 && n2 != 6 && n2 != 8 && n2 != 10 && n2 != 13 && n2 != 22 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        int n3 = n2 != 2 && n2 != 3 && n2 != 5 && n2 != 6 && n2 != 8 && n2 != 10 && n2 != 13 && n2 != 22 ? 2 : 3;
                        arrobject = new Object[n3];
                        if (n2 == 2) break block25;
                        if (n2 == 3) break block26;
                        if (n2 == 5) break block27;
                        if (n2 == 6) break block26;
                        if (n2 == 8) break block25;
                        if (n2 == 10) break block27;
                        if (n2 == 13) break block26;
                        arrobject[0] = n2 != 22 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor" : "substitutor";
                        break block28;
                    }
                    arrobject[0] = "typeSubstitution";
                    break block28;
                }
                arrobject[0] = "kotlinTypeRefiner";
                break block28;
            }
            arrobject[0] = "typeArguments";
        }
        switch (n2) {
            default: {
                arrobject[1] = "getTypeConstructor";
                break;
            }
            case 30: {
                arrobject[1] = "getSealedSubclasses";
                break;
            }
            case 29: {
                arrobject[1] = "getDeclaredTypeParameters";
                break;
            }
            case 28: {
                arrobject[1] = "getSource";
                break;
            }
            case 27: {
                arrobject[1] = "getUnsubstitutedInnerClassesScope";
                break;
            }
            case 26: {
                arrobject[1] = "getVisibility";
                break;
            }
            case 25: {
                arrobject[1] = "getModality";
                break;
            }
            case 24: {
                arrobject[1] = "getKind";
                break;
            }
            case 23: {
                arrobject[1] = "substitute";
                break;
            }
            case 21: {
                arrobject[1] = "getContainingDeclaration";
                break;
            }
            case 20: {
                arrobject[1] = "getOriginal";
                break;
            }
            case 19: {
                arrobject[1] = "getName";
                break;
            }
            case 18: {
                arrobject[1] = "getAnnotations";
                break;
            }
            case 17: {
                arrobject[1] = "getConstructors";
                break;
            }
            case 16: {
                arrobject[1] = "getDefaultType";
                break;
            }
            case 15: {
                arrobject[1] = "getStaticScope";
                break;
            }
            case 12: 
            case 14: {
                arrobject[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 11: {
                arrobject[1] = "getMemberScope";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 22: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
            }
        }
        if (n2 != 2 && n2 != 3 && n2 != 5 && n2 != 6 && n2 != 8 && n2 != 10) {
            if (n2 != 13) {
                if (n2 == 22) {
                    arrobject[2] = "substitute";
                }
            } else {
                arrobject[2] = "getUnsubstitutedMemberScope";
            }
        } else {
            arrobject[2] = "getMemberScope";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 2 && n2 != 3 && n2 != 5 && n2 != 6 && n2 != 8 && n2 != 10 && n2 != 13 && n2 != 22 ? new IllegalStateException(string2) : new IllegalArgumentException(string2);
        throw object;
    }

    public u(v v2, h1 h12) {
        this.k = v2;
        this.l = h12;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)m2.a((e)this, d2);
    }

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        k.b0.x.b.x0.c.i1.h h2 = this.k.getAnnotations();
        if (h2 != null) {
            return h2;
        }
        u.$$$reportNull$$$0(18);
        throw null;
    }

    @Override
    public e getCompanionObjectDescriptor() {
        return this.k.getCompanionObjectDescriptor();
    }

    @Override
    public Collection<d> getConstructors() {
        Collection<d> collection = this.k.getConstructors();
        ArrayList arrayList = new ArrayList(collection.size());
        for (d d2 : collection) {
            arrayList.add((Object)((d)d2.newCopyBuilder().g((b)d2.getOriginal()).c(d2.getModality()).n(d2.getVisibility()).q(d2.getKind()).i(false).build()).substitute(this.n()));
        }
        return arrayList;
    }

    @Override
    public k getContainingDeclaration() {
        k k2 = this.k.getContainingDeclaration();
        if (k2 != null) {
            return k2;
        }
        u.$$$reportNull$$$0(21);
        throw null;
    }

    @Override
    public List<z0> getDeclaredTypeParameters() {
        this.n();
        List<z0> list = this.o;
        if (list != null) {
            return list;
        }
        u.$$$reportNull$$$0(29);
        throw null;
    }

    @Override
    public m0 getDefaultType() {
        List<b1> list = j1.f((List<z0>)this.getTypeConstructor().getParameters());
        return g0.h(this.getAnnotations(), this.getTypeConstructor(), list, false, this.getUnsubstitutedMemberScope());
    }

    @Override
    public w<m0> getInlineClassRepresentation() {
        w<m0> w2 = this.k.getInlineClassRepresentation();
        if (w2 == null) {
            return null;
        }
        k.b0.x.b.x0.g.e e2 = w2.a;
        m0 m02 = (m0)this.getInlineClassRepresentation().b;
        if (m02 != null && !this.l.h()) {
            m02 = (m0)this.n().k((f0)m02, n1.k);
        }
        return new w(e2, (j)m02);
    }

    @Override
    public f getKind() {
        f f2 = this.k.getKind();
        if (f2 != null) {
            return f2;
        }
        u.$$$reportNull$$$0(24);
        throw null;
    }

    @Override
    public h getMemberScope(e1 e12) {
        k.b0.x.b.x0.j.y.a.i(g.d((k)this));
        h h2 = this.getMemberScope(e12, (k.b0.x.b.x0.m.p1.d)d.a.a);
        if (h2 != null) {
            return h2;
        }
        u.$$$reportNull$$$0(11);
        throw null;
    }

    @Override
    public h getMemberScope(e1 e12, k.b0.x.b.x0.m.p1.d d2) {
        if (e12 != null) {
            if (d2 != null) {
                h h2 = this.k.getMemberScope(e12, d2);
                if (this.l.h()) {
                    if (h2 != null) {
                        return h2;
                    }
                    u.$$$reportNull$$$0(7);
                    throw null;
                }
                return new k.b0.x.b.x0.j.a0.l(h2, this.n());
            }
            u.$$$reportNull$$$0(6);
            throw null;
        }
        u.$$$reportNull$$$0(5);
        throw null;
    }

    @Override
    public b0 getModality() {
        b0 b02 = this.k.getModality();
        if (b02 != null) {
            return b02;
        }
        u.$$$reportNull$$$0(25);
        throw null;
    }

    public k.b0.x.b.x0.g.e getName() {
        k.b0.x.b.x0.g.e e2 = this.k.getName();
        if (e2 != null) {
            return e2;
        }
        u.$$$reportNull$$$0(19);
        throw null;
    }

    @Override
    public e getOriginal() {
        e e2 = this.k.getOriginal();
        if (e2 != null) {
            return e2;
        }
        u.$$$reportNull$$$0(20);
        throw null;
    }

    @Override
    public Collection<e> getSealedSubclasses() {
        Collection<e> collection = this.k.getSealedSubclasses();
        if (collection != null) {
            return collection;
        }
        u.$$$reportNull$$$0(30);
        throw null;
    }

    public u0 getSource() {
        return u0.a;
    }

    @Override
    public h getStaticScope() {
        h h2 = this.k.getStaticScope();
        if (h2 != null) {
            return h2;
        }
        u.$$$reportNull$$$0(15);
        throw null;
    }

    @Override
    public q0 getThisAsReceiverParameter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public y0 getTypeConstructor() {
        y0 y02;
        y0 y03 = this.k.getTypeConstructor();
        if (this.l.h()) {
            if (y03 != null) {
                return y03;
            }
            u.$$$reportNull$$$0(0);
            throw null;
        }
        if (this.p == null) {
            h1 h12 = this.n();
            Collection collection = y03.getSupertypes();
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)h12.k((f0)iterator.next(), n1.k));
            }
            this.p = new o(this, this.n, (Collection<f0>)arrayList, k.b0.x.b.x0.l.e.b);
        }
        if ((y02 = this.p) != null) {
            return y02;
        }
        u.$$$reportNull$$$0(1);
        throw null;
    }

    @Override
    public h getUnsubstitutedInnerClassesScope() {
        h h2 = this.k.getUnsubstitutedInnerClassesScope();
        if (h2 != null) {
            return h2;
        }
        u.$$$reportNull$$$0(27);
        throw null;
    }

    @Override
    public h getUnsubstitutedMemberScope() {
        k.b0.x.b.x0.j.y.a.i(g.d((k)this.k));
        h h2 = this.getUnsubstitutedMemberScope((k.b0.x.b.x0.m.p1.d)d.a.a);
        if (h2 != null) {
            return h2;
        }
        u.$$$reportNull$$$0(12);
        throw null;
    }

    @Override
    public h getUnsubstitutedMemberScope(k.b0.x.b.x0.m.p1.d d2) {
        if (d2 != null) {
            h h2 = this.k.getUnsubstitutedMemberScope(d2);
            if (this.l.h()) {
                if (h2 != null) {
                    return h2;
                }
                u.$$$reportNull$$$0(14);
                throw null;
            }
            return new k.b0.x.b.x0.j.a0.l(h2, this.n());
        }
        u.$$$reportNull$$$0(13);
        throw null;
    }

    @Override
    public d getUnsubstitutedPrimaryConstructor() {
        return this.k.getUnsubstitutedPrimaryConstructor();
    }

    @Override
    public r getVisibility() {
        r r2 = this.k.getVisibility();
        if (r2 != null) {
            return r2;
        }
        u.$$$reportNull$$$0(26);
        throw null;
    }

    @Override
    public boolean isActual() {
        return this.k.isActual();
    }

    @Override
    public boolean isCompanionObject() {
        return this.k.isCompanionObject();
    }

    @Override
    public boolean isData() {
        return this.k.isData();
    }

    @Override
    public boolean isExpect() {
        return this.k.isExpect();
    }

    @Override
    public boolean isExternal() {
        return this.k.isExternal();
    }

    @Override
    public boolean isFun() {
        return this.k.isFun();
    }

    @Override
    public boolean isInline() {
        return this.k.isInline();
    }

    @Override
    public boolean isInner() {
        return this.k.isInner();
    }

    @Override
    public boolean isValue() {
        return this.k.isValue();
    }

    public final h1 n() {
        if (this.m == null) {
            if (this.l.h()) {
                this.m = this.l;
            } else {
                List list = this.k.getTypeConstructor().getParameters();
                this.n = new ArrayList(list.size());
                this.m = e.s.a.a.X3((List)list, (e1)this.l.g(), (k)this, this.n);
                this.o = i.p(this.n, (k.x.b.l)new a(this));
            }
        }
        return this.m;
    }

    public l substitute(h1 h12) {
        if (h12 != null) {
            if (h12.h()) {
                return this;
            }
            return new u(this, h1.f(h12.g(), this.n().g()));
        }
        u.$$$reportNull$$$0(22);
        throw null;
    }
}

