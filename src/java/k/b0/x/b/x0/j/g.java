/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Set
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.f
 *  k.b0.x.b.x0.c.f0
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.j0
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.n0
 *  k.b0.x.b.x0.c.o
 *  k.b0.x.b.x0.c.p0
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.v0
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.f;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.j0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.o;
import k.b0.x.b.x0.c.p0;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v0;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.d;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;

public class g {
    public static final /* synthetic */ int a;

    public static {
        new c("kotlin.jvm.JvmName");
    }

    public static <D extends o> D A(D d2) {
        if (d2 != null) {
            if (d2 instanceof b) {
                return (D)g.z((b)d2);
            }
            if (d2 != null) {
                return d2;
            }
            g.a(62);
            throw null;
        }
        g.a(61);
        throw null;
    }

    public static /* synthetic */ void a(int n2) {
        String string;
        int n3;
        IllegalArgumentException illegalArgumentException;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 69: 
            case 73: 
            case 80: 
            case 81: 
            case 83: 
            case 86: 
            case 91: 
            case 93: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 69: 
            case 73: 
            case 80: 
            case 81: 
            case 83: 
            case 86: 
            case 91: 
            case 93: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 85: 
            case 88: 
            case 90: {
                arrobject[0] = "name";
                break;
            }
            case 82: 
            case 84: 
            case 87: 
            case 89: {
                arrobject[0] = "scope";
                break;
            }
            case 76: 
            case 77: 
            case 78: {
                arrobject[0] = "annotated";
                break;
            }
            case 72: {
                arrobject[0] = "memberDescriptor";
                break;
            }
            case 71: {
                arrobject[0] = "result";
                break;
            }
            case 70: {
                arrobject[0] = "current";
                break;
            }
            case 68: {
                arrobject[0] = "f";
                break;
            }
            case 63: {
                arrobject[0] = "variable";
                break;
            }
            case 56: {
                arrobject[0] = "location";
                break;
            }
            case 55: {
                arrobject[0] = "innerClassName";
                break;
            }
            case 46: {
                arrobject[0] = "typeConstructor";
                break;
            }
            case 38: 
            case 39: 
            case 41: 
            case 44: 
            case 48: 
            case 54: 
            case 65: 
            case 66: 
            case 67: 
            case 74: 
            case 75: {
                arrobject[0] = "classDescriptor";
                break;
            }
            case 37: {
                arrobject[0] = "classKind";
                break;
            }
            case 31: {
                arrobject[0] = "other";
                break;
            }
            case 30: 
            case 32: 
            case 45: 
            case 64: {
                arrobject[0] = "type";
                break;
            }
            case 27: 
            case 29: 
            case 33: {
                arrobject[0] = "superClass";
                break;
            }
            case 26: 
            case 28: {
                arrobject[0] = "subClass";
                break;
            }
            case 25: {
                arrobject[0] = "declarationDescriptor";
                break;
            }
            case 20: {
                arrobject[0] = "kotlinType";
                break;
            }
            case 18: 
            case 19: {
                arrobject[0] = "aClass";
                break;
            }
            case 17: {
                arrobject[0] = "second";
                break;
            }
            case 16: {
                arrobject[0] = "first";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 69: 
            case 73: 
            case 80: 
            case 81: 
            case 83: 
            case 86: 
            case 91: 
            case 93: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 21: 
            case 23: 
            case 24: 
            case 34: 
            case 35: 
            case 36: 
            case 57: 
            case 58: 
            case 59: 
            case 61: 
            case 79: 
            case 92: 
            case 94: {
                arrobject[0] = "descriptor";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            }
            case 93: {
                arrobject[1] = "getDirectMember";
                break;
            }
            case 91: {
                arrobject[1] = "getPropertyByName";
                break;
            }
            case 86: {
                arrobject[1] = "getFunctionByName";
                break;
            }
            case 83: {
                arrobject[1] = "getAllDescriptors";
                break;
            }
            case 80: 
            case 81: {
                arrobject[1] = "getContainingSourceFile";
                break;
            }
            case 73: {
                arrobject[1] = "getAllOverriddenDeclarations";
                break;
            }
            case 69: {
                arrobject[1] = "getAllOverriddenDescriptors";
                break;
            }
            case 62: {
                arrobject[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 60: {
                arrobject[1] = "unwrapFakeOverride";
                break;
            }
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: {
                arrobject[1] = "getDefaultConstructorVisibility";
                break;
            }
            case 47: {
                arrobject[1] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 42: 
            case 43: {
                arrobject[1] = "getSuperClassType";
                break;
            }
            case 40: {
                arrobject[1] = "getSuperclassDescriptors";
                break;
            }
            case 22: {
                arrobject[1] = "getContainingModule";
                break;
            }
            case 12: {
                arrobject[1] = "getClassIdForNonLocalClass";
                break;
            }
            case 9: 
            case 10: {
                arrobject[1] = "getFqNameFromTopLevelClass";
                break;
            }
            case 7: {
                arrobject[1] = "getFqNameUnsafe";
                break;
            }
            case 4: {
                arrobject[1] = "getFqNameSafe";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "getDispatchReceiverParameterIfNeeded";
                break;
            }
            case 94: {
                arrobject[2] = "isMethodOfAny";
                break;
            }
            case 92: {
                arrobject[2] = "getDirectMember";
                break;
            }
            case 89: 
            case 90: {
                arrobject[2] = "getPropertyByName";
                break;
            }
            case 87: 
            case 88: {
                arrobject[2] = "getFunctionByNameOrNull";
                break;
            }
            case 84: 
            case 85: {
                arrobject[2] = "getFunctionByName";
                break;
            }
            case 82: {
                arrobject[2] = "getAllDescriptors";
                break;
            }
            case 79: {
                arrobject[2] = "getContainingSourceFile";
                break;
            }
            case 78: {
                arrobject[2] = "hasJvmNameAnnotation";
                break;
            }
            case 77: {
                arrobject[2] = "findJvmNameAnnotation";
                break;
            }
            case 76: {
                arrobject[2] = "getJvmName";
                break;
            }
            case 75: {
                arrobject[2] = "canHaveDeclaredConstructors";
                break;
            }
            case 74: {
                arrobject[2] = "isSingletonOrAnonymousObject";
                break;
            }
            case 72: {
                arrobject[2] = "getAllOverriddenDeclarations";
                break;
            }
            case 70: 
            case 71: {
                arrobject[2] = "collectAllOverriddenDescriptors";
                break;
            }
            case 68: {
                arrobject[2] = "getAllOverriddenDescriptors";
                break;
            }
            case 67: {
                arrobject[2] = "classCanHaveOpenMembers";
                break;
            }
            case 66: {
                arrobject[2] = "classCanHaveAbstractDeclaration";
                break;
            }
            case 65: {
                arrobject[2] = "classCanHaveAbstractFakeOverride";
                break;
            }
            case 63: 
            case 64: {
                arrobject[2] = "shouldRecordInitializerForProperty";
                break;
            }
            case 61: {
                arrobject[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 59: {
                arrobject[2] = "unwrapFakeOverride";
                break;
            }
            case 58: {
                arrobject[2] = "isTopLevelOrInnerClass";
                break;
            }
            case 57: {
                arrobject[2] = "isStaticNestedClass";
                break;
            }
            case 54: 
            case 55: 
            case 56: {
                arrobject[2] = "getInnerClassByName";
                break;
            }
            case 48: {
                arrobject[2] = "getDefaultConstructorVisibility";
                break;
            }
            case 46: {
                arrobject[2] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 45: {
                arrobject[2] = "getClassDescriptorForType";
                break;
            }
            case 44: {
                arrobject[2] = "getSuperClassDescriptor";
                break;
            }
            case 41: {
                arrobject[2] = "getSuperClassType";
                break;
            }
            case 39: {
                arrobject[2] = "getSuperclassDescriptors";
                break;
            }
            case 38: {
                arrobject[2] = "hasAbstractMembers";
                break;
            }
            case 37: {
                arrobject[2] = "isKindOf";
                break;
            }
            case 36: {
                arrobject[2] = "isEnumEntry";
                break;
            }
            case 35: {
                arrobject[2] = "isAnonymousFunction";
                break;
            }
            case 34: {
                arrobject[2] = "isAnonymousObject";
                break;
            }
            case 32: 
            case 33: {
                arrobject[2] = "isSubtypeOfClass";
                break;
            }
            case 30: 
            case 31: {
                arrobject[2] = "isSameClass";
                break;
            }
            case 28: 
            case 29: {
                arrobject[2] = "isSubclass";
                break;
            }
            case 26: 
            case 27: {
                arrobject[2] = "isDirectSubclass";
                break;
            }
            case 25: {
                arrobject[2] = "isAncestor";
                break;
            }
            case 24: {
                arrobject[2] = "getContainingClass";
                break;
            }
            case 21: {
                arrobject[2] = "getContainingModule";
                break;
            }
            case 20: 
            case 23: {
                arrobject[2] = "getContainingModuleOrNull";
                break;
            }
            case 18: 
            case 19: {
                arrobject[2] = "getParentOfType";
                break;
            }
            case 16: 
            case 17: {
                arrobject[2] = "areInSameModule";
                break;
            }
            case 15: {
                arrobject[2] = "isStaticDeclaration";
                break;
            }
            case 14: {
                arrobject[2] = "isOverride";
                break;
            }
            case 13: {
                arrobject[2] = "isExtension";
                break;
            }
            case 11: {
                arrobject[2] = "getClassIdForNonLocalClass";
                break;
            }
            case 8: {
                arrobject[2] = "getFqNameFromTopLevelClass";
                break;
            }
            case 6: {
                arrobject[2] = "getFqNameUnsafe";
                break;
            }
            case 5: {
                arrobject[2] = "getFqNameSafeIfPossible";
                break;
            }
            case 3: {
                arrobject[2] = "getFqNameSafe";
                break;
            }
            case 2: {
                arrobject[2] = "getFqName";
                break;
            }
            case 1: {
                arrobject[2] = "isLocal";
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 69: 
            case 73: 
            case 80: 
            case 81: 
            case 83: 
            case 86: 
            case 91: 
            case 93: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                illegalArgumentException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 69: 
            case 73: 
            case 80: 
            case 81: 
            case 83: 
            case 86: 
            case 91: 
            case 93: {
                illegalArgumentException = new IllegalStateException(string2);
            }
        }
        throw illegalArgumentException;
    }

    public static <D extends a> void b(D d2, Set<D> set) {
        if (d2 != null) {
            if (set.contains(d2)) {
                return;
            }
            Iterator iterator = d2.getOriginal().getOverriddenDescriptors().iterator();
            while (iterator.hasNext()) {
                a a2 = ((a)iterator.next()).getOriginal();
                g.b(a2, set);
                set.add((Object)a2);
            }
            return;
        }
        g.a(70);
        throw null;
    }

    public static e c(f0 f02) {
        if (f02 != null) {
            y0 y02 = f02.T();
            if (y02 != null) {
                e e2 = (e)y02.getDeclarationDescriptor();
                if (e2 != null) {
                    return e2;
                }
                g.a(47);
                throw null;
            }
            g.a(46);
            throw null;
        }
        g.a(45);
        throw null;
    }

    public static d0 d(k k2) {
        if (k2 != null) {
            d0 d02 = g.e(k2);
            if (d02 != null) {
                return d02;
            }
            g.a(22);
            throw null;
        }
        g.a(21);
        throw null;
    }

    public static d0 e(k k2) {
        if (k2 != null) {
            while (k2 != null) {
                if (k2 instanceof d0) {
                    return (d0)k2;
                }
                if (k2 instanceof j0) {
                    return ((j0)k2).N();
                }
                k2 = k2.getContainingDeclaration();
            }
            return null;
        }
        g.a(23);
        throw null;
    }

    public static v0 f(k k2) {
        if (k2 != null) {
            if (k2 instanceof p0) {
                k2 = ((p0)k2).O();
            }
            if (k2 instanceof n) {
                v0 v02 = ((n)k2).getSource().a();
                if (v02 != null) {
                    return v02;
                }
                g.a(80);
                throw null;
            }
            return v0.a;
        }
        g.a(79);
        throw null;
    }

    public static d g(k k2) {
        if (k2 != null) {
            c c2 = g.h(k2);
            if (c2 != null) {
                return c2.j();
            }
            return g.i(k2);
        }
        g.a(2);
        throw null;
    }

    public static c h(k k2) {
        if (k2 != null) {
            if (!(k2 instanceof d0) && !y.i(k2)) {
                if (k2 instanceof j0) {
                    return ((j0)k2).getFqName();
                }
                if (k2 instanceof k.b0.x.b.x0.c.f0) {
                    return ((k.b0.x.b.x0.c.f0)k2).getFqName();
                }
                return null;
            }
            return c.a;
        }
        g.a(5);
        throw null;
    }

    public static d i(k k2) {
        return g.g(k2.getContainingDeclaration()).c(k2.getName());
    }

    public static <D extends k> D j(k k2, Class<D> class_) {
        return g.k(k2, class_, true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static <D extends k> D k(k var0, Class<D> var1_1, boolean var2_2) {
        if (var1_1 == null) {
            g.a(19);
            throw null;
        }
        if (var0 == null) {
            return null;
        }
        if (!var2_2) ** GOTO lbl9
        do {
            var0 = var0.getContainingDeclaration();
lbl9: // 2 sources:
            if (var0 == null) return null;
        } while (!var1_1.isInstance((Object)var0));
        return (D)var0;
    }

    public static e l(e e2) {
        Iterator iterator = e2.getTypeConstructor().getSupertypes().iterator();
        while (iterator.hasNext()) {
            e e3 = g.c((f0)iterator.next());
            if (e3.getKind() == f.l) continue;
            return e3;
        }
        return null;
    }

    public static boolean m(k k2) {
        return g.s(k2, f.o);
    }

    public static boolean n(k k2) {
        return g.s(k2, f.k) && k2.getName().equals(k.b0.x.b.x0.g.g.b);
    }

    public static boolean o(k k2) {
        return g.s(k2, f.k) || g.q(k2);
        {
        }
    }

    public static boolean p(k k2) {
        return g.s(k2, f.p) && ((e)k2).isCompanionObject();
    }

    public static boolean q(k k2) {
        return g.s(k2, f.m);
    }

    public static boolean r(k k2) {
        if (k2 != null) {
            return g.s(k2, f.n);
        }
        g.a(36);
        throw null;
    }

    public static boolean s(k k2, f f2) {
        return k2 instanceof e && ((e)k2).getKind() == f2;
    }

    public static boolean t(k k2) {
        if (k2 != null) {
            while (k2 != null) {
                if (!g.n(k2)) {
                    boolean bl = k2 instanceof o;
                    boolean bl2 = false;
                    if (bl) {
                        r r2 = ((o)k2).getVisibility();
                        r r3 = q.f;
                        bl2 = false;
                        if (r2 == r3) {
                            bl2 = true;
                        }
                    }
                    if (bl2) {
                        return true;
                    }
                    k2 = k2.getContainingDeclaration();
                    continue;
                }
                return true;
            }
            return false;
        }
        g.a(1);
        throw null;
    }

    public static boolean u(f0 f02, k k2) {
        if (f02 != null) {
            if (k2 != null) {
                k k3;
                h h2 = f02.T().getDeclarationDescriptor();
                return h2 != null && (k3 = h2.getOriginal()) instanceof h && k2 instanceof h && ((h)k2).getTypeConstructor().equals((Object)((h)k3).getTypeConstructor());
            }
            g.a(31);
            throw null;
        }
        g.a(30);
        throw null;
    }

    public static boolean v(k k2) {
        return (g.s(k2, f.k) || g.s(k2, f.l)) && ((e)k2).getModality() == b0.m;
    }

    public static boolean w(e e2, e e3) {
        return g.x((f0)e2.getDefaultType(), (k)e3.getOriginal());
    }

    public static boolean x(f0 f02, k k2) {
        if (f02 != null) {
            if (k2 != null) {
                if (g.u(f02, k2)) {
                    return true;
                }
                Iterator iterator = f02.T().getSupertypes().iterator();
                while (iterator.hasNext()) {
                    if (!g.x((f0)iterator.next(), k2)) continue;
                    return true;
                }
                return false;
            }
            g.a(33);
            throw null;
        }
        g.a(32);
        throw null;
    }

    public static boolean y(k k2) {
        return k2 != null && k2.getContainingDeclaration() instanceof k.b0.x.b.x0.c.f0;
    }

    public static <D extends b> D z(D object) {
        if (object != null) {
            while (object.getKind() == b.a.l) {
                Collection collection = object.getOverriddenDescriptors();
                if (!collection.isEmpty()) {
                    object = (b)collection.iterator().next();
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Fake override should have at least one overridden descriptor: ");
                stringBuilder.append(object);
                throw new IllegalStateException(stringBuilder.toString());
            }
            return object;
        }
        g.a(59);
        throw null;
    }
}

