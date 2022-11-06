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
 *  m.m0.g.i
 *  m.x
 */
package m.m0.g;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k.x.b.a;
import k.x.c.k;
import m.m0.g.i;
import m.x;

public final class h
extends k
implements a<List<? extends X509Certificate>> {
    public final /* synthetic */ i k;

    public h(i i2) {
        this.k = i2;
        super(0);
    }

    public Object invoke() {
        x x2 = this.k.d;
        k.x.c.i.c((Object)x2);
        List list = x2.c();
        ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
        for (Certificate certificate : list) {
            Objects.requireNonNull((Object)certificate, (String)"null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((Object)((X509Certificate)certificate));
        }
        return arrayList;
    }
}

