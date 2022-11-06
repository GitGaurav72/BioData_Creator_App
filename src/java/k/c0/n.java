/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.c0;

import java.util.Iterator;
import k.c0.h;
import k.x.b.l;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class n
extends k
implements l<h<? extends T>, Iterator<? extends T>> {
    public static final n k = new n();

    public n() {
        super(1);
    }

    public Object invoke(Object object) {
        h h2 = (h)object;
        i.e(h2, "it");
        return h2.iterator();
    }
}

