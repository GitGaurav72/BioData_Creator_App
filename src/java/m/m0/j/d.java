/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  k.s.i
 *  m.m0.j.q
 *  m.m0.j.q$a
 *  n.e
 *  n.f
 *  n.g
 *  n.h
 *  n.z
 */
package m.m0.j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.x.c.i;
import m.m0.j.c;
import m.m0.j.q;
import n.e;
import n.f;
import n.g;
import n.h;
import n.z;

public final class d {
    public static final c[] a;
    public static final Map<h, Integer> b;
    public static final d c;

    public static {
        c = new d();
        c[] arrc = new c[61];
        c c2 = new c(c.f, "");
        arrc[0] = c2;
        h h2 = c.c;
        arrc[1] = new c(h2, "GET");
        arrc[2] = new c(h2, "POST");
        h h3 = c.d;
        arrc[3] = new c(h3, "/");
        arrc[4] = new c(h3, "/index.html");
        h h4 = c.e;
        arrc[5] = new c(h4, "http");
        arrc[6] = new c(h4, "https");
        h h5 = c.b;
        arrc[7] = new c(h5, "200");
        arrc[8] = new c(h5, "204");
        arrc[9] = new c(h5, "206");
        arrc[10] = new c(h5, "304");
        arrc[11] = new c(h5, "400");
        arrc[12] = new c(h5, "404");
        arrc[13] = new c(h5, "500");
        arrc[14] = new c("accept-charset", "");
        arrc[15] = new c("accept-encoding", "gzip, deflate");
        arrc[16] = new c("accept-language", "");
        arrc[17] = new c("accept-ranges", "");
        arrc[18] = new c("accept", "");
        arrc[19] = new c("access-control-allow-origin", "");
        arrc[20] = new c("age", "");
        arrc[21] = new c("allow", "");
        arrc[22] = new c("authorization", "");
        arrc[23] = new c("cache-control", "");
        arrc[24] = new c("content-disposition", "");
        arrc[25] = new c("content-encoding", "");
        arrc[26] = new c("content-language", "");
        arrc[27] = new c("content-length", "");
        arrc[28] = new c("content-location", "");
        arrc[29] = new c("content-range", "");
        arrc[30] = new c("content-type", "");
        arrc[31] = new c("cookie", "");
        arrc[32] = new c("date", "");
        arrc[33] = new c("etag", "");
        arrc[34] = new c("expect", "");
        arrc[35] = new c("expires", "");
        arrc[36] = new c("from", "");
        arrc[37] = new c("host", "");
        arrc[38] = new c("if-match", "");
        arrc[39] = new c("if-modified-since", "");
        arrc[40] = new c("if-none-match", "");
        arrc[41] = new c("if-range", "");
        arrc[42] = new c("if-unmodified-since", "");
        arrc[43] = new c("last-modified", "");
        arrc[44] = new c("link", "");
        arrc[45] = new c("location", "");
        arrc[46] = new c("max-forwards", "");
        arrc[47] = new c("proxy-authenticate", "");
        arrc[48] = new c("proxy-authorization", "");
        arrc[49] = new c("range", "");
        arrc[50] = new c("referer", "");
        arrc[51] = new c("refresh", "");
        arrc[52] = new c("retry-after", "");
        arrc[53] = new c("server", "");
        arrc[54] = new c("set-cookie", "");
        arrc[55] = new c("strict-transport-security", "");
        arrc[56] = new c("transfer-encoding", "");
        arrc[57] = new c("user-agent", "");
        arrc[58] = new c("vary", "");
        arrc[59] = new c("via", "");
        arrc[60] = new c("www-authenticate", "");
        a = arrc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrc.length);
        int n2 = arrc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            c[] arrc2 = a;
            if (linkedHashMap.containsKey((Object)arrc2[i2].h)) continue;
            linkedHashMap.put((Object)arrc2[i2].h, (Object)i2);
        }
        Map map = Collections.unmodifiableMap((Map)linkedHashMap);
        i.d((Object)map, "Collections.unmodifiableMap(result)");
        b = map;
    }

    public final h a(h h2) {
        i.e((Object)h2, "name");
        int n2 = h2.n();
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = 65;
            byte by2 = 90;
            byte by3 = h2.r(i2);
            if (by > by3 || by2 < by3) {
                continue;
            }
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"PROTOCOL_ERROR response malformed: mixed case name: ");
            stringBuilder.append(h2.w());
            throw new IOException(stringBuilder.toString());
        }
        return h2;
    }

    public static final class a {
        public final List<c> a;
        public final g b;
        public c[] c;
        public int d;
        public int e;
        public int f;
        public final int g;
        public int h;

        public a(z z2, int n2, int n3, int n4) {
            if ((n4 & 4) != 0) {
                n3 = n2;
            }
            i.e((Object)z2, "source");
            this.g = n2;
            this.h = n3;
            this.a = new ArrayList();
            this.b = e.s.a.a.B((z)z2);
            this.c = new c[8];
            this.d = 7;
        }

        public final void a() {
            k.s.i.o((Object[])this.c, null, (int)0, (int)0, (int)6);
            this.d = -1 + this.c.length;
            this.e = 0;
            this.f = 0;
        }

        public final int b(int n2) {
            return n2 + (1 + this.d);
        }

        public final int c(int n2) {
            int n3 = 0;
            if (n2 > 0) {
                int n4;
                for (int i2 = -1 + this.c.length; i2 >= (n4 = this.d) && n2 > 0; --i2) {
                    c c2 = this.c[i2];
                    i.c(c2);
                    int n5 = c2.g;
                    n2 -= n5;
                    this.f -= n5;
                    this.e = -1 + this.e;
                    ++n3;
                }
                c[] arrc = this.c;
                System.arraycopy((Object)arrc, (int)(n4 + 1), (Object)arrc, (int)(n3 + (n4 + 1)), (int)this.e);
                this.d = n3 + this.d;
            }
            return n3;
        }

        public final h d(int n2) {
            block4 : {
                c c2;
                block3 : {
                    c[] arrc;
                    block2 : {
                        boolean bl = n2 >= 0 && n2 <= d.a.length - 1;
                        if (!bl) break block2;
                        c2 = d.a[n2];
                        break block3;
                    }
                    int n3 = this.b(n2 - d.a.length);
                    if (n3 < 0 || n3 >= (arrc = this.c).length) break block4;
                    c2 = arrc[n3];
                    i.c(c2);
                }
                return c2.h;
            }
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"Header index too large ");
            stringBuilder.append(n2 + 1);
            throw new IOException(stringBuilder.toString());
        }

        public final void e(int n2, c c2) {
            int n3;
            this.a.add((Object)c2);
            int n4 = c2.g;
            if (n2 != -1) {
                c c3 = this.c[n2 + (1 + this.d)];
                i.c(c3);
                n4 -= c3.g;
            }
            if (n4 > (n3 = this.h)) {
                this.a();
                return;
            }
            int n5 = this.c(n4 + this.f - n3);
            if (n2 == -1) {
                int n6 = 1 + this.e;
                c[] arrc = this.c;
                if (n6 > arrc.length) {
                    c[] arrc2 = new c[2 * arrc.length];
                    System.arraycopy((Object)arrc, (int)0, (Object)arrc2, (int)arrc.length, (int)arrc.length);
                    this.d = -1 + this.c.length;
                    this.c = arrc2;
                }
                int n7 = this.d;
                this.d = n7 - 1;
                this.c[n7] = c2;
                this.e = 1 + this.e;
            } else {
                int n8 = n2 + (n5 + (n2 + (1 + this.d)));
                this.c[n8] = c2;
            }
            this.f = n4 + this.f;
        }

        public final h f() {
            byte by = this.b.readByte();
            int n2 = by & 255;
            int n3 = n2 & 128;
            int n4 = 0;
            boolean bl = n3 == 128;
            long l2 = this.g(n2, 127);
            if (bl) {
                e e2 = new e();
                g g2 = this.b;
                i.e((Object)g2, "source");
                i.e((Object)e2, "sink");
                q.a a2 = q.c;
                int n5 = 0;
                for (long i2 = 0L; i2 < l2; ++i2) {
                    byte by2 = g2.readByte();
                    n4 = by2 & 255 | n4 << 8;
                    n5 += 8;
                    while (n5 >= 8) {
                        int n6 = n5 - 8;
                        int n7 = 255 & n4 >>> n6;
                        q.a[] arra = a2.a;
                        i.c(arra);
                        a2 = arra[n7];
                        i.c((Object)a2);
                        if (a2.a == null) {
                            e2.X(a2.b);
                            n5 -= a2.c;
                            a2 = q.c;
                            continue;
                        }
                        n5 = n6;
                    }
                }
                while (n5 > 0) {
                    int n8 = 255 & n4 << 8 - n5;
                    q.a[] arra = a2.a;
                    i.c(arra);
                    q.a a3 = arra[n8];
                    i.c((Object)a3);
                    if (a3.a != null || a3.c > n5) break;
                    e2.X(a3.b);
                    n5 -= a3.c;
                    a2 = q.c;
                }
                return e2.y();
            }
            return this.b.f(l2);
        }

        public final int g(int n2, int n3) {
            byte by;
            int n4;
            int n5 = n2 & n3;
            if (n5 < n3) {
                return n5;
            }
            int n6 = 0;
            while (((n4 = (by = this.b.readByte()) & 255) & 128) != 0) {
                n3 += (n4 & 127) << n6;
                n6 += 7;
            }
            return n3 + (n4 << n6);
        }
    }

    public static final class b {
        public int a;
        public boolean b;
        public int c;
        public c[] d;
        public int e;
        public int f;
        public int g;
        public int h;
        public final boolean i;
        public final e j;

        public b(int n2, boolean bl, e e2, int n3) {
            if ((n3 & 1) != 0) {
                n2 = 4096;
            }
            if ((n3 & 2) != 0) {
                bl = true;
            }
            i.e((Object)e2, "out");
            this.h = n2;
            this.i = bl;
            this.j = e2;
            this.a = Integer.MAX_VALUE;
            this.c = n2;
            this.d = new c[8];
            this.e = 7;
        }

        public final void a() {
            k.s.i.o((Object[])this.d, null, (int)0, (int)0, (int)6);
            this.e = -1 + this.d.length;
            this.f = 0;
            this.g = 0;
        }

        public final int b(int n2) {
            int n3 = 0;
            if (n2 > 0) {
                int n4;
                for (int i2 = -1 + this.d.length; i2 >= (n4 = this.e) && n2 > 0; --i2) {
                    c c2 = this.d[i2];
                    i.c(c2);
                    n2 -= c2.g;
                    int n5 = this.g;
                    c c3 = this.d[i2];
                    i.c(c3);
                    this.g = n5 - c3.g;
                    this.f = -1 + this.f;
                    ++n3;
                }
                c[] arrc = this.d;
                System.arraycopy((Object)arrc, (int)(n4 + 1), (Object)arrc, (int)(n3 + (n4 + 1)), (int)this.f);
                Object[] arrobject = this.d;
                int n6 = this.e;
                Arrays.fill((Object[])arrobject, (int)(n6 + 1), (int)(n3 + (n6 + 1)), null);
                this.e = n3 + this.e;
            }
            return n3;
        }

        public final void c(c c2) {
            int n2 = c2.g;
            int n3 = this.c;
            if (n2 > n3) {
                this.a();
                return;
            }
            this.b(n2 + this.g - n3);
            int n4 = 1 + this.f;
            c[] arrc = this.d;
            if (n4 > arrc.length) {
                c[] arrc2 = new c[2 * arrc.length];
                System.arraycopy((Object)arrc, (int)0, (Object)arrc2, (int)arrc.length, (int)arrc.length);
                this.e = -1 + this.d.length;
                this.d = arrc2;
            }
            int n5 = this.e;
            this.e = n5 - 1;
            this.d[n5] = c2;
            this.f = 1 + this.f;
            this.g = n2 + this.g;
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void d(h h2) {
            int n2;
            int n3;
            block6 : {
                int n4;
                long l2;
                int n5;
                e e2;
                block5 : {
                    block4 : {
                        int n6;
                        i.e((Object)h2, "data");
                        boolean bl = this.i;
                        n3 = 0;
                        if (!bl) break block4;
                        i.e((Object)h2, "bytes");
                        int n7 = h2.n();
                        long l3 = 0L;
                        for (int i2 = 0; i2 < n7; l3 += (long)q.b[n6], ++i2) {
                            byte by = h2.r(i2);
                            n6 = by & 255;
                        }
                        if ((int)(l3 + (long)7 >> 3) >= h2.n()) break block4;
                        e2 = new e();
                        i.e((Object)h2, "source");
                        i.e((Object)e2, "sink");
                        n4 = h2.n();
                        l2 = 0L;
                        n5 = 0;
                        break block5;
                    }
                    n2 = h2.n();
                    break block6;
                }
                while (n3 < n4) {
                    byte by = h2.r(n3);
                    int n8 = by & 255;
                    int n9 = q.a[n8];
                    byte by2 = q.b[n8];
                    l2 = l2 << by2 | (long)n9;
                    n5 += by2;
                    while (n5 >= 8) {
                        e2.n((int)(l2 >> (n5 -= 8)));
                    }
                    ++n3;
                }
                if (n5 > 0) {
                    e2.n((int)(l2 << 8 - n5 | 255L >>> n5));
                }
                h2 = e2.y();
                n2 = h2.n();
                n3 = 128;
            }
            this.f(n2, 127, n3);
            this.j.R(h2);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public final void e(List<c> var1_1) {
            i.e(var1_1, "headerBlock");
            if (this.b) {
                var23_2 = this.a;
                if (var23_2 < this.c) {
                    this.f(var23_2, 31, 32);
                }
                this.b = false;
                this.a = Integer.MAX_VALUE;
                this.f(this.c, 31, 32);
            }
            var2_3 = var1_1.size();
            var3_4 = 0;
            while (var3_4 < var2_3) {
                block15 : {
                    block16 : {
                        block14 : {
                            block13 : {
                                block12 : {
                                    block11 : {
                                        var4_5 = (c)var1_1.get(var3_4);
                                        var5_6 = var4_5.h.v();
                                        var6_7 = var4_5.i;
                                        var8_8 = (Integer)d.b.get((Object)var5_6);
                                        if (var8_8 == null) break block11;
                                        var9_9 = 1 + var8_8;
                                        if (2 > var9_9 || 7 < var9_9) ** GOTO lbl-1000
                                        var22_18 = d.a;
                                        if (!i.a((Object)var22_18[var9_9 - 1].i, (Object)var6_7)) {
                                            ** if (!i.a((Object)var22_18[var9_9].i, (Object)var6_7)) goto lbl-1000
lbl-1000: // 1 sources:
                                            {
                                                var10_10 = var9_9 + 1;
                                                ** GOTO lbl31
                                            }
                                        }
                                        break block12;
lbl-1000: // 2 sources:
                                        {
                                            var10_10 = -1;
                                        }
                                        break block13;
                                    }
                                    var9_9 = -1;
                                }
                                var10_10 = var9_9;
                            }
                            if (var10_10 == -1) {
                                var15_13 = this.d.length;
                                for (var14_12 = 1 + this.e; var14_12 < var15_13; ++var14_12) {
                                    var16_14 = this.d[var14_12];
                                    i.c(var16_14);
                                    if (!i.a((Object)var16_14.h, (Object)var5_6)) continue;
                                    var17_15 = this.d[var14_12];
                                    i.c(var17_15);
                                    if (i.a((Object)var17_15.i, (Object)var6_7)) {
                                        var20_17 = var14_12 - this.e;
                                        var10_10 = var20_17 + d.a.length;
                                        break;
                                    }
                                    if (var9_9 != -1) continue;
                                    var18_16 = var14_12 - this.e;
                                    var9_9 = var18_16 + d.a.length;
                                }
                            }
                            if (var10_10 == -1) break block14;
                            this.f(var10_10, 127, 128);
                            break block15;
                        }
                        if (var9_9 != -1) break block16;
                        this.j.X(64);
                        this.d(var5_6);
                        ** GOTO lbl65
                    }
                    var11_11 = c.a;
                    Objects.requireNonNull((Object)var5_6);
                    i.e((Object)var11_11, "prefix");
                    if (var5_6.t(0, var11_11, 0, var11_11.n()) && true ^ i.a((Object)c.f, (Object)var5_6)) {
                        this.f(var9_9, 15, 0);
                        this.d(var6_7);
                    } else {
                        this.f(var9_9, 63, 64);
lbl65: // 2 sources:
                        this.d(var6_7);
                        this.c(var4_5);
                    }
                }
                ++var3_4;
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void f(int n2, int n3, int n4) {
            int n5;
            e e2;
            if (n2 < n3) {
                e2 = this.j;
                n5 = n2 | n4;
            } else {
                this.j.X(n4 | n3);
                for (n5 = n2 - n3; n5 >= 128; n5 >>>= 7) {
                    int n6 = n5 & 127;
                    this.j.X(128 | n6);
                }
                e2 = this.j;
            }
            e2.X(n5);
        }
    }

}

