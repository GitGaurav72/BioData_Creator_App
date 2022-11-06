/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.x0
 *  k.b0.x.b.x0.c.x0$a
 *  k.b0.x.b.x0.m.f0
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.k1;

import java.util.ArrayList;
import java.util.List;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.g;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.x0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.j.y.a;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.x.b.l;

public class n0
extends g {
    public final l<f0, Void> q;
    public final List<f0> r;
    public boolean s;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 5 && n2 != 28 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 5 && n2 != 28 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 27: {
                arrobject[0] = "type";
                break;
            }
            case 26: {
                arrobject[0] = "bound";
                break;
            }
            case 24: {
                arrobject[0] = "supertypeLoopsChecker";
                break;
            }
            case 17: {
                arrobject[0] = "supertypeLoopsResolver";
                break;
            }
            case 10: 
            case 16: 
            case 23: {
                arrobject[0] = "source";
                break;
            }
            case 5: 
            case 28: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            }
            case 4: 
            case 11: 
            case 18: 
            case 25: {
                arrobject[0] = "storageManager";
                break;
            }
            case 3: 
            case 9: 
            case 15: 
            case 22: {
                arrobject[0] = "name";
                break;
            }
            case 2: 
            case 8: 
            case 14: 
            case 21: {
                arrobject[0] = "variance";
                break;
            }
            case 1: 
            case 7: 
            case 13: 
            case 20: {
                arrobject[0] = "annotations";
            }
        }
        arrobject[1] = n2 != 5 ? (n2 != 28 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl" : "resolveUpperBounds") : "createWithDefaultBound";
        switch (n2) {
            default: {
                arrobject[2] = "createWithDefaultBound";
                break;
            }
            case 27: {
                arrobject[2] = "reportSupertypeLoopError";
                break;
            }
            case 26: {
                arrobject[2] = "addUpperBound";
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                arrobject[2] = "<init>";
                break;
            }
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                arrobject[2] = "createForFurtherModification";
            }
            case 5: 
            case 28: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 5 && n2 != 28 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public n0(k k2, h h2, boolean bl, n1 n12, e e2, int n2, u0 u02, l<f0, Void> l2, x0 x02, m m2) {
        if (k2 != null) {
            if (h2 != null) {
                if (n12 != null) {
                    if (e2 != null) {
                        if (u02 != null) {
                            if (x02 != null) {
                                if (m2 != null) {
                                    super(m2, k2, h2, e2, n12, bl, n2, u02, x02);
                                    this.r = new ArrayList(1);
                                    this.s = false;
                                    this.q = l2;
                                    return;
                                }
                                n0.$$$reportNull$$$0(25);
                                throw null;
                            }
                            n0.$$$reportNull$$$0(24);
                            throw null;
                        }
                        n0.$$$reportNull$$$0(23);
                        throw null;
                    }
                    n0.$$$reportNull$$$0(22);
                    throw null;
                }
                n0.$$$reportNull$$$0(21);
                throw null;
            }
            n0.$$$reportNull$$$0(20);
            throw null;
        }
        n0.$$$reportNull$$$0(19);
        throw null;
    }

    public static n0 T(k k2, h h2, boolean bl, n1 n12, e e2, int n2, u0 u02, m m2) {
        if (k2 != null) {
            if (h2 != null) {
                if (n12 != null) {
                    if (e2 != null) {
                        if (m2 != null) {
                            x0.a a2 = x0.a.a;
                            n0 n02 = new n0(k2, h2, bl, n12, e2, n2, u02, null, (x0)a2, m2);
                            return n02;
                        }
                        n0.$$$reportNull$$$0(11);
                        throw null;
                    }
                    n0.$$$reportNull$$$0(9);
                    throw null;
                }
                n0.$$$reportNull$$$0(8);
                throw null;
            }
            n0.$$$reportNull$$$0(7);
            throw null;
        }
        n0.$$$reportNull$$$0(6);
        throw null;
    }

    public static z0 U(k k2, h h2, boolean bl, n1 n12, e e2, int n2, m m2) {
        if (k2 != null) {
            if (h2 != null) {
                if (n12 != null) {
                    if (m2 != null) {
                        n0 n02 = n0.T(k2, h2, bl, n12, e2, n2, u0.a, m2);
                        n02.P((f0)a.e(k2).getDefaultBound());
                        n02.S();
                        n02.s = true;
                        return n02;
                    }
                    n0.$$$reportNull$$$0(4);
                    throw null;
                }
                n0.$$$reportNull$$$0(2);
                throw null;
            }
            n0.$$$reportNull$$$0(1);
            throw null;
        }
        n0.$$$reportNull$$$0(0);
        throw null;
    }

    public void P(f0 f02) {
        if (f02 != null) {
            this.S();
            if (e.s.a.a.s2((f0)f02)) {
                return;
            }
            this.r.add((Object)f02);
            return;
        }
        n0.$$$reportNull$$$0(26);
        throw null;
    }

    public final void S() {
        if (!this.s) {
            return;
        }
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Type parameter descriptor is already initialized: ");
        stringBuilder.append(this.V());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final String V() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.getName());
        stringBuilder.append(" declared in ");
        stringBuilder.append((Object)k.b0.x.b.x0.j.g.g(this.getContainingDeclaration()));
        return stringBuilder.toString();
    }

    @Override
    public void o(f0 f02) {
        if (f02 != null) {
            l<f0, Void> l2 = this.q;
            if (l2 == null) {
                return;
            }
            l2.invoke((Object)f02);
            return;
        }
        n0.$$$reportNull$$$0(27);
        throw null;
    }

    @Override
    public List<f0> q() {
        if (this.s) {
            List<f0> list = this.r;
            if (list != null) {
                return list;
            }
            n0.$$$reportNull$$$0(28);
            throw null;
        }
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Type parameter descriptor is not initialized: ");
        stringBuilder.append(this.V());
        throw new IllegalStateException(stringBuilder.toString());
    }
}

