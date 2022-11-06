/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  k.b0.x.b.x0.h.o
 *  k.b0.x.b.x0.h.p
 */
package k.b0.x.b.x0.h;

import java.io.InputStream;
import java.util.ArrayList;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.i;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.o;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;

public final class d {
    public final byte[] a = new byte[4096];
    public final boolean b;
    public int c = 0;
    public int d;
    public int e = 0;
    public final InputStream f;
    public int g;
    public int h = 0;
    public int i = Integer.MAX_VALUE;
    public int j;

    public d(InputStream inputStream) {
        this.f = inputStream;
        this.b = false;
    }

    public void a(int n2) {
        if (this.g == n2) {
            return;
        }
        throw new j("Protocol message end-group tag did not match expected tag.");
    }

    public int b() {
        int n2 = this.i;
        if (n2 == Integer.MAX_VALUE) {
            return -1;
        }
        return n2 - (this.h + this.e);
    }

    public void c(int n2) {
        this.i = n2;
        this.p();
    }

    public int d(int n2) {
        if (n2 >= 0) {
            int n3 = n2 + (this.h + this.e);
            int n4 = this.i;
            if (n3 <= n4) {
                this.i = n3;
                this.p();
                return n4;
            }
            throw j.d();
        }
        throw j.a();
    }

    public boolean e() {
        return this.m() != 0L;
    }

    public c f() {
        int n2;
        int n3;
        int n4 = this.l();
        if (n4 <= (n3 = this.c) - (n2 = this.e) && n4 > 0) {
            byte[] arrby = this.a;
            byte[] arrby2 = new byte[n4];
            System.arraycopy((Object)arrby, (int)n2, (Object)arrby2, (int)0, (int)n4);
            o o2 = new o(arrby2);
            this.e = n4 + this.e;
            return o2;
        }
        if (n4 == 0) {
            return c.k;
        }
        return new o(this.i(n4));
    }

    public int g() {
        return this.l();
    }

    public <T extends p> T h(r<T> r2, f f2) {
        int n2 = this.l();
        if (this.j < 64) {
            int n3 = this.d(n2);
            this.j = 1 + this.j;
            p p2 = (p)r2.a(this, f2);
            this.a(0);
            this.j = -1 + this.j;
            this.i = n3;
            this.p();
            return (T)p2;
        }
        throw j.b();
    }

