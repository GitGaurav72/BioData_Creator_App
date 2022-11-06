/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.q.a.o
 *  e.q.a.p
 *  e.q.a.r
 *  e.q.a.r$a
 *  e.q.a.r$b
 *  java.io.EOFException
 *  java.lang.AssertionError
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  n.e
 *  n.g
 *  n.h
 *  n.p
 */
package e.q.a;

import e.e.a.a.a;
import e.q.a.o;
import e.q.a.p;
import e.q.a.r;
import java.io.EOFException;
import java.util.Objects;
import n.e;
import n.g;
import n.h;

public final class s
extends r {
    public static final h o = h.m((String)"'\\");
    public static final h p = h.m((String)"\"\\");
    public static final h q = h.m((String)"{}[]:, \n\t\r\f/\\;#=");
    public static final h r = h.m((String)"\n\r");
    public static final h s = h.m((String)"*/");
    public final g t;
    public final e u;
    public int v = 0;
    public long w;
    public int x;
    public String y;

    public s(g g2) {
        Objects.requireNonNull((Object)g2, (String)"source == null");
        this.t = g2;
        this.u = g2.getBuffer();
        this.B(6);
    }

    public int F(r.a a2) {
        int n2 = this.v;
        if (n2 == 0) {
            n2 = this.R();
        }
        if (n2 >= 12) {
            if (n2 > 15) {
                return -1;
            }
            if (n2 == 15) {
                return this.S(this.y, a2);
            }
            int n3 = this.t.i0(a2.b);
            if (n3 != -1) {
                this.v = 0;
                this.m[-1 + this.k] = a2.a[n3];
                return n3;
            }
            String string = this.m[-1 + this.k];
            String string2 = this.Y();
            int n4 = this.S(string2, a2);
            if (n4 == -1) {
                this.v = 15;
                this.y = string2;
                this.m[-1 + this.k] = string;
            }
            return n4;
        }
        return -1;
    }

    public void I() {
        block9 : {
            block5 : {
                int n2;
                block8 : {
                    h h2;
                    block7 : {
                        block6 : {
                            block4 : {
                                n2 = this.v;
                                if (n2 == 0) {
                                    n2 = this.R();
                                }
                                if (n2 != 14) break block4;
                                this.m0();
                                break block5;
                            }
                            if (n2 != 13) break block6;
                            h2 = p;
                            break block7;
                        }
                        if (n2 != 12) break block8;
                        h2 = o;
                    }
                    this.l0(h2);
                    break block5;
                }
                if (n2 != 15) break block9;
            }
            this.v = 0;
            this.m[-1 + this.k] = "null";
            return;
        }
        StringBuilder stringBuilder = a.t((String)"Expected a name but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    public void J() {
        int n2 = 0;
        do {
            block9 : {
                block14 : {
                    h h2;
                    block17 : {
                        block15 : {
                            block16 : {
                                int n3;
                                block12 : {
                                    block13 : {
                                        block11 : {
                                            block10 : {
                                                block8 : {
                                                    block7 : {
                                                        block6 : {
                                                            if ((n3 = this.v) == 0) {
                                                                n3 = this.R();
                                                            }
                                                            if (n3 != 3) break block6;
                                                            this.B(1);
                                                            break block7;
                                                        }
                                                        if (n3 != 1) break block8;
                                                        this.B(3);
                                                    }
                                                    ++n2;
                                                    break block9;
                                                }
                                                if (n3 != 4) break block10;
                                                if (--n2 < 0) {
                                                    StringBuilder stringBuilder = a.t((String)"Expected a value but was ");
                                                    stringBuilder.append((Object)this.z());
                                                    stringBuilder.append(" at path ");
                                                    stringBuilder.append(this.q());
                                                    throw new o(stringBuilder.toString());
                                                }
                                                break block11;
                                            }
                                            if (n3 != 2) break block12;
                                            if (--n2 < 0) break block13;
                                        }
                                        --this.k;
                                        break block9;
                                    }
                                    StringBuilder stringBuilder = a.t((String)"Expected a value but was ");
                                    stringBuilder.append((Object)this.z());
                                    stringBuilder.append(" at path ");
                                    stringBuilder.append(this.q());
                                    throw new o(stringBuilder.toString());
                                }
                                if (n3 == 14 || n3 == 10) break block14;
                                if (n3 == 9 || n3 == 13) break block15;
                                if (n3 == 8 || n3 == 12) break block16;
                                if (n3 == 17) {
                                    this.u.skip((long)this.x);
                                } else if (n3 == 18) {
                                    StringBuilder stringBuilder = a.t((String)"Expected a value but was ");
                                    stringBuilder.append((Object)this.z());
                                    stringBuilder.append(" at path ");
                                    stringBuilder.append(this.q());
                                    throw new o(stringBuilder.toString());
                                }
                                break block9;
                            }
                            h2 = o;
                            break block17;
                        }
                        h2 = p;
                    }
                    this.l0(h2);
                    break block9;
                }
                this.m0();
            }
            this.v = 0;
        } while (n2 != 0);
        int[] arrn = this.n;
        int n4 = this.k;
        int n5 = n4 - 1;
        arrn[n5] = 1 + arrn[n5];
        this.m[n4 - 1] = "null";
    }

    public final void P() {
        this.L("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int R() {
        block36 : {
            block51 : {
                block53 : {
                    block44 : {
                        block54 : {
                            block40 : {
                                block45 : {
                                    block46 : {
                                        block47 : {
                                            block52 : {
                                                block48 : {
                                                    block49 : {
                                                        block50 : {
                                                            block38 : {
                                                                block43 : {
                                                                    block42 : {
                                                                        block41 : {
                                                                            block39 : {
                                                                                block37 : {
                                                                                    var1_1 = this.l;
                                                                                    var2_2 = this.k;
                                                                                    var3_3 = var1_1[var2_2 - 1];
                                                                                    var4_4 = 2;
                                                                                    if (var3_3 != 1) break block37;
                                                                                    var1_1[var2_2 - 1] = var4_4;
                                                                                    break block38;
                                                                                }
                                                                                if (var3_3 != var4_4) break block39;
                                                                                var51_5 = this.b0(true);
                                                                                this.u.readByte();
                                                                                if (var51_5 != 44) {
                                                                                    if (var51_5 == 59) {
                                                                                        this.P();
                                                                                        throw null;
                                                                                    }
                                                                                    if (var51_5 == 93) {
                                                                                        this.v = 4;
                                                                                        return 4;
                                                                                    }
                                                                                    this.L("Unterminated array");
                                                                                    throw null;
                                                                                }
                                                                                break block38;
                                                                            }
                                                                            if (var3_3 == 3 || var3_3 == 5) break block40;
                                                                            if (var3_3 != 4) break block41;
                                                                            var1_1[var2_2 - 1] = 5;
                                                                            var48_6 = this.b0(true);
                                                                            this.u.readByte();
                                                                            if (var48_6 != 58) {
                                                                                if (var48_6 != 61) {
                                                                                    this.L("Expected ':'");
                                                                                    throw null;
                                                                                }
                                                                                this.P();
                                                                                throw null;
                                                                            }
                                                                            break block38;
                                                                        }
                                                                        if (var3_3 != 6) break block42;
                                                                        var1_1[var2_2 - 1] = 7;
                                                                        break block38;
                                                                    }
                                                                    if (var3_3 != 7) break block43;
                                                                    if (this.b0(false) != -1) {
                                                                        this.P();
                                                                        throw null;
                                                                    }
                                                                    var7_7 = 18;
                                                                    break block44;
                                                                }
                                                                if (var3_3 == 9) throw null;
                                                                if (var3_3 == 8) throw new IllegalStateException("JsonReader is closed");
                                                            }
                                                            var14_8 = this.b0(true);
                                                            if (var14_8 == 34) {
                                                                this.u.readByte();
                                                                this.v = 9;
                                                                return 9;
                                                            }
                                                            if (var14_8 == 39) {
                                                                this.P();
                                                                throw null;
                                                            }
                                                            if (var14_8 == 44 || var14_8 == 59) break block45;
                                                            if (var14_8 == 91) break block46;
                                                            if (var14_8 == 93) break block47;
                                                            if (var14_8 == 123) {
                                                                this.u.readByte();
                                                                this.v = 1;
                                                                return 1;
                                                            }
                                                            var20_9 = this.u.o(0L);
                                                            if (var20_9 == 116 || var20_9 == 84) break block48;
                                                            if (var20_9 == 102 || var20_9 == 70) break block49;
                                                            if (var20_9 == 110 || var20_9 == 78) break block50;
                                                            var23_10 = 0;
                                                            break block51;
                                                        }
                                                        var21_11 = "null";
                                                        var22_12 = "NULL";
                                                        var23_10 = 7;
                                                        break block52;
                                                    }
                                                    var21_11 = "false";
                                                    var22_12 = "FALSE";
                                                    var23_10 = 6;
                                                    break block52;
                                                }
                                                var21_11 = "true";
                                                var22_12 = "TRUE";
                                                var23_10 = 5;
                                            }
                                            var24_13 = var21_11.length();
                                            var25_14 = 1;
                                            break block53;
                                        }
                                        if (var3_3 == 1) {
                                            this.u.readByte();
                                            this.v = 4;
                                            return 4;
                                        }
                                        break block45;
                                    }
                                    this.u.readByte();
                                    var7_7 = 3;
                                    break block44;
                                }
                                if (var3_3 != 1 && var3_3 != 2) {
                                    this.L("Unexpected value");
                                    throw null;
                                }
                                this.P();
                                throw null;
                            }
                            var1_1[var2_2 - 1] = 4;
                            if (var3_3 != 5) break block54;
                            var11_34 = this.b0(true);
                            this.u.readByte();
                            if (var11_34 == 44) break block54;
                            if (var11_34 == 59) {
                                this.P();
                                throw null;
                            }
                            if (var11_34 != 125) {
                                this.L("Unterminated object");
                                throw null;
                            }
                            ** GOTO lbl131
                        }
                        if ((var5_35 = this.b0(true)) != 34) {
                            if (var5_35 == 39) {
                                this.u.readByte();
                                this.P();
                                throw null;
                            }
                            if (var5_35 != 125) {
                                this.P();
                                throw null;
                            }
                            if (var3_3 == 5) {
                                this.L("Expected name");
                                throw null;
                            }
                            this.u.readByte();
lbl131: // 2 sources:
                            var7_7 = 2;
                        } else {
                            this.u.readByte();
                            var7_7 = 13;
                        }
                    }
                    this.v = var7_7;
                    return var7_7;
                }
                while (var25_14 < var24_13) {
                    var45_15 = this.t;
                    var46_16 = var25_14 + 1;
                    if (var45_15.K((long)var46_16) && ((var47_17 = this.u.o((long)var25_14)) == var21_11.charAt(var25_14) || var47_17 == var22_12.charAt(var25_14))) {
                        var25_14 = var46_16;
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                if (this.t.K((long)(var24_13 + 1)) && this.X(this.u.o((long)var24_13))) lbl-1000: // 2 sources:
                {
                    var23_10 = 0;
                } else {
                    this.u.skip((long)var24_13);
                    this.v = var23_10;
                }
            }
            if (var23_10 != 0) {
                return var23_10;
            }
            var26_18 = 0L;
            var28_19 = true;
            var29_20 = 0;
            var30_21 = 0;
            var31_22 = 0;
            do {
                block62 : {
                    block63 : {
                        block65 : {
                            block57 : {
                                block58 : {
                                    block64 : {
                                        block59 : {
                                            block60 : {
                                                block56 : {
                                                    block61 : {
                                                        block55 : {
                                                            if ((var32_23 = this.t).K((long)(var33_24 = var29_20 + 1))) break block55;
                                                            var39_31 = var4_4;
                                                            break block56;
                                                        }
                                                        var34_25 = this.u.o((long)var29_20);
                                                        if (var34_25 == 43) break block57;
                                                        if (var34_25 == 69 || var34_25 == 101) break block58;
                                                        if (var34_25 == 45) break block59;
                                                        if (var34_25 == 46) break block60;
                                                        if (var34_25 < 48 || var34_25 > 57) break block61;
                                                        if (var30_21 != 1 && var30_21 != 0) {
                                                            if (var30_21 == 2) {
                                                                if (var26_18 == 0L) break;
                                                                var41_28 = 10L * var26_18 - (long)(var34_25 - 48);
                                                                var43_29 = var26_18 LCMP -922337203685477580L;
                                                                var44_30 = var43_29 > 0 || var43_29 == false && var41_28 < var26_18;
                                                                var28_19 = var44_30 & var28_19;
                                                                var26_18 = var41_28;
                                                            } else if (var30_21 == 3) {
                                                                var30_21 = 4;
                                                            } else if (var30_21 == 5 || var30_21 == 6) {
                                                                var30_21 = 7;
                                                            }
                                                        } else {
                                                            var26_18 = -(var34_25 - 48);
                                                            var30_21 = 2;
                                                        }
                                                        break block62;
                                                    }
                                                    if (this.X(var34_25)) break;
                                                    var39_31 = 2;
                                                }
                                                if (var30_21 != var39_31) ** GOTO lbl201
                                                if (!(!var28_19 || var26_18 == Long.MIN_VALUE && var31_22 == 0 || var26_18 == 0L && var31_22 != 0)) {
                                                    if (var31_22 == 0) {
                                                        var26_18 = -var26_18;
                                                    }
                                                    this.w = var26_18;
                                                    this.u.skip((long)var29_20);
                                                    var40_32 = 16;
                                                } else {
                                                    var39_31 = 2;
lbl201: // 2 sources:
                                                    if (var30_21 != var39_31 && var30_21 != 4 && var30_21 != 7) break;
                                                    this.x = var29_20;
                                                    var40_32 = 17;
                                                }
                                                this.v = var36_33 = var40_32;
                                                break block36;
                                            }
                                            if (var30_21 != 2) break;
                                            var38_27 = 3;
                                            break block63;
                                        }
                                        var35_26 = 6;
                                        if (var30_21 != 0) break block64;
                                        var31_22 = var30_21 = 1;
                                        break block62;
                                    }
                                    if (var30_21 != 5) break;
                                    break block65;
                                }
                                if (var30_21 != 2 && var30_21 != 4) break;
                                var30_21 = 5;
                                break block62;
                            }
                            var35_26 = 6;
                            if (var30_21 != 5) break;
                        }
                        var38_27 = var35_26;
                    }
                    var30_21 = var38_27;
                }
                var29_20 = var33_24;
                var4_4 = 2;
            } while (true);
            var36_33 = 0;
        }
        if (var36_33 != 0) {
            return var36_33;
        }
        if (!this.X(this.u.o(0L))) {
            this.L("Expected value");
            throw null;
        }
        this.P();
        throw null;
    }

    public final int S(String string, r.a a2) {
        int n2 = a2.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals((Object)a2.a[i2])) continue;
            this.v = 0;
            this.m[-1 + this.k] = string;
            return i2;
        }
        return -1;
    }

    public final int U(String string, r.a a2) {
        int n2 = a2.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals((Object)a2.a[i2])) continue;
            this.v = 0;
            int[] arrn = this.n;
            int n3 = -1 + this.k;
            arrn[n3] = 1 + arrn[n3];
            return i2;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean X(int var1_1) {
        if (var1_1 == 9) return false;
        if (var1_1 == 10) return false;
        if (var1_1 == 12) return false;
        if (var1_1 == 13) return false;
        if (var1_1 == 32) return false;
        if (var1_1 == 35) ** GOTO lbl-1000
        if (var1_1 == 44) return false;
        if (var1_1 == 47 || var1_1 == 61) ** GOTO lbl-1000
        if (var1_1 == 123) return false;
        if (var1_1 == 125) return false;
        if (var1_1 == 58) return false;
        if (var1_1 == 59) ** GOTO lbl-1000
        switch (var1_1) {
            default: {
                return true;
            }
            case 92: lbl-1000: // 4 sources:
            {
                this.P();
                throw null;
            }
            case 91: 
            case 93: 
        }
        return false;
    }

    public String Y() {
        block9 : {
            String string;
            block5 : {
                int n2;
                block8 : {
                    h h2;
                    block7 : {
                        block6 : {
                            block4 : {
                                n2 = this.v;
                                if (n2 == 0) {
                                    n2 = this.R();
                                }
                                if (n2 != 14) break block4;
                                string = this.j0();
                                break block5;
                            }
                            if (n2 != 13) break block6;
                            h2 = p;
                            break block7;
                        }
                        if (n2 != 12) break block8;
                        h2 = o;
                    }
                    string = this.g0(h2);
                    break block5;
                }
                if (n2 != 15) break block9;
                string = this.y;
                this.y = null;
            }
            this.v = 0;
            this.m[-1 + this.k] = string;
            return string;
        }
        StringBuilder stringBuilder = a.t((String)"Expected a name but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    public void a() {
        int n2 = this.v;
        if (n2 == 0) {
            n2 = this.R();
        }
        if (n2 == 3) {
            this.B(1);
            this.n[this.k - 1] = 0;
            this.v = 0;
            return;
        }
        StringBuilder stringBuilder = a.t((String)"Expected BEGIN_ARRAY but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    public void b() {
        int n2 = this.v;
        if (n2 == 0) {
            n2 = this.R();
        }
        if (n2 == 1) {
            this.B(3);
            this.v = 0;
            return;
        }
        StringBuilder stringBuilder = a.t((String)"Expected BEGIN_OBJECT but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    public final int b0(boolean bl) {
        g g2;
        int n2;
        int n3 = 0;
        while ((g2 = this.t).K((long)(n2 = n3 + 1))) {
            byte by = this.u.o((long)n3);
            if (by != 10 && by != 32 && by != 13 && by != 9) {
                this.u.skip((long)(n2 - 1));
                if (by == 47) {
                    if (!this.t.K(2L)) {
                        return by;
                    }
                    this.P();
                    throw null;
                }
                if (by != 35) {
                    return by;
                }
                this.P();
                throw null;
            }
            n3 = n2;
        }
        if (!bl) {
            return -1;
        }
        throw new EOFException("End of input");
    }

    public void close() {
        this.v = 0;
        this.l[0] = 8;
        this.k = 1;
        e e2 = this.u;
        e2.skip(e2.l);
        this.t.close();
    }

    public final String g0(h h2) {
        long l2;
        StringBuilder stringBuilder = null;
        while ((l2 = this.t.s(h2)) != -1L) {
            if (this.u.o(l2) == 92) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.u.I(l2));
                this.u.readByte();
                stringBuilder.append(this.k0());
                continue;
            }
            String string = this.u.I(l2);
            if (stringBuilder == null) {
                this.u.readByte();
                return string;
            }
            stringBuilder.append(string);
            this.u.readByte();
            return stringBuilder.toString();
        }
        this.L("Unterminated string");
        throw null;
    }

    public final String j0() {
        long l2 = this.t.s(q);
        if (l2 != -1L) {
            return this.u.I(l2);
        }
        return this.u.F();
    }

    public void k() {
        int n2 = this.v;
        if (n2 == 0) {
            n2 = this.R();
        }
        if (n2 == 4) {
            int n3;
            this.k = n3 = -1 + this.k;
            int[] arrn = this.n;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
            this.v = 0;
            return;
        }
        StringBuilder stringBuilder = a.t((String)"Expected END_ARRAY but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    public final char k0() {
        block3 : {
            byte by;
            block4 : {
                block5 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                block9 : {
                                    block10 : {
                                        block11 : {
                                            if (!this.t.K(1L)) break block3;
                                            by = this.u.readByte();
                                            if (by == 10 || by == 34 || by == 39 || by == 47 || by == 92) break block4;
                                            if (by == 98) break block5;
                                            if (by == 102) break block6;
                                            if (by == 110) break block7;
                                            if (by == 114) break block8;
                                            if (by == 116) break block9;
                                            if (by != 117) break block10;
                                            if (!this.t.K(4L)) break block11;
                                            char c2 = '\u0000';
                                            for (int i2 = 0; i2 < 4; ++i2) {
                                                block16 : {
                                                    int n2;
                                                    char c3;
                                                    block13 : {
                                                        int n3;
                                                        block15 : {
                                                            byte by2;
                                                            block14 : {
                                                                block12 : {
                                                                    by2 = this.u.o((long)i2);
                                                                    c3 = (char)(c2 << 4);
                                                                    if (by2 < 48 || by2 > 57) break block12;
                                                                    n2 = by2 - 48;
                                                                    break block13;
                                                                }
                                                                if (by2 < 97 || by2 > 102) break block14;
                                                                n3 = by2 - 97;
                                                                break block15;
                                                            }
                                                            if (by2 < 65 || by2 > 70) break block16;
                                                            n3 = by2 - 65;
                                                        }
                                                        n2 = n3 + 10;
                                                    }
                                                    c2 = (char)(n2 + c3);
                                                    continue;
                                                }
                                                StringBuilder stringBuilder = a.t((String)"\\u");
                                                stringBuilder.append(this.u.I(4L));
                                                this.L(stringBuilder.toString());
                                                throw null;
                                            }
                                            this.u.skip(4L);
                                            return c2;
                                        }
                                        StringBuilder stringBuilder = a.t((String)"Unterminated escape sequence at path ");
                                        stringBuilder.append(this.q());
                                        throw new EOFException(stringBuilder.toString());
                                    }
                                    StringBuilder stringBuilder = a.t((String)"Invalid escape sequence: \\");
                                    stringBuilder.append((char)by);
                                    this.L(stringBuilder.toString());
                                    throw null;
                                }
                                return '\t';
                            }
                            return '\r';
                        }
                        return '\n';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char)by;
        }
        this.L("Unterminated escape sequence");
        throw null;
    }

    public final void l0(h h2) {
        long l2;
        while ((l2 = this.t.s(h2)) != -1L) {
            if (this.u.o(l2) == 92) {
                this.u.skip(l2 + 1L);
                this.k0();
                continue;
            }
            this.u.skip(l2 + 1L);
            return;
        }
        this.L("Unterminated string");
        throw null;
    }

    public final void m0() {
        long l2 = this.t.s(q);
        e e2 = this.u;
        if (l2 == -1L) {
            l2 = e2.l;
        }
        e2.skip(l2);
    }

    public void o() {
        int n2 = this.v;
        if (n2 == 0) {
            n2 = this.R();
        }
        if (n2 == 2) {
            int n3;
            this.k = n3 = -1 + this.k;
            this.m[n3] = null;
            int[] arrn = this.n;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
            this.v = 0;
            return;
        }
        StringBuilder stringBuilder = a.t((String)"Expected END_OBJECT but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    public boolean r() {
        int n2 = this.v;
        if (n2 == 0) {
            n2 = this.R();
        }
        return n2 != 2 && n2 != 4 && n2 != 18;
    }

    public String toString() {
        StringBuilder stringBuilder = a.t((String)"JsonReader(");
        stringBuilder.append((Object)this.t);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double u() {
        block15 : {
            double d2;
            block14 : {
                int n2;
                block13 : {
                    String string;
                    block9 : {
                        block12 : {
                            h h2;
                            block11 : {
                                block10 : {
                                    block8 : {
                                        n2 = this.v;
                                        if (n2 == 0) {
                                            n2 = this.R();
                                        }
                                        if (n2 == 16) {
                                            this.v = 0;
                                            int[] arrn = this.n;
                                            int n3 = -1 + this.k;
                                            arrn[n3] = 1 + arrn[n3];
                                            return this.w;
                                        }
                                        if (n2 != 17) break block8;
                                        string = this.u.I((long)this.x);
                                        break block9;
                                    }
                                    if (n2 != 9) break block10;
                                    h2 = p;
                                    break block11;
                                }
                                if (n2 != 8) break block12;
                                h2 = o;
                            }
                            string = this.g0(h2);
                            break block9;
                        }
                        if (n2 != 10) break block13;
                        string = this.j0();
                    }
                    this.y = string;
                    break block14;
                }
                if (n2 != 11) break block15;
            }
            this.v = 11;
            try {
                d2 = Double.parseDouble((String)this.y);
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = a.t((String)"Expected a double but was ");
                stringBuilder.append(this.y);
                stringBuilder.append(" at path ");
                stringBuilder.append(this.q());
                throw new o(stringBuilder.toString());
            }
            if (!Double.isNaN((double)d2) && !Double.isInfinite((double)d2)) {
                this.y = null;
                this.v = 0;
                int[] arrn = this.n;
                int n4 = -1 + this.k;
                arrn[n4] = 1 + arrn[n4];
                return d2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d2);
            stringBuilder.append(" at path ");
            stringBuilder.append(this.q());
            throw new p(stringBuilder.toString());
        }
        StringBuilder stringBuilder = a.t((String)"Expected a double but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    /*
     * Exception decompiling
     */
    public int v() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl152.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public <T> T w() {
        int n2 = this.v;
        if (n2 == 0) {
            n2 = this.R();
        }
        if (n2 == 7) {
            this.v = 0;
            int[] arrn = this.n;
            int n3 = -1 + this.k;
            arrn[n3] = 1 + arrn[n3];
            return null;
        }
        StringBuilder stringBuilder = a.t((String)"Expected null but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    public String y() {
        block11 : {
            String string;
            block5 : {
                int n2;
                block10 : {
                    block9 : {
                        block8 : {
                            h h2;
                            block7 : {
                                block6 : {
                                    block4 : {
                                        n2 = this.v;
                                        if (n2 == 0) {
                                            n2 = this.R();
                                        }
                                        if (n2 != 10) break block4;
                                        string = this.j0();
                                        break block5;
                                    }
                                    if (n2 != 9) break block6;
                                    h2 = p;
                                    break block7;
                                }
                                if (n2 != 8) break block8;
                                h2 = o;
                            }
                            string = this.g0(h2);
                            break block5;
                        }
                        if (n2 != 11) break block9;
                        string = this.y;
                        this.y = null;
                        break block5;
                    }
                    if (n2 != 16) break block10;
                    string = Long.toString((long)this.w);
                    break block5;
                }
                if (n2 != 17) break block11;
                string = this.u.I((long)this.x);
            }
            this.v = 0;
            int[] arrn = this.n;
            int n3 = -1 + this.k;
            arrn[n3] = 1 + arrn[n3];
            return string;
        }
        StringBuilder stringBuilder = a.t((String)"Expected a string but was ");
        stringBuilder.append((Object)this.z());
        stringBuilder.append(" at path ");
        stringBuilder.append(this.q());
        throw new o(stringBuilder.toString());
    }

    public r.b z() {
        int n2 = this.v;
        if (n2 == 0) {
            n2 = this.R();
        }
        switch (n2) {
            default: {
                throw new AssertionError();
            }
            case 18: {
                return r.b.t;
            }
            case 16: 
            case 17: {
                return r.b.q;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return r.b.o;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return r.b.p;
            }
            case 7: {
                return r.b.s;
            }
            case 5: 
            case 6: {
                return r.b.r;
            }
            case 4: {
                return r.b.l;
            }
            case 3: {
                return r.b.k;
            }
            case 2: {
                return r.b.n;
            }
            case 1: 
        }
        return r.b.m;
    }
}

