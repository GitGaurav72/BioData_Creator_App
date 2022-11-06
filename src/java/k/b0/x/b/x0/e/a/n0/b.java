/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.a$a
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.e.a.n0;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.j;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.e.a.n0.a;
import k.b0.x.b.x0.m.f0;
import k.i;

public class b
extends k.b0.x.b.x0.c.k1.i
implements a {
    public Boolean l;
    public Boolean m;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 11 && n2 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 11 && n2 != 18 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 17: {
                arrobject[0] = "enhancedReturnType";
                break;
            }
            case 16: {
                arrobject[0] = "enhancedValueParametersData";
                break;
            }
            case 14: {
                arrobject[0] = "sourceElement";
                break;
            }
            case 11: 
            case 18: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            }
            case 7: 
            case 12: {
                arrobject[0] = "newOwner";
                break;
            }
            case 3: 
            case 6: 
            case 10: {
                arrobject[0] = "source";
                break;
            }
            case 2: 
            case 8: 
            case 13: {
                arrobject[0] = "kind";
                break;
            }
            case 1: 
            case 5: 
            case 9: 
            case 15: {
                arrobject[0] = "annotations";
            }
        }
        arrobject[1] = n2 != 11 ? (n2 != 18 ? "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor" : "enhance") : "createSubstitutedCopy";
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 16: 
            case 17: {
                arrobject[2] = "enhance";
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                arrobject[2] = "createDescriptor";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                arrobject[2] = "createSubstitutedCopy";
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                arrobject[2] = "createJavaConstructor";
            }
            case 11: 
            case 18: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 11 && n2 != 18 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public b(e e2, b b2, h h2, boolean bl, b.a a2, u0 u02) {
        if (e2 != null) {
            if (h2 != null) {
                if (a2 != null) {
                    if (u02 != null) {
                        super(e2, b2, h2, bl, a2, u02);
                        this.l = null;
                        this.m = null;
                        return;
                    }
                    b.$$$reportNull$$$0(3);
                    throw null;
                }
                b.$$$reportNull$$$0(2);
                throw null;
            }
            b.$$$reportNull$$$0(1);
            throw null;
        }
        b.$$$reportNull$$$0(0);
        throw null;
    }

    public static b S(e e2, h h2, boolean bl, u0 u02) {
        if (e2 != null) {
            if (h2 != null) {
                if (u02 != null) {
                    b b2 = new b(e2, null, h2, bl, b.a.k, u02);
                    return b2;
                }
                b.$$$reportNull$$$0(6);
                throw null;
            }
            b.$$$reportNull$$$0(5);
            throw null;
        }
        b.$$$reportNull$$$0(4);
        throw null;
    }

    public b T(k k2, v v2, b.a a2, k.b0.x.b.x0.g.e e2, h h2, u0 u02) {
        if (k2 != null) {
            if (a2 != null) {
                if (h2 != null) {
                    if (u02 != null) {
                        if (a2 != b.a.k && a2 != b.a.n) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
                            stringBuilder.append((Object)this);
                            stringBuilder.append("\n");
                            stringBuilder.append("newOwner: ");
                            stringBuilder.append((Object)k2);
                            stringBuilder.append("\n");
                            stringBuilder.append("kind: ");
                            stringBuilder.append((Object)a2);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                        e e3 = (e)k2;
                        b b2 = (b)v2;
                        if (e3 != null) {
                            if (a2 != null) {
                                if (u02 != null) {
                                    if (h2 != null) {
                                        b b3 = new b(e3, b2, h2, this.k, a2, u02);
                                        b3.setHasStableParameterNames(this.hasStableParameterNames());
                                        b3.setHasSynthesizedParameterNames(this.hasSynthesizedParameterNames());
                                        return b3;
                                    }
                                    b.$$$reportNull$$$0(15);
                                    throw null;
                                }
                                b.$$$reportNull$$$0(14);
                                throw null;
                            }
                            b.$$$reportNull$$$0(13);
                            throw null;
                        }
                        b.$$$reportNull$$$0(12);
                        throw null;
                    }
                    b.$$$reportNull$$$0(10);
                    throw null;
                }
                b.$$$reportNull$$$0(9);
                throw null;
            }
            b.$$$reportNull$$$0(8);
            throw null;
        }
        b.$$$reportNull$$$0(7);
        throw null;
    }

    public a h(f0 f02, List list, f0 f03, i i2) {
        if (f03 != null) {
            q0 q02;
            b b2 = this.T((k)this.o(), null, this.getKind(), null, this.getAnnotations(), this.getSource());
            if (f02 == null) {
                q02 = null;
            } else {
                Objects.requireNonNull((Object)h.g);
                q02 = e.s.a.a.z0((k.b0.x.b.x0.c.a)b2, (f0)f02, (h)h.a.b);
            }
            b2.initialize(q02, this.getDispatchReceiverParameter(), this.getTypeParameters(), (List<e1>)e.s.a.a.o0((Collection)list, this.getValueParameters(), (k.b0.x.b.x0.c.a)b2), f03, this.getModality(), this.getVisibility());
            if (i2 != null) {
                b2.putInUserDataMap(i2.k, i2.l);
            }
            return b2;
        }
        b.$$$reportNull$$$0(17);
        throw null;
    }

    @Override
    public boolean hasStableParameterNames() {
        return this.l;
    }

    @Override
    public boolean hasSynthesizedParameterNames() {
        return this.m;
    }

    @Override
    public void setHasStableParameterNames(boolean bl) {
        this.l = bl;
    }

    @Override
    public void setHasSynthesizedParameterNames(boolean bl) {
        this.m = bl;
    }
}

