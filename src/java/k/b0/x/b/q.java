/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.s0
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.n0
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b;

import k.b0.x.b.s0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.x0.i.c;
import k.x.b.l;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class q
extends k.x.c.k
implements l<n0, CharSequence> {
    public static final q k = new q();

    public q() {
        super(1);
    }

    public Object invoke(Object object) {
        n0 n02 = (n0)object;
        i.e((Object)n02, "descriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c.b.p((k)n02));
        stringBuilder.append(" | ");
        stringBuilder.append(s0.c((n0)n02).a());
        return stringBuilder.toString();
    }
}

