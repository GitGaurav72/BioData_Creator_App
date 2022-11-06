/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.b.a.b.f
 *  e.p.b.a.b.h
 *  e.p.b.a.d.l
 *  java.io.ByteArrayOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package com.wuman.android.auth.oauth2.explicit;

import e.p.b.a.b.f;
import e.p.b.a.b.h;
import e.p.b.a.d.l;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class HttpResponseUtils {
    public static boolean hasMessageBody(h h2) {
        int n = h2.f;
        if (!h2.h.l.equals((Object)"HEAD") && n / 100 != 1 && n != 204 && n != 304) {
            return true;
        }
        h2.d();
        return false;
    }

    public static String parseAsStringWithoutClosing(h h2) {
        InputStream inputStream = h2.b();
        if (inputStream == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l.a((InputStream)inputStream, (OutputStream)byteArrayOutputStream, (boolean)false);
        return byteArrayOutputStream.toString(h2.c().name());
    }
}

