/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.f$b
 *  k.b0.x.b.x0.c.m
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.y0
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.k1;

import java.util.List;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.f;
import k.b0.x.b.x0.c.m;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.y0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.x.b.l;
import k.x.c.i;

public abstract class f
extends k.b0.x.b.x0.c.k1.n
implements y0 {
    public final r k;
    public List<? extends z0> l;
    public final b m;

    public f(k k2, k.b0.x.b.x0.c.i1.h h2, e e2, u0 u02, r r2) {
        i.e((Object)k2, "containingDeclaration");
        i.e((Object)h2, "annotations");
        i.e(e2, "name");
        i.e((Object)u02, "sourceElement");
        i.e((Object)r2, "visibilityImpl");
        super(k2, h2, e2, u02);
        this.k = r2;
        this.m = new b(this);
    }

    public <R, D> R accept(m<R, D> m2, D d2) {
        i.e(m2, "visitor");
        return (R)m2.e((y0)this, d2);
    }

    @Override
    public List<z0> getDeclaredTypeParameters() {
        List<? extends z0> list = this.l;
        if (list != null) {
            return list;
        }
        i.m("declaredTypeParametersImpl");
        throw null;
    }

    @Override
    public k.b0.x.b.x0.m.y0 getTypeConstructor() {
        return this.m;
    }

    @Override
    public r getVisibility() {
        return this.k;
    }

    @Override
    public boolean isActual() {
        return false;
    }

    @Override
    public boolean isExpect() {
        return false;
    }

    @Override
    public boolean isExternal() {
        return false;
    }

    @Override
    public boolean isInner() {
        return j1.c((f0)((k.b0.x.b.x0.k.b.f0.m)this).C(), new l<m1, Boolean>(this){
            public final /* synthetic */ f k;
            {
                this.k = f2;
                super(1);
            }

            public Object invoke(Object object) {
                boolean bl;
                block3 : {
                    block2 : {
                        m1 m12 = (m1)object;
                        i.d((Object)m12, "type");
                        boolean bl2 = e.s.a.a.s2((f0)m12);
                        bl = true;
                        if (bl2) break block2;
                        f f2 = this.k;
                        h h2 = m12.T().getDeclarationDescriptor();
                        boolean bl3 = h2 instanceof z0 && !i.a((Object)((z0)h2).getContainingDeclaration(), f2) ? bl : false;
                        if (bl3) break block3;
                    }
                    bl = false;
                }
                return bl;
            }
        });
    }

    public y0 n() {
        return (y0)super.getOriginal();
    }

    public String toString() {
        return i.k("typealias ", this.getName().e());
    }
}

