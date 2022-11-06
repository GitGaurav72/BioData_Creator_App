/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.c1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.c1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.n1;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.r1.i;

public class d1
extends c1 {
    public final n1 a;
    public final f0 b;

    public d1(f0 f02) {
        if (f02 != null) {
            this(n1.k, f02);
            return;
        }
        d1.d(2);
        throw null;
    }

    public d1(n1 n12, f0 f02) {
        if (n12 != null) {
            if (f02 != null) {
                this.a = n12;
                this.b = f02;
                return;
            }
            d1.d(1);
            throw null;
        }
        d1.d(0);
        throw null;
    }

    public static /* synthetic */ void d(int n2) {
        String string = n2 != 4 && n2 != 5 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 4 && n2 != 5 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "projection";
                break;
            }
            case 6: {
                arrobject[0] = "kotlinTypeRefiner";
                break;
            }
            case 4: 
            case 5: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                arrobject[0] = "type";
            }
        }
        arrobject[1] = n2 != 4 ? (n2 != 5 ? "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl" : "getType") : "getProjectionKind";
        if (n2 != 3) {
            if (n2 != 4 && n2 != 5) {
                arrobject[2] = n2 != 6 ? "<init>" : "refine";
            }
        } else {
            arrobject[2] = "replaceType";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 4 && n2 != 5 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw object;
    }

    public n1 a() {
        n1 n12 = this.a;
        if (n12 != null) {
            return n12;
        }
        d1.d(4);
        throw null;
    }

    public f0 b() {
        f0 f02 = this.b;
        if (f02 != null) {
            return f02;
        }
        d1.d(5);
        throw null;
    }

    public boolean c() {
        return false;
    }

    public b1 refine(d d2) {
        return new d1(this.a, d2.h((i)this.b));
    }
}

