/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.q.a.v
 *  e.q.a.w
 *  java.io.IOException
 *  java.lang.Byte
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 */
package e.q.a;

import e.e.a.a.a;
import e.q.a.v;
import e.q.a.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class u
extends v {
    public Object[] r = new Object[32];
    public String s;

    public u() {
        this.y(6);
    }

    public v B(long l2) {
        if (this.p) {
            this.p = false;
            this.u(Long.toString((long)l2));
            return this;
        }
        this.L(l2);
        int[] arrn = this.n;
        int n2 = -1 + this.k;
        arrn[n2] = 1 + arrn[n2];
        return this;
    }

    public v F(Number number) {
        if (!(number instanceof Byte || number instanceof Short || number instanceof Integer || number instanceof Long)) {
            return this.z(number.doubleValue());
        }
        return this.B(number.longValue());
    }

    public v I(String string) {
        if (this.p) {
            this.p = false;
            this.u(string);
            return this;
        }
        this.L(string);
        int[] arrn = this.n;
        int n2 = -1 + this.k;
        arrn[n2] = 1 + arrn[n2];
        return this;
    }

    public v J(boolean bl) {
        if (!this.p) {
            this.L(bl);
            int[] arrn = this.n;
            int n2 = -1 + this.k;
            arrn[n2] = 1 + arrn[n2];
            return this;
        }
        StringBuilder stringBuilder = a.t((String)"Boolean cannot be used as a map key in JSON at path ");
        stringBuilder.append(this.r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final u L(Object object) {
        String string;
        int n2 = this.w();
        int n3 = this.k;
        if (n3 == 1) {
            if (n2 == 6) {
                this.l[n3 - 1] = 7;
                this.r[n3 - 1] = object;
                return this;
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        }
        if (n2 == 3 && (string = this.s) != null) {
            Object object2;
            if (object == null && !this.o || (object2 = ((Map)this.r[n3 - 1]).put((Object)string, object)) == null) {
                this.s = null;
                return this;
            }
            StringBuilder stringBuilder = a.t((String)"Map key '");
            stringBuilder.append(this.s);
            stringBuilder.append("' has multiple values at path ");
            stringBuilder.append(this.r());
            stringBuilder.append(": ");
            stringBuilder.append(object2);
            stringBuilder.append(" and ");
            stringBuilder.append(object);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (n2 == 1) {
            ((List)this.r[n3 - 1]).add(object);
            return this;
        }
        if (n2 == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public v a() {
        if (!this.p) {
            int n2 = this.k;
            int n3 = this.q;
            if (n2 == n3 && this.l[n2 - 1] == 1) {
                this.q = n3;
                return this;
            }
            this.k();
            ArrayList arrayList = new ArrayList();
            this.L((Object)arrayList);
            Object[] arrobject = this.r;
            int n4 = this.k;
            arrobject[n4] = arrayList;
            this.n[n4] = 0;
            this.y(1);
            return this;
        }
        StringBuilder stringBuilder = a.t((String)"Array cannot be used as a map key in JSON at path ");
        stringBuilder.append(this.r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public v b() {
        if (!this.p) {
            int n2 = this.k;
            int n3 = this.q;
            if (n2 == n3 && this.l[n2 - 1] == 3) {
                this.q = n3;
                return this;
            }
            this.k();
            w w2 = new w();
            this.L((Object)w2);
            this.r[this.k] = w2;
            this.y(3);
            return this;
        }
        StringBuilder stringBuilder = a.t((String)"Object cannot be used as a map key in JSON at path ");
        stringBuilder.append(this.r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        int n2 = this.k;
        if (n2 <= 1 && (n2 != 1 || this.l[n2 - 1] == 7)) {
            this.k = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
        if (this.k != 0) {
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public v o() {
        if (this.w() == 1) {
            int n2;
            int n3 = this.k;
            int n4 = this.q;
            if (n3 == n4) {
                this.q = n4;
                return this;
            }
            this.k = n2 = n3 - 1;
            this.r[n2] = null;
            int[] arrn = this.n;
            int n5 = n2 - 1;
            arrn[n5] = 1 + arrn[n5];
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public v q() {
        if (this.w() == 3) {
            if (this.s == null) {
                int n2;
                int n3 = this.k;
                int n4 = this.q;
                if (n3 == n4) {
                    this.q = n4;
                    return this;
                }
                this.p = false;
                this.k = n2 = n3 - 1;
                this.r[n2] = null;
                this.m[n2] = null;
                int[] arrn = this.n;
                int n5 = n2 - 1;
                arrn[n5] = 1 + arrn[n5];
                return this;
            }
            StringBuilder stringBuilder = a.t((String)"Dangling name: ");
            stringBuilder.append(this.s);
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public v u(String string) {
        Objects.requireNonNull((Object)string, (String)"name == null");
        if (this.k != 0) {
            if (this.w() == 3 && this.s == null && !this.p) {
                this.s = string;
                this.m[-1 + this.k] = string;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public v v() {
        if (!this.p) {
            this.L(null);
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
        if (!Double.isNaN((double)d2) && d2 != Double.NEGATIVE_INFINITY && d2 != Double.POSITIVE_INFINITY) {
            if (this.p) {
                this.p = false;
                this.u(Double.toString((double)d2));
                return this;
            }
            this.L(d2);
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

