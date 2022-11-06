/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.TimeUnit
 *  k.d0.g
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  m.y
 */
package m;

import java.util.concurrent.TimeUnit;
import k.d0.g;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.m0.c;
import m.y;

public final class e {
    public static final a a = new a(null);
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public String n;

    public static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i.e((Object)timeUnit, "timeUnit");
        timeUnit.toSeconds((long)Integer.MAX_VALUE);
    }

    public e(boolean bl, boolean bl2, int n2, int n3, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, boolean bl6, boolean bl7, boolean bl8, String string, DefaultConstructorMarker defaultConstructorMarker) {
        this.b = bl;
        this.c = bl2;
        this.d = n2;
        this.e = n3;
        this.f = bl3;
        this.g = bl4;
        this.h = bl5;
        this.i = n4;
        this.j = n5;
        this.k = bl6;
        this.l = bl7;
        this.m = bl8;
        this.n = string;
    }

    public String toString() {
        String string = this.n;
        if (string == null) {
            boolean bl;
            StringBuilder stringBuilder = new StringBuilder();
            if (this.b) {
                stringBuilder.append("no-cache, ");
            }
            if (this.c) {
                stringBuilder.append("no-store, ");
            }
            if (this.d != -1) {
                stringBuilder.append("max-age=");
                stringBuilder.append(this.d);
                stringBuilder.append(", ");
            }
            if (this.e != -1) {
                stringBuilder.append("s-maxage=");
                stringBuilder.append(this.e);
                stringBuilder.append(", ");
            }
            if (this.f) {
                stringBuilder.append("private, ");
            }
            if (this.g) {
                stringBuilder.append("public, ");
            }
            if (this.h) {
                stringBuilder.append("must-revalidate, ");
            }
            if (this.i != -1) {
                stringBuilder.append("max-stale=");
                stringBuilder.append(this.i);
                stringBuilder.append(", ");
            }
            if (this.j != -1) {
                stringBuilder.append("min-fresh=");
                stringBuilder.append(this.j);
                stringBuilder.append(", ");
            }
            if (this.k) {
                stringBuilder.append("only-if-cached, ");
            }
            if (this.l) {
                stringBuilder.append("no-transform, ");
            }
            if (this.m) {
                stringBuilder.append("immutable, ");
            }
            if (bl = stringBuilder.length() == 0) {
                return "";
            }
            stringBuilder.delete(-2 + stringBuilder.length(), stringBuilder.length());
            string = stringBuilder.toString();
            i.d(string, "StringBuilder().apply(builderAction).toString()");
            this.n = string;
        }
        return string;
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int a(String string, String string2, int n2) {
            int n3 = string.length();
            while (n2 < n3) {
                if (g.b((CharSequence)string2, (char)string.charAt(n2), (boolean)false, (int)2)) {
                    return n2;
                }
                ++n2;
            }
            return string.length();
        }

        public final e b(y y2) {
            boolean bl;
            y y3 = y2;
            i.e((Object)y3, "headers");
            int n2 = y2.size();
            boolean bl2 = bl = true;
            String string = null;
            boolean bl3 = false;
            boolean bl4 = false;
            int n3 = -1;
            int n4 = -1;
            boolean bl5 = false;
            boolean bl6 = false;
            boolean bl7 = false;
            int n5 = -1;
            int n6 = -1;
            boolean bl8 = false;
            boolean bl9 = false;
            boolean bl10 = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n7;
                block37 : {
                    block33 : {
                        String string2;
                        block32 : {
                            block31 : {
                                String string3;
                                block30 : {
                                    string3 = y3.k(i2);
                                    string2 = y3.r(i2);
                                    if (!g.f((String)string3, (String)"Cache-Control", (boolean)bl)) break block30;
                                    if (string != null) break block31;
                                    string = string2;
                                    break block32;
                                }
                                if (!g.f((String)string3, (String)"Pragma", (boolean)bl)) break block33;
                            }
                            bl2 = false;
                        }
                        int n8 = 0;
                        while (n8 < string2.length()) {
                            int n9;
                            int n10;
                            String string4;
                            String string5;
                            String string6;
                            block36 : {
                                int n11;
                                block35 : {
                                    block34 : {
                                        int n12;
                                        block29 : {
                                            n11 = this.a(string2, "=,;", n8);
                                            String string7 = string2.substring(n8, n11);
                                            i.d(string7, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                            string4 = g.O((CharSequence)string7).toString();
                                            if (n11 == string2.length()) break block34;
                                            char c2 = string2.charAt(n11);
                                            n10 = n2;
                                            if (c2 == ',' || string2.charAt(n11) == ';') break block35;
                                            i.e(string2, "$this$indexOfNonWhitespace");
                                            int n13 = string2.length();
                                            for (n12 = n11 + 1; n12 < n13; ++n12) {
                                                char c3 = string2.charAt(n12);
                                                int n14 = n13;
                                                if (c3 == ' ' || c3 == '\t') {
                                                    n13 = n14;
                                                    continue;
                                                }
                                                break block29;
                                            }
                                            n12 = string2.length();
                                        }
                                        if (n12 < string2.length() && string2.charAt(n12) == '\"') {
                                            int n15 = n12 + 1;
                                            string5 = string;
                                            int n16 = g.k((CharSequence)string2, (char)'\"', (int)n15, (boolean)false, (int)4);
                                            string6 = string2.substring(n15, n16);
                                            i.d(string6, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                            n9 = n16 + 1;
                                        } else {
                                            string5 = string;
                                            n9 = this.a(string2, ",;", n12);
                                            String string8 = string2.substring(n12, n9);
                                            i.d(string8, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                            string6 = g.O((CharSequence)string8).toString();
                                        }
                                        break block36;
                                    }
                                    n10 = n2;
                                }
                                string5 = string;
                                n9 = n11 + 1;
                                string6 = null;
                            }
                            bl = true;
                            if (g.f((String)"no-cache", (String)string4, (boolean)bl)) {
                                bl3 = bl;
                            } else if (g.f((String)"no-store", (String)string4, (boolean)bl)) {
                                bl4 = bl;
                            } else if (g.f((String)"max-age", (String)string4, (boolean)bl)) {
                                n3 = c.A(string6, -1);
                            } else if (g.f((String)"s-maxage", (String)string4, (boolean)bl)) {
                                n4 = c.A(string6, -1);
                            } else if (g.f((String)"private", (String)string4, (boolean)bl)) {
                                bl5 = bl;
                            } else if (g.f((String)"public", (String)string4, (boolean)bl)) {
                                bl6 = bl;
                            } else if (g.f((String)"must-revalidate", (String)string4, (boolean)bl)) {
                                bl7 = bl;
                            } else if (g.f((String)"max-stale", (String)string4, (boolean)bl)) {
                                n5 = c.A(string6, Integer.MAX_VALUE);
                            } else if (g.f((String)"min-fresh", (String)string4, (boolean)bl)) {
                                n6 = c.A(string6, -1);
                            } else if (g.f((String)"only-if-cached", (String)string4, (boolean)bl)) {
                                bl8 = bl;
                            } else if (g.f((String)"no-transform", (String)string4, (boolean)bl)) {
                                bl9 = bl;
                            } else if (g.f((String)"immutable", (String)string4, (boolean)bl)) {
                                bl10 = bl;
                            }
                            n8 = n9;
                            n2 = n10;
                            string = string5;
                        }
                        n7 = n2;
                        break block37;
                    }
                    n7 = n2;
                }
                y3 = y2;
                n2 = n7;
            }
            String string9 = string;
            String string10 = !bl2 ? null : string9;
            e e2 = new e(bl3, bl4, n3, n4, bl5, bl6, bl7, n5, n6, bl8, bl9, bl10, string10, null);
            return e2;
        }
    }

}

