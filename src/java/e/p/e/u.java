/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.e.f0.r
 *  e.p.e.p
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.math.BigInteger
 *  java.util.Objects
 */
package e.p.e;

import e.p.e.f0.r;
import e.p.e.p;
import java.math.BigInteger;
import java.util.Objects;

public final class u
extends p {
    public final Object a;

    public u(Boolean bl) {
        Objects.requireNonNull((Object)bl);
        this.a = bl;
    }

    public u(Number number) {
        Objects.requireNonNull((Object)number);
        this.a = number;
    }

    public u(String string) {
        Objects.requireNonNull((Object)string);
        this.a = string;
    }

    public static boolean H(u u2) {
        Number number;
        Object object = u2.a;
        return object instanceof Number && ((number = (Number)object) instanceof BigInteger || number instanceof Long || number instanceof Integer || number instanceof Short || number instanceof Byte);
    }

    public boolean F() {
        Object object = this.a;
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return Boolean.parseBoolean((String)this.r());
    }

    public Number G() {
        Object object = this.a;
        if (object instanceof String) {
            return new r((String)this.a);
        }
        return (Number)object;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (object != null) {
            if (u.class != object.getClass()) {
                return false;
            }
            u u2 = (u)((Object)object);
            if (this.a == null) {
                if (u2.a == null) {
                    return bl;
                }
                return false;
            }
            if (u.H(this) && u.H(u2)) {
                if (this.G().longValue() == u2.G().longValue()) {
                    return bl;
                }
                return false;
            }
            Object object2 = this.a;
            if (object2 instanceof Number && u2.a instanceof Number) {
                double d2;
                double d3 = this.G().doubleValue();
                if (d3 != (d2 = u2.G().doubleValue())) {
                    if (Double.isNaN((double)d3) && Double.isNaN((double)d2)) {
                        return bl;
                    }
                    bl = false;
                }
                return bl;
            }
            return object2.equals(u2.a);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int hashCode() {
        long l2;
        if (this.a == null) {
            return 31;
        }
        if (u.H(this)) {
            l2 = this.G().longValue();
            do {
                return (int)(l2 ^ l2 >>> 32);
                break;
            } while (true);
        }
        Object object = this.a;
        if (!(object instanceof Number)) return object.hashCode();
        l2 = Double.doubleToLongBits((double)this.G().doubleValue());
        return (int)(l2 ^ l2 >>> 32);
    }

    public long n() {
        if (this.a instanceof Number) {
            return this.G().longValue();
        }
        return Long.parseLong((String)this.r());
    }

    public String r() {
        Object object = this.a;
        if (object instanceof Number) {
            return this.G().toString();
        }
        if (object instanceof Boolean) {
            return ((Boolean)object).toString();
        }
        return (String)object;
    }
}

