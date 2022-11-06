/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.m.f0
 *  k.x.b.a
 */
package k.b0.x.b.x0.c.k1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.f1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.o0;
import k.b0.x.b.x0.c.k1.p0;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.j.w.g;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.h1;
import k.e;
import k.x.c.i;

public class o0
extends p0
implements e1 {
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final f0 p;
    public final e1 q;

    public o0(k.b0.x.b.x0.c.a a2, e1 e12, int n2, h h2, k.b0.x.b.x0.g.e e2, f0 f02, boolean bl, boolean bl2, boolean bl3, f0 f03, u0 u02) {
        i.e(a2, "containingDeclaration");
        i.e((Object)h2, "annotations");
        i.e(e2, "name");
        i.e((Object)f02, "outType");
        i.e((Object)u02, "source");
        super((k)a2, h2, e2, f02, u02);
        this.l = n2;
        this.m = bl;
        this.n = bl2;
        this.o = bl3;
        this.p = f03;
        e1 e13 = e12 == null ? this : e12;
        this.q = e13;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public f0 F() {
        return this.p;
    }

    @Override
    public boolean M() {
        return this.m && ((b)this.getContainingDeclaration()).getKind().b();
    }

    @Override
    public e1 Q(k.b0.x.b.x0.c.a a2, k.b0.x.b.x0.g.e e2, int n2) {
        i.e(a2, "newOwner");
        i.e(e2, "newName");
        h h2 = this.getAnnotations();
        i.d((Object)h2, "annotations");
        f0 f02 = this.b();
        i.d((Object)f02, "type");
        boolean bl = this.M();
        boolean bl2 = this.n;
        boolean bl3 = this.o;
        f0 f03 = this.p;
        u0 u02 = u0.a;
        i.d((Object)u02, "NO_SOURCE");
        o0 o02 = new o0(a2, null, n2, h2, e2, f02, bl, bl2, bl3, f03, u02);
        return o02;
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        i.e(m2, "visitor");
        return (R)m2.k((e1)this, d2);
    }

    @Override
    public int e() {
        return this.l;
    }

    @Override
    public k.b0.x.b.x0.c.a getContainingDeclaration() {
        return (k.b0.x.b.x0.c.a)k.b0.x.b.x0.c.k1.n.super.getContainingDeclaration();
    }

    @Override
    public e1 getOriginal() {
        e1 e12 = this.q;
        if (e12 == this) {
            return this;
        }
        return e12.getOriginal();
    }

    @Override
    public Collection<e1> getOverriddenDescriptors() {
        Collection<? extends k.b0.x.b.x0.c.a> collection = this.getContainingDeclaration().getOverriddenDescriptors();
        i.d(collection, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(e.s.a.a.U(collection, (int)10));
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((e1)((k.b0.x.b.x0.c.a)iterator.next()).getValueParameters().get(this.l)));
        }
        return arrayList;
    }

    public r getVisibility() {
        r r2 = q.f;
        i.d((Object)r2, "LOCAL");
        return r2;
    }

    public l substitute(h1 h12) {
        i.e(h12, "substitutor");
        if (h12.h()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean x() {
        return this.o;
    }

    @Override
    public boolean z() {
        return this.n;
    }

    public static final class k.b0.x.b.x0.c.k1.o0$a
    extends o0 {
        public final e r;

        public k.b0.x.b.x0.c.k1.o0$a(k.b0.x.b.x0.c.a a2, e1 e12, int n2, h h2, k.b0.x.b.x0.g.e e2, f0 f02, boolean bl, boolean bl2, boolean bl3, f0 f03, u0 u02, k.x.b.a<? extends List<? extends f1>> a3) {
            i.e(a2, "containingDeclaration");
            i.e((Object)h2, "annotations");
            i.e(e2, "name");
            i.e((Object)f02, "outType");
            i.e((Object)u02, "source");
            i.e(a3, "destructuringVariables");
            super(a2, e12, n2, h2, e2, f02, bl, bl2, bl3, f03, u02);
            this.r = e.s.a.a.J2(a3);
        }

        @Override
        public e1 Q(k.b0.x.b.x0.c.a a2, k.b0.x.b.x0.g.e e2, int n2) {
            i.e(a2, "newOwner");
            i.e(e2, "newName");
            h h2 = this.getAnnotations();
            i.d((Object)h2, "annotations");
            f0 f02 = this.b();
            i.d((Object)f02, "type");
            boolean bl = this.M();
            boolean bl2 = this.n;
            boolean bl3 = this.o;
            f0 f03 = this.p;
            u0 u02 = u0.a;
            i.d((Object)u02, "NO_SOURCE");
            k.b0.x.b.x0.c.k1.o0$a a3 = new k.b0.x.b.x0.c.k1.o0$a(a2, null, n2, h2, e2, f02, bl, bl2, bl3, f03, u02, (k.x.b.a<? extends List<? extends f1>>)new k.x.b.a<List<? extends f1>>(this){
                public final /* synthetic */ k.b0.x.b.x0.c.k1.o0$a k;
                {
                    this.k = a2;
                    super(0);
                }

                public Object invoke() {
                    return (List)this.k.r.getValue();
                }
            });
            return a3;
        }
    }

}

