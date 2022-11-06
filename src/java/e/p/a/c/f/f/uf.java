/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  com.google.android.gms.common.api.Status
 *  e.p.a.c.c.n.a
 *  java.lang.Object
 *  java.lang.String
 *  java.net.HttpURLConnection
 *  java.net.URL
 */
package e.p.a.c.f.f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import e.p.a.c.c.n.a;
import java.net.HttpURLConnection;
import java.net.URL;

public interface uf {
    public static final a e = new a("FirebaseAuth", new String[]{"GetAuthDomainTaskResponseHandler"});

    public Context a();

    public Uri.Builder b(Intent var1, String var2, String var3);

    public String c(String var1);

    public HttpURLConnection d(URL var1);

    public void e(Uri var1, String var2);

    public void f(String var1, Status var2);
}

