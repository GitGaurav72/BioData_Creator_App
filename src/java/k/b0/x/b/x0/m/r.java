/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.r1.e
 *  k.b0.x.b.x0.m.x0$a$b
 *  k.b0.x.b.x0.m.y0
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.m;

import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k1.n0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.m.c;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.j1;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p0;
import k.b0.x.b.x0.m.p1.f;
import k.b0.x.b.x0.m.p1.l;
import k.b0.x.b.x0.m.p1.n;
import k.b0.x.b.x0.m.q;
import k.b0.x.b.x0.m.r1.e;
import k.b0.x.b.x0.m.t;
import k.b0.x.b.x0.m.t0;
import k.b0.x.b.x0.m.x0;
import k.b0.x.b.x0.m.y0;
import k.b0.x.b.x0.m.z;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r
extends t
implements q,
e {
    public static final a l = new Object(null){

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public final r a(m1 var1_1, boolean var2_2) {
            block9 : {
                block8 : {
                    i.e((Object)var1_1, "type");
                    if (var1_1 instanceof r) {
                        return (r)var1_1;
                    }
                    var3_3 = var1_1.T() instanceof l || var1_1.T().getDeclarationDescriptor() instanceof z0 || var1_1 instanceof f || var1_1 instanceof t0;
                    if (var3_3) break block8;
                    var4_4 = false;
                    break block9;
                }
                if (var1_1 instanceof t0) ** GOTO lbl-1000
                var8_5 = var1_1.T().getDeclarationDescriptor();
                var9_6 = var8_5 instanceof n0 != false ? (n0)var8_5 : null;
                if (var9_6 == null) {
                    var10_7 = false;
                } else {
                    var12_8 = var9_6.s;
                    var10_7 = false;
                    if (!var12_8) {
                        var10_7 = true;
                    }
                }
                if (var10_7) {
                    var4_4 = true;
                } else if (var2_2 && var1_1.T().getDeclarationDescriptor() instanceof z0) lbl-1000: // 2 sources:
                {
                    var4_4 = j1.h((f0)var1_1);
                } else {
                    i.e((Object)var1_1, "type");
                    var11_9 = n.a;
                    i.e(var11_9, "this");
                    var4_4 = true ^ c.a(e.s.a.a.t0((boolean)false, (boolean)true, (k.b0.x.b.x0.m.p1.a)var11_9, null, null, (int)24), e.s.a.a.P2((f0)var1_1), (x0.a)x0.a.b.a);
                }
            }
            var5_10 = null;
            if (var4_4 == false) return var5_10;
            if (var1_1 instanceof z == false) return new r(e.s.a.a.P2((f0)var1_1), var2_2, null);
            var6_11 = (z)var1_1;
            i.a((Object)var6_11.l.T(), (Object)var6_11.m.T());
            return new r(e.s.a.a.P2((f0)var1_1), var2_2, null);
        }
    };
    public final m0 m;
    public final boolean n;

    public r(m0 m02, boolean bl) {
        this.m = m02;
        this.n = bl;
    }

    public r(m0 m02, boolean bl, DefaultConstructorMarker defaultConstructorMarker) {
        this.m = m02;
        this.n = bl;
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public m1 Z(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        return new r(this.m.b0(h2), this.n);
    }

    @Override
    public m0 a0(boolean bl) {
        if (bl) {
            return this.m.a0(bl);
        }
        return this;
    }

    @Override
    public m0 b0(k.b0.x.b.x0.c.i1.h h2) {
        i.e((Object)h2, "newAnnotations");
        return new r(this.m.b0(h2), this.n);
    }

    @Override
    public m0 c0() {
        return this.m;
    }

    @Override
    public t e0(m0 m02) {
        i.e(m02, "delegate");
        return new r(m02, this.n);
    }

    @Override
    public boolean n() {
        return this.m.T() instanceof l || this.m.T().getDeclarationDescriptor() instanceof z0;
        {
        }
    }

    @Override
    public f0 q(f0 f02) {
        i.e((Object)f02, "replacement");
        return p0.a(f02.W(), this.n);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.m);
        stringBuilder.append(" & Any");
        return stringBuilder.toString();
    }

}

