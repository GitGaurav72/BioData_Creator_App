/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.net.InetSocketAddress
 *  java.net.Proxy
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.NoSuchElementException
 *  k.s.r
 *  m.m0.g.n
 *  m.u
 *  m.z
 */
package m.m0.g;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import k.s.r;
import k.x.c.i;
import m.f;
import m.k0;
import m.m0.g.k;
import m.m0.g.n;
import m.u;
import m.z;

public final class m {
    public List<? extends Proxy> a;
    public int b;
    public List<? extends InetSocketAddress> c;
    public final List<k0> d;
    public final m.a e;
    public final k f;
    public final f g;
    public final u h;

    public m(m.a a2, k k2, f f2, u u2) {
        List list;
        r r2;
        i.e(a2, "address");
        i.e(k2, "routeDatabase");
        i.e(f2, "call");
        i.e((Object)u2, "eventListener");
        this.e = a2;
        this.f = k2;
        this.g = f2;
        this.h = u2;
        this.a = r2 = r.k;
        this.c = r2;
        this.d = new ArrayList();
        z z2 = a2.a;
        n n2 = new n(this, a2.j, z2);
        i.e(f2, "call");
        i.e((Object)z2, "url");
        this.a = list = n2.b();
        this.b = 0;
        i.e(f2, "call");
        i.e((Object)z2, "url");
        i.e((Object)list, "proxies");
    }

    public final boolean a() {
        boolean bl = this.b();
        boolean bl2 = true;
        if (!bl) {
            if (bl2 ^ this.d.isEmpty()) {
                return bl2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final boolean b() {
        return this.b < this.a.size();
    }

    public static final class a {
        public int a;
        public final List<k0> b;

        public a(List<k0> list) {
            i.e(list, "routes");
            this.b = list;
        }

        public final boolean a() {
            return this.a < this.b.size();
        }

        public final k0 b() {
            if (this.a()) {
                List<k0> list = this.b;
                int n2 = this.a;
                this.a = n2 + 1;
                return (k0)list.get(n2);
            }
            throw new NoSuchElementException();
        }
    }

}

