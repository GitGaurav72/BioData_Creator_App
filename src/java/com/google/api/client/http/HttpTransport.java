/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.b.a.b.k
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.logging.Logger
 */
package com.google.api.client.http;

import e.p.b.a.b.k;
import java.util.Arrays;
import java.util.logging.Logger;

public abstract class HttpTransport {
    public static final Logger a = Logger.getLogger((String)HttpTransport.class.getName());
    public static final String[] b;

    public static {
        Object[] arrobject = new String[]{"DELETE", "GET", "POST", "PUT"};
        b = arrobject;
        Arrays.sort((Object[])arrobject);
    }

    public abstract k a(String var1, String var2);
}

