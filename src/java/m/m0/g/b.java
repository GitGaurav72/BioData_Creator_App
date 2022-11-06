/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.UnknownServiceException
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.List
 *  javax.net.ssl.SSLSocket
 *  m.n
 *  m.n$a
 */
package m.m0.g;

import e.e.a.a.a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k.x.c.i;
import m.k;
import m.m0.c;
import m.n;

public final class b {
    public int a;
    public boolean b;
    public boolean c;
    public final List<n> d;

    public b(List<n> list) {
        i.e(list, "connectionSpecs");
        this.d = list;
    }

    public final n a(SSLSocket sSLSocket) {
        n n2;
        block12 : {
            i.e((Object)sSLSocket, "sslSocket");
            int n3 = this.d.size();
            for (int i2 = this.a; i2 < n3; ++i2) {
                n2 = (n)this.d.get(i2);
                if (!n2.b(sSLSocket)) continue;
                this.a = i2 + 1;
                break block12;
            }
            n2 = null;
        }
        if (n2 != null) {
            Object[] arrobject;
            int n4;
            Object[] arrobject2;
            String[] arrstring;
            boolean bl;
            block14 : {
                boolean bl2;
                block13 : {
                    int n5 = this.d.size();
                    for (int i3 = this.a; i3 < n5; ++i3) {
                        if (!((n)this.d.get(i3)).b(sSLSocket)) continue;
                        bl2 = true;
                        break block13;
                    }
                    bl2 = false;
                }
                this.b = bl2;
                bl = this.c;
                i.e((Object)sSLSocket, "sslSocket");
                if (n2.g != null) {
                    String[] arrstring2 = sSLSocket.getEnabledCipherSuites();
                    i.d(arrstring2, "sslSocket.enabledCipherSuites");
                    String[] arrstring3 = n2.g;
                    arrobject2 = c.p(arrstring2, arrstring3, k.a);
                } else {
                    arrobject2 = sSLSocket.getEnabledCipherSuites();
                }
                if (n2.h != null) {
                    String[] arrstring4 = sSLSocket.getEnabledProtocols();
                    i.d(arrstring4, "sslSocket.enabledProtocols");
                    arrobject = c.p(arrstring4, n2.h, k.t.a.k);
                } else {
                    arrobject = sSLSocket.getEnabledProtocols();
                }
                arrstring = sSLSocket.getSupportedCipherSuites();
                i.d(arrstring, "supportedCipherSuites");
                Comparator<String> comparator = k.a;
                i.e(arrstring, "$this$indexOf");
                i.e("TLS_FALLBACK_SCSV", "value");
                i.e(comparator, "comparator");
                int n6 = arrstring.length;
                for (n4 = 0; n4 < n6; ++n4) {
                    String string = arrstring[n4];
                    boolean bl3 = (comparator).compare(string, "TLS_FALLBACK_SCSV") == 0;
                    if (!bl3) {
                        continue;
                    }
                    break block14;
                }
                n4 = -1;
            }
            if (bl && n4 != -1) {
                i.d(arrobject2, "cipherSuitesIntersection");
                String string = arrstring[n4];
                i.d(string, "supportedCipherSuites[indexOfFallbackScsv]");
                i.e(arrobject2, "$this$concat");
                i.e(string, "value");
                Object[] arrobject3 = Arrays.copyOf((Object[])arrobject2, (int)(1 + arrobject2.length));
                i.d(arrobject3, "java.util.Arrays.copyOf(this, newSize)");
                arrobject2 = (String[])arrobject3;
                arrobject2[e.s.a.a.H1((Object[])arrobject2)] = string;
            }
            n.a a2 = new n.a(n2);
            i.d(arrobject2, "cipherSuitesIntersection");
            a2.b((String[])Arrays.copyOf((Object[])arrobject2, (int)arrobject2.length));
            i.d(arrobject, "tlsVersionsIntersection");
            a2.e((String[])Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
            n n7 = a2.a();
            if (n7.c() != null) {
                sSLSocket.setEnabledProtocols(n7.h);
            }
            if (n7.a() != null) {
                sSLSocket.setEnabledCipherSuites(n7.g);
            }
            return n2;
        }
        StringBuilder stringBuilder = a.t((String)"Unable to find acceptable protocols. isFallback=");
        stringBuilder.append(this.c);
        stringBuilder.append(',');
        stringBuilder.append(" modes=");
        stringBuilder.append(this.d);
        stringBuilder.append(',');
        stringBuilder.append(" supported protocols=");
        Object[] arrobject = sSLSocket.getEnabledProtocols();
        i.c(arrobject);
        String string = Arrays.toString((Object[])arrobject);
        i.d(string, "java.util.Arrays.toString(this)");
        stringBuilder.append(string);
        throw new UnknownServiceException(stringBuilder.toString());
    }
}

