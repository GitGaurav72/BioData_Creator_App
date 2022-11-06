/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package k.b0.x.b.y0;

import java.io.Serializable;

public final class e<K, V>
implements Serializable {
    public final K k;
    public final V l;

    public e(K k2, V v2) {
        this.k = k2;
        this.l = v2;
    }

    public boolean equals(Object object) {
        boolean bl;
        block5 : {
            block8 : {
                V v2;
                V v3;
                block7 : {
                    e e2;
                    block6 : {
                        K k2;
                        block4 : {
                            if (!(object instanceof e)) {
                                return false;
                            }
                            e2 = (e)object;
                            k2 = this.k;
                            if (k2 != null) break block4;
                            K k3 = e2.k;
                            bl = false;
                            if (k3 != null) break block5;
                            break block6;
                        }
                        boolean bl2 = k2.equals(e2.k);
                        bl = false;
                        if (!bl2) break block5;
                    }
                    v2 = this.l;
                    v3 = e2.l;
                    if (v2 != null) break block7;
                    bl = false;
                    if (v3 != null) break block5;
                    break block8;
                }
                boolean bl3 = v2.equals(v3);
                bl = false;
                if (!bl3) break block5;
            }
            bl = true;
        }
        return bl;
    }

    public int hashCode() {
        K k2 = this.k;
        int n2 = k2 == null ? 0 : k2.hashCode();
        V v2 = this.l;
        int n3 = v2 == null ? 0 : v2.hashCode();
        return n2 ^ n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.k);
        stringBuilder.append("=");
        stringBuilder.append(this.l);
        return stringBuilder.toString();
    }
}

