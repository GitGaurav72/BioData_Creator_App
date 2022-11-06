/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.a.c.b.a
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package e.p.a.c.f.f;

import e.p.a.c.b.a;
import java.util.Arrays;

public final class w1
implements Comparable {
    public final byte[] k;

    public /* synthetic */ w1(byte[] arrby) {
        this.k = Arrays.copyOf((byte[])arrby, (int)arrby.length);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof w1)) {
            return false;
        }
        w1 w12 = (w1)object;
        return Arrays.equals((byte[])this.k, (byte[])w12.k);
    }

    public final int hashCode() {
        return Arrays.hashCode((byte[])this.k);
    }

    public final String toString() {
        return a.d1((byte[])this.k);
    }
}

