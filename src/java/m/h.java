/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.Principal
 *  java.security.PublicKey
 *  java.security.cert.Certificate
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  java.util.Set
 *  javax.net.ssl.SSLPeerUnverifiedException
 *  k.d0.g
 *  k.s.i
 *  k.s.r
 *  k.x.b.a
 *  k.x.c.b0.b
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  m.m0.m.c
 *  n.h
 *  n.h$a
 */
package m;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.d0.g;
import k.s.r;
import k.x.c.a0;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.m0.m.c;
import n.h;

public final class h {
    public static final h a;
    public static final a b;
    public final Set<b> c;
    public final c d;

    public static {
        b = new a(null);
        a = new h(k.s.i.j0((Iterable)new ArrayList()), null, 2);
    }

    public h(Set<b> set, c c2) {
        i.e(set, "pins");
        this.c = set;
        this.d = c2;
    }

    public h(Set set, c c2, int n2) {
        n2 & 2;
        i.e((Object)set, "pins");
        this.c = set;
        this.d = null;
    }

    public final void a(String string, k.x.b.a<? extends List<? extends X509Certificate>> a2) {
        i.e(string, "hostname");
        i.e(a2, "cleanedPeerCertificatesFn");
        i.e(string, "hostname");
        Set<b> set = this.c;
        r r2 = r.k;
        for (Object object : set) {
            Objects.requireNonNull((Object)((b)object));
            i.e(string, "hostname");
            if (!g.E(null, (String)"**.", (boolean)false, (int)2)) {
                if (!g.E(null, (String)"*.", (boolean)false, (int)2)) {
                    if (!i.a(string, null)) continue;
                    if (r2.isEmpty()) {
                        r2 = new ArrayList();
                    }
                    if (r2 instanceof k.x.c.b0.a && !(r2 instanceof k.x.c.b0.b)) {
                        a0.c((Object)r2, "kotlin.collections.MutableList");
                        throw null;
                    }
                    r2.add(object);
                    continue;
                }
                throw null;
            }
            throw null;
        }
        if (r2.isEmpty()) {
            return;
        }
        List list = (List)a2.invoke();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            (X509Certificate)iterator.next();
            Iterator iterator2 = r2.iterator();
            if (!iterator2.hasNext()) continue;
            Objects.requireNonNull((Object)((b)iterator2.next()));
            throw null;
        }
        StringBuilder stringBuilder = e.e.a.a.a.x((String)"Certificate pinning failure!", (String)"\n  Peer certificate chain:");
        for (X509Certificate x509Certificate : list) {
            stringBuilder.append("\n    ");
            i.e((Object)x509Certificate, "certificate");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("sha256/");
            i.e((Object)x509Certificate, "$this$sha256Hash");
            h.a a3 = n.h.l;
            PublicKey publicKey = x509Certificate.getPublicKey();
            i.d((Object)publicKey, "publicKey");
            byte[] arrby = publicKey.getEncoded();
            i.d(arrby, "publicKey.encoded");
            stringBuilder2.append(h.a.c((h.a)a3, (byte[])arrby, (int)0, (int)0, (int)3).h("SHA-256").b());
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder.append(": ");
            Principal principal = x509Certificate.getSubjectDN();
            i.d((Object)principal, "element.subjectDN");
            stringBuilder.append(principal.getName());
        }
        stringBuilder.append("\n  Pinned certificates for ");
        stringBuilder.append(string);
        stringBuilder.append(":");
        for (b b2 : r2) {
            stringBuilder.append("\n    ");
            stringBuilder.append((Object)b2);
        }
        String string2 = stringBuilder.toString();
        i.d(string2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string2);
    }

    public final h b(c c2) {
        i.e((Object)c2, "certificateChainCleaner");
        if (i.a((Object)this.d, (Object)c2)) {
            return this;
        }
        return new h(this.c, c2);
    }

    public boolean equals(Object object) {
        if (object instanceof h) {
            h h2 = (h)object;
            if (i.a(h2.c, this.c) && i.a((Object)h2.d, (Object)this.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n2 = 41 * (1517 + this.c.hashCode());
        c c2 = this.d;
        int n3 = c2 != null ? c2.hashCode() : 0;
        return n2 + n3;
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final String a(Certificate certificate) {
            i.e((Object)certificate, "certificate");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sha256/");
            stringBuilder.append(this.b((X509Certificate)certificate).b());
            return stringBuilder.toString();
        }

        public final n.h b(X509Certificate x509Certificate) {
            i.e((Object)x509Certificate, "$this$sha256Hash");
            h.a a2 = n.h.l;
            PublicKey publicKey = x509Certificate.getPublicKey();
            i.d((Object)publicKey, "publicKey");
            byte[] arrby = publicKey.getEncoded();
            i.d(arrby, "publicKey.encoded");
            return h.a.c((h.a)a2, (byte[])arrby, (int)0, (int)0, (int)3).h("SHA-256");
        }
    }

    public static final class b {
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            b b2 = (b)object;
            Objects.requireNonNull((Object)b2);
            if (true ^ i.a(null, null)) {
                return false;
            }
            Objects.requireNonNull((Object)b2);
            if (true ^ i.a(null, null)) {
                return false;
            }
            Objects.requireNonNull((Object)b2);
            return !(true ^ i.a(null, null));
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(null);
            stringBuilder.append('/');
            throw null;
        }
    }

}

