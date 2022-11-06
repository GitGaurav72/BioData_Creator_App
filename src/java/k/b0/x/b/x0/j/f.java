/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 *  java.util.Objects
 *  k.b0.x.b.x0.c.b$a
 *  k.b0.x.b.x0.c.f
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.q
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.u0
 */
package k.b0.x.b.x0.j;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.j;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.k1.i;
import k.b0.x.b.x0.c.q;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.j.g;

public class f
extends i {
    public static /* synthetic */ void $$$reportNull$$$0(int n2) {
        Object[] arrobject = new Object[]{n2 != 1 ? "containingClass" : "source", "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor", "<init>"};
        throw new IllegalArgumentException(String.format((String)"Argument for @NotNull parameter '%s' of %s.%s must not be null", (Object[])arrobject));
    }

    public f(e e2, u0 u02, boolean bl) {
        block14 : {
            block15 : {
                block18 : {
                    List list;
                    r r2;
                    block17 : {
                        block16 : {
                            if (e2 == null) break block14;
                            if (u02 == null) break block15;
                            Objects.requireNonNull((Object)h.g);
                            super(e2, null, h.a.b, true, b.a.k, u02);
                            list = Collections.emptyList();
                            k.b0.x.b.x0.c.f f2 = e2.getKind();
                            if (f2 == k.b0.x.b.x0.c.f.m || f2.b()) break block16;
                            if (g.v((k)e2)) {
                                if (bl) {
                                    r2 = q.c;
                                    if (r2 == null) {
                                        g.a(50);
                                        throw null;
                                    }
                                } else {
                                    r2 = q.a;
                                    if (r2 == null) {
                                        g.a(51);
                                        throw null;
                                    }
                                }
                            } else if (g.n((k)e2)) {
                                r2 = q.k;
                                if (r2 == null) {
                                    g.a(52);
                                    throw null;
                                }
                            } else {
                                r2 = q.e;
                                if (r2 == null) {
                                    g.a(53);
                                    throw null;
                                }
                            }
                            break block17;
                        }
                        r2 = q.a;
                        if (r2 == null) break block18;
                    }
                    this.q((List<e1>)list, r2);
                    return;
                }
                g.a(49);
                throw null;
            }
            f.$$$reportNull$$$0(1);
            throw null;
        }
        f.$$$reportNull$$$0(0);
        throw null;
    }
}

