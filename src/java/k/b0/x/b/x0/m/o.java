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
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.x0
 *  k.b0.x.b.x0.c.x0$a
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.x0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.g;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.b;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.y0;

public class o
extends b
implements y0 {
    public final e a;
    public final List<z0> b;
    public final Collection<f0> c;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 4 && n2 != 5 && n2 != 6 && n2 != 7 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 4 && n2 != 5 && n2 != 6 && n2 != 7 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "classDescriptor";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            }
            case 3: {
                arrobject[0] = "storageManager";
                break;
            }
            case 2: {
                arrobject[0] = "supertypes";
                break;
            }
            case 1: {
                arrobject[0] = "parameters";
            }
        }
        arrobject[1] = n2 != 4 ? (n2 != 5 ? (n2 != 6 ? (n2 != 7 ? "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl" : "getSupertypeLoopChecker") : "computeSupertypes") : "getDeclarationDescriptor") : "getParameters";
        if (n2 != 4 && n2 != 5 && n2 != 6 && n2 != 7) {
            arrobject[2] = "<init>";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 4 && n2 != 5 && n2 != 6 && n2 != 7 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public o(e e2, List<? extends z0> list, Collection<f0> collection, m m2) {
        if (list != null) {
            if (collection != null) {
                if (m2 != null) {
                    super(m2);
                    this.a = e2;
                    this.b = Collections.unmodifiableList((List)new ArrayList(list));
                    this.c = Collections.unmodifiableCollection(collection);
                    return;
                }
                o.$$$reportNull$$$0(3);
                throw null;
            }
            o.$$$reportNull$$$0(2);
            throw null;
        }
        o.$$$reportNull$$$0(1);
        throw null;
    }

    @Override
    public Collection<f0> computeSupertypes() {
        Collection<f0> collection = this.c;
        if (collection != null) {
            return collection;
        }
        o.$$$reportNull$$$0(6);
        throw null;
    }

    @Override
    public e getDeclarationDescriptor() {
        e e2 = this.a;
        if (e2 != null) {
            return e2;
        }
        o.$$$reportNull$$$0(5);
        throw null;
    }

    public List<z0> getParameters() {
        List<z0> list = this.b;
        if (list != null) {
            return list;
        }
        o.$$$reportNull$$$0(4);
        throw null;
    }

    @Override
    public x0 getSupertypeLoopChecker() {
        return x0.a.a;
    }

    public boolean isDenotable() {
        return true;
    }

    public String toString() {
        return g.g((k)this.a).b();
    }
}

