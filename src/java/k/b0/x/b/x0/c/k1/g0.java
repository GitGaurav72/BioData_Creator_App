/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.c.k1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.e0;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.m0;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.o0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.f0;

public class g0
extends e0
implements o0 {
    public f0 s;
    public final o0 t;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 6 && n2 != 7 && n2 != 8 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 6 && n2 != 7 && n2 != 8 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "correspondingProperty";
                break;
            }
            case 6: 
            case 7: 
            case 8: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            }
            case 5: {
                arrobject[0] = "source";
                break;
            }
            case 4: {
                arrobject[0] = "kind";
                break;
            }
            case 3: {
                arrobject[0] = "visibility";
                break;
            }
            case 2: {
                arrobject[0] = "modality";
                break;
            }
            case 1: {
                arrobject[0] = "annotations";
            }
        }
        arrobject[1] = n2 != 6 ? (n2 != 7 ? (n2 != 8 ? "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl" : "getOriginal") : "getValueParameters") : "getOverriddenDescriptors";
        if (n2 != 6 && n2 != 7 && n2 != 8) {
            arrobject[2] = "<init>";
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 6 && n2 != 7 && n2 != 8 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public g0(n0 n02, h h2, b0 b02, r r2, boolean bl, boolean bl2, boolean bl3, b.a a2, o0 o02, u0 u02) {
        if (h2 != null) {
            if (b02 != null) {
                if (r2 != null) {
                    if (a2 != null) {
                        if (u02 != null) {
                            g0 g02;
                            o0 o03;
                            StringBuilder stringBuilder = e.e.a.a.a.t((String)"<get-");
                            stringBuilder.append((Object)n02.getName());
                            stringBuilder.append(">");
                            super(b02, r2, n02, h2, e.n(stringBuilder.toString()), bl, bl2, bl3, a2, u02);
                            if (o02 != null) {
                                g02 = this;
                                o03 = o02;
                            } else {
                                g02 = o03 = this;
                            }
                            g02.t = o03;
                            return;
                        }
                        g0.$$$reportNull$$$0(5);
                        throw null;
                    }
                    g0.$$$reportNull$$$0(4);
                    throw null;
                }
                g0.$$$reportNull$$$0(3);
                throw null;
            }
            g0.$$$reportNull$$$0(2);
            throw null;
        }
        g0.$$$reportNull$$$0(1);
        throw null;
    }

    public void P(f0 f02) {
        if (f02 == null) {
            f02 = this.O().b();
        }
        this.s = f02;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)m2.b((o0)this, d2);
    }

    public Collection<? extends o0> getOverriddenDescriptors() {
        return this.o(true);
    }

    @Override
    public f0 getReturnType() {
        return this.s;
    }

    @Override
    public List<e1> getValueParameters() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        g0.$$$reportNull$$$0(7);
        throw null;
    }

    public o0 q() {
        o0 o02 = this.t;
        if (o02 != null) {
            return o02;
        }
        g0.$$$reportNull$$$0(8);
        throw null;
    }
}

