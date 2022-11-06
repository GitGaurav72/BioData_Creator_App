/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Iterator
 *  k.x.b.a
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.s;

import java.util.Iterator;
import k.x.b.a;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "", "T", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class p
extends k
implements a<Iterator<? extends T>> {
    public final /* synthetic */ Iterable<T> k;

    public p(Iterable<? extends T> iterable) {
        this.k = iterable;
        super(0);
    }

    public Object invoke() {
        return this.k.iterator();
    }
}

