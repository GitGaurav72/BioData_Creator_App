/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.security.cert.Certificate
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Objects
 *  k.x.b.a
 *  k.x.c.k
 *  m.m0.m.c
 */
package m;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k.x.b.a;
import k.x.c.k;
import m.h;
import m.m0.m.c;

public final class i
extends k
implements a<List<? extends X509Certificate>> {
    public final /* synthetic */ h k;
    public final /* synthetic */ List l;
    public final /* synthetic */ String m;

    public i(h h2, List list, String string) {
        this.k = h2;
        this.l = list;
        this.m = string;
        super(0);
    }

    public Object invoke() {
        List list;
        c c2 = this.k.d;
        if (c2 == null || (list = c2.a(this.l, this.m)) == null) {
            list = this.l;
        }
        ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
        for (Certificate certificate : list) {
            Objects.requireNonNull((Object)certificate, (String)"null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((Object)((X509Certificate)certificate));
        }
        return arrayList;
    }
}

