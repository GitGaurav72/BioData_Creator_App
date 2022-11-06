/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Set
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
import java.util.Set;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.d;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.j;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.g;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.h1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class i
extends k.b0.x.b.x0.c.k1.r
implements d {
    public final boolean k;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void $$$reportNull$$$0(int var0) {
        if (var0 != 19 && var0 != 25) {
            switch (var0) {
                default: {
                    var1_1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    ** break;
                }
                case 15: 
                case 16: 
                case 17: 
            }
        }
        var1_1 = "@NotNull method %s.%s must not return null";
lbl8: // 2 sources:
        if (var0 != 19 && var0 != 25) {
            switch (var0) {
                default: {
                    var2_2 = 3;
                    ** break;
                }
                case 15: 
                case 16: 
                case 17: 
            }
        }
        var2_2 = 2;
lbl15: // 2 sources:
        var3_3 = new Object[var2_2];
        switch (var0) {
            default: {
                var3_3[0] = "containingDeclaration";
                ** break;
            }
            case 21: {
                var3_3[0] = "newOwner";
                ** break;
            }
            case 20: {
                var3_3[0] = "overriddenDescriptors";
                ** break;
            }
            case 18: {
                var3_3[0] = "originalSubstitutor";
                ** break;
            }
            case 15: 
            case 16: 
            case 17: 
            case 19: 
            case 25: {
                var3_3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                ** break;
            }
            case 12: {
                var3_3[0] = "typeParameterDescriptors";
                ** break;
            }
            case 11: 
            case 14: {
                var3_3[0] = "visibility";
                ** break;
            }
            case 10: 
            case 13: {
                var3_3[0] = "unsubstitutedValueParameters";
                ** break;
            }
            case 3: 
            case 6: 
            case 9: 
            case 24: {
                var3_3[0] = "source";
                ** break;
            }
            case 2: 
            case 22: {
                var3_3[0] = "kind";
                ** break;
            }
            case 1: 
            case 5: 
            case 8: 
            case 23: 
        }
        var3_3[0] = "annotations";
lbl49: // 11 sources:
        if (var0 != 19) {
            if (var0 != 25) {
                switch (var0) {
                    default: {
                        var3_3[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        ** break;
                    }
                    case 17: {
                        var3_3[1] = "getOriginal";
                        ** break;
                    }
                    case 16: {
                        var3_3[1] = "getConstructedClass";
                        ** break;
                    }
                    case 15: 
                }
                var3_3[1] = "getContainingDeclaration";
                ** break;
lbl64: // 4 sources:
            } else {
                var3_3[1] = "copy";
            }
        } else {
            var3_3[1] = "getOverriddenDescriptors";
        }
        switch (var0) {
            default: {
                var3_3[2] = "<init>";
                break;
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: {
                var3_3[2] = "createSubstitutedCopy";
                break;
            }
            case 20: {
                var3_3[2] = "setOverriddenDescriptors";
                break;
            }
            case 18: {
                var3_3[2] = "substitute";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: {
                var3_3[2] = "initialize";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                var3_3[2] = "createSynthesized";
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                var3_3[2] = "create";
            }
            case 15: 
            case 16: 
            case 17: 
            case 19: 
            case 25: 
        }
        var4_4 = String.format((String)var1_1, (Object[])var3_3);
        if (var0 != 19 && var0 != 25) {
            switch (var0) {
                default: {
                    var5_5 = new IllegalArgumentException(var4_4);
                    throw var5_5;
                }
                case 15: 
                case 16: 
                case 17: 
            }
        }
        var5_5 = new IllegalStateException(var4_4);
        throw var5_5;
    }

    public i(e e2, j j2, h h2, boolean bl, b.a a2, u0 u02) {
        if (e2 != null) {
            if (h2 != null) {
                if (a2 != null) {
                    if (u02 != null) {
                        super((k)e2, j2, h2, g.f, a2, u02);
                        this.k = bl;
                        return;
                    }
                    i.$$$reportNull$$$0(3);
                    throw null;
                }
                i.$$$reportNull$$$0(2);
                throw null;
            }
            i.$$$reportNull$$$0(1);
            throw null;
        }
        i.$$$reportNull$$$0(0);
        throw null;
    }

    public i P(List<e1> list, r r2, List<z0> list2) {
        if (list != null) {
            if (r2 != null) {
                if (list2 != null) {
                    e e2 = this.o();
                    boolean bl = e2.isInner();
                    q0 q02 = null;
                    if (bl) {
                        k k2 = e2.getContainingDeclaration();
                        boolean bl2 = k2 instanceof e;
                        q02 = null;
                        if (bl2) {
                            q02 = ((e)k2).getThisAsReceiverParameter();
                        }
                    }
                    this.initialize(null, q02, list2, list, null, b0.l, r2);
                    return this;
                }
                i.$$$reportNull$$$0(12);
                throw null;
            }
            i.$$$reportNull$$$0(11);
            throw null;
        }
        i.$$$reportNull$$$0(10);
        throw null;
    }

    @Override
    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)m2.h((j)this, d2);
    }

    @Override
    public b copy(k k2, b0 b02, r r2, b.a a2, boolean bl) {
        d d2 = (d)super.copy(k2, b02, r2, a2, bl);
        if (d2 != null) {
            return d2;
        }
        i.$$$reportNull$$$0(25);
        throw null;
    }

    @Override
    public v copy(k k2, b0 b02, r r2, b.a a2, boolean bl) {
        d d2 = (d)super.copy(k2, b02, r2, a2, bl);
        if (d2 != null) {
            return d2;
        }
        i.$$$reportNull$$$0(25);
        throw null;
    }

    @Override
    public d getOriginal() {
        d d2 = (d)super.getOriginal();
        if (d2 != null) {
            return d2;
        }
        i.$$$reportNull$$$0(17);
        throw null;
    }

    @Override
    public Collection<? extends v> getOverriddenDescriptors() {
        Set set = Collections.emptySet();
        if (set != null) {
            return set;
        }
        i.$$$reportNull$$$0(19);
        throw null;
    }

    @Override
    public boolean j() {
        return this.k;
    }

    @Override
    public e k() {
        e e2 = this.o();
        if (e2 != null) {
            return e2;
        }
        i.$$$reportNull$$$0(16);
        throw null;
    }

    public i n(k k2, v v2, b.a a2, k.b0.x.b.x0.g.e e2, h h2, u0 u02) {
        if (k2 != null) {
            if (a2 != null) {
                if (h2 != null) {
                    if (u02 != null) {
                        b.a a3 = b.a.k;
                        if (a2 != a3 && a2 != b.a.n) {
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
                        i i2 = new i((e)k2, this, h2, this.k, a3, u02);
                        return i2;
                    }
                    i.$$$reportNull$$$0(24);
                    throw null;
                }
                i.$$$reportNull$$$0(23);
                throw null;
            }
            i.$$$reportNull$$$0(22);
            throw null;
        }
        i.$$$reportNull$$$0(21);
        throw null;
    }

    public e o() {
        e e2 = (e)k.b0.x.b.x0.c.k1.n.super.getContainingDeclaration();
        if (e2 != null) {
            return e2;
        }
        i.$$$reportNull$$$0(15);
        throw null;
    }

    public i q(List<e1> list, r r2) {
        if (list != null) {
            if (r2 != null) {
                this.P(list, r2, this.o().getDeclaredTypeParameters());
                return this;
            }
            i.$$$reportNull$$$0(14);
            throw null;
        }
        i.$$$reportNull$$$0(13);
        throw null;
    }

    @Override
    public void setOverriddenDescriptors(Collection<? extends b> collection) {
        if (collection != null) {
            return;
        }
        i.$$$reportNull$$$0(20);
        throw null;
    }

    @Override
    public d substitute(h1 h12) {
        if (h12 != null) {
            return (d)super.substitute(h12);
        }
        i.$$$reportNull$$$0(18);
        throw null;
    }
}

