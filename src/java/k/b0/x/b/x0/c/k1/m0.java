/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  k.b0.f
 *  k.b0.k
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.k1.m0$a
 *  k.b0.x.b.x0.c.n
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.c.v$a
 *  k.b0.x.b.x0.l.j
 *  k.b0.x.b.x0.m.f0
 *  k.x.b.a
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.c.k1;

import java.util.Objects;
import k.b0.f;
import k.b0.k;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.d;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.i;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.j;
import k.b0.x.b.x0.c.k1.l0;
import k.b0.x.b.x0.c.k1.m0;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.n;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.c.y0;
import k.b0.x.b.x0.g.g;
import k.b0.x.b.x0.l.m;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.h1;
import k.x.c.q;
import k.x.c.w;
import kotlin.jvm.internal.DefaultConstructorMarker;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis.
 */
public final class m0
extends k.b0.x.b.x0.c.k1.r
implements l0 {
    public static final a k;
    public static final /* synthetic */ k<Object>[] l;
    public final m m;
    public final y0 n;
    public d o;

    public static {
        k[] arrk = new k[]{w.c(new q((f)w.a(m0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
        l = arrk;
        k = new /* Unavailable Anonymous Inner Class!! */;
    }

    public m0(m m2, y0 y02, d d2, l0 l02, h h2, b.a a2, u0 u02) {
        super((k.b0.x.b.x0.c.k)y02, l02, h2, g.f, a2, u02);
        this.m = m2;
        this.n = y02;
        this.setActual(y02.isActual());
        m2.f(new k.x.b.a<m0>(this, d2){
            public final /* synthetic */ m0 k;
            public final /* synthetic */ d l;
            {
                this.k = m02;
                this.l = d2;
                super(0);
            }

            public Object invoke() {
                m0 m02 = this.k;
                m m2 = m02.m;
                y0 y02 = m02.n;
                d d2 = this.l;
                h h2 = d2.getAnnotations();
                b.a a2 = this.l.getKind();
                k.x.c.i.d((Object)a2, "underlyingConstructorDescriptor.kind");
                u0 u02 = this.k.n.getSource();
                k.x.c.i.d((Object)u02, "typeAliasDescriptor.source");
                m0 m03 = new m0(m2, y02, d2, m02, h2, a2, u02);
                m0 m04 = this.k;
                d d3 = this.l;
                a a3 = m0.k;
                y0 y03 = m04.n;
                Objects.requireNonNull((Object)a3);
                h1 h12 = y03.f() == null ? null : h1.d((f0)y03.v());
                if (h12 == null) {
                    return null;
                }
                k.b0.x.b.x0.c.q0 q02 = d3.getDispatchReceiverParameter();
                k.b0.x.b.x0.c.q0 q03 = q02 == null ? null : q02.substitute(h12);
                m03.initialize(null, q03, m04.n.getDeclaredTypeParameters(), m04.getValueParameters(), m04.getReturnType(), b0.l, m04.n.getVisibility());
                return m03;
            }
        });
        this.o = d2;
    }

    @Override
    public d I() {
        return this.o;
    }

    @Override
    public k.b0.x.b.x0.c.k1.r createSubstitutedCopy(k.b0.x.b.x0.c.k k2, v v2, b.a a2, k.b0.x.b.x0.g.e e2, h h2, u0 u02) {
        k.x.c.i.e((Object)k2, "newOwner");
        k.x.c.i.e((Object)a2, "kind");
        k.x.c.i.e((Object)h2, "annotations");
        k.x.c.i.e((Object)u02, "source");
        b.a a3 = b.a.k;
        m0 m02 = new m0(this.m, this.n, this.o, this, h2, a3, u02);
        return m02;
    }

    @Override
    public i getContainingDeclaration() {
        return this.n;
    }

    @Override
    public k.b0.x.b.x0.c.k getContainingDeclaration() {
        return this.n;
    }

    @Override
    public f0 getReturnType() {
        f0 f02 = super.getReturnType();
        k.x.c.i.c((Object)f02);
        k.x.c.i.d((Object)f02, "super.getReturnType()!!");
        return f02;
    }

    @Override
    public boolean j() {
        return this.o.j();
    }

    @Override
    public e k() {
        e e2 = this.o.k();
        k.x.c.i.d(e2, "underlyingConstructorDescriptor.constructedClass");
        return e2;
    }

    public l0 n(k.b0.x.b.x0.c.k k2, b0 b02, r r2, b.a a2, boolean bl) {
        k.x.c.i.e((Object)k2, "newOwner");
        k.x.c.i.e((Object)b02, "modality");
        k.x.c.i.e((Object)r2, "visibility");
        k.x.c.i.e((Object)a2, "kind");
        v v2 = this.newCopyBuilder().o(k2).c(b02).n(r2).q(a2).i(bl).build();
        Objects.requireNonNull((Object)v2, (String)"null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (l0)v2;
    }

    public l0 o() {
        return (l0)super.getOriginal();
    }

    public l0 q(h1 h12) {
        k.x.c.i.e(h12, "substitutor");
        l l2 = super.substitute(h12);
        Objects.requireNonNull((Object)l2, (String)"null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        m0 m02 = (m0)l2;
        h1 h13 = h1.d(m02.getReturnType());
        k.x.c.i.d(h13, "create(substitutedTypeAliasConstructor.returnType)");
        d d2 = this.o.getOriginal().substitute(h13);
        if (d2 == null) {
            return null;
        }
        m02.o = d2;
        return m02;
    }
}

