/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.net.Proxy
 *  java.net.ProxySelector
 *  java.net.URI
 *  java.util.List
 *  k.x.b.a
 *  k.x.c.k
 *  m.z
 */
package m.m0.g;

import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;
import k.x.c.k;
import m.a;
import m.m0.c;
import m.m0.g.m;
import m.z;

public final class n
extends k
implements k.x.b.a<List<? extends Proxy>> {
    public final /* synthetic */ m k;
    public final /* synthetic */ Proxy l;
    public final /* synthetic */ z m;

    public n(m m2, Proxy proxy, z z2) {
        this.k = m2;
        this.l = proxy;
        this.m = z2;
        super(0);
    }

    public final List<Proxy> b() {
        Proxy proxy = this.l;
        if (proxy != null) {
            return e.s.a.a.N2((Object)proxy);
        }
        URI uRI = this.m.j();
        if (uRI.getHost() == null) {
            Proxy[] arrproxy = new Proxy[]{Proxy.NO_PROXY};
            return c.l(arrproxy);
        }
        List list = this.k.e.k.select(uRI);
        boolean bl = list == null || list.isEmpty();
        if (bl) {
            Proxy[] arrproxy = new Proxy[]{Proxy.NO_PROXY};
            return c.l(arrproxy);
        }
        return c.z(list);
    }
}

