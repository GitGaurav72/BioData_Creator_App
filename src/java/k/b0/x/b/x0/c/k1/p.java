/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Set
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.f
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.p$a$a
 *  k.b0.x.b.x0.c.k1.p$a$b
 *  k.b0.x.b.x0.c.k1.p$a$c
 *  k.b0.x.b.x0.c.k1.p$a$d
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.w
 *  k.b0.x.b.x0.d.a.b
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.j.a0.i
 *  k.b0.x.b.x0.l.e
 *  k.b0.x.b.x0.l.g
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 *  k.x.b.a
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.k1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.f;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.j;
import k.b0.x.b.x0.c.k1.p;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.t0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.w;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.j.a0.i;
import k.b0.x.b.x0.l.e;
import k.b0.x.b.x0.l.g;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.o;
import k.b0.x.b.x0.m.y0;
import k.x.b.l;

public class p
extends j {
    public final y0 n;
    public final h o;
    public final k.b0.x.b.x0.l.i<Set<k.b0.x.b.x0.g.e>> p;
    public final k.b0.x.b.x0.c.i1.h q;

    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "storageManager";
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            }
            case 13: {
                arrobject[0] = "kotlinTypeRefiner";
                break;
            }
            case 8: {
                arrobject[0] = "supertype";
                break;
            }
            case 7: {
                arrobject[0] = "containingClass";
                break;
            }
            case 5: 
            case 12: {
                arrobject[0] = "source";
                break;
            }
            case 4: 
            case 11: {
                arrobject[0] = "annotations";
                break;
            }
            case 3: 
            case 10: {
                arrobject[0] = "enumMemberNames";
                break;
            }
            case 2: 
            case 9: {
                arrobject[0] = "name";
                break;
            }
            case 1: {
                arrobject[0] = "enumClass";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            }
            case 23: {
                arrobject[1] = "getSealedSubclasses";
                break;
            }
            case 22: {
                arrobject[1] = "getDeclaredTypeParameters";
                break;
            }
            case 21: {
                arrobject[1] = "getAnnotations";
                break;
            }
            case 20: {
                arrobject[1] = "getVisibility";
                break;
            }
            case 19: {
                arrobject[1] = "getModality";
                break;
            }
            case 18: {
                arrobject[1] = "getKind";
                break;
            }
            case 17: {
                arrobject[1] = "getTypeConstructor";
                break;
            }
            case 16: {
                arrobject[1] = "getConstructors";
                break;
            }
            case 15: {
                arrobject[1] = "getStaticScope";
                break;
            }
            case 14: {
                arrobject[1] = "getUnsubstitutedMemberScope";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "create";
                break;
            }
            case 13: {
                arrobject[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                arrobject[2] = "<init>";
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                object = new IllegalArgumentException(string2);
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public p(m m2, e e2, f0 f02, k.b0.x.b.x0.g.e e3, k.b0.x.b.x0.l.i<Set<k.b0.x.b.x0.g.e>> i2, k.b0.x.b.x0.c.i1.h h2, u0 u02) {
        if (m2 != null) {
            if (f02 != null) {
                if (e3 != null) {
                    if (i2 != null) {
                        if (h2 != null) {
                            if (u02 != null) {
                                super(m2, (k)e2, e3, u02, false);
                                this.q = h2;
                                this.n = new o(this, (List<? extends z0>)Collections.emptyList(), (Collection<f0>)Collections.singleton((Object)f02), m2);
                                this.o = new i(m2){
                                    public final g<k.b0.x.b.x0.g.e, Collection<? extends t0>> b;
                                    public final g<k.b0.x.b.x0.g.e, Collection<? extends n0>> c;
                                    public final k.b0.x.b.x0.l.i<Collection<k>> d;
                                    {
                                        this.b = m2.h(new a(this, p.this));
                                        this.c = m2.h(new b(this, p.this));
                                        this.d = m2.d(new c(this, p.this));
                                    }

                                    /*
                                     * Unable to fully structure code
                                     * Enabled aggressive block sorting
                                     * Lifted jumps to return sites
                                     */
                                    public static /* synthetic */ void a(int var0) {
                                        if (var0 != 3 && var0 != 7 && var0 != 9 && var0 != 12) {
                                            switch (var0) {
                                                default: {
                                                    var1_1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                                    ** break;
                                                }
                                                case 15: 
                                                case 16: 
                                                case 17: 
                                                case 18: 
                                                case 19: 
                                            }
                                        }
                                        var1_1 = "@NotNull method %s.%s must not return null";
lbl8: // 2 sources:
                                        if (var0 != 3 && var0 != 7 && var0 != 9 && var0 != 12) {
                                            switch (var0) {
                                                default: {
                                                    var2_2 = 3;
                                                    ** break;
                                                }
                                                case 15: 
                                                case 16: 
                                                case 17: 
                                                case 18: 
                                                case 19: 
                                            }
                                        }
                                        var2_2 = 2;
lbl15: // 2 sources:
                                        var3_3 = new Object[var2_2];
                                        switch (var0) {
                                            default: {
                                                var3_3[0] = "storageManager";
                                                ** break;
                                            }
                                            case 20: {
                                                var3_3[0] = "p";
                                                ** break;
                                            }
                                            case 14: {
                                                var3_3[0] = "nameFilter";
                                                ** break;
                                            }
                                            case 13: {
                                                var3_3[0] = "kindFilter";
                                                ** break;
                                            }
                                            case 11: {
                                                var3_3[0] = "fromSupertypes";
                                                ** break;
                                            }
                                            case 3: 
                                            case 7: 
                                            case 9: 
                                            case 12: 
                                            case 15: 
                                            case 16: 
                                            case 17: 
                                            case 18: 
                                            case 19: {
                                                var3_3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                                ** break;
                                            }
                                            case 2: 
                                            case 6: {
                                                var3_3[0] = "location";
                                                ** break;
                                            }
                                            case 1: 
                                            case 4: 
                                            case 5: 
                                            case 8: 
                                            case 10: 
                                        }
                                        var3_3[0] = "name";
lbl40: // 8 sources:
                                        if (var0 != 3) {
                                            if (var0 != 7) {
                                                if (var0 != 9) {
                                                    if (var0 != 12) {
                                                        switch (var0) {
                                                            default: {
                                                                var3_3[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                                                ** break;
                                                            }
                                                            case 19: {
                                                                var3_3[1] = "getVariableNames";
                                                                ** break;
                                                            }
                                                            case 18: {
                                                                var3_3[1] = "getClassifierNames";
                                                                ** break;
                                                            }
                                                            case 17: {
                                                                var3_3[1] = "getFunctionNames";
                                                                ** break;
                                                            }
                                                            case 16: {
                                                                var3_3[1] = "computeAllDeclarations";
                                                                ** break;
                                                            }
                                                            case 15: 
                                                        }
                                                        var3_3[1] = "getContributedDescriptors";
                                                        ** break;
lbl63: // 6 sources:
                                                    } else {
                                                        var3_3[1] = "resolveFakeOverrides";
                                                    }
                                                } else {
                                                    var3_3[1] = "getSupertypeScope";
                                                }
                                            } else {
                                                var3_3[1] = "getContributedFunctions";
                                            }
                                        } else {
                                            var3_3[1] = "getContributedVariables";
                                        }
                                        switch (var0) {
                                            default: {
                                                var3_3[2] = "<init>";
                                                break;
                                            }
                                            case 20: {
                                                var3_3[2] = "printScopeStructure";
                                                break;
                                            }
                                            case 13: 
                                            case 14: {
                                                var3_3[2] = "getContributedDescriptors";
                                                break;
                                            }
                                            case 10: 
                                            case 11: {
                                                var3_3[2] = "resolveFakeOverrides";
                                                break;
                                            }
                                            case 8: {
                                                var3_3[2] = "computeFunctions";
                                                break;
                                            }
                                            case 5: 
                                            case 6: {
                                                var3_3[2] = "getContributedFunctions";
                                                break;
                                            }
                                            case 4: {
                                                var3_3[2] = "computeProperties";
                                                break;
                                            }
                                            case 1: 
                                            case 2: {
                                                var3_3[2] = "getContributedVariables";
                                            }
                                            case 3: 
                                            case 7: 
                                            case 9: 
                                            case 12: 
                                            case 15: 
                                            case 16: 
                                            case 17: 
                                            case 18: 
                                            case 19: 
                                        }
                                        var4_4 = String.format((String)var1_1, (Object[])var3_3);
                                        if (var0 != 3 && var0 != 7 && var0 != 9 && var0 != 12) {
                                            switch (var0) {
                                                default: {
                                                    var5_5 = new IllegalArgumentException(var4_4);
                                                    throw var5_5;
                                                }
                                                case 15: 
                                                case 16: 
                                                case 17: 
                                                case 18: 
                                                case 19: 
                                            }
                                        }
                                        var5_5 = new IllegalStateException(var4_4);
                                        throw var5_5;
                                    }

                                    public final h b() {
                                        h h2 = ((f0)p.this.getTypeConstructor().getSupertypes().iterator().next()).getMemberScope();
                                        if (h2 != null) {
                                            return h2;
                                        }
                                        a.a(9);
                                        throw null;
                                    }

                                    public final <D extends k.b0.x.b.x0.c.b> Collection<? extends D> c(k.b0.x.b.x0.g.e e2, Collection<? extends D> collection) {
                                        if (e2 != null) {
                                            if (collection != null) {
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                k.b0.x.b.x0.j.m.b.h(e2, collection, (Collection<? extends k.b0.x.b.x0.c.b>)Collections.emptySet(), p.this, (k.b0.x.b.x0.j.l)new d(this, (Set)linkedHashSet));
                                                return linkedHashSet;
                                            }
                                            a.a(11);
                                            throw null;
                                        }
                                        a.a(10);
                                        throw null;
                                    }

                                    public Set<k.b0.x.b.x0.g.e> getClassifierNames() {
                                        Set set = Collections.emptySet();
                                        if (set != null) {
                                            return set;
                                        }
                                        a.a(18);
                                        throw null;
                                    }

                                    public Collection<k> getContributedDescriptors(k.b0.x.b.x0.j.a0.d d2, l<? super k.b0.x.b.x0.g.e, Boolean> l2) {
                                        if (d2 != null) {
                                            if (l2 != null) {
                                                Collection collection = (Collection)this.d.invoke();
                                                if (collection != null) {
                                                    return collection;
                                                }
                                                a.a(15);
                                                throw null;
                                            }
                                            a.a(14);
                                            throw null;
                                        }
                                        a.a(13);
                                        throw null;
                                    }

                                    public Collection<? extends t0> getContributedFunctions(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
                                        if (e2 != null) {
                                            if (b2 != null) {
                                                Collection collection = (Collection)((e.m)this.b).invoke(e2);
                                                if (collection != null) {
                                                    return collection;
                                                }
                                                a.a(7);
                                                throw null;
                                            }
                                            a.a(6);
                                            throw null;
                                        }
                                        a.a(5);
                                        throw null;
                                    }

                                    public Collection<? extends n0> getContributedVariables(k.b0.x.b.x0.g.e e2, k.b0.x.b.x0.d.a.b b2) {
                                        if (e2 != null) {
                                            if (b2 != null) {
                                                Collection collection = (Collection)((e.m)this.c).invoke(e2);
                                                if (collection != null) {
                                                    return collection;
                                                }
                                                a.a(3);
                                                throw null;
                                            }
                                            a.a(2);
                                            throw null;
                                        }
                                        a.a(1);
                                        throw null;
                                    }

                                    public Set<k.b0.x.b.x0.g.e> getFunctionNames() {
                                        Set set = (Set)p.this.p.invoke();
                                        if (set != null) {
                                            return set;
                                        }
                                        a.a(17);
                                        throw null;
                                    }

                                    public Set<k.b0.x.b.x0.g.e> getVariableNames() {
                                        Set set = (Set)p.this.p.invoke();
                                        if (set != null) {
                                            return set;
                                        }
                                        a.a(19);
                                        throw null;
                                    }
                                };
                                this.p = i2;
                                return;
                            }
                            p.$$$reportNull$$$0(12);
                            throw null;
                        }
                        p.$$$reportNull$$$0(11);
                        throw null;
                    }
                    p.$$$reportNull$$$0(10);
                    throw null;
                }
                p.$$$reportNull$$$0(9);
                throw null;
            }
            p.$$$reportNull$$$0(8);
            throw null;
        }
        p.$$$reportNull$$$0(6);
        throw null;
    }

    public static p n(m m2, e e2, k.b0.x.b.x0.g.e e3, k.b0.x.b.x0.l.i<Set<k.b0.x.b.x0.g.e>> i2, k.b0.x.b.x0.c.i1.h h2, u0 u02) {
        if (m2 != null) {
            if (e2 != null) {
                if (i2 != null) {
                    if (u02 != null) {
                        m0 m02 = e2.getDefaultType();
                        p p2 = new p(m2, e2, (f0)m02, e3, i2, h2, u02);
                        return p2;
                    }
                    p.$$$reportNull$$$0(5);
                    throw null;
                }
                p.$$$reportNull$$$0(3);
                throw null;
            }
            p.$$$reportNull$$$0(1);
            throw null;
        }
        p.$$$reportNull$$$0(0);
        throw null;
    }

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        k.b0.x.b.x0.c.i1.h h2 = this.q;
        if (h2 != null) {
            return h2;
        }
        p.$$$reportNull$$$0(21);
        throw null;
    }

    @Override
    public e getCompanionObjectDescriptor() {
        return null;
    }

    @Override
    public Collection<k.b0.x.b.x0.c.d> getConstructors() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        p.$$$reportNull$$$0(16);
        throw null;
    }

    @Override
    public List<z0> getDeclaredTypeParameters() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        p.$$$reportNull$$$0(22);
        throw null;
    }

    @Override
    public w<m0> getInlineClassRepresentation() {
        return null;
    }

    @Override
    public f getKind() {
        return f.n;
    }

    @Override
    public b0 getModality() {
        return b0.l;
    }

    @Override
    public Collection<e> getSealedSubclasses() {
        List list = Collections.emptyList();
        if (list != null) {
            return list;
        }
        p.$$$reportNull$$$0(23);
        throw null;
    }

    @Override
    public h getStaticScope() {
        h.b b2 = h.b.b;
        if (b2 != null) {
            return b2;
        }
        p.$$$reportNull$$$0(15);
        throw null;
    }

    @Override
    public y0 getTypeConstructor() {
        y0 y02 = this.n;
        if (y02 != null) {
            return y02;
        }
        p.$$$reportNull$$$0(17);
        throw null;
    }

    @Override
    public h getUnsubstitutedMemberScope(k.b0.x.b.x0.m.p1.d d2) {
        if (d2 != null) {
            h h2 = this.o;
            if (h2 != null) {
                return h2;
            }
            p.$$$reportNull$$$0(14);
            throw null;
        }
        p.$$$reportNull$$$0(13);
        throw null;
    }

    @Override
    public k.b0.x.b.x0.c.d getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override
    public r getVisibility() {
        r r2 = q.e;
        if (r2 != null) {
            return r2;
        }
        p.$$$reportNull$$$0(20);
        throw null;
    }

    @Override
    public boolean isActual() {
        return false;
    }

    @Override
    public boolean isCompanionObject() {
        return false;
    }

    @Override
    public boolean isData() {
        return false;
    }

    @Override
    public boolean isExpect() {
        return false;
    }

    @Override
    public boolean isFun() {
        return false;
    }

    @Override
    public boolean isInline() {
        return false;
    }

    @Override
    public boolean isInner() {
        return false;
    }

    @Override
    public boolean isValue() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"enum entry ");
        stringBuilder.append((Object)this.getName());
        return stringBuilder.toString();
    }

}

