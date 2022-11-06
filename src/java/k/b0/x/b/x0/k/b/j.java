/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.e0
 *  k.b0.x.b.x0.c.f0
 *  k.b0.x.b.x0.c.g0
 *  k.b0.x.b.x0.c.i1.c
 *  k.b0.x.b.x0.c.j1.a
 *  k.b0.x.b.x0.c.j1.a$a
 *  k.b0.x.b.x0.c.j1.b
 *  k.b0.x.b.x0.c.j1.c
 *  k.b0.x.b.x0.c.j1.c$a
 *  k.b0.x.b.x0.c.j1.e
 *  k.b0.x.b.x0.c.j1.e$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.d.a.c
 *  k.b0.x.b.x0.f.s
 *  k.b0.x.b.x0.k.b.f0.g
 *  k.b0.x.b.x0.m.p1.j
 *  k.b0.x.b.x0.m.p1.k
 *  k.s.r
 */
package k.b0.x.b.x0.k.b;

import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.e0;
import k.b0.x.b.x0.c.f0;
import k.b0.x.b.x0.c.g0;
import k.b0.x.b.x0.c.j1.a;
import k.b0.x.b.x0.c.j1.b;
import k.b0.x.b.x0.c.j1.c;
import k.b0.x.b.x0.c.j1.e;
import k.b0.x.b.x0.f.s;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.k.b.c;
import k.b0.x.b.x0.k.b.c0;
import k.b0.x.b.x0.k.b.g;
import k.b0.x.b.x0.k.b.h;
import k.b0.x.b.x0.k.b.i;
import k.b0.x.b.x0.k.b.k;
import k.b0.x.b.x0.k.b.l;
import k.b0.x.b.x0.k.b.q;
import k.b0.x.b.x0.k.b.r;
import k.b0.x.b.x0.k.b.u;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.p1.j;

public final class j {
    public final m a;
    public final d0 b;
    public final k c;
    public final g d;
    public final c<k.b0.x.b.x0.c.i1.c, k.b0.x.b.x0.j.w.g<?>> e;
    public final g0 f;
    public final u g;
    public final q h;
    public final k.b0.x.b.x0.d.a.c i;
    public final r j;
    public final Iterable<b> k;
    public final e0 l;
    public final i m;
    public final a n;
    public final k.b0.x.b.x0.c.j1.c o;
    public final f p;
    public final k.b0.x.b.x0.m.p1.j q;
    public final k.b0.x.b.x0.j.z.a r;
    public final e s;
    public final h t;

    public j(m m2, d0 d02, k k2, g g2, c c2, g0 g02, u u2, q q2, k.b0.x.b.x0.d.a.c c3, r r2, Iterable iterable, e0 e02, i i2, a a2, k.b0.x.b.x0.c.j1.c c4, f f2, k.b0.x.b.x0.m.p1.j j2, k.b0.x.b.x0.j.z.a a3, e e2, int n2) {
        k.b0.x.b.x0.m.p1.j j3;
        Object object = (n2 & 8192) != 0 ? a.a.a : a2;
        Object object2 = (n2 & 16384) != 0 ? c.a.a : c4;
        if ((n2 & 65536) != 0) {
            Objects.requireNonNull((Object)k.b0.x.b.x0.m.p1.j.b);
            j3 = j.a.b;
        } else {
            j3 = j2;
        }
        Object object3 = (n2 & 262144) != 0 ? e.a.a : null;
        e.a a4 = object3;
        k.x.c.i.e(m2, "storageManager");
        k.x.c.i.e((Object)d02, "moduleDescriptor");
        k.x.c.i.e(k2, "configuration");
        k.x.c.i.e(g2, "classDataFinder");
        k.x.c.i.e(c2, "annotationAndConstantLoader");
        k.x.c.i.e((Object)g02, "packageFragmentProvider");
        k.x.c.i.e(u2, "localClassifierTypeSettings");
        k.x.c.i.e(q2, "errorReporter");
        k.x.c.i.e((Object)c3, "lookupTracker");
        k.x.c.i.e(r2, "flexibleTypeDeserializer");
        k.x.c.i.e((Object)iterable, "fictitiousClassDescriptorFactories");
        k.x.c.i.e((Object)e02, "notFoundClasses");
        k.x.c.i.e(i2, "contractDeserializer");
        k.x.c.i.e(object, "additionalClassPartsProvider");
        k.x.c.i.e(object2, "platformDependentDeclarationFilter");
        c.a a5 = object2;
        k.x.c.i.e(f2, "extensionRegistryLite");
        k.x.c.i.e((Object)j3, "kotlinTypeChecker");
        k.x.c.i.e(a3, "samConversionResolver");
        k.x.c.i.e((Object)a4, "platformDependentTypeTransformer");
        this.a = m2;
        this.b = d02;
        this.c = k2;
        this.d = g2;
        this.e = c2;
        this.f = g02;
        this.g = u2;
        this.h = q2;
        this.i = c3;
        this.j = r2;
        this.k = iterable;
        this.l = e02;
        this.m = i2;
        this.n = object;
        this.o = a5;
        k.b0.x.b.x0.m.p1.j j4 = j3;
        this.p = f2;
        this.q = j4;
        this.r = a3;
        this.s = a4;
        this.t = new h(this);
    }

    public final l a(f0 f02, k.b0.x.b.x0.f.z.c c2, k.b0.x.b.x0.f.z.e e2, k.b0.x.b.x0.f.z.f f2, k.b0.x.b.x0.f.z.a a2, k.b0.x.b.x0.k.b.f0.g g2) {
        k.x.c.i.e((Object)f02, "descriptor");
        k.x.c.i.e(c2, "nameResolver");
        k.x.c.i.e(e2, "typeTable");
        k.x.c.i.e(f2, "versionRequirementTable");
        k.x.c.i.e(a2, "metadataVersion");
        l l2 = new l(this, c2, (k.b0.x.b.x0.c.k)f02, e2, f2, a2, g2, null, (List<s>)k.s.r.k);
        return l2;
    }

    public final k.b0.x.b.x0.c.e b(k.b0.x.b.x0.g.b b2) {
        k.x.c.i.e(b2, "classId");
        return h.a(this.t, b2, null, 2);
    }
}

