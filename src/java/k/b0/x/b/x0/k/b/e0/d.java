/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URL
 *  java.net.URLConnection
 */
package k.b0.x.b.x0.k.b.e0;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import k.x.c.i;

public final class d {
    public final InputStream a(String string) {
        i.e(string, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream((String)string);
        }
        URL uRL = classLoader.getResource(string);
        if (uRL == null) {
            return null;
        }
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.setUseCaches(false);
        return uRLConnection.getInputStream();
    }
}

