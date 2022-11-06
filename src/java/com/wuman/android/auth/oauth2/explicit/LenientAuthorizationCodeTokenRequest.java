/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest
 *  com.google.api.client.auth.oauth2.TokenResponse
 *  com.wuman.android.auth.oauth2.explicit.LenientAuthorizationCodeTokenRequest$1
 *  com.wuman.android.auth.oauth2.explicit.LenientTokenResponseException
 *  e.p.b.a.a.b.l
 *  e.p.b.a.b.a
 *  e.p.b.a.b.c
 *  e.p.b.a.b.f
 *  e.p.b.a.b.h
 *  e.p.b.a.b.n
 *  e.p.b.a.c.c
 *  e.p.b.a.c.e
 *  e.p.b.a.d.t
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  java.util.logging.Logger
 */
package com.wuman.android.auth.oauth2.explicit;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.HttpTransport;
import com.wuman.android.auth.oauth2.explicit.HttpResponseUtils;
import com.wuman.android.auth.oauth2.explicit.LenientAuthorizationCodeTokenRequest;
import com.wuman.android.auth.oauth2.explicit.LenientTokenResponseException;
import e.p.b.a.a.b.l;
import e.p.b.a.b.a;
import e.p.b.a.b.c;
import e.p.b.a.b.f;
import e.p.b.a.b.h;
import e.p.b.a.b.n;
import e.p.b.a.c.e;
import e.p.b.a.d.t;
import java.io.Reader;
import java.io.StringReader;
import java.util.Objects;
import java.util.logging.Logger;

public class LenientAuthorizationCodeTokenRequest
extends AuthorizationCodeTokenRequest {
    public static final Logger LOGGER = Logger.getLogger((String)"OAuthAndroid");

    public LenientAuthorizationCodeTokenRequest(HttpTransport httpTransport, e.p.b.a.c.c c2, c c3, String string) {
        super(httpTransport, c2, c3, string);
    }

    public TokenResponse execute() {
        return this.executeLeniently();
    }

    public final TokenResponse executeLeniently() {
        HttpTransport httpTransport = this.getTransport();
        1 var2_2 = new 1(this);
        Objects.requireNonNull((Object)httpTransport);
        c c2 = this.getTokenServerUrl();
        n n2 = new n((Object)this);
        f f2 = new f(httpTransport, null);
        var2_2.initialize(f2);
        f2.d("POST");
        if (c2 != null) {
            f2.m = c2;
        }
        f2.j = n2;
        f2.q = new e(this.getJsonFactory());
        f2.s = false;
        h h2 = f2.b();
        if (h2.e()) {
            if (!HttpResponseUtils.hasMessageBody(h2)) {
                return null;
            }
            t t2 = h2.h.q;
            String string = HttpResponseUtils.parseAsStringWithoutClosing(h2);
            StringReader stringReader = new StringReader(string);
            if (!((TokenResponse)((e)t2).b((Reader)stringReader, TokenResponse.class)).containsKey((Object)"error")) {
                t t3 = h2.h.q;
                StringReader stringReader2 = new StringReader(string);
                return (TokenResponse)((e)t3).b((Reader)stringReader2, TokenResponse.class);
            }
            throw LenientTokenResponseException.from((e.p.b.a.c.c)this.getJsonFactory(), (h)h2, (String)string);
        }
        throw l.a((e.p.b.a.c.c)this.getJsonFactory(), (h)h2);
    }
}

