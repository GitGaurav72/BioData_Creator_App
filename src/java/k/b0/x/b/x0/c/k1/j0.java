/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  k.b0.x.b.x0.c.a$a
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.v$a
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.c.k1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.f0;

public class j0
extends k.b0.x.b.x0.c.k1.r
implements t0 {
    private static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 13 && n2 != 17 && n2 != 18 && n2 != 23 && n2 != 24 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 13 && n2 != 17 && n2 != 18 && n2 != 23 && n2 != 24 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 19: {
                arrobject[0] = "newOwner";
                break;
            }
            case 13: 
            case 17: 
            case 18: 
            case 23: 
            case 24: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            }
            case 12: 
            case 16: {
                arrobject[0] = "visibility";
                break;
            }
            case 11: 
            case 15: {
                arrobject[0] = "unsubstitutedValueParameters";
                break;
            }
            case 10: 
            case 14: {
                arrobject[0] = "typeParameters";
                break;
            }
            case 4: 
            case 9: 
            case 22: {
                arrobject[0] = "source";
                break;
            }
            case 3: 
            case 8: 
            case 20: {
                arrobject[0] = "kind";
                break;
            }
            case 2: 
            case 7: {
                arrobject[0] = "name";
                break;
            }
            case 1: 
            case 6: 
            case 21: {
                arrobject[0] = "annotations";
            }
        }
        arrobject[1] = n2 != 13 && n2 != 17 ? (n2 != 18 ? (n2 != 23 ? (n2 != 24 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl" : "newCopyBuilder") : "copy") : "getOriginal") : "initialize";
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                arrobject[2] = "createSubstitutedCopy";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 14: 
            case 15: 
            case 16: {
                arrobject[2] = "initialize";
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                arrobject[2] = "create";
            }
            case 13: 
            case 17: 
            case 18: 
            case 23: 
            case 24: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 13 && n2 != 17 && n2 != 18 && n2 != 23 && n2 != 24 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public j0(k k2, t0 t02, h h2, e e2, b.a a2, u0 u02) {
        if (k2 == null) {
            j0.$$$reportNull$$$0(0);
        }
        if (h2 == null) {
            j0.$$$reportNull$$$0(1);
        }
        if (e2 == null) {
            j0.$$$reportNull$$$0(2);
        }
        if (a2 == null) {
            j0.$$$reportNull$$$0(3);
        }
        if (u02 == null) {
            j0.$$$reportNull$$$0(4);
        }
        super(k2, t02, h2, e2, a2, u02);
    }

    public static j0 create(k k2, h h2, e e2, b.a a2, u0 u02) {
        if (k2 == null) {
            j0.$$$reportNull$$$0(5);
        }
        if (h2 == null) {
            j0.$$$reportNull$$$0(6);
        }
        if (e2 == null) {
            j0.$$$reportNull$$$0(7);
        }
        if (a2 == null) {
            j0.$$$reportNull$$$0(8);
        }
        if (u02 == null) {
            j0.$$$reportNull$$$0(9);
        }
        j0 j02 = new j0(k2, null, h2, e2, a2, u02);
        return j02;
    }

    @Override
    public t0 copy(k k2, b0 b02, r r2, b.a a2, boolean bl) {
        t0 t02 = (t0)super.copy(k2, b02, r2, a2, bl);
        if (t02 == null) {
            j0.$$$reportNull$$$0(23);
        }
        return t02;
    }

    @Override
    public k.b0.x.b.x0.c.k1.r createSubstitutedCopy(k k2, v v2, b.a a2, e e2, h h2, u0 u02) {
        if (k2 == null) {
            j0.$$$reportNull$$$0(19);
        }
        if (a2 == null) {
            j0.$$$reportNull$$$0(20);
        }
        if (h2 == null) {
            j0.$$$reportNull$$$0(21);
        }
        if (u02 == null) {
            j0.$$$reportNull$$$0(22);
        }
        t0 t02 = (t0)v2;
        if (e2 == null) {
            e2 = this.getName();
        }
        j0 j02 = new j0(k2, t02, h2, e2, a2, u02);
        return j02;
    }

    @Override
    public t0 getOriginal() {
        t0 t02 = (t0)super.getOriginal();
        if (t02 == null) {
            j0.$$$reportNull$$$0(18);
        }
        return t02;
    }

    @Override
    public j0 initialize(q0 q02, q0 q03, List<? extends z0> list, List<e1> list2, f0 f02, b0 b02, r r2) {
        j0 j02;
        if (list == null) {
            j0.$$$reportNull$$$0(10);
        }
        if (list2 == null) {
            j0.$$$reportNull$$$0(11);
        }
        if (r2 == null) {
            j0.$$$reportNull$$$0(12);
        }
        if ((j02 = this.initialize(q02, q03, list, list2, f02, b02, r2, null)) == null) {
            j0.$$$reportNull$$$0(13);
        }
        return j02;
    }

    public j0 initialize(q0 q02, q0 q03, List<? extends z0> list, List<e1> list2, f0 f02, b0 b02, r r2, Map<? extends a.a<?>, ?> map) {
        if (list == null) {
            j0.$$$reportNull$$$0(14);
        }
        if (list2 == null) {
            j0.$$$reportNull$$$0(15);
        }
        if (r2 == null) {
            j0.$$$reportNull$$$0(16);
        }
        super.initialize(q02, q03, list, list2, f02, b02, r2);
        if (map != null && !map.isEmpty()) {
            this.userDataMap = new LinkedHashMap(map);
        }
        return this;
    }

    @Override
    public v.a<? extends t0> newCopyBuilder() {
        v.a<? extends v> a2 = super.newCopyBuilder();
        if (a2 == null) {
            j0.$$$reportNull$$$0(24);
        }
        return a2;
    }
}

