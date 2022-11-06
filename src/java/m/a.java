/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.Proxy
 *  java.net.ProxySelector
 *  java.util.List
 *  java.util.Objects
 *  javax.net.SocketFactory
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSocketFactory
 *  k.d0.g
 *  m.n
 *  m.t
 *  m.z
 *  m.z$a
 *  m.z$b
 */
package m;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k.d0.g;
import k.x.c.i;
import m.c;
import m.d0;
import m.h;
import m.n;
import m.t;
import m.z;

public final class a {
    public final z a;
    public final List<d0> b;
    public final List<n> c;
    public final t d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final h h;
    public final c i;
    public final Proxy j;
    public final ProxySelector k;

    public a(String string, int n2, t t2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h h2, c c2, Proxy proxy, List<? extends d0> list, List<n> list2, ProxySelector proxySelector) {
        String string2;
        block8 : {
            int n3;
            z.a a2;
            String string3;
            block7 : {
                block6 : {
                    i.e(string, "uriHost");
                    i.e((Object)t2, "dns");
                    i.e((Object)socketFactory, "socketFactory");
                    i.e(c2, "proxyAuthenticator");
                    i.e(list, "protocols");
                    i.e(list2, "connectionSpecs");
                    i.e((Object)proxySelector, "proxySelector");
                    this.d = t2;
                    this.e = socketFactory;
                    this.f = sSLSocketFactory;
                    this.g = hostnameVerifier;
                    this.h = h2;
                    this.i = c2;
                    this.j = null;
                    this.k = proxySelector;
                    a2 = new z.a();
                    string3 = "https";
                    string2 = sSLSocketFactory != null ? string3 : "http";
                    i.e(string2, "scheme");
                    n3 = 1;
                    if (!g.f((String)string2, (String)"http", (boolean)n3)) break block6;
                    string3 = "http";
                    break block7;
                }
                if (!g.f((String)string2, (String)string3, (boolean)n3)) break block8;
            }
            a2.b = string3;
            i.e(string, "host");
            String string4 = e.s.a.a.f4((String)z.b.d((z.b)z.b, (String)string, (int)0, (int)0, (boolean)false, (int)7));
            if (string4 != null) {
                a2.e = string4;
                if (n3 > n2 || 65535 < n2) {
                    n3 = 0;
                }
                if (n3 != 0) {
                    a2.f = n2;
                    this.a = a2.d();
                    this.b = m.m0.c.z(list);
                    this.c = m.m0.c.z(list2);
                    return;
                }
                throw new IllegalArgumentException(e.e.a.a.a.f((String)"unexpected port: ", (int)n2).toString());
            }
            throw new IllegalArgumentException(e.e.a.a.a.l((String)"unexpected host: ", (String)string));
        }
        throw new IllegalArgumentException(e.e.a.a.a.l((String)"unexpected scheme: ", (String)string2));
    }

    public final boolean a(a a2) {
        i.e(a2, "that");
        return i.a((Object)this.d, (Object)a2.d) && i.a(this.i, a2.i) && i.a(this.b, a2.b) && i.a(this.c, a2.c) && i.a((Object)this.k, (Object)a2.k) && i.a((Object)this.j, (Object)a2.j) && i.a((Object)this.f, (Object)a2.f) && i.a((Object)this.g, (Object)a2.g) && i.a(this.h, a2.h) && this.a.h == a2.a.h;
    }

    public boolean equals(Object object) {
        if (object instanceof a) {
            z z2 = this.a;
            a a2 = (a)object;
            if (i.a((Object)z2, (Object)a2.a) && this.a(a2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (527 + this.a.hashCode()) + this.d.hashCode()) + this.i.hashCode()) + this.b.hashCode()) + this.c.hashCode()) + this.k.hashCode()) + Objects.hashCode((Object)this.j)) + Objects.hashCode((Object)this.f)) + Objects.hashCode((Object)this.g)) + Objects.hashCode((Object)this.h);
    }

    public String toString() {
        StringBuilder stringBuilder;
        Proxy proxy;
        StringBuilder stringBuilder2 = e.e.a.a.a.t((String)"Address{");
        stringBuilder2.append(this.a.g);
        stringBuilder2.append(':');
        stringBuilder2.append(this.a.h);
        stringBuilder2.append(", ");
        if (this.j != null) {
            stringBuilder = e.e.a.a.a.t((String)"proxy=");
            proxy = this.j;
        } else {
            stringBuilder = e.e.a.a.a.t((String)"proxySelector=");
            proxy = this.k;
        }
        stringBuilder.append((Object)proxy);
        stringBuilder2.append(stringBuilder.toString());
        stringBuilder2.append("}");
        return stringBuilder2.toString();
    }
}

