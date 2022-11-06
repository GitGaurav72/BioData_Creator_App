/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Objects
 *  k.d0.g
 *  k.s.i
 *  k.s.s
 *  m.y
 *  m.y$a
 *  m.y$b
 *  m.z
 *  m.z$a
 */
package m;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import k.d0.g;
import k.i;
import k.s.s;
import m.e;
import m.g0;
import m.m0.h.f;
import m.y;
import m.z;

public final class e0 {
    public e a;
    public final z b;
    public final String c;
    public final y d;
    public final g0 e;
    public final Map<Class<?>, Object> f;

    public e0(z z2, String string, y y2, g0 g02, Map<Class<?>, ? extends Object> map) {
        k.x.c.i.e((Object)z2, "url");
        k.x.c.i.e(string, "method");
        k.x.c.i.e((Object)y2, "headers");
        k.x.c.i.e(map, "tags");
        this.b = z2;
        this.c = string;
        this.d = y2;
        this.e = g02;
        this.f = map;
    }

    public final e a() {
        e e2 = this.a;
        if (e2 == null) {
            this.a = e2 = e.a.b(this.d);
        }
        return e2;
    }

    public final String b(String string) {
        k.x.c.i.e(string, "name");
        return this.d.h(string);
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Request{method=");
        stringBuilder.append(this.c);
        stringBuilder.append(", url=");
        stringBuilder.append((Object)this.b);
        if (this.d.size() != 0) {
            stringBuilder.append(", headers=[");
            y y2 = this.d;
            int n2 = 0;
            for (Object object : y2) {
                int n3 = n2 + 1;
                if (n2 >= 0) {
                    i i2 = (i)object;
                    String string = (String)i2.k;
                    String string2 = (String)i2.l;
                    if (n2 > 0) {
                        stringBuilder.append(", ");
                    }
                    e.e.a.a.a.C((StringBuilder)stringBuilder, (String)string, (char)':', (String)string2);
                    n2 = n3;
                    continue;
                }
                k.s.i.X();
                throw null;
            }
            stringBuilder.append(']');
        }
        if (true ^ this.f.isEmpty()) {
            stringBuilder.append(", tags=");
            stringBuilder.append(this.f);
        }
        stringBuilder.append('}');
        String string = stringBuilder.toString();
        k.x.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static class a {
        public z a;
        public String b;
        public y.a c;
        public g0 d;
        public Map<Class<?>, Object> e;

        public a() {
            this.e = new LinkedHashMap();
            this.b = "GET";
            this.c = new y.a();
        }

        public a(e0 e02) {
            k.x.c.i.e(e02, "request");
            this.e = new LinkedHashMap();
            this.a = e02.b;
            this.b = e02.c;
            this.d = e02.e;
            Object object = e02.f.isEmpty() ? new LinkedHashMap() : k.s.i.h0(e02.f);
            this.e = object;
            this.c = e02.d.l();
        }

        public a a(String string, String string2) {
            k.x.c.i.e(string, "name");
            k.x.c.i.e(string2, "value");
            y.a a2 = this.c;
            Objects.requireNonNull((Object)a2);
            k.x.c.i.e(string, "name");
            k.x.c.i.e(string2, "value");
            y.b b2 = y.k;
            b2.a(string);
            b2.b(string2, string);
            a2.a(string, string2);
            return this;
        }

        public e0 b() {
            z z2 = this.a;
            if (z2 != null) {
                s s2;
                String string = this.b;
                y y2 = this.c.b();
                g0 g02 = this.d;
                Map<Class<?>, Object> map = this.e;
                k.x.c.i.e(map, "$this$toImmutableMap");
                if (map.isEmpty()) {
                    s2 = s.k;
                } else {
                    s2 = Collections.unmodifiableMap((Map)new LinkedHashMap(map));
                    k.x.c.i.d((Object)s2, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                s s3 = s2;
                e0 e02 = new e0(z2, string, y2, g02, (Map<Class<?>, ? extends Object>)s3);
                return e02;
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c(String string, String string2) {
            k.x.c.i.e(string, "name");
            k.x.c.i.e(string2, "value");
            y.a a2 = this.c;
            Objects.requireNonNull((Object)a2);
            k.x.c.i.e(string, "name");
            k.x.c.i.e(string2, "value");
            y.b b2 = y.k;
            b2.a(string);
            b2.b(string2, string);
            a2.c(string);
            a2.a(string, string2);
            return this;
        }

        public a d(String string, g0 g02) {
            block6 : {
                block9 : {
                    block8 : {
                        block7 : {
                            k.x.c.i.e(string, "method");
                            int n2 = string.length();
                            boolean bl = true;
                            boolean bl2 = n2 > 0 ? bl : false;
                            if (!bl2) break block6;
                            if (g02 != null) break block7;
                            k.x.c.i.e(string, "method");
                            if (!(k.x.c.i.a(string, "POST") || k.x.c.i.a(string, "PUT") || k.x.c.i.a(string, "PATCH") || k.x.c.i.a(string, "PROPPATCH") || k.x.c.i.a(string, "REPORT"))) {
                                bl = false;
                            }
                            if (!(bl ^ true)) {
                                throw new IllegalArgumentException(e.e.a.a.a.m((String)"method ", (String)string, (String)" must have a request body.").toString());
                            }
                            break block8;
                        }
                        if (!f.a(string)) break block9;
                    }
                    this.b = string;
                    this.d = g02;
                    return this;
                }
                throw new IllegalArgumentException(e.e.a.a.a.m((String)"method ", (String)string, (String)" must not have a request body.").toString());
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a e(g0 g02) {
            k.x.c.i.e(g02, "body");
            this.d("POST", g02);
            return this;
        }

        public a f(g0 g02) {
            k.x.c.i.e(g02, "body");
            this.d("PUT", g02);
            return this;
        }

        public a g(String string) {
            k.x.c.i.e(string, "name");
            this.c.c(string);
            return this;
        }

        public a h(String string) {
            block4 : {
                int n2;
                StringBuilder stringBuilder;
                block3 : {
                    block2 : {
                        k.x.c.i.e(string, "url");
                        if (!g.C((String)string, (String)"ws:", (boolean)true)) break block2;
                        stringBuilder = e.e.a.a.a.t((String)"http:");
                        n2 = 3;
                        break block3;
                    }
                    if (!g.C((String)string, (String)"wss:", (boolean)true)) break block4;
                    stringBuilder = e.e.a.a.a.t((String)"https:");
                    n2 = 4;
                }
                String string2 = string.substring(n2);
                k.x.c.i.d(string2, "(this as java.lang.String).substring(startIndex)");
                stringBuilder.append(string2);
                string = stringBuilder.toString();
            }
            k.x.c.i.e(string, "$this$toHttpUrl");
            z.a a2 = new z.a();
            a2.g(null, string);
            this.i(a2.d());
            return this;
        }

        public a i(z z2) {
            k.x.c.i.e((Object)z2, "url");
            this.a = z2;
            return this;
        }
    }

}

