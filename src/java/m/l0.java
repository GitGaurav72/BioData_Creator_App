/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package m;

import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l0
extends Enum<l0> {
    public static final /* enum */ l0 k;
    public static final /* enum */ l0 l;
    public static final /* enum */ l0 m;
    public static final /* enum */ l0 n;
    public static final /* enum */ l0 o;
    public static final /* synthetic */ l0[] p;
    public static final a q;
    public final String r;

    public static {
        l0 l02;
        l0 l03;
        l0 l04;
        l0 l05;
        l0 l06;
        l0[] arrl0 = new l0[5];
        k = l02 = new l0("TLSv1.3");
        arrl0[0] = l02;
        l = l06 = new l0("TLSv1.2");
        arrl0[1] = l06;
        m = l04 = new l0("TLSv1.1");
        arrl0[2] = l04;
        n = l05 = new l0("TLSv1");
        arrl0[3] = l05;
        o = l03 = new l0("SSLv3");
        arrl0[4] = l03;
        p = arrl0;
        q = new a(null);
    }

    public l0(String string2) {
        this.r = string2;
    }

    public static l0 valueOf(String string) {
        return (l0)Enum.valueOf(l0.class, (String)string);
    }

    public static l0[] values() {
        return (l0[])p.clone();
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final l0 a(String string) {
            block12 : {
                block10 : {
                    block11 : {
                        i.e(string, "javaName");
                        int n2 = string.hashCode();
                        if (n2 == 79201641) break block10;
                        if (n2 == 79923350) break block11;
                        switch (n2) {
                            default: {
                                break block12;
                            }
                            case -503070501: {
                                if (string.equals((Object)"TLSv1.3")) {
                                    return l0.k;
                                }
                                break block12;
                            }
                            case -503070502: {
                                if (string.equals((Object)"TLSv1.2")) {
                                    return l0.l;
                                }
                                break block12;
                            }
                            case -503070503: {
                                if (string.equals((Object)"TLSv1.1")) {
                                    return l0.m;
                                }
                                break block12;
                            }
                        }
                    }
                    if (string.equals((Object)"TLSv1")) {
                        return l0.n;
                    }
                    break block12;
                }
                if (string.equals((Object)"SSLv3")) {
                    return l0.o;
                }
            }
            throw new IllegalArgumentException(e.e.a.a.a.l((String)"Unexpected TLS version: ", (String)string));
        }
    }

}

