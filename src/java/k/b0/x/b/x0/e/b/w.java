/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package k.b0.x.b.x0.e.b;

public final class w {
    public static final w a;
    public static final w b;
    public static final w c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final w i;
    public final boolean j;
    public final w k;
    public final w l;
    public final boolean m;

    public static {
        w w2;
        w w3;
        w w4;
        a = w3 = new w(false, false, false, false, false, null, false, null, null, false, 1023);
        b = w4 = new w(false, false, false, false, false, null, false, null, null, true, 511);
        c = w2 = new w(false, false, false, false, false, w3, false, null, null, false, 988);
    }

    public w(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, w w2, boolean bl6, w w3, w w4, boolean bl7, int n2) {
        if ((n2 & 1) != 0) {
            bl = true;
        }
        if ((n2 & 2) != 0) {
            bl2 = true;
        }
        if ((n2 & 4) != 0) {
            bl3 = false;
        }
        if ((n2 & 8) != 0) {
            bl4 = false;
        }
        if ((n2 & 16) != 0) {
            bl5 = false;
        }
        if ((n2 & 32) != 0) {
            w2 = null;
        }
        if ((n2 & 64) != 0) {
            bl6 = true;
        }
        if ((n2 & 128) != 0) {
            w3 = w2;
        }
        if ((n2 & 256) != 0) {
            w4 = w2;
        }
        if ((n2 & 512) != 0) {
            bl7 = false;
        }
        this.d = bl;
        this.e = bl2;
        this.f = bl3;
        this.g = bl4;
        this.h = bl5;
        this.i = w2;
        this.j = bl6;
        this.k = w3;
        this.l = w4;
        this.m = bl7;
    }
}

