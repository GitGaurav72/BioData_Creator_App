/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  k.a0.b
 *  k.a0.e
 *  k.s.i
 *  m.m0.j.n$a
 *  m.m0.j.t
 *  n.g
 *  n.h
 *  n.z
 */
package m.m0.j;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.x.c.i;
import m.m0.c;
import m.m0.j.d;
import m.m0.j.e;
import m.m0.j.n;
import m.m0.j.t;
import n.g;
import n.h;
import n.z;

/*
 * Exception performing whole class analysis.
 */
public final class n
implements Closeable {
    public static final Logger k;
    public static final n l;
    public final a m;
    public final d.a n;
    public final g o;
    public final boolean p;

    public static {
        Logger logger = Logger.getLogger((String)e.class.getName());
        i.d((Object)logger, "Logger.getLogger(Http2::class.java.name)");
        k = logger;
    }

    public n(g g2, boolean bl) {
        a a2;
        i.e((Object)g2, "source");
        this.o = g2;
        this.p = bl;
        this.m = a2 = new /* Unavailable Anonymous Inner Class!! */;
        this.n = new d.a((z)a2, 4096, 0, 4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean a(boolean var1_1, b var2_2) {
        i.e(var2_2, "handler");
        try {
            this.o.e0(9L);
        }
        catch (EOFException v0) {
            return false;
        }
        var3_3 = c.u(this.o);
        if (var3_3 > 16384) throw new IOException(e.e.a.a.a.f((String)"FRAME_SIZE_ERROR: ", (int)var3_3));
        var4_4 = 255 & this.o.readByte();
        var5_5 = 255 & this.o.readByte();
        var6_6 = Integer.MAX_VALUE & this.o.readInt();
        var7_7 = n.k;
        if (var7_7.isLoggable(Level.FINE)) {
            var7_7.fine(e.e.b(true, var6_6, var3_3, var4_4, var5_5));
        }
        if (var1_1 && var4_4 != 4) {
            var57_8 = e.e.a.a.a.t((String)"Expected a SETTINGS frame but was ");
            var57_8.append(e.e.a(var4_4));
            throw new IOException(var57_8.toString());
        }
        switch (var4_4) {
            default: {
                this.o.skip((long)var3_3);
                return true;
            }
            case 8: {
                if (var3_3 != 4) throw new IOException(e.e.a.a.a.f((String)"TYPE_WINDOW_UPDATE length !=4: ", (int)var3_3));
                var53_9 = this.o.readInt();
                var55_10 = Integer.MAX_VALUE & (long)var53_9;
                if (var55_10 == 0L) throw new IOException("windowSizeIncrement was 0");
                var2_2.f(var6_6, var55_10);
                return true;
            }
            case 7: {
                if (var3_3 < 8) throw new IOException(e.e.a.a.a.f((String)"TYPE_GOAWAY length < 8: ", (int)var3_3));
                if (var6_6 != 0) throw new IOException("TYPE_GOAWAY streamId != 0");
                var45_11 = this.o.readInt();
                var46_12 = this.o.readInt();
                var47_13 = var3_3 - 8;
                var48_14 = m.m0.j.b.values();
                for (var49_15 = 0; var49_15 < 14; ++var49_15) {
                    var50_16 = var48_14[var49_15];
                    var52_17 = var50_16.s == var46_12;
                    if (!var52_17) {
                        continue;
                    }
                    ** GOTO lbl41
                }
                var50_16 = null;
lbl41: // 2 sources:
                if (var50_16 == null) throw new IOException(e.e.a.a.a.f((String)"TYPE_GOAWAY unexpected error code: ", (int)var46_12));
                var51_18 = h.k;
                if (var47_13 > 0) {
                    var51_18 = this.o.f((long)var47_13);
                }
                var2_2.l(var45_11, var50_16, var51_18);
                return true;
            }
            case 6: {
                if (var3_3 != 8) throw new IOException(e.e.a.a.a.f((String)"TYPE_PING length != 8: ", (int)var3_3));
                if (var6_6 != 0) throw new IOException("TYPE_PING streamId != 0");
                var41_19 = this.o.readInt();
                var42_20 = this.o.readInt();
                var43_21 = var5_5 & 1;
                var44_22 = false;
                if (var43_21 != 0) {
                    var44_22 = true;
                }
                var2_2.h(var44_22, var41_19, var42_20);
                return true;
            }
            case 5: {
                if (var6_6 == 0) throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                var35_23 = var5_5 & 8;
                var36_24 = 0;
                if (var35_23 != 0) {
                    var39_25 = this.o.readByte();
                    var36_24 = var39_25 & 255;
                }
                var37_26 = Integer.MAX_VALUE & this.o.readInt();
                var38_27 = var3_3 - 4;
                if (var35_23 != 0) {
                    --var38_27;
                }
                if (var36_24 > var38_27) throw new IOException(e.e.a.a.a.h((String)"PROTOCOL_ERROR padding ", (int)var36_24, (String)" > remaining length ", (int)var38_27));
                var2_2.k(var6_6, var37_26, this.k(var38_27 - var36_24, var36_24, var5_5, var6_6));
                return true;
            }
            case 4: {
                if (var6_6 != 0) throw new IOException("TYPE_SETTINGS streamId != 0");
                if ((var5_5 & 1) != 0) {
                    if (var3_3 != 0) throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    var2_2.b();
                    return true;
                }
                if (var3_3 % 6 != 0) throw new IOException(e.e.a.a.a.f((String)"TYPE_SETTINGS length % 6 != 0: ", (int)var3_3));
                var25_28 = new t();
                var26_29 = k.a0.e.c((k.a0.b)k.a0.e.d((int)0, (int)var3_3), (int)6);
                var27_30 = var26_29.k;
                var28_31 = var26_29.l;
                var29_32 = var26_29.m;
                if (var29_32 >= 0 ? var27_30 <= var28_31 : var27_30 >= var28_31) {
                    do {
                        var30_35 = this.o.readShort();
                        var32_33 = var30_35 & 65535;
                        var33_34 = this.o.readInt();
                        if (var32_33 != 2) {
                            if (var32_33 != 3) {
                                if (var32_33 != 4) {
                                    if (var32_33 == 5) {
                                        if (var33_34 < 16384) throw new IOException(e.e.a.a.a.f((String)"PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", (int)var33_34));
                                        if (var33_34 > 16777215) throw new IOException(e.e.a.a.a.f((String)"PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", (int)var33_34));
                                    }
                                } else {
                                    var32_33 = 7;
                                    if (var33_34 < 0) throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else {
                                var32_33 = 4;
                            }
                        } else if (var33_34 != 0) {
                            if (var33_34 != 1) throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        var25_28.c(var32_33, var33_34);
                        if (var27_30 == var28_31) break;
                        var27_30 += var29_32;
                    } while (true);
                }
                var2_2.d(false, var25_28);
                return true;
            }
            case 3: {
                if (var3_3 != 4) throw new IOException(e.e.a.a.a.g((String)"TYPE_RST_STREAM length: ", (int)var3_3, (String)" != 4"));
                if (var6_6 == 0) throw new IOException("TYPE_RST_STREAM streamId == 0");
                var20_36 = this.o.readInt();
                var21_37 = m.m0.j.b.values();
                for (var22_38 = 0; var22_38 < 14; ++var22_38) {
                    var23_39 = var21_37[var22_38];
                    var24_40 = var23_39.s == var20_36;
                    if (!var24_40) {
                        continue;
                    }
                    ** GOTO lbl121
                }
                var23_39 = null;
lbl121: // 2 sources:
                if (var23_39 == null) throw new IOException(e.e.a.a.a.f((String)"TYPE_RST_STREAM unexpected error code: ", (int)var20_36));
                var2_2.j(var6_6, var23_39);
                return true;
            }
            case 2: {
                if (var3_3 != 5) throw new IOException(e.e.a.a.a.g((String)"TYPE_PRIORITY length: ", (int)var3_3, (String)" != 5"));
                if (var6_6 == 0) throw new IOException("TYPE_PRIORITY streamId == 0");
                this.o(var2_2, var6_6);
                return true;
            }
            case 1: {
                if (var6_6 == 0) throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                var15_41 = (var5_5 & 1) != 0;
                var16_42 = var5_5 & 8;
                var17_43 = 0;
                if (var16_42 != 0) {
                    var18_44 = this.o.readByte();
                    var17_43 = var18_44 & 255;
                }
                if ((var5_5 & 32) != 0) {
                    this.o(var2_2, var6_6);
                    var3_3 -= 5;
                }
                if (var16_42 != 0) {
                    --var3_3;
                }
                if (var17_43 > var3_3) throw new IOException(e.e.a.a.a.h((String)"PROTOCOL_ERROR padding ", (int)var17_43, (String)" > remaining length ", (int)var3_3));
                var2_2.e(var15_41, var6_6, -1, this.k(var3_3 - var17_43, var17_43, var5_5, var6_6));
                return true;
            }
            case 0: 
        }
        if (var6_6 == 0) throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        var8_45 = (var5_5 & 1) != 0;
        var9_46 = (var5_5 & 32) != 0;
        if (var9_46 != false) throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        var10_47 = var5_5 & 8;
        var11_48 = 0;
        if (var10_47 != 0) {
            var13_49 = this.o.readByte();
            var11_48 = var13_49 & 255;
        }
        if (var10_47 != 0) {
            --var3_3;
        }
        if (var11_48 > var3_3) throw new IOException(e.e.a.a.a.h((String)"PROTOCOL_ERROR padding ", (int)var11_48, (String)" > remaining length ", (int)var3_3));
        var12_50 = var3_3 - var11_48;
        var2_2.g(var8_45, var6_6, this.o, var12_50);
        this.o.skip((long)var11_48);
        return true;
    }

    public final void b(b b2) {
        i.e(b2, "handler");
        if (this.p) {
            if (this.a(true, b2)) {
                return;
            }
            throw new IOException("Required SETTINGS preface not received");
        }
        g g2 = this.o;
        h h2 = e.a;
        h h3 = g2.f((long)h2.n());
        Logger logger = k;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"<< CONNECTION ");
            stringBuilder.append(h3.o());
            logger.fine(c.i(stringBuilder.toString(), new Object[0]));
        }
        if (!(true ^ i.a((Object)h2, (Object)h3))) {
            return;
        }
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Expected a connection header but was ");
        stringBuilder.append(h3.w());
        throw new IOException(stringBuilder.toString());
    }

    public void close() {
        this.o.close();
    }

    public final List<m.m0.j.c> k(int n2, int n3, int n4, int n5) {
        a a2 = this.m;
        a2.n = n2;
        a2.k = n2;
        a2.o = n3;
        a2.l = n4;
        a2.m = n5;
        d.a a3 = this.n;
        while (!a3.b.m()) {
            byte by = a3.b.readByte();
            int n6 = by & 255;
            if (n6 != 128) {
                if ((n6 & 128) == 128) {
                    m.m0.j.c[] arrc;
                    int n7 = a3.g(n6, 127) - 1;
                    boolean bl = n7 >= 0 && n7 <= d.a.length - 1;
                    if (bl) {
                        m.m0.j.c c2 = d.a[n7];
                        a3.a.add((Object)c2);
                        continue;
                    }
                    int n8 = a3.b(n7 - d.a.length);
                    if (n8 >= 0 && n8 < (arrc = a3.c).length) {
                        List<m.m0.j.c> list = a3.a;
                        m.m0.j.c c3 = arrc[n8];
                        i.c(c3);
                        list.add((Object)c3);
                        continue;
                    }
                    StringBuilder stringBuilder = e.e.a.a.a.t((String)"Header index too large ");
                    stringBuilder.append(n7 + 1);
                    throw new IOException(stringBuilder.toString());
                }
                if (n6 == 64) {
                    d d2 = d.c;
                    h h2 = a3.f();
                    d2.a(h2);
                    a3.e(-1, new m.m0.j.c(h2, a3.f()));
                    continue;
                }
                if ((n6 & 64) == 64) {
                    a3.e(-1, new m.m0.j.c(a3.d(a3.g(n6, 63) - 1), a3.f()));
                    continue;
                }
                if ((n6 & 32) == 32) {
                    int n9;
                    a3.h = n9 = a3.g(n6, 31);
                    if (n9 >= 0 && n9 <= a3.g) {
                        int n10 = a3.f;
                        if (n9 >= n10) continue;
                        if (n9 == 0) {
                            a3.a();
                            continue;
                        }
                        a3.c(n10 - n9);
                        continue;
                    }
                    StringBuilder stringBuilder = e.e.a.a.a.t((String)"Invalid dynamic table size update ");
                    stringBuilder.append(a3.h);
                    throw new IOException(stringBuilder.toString());
                }
                if (n6 != 16 && n6 != 0) {
                    h h3 = a3.d(a3.g(n6, 15) - 1);
                    h h4 = a3.f();
                    a3.a.add((Object)new m.m0.j.c(h3, h4));
                    continue;
                }
                d d3 = d.c;
                h h5 = a3.f();
                d3.a(h5);
                h h6 = a3.f();
                a3.a.add((Object)new m.m0.j.c(h5, h6));
                continue;
            }
            throw new IOException("index == 0");
        }
        d.a a4 = this.n;
        List list = k.s.i.b0(a4.a);
        a4.a.clear();
        return list;
    }

    public final void o(b b2, int n2) {
        int n3 = this.o.readInt();
        boolean bl = (n3 & (int)0x80000000L) != 0;
        int n4 = n3 & Integer.MAX_VALUE;
        byte by = this.o.readByte();
        b2.i(n2, n4, 1 + (by & 255), bl);
    }

    public static interface b {
        public void b();

        public void d(boolean var1, t var2);

        public void e(boolean var1, int var2, int var3, List<m.m0.j.c> var4);

        public void f(int var1, long var2);

        public void g(boolean var1, int var2, g var3, int var4);

        public void h(boolean var1, int var2, int var3);

        public void i(int var1, int var2, int var3, boolean var4);

        public void j(int var1, m.m0.j.b var2);

        public void k(int var1, int var2, List<m.m0.j.c> var3);

        public void l(int var1, m.m0.j.b var2, h var3);
    }

}

