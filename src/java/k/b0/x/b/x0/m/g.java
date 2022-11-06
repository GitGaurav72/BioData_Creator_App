/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.List
 *  k.b0.x.b.x0.c.x0
 *  k.b0.x.b.x0.l.i
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.g$a
 *  k.b0.x.b.x0.m.p
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  k.s.r
 *  k.x.b.a
 *  k.x.b.l
 *  k.x.c.k
 */
package k.b0.x.b.x0.m;

import java.util.Collection;
import java.util.List;
import k.b0.x.b.x0.c.x0;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.g;
import k.b0.x.b.x0.m.h;
import k.b0.x.b.x0.m.i;
import k.b0.x.b.x0.m.j;
import k.b0.x.b.x0.m.k;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.p;
import k.b0.x.b.x0.m.y;
import k.b0.x.b.x0.m.y0;
import k.q;
import k.s.r;
import k.x.b.l;

/*
 * Exception performing whole class analysis.
 */
public abstract class g
extends p {
    private final boolean shouldReportCyclicScopeWithCompanionWarning;
    private final k.b0.x.b.x0.l.i<b> supertypes;

    public g(m m2) {
        k.x.c.i.e(m2, "storageManager");
        this.supertypes = m2.g(new k.x.b.a<b>(){

            public Object invoke() {
                return new Object(this.computeSupertypes()){
                    public final Collection<f0> a;
                    public List<? extends f0> b;
                    {
                        k.x.c.i.e(collection, "allSupertypes");
                        this.a = collection;
                        this.b = e.s.a.a.N2((Object)y.c);
                    }
                };
            }
        }, d.k, new l<b, q>(){

            public Object invoke(Object object) {
                f0 f02;
                b b2 = object;
                k.x.c.i.e(b2, "supertypes");
                x0 x02 = this.getSupertypeLoopChecker();
                g g2 = this;
                Object object2 = x02.a((y0)g2, b2.a, (l)new j(g2), (l)new k(this));
                if (object2.isEmpty() && (object2 = (f02 = this.defaultSupertypeIfEmpty()) == null ? null : e.s.a.a.N2((Object)f02)) == null) {
                    object2 = r.k;
                }
                if (this.getShouldReportCyclicScopeWithCompanionWarning()) {
                    x0 x03 = this.getSupertypeLoopChecker();
                    g g3 = this;
                    x03.a((y0)g3, object2, (l)new h(g3), (l)new i(this));
                }
                g g4 = this;
                boolean bl = object2 instanceof List;
                List list = null;
                if (bl) {
                    list = (List)object2;
                }
                if (list == null) {
                    list = k.s.i.b0((Iterable)object2);
                }
                List<f0> list2 = g4.processSupertypesWithoutCycles((List<f0>)list);
                k.x.c.i.e(list2, "<set-?>");
                b2.b = list2;
                return q.a;
            }
        });
    }

    public static final /* synthetic */ Collection access$computeNeighbours(g g2, y0 y02, boolean bl) {
        return g2.computeNeighbours(y02, bl);
    }

    private final Collection<f0> computeNeighbours(y0 y02, boolean bl) {
        g g2 = y02 instanceof g ? (g)y02 : null;
        if (g2 == null) {
            Collection collection = y02.getSupertypes();
            k.x.c.i.d((Object)collection, "supertypes");
            return collection;
        }
        return k.s.i.M((g2.supertypes.invoke()).a, g2.getAdditionalNeighboursInSupertypeGraph(bl));
    }

    public abstract Collection<f0> computeSupertypes();

    public f0 defaultSupertypeIfEmpty() {
        return null;
    }

    public Collection<f0> getAdditionalNeighboursInSupertypeGraph(boolean bl) {
        return r.k;
    }

    public boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.shouldReportCyclicScopeWithCompanionWarning;
    }

    public abstract x0 getSupertypeLoopChecker();

    public List<f0> getSupertypes() {
        return (this.supertypes.invoke()).b;
    }

    public List<f0> processSupertypesWithoutCycles(List<f0> list) {
        k.x.c.i.e(list, "supertypes");
        return list;
    }

    public y0 refine(k.b0.x.b.x0.m.p1.d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public void reportScopesLoopError(f0 f02) {
        k.x.c.i.e((Object)f02, "type");
    }

    public void reportSupertypeLoopError(f0 f02) {
        k.x.c.i.e((Object)f02, "type");
    }

}

