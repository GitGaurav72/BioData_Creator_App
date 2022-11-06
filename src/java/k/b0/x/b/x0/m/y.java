/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.f0
 *  k.b0.x.b.x0.c.n0
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.q0
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m0
 *  k.b0.x.b.x0.m.x
 *  k.b0.x.b.x0.m.y$a
 *  k.b0.x.b.x0.m.y$b
 *  k.b0.x.b.x0.m.y$c
 *  k.b0.x.b.x0.m.y$d
 *  k.b0.x.b.x0.m.y$e
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.m;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.x;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.x.c.i;

/*
 * Exception performing whole class analysis.
 */
public class y {
    public static final d0 a;
    public static final c b;
    public static final m0 c;
    public static final f0 d;
    public static final n0 e;
    public static final Set<n0> f;

    public static {
        c c2;
        a = new a();
        b = c2 = new /* Unavailable Anonymous Inner Class!! */;
        c = y.d("<LOOP IN SUPERTYPES>");
        m0 m02 = y.d("<ERROR PROPERTY TYPE>");
        d = m02;
        Objects.requireNonNull((Object)h.g);
        h h2 = h.a.b;
        b0 b02 = b0.n;
        r r2 = q.e;
        k.b0.x.b.x0.g.e e2 = k.b0.x.b.x0.g.e.n("<ERROR PROPERTY>");
        b.a a2 = b.a.k;
        u0 u02 = u0.a;
        if (c2 != null) {
            if (h2 != null) {
                if (r2 != null) {
                    k.b0.x.b.x0.c.k1.f0 f02 = new k.b0.x.b.x0.c.k1.f0((k)c2, null, h2, b02, r2, true, e2, a2, u02, false, false, false, false, false, false);
                    f02.U((f0)m02, Collections.emptyList(), null, null);
                    e = f02;
                    f = Collections.singleton((Object)f02);
                    return;
                }
                k.b0.x.b.x0.c.k1.f0.$$$reportNull$$$0((int)10);
                throw null;
            }
            k.b0.x.b.x0.c.k1.f0.$$$reportNull$$$0((int)8);
            throw null;
        }
        k.b0.x.b.x0.c.k1.f0.$$$reportNull$$$0((int)7);
        throw null;
    }

    public static /* synthetic */ void a(int n2) {
        String string = n2 != 4 && n2 != 6 && n2 != 19 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 4 && n2 != 6 && n2 != 19 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "function";
                break;
            }
            case 20: {
                arrobject[0] = "typeParameterDescriptor";
                break;
            }
            case 18: {
                arrobject[0] = "errorClass";
                break;
            }
            case 13: {
                arrobject[0] = "presentableName";
                break;
            }
            case 12: 
            case 14: {
                arrobject[0] = "arguments";
                break;
            }
            case 10: {
                arrobject[0] = "typeConstructor";
                break;
            }
            case 8: 
            case 9: 
            case 16: 
            case 17: {
                arrobject[0] = "debugName";
                break;
            }
            case 5: {
                arrobject[0] = "ownerScope";
                break;
            }
            case 4: 
            case 6: 
            case 19: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 7: 
            case 11: 
            case 15: {
                arrobject[0] = "debugMessage";
            }
        }
        arrobject[1] = n2 != 4 ? (n2 != 6 ? (n2 != 19 ? "kotlin/reflect/jvm/internal/impl/types/ErrorUtils" : "getErrorModule") : "createErrorFunction") : "createErrorProperty";
        switch (n2) {
            default: {
                arrobject[2] = "containsErrorTypeInParameters";
                break;
            }
            case 20: {
                arrobject[2] = "createUninferredParameterType";
                break;
            }
            case 16: 
            case 17: 
            case 18: {
                arrobject[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            }
            case 15: {
                arrobject[2] = "createErrorTypeConstructor";
                break;
            }
            case 13: 
            case 14: {
                arrobject[2] = "createUnresolvedType";
                break;
            }
            case 11: 
            case 12: {
                arrobject[2] = "createErrorTypeWithArguments";
                break;
            }
            case 9: 
            case 10: {
                arrobject[2] = "createErrorTypeWithCustomConstructor";
                break;
            }
            case 8: {
                arrobject[2] = "createErrorTypeWithCustomDebugName";
                break;
            }
            case 7: {
                arrobject[2] = "createErrorType";
                break;
            }
            case 5: {
                arrobject[2] = "createErrorFunction";
                break;
            }
            case 2: 
            case 3: {
                arrobject[2] = "createErrorScope";
                break;
            }
            case 1: {
                arrobject[2] = "createErrorClass";
            }
            case 4: 
            case 6: 
            case 19: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 4 && n2 != 6 && n2 != 19 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw object;
    }

    public static k.b0.x.b.x0.j.a0.h b(String string) {
        if (string != null) {
            return y.c(string, false);
        }
        y.a(2);
        throw null;
    }

    public static k.b0.x.b.x0.j.a0.h c(String string, boolean bl) {
        if (string != null) {
            if (bl) {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        y.a(3);
        throw null;
    }

    public static m0 d(String string) {
        if (string != null) {
            return y.g(string, (List<b1>)Collections.emptyList());
        }
        y.a(7);
        throw null;
    }

    public static y0 e(String string) {
        if (string != null) {
            return y.f(e.e.a.a.a.m((String)"[ERROR : ", (String)string, (String)"]"), b);
        }
        y.a(15);
        throw null;
    }

    public static y0 f(String string, c c2) {
        if (string != null) {
            if (c2 != null) {
                return new b(c2, string);
            }
            y.a(18);
            throw null;
        }
        y.a(17);
        throw null;
    }

    public static m0 g(String string, List<b1> list) {
        if (string != null) {
            if (list != null) {
                y0 y02 = y.e(string);
                k.b0.x.b.x0.j.a0.h h2 = y.b(string);
                i.e((Object)y02, "constructor");
                i.e((Object)h2, "memberScope");
                i.e(list, "arguments");
                x x2 = new x(y02, h2, list, false, null, 16);
                return x2;
            }
            y.a(12);
            throw null;
        }
        y.a(11);
        throw null;
    }

    public static m0 h(String string, y0 y02) {
        if (string != null) {
            return new x(y02, y.b(string));
        }
        y.a(9);
        throw null;
    }

    public static boolean i(k k2) {
        boolean bl;
        block5 : {
            block4 : {
                if (k2 == null) {
                    return false;
                }
                if (k2 instanceof c || k2.getContainingDeclaration() instanceof c) break block4;
                d0 d02 = a;
                bl = false;
                if (k2 != d02) break block5;
            }
            bl = true;
        }
        return bl;
    }
}

