/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.x.b.x0.c.a$a
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.r$a
 *  k.b0.x.b.x0.c.k1.r$b
 *  k.b0.x.b.x0.c.k1.r$c
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.v$a
 *  k.b0.x.b.x0.j.a0.n.b
 *  k.b0.x.b.x0.m.f0
 *  k.s.i
 *  k.x.b.a
 */
package k.b0.x.b.x0.c.k1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.f1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.i0;
import k.b0.x.b.x0.c.k1.o0;
import k.b0.x.b.x0.c.k1.r;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.a0.n.d;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.h1;
import k.b0.x.b.x0.m.n1;
import k.e;
import k.s.i;

/*
 * Exception performing whole class analysis.
 */
public abstract class r
extends k.b0.x.b.x0.c.k1.n
implements v {
    private q0 dispatchReceiverParameter;
    private q0 extensionReceiverParameter;
    private boolean hasStableParameterNames;
    private boolean hasSynthesizedParameterNames;
    private v initialSignatureDescriptor;
    private boolean isActual;
    private boolean isExpect;
    private boolean isExternal;
    private boolean isHiddenForResolutionEverywhereBesideSupercalls;
    private boolean isHiddenToOvercomeSignatureClash;
    private boolean isInfix;
    private boolean isInline;
    private boolean isOperator;
    private boolean isSuspend;
    private boolean isTailrec;
    private final b.a kind;
    private volatile k.x.b.a<Collection<v>> lazyOverriddenFunctionsTask;
    private b0 modality;
    private final v original;
    private Collection<? extends v> overriddenFunctions;
    private List<z0> typeParameters;
    private f0 unsubstitutedReturnType;
    private List<e1> unsubstitutedValueParameters;
    public Map<a.a<?>, Object> userDataMap;
    private k.b0.x.b.x0.c.r visibility;

    private static /* synthetic */ void $$$reportNull$$$0(int n2) {
        String string;
        int n3;
        Object object;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 8: 
            case 12: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 21: 
            case 24: 
            case 25: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 8: 
            case 12: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 21: 
            case 24: 
            case 25: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "containingDeclaration";
                break;
            }
            case 23: {
                arrobject[0] = "configuration";
                break;
            }
            case 22: 
            case 27: 
            case 29: {
                arrobject[0] = "substitutor";
                break;
            }
            case 20: {
                arrobject[0] = "originalSubstitutor";
                break;
            }
            case 15: {
                arrobject[0] = "overriddenDescriptors";
                break;
            }
            case 11: {
                arrobject[0] = "extensionReceiverParameter";
                break;
            }
            case 10: {
                arrobject[0] = "unsubstitutedReturnType";
                break;
            }
            case 8: 
            case 12: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 21: 
            case 24: 
            case 25: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            }
            case 7: 
            case 9: {
                arrobject[0] = "visibility";
                break;
            }
            case 6: 
            case 26: 
            case 28: {
                arrobject[0] = "unsubstitutedValueParameters";
                break;
            }
            case 5: {
                arrobject[0] = "typeParameters";
                break;
            }
            case 4: {
                arrobject[0] = "source";
                break;
            }
            case 3: {
                arrobject[0] = "kind";
                break;
            }
            case 2: {
                arrobject[0] = "name";
                break;
            }
            case 1: {
                arrobject[0] = "annotations";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            }
            case 25: {
                arrobject[1] = "getSourceToUseForCopy";
                break;
            }
            case 24: {
                arrobject[1] = "copy";
                break;
            }
            case 21: {
                arrobject[1] = "newCopyBuilder";
                break;
            }
            case 19: {
                arrobject[1] = "getKind";
                break;
            }
            case 18: {
                arrobject[1] = "getOriginal";
                break;
            }
            case 17: {
                arrobject[1] = "getValueParameters";
                break;
            }
            case 16: {
                arrobject[1] = "getTypeParameters";
                break;
            }
            case 14: {
                arrobject[1] = "getVisibility";
                break;
            }
            case 13: {
                arrobject[1] = "getModality";
                break;
            }
            case 12: {
                arrobject[1] = "getOverriddenDescriptors";
                break;
            }
            case 8: {
                arrobject[1] = "initialize";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 26: 
            case 27: 
            case 28: 
            case 29: {
                arrobject[2] = "getSubstitutedValueParameters";
                break;
            }
            case 23: {
                arrobject[2] = "doSubstitute";
                break;
            }
            case 22: {
                arrobject[2] = "newCopyBuilder";
                break;
            }
            case 20: {
                arrobject[2] = "substitute";
                break;
            }
            case 15: {
                arrobject[2] = "setOverriddenDescriptors";
                break;
            }
            case 11: {
                arrobject[2] = "setExtensionReceiverParameter";
                break;
            }
            case 10: {
                arrobject[2] = "setReturnType";
                break;
            }
            case 9: {
                arrobject[2] = "setVisibility";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                arrobject[2] = "initialize";
            }
            case 8: 
            case 12: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 21: 
            case 24: 
            case 25: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                object = new IllegalArgumentException(string2);
                break;
            }
            case 8: 
            case 12: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 21: 
            case 24: 
            case 25: {
                object = new IllegalStateException(string2);
            }
        }
        throw object;
    }

    public r(k k2, v v2, h h2, k.b0.x.b.x0.g.e e2, b.a a2, u0 u02) {
        if (k2 == null) {
            r.$$$reportNull$$$0(0);
        }
        if (h2 == null) {
            r.$$$reportNull$$$0(1);
        }
        if (e2 == null) {
            r.$$$reportNull$$$0(2);
        }
        if (a2 == null) {
            r.$$$reportNull$$$0(3);
        }
        if (u02 == null) {
            r.$$$reportNull$$$0(4);
        }
        super(k2, h2, e2, u02);
        this.visibility = q.i;
        this.isOperator = false;
        this.isInfix = false;
        this.isExternal = false;
        this.isInline = false;
        this.isTailrec = false;
        this.isExpect = false;
        this.isActual = false;
        this.isHiddenToOvercomeSignatureClash = false;
        this.isHiddenForResolutionEverywhereBesideSupercalls = false;
        this.isSuspend = false;
        this.hasStableParameterNames = true;
        this.hasSynthesizedParameterNames = false;
        this.overriddenFunctions = null;
        this.lazyOverriddenFunctionsTask = null;
        this.initialSignatureDescriptor = null;
        this.userDataMap = null;
        if (v2 == null) {
            v2 = this;
        }
        this.original = v2;
        this.kind = a2;
    }

    public static /* synthetic */ q0 access$000(r r2) {
        return r2.dispatchReceiverParameter;
    }

    private u0 getSourceToUseForCopy(boolean bl, v a2) {
        u0 u02;
        if (bl) {
            if (a2 == null) {
                a2 = this.getOriginal();
            }
            u02 = a2.getSource();
        } else {
            u02 = u0.a;
        }
        if (u02 == null) {
            r.$$$reportNull$$$0(25);
        }
        return u02;
    }

    public static List<e1> getSubstitutedValueParameters(v v2, List<e1> list, h1 h12) {
        if (list == null) {
            r.$$$reportNull$$$0(26);
        }
        if (h12 == null) {
            r.$$$reportNull$$$0(27);
        }
        return r.getSubstitutedValueParameters(v2, list, h12, false, false, null);
    }

    public static List<e1> getSubstitutedValueParameters(v v2, List<e1> list, h1 h12, boolean bl, boolean bl2, boolean[] arrbl) {
        if (list == null) {
            r.$$$reportNull$$$0(28);
        }
        if (h12 == null) {
            r.$$$reportNull$$$0(29);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (e1 e12 : list) {
            f0 f02 = e12.b();
            n1 n12 = n1.l;
            f0 f03 = h12.k(f02, n12);
            f0 f04 = e12.F();
            f0 f05 = f04 == null ? null : h12.k(f04, n12);
            if (f03 == null) {
                return null;
            }
            if ((f03 != e12.b() || f04 != f05) && arrbl != null) {
                arrbl[0] = true;
            }
            b b2 = e12 instanceof o0.a ? new b((List)((o0.a)e12).r.getValue()) : null;
            e1 e13 = bl ? null : e12;
            int n2 = e12.e();
            h h2 = e12.getAnnotations();
            k.b0.x.b.x0.g.e e2 = e12.getName();
            boolean bl3 = e12.M();
            boolean bl4 = e12.z();
            boolean bl5 = e12.x();
            u0 u02 = bl2 ? e12.getSource() : u0.a;
            k.x.c.i.e(v2, "containingDeclaration");
            k.x.c.i.e((Object)h2, "annotations");
            k.x.c.i.e(e2, "name");
            k.x.c.i.e((Object)f03, "outType");
            k.x.c.i.e((Object)u02, "source");
            o0 o02 = b2 == null ? new o0(v2, e13, n2, h2, e2, f03, bl3, bl4, bl5, f05, u02) : new o0.a(v2, e13, n2, h2, e2, f03, bl3, bl4, bl5, f05, u02, (k.x.b.a<? extends List<? extends f1>>)b2);
            arrayList.add((Object)o02);
        }
        return arrayList;
    }

    private void performOverriddenLazyCalculationIfNeeded() {
        k.x.b.a<Collection<v>> a2 = this.lazyOverriddenFunctionsTask;
        if (a2 != null) {
            this.overriddenFunctions = (Collection)a2.invoke();
            this.lazyOverriddenFunctionsTask = null;
        }
    }

    private void setHiddenForResolutionEverywhereBesideSupercalls(boolean bl) {
        this.isHiddenForResolutionEverywhereBesideSupercalls = bl;
    }

    private void setHiddenToOvercomeSignatureClash(boolean bl) {
        this.isHiddenToOvercomeSignatureClash = bl;
    }

    private void setInitialSignatureDescriptor(v v2) {
        this.initialSignatureDescriptor = v2;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        return (R)m2.g((v)this, d2);
    }

    @Override
    public v copy(k k2, b0 b02, k.b0.x.b.x0.c.r r2, b.a a2, boolean bl) {
        v v2 = this.newCopyBuilder().o(k2).c(b02).n(r2).q(a2).i(bl).build();
        if (v2 == null) {
            r.$$$reportNull$$$0(24);
        }
        return v2;
    }

    public abstract r createSubstitutedCopy(k var1, v var2, b.a var3, k.b0.x.b.x0.g.e var4, h var5, u0 var6);

    public v doSubstitute(c c2) {
        i0 i02;
        q0 q02;
        if (c2 == null) {
            r.$$$reportNull$$$0(23);
        }
        boolean[] arrbl = new boolean[1];
        h h2 = c2.r != null ? e.s.a.a.X((h)this.getAnnotations(), (h)c2.r) : this.getAnnotations();
        h h3 = h2;
        k k2 = c2.b;
        v v2 = c2.e;
        r r2 = this.createSubstitutedCopy(k2, v2, c2.f, c2.k, h3, this.getSourceToUseForCopy(c2.n, v2));
        List<z0> list = c2.q;
        if (list == null) {
            list = this.getTypeParameters();
        }
        arrbl[0] = arrbl[0] | true ^ list.isEmpty();
        ArrayList arrayList = new ArrayList(list.size());
        h1 h12 = e.s.a.a.Y3(list, (k.b0.x.b.x0.m.e1)c2.a, (k)r2, (List)arrayList, (boolean[])arrbl);
        if (h12 == null) {
            return null;
        }
        q0 q03 = c2.h;
        if (q03 != null) {
            f0 f02 = h12.k(q03.b(), n1.l);
            if (f02 == null) {
                return null;
            }
            i0 i03 = new i0((k)r2, (d)new k.b0.x.b.x0.j.a0.n.b((k.b0.x.b.x0.c.a)r2, f02, c2.h.getValue()), c2.h.getAnnotations());
            boolean bl = arrbl[0];
            boolean bl2 = f02 != c2.h.b();
            arrbl[0] = bl2 | bl;
            i02 = i03;
        } else {
            i02 = null;
        }
        q0 q04 = c2.i;
        if (q04 != null) {
            q0 q05 = q04.substitute(h12);
            if (q05 == null) {
                return null;
            }
            boolean bl = arrbl[0];
            boolean bl3 = q05 != c2.i;
            arrbl[0] = bl | bl3;
            q02 = q05;
        } else {
            q02 = null;
        }
        List<e1> list2 = r.getSubstitutedValueParameters(r2, (List<e1>)c2.g, h12, c2.o, c2.n, arrbl);
        if (list2 == null) {
            return null;
        }
        f0 f03 = h12.k(c2.j, n1.m);
        if (f03 == null) {
            return null;
        }
        boolean bl = arrbl[0];
        boolean bl4 = f03 != c2.j;
        arrbl[0] = bl | bl4;
        if (!arrbl[0] && c2.v) {
            return this;
        }
        b0 b02 = c2.c;
        k.b0.x.b.x0.c.r r3 = c2.d;
        r2.initialize(i02, q02, (List<? extends z0>)arrayList, list2, f03, b02, r3);
        r2.setOperator(this.isOperator);
        r2.setInfix(this.isInfix);
        r2.setExternal(this.isExternal);
        r2.setInline(this.isInline);
        r2.setTailrec(this.isTailrec);
        r2.setSuspend(this.isSuspend);
        r2.setExpect(this.isExpect);
        r2.setActual(this.isActual);
        r2.setHasStableParameterNames(this.hasStableParameterNames);
        r2.setHiddenToOvercomeSignatureClash(c2.p);
        r2.setHiddenForResolutionEverywhereBesideSupercalls(c2.s);
        Boolean bl5 = c2.u;
        boolean bl6 = bl5 != null ? bl5 : this.hasSynthesizedParameterNames;
        r2.setHasSynthesizedParameterNames(bl6);
        if (!c2.t.isEmpty() || this.userDataMap != null) {
            Map map = c2.t;
            Map<a.a<?>, Object> map2 = this.userDataMap;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (map.containsKey(entry.getKey())) continue;
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            if (map.size() == 1) {
                map = Collections.singletonMap((Object)map.keySet().iterator().next(), (Object)map.values().iterator().next());
            }
            r2.userDataMap = map;
        }
        if (c2.m || this.getInitialSignatureDescriptor() != null) {
            v v3 = this.getInitialSignatureDescriptor() != null ? this.getInitialSignatureDescriptor() : this;
            r2.setInitialSignatureDescriptor(v3.substitute(h12));
        }
        if (c2.l && !this.getOriginal().getOverriddenDescriptors().isEmpty()) {
            a a2;
            if (c2.a.f()) {
                a2 = this.lazyOverriddenFunctionsTask;
                if (a2 == null) {
                    r2.setOverriddenDescriptors(this.getOverriddenDescriptors());
                    return r2;
                }
            } else {
                a2 = new a(this, h12);
            }
            r2.lazyOverriddenFunctionsTask = a2;
        }
        return r2;
    }

    @Override
    public q0 getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    @Override
    public q0 getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    @Override
    public v getInitialSignatureDescriptor() {
        return this.initialSignatureDescriptor;
    }

    @Override
    public b.a getKind() {
        b.a a2 = this.kind;
        if (a2 == null) {
            r.$$$reportNull$$$0(19);
        }
        return a2;
    }

    @Override
    public b0 getModality() {
        b0 b02 = this.modality;
        if (b02 == null) {
            r.$$$reportNull$$$0(13);
        }
        return b02;
    }

    @Override
    public v getOriginal() {
        v v2 = this.original;
        v v3 = v2 == this ? this : v2.getOriginal();
        if (v3 == null) {
            r.$$$reportNull$$$0(18);
        }
        return v3;
    }

    @Override
    public Collection<? extends v> getOverriddenDescriptors() {
        this.performOverriddenLazyCalculationIfNeeded();
        List list = this.overriddenFunctions;
        if (list == null) {
            list = Collections.emptyList();
        }
        if (list == null) {
            r.$$$reportNull$$$0(12);
        }
        return list;
    }

    @Override
    public f0 getReturnType() {
        return this.unsubstitutedReturnType;
    }

    @Override
    public List<z0> getTypeParameters() {
        List<z0> list = this.typeParameters;
        if (list != null) {
            return list;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("typeParameters == null for ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public <V> V getUserData(a.a<V> a2) {
        Map<a.a<?>, Object> map = this.userDataMap;
        if (map == null) {
            return null;
        }
        return (V)map.get(a2);
    }

    @Override
    public List<e1> getValueParameters() {
        List<e1> list = this.unsubstitutedValueParameters;
        if (list == null) {
            r.$$$reportNull$$$0(17);
        }
        return list;
    }

    @Override
    public k.b0.x.b.x0.c.r getVisibility() {
        k.b0.x.b.x0.c.r r2 = this.visibility;
        if (r2 == null) {
            r.$$$reportNull$$$0(14);
        }
        return r2;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames;
    }

    @Override
    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames;
    }

    public r initialize(q0 q02, q0 q03, List<? extends z0> list, List<e1> list2, f0 f02, b0 b02, k.b0.x.b.x0.c.r r2) {
        block6 : {
            z0 z02;
            if (list == null) {
                r.$$$reportNull$$$0(5);
            }
            if (list2 == null) {
                r.$$$reportNull$$$0(6);
            }
            if (r2 == null) {
                r.$$$reportNull$$$0(7);
            }
            this.typeParameters = i.b0(list);
            this.unsubstitutedValueParameters = i.b0(list2);
            this.unsubstitutedReturnType = f02;
            this.modality = b02;
            this.visibility = r2;
            this.extensionReceiverParameter = q02;
            this.dispatchReceiverParameter = q03;
            int n2 = 0;
            do {
                int n3 = list.size();
                if (n2 >= n3) break block6;
                z02 = (z0)list.get(n2);
                if (z02.e() != n2) break;
                ++n2;
            } while (true);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)z02);
            stringBuilder.append(" index is ");
            stringBuilder.append(z02.e());
            stringBuilder.append(" but position is ");
            stringBuilder.append(n2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            e1 e12 = (e1)list2.get(i2);
            if (e12.e() == i2 + 0) {
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)e12);
            stringBuilder.append("index is ");
            stringBuilder.append(e12.e());
            stringBuilder.append(" but position is ");
            stringBuilder.append(i2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return this;
    }

    @Override
    public boolean isActual() {
        return this.isActual;
    }

    @Override
    public boolean isExpect() {
        return this.isExpect;
    }

    @Override
    public boolean isExternal() {
        return this.isExternal;
    }

    @Override
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.isHiddenForResolutionEverywhereBesideSupercalls;
    }

    @Override
    public boolean isHiddenToOvercomeSignatureClash() {
        return this.isHiddenToOvercomeSignatureClash;
    }

    @Override
    public boolean isInfix() {
        if (this.isInfix) {
            return true;
        }
        Iterator iterator = this.getOriginal().getOverriddenDescriptors().iterator();
        while (iterator.hasNext()) {
            if (!((v)iterator.next()).isInfix()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isInline() {
        return this.isInline;
    }

    @Override
    public boolean isOperator() {
        if (this.isOperator) {
            return true;
        }
        Iterator iterator = this.getOriginal().getOverriddenDescriptors().iterator();
        while (iterator.hasNext()) {
            if (!((v)iterator.next()).isOperator()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isSuspend() {
        return this.isSuspend;
    }

    @Override
    public boolean isTailrec() {
        return this.isTailrec;
    }

    public c newCopyBuilder(h1 h12) {
        if (h12 == null) {
            r.$$$reportNull$$$0(22);
        }
        c c2 = new /* Unavailable Anonymous Inner Class!! */;
        return c2;
    }

    @Override
    public v.a<? extends v> newCopyBuilder() {
        c c2 = this.newCopyBuilder(h1.a);
        if (c2 == null) {
            r.$$$reportNull$$$0(21);
        }
        return c2;
    }

    public <V> void putInUserDataMap(a.a<V> a2, Object object) {
        if (this.userDataMap == null) {
            this.userDataMap = new LinkedHashMap();
        }
        this.userDataMap.put(a2, object);
    }

    public void setActual(boolean bl) {
        this.isActual = bl;
    }

    public void setExpect(boolean bl) {
        this.isExpect = bl;
    }

    public void setExternal(boolean bl) {
        this.isExternal = bl;
    }

    public void setHasStableParameterNames(boolean bl) {
        this.hasStableParameterNames = bl;
    }

    public void setHasSynthesizedParameterNames(boolean bl) {
        this.hasSynthesizedParameterNames = bl;
    }

    public void setInfix(boolean bl) {
        this.isInfix = bl;
    }

    public void setInline(boolean bl) {
        this.isInline = bl;
    }

    public void setOperator(boolean bl) {
        this.isOperator = bl;
    }

    @Override
    public void setOverriddenDescriptors(Collection<? extends k.b0.x.b.x0.c.b> collection) {
        if (collection == null) {
            r.$$$reportNull$$$0(15);
        }
        this.overriddenFunctions = collection;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!((v)iterator.next()).isHiddenForResolutionEverywhereBesideSupercalls()) continue;
            this.isHiddenForResolutionEverywhereBesideSupercalls = true;
            break;
        }
    }

    public void setReturnType(f0 f02) {
        if (f02 == null) {
            r.$$$reportNull$$$0(10);
        }
        this.unsubstitutedReturnType = f02;
    }

    public void setSuspend(boolean bl) {
        this.isSuspend = bl;
    }

    public void setTailrec(boolean bl) {
        this.isTailrec = bl;
    }

    public void setVisibility(k.b0.x.b.x0.c.r r2) {
        if (r2 == null) {
            r.$$$reportNull$$$0(9);
        }
        this.visibility = r2;
    }

    @Override
    public v substitute(h1 h12) {
        if (h12 == null) {
            r.$$$reportNull$$$0(20);
        }
        if (h12.h()) {
            return this;
        }
        c c2 = this.newCopyBuilder(h12);
        k.b0.x.b.x0.c.a a2 = this.getOriginal();
        Objects.requireNonNull((Object)c2);
        c2.e = a2;
        c2.n = true;
        c2.v = true;
        return c2.build();
    }
}

