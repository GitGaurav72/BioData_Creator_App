/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.b$a
 *  k.b0.x.b.x0.c.k1.b$b
 *  k.b0.x.b.x0.c.k1.b$c
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.j.a0.l
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.p1.d$a
 *  k.x.b.a
 */
package k.b0.x.b.x0.c.k1;

import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.b;
import k.b0.x.b.x0.c.k1.u;
import k.b0.x.b.x0.c.k1.v;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.j.g;
import k.b0.x.b.x0.l.i;
import k.b0.x.b.x0.m.e1;
import k.b0.x.b.x0.m.h1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.p1.d;

public abstract class b
extends v {
    public static final /* synthetic */ boolean $assertionsDisabled;
    public final i<m0> defaultType;
    private final k.b0.x.b.x0.g.e name;
    private final i<q0> thisAsReceiverParameter;
    private final i<k.b0.x.b.x0.j.a0.h> unsubstitutedInnerClassesScope;

    private static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5 && n2 != 8 && n2 != 11 && n2 != 13 && n2 != 15 && n2 != 16 && n2 != 18 && n2 != 19 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5 && n2 != 8 && n2 != 11 && n2 != 13 && n2 != 15 && n2 != 16 && n2 != 18 && n2 != 19 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "storageManager";
                break;
            }
            case 17: {
                arrobject[0] = "substitutor";
                break;
            }
            case 9: 
            case 14: {
                arrobject[0] = "typeSubstitution";
                break;
            }
            case 7: 
            case 10: {
                arrobject[0] = "kotlinTypeRefiner";
                break;
            }
            case 6: 
            case 12: {
                arrobject[0] = "typeArguments";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 16: 
            case 18: 
            case 19: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            }
            case 1: {
                arrobject[0] = "name";
            }
        }
        arrobject[1] = n2 != 2 ? (n2 != 3 ? (n2 != 4 ? (n2 != 5 ? (n2 != 8 && n2 != 11 && n2 != 13 && n2 != 15 ? (n2 != 16 ? (n2 != 18 ? (n2 != 19 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor" : "getDefaultType") : "substitute") : "getUnsubstitutedMemberScope") : "getMemberScope") : "getThisAsReceiverParameter") : "getUnsubstitutedInnerClassesScope") : "getOriginal") : "getName";
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 17: {
                arrobject[2] = "substitute";
                break;
            }
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 14: {
                arrobject[2] = "getMemberScope";
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5 && n2 != 8 && n2 != 11 && n2 != 13 && n2 != 15 && n2 != 16 && n2 != 18 && n2 != 19 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public b(k.b0.x.b.x0.l.m m2, k.b0.x.b.x0.g.e e2) {
        if (m2 == null) {
            b.$$$reportNull$$$0(0);
        }
        if (e2 == null) {
            b.$$$reportNull$$$0(1);
        }
        this.name = e2;
        this.defaultType = m2.d(new a(this));
        this.unsubstitutedInnerClassesScope = m2.d(new b(this));
        this.thisAsReceiverParameter = m2.d(new c(this));
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)m2.a((e)this, d2);
    }

    @Override
    public m0 getDefaultType() {
        m0 m02 = (m0)this.defaultType.invoke();
        if (m02 == null) {
            b.$$$reportNull$$$0(19);
        }
        return m02;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getMemberScope(e1 e12) {
        if (e12 == null) {
            b.$$$reportNull$$$0(14);
        }
        k.b0.x.b.x0.j.y.a.i(g.d((k)this));
        k.b0.x.b.x0.j.a0.h h2 = this.getMemberScope(e12, (d)d.a.a);
        if (h2 == null) {
            b.$$$reportNull$$$0(15);
        }
        return h2;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getMemberScope(e1 e12, d d2) {
        if (e12 == null) {
            b.$$$reportNull$$$0(9);
        }
        if (d2 == null) {
            b.$$$reportNull$$$0(10);
        }
        if (e12.f()) {
            k.b0.x.b.x0.j.a0.h h2 = this.getUnsubstitutedMemberScope(d2);
            if (h2 == null) {
                b.$$$reportNull$$$0(11);
            }
            return h2;
        }
        h1 h12 = h1.e(e12);
        return new k.b0.x.b.x0.j.a0.l(this.getUnsubstitutedMemberScope(d2), h12);
    }

    public k.b0.x.b.x0.g.e getName() {
        k.b0.x.b.x0.g.e e2 = this.name;
        if (e2 == null) {
            b.$$$reportNull$$$0(2);
        }
        return e2;
    }

    @Override
    public e getOriginal() {
        return this;
    }

    @Override
    public q0 getThisAsReceiverParameter() {
        q0 q02 = (q0)this.thisAsReceiverParameter.invoke();
        if (q02 == null) {
            b.$$$reportNull$$$0(5);
        }
        return q02;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getUnsubstitutedInnerClassesScope() {
        k.b0.x.b.x0.j.a0.h h2 = (k.b0.x.b.x0.j.a0.h)this.unsubstitutedInnerClassesScope.invoke();
        if (h2 == null) {
            b.$$$reportNull$$$0(4);
        }
        return h2;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getUnsubstitutedMemberScope() {
        k.b0.x.b.x0.j.y.a.i(g.d((k)this));
        k.b0.x.b.x0.j.a0.h h2 = this.getUnsubstitutedMemberScope((d)d.a.a);
        if (h2 == null) {
            b.$$$reportNull$$$0(16);
        }
        return h2;
    }

    public e substitute(h1 h12) {
        if (h12 == null) {
            b.$$$reportNull$$$0(17);
        }
        if (h12.h()) {
            return this;
        }
        return new u(this, h12);
    }
}

