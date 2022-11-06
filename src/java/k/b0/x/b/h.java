/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.k0
 *  k.x.b.a
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b;

import java.util.List;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.k0;
import k.x.b.a;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "R", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class h
extends k
implements a<k0> {
    public final /* synthetic */ b k;
    public final /* synthetic */ int l;

    public h(b b2, int n2) {
        this.k = b2;
        this.l = n2;
        super(0);
    }

    public Object invoke() {
        Object object = this.k.getValueParameters().get(this.l);
        i.d(object, "descriptor.valueParameters[i]");
        return (k0)object;
    }
}

