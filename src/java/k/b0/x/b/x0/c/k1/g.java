/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.g$a
 *  k.b0.x.b.x0.c.k1.g$b
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.x0
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.y0
 *  k.x.b.a
 *  k.x.b.p
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.c.k1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.g;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.x0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.d;
import k.b0.x.b.x0.j.e;
import k.b0.x.b.x0.l.i;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.x.b.p;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public abstract class g
extends k.b0.x.b.x0.c.k1.n
implements z0 {
    public final n1 k;
    public final boolean l;
    public final int m;
    public final i<y0> n;
    public final i<m0> o;
    public final k.b0.x.b.x0.l.m p;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "storageManager";
                break;
            }
            case 12: {
                arrobject[0] = "bounds";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            }
            case 6: {
                arrobject[0] = "supertypeLoopChecker";
                break;
            }
            case 5: {
                arrobject[0] = "source";
                break;
            }
            case 4: {
                arrobject[0] = "variance";
                break;
            }
            case 3: {
                arrobject[0] = "name";
                break;
            }
            case 2: {
                arrobject[0] = "annotations";
                break;
            }
            case 1: {
                arrobject[0] = "containingDeclaration";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            }
            case 14: {
                arrobject[1] = "getStorageManager";
                break;
            }
            case 13: {
                arrobject[1] = "processBoundsWithoutCycles";
                break;
            }
            case 11: {
                arrobject[1] = "getOriginal";
                break;
            }
            case 10: {
                arrobject[1] = "getDefaultType";
                break;
            }
            case 9: {
                arrobject[1] = "getTypeConstructor";
                break;
            }
            case 8: {
                arrobject[1] = "getUpperBounds";
                break;
            }
            case 7: {
                arrobject[1] = "getVariance";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 12: {
                arrobject[2] = "processBoundsWithoutCycles";
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                object = new IllegalArgumentException(string2);
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public g(k.b0.x.b.x0.l.m m2, k k2, k.b0.x.b.x0.c.i1.h h2, k.b0.x.b.x0.g.e e2, n1 n12, boolean bl, int n2, u0 u02, x0 x02) {
        if (m2 != null) {
            if (k2 != null) {
                if (h2 != null) {
                    if (e2 != null) {
                        if (n12 != null) {
                            if (u02 != null) {
                                if (x02 != null) {
                                    super(k2, h2, e2, u02);
                                    this.k = n12;
                                    this.l = bl;
                                    this.m = n2;
                                    this.n = m2.d(new a(this, m2, x02));
                                    this.o = m2.d(new b(this, e2));
                                    this.p = m2;
                                    return;
                                }
                                g.$$$reportNull$$$0(6);
                                throw null;
                            }
                            g.$$$reportNull$$$0(5);
                            throw null;
                        }
                        g.$$$reportNull$$$0(4);
                        throw null;
                    }
                    g.$$$reportNull$$$0(3);
                    throw null;
                }
                g.$$$reportNull$$$0(2);
                throw null;
            }
            g.$$$reportNull$$$0(1);
            throw null;
        }
        g.$$$reportNull$$$0(0);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.l.m D() {
        k.b0.x.b.x0.l.m m2 = this.p;
        if (m2 != null) {
            return m2;
        }
        g.$$$reportNull$$$0(14);
        throw null;
    }

    @Override
    public boolean H() {
        return false;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)m2.m((z0)this, d2);
    }

    @Override
    public n1 d() {
        n1 n12 = this.k;
        if (n12 != null) {
            return n12;
        }
        g.$$$reportNull$$$0(7);
        throw null;
    }

    @Override
    public int e() {
        return this.m;
    }

    @Override
    public m0 getDefaultType() {
        m0 m02 = (m0)this.o.invoke();
        if (m02 != null) {
            return m02;
        }
        g.$$$reportNull$$$0(10);
        throw null;
    }

    @Override
    public z0 getOriginal() {
        z0 z02 = (z0)super.getOriginal();
        if (z02 != null) {
            return z02;
        }
        g.$$$reportNull$$$0(11);
        throw null;
    }

    @Override
    public final y0 getTypeConstructor() {
        y0 y02 = (y0)this.n.invoke();
        if (y02 != null) {
            return y02;
        }
        g.$$$reportNull$$$0(9);
        throw null;
    }

    @Override
    public List<f0> getUpperBounds() {
        List<f0> list = ((c)this.getTypeConstructor()).getSupertypes();
        if (list != null) {
            return list;
        }
        g.$$$reportNull$$$0(8);
        throw null;
    }

    @Override
    public boolean m() {
        return this.l;
    }

    public List<f0> n(List<f0> list) {
        if (list != null) {
            if (list != null) {
                return list;
            }
            g.$$$reportNull$$$0(13);
            throw null;
        }
        g.$$$reportNull$$$0(12);
        throw null;
    }

    public abstract void o(f0 var1);

    public abstract List<f0> q();

    public class c
    extends k.b0.x.b.x0.m.g {
        public final x0 a;

        public static /* synthetic */ void $$$reportNull$$$0(int n2) {
            String string = n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5 && n2 != 8 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            int n3 = n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5 && n2 != 8 ? 3 : 2;
            Object[] arrobject = new Object[n3];
            switch (n2) {
                default: {
                    arrobject[0] = "storageManager";
                    break;
                }
                case 9: {
                    arrobject[0] = "classifier";
                    break;
                }
                case 7: {
                    arrobject[0] = "supertypes";
                    break;
                }
                case 6: {
                    arrobject[0] = "type";
                    break;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 8: {
                    arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                }
            }
            arrobject[1] = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? (n2 != 5 ? (n2 != 8 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor" : "processSupertypesWithoutCycles") : "getSupertypeLoopChecker") : "getBuiltIns") : "getDeclarationDescriptor") : "getParameters") : "computeSupertypes";
            switch (n2) {
                default: {
                    arrobject[2] = "<init>";
                    break;
                }
                case 9: {
                    arrobject[2] = "isSameClassifier";
                    break;
                }
                case 7: {
                    arrobject[2] = "processSupertypesWithoutCycles";
                    break;
                }
                case 6: {
                    arrobject[2] = "reportSupertypeLoopError";
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 8: 
            }
            String string2 = String.format((String)string, (Object[])arrobject);
            IllegalStateException illegalStateException = n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5 && n2 != 8 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
            throw illegalStateException;
        }

        public c(k.b0.x.b.x0.l.m m2, x0 x02) {
            if (m2 != null) {
                super(m2);
                this.a = x02;
                return;
            }
            c.$$$reportNull$$$0(0);
            throw null;
        }

        @Override
        public Collection<f0> computeSupertypes() {
            List<f0> list = g.this.q();
            if (list != null) {
                return list;
            }
            c.$$$reportNull$$$0(1);
            throw null;
        }

        @Override
        public f0 defaultSupertypeIfEmpty() {
            return y.d("Cyclic upper bounds");
        }

        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns kotlinBuiltIns = k.b0.x.b.x0.j.y.a.e((k)g.this);
            if (kotlinBuiltIns != null) {
                return kotlinBuiltIns;
            }
            c.$$$reportNull$$$0(4);
            throw null;
        }

        public h getDeclarationDescriptor() {
            g g2 = g.this;
            if (g2 != null) {
                return g2;
            }
            c.$$$reportNull$$$0(3);
            throw null;
        }

        public List<z0> getParameters() {
            List list = Collections.emptyList();
            if (list != null) {
                return list;
            }
            c.$$$reportNull$$$0(2);
            throw null;
        }

        @Override
        public x0 getSupertypeLoopChecker() {
            x0 x02 = this.a;
            if (x02 != null) {
                return x02;
            }
            c.$$$reportNull$$$0(5);
            throw null;
        }

        public boolean isDenotable() {
            return true;
        }

        public boolean isSameClassifier(h h2) {
            if (h2 instanceof z0) {
                e e2 = e.a;
                g g2 = g.this;
                z0 z02 = (z0)h2;
                k.x.c.i.e(g2, "a");
                k.x.c.i.e(z02, "b");
                if (e2.b(g2, z02, true, d.k)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public List<f0> processSupertypesWithoutCycles(List<f0> list) {
            List<f0> list2 = g.this.n(list);
            if (list2 != null) {
                return list2;
            }
            c.$$$reportNull$$$0(8);
            throw null;
        }

        @Override
        public void reportSupertypeLoopError(f0 f02) {
            g.this.o(f02);
        }

        public String toString() {
            return g.this.getName().k;
        }
    }

}