    public final byte[] i(int n2) {
        if (n2 <= 0) {
            if (n2 == 0) {
                return i.a;
            }
            throw j.a();
        }
        int n3 = this.h;
        int n4 = this.e;
        int n5 = n2 + (n3 + n4);
        int n6 = this.i;
        if (n5 <= n6) {
            int n7;
            if (n2 < 4096) {
                int n8;
                byte[] arrby = new byte[n2];
                int n9 = this.c - n4;
                System.arraycopy((Object)this.a, (int)n4, (Object)arrby, (int)0, (int)n9);
                this.e = n8 = this.c;
                int n10 = n2 - n9;
                if (n8 - n8 < n10 && !this.t(n10)) {
                    throw j.d();
                }
                System.arraycopy((Object)this.a, (int)0, (Object)arrby, (int)n9, (int)n10);
                this.e = n10;
                return arrby;
            }
            int n11 = this.c;
            this.h = n3 + n11;
            this.e = 0;
            this.c = 0;
            int n12 = n11 - n4;
            ArrayList arrayList = new ArrayList();
            for (int i2 = n2 - n12; i2 > 0; i2 -= n7) {
                int n13;
                n7 = Math.min((int)i2, (int)4096);
                byte[] arrby = new byte[n7];
                for (int i3 = 0; i3 < n7; i3 += n13) {
                    InputStream inputStream = this.f;
                    n13 = inputStream == null ? -1 : inputStream.read(arrby, i3, n7 - i3);
                    if (n13 != -1) {
                        this.h = n13 + this.h;
                        continue;
                    }
                    throw j.d();
                }
                arrayList.add((Object)arrby);
            }
            byte[] arrby = new byte[n2];
            System.arraycopy((Object)this.a, (int)n4, (Object)arrby, (int)0, (int)n12);
            for (byte[] arrby2 : arrayList) {
                System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n12, (int)arrby2.length);
                n12 += arrby2.length;
            }
            return arrby;
        }
        this.s(n6 - n3 - n4);
        throw j.d();
    }

    public int j() {
        int n2 = this.e;
        if (this.c - n2 < 4) {
            this.q(4);
            n2 = this.e;
        }
        byte[] arrby = this.a;
        this.e = n2 + 4;
        return 255 & arrby[n2] | (255 & arrby[n2 + 1]) << 8 | (255 & arrby[n2 + 2]) << 16 | (255 & arrby[n2 + 3]) << 24;
    }

    public long k() {
        int n2 = this.e;
        if (this.c - n2 < 8) {
            this.q(8);
            n2 = this.e;
        }
        byte[] arrby = this.a;
        this.e = n2 + 8;
        return 255L & (long)arrby[n2] | (255L & (long)arrby[n2 + 1]) << 8 | (255L & (long)arrby[n2 + 2]) << 16 | (255L & (long)arrby[n2 + 3]) << 24 | (255L & (long)arrby[n2 + 4]) << 32 | (255L & (long)arrby[n2 + 5]) << 40 | (255L & (long)arrby[n2 + 6]) << 48 | (255L & (long)arrby[n2 + 7]) << 56;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int l() {
        block11 : {
            block9 : {
                block10 : {
                    block7 : {
                        block8 : {
                            block6 : {
                                var2_2 = this.c;
                                var1_1 = this.e;
                                if (var2_2 == var1_1) {
                                    return (int)this.n();
                                }
                                var3_3 = this.a;
                                var4_4 = var1_1 + 1;
                                var5_5 = var3_3[var1_1];
                                if (var5_5 >= 0) {
                                    this.e = var4_4;
                                    return var5_5;
                                }
                                if (var2_2 - var4_4 < 9) {
                                    return (int)this.n();
                                }
                                var6_6 = var4_4 + 1;
                                var7_7 = var5_5 ^ var3_3[var4_4] << 7;
                                var8_8 = var7_7;
                                if (var8_8 >= 0L) break block6;
                                var17_9 = -128L;
                                break block7;
                            }
                            var10_11 = var6_6 + 1;
                            var11_12 = var7_7 ^ var3_3[var6_6] << 14;
                            var12_13 = var11_12;
                            if (var12_13 < 0L) break block8;
                            var16_10 = (int)(16256L ^ var12_13);
                            break block9;
                        }
                        var6_6 = var10_11 + 1;
                        var14_14 = var11_12 ^ var3_3[var10_11] << 21;
                        var8_8 = var14_14;
                        if (var8_8 >= 0L) break block10;
                        var17_9 = -2080896L;
                    }
                    var16_10 = (int)(var8_8 ^ var17_9);
                    break block11;
                }
                var10_11 = var6_6 + 1;
                var15_15 = var3_3[var6_6];
                var16_10 = (int)(266354560L ^ (long)(var14_14 ^ var15_15 << 28));
                if (var15_15 >= 0) break block9;
                var6_6 = var10_11 + 1;
                if (var3_3[var10_11] >= 0) break block11;
                var10_11 = var6_6 + 1;
                if (var3_3[var6_6] >= 0) break block9;
                var6_6 = var10_11 + 1;
                if (var3_3[var10_11] < 0) {
                    var10_11 = var6_6 + 1;
                    if (var3_3[var6_6] < 0) {
                        var6_6 = var10_11 + 1;
                        if (var3_3[var10_11] < 0) {
                            return (int)this.n();
                        } else {
                            ** GOTO lbl53
                        }
                    } else {
                        ** GOTO lbl52
                    }
                }
                break block11;
lbl52: // 2 sources:
                break block9;
lbl53: // 2 sources:
                break block11;
            }
            var6_6 = var10_11;
        }
        this.e = var6_6;
        return var16_10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public long m() {
        block14 : {
            block13 : {
                block12 : {
                    block11 : {
                        block10 : {
                            var2_2 = this.c;
                            var1_1 = this.e;
                            if (var2_2 == var1_1) {
                                return this.n();
                            }
                            var3_3 = this.a;
                            var4_4 = var1_1 + 1;
                            var5_5 = var3_3[var1_1];
                            if (var5_5 >= 0) {
                                this.e = var4_4;
                                return var5_5;
                            }
                            if (var2_2 - var4_4 < 9) {
                                return this.n();
                            }
                            var6_6 = var4_4 + 1;
                            var7_7 = var5_5 ^ var3_3[var4_4] << 7;
                            if (var7_7 >= 0L) break block10;
                            var17_8 = -128L;
                            ** GOTO lbl54
                        }
                        var9_10 = var6_6 + 1;
                        var10_11 = var7_7 ^ (long)(var3_3[var6_6] << 14);
                        if (var10_11 < 0L) break block11;
                        var19_12 = 16256L;
                        ** GOTO lbl47
                    }
                    var6_6 = var9_10 + 1;
                    var7_7 = var10_11 ^ (long)(var3_3[var9_10] << 21);
                    if (var7_7 >= 0L) break block12;
                    var17_8 = -2080896L;
                    ** GOTO lbl54
                }
                var9_10 = var6_6 + 1;
                var10_11 = var7_7 ^ (long)var3_3[var6_6] << 28;
                if (var10_11 < 0L) break block13;
                var19_12 = 266354560L;
                ** GOTO lbl47
            }
            var6_6 = var9_10 + 1;
            var7_7 = var10_11 ^ (long)var3_3[var9_10] << 35;
            if (var7_7 >= 0L) break block14;
            var17_8 = -34093383808L;
            ** GOTO lbl54
        }
        var9_10 = var6_6 + 1;
        var10_11 = var7_7 ^ (long)var3_3[var6_6] << 42;
        if (var10_11 >= 0L) {
            var19_12 = 4363953127296L;
lbl47: // 3 sources:
            var15_9 = var10_11 ^ var19_12;
            var6_6 = var9_10;
        } else {
            var6_6 = var9_10 + 1;
            var7_7 = var10_11 ^ (long)var3_3[var9_10] << 49;
            if (var7_7 < 0L) {
                var17_8 = -558586000294016L;
lbl54: // 4 sources:
                var15_9 = var7_7 ^ var17_8;
            } else {
                var12_13 = var6_6 + 1;
                var13_14 = 71499008037633920L ^ (var7_7 ^ (long)var3_3[var6_6] << 56);
                if (var13_14 < 0L) {
                    var6_6 = var12_13 + 1;
                    if ((long)var3_3[var12_13] < 0L) {
                        return this.n();
                    }
                } else {
                    var6_6 = var12_13;
                }
                var15_9 = var13_14;
            }
        }
        this.e = var6_6;
        return var15_9;
    }

    public long n() {
        long l2 = 0L;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.e == this.c) {
                this.q(1);
            }
            byte[] arrby = this.a;
            int n2 = this.e;
            this.e = n2 + 1;
            byte by = arrby[n2];
            l2 |= (long)(by & 127) << i2;
            if ((by & 128) != 0) continue;
            return l2;
        }
        throw new j("CodedInputStream encountered a malformed varint.");
    }

    public int o() {
        int n2;
        int n3 = this.e;
        int n4 = this.c;
        int n5 = 1;
        if (n3 != n4 || this.t(n5)) {
            n5 = 0;
        }
        if (n5 != 0) {
            this.g = 0;
            return 0;
        }
        this.g = n2 = this.l();
        if (n2 >>> 3 != 0) {
            return n2;
        }
        throw new j("Protocol message contained an invalid tag (zero).");
    }

    public final void p() {
        int n2;
        this.c = n2 = this.c + this.d;
        int n3 = n2 + this.h;
        int n4 = this.i;
        if (n3 > n4) {
            int n5;
            this.d = n5 = n3 - n4;
            this.c = n2 - n5;
            return;
        }
        this.d = 0;
    }

    public final void q(int n2) {
        if (this.t(n2)) {
            return;
        }
        throw j.d();
    }

    public boolean r(int n2, e e2) {
        int n3 = n2 & 7;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    int n4;
                    if (n3 != 3) {
                        if (n3 != 4) {
                            if (n3 == 5) {
                                int n5 = this.j();
                                e2.y(n2);
                                e2.w(n5);
                                return true;
                            }
                            throw new j("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    e2.y(n2);
                    while ((n4 = this.o()) != 0 && this.r(n4, e2)) {
                    }
                    int n6 = 4 | n2 >>> 3 << 3;
                    this.a(n6);
                    e2.y(n6);
                    return true;
                }
                c c2 = this.f();
                e2.y(n2);
                e2.m(c2);
                return true;
            }
            long l2 = this.k();
            e2.y(n2);
            e2.x(l2);
            return true;
        }
        long l3 = this.m();
        e2.y(n2);
        e2.z(l3);
        return true;
    }

    public void s(int n2) {
        int n3 = this.c;
        int n4 = this.e;
        if (n2 <= n3 - n4 && n2 >= 0) {
            this.e = n4 + n2;
            return;
        }
        if (n2 >= 0) {
            int n5 = this.h;
            int n6 = n2 + (n5 + n4);
            int n7 = this.i;
            if (n6 <= n7) {
                int n8;
                int n9 = n3 - n4;
                this.e = n3;
                do {
                    this.q(1);
                    n8 = n2 - n9;
                    int n10 = this.c;
                    if (n8 <= n10) break;
                    n9 += n10;
                    this.e = n10;
                } while (true);
                this.e = n8;
                return;
            }
            this.s(n7 - n5 - n4);
            throw j.d();
        }
        throw j.a();
    }

    public final boolean t(int n2) {
        int n3 = this.e;
        int n4 = n3 + n2;
        int n5 = this.c;
        if (n4 > n5) {
            if (n2 + (n3 + this.h) > this.i) {
                return false;
            }
            if (this.f != null) {
                int n6;
                byte[] arrby;
                InputStream inputStream;
                int n7;
                if (n3 > 0) {
                    if (n5 > n3) {
                        byte[] arrby2 = this.a;
                        System.arraycopy((Object)arrby2, (int)n3, (Object)arrby2, (int)0, (int)(n5 - n3));
                    }
                    this.h = n3 + this.h;
                    this.c -= n3;
                    this.e = 0;
                }
                if ((n7 = (inputStream = this.f).read(arrby = this.a, n6 = this.c, arrby.length - n6)) != 0 && n7 >= -1 && n7 <= this.a.length) {
                    if (n7 > 0) {
                        this.c = n7 + this.c;
                        if (n2 + this.h - 67108864 <= 0) {
                            this.p();
                            if (this.c >= n2) {
                                return true;
                            }
                            return this.t(n2);
                        }
                        throw new j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder(102);
                    stringBuilder.append("InputStream#read(byte[]) returned invalid result: ");
                    stringBuilder.append(n7);
                    stringBuilder.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(77);
        stringBuilder.append("refillBuffer() called when ");
        stringBuilder.append(n2);
        stringBuilder.append(" bytes were already available in buffer");
        throw new IllegalStateException(stringBuilder.toString());
    }
}

