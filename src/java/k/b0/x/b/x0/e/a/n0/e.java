/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.k.a.f
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  k.b0.x.b.x0.c.a$a
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.v$a
 *  k.b0.x.b.x0.e.a.n0.e$a
 *  k.b0.x.b.x0.e.a.n0.e$b
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.n.c$a
 *  k.b0.x.b.x0.n.c$b
 *  k.b0.x.b.x0.n.c$c
 *  k.b0.x.b.x0.n.l
 *  k.x.b.l
 */
package k.b0.x.b.x0.e.a.n0;

import e.k.a.f;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.j0;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.e.a.n0.e;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.n.c;
import k.b0.x.b.x0.n.g;
import k.b0.x.b.x0.n.l;
import k.d0.d;
import k.i;

/*
 * Exception performing whole class analysis.
 */
public class e
extends j0
implements k.b0.x.b.x0.e.a.n0.a {
    public static final a.a<e1> k;
    public static final a.a<Boolean> l;
    public int m;
    public final boolean n;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 12 && n2 != 17 && n2 != 20 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 12 && n2 != 17 && n2 != 20 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 19: {
                arrobject[0] = "enhancedReturnType";
                break;
            }
            case 18: {
                arrobject[0] = "enhancedValueParametersData";
                break;
            }
            case 13: {
                arrobject[0] = "newOwner";
                break;
            }
            case 12: 
            case 17: 
            case 20: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            }
            case 11: {
                arrobject[0] = "visibility";
                break;
            }
            case 10: {
                arrobject[0] = "unsubstitutedValueParameters";
                break;
            }
            case 9: {
                arrobject[0] = "typeParameters";
                break;
            }
            case 4: 
            case 8: 
            case 16: {
                arrobject[0] = "source";
                break;
            }
            case 3: 
            case 14: {
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
            case 15: {
                arrobject[0] = "annotations";
            }
        }
        arrobject[1] = n2 != 12 ? (n2 != 17 ? (n2 != 20 ? "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor" : "enhance") : "createSubstitutedCopy") : "initialize";
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 18: 
            case 19: {
                arrobject[2] = "enhance";
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                arrobject[2] = "createSubstitutedCopy";
                break;
            }
            case 9: 
            case 10: 
            case 11: {
                arrobject[2] = "initialize";
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                arrobject[2] = "createJavaMethod";
            }
            case 12: 
            case 17: 
            case 20: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        IllegalStateException illegalStateException = n2 != 12 && n2 != 17 && n2 != 20 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static {
        k = new a();
        l = new b();
    }

    public e(k k2, t0 t02, h h2, k.b0.x.b.x0.g.e e2, b.a a2, u0 u02, boolean bl) {
        if (k2 != null) {
            if (h2 != null) {
                if (e2 != null) {
                    if (a2 != null) {
                        if (u02 != null) {
                            super(k2, t02, h2, e2, a2, u02);
                            this.m = 0;
                            this.n = bl;
                            return;
                        }
                        e.$$$reportNull$$$0(4);
                        throw null;
                    }
                    e.$$$reportNull$$$0(3);
                    throw null;
                }
                e.$$$reportNull$$$0(2);
                throw null;
            }
            e.$$$reportNull$$$0(1);
            throw null;
        }
        e.$$$reportNull$$$0(0);
        throw null;
    }

    public static e n(k k2, h h2, k.b0.x.b.x0.g.e e2, u0 u02, boolean bl) {
        if (k2 != null) {
            if (e2 != null) {
                if (u02 != null) {
                    e e3 = new e(k2, null, h2, e2, b.a.k, u02, bl);
                    return e3;
                }
                e.$$$reportNull$$$0(8);
                throw null;
            }
            e.$$$reportNull$$$0(7);
            throw null;
        }
        e.$$$reportNull$$$0(5);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.c.k1.r createSubstitutedCopy(k k2, v v2, b.a a2, k.b0.x.b.x0.g.e e2, h h2, u0 u02) {
        if (k2 != null) {
            if (a2 != null) {
                if (h2 != null) {
                    if (u02 != null) {
                        t0 t02 = (t0)v2;
                        if (e2 == null) {
                            e2 = this.getName();
                        }
                        e e3 = new e(k2, t02, h2, e2, a2, u02, this.n);
                        int n2 = this.m;
                        e3.o(f.p((int)n2), f.q((int)n2));
                        return e3;
                    }
                    e.$$$reportNull$$$0(16);
                    throw null;
                }
                e.$$$reportNull$$$0(15);
                throw null;
            }
            e.$$$reportNull$$$0(14);
            throw null;
        }
        e.$$$reportNull$$$0(13);
        throw null;
    }

    public k.b0.x.b.x0.e.a.n0.a h(f0 f02, List list, f0 f03, i i2) {
        if (f03 != null) {
            q0 q02;
            List list2 = e.s.a.a.o0((Collection)list, this.getValueParameters(), (k.b0.x.b.x0.c.a)this);
            if (f02 == null) {
                q02 = null;
            } else {
                Objects.requireNonNull((Object)h.g);
                q02 = e.s.a.a.z0((k.b0.x.b.x0.c.a)this, (f0)f02, (h)h.a.b);
            }
            e e2 = (e)this.newCopyBuilder().b(list2).f(f03).j(q02).a().e().build();
            if (i2 != null) {
                e2.putInUserDataMap(i2.k, i2.l);
            }
            if (e2 != null) {
                return e2;
            }
            e.$$$reportNull$$$0(20);
            throw null;
        }
        e.$$$reportNull$$$0(19);
        throw null;
    }

    @Override
    public boolean hasStableParameterNames() {
        return f.p((int)this.m);
    }

    @Override
    public boolean hasSynthesizedParameterNames() {
        return f.q((int)this.m);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public j0 initialize(q0 var1_1, q0 var2_2, List<? extends z0> var3_3, List<e1> var4_4, f0 var5_5, b0 var6_6, r var7_7, Map<? extends a.a<?>, ?> var8_8) {
        block9 : {
            if (var3_3 == null) {
                e.$$$reportNull$$$0(9);
                throw null;
            }
            if (var4_4 == null) {
                e.$$$reportNull$$$0(10);
                throw null;
            }
            if (var7_7 == null) {
                e.$$$reportNull$$$0(11);
                throw null;
            }
            var9_9 = super.initialize(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
            var10_10 = l.a;
            k.x.c.i.e(var9_9, "functionDescriptor");
            for (g var13_12 : var10_10.a()) {
                block10 : {
                    Objects.requireNonNull((Object)var13_12);
                    k.x.c.i.e(var9_9, "functionDescriptor");
                    var15_13 = var13_12.a;
                    var16_14 = 0;
                    if (var15_13 != null && !k.x.c.i.a(var9_9.getName(), var13_12.a)) ** GOTO lbl-1000
                    if (var13_12.b == null) break block10;
                    var24_17 = var9_9.getName().e();
                    k.x.c.i.d(var24_17, "functionDescriptor.name.asString()");
                    if (!var13_12.b.a(var24_17)) ** GOTO lbl-1000
                }
                if ((var17_15 = var13_12.c) != null && !var17_15.contains((Object)var9_9.getName())) lbl-1000: // 3 sources:
                {
                    var18_16 = false;
                } else {
                    var18_16 = true;
                }
                if (!var18_16) continue;
                k.x.c.i.e(var9_9, "functionDescriptor");
                var19_18 = var13_12.e;
                var20_19 = var19_18.length;
                while (var16_14 < var20_19) {
                    var22_20 = var19_18[var16_14];
                    ++var16_14;
                    var23_21 = var22_20.a(var9_9);
                    if (var23_21 == null) continue;
                    var12_22 = new /* Unavailable Anonymous Inner Class!! */;
                    break block9;
                }
                var21_27 = (String)var13_12.d.invoke((Object)var9_9);
                if (var21_27 != null) {
                    var12_23 = new /* Unavailable Anonymous Inner Class!! */;
                } else {
                    var12_24 = c.c.b;
                }
                break block9;
            }
            var12_25 = c.a.b;
        }
        this.setOperator(var12_26.a);
        return var9_9;
    }

    public void o(boolean bl, boolean bl2) {
        int n2 = bl ? (bl2 ? 4 : 2) : (bl2 ? 3 : 1);
        this.m = n2;
    }
}

