/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  k.b0.x.b.x0.c.a$a
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.e.a.d0
 *  k.b0.x.b.x0.e.a.n0.h
 *  k.b0.x.b.x0.m.f0
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 *  kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes
 */
package k.b0.x.b.x0.e.a.n0;

import java.util.List;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.f0;
import k.b0.x.b.x0.c.k1.q0;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.e.a.d0;
import k.b0.x.b.x0.e.a.n0.a;
import k.b0.x.b.x0.e.a.n0.h;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.p1.n;
import k.i;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;

public class f
extends f0
implements a {
    public final boolean G;
    public final i<a.a<?>, ?> H;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string = n2 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 21 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 22: {
                arrobject[0] = "inType";
                break;
            }
            case 21: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            }
            case 20: {
                arrobject[0] = "enhancedReturnType";
                break;
            }
            case 19: {
                arrobject[0] = "enhancedValueParametersData";
                break;
            }
            case 17: {
                arrobject[0] = "newName";
                break;
            }
            case 15: {
                arrobject[0] = "newVisibility";
                break;
            }
            case 14: {
                arrobject[0] = "newModality";
                break;
            }
            case 13: {
                arrobject[0] = "newOwner";
                break;
            }
            case 6: 
            case 16: {
                arrobject[0] = "kind";
                break;
            }
            case 5: 
            case 12: 
            case 18: {
                arrobject[0] = "source";
                break;
            }
            case 4: 
            case 11: {
                arrobject[0] = "name";
                break;
            }
            case 3: 
            case 10: {
                arrobject[0] = "visibility";
                break;
            }
            case 2: 
            case 9: {
                arrobject[0] = "modality";
                break;
            }
            case 1: 
            case 8: {
                arrobject[0] = "annotations";
            }
        }
        arrobject[1] = n2 != 21 ? "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor" : "enhance";
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 22: {
                arrobject[2] = "setInType";
                break;
            }
            case 19: 
            case 20: {
                arrobject[2] = "enhance";
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                arrobject[2] = "createSubstitutedCopy";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                arrobject[2] = "create";
            }
            case 21: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 21 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw object;
    }

    public f(k k2, k.b0.x.b.x0.c.i1.h h2, b0 b02, r r2, boolean bl, e e2, u0 u02, n0 n02, b.a a2, boolean bl2, i<a.a<?>, ?> i2) {
        if (k2 != null) {
            if (h2 != null) {
                if (b02 != null) {
                    if (r2 != null) {
                        if (e2 != null) {
                            if (u02 != null) {
                                if (a2 != null) {
                                    super(k2, n02, h2, b02, r2, bl, e2, a2, u02, false, false, false, false, false, false);
                                    this.G = bl2;
                                    this.H = i2;
                                    return;
                                }
                                f.$$$reportNull$$$0(6);
                                throw null;
                            }
                            f.$$$reportNull$$$0(5);
                            throw null;
                        }
                        f.$$$reportNull$$$0(4);
                        throw null;
                    }
                    f.$$$reportNull$$$0(3);
                    throw null;
                }
                f.$$$reportNull$$$0(2);
                throw null;
            }
            f.$$$reportNull$$$0(1);
            throw null;
        }
        f.$$$reportNull$$$0(0);
        throw null;
    }

    public static f V(k k2, k.b0.x.b.x0.c.i1.h h2, b0 b02, r r2, boolean bl, e e2, u0 u02, boolean bl2) {
        if (k2 != null) {
            if (b02 != null) {
                if (e2 != null) {
                    if (u02 != null) {
                        f f2 = new f(k2, h2, b02, r2, bl, e2, u02, null, b.a.k, bl2, null);
                        return f2;
                    }
                    f.$$$reportNull$$$0(12);
                    throw null;
                }
                f.$$$reportNull$$$0(11);
                throw null;
            }
            f.$$$reportNull$$$0(9);
            throw null;
        }
        f.$$$reportNull$$$0(7);
        throw null;
    }

    @Override
    public void T(k.b0.x.b.x0.m.f0 f02) {
    }

    @Override
    public <V> V getUserData(a.a<V> a2) {
        i<a.a<?>, ?> i2 = this.H;
        if (i2 != null && (i2.k).equals(a2)) {
            return (V)this.H.l;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public a h(k.b0.x.b.x0.m.f0 var1, List<h> var2, k.b0.x.b.x0.m.f0 var3, i<a.a<?>, ?> var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1560)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1816)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:332)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean i() {
        k.b0.x.b.x0.m.f0 f02 = this.b();
        boolean bl = this.G;
        boolean bl2 = true;
        if (!bl) return false;
        k.x.c.i.e((Object)f02, "type");
        k.x.c.i.e((Object)f02, "<this>");
        if (!KotlinBuiltIns.isPrimitiveType((k.b0.x.b.x0.m.f0)f02) && !UnsignedTypes.isUnsignedType((k.b0.x.b.x0.m.f0)f02) || j1.h(f02)) {
            if (!KotlinBuiltIns.isString((k.b0.x.b.x0.m.f0)f02)) return false;
        }
        boolean bl3 = bl2;
        if (!bl3) return false;
        k.x.c.i.e((Object)f02, "<this>");
        n n2 = n.a;
        k.x.c.i.e(n2, "<this>");
        k.x.c.i.e((Object)f02, "type");
        c c2 = d0.o;
        k.x.c.i.d(c2, "ENHANCED_NULLABILITY_ANNOTATION");
        if (!n2.t0((k.b0.x.b.x0.m.r1.i)f02, c2)) return bl2;
        if (!KotlinBuiltIns.isString((k.b0.x.b.x0.m.f0)f02)) return false;
        return bl2;
    }

    @Override
    public f0 q(k k2, b0 b02, r r2, n0 n02, b.a a2, e e2, u0 u02) {
        if (k2 != null) {
            if (b02 != null) {
                if (r2 != null) {
                    if (a2 != null) {
                        if (e2 != null) {
                            f f2 = new f(k2, this.getAnnotations(), b02, r2, this.l, e2, u02, n02, a2, this.G, this.H);
                            return f2;
                        }
                        f.$$$reportNull$$$0(17);
                        throw null;
                    }
                    f.$$$reportNull$$$0(16);
                    throw null;
                }
                f.$$$reportNull$$$0(15);
                throw null;
            }
            f.$$$reportNull$$$0(14);
            throw null;
        }
        f.$$$reportNull$$$0(13);
        throw null;
    }
}

