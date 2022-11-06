/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 *  k.s.i
 *  k.x.b.a
 *  k.x.c.k
 */
package k.b0.x.b.x0.m.p1;

import java.util.Set;
import k.b0.x.b.x0.m.m0;
import k.s.i;
import k.x.b.a;
import k.x.c.k;

public final class s
extends k
implements a<String> {
    public final /* synthetic */ Set<m0> k;

    public s(Set<? extends m0> set) {
        this.k = set;
        super(0);
    }

    public Object invoke() {
        return k.x.c.i.k("This collections cannot be empty! input types: ", i.A(this.k, null, null, null, (int)0, null, null, (int)63));
    }
}

