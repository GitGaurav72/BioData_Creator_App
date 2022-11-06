/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.q.a.v
 *  java.io.IOException
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  n.f
 */
package e.q.a;

import e.e.a.a.a;
import e.q.a.v;
import java.io.IOException;
import java.util.Objects;
import n.f;

public final class t
extends v {
    public static final String[] r = new String[128];
    public final f s;
    public String t;

    public static {
        for (int i2 = 0; i2 <= 31; ++i2) {
            String[] arrstring = r;
            Object[] arrobject = new Object[]{i2};
            arrstring[i2] = String.format((String)"\\u%04x", (Object[])arrobject);
        }
        String[] arrstring = r;
        arrstring[34] = "\\\"";
        arrstring[92] = "\\\\";
        arrstring[9] = "\\t";
        arrstring[8] = "\\b";
        arrstring[10] = "\\n";
        arrstring[13] = "\\r";
        arrstring[12] = "\\f";
    }

    public t(f f2) {
        Objects.requireNonNull((Object)f2, (String)"sink == null");
        this.s = f2;
        this.y(6);
    }

    public static void S(f f2, String string) {
        String[] arrstring = r;
        f2.n(34);
        int n2 = string.length();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2;
            char c2 = string.charAt(i2);
            if (c2 < '') {
                string2 = arrstring[c2];
                if (string2 == null) {
                    continue;
                }
            } else if (c2 == '\u2028') {
                string2 = "\\u2028";
            } else {
                if (c2 != '\u2029') continue;
                string2 = "\\u2029";
            }
            if (n3 < i2) {
                f2.E(string, n3, i2);
            }
            f2.x(string2);
            n3 = i2 + 1;
        }
        if (n3 < n2) {
            f2.E(string, n3, n2);
        }
        f2.n(34);
    }

    public v B(long l2) {
        if (this.p) {
            this.p = false;
            this.u(Long.toString((long)l2));
            return this;
        }
        this.U();
        this.L();
        this.s.x(Long.toString((long)l2));
        int[] arrn = this.n;
        int n2 = -1 + this.k;
        arrn[n2] = 1 + arrn[n2];
        return this;
    }

    public v F(Number number) {
        String string = number.toString();
        if (!(string.equals((Object)"-Infinity") || string.equals((Object)"Infinity") || string.equals((Object)"NaN"))) {
            if (this.p) {
                this.p = false;
                this.u(string);
                return this;
            }
            this.U();
            this.L();
            this.s.x(string);
            int[] arrn = this.n;
            int n2 = -1 + this.k;
            arrn[n2] = 1 + arrn[n2];
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Numeric values must be finite, but was ");
        stringBuilder.append((Object)number);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public v I(String string) {
        if (string == null) {
            this.v();
            return this;
        }
        if (this.p) {
            this.p = false;
            this.u(string);
            return this;
        }
        this.U();
        this.L();
        t.S(this.s, string);
        int[] arrn = this.n;
        int n2 = -1 + this.k;
        arrn[n2] = 1 + arrn[n2];
        return this;
    }

    public v J(boolean bl) {
        if (!this.p) {
            this.U();
            this.L();
            f f2 = this.s;
            String string = bl ? "true" : "false";
            f2.x(string);
            int[] arrn = this.n;
            int n2 = -1 + this.k;
            arrn[n2] = 1 + arrn[n2];
            return this;
        }
        StringBuilder stringBuilder = a.t((String)"Boolean cannot be used as a map key in JSON at path ");
        stringBuilder.append(this.r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void L() {
        var1_1 = this.w();
        var2_2 = 7;
        if (var1_1 == 1) ** GOTO lbl15
        if (var1_1 != 2) {
            if (var1_1 != 4) {
                if (var1_1 == 9) throw new IllegalStateException("Sink from valueSink() was not closed");
                if (var1_1 != 6) {
                    if (var1_1 != var2_2) throw new IllegalStateException("Nesting problem.");
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            } else {
                var2_2 = 5;
                this.s.x(":");
            }
        } else {
            this.s.n(44);
lbl15: // 2 sources:
            var2_2 = 2;
        }
        this.l[-1 + this.k] = var2_2;
    }

    public final v P(int n2, int n3, char c2) {
        int n4 = this.w();
        if (n4 != n3 && n4 != n2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.t == null) {
            int n5;
            int n6 = this.k;
            int n7 = this.q;
            if (n6 == n7) {
                this.q = n7;
                return this;
            }
            this.k = n5 = n6 - 1;
            this.m[n5] = null;
            int[] arrn = this.n;
            int n8 = n5 - 1;
            arrn[n8] = 1 + arrn[n8];
            this.s.n((int)c2);
            return this;
        }
        StringBuilder stringBuilder = a.t((String)"Dangling name: ");
        stringBuilder.append(this.t);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final v R(int n2, int n3, char c2) {
        int[] arrn;
        int n4;
        int n5 = this.k;
        int n6 = this.q;
        if (n5 == n6 && ((arrn = this.l)[n5 - 1] == n2 || arrn[n5 - 1] == n3)) {
            this.q = n6;
            return this;
        }
        this.L();
        this.k();
        int[] arrn2 = this.l;
        int n7 = this.k;
        this.k = n4 = n7 + 1;
        arrn2[n7] = n2;
        this.n[n4 - 1] = 0;
        this.s.n((int)c2);
        return this;
    }

    public final void U() {
        block2 : {
            block5 : {
                block4 : {
                    int n2;
                    block3 : {
                        if (this.t == null) break block2;
                        n2 = this.w();
                        if (n2 != 5) break block3;
                        this.s.n(44);
                        break block4;
                    }
                    if (n2 != 3) break block5;
                }
                this.l[-1 + this.k] = 4;
                t.S(this.s, this.t);
                this.t = null;
                return;
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    public v a() {
        if (!this.p) {
            this.U();
            this.R(1, 2, '[');
            return this;
        }
        StringBuilder stringBuilder = a.t((String)"Array cannot be used as a map key in JSON at path ");
        stringBuilder.append(this.r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public v b() {
        if (!this.p) {
            this.U();
            this.R(3, 5, '{');
            return this;
        }
        StringBuilder stringBuilder = a.t((String)"Object cannot be used as a map key in JSON at path ");
        stringBuilder.append(this.r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        this.s.close();
        int n2 = this.k;
        if (n2 <= 1 && (n2 != 1 || this.l[n2 - 1] == 7)) {
            this.k = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
        if (this.k != 0) {
            this.s.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public v o() {
        this.P(1, 2, ']');
        return this;
    }

    public v q() {
        this.p = false;
        this.P(3, 5, '}');
        return this;
    }

    public v u(String string) {
        Objects.requireNonNull((Object)string, (String)"name == null");
        if (this.k != 0) {
            int n2 = this.w();
            if (!(n2 != 3 && n2 != 5 || this.t != null || this.p)) {
                this.t = string;
                this.m[-1 + this.k] = string;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public v v() {
        if (!this.p) {
            if (this.t != null) {
                if (this.o) {
                    this.U();
                } else {
                    this.t = null;
                    return this;
                }
            }
            this.L();
            this.s.x("null");
            int[] arrn = this.n;
            int n2 = -1 + this.k;
            arrn[n2] = 1 + arrn[n2];
            return this;
        }
        StringBuilder stringBuilder = a.t((String)"null cannot be used as a map key in JSON at path ");
        stringBuilder.append(this.r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public v z(double d2) {
        if (!Double.isNaN((double)d2) && !Double.isInfinite((double)d2)) {
            if (this.p) {
                this.p = false;
                this.u(Double.toString((double)d2));
                return this;
            }
            this.U();
            this.L();
            this.s.x(Double.toString((double)d2));
            int[] arrn = this.n;
            int n2 = -1 + this.k;
            arrn[n2] = 1 + arrn[n2];
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Numeric values must be finite, but was ");
        stringBuilder.append(d2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

