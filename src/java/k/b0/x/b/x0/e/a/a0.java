/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  k.b0.x.b.x0.e.a.b0
 *  k.b0.x.b.x0.e.a.h0
 *  k.x.b.a
 *  k.x.c.k
 */
package k.b0.x.b.x0.e.a;

import e.e.a.a.a;
import java.util.Map;
import java.util.Set;
import k.b0.x.b.x0.e.a.b0;
import k.b0.x.b.x0.e.a.h0;
import k.x.c.i;
import k.x.c.k;

public final class a0
extends k
implements k.x.b.a<String[]> {
    public final /* synthetic */ b0 k;

    public a0(b0 b02) {
        this.k = b02;
        super(0);
    }

    public Object invoke() {
        b0 b02 = this.k;
        k.s.b0.a<String> a2 = new k.s.b0.a<String>();
        a2.add(b02.a.o);
        h0 h02 = b02.b;
        if (h02 != null) {
            a2.add(i.k("under-migration:", h02.o));
        }
        for (Map.Entry entry : b02.c.entrySet()) {
            StringBuilder stringBuilder = a.s((char)'@');
            stringBuilder.append(entry.getKey());
            stringBuilder.append(':');
            stringBuilder.append(((h0)entry.getValue()).o);
            a2.add(stringBuilder.toString());
        }
        i.e(a2, "builder");
        if (a2.o == null) {
            a2.I();
            a2.n = true;
            return a2.toArray(new String[0]);
        }
        throw new IllegalStateException();
    }
}

