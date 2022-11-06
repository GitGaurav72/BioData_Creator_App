/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.y0
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.m;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.j.y.a;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.y0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public abstract class b
extends g
implements y0 {
    private static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        Object[] arrobject;
        block6 : {
            block4 : {
                block5 : {
                    string = n2 != 1 && n2 != 3 && n2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
                    int n3 = n2 != 1 && n2 != 3 && n2 != 4 ? 3 : 2;
                    arrobject = new Object[n3];
                    if (n2 == 1) break block4;
                    if (n2 == 2) break block5;
                    if (n2 == 3 || n2 == 4) break block4;
                    arrobject[0] = "storageManager";
                    break block6;
                }
                arrobject[0] = "classifier";
                break block6;
            }
            arrobject[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        arrobject[1] = n2 != 1 ? (n2 != 3 && n2 != 4 ? "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor" : "getAdditionalNeighboursInSupertypeGraph") : "getBuiltIns";
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3 && n2 != 4) {
                    arrobject[2] = "<init>";
                }
            } else {
                arrobject[2] = "isSameClassifier";
            }
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 1 && n2 != 3 && n2 != 4 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public b(m m2) {
        if (m2 == null) {
            b.$$$reportNull$$$0(0);
        }
        super(m2);
    }

    @Override
    public f0 defaultSupertypeIfEmpty() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes((e)this.getDeclarationDescriptor())) {
            return null;
        }
        return this.getBuiltIns().getAnyType();
    }

    @Override
    public Collection<f0> getAdditionalNeighboursInSupertypeGraph(boolean bl) {
        k k2 = this.getDeclarationDescriptor().getContainingDeclaration();
        if (!(k2 instanceof e)) {
            List list = Collections.emptyList();
            if (list == null) {
                b.$$$reportNull$$$0(3);
            }
            return list;
        }
        k.b0.x.b.x0.o.h<m0> h2 = new k.b0.x.b.x0.o.h<m0>();
        e e2 = (e)k2;
        h2.add(e2.getDefaultType());
        e e3 = e2.getCompanionObjectDescriptor();
        if (bl && e3 != null) {
            h2.add(e3.getDefaultType());
        }
        return h2;
    }

    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns kotlinBuiltIns = a.e((k)this.getDeclarationDescriptor());
        if (kotlinBuiltIns == null) {
            b.$$$reportNull$$$0(1);
        }
        return kotlinBuiltIns;
    }

    public abstract e getDeclarationDescriptor();

    public boolean isSameClassifier(h h2) {
        if (h2 == null) {
            b.$$$reportNull$$$0(2);
        }
        return h2 instanceof e && this.areFqNamesEqual((h)this.getDeclarationDescriptor(), h2);
    }
}

