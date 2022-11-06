/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.net.Proxy
 *  java.net.Proxy$Type
 */
package m.m0.g;

import java.net.Proxy;

public final class f {
    public static final /* synthetic */ int[] a;

    public static /* synthetic */ {
        int[] arrn = new int[Proxy.Type.values().length];
        a = arrn;
        arrn[Proxy.Type.DIRECT.ordinal()] = 1;
        arrn[Proxy.Type.HTTP.ordinal()] = 2;
    }
}

