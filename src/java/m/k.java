/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Comparator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  k.d0.g
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package m;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import k.d0.g;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k {
    public static final Comparator<String> a;
    public static final Map<String, k> b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    public static final k l;
    public static final k m;
    public static final k n;
    public static final k o;
    public static final k p;
    public static final k q;
    public static final k r;
    public static final b s;
    public final String t;

    public static {
        b b2;
        s = b2 = new b(null);
        a = new Comparator<String>(){

            /*
             * Enabled aggressive block sorting
             */
            public int compare(Object object, Object object2) {
                int n2;
                String string = (String)object;
                String string2 = (String)object2;
                i.e(string, "a");
                i.e(string2, "b");
                int n3 = Math.min((int)string.length(), (int)string2.length());
                for (int i2 = 4; i2 < n3; ++i2) {
                    char c2;
                    char c3 = string.charAt(i2);
                    if (c3 == (c2 = string2.charAt(i2))) continue;
                    if (i.g(c3, c2) >= 0) return 1;
                    return -1;
                }
                int n4 = string.length();
                if (n4 == (n2 = string2.length())) {
                    return 0;
                }
                if (n4 < n2) return -1;
                return 1;
            }
        };
        b = new LinkedHashMap();
        b.a(b2, "SSL_RSA_WITH_NULL_MD5", 1);
        b.a(b2, "SSL_RSA_WITH_NULL_SHA", 2);
        b.a(b2, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        b.a(b2, "SSL_RSA_WITH_RC4_128_MD5", 4);
        b.a(b2, "SSL_RSA_WITH_RC4_128_SHA", 5);
        b.a(b2, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        b.a(b2, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        c = b.a(b2, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        b.a(b2, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        b.a(b2, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        b.a(b2, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        b.a(b2, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        b.a(b2, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        b.a(b2, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        b.a(b2, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        b.a(b2, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        b.a(b2, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        b.a(b2, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        b.a(b2, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        b.a(b2, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        b.a(b2, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        b.a(b2, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        b.a(b2, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        b.a(b2, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        b.a(b2, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        b.a(b2, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        b.a(b2, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        b.a(b2, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        b.a(b2, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        d = b.a(b2, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        b.a(b2, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        b.a(b2, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        b.a(b2, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        e = b.a(b2, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        b.a(b2, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        b.a(b2, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        b.a(b2, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        b.a(b2, "TLS_RSA_WITH_NULL_SHA256", 59);
        b.a(b2, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        b.a(b2, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        b.a(b2, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        b.a(b2, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        b.a(b2, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        b.a(b2, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        b.a(b2, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        b.a(b2, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        b.a(b2, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        b.a(b2, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        b.a(b2, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b.a(b2, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        b.a(b2, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        b.a(b2, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        b.a(b2, "TLS_PSK_WITH_RC4_128_SHA", 138);
        b.a(b2, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        b.a(b2, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        b.a(b2, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        b.a(b2, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f = b.a(b2, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        g = b.a(b2, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        b.a(b2, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        b.a(b2, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        b.a(b2, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        b.a(b2, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        b.a(b2, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        b.a(b2, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        b.a(b2, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        b.a(b2, "TLS_FALLBACK_SCSV", 22016);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        b.a(b2, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        b.a(b2, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        b.a(b2, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        b.a(b2, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        b.a(b2, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        b.a(b2, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        b.a(b2, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        b.a(b2, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        b.a(b2, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        b.a(b2, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        b.a(b2, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        b.a(b2, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        b.a(b2, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        h = b.a(b2, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        i = b.a(b2, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        b.a(b2, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        b.a(b2, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        b.a(b2, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        b.a(b2, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        b.a(b2, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        b.a(b2, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        b.a(b2, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        b.a(b2, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        b.a(b2, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        b.a(b2, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        b.a(b2, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        j = b.a(b2, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        k = b.a(b2, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        b.a(b2, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        l = b.a(b2, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        m = b.a(b2, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        b.a(b2, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        b.a(b2, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        b.a(b2, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        b.a(b2, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        n = b.a(b2, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        o = b.a(b2, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        b.a(b2, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        b.a(b2, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        p = b.a(b2, "TLS_AES_128_GCM_SHA256", 4865);
        q = b.a(b2, "TLS_AES_256_GCM_SHA384", 4866);
        r = b.a(b2, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        b.a(b2, "TLS_AES_128_CCM_SHA256", 4868);
        b.a(b2, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public k(String string, DefaultConstructorMarker defaultConstructorMarker) {
        this.t = string;
    }

    public String toString() {
        return this.t;
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final k a(b b2, String string, int n2) {
            k k2 = new k(string, null);
            k.b.put((Object)string, (Object)k2);
            return k2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final k b(String string) {
            b b2 = this;
            synchronized (b2) {
                i.e(string, "javaName");
                Map<String, k> map = k.b;
                k k2 = (k)map.get((Object)string);
                if (k2 == null) {
                    k2 = (k)map.get((Object)this.c(string));
                    if (k2 == null) {
                        k2 = new k(string, null);
                    }
                    map.put((Object)string, (Object)k2);
                }
                return k2;
            }
        }

        public final String c(String string) {
            if (g.E((String)string, (String)"TLS_", (boolean)false, (int)2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SSL_");
                String string2 = string.substring(4);
                i.d(string2, "(this as java.lang.String).substring(startIndex)");
                stringBuilder.append(string2);
                return stringBuilder.toString();
            }
            if (g.E((String)string, (String)"SSL_", (boolean)false, (int)2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("TLS_");
                String string3 = string.substring(4);
                i.d(string3, "(this as java.lang.String).substring(startIndex)");
                stringBuilder.append(string3);
                string = stringBuilder.toString();
            }
            return string;
        }
    }

}

