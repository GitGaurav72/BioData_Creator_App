/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package m;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d0
extends Enum<d0> {
    public static final /* enum */ d0 k;
    public static final /* enum */ d0 l;
    public static final /* enum */ d0 m;
    public static final /* enum */ d0 n;
    public static final /* enum */ d0 o;
    public static final /* enum */ d0 p;
    public static final /* synthetic */ d0[] q;
    public static final a r;
    public final String s;

    public static {
        d0 d02;
        d0 d03;
        d0 d04;
        d0 d05;
        d0 d06;
        d0 d07;
        d0[] arrd0 = new d0[6];
        k = d04 = new d0("http/1.0");
        arrd0[0] = d04;
        l = d03 = new d0("http/1.1");
        arrd0[1] = d03;
        m = d07 = new d0("spdy/3.1");
        arrd0[2] = d07;
        n = d02 = new d0("h2");
        arrd0[3] = d02;
        o = d05 = new d0("h2_prior_knowledge");
        arrd0[4] = d05;
        p = d06 = new d0("quic");
        arrd0[5] = d06;
        q = arrd0;
        r = new a(null);
    }

    public d0(String string2) {
        this.s = string2;
    }

    public static d0 valueOf(String string) {
        return (d0)Enum.valueOf(d0.class, (String)string);
    }

    public static d0[] values() {
        return (d0[])q.clone();
    }

    public String toString() {
        return this.s;
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

}

