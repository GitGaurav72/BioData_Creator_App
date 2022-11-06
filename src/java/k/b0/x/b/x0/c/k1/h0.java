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
import k.b0.x.b.x0.c.k1.o0;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.m0;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.p0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.f0;

public class h0
extends e0
implements p0 {
    public e1 s;
    public final p0 t;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "correspondingProperty";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            }
            case 8: {
                arrobject[0] = "type";
                break;
            }
            case 7: {
                arrobject[0] = "setterDescriptor";
                break;
            }
            case 6: {
                arrobject[0] = "parameter";
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
            case 1: 
            case 9: {
                arrobject[0] = "annotations";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            }
            case 13: {
                arrobject[1] = "getOriginal";
                break;
            }
            case 12: {
                arrobject[1] = "getReturnType";
                break;
            }
            case 11: {
                arrobject[1] = "getValueParameters";
                break;
            }
            case 10: {
                arrobject[1] = "getOverriddenDescriptors";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                arrobject[2] = "createSetterParameter";
                break;
            }
            case 6: {
                arrobject[2] = "initialize";
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                object = new IllegalArgumentException(string2);
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public h0(n0 n02, h h2, b0 b02, r r2, boolean bl, boolean bl2, boolean bl3, b.a a2, p0 p02, u0 u02) {
        if (h2 != null) {
            if (b02 != null) {
                if (r2 != null) {
                    if (a2 != null) {
                        if (u02 != null) {
                            h0 h02;
                            p0 p03;
                            StringBuilder stringBuilder = e.e.a.a.a.t((String)"<set-");
                            stringBuilder.append((Object)n02.getName());
                            stringBuilder.append(">");
                            super(b02, r2, n02, h2, e.n(stringBuilder.toString()), bl, bl2, bl3, a2, u02);
                            if (p02 != null) {
                                h02 = this;
                                p03 = p02;
                            } else {
                                h02 = p03 = this;
                            }
                            h02.t = p03;
                            return;
                        }
                        h0.$$$reportNull$$$0(5);
                        throw null;
                    }
                    h0.$$$reportNull$$$0(4);
                    throw null;
                }
                h0.$$$reportNull$$$0(3);
                throw null;
            }
            h0.$$$reportNull$$$0(2);
            throw null;
        }
        h0.$$$reportNull$$$0(1);
        throw null;
    }

    public static o0 q(p0 p02, f0 f02, h h2) {
        if (f02 != null) {
            if (h2 != null) {
                o0 o02 = new o0(p02, null, 0, h2, e.n("<set-?>"), f02, false, false, false, null, u0.a);
                return o02;
            }
            h0.$$$reportNull$$$0(9);
            throw null;
        }
        h0.$$$reportNull$$$0(8);
        throw null;
    }

    public p0 P() {
        p0 p02 = this.t;
        if (p02 != null) {
            return p02;
        }
        h0.$$$reportNull$$$0(13);
        throw null;
    }

    public void S(e1 e12) {
        if (e12 != null) {
            this.s = e12;
            return;
        }
        h0.$$$reportNull$$$0(6);
        throw null;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)m2.i((p0)this, d2);
    }

    public Collection<? extends p0> getOverriddenDescriptors() {
        return this.o(false);
    }

    @Override
    public f0 getReturnType() {
        k.b0.x.b.x0.m.m0 m02 = k.b0.x.b.x0.j.y.a.e((k)this).getUnitType();
        if (m02 != null) {
            return m02;
        }
        h0.$$$reportNull$$$0(12);
        throw null;
    }

    @Override
    public List<e1> getValueParameters() {
        e1 e12 = this.s;
        if (e12 != null) {
            List list = Collections.singletonList((Object)e12);
            if (list != null) {
                return list;
            }
            h0.$$$reportNull$$$0(11);
            throw null;
        }
        throw new IllegalStateException();
    }
}

