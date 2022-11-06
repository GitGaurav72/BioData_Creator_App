/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.InetSocketAddress
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  javax.net.ssl.SSLSocketFactory
 */
package m;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.net.ssl.SSLSocketFactory;
import k.x.c.i;
import m.a;

public final class k0 {
    public final a a;
    public final Proxy b;
    public final InetSocketAddress c;

    public k0(a a2, Proxy proxy, InetSocketAddress inetSocketAddress) {
        i.e(a2, "address");
        i.e((Object)proxy, "proxy");
        i.e((Object)inetSocketAddress, "socketAddress");
        this.a = a2;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.f != null && this.b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object object) {
        if (object instanceof k0) {
            k0 k02 = (k0)object;
            if (i.a(k02.a, this.a) && i.a((Object)k02.b, (Object)this.b) && i.a((Object)k02.c, (Object)this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * (31 * (527 + this.a.hashCode()) + this.b.hashCode()) + this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Route{");
        stringBuilder.append((Object)this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

