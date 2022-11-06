/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.d0.g
 *  n.h
 *  n.h$a
 */
package m.m0.j;

import e.e.a.a.a;
import k.d0.g;
import k.x.c.i;
import m.m0.c;
import n.h;

public final class e {
    public static final h a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final e e;

    public static {
        e = new e();
        a = h.l.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] arrstring = new String[256];
        int n2 = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            Object[] arrobject = new Object[1];
            String string = Integer.toBinaryString((int)i2);
            i.d(string, "Integer.toBinaryString(it)");
            arrobject[0] = string;
            arrstring[i2] = g.v((String)c.i("%8s", arrobject), (char)' ', (char)'0', (boolean)false, (int)4);
        }
        d = arrstring;
        String[] arrstring2 = c;
        arrstring2[0] = "";
        arrstring2[1] = "END_STREAM";
        int[] arrn = new int[]{1};
        arrstring2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; ++i3) {
            int n3 = arrn[i3];
            String[] arrstring3 = c;
            arrstring3[n3 | 8] = i.k(arrstring3[n3], "|PADDED");
        }
        String[] arrstring4 = c;
        arrstring4[4] = "END_HEADERS";
        arrstring4[32] = "PRIORITY";
        arrstring4[36] = "END_HEADERS|PRIORITY";
        int[] arrn2 = new int[]{4, 32, 36};
        for (int i4 = 0; i4 < 3; ++i4) {
            int n4 = arrn2[i4];
            for (int i5 = 0; i5 < 1; ++i5) {
                int n5 = arrn[i5];
                String[] arrstring5 = c;
                int n6 = n5 | n4;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(arrstring5[n5]);
                stringBuilder.append("|");
                stringBuilder.append(arrstring5[n4]);
                arrstring5[n6] = stringBuilder.toString();
                int n7 = n6 | 8;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(arrstring5[n5]);
                stringBuilder2.append("|");
                arrstring5[n7] = a.q((StringBuilder)stringBuilder2, (String)arrstring5[n4], (String)"|PADDED");
            }
        }
        int n8 = c.length;
        while (n2 < n8) {
            String[] arrstring6 = c;
            if (arrstring6[n2] == null) {
                arrstring6[n2] = d[n2];
            }
            ++n2;
        }
    }

    public final String a(int n2) {
        String[] arrstring = b;
        if (n2 < arrstring.length) {
            return arrstring[n2];
        }
        Object[] arrobject = new Object[]{n2};
        return c.i("0x%02x", arrobject);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final String b(boolean var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block5 : {
            block6 : {
                block7 : {
                    block8 : {
                        block4 : {
                            var6_6 = this.a(var4_4);
                            if (var5_5 != 0) break block4;
                            var7_7 = "";
                            break block5;
                        }
                        if (var4_4 == 2 || var4_4 == 3) break block6;
                        if (var4_4 == 4 || var4_4 == 6) break block7;
                        if (var4_4 == 7 || var4_4 == 8) break block6;
                        var10_8 = e.c;
                        if (var5_5 < var10_8.length) {
                            var11_9 = var10_8[var5_5];
                            i.c(var11_9);
                        } else {
                            var11_9 = e.d[var5_5];
                        }
                        if (var4_4 != 5 || (var5_5 & 4) == 0) break block8;
                        var12_10 = "HEADERS";
                        var13_11 = "PUSH_PROMISE";
                        ** GOTO lbl23
                    }
                    if (var4_4 == 0 && (var5_5 & 32) != 0) {
                        var12_10 = "PRIORITY";
                        var13_11 = "COMPRESSED";
lbl23: // 2 sources:
                        var7_7 = g.w((String)var11_9, (String)var12_10, (String)var13_11, (boolean)false, (int)4);
                    } else {
                        var7_7 = var11_9;
                    }
                    break block5;
                }
                var7_7 = var5_5 == 1 ? "ACK" : e.d[var5_5];
                break block5;
            }
            var7_7 = e.d[var5_5];
        }
        var8_12 = var1_1 != false ? "<<" : ">>";
        var9_13 = new Object[]{var8_12, var2_2, var3_3, var6_6, var7_7};
        return c.i("%s 0x%08x %5d %-13s %s", var9_13);
    }
}

