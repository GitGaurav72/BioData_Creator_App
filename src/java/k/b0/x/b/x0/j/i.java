/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.c.a
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.f1
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n0
 *  k.b0.x.b.x0.c.o0
 *  k.b0.x.b.x0.c.q0
 *  k.b0.x.b.x0.c.w
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.y0
 */
package k.b0.x.b.x0.j;

import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.f1;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.c.o0;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.w;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.y0;

public final class i {
    public static final /* synthetic */ int a;

    public static {
        new c("kotlin.jvm.JvmInline");
    }

    public static final boolean a(a a2) {
        k.x.c.i.e((Object)a2, "<this>");
        if (a2 instanceof o0) {
            n0 n02 = ((o0)a2).O();
            k.x.c.i.d((Object)n02, "correspondingProperty");
            if (i.d((f1)n02)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(k k2) {
        e e2;
        k.x.c.i.e((Object)k2, "<this>");
        return k2 instanceof e && ((e2 = (e)k2).isInline() || e2.isValue());
    }

    public static final boolean c(f0 f02) {
        k.x.c.i.e((Object)f02, "<this>");
        h h2 = f02.T().getDeclarationDescriptor();
        if (h2 == null) {
            return false;
        }
        return i.b((k)h2);
    }

    public static final boolean d(f1 f12) {
        k.b0.x.b.x0.g.e e2;
        w w2;
        e e3;
        k k2;
        k.x.c.i.e((Object)f12, "<this>");
        return f12.getExtensionReceiverParameter() == null && k.x.c.i.a(e2 = (e3 = (k2 = f12.getContainingDeclaration()) instanceof e ? (e)k2 : null) == null ? null : ((w2 = e3.getInlineClassRepresentation()) == null ? null : w2.a), f12.getName());
    }
}

