/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Set
 *  k.b0.x.b.x0.e.a.q0.g
 *  k.b0.x.b.x0.e.a.q0.t
 */
package k.b0.x.b.x0.e.a;

import java.util.Arrays;
import java.util.Set;
import k.b0.x.b.x0.e.a.q0.g;
import k.b0.x.b.x0.e.a.q0.t;
import k.b0.x.b.x0.g.b;
import k.b0.x.b.x0.g.c;
import k.x.c.i;

public interface r {
    public g a(a var1);

    public t b(c var1);

    public Set<String> c(c var1);

    public static final class a {
        public final b a;
        public final byte[] b;
        public final g c;

        public a(b b2, byte[] arrby, g g2, int n2) {
            n2 & 2;
            if ((n2 & 4) != 0) {
                g2 = null;
            }
            i.e(b2, "classId");
            this.a = b2;
            this.b = null;
            this.c = g2;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            a a2 = (a)object;
            if (!i.a(this.a, a2.a)) {
                return false;
            }
            if (!i.a(this.b, a2.b)) {
                return false;
            }
            return i.a((Object)this.c, (Object)a2.c);
        }

        public int hashCode() {
            int n2 = 31 * this.a.hashCode();
            byte[] arrby = this.b;
            int n3 = arrby == null ? 0 : Arrays.hashCode((byte[])arrby);
            int n4 = 31 * (n2 + n3);
            g g2 = this.c;
            int n5 = g2 == null ? 0 : g2.hashCode();
            return n4 + n5;
        }

        public String toString() {
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"Request(classId=");
            stringBuilder.append((Object)this.a);
            stringBuilder.append(", previouslyFoundClassFileContent=");
            stringBuilder.append(Arrays.toString((byte[])this.b));
            stringBuilder.append(", outerClass=");
            stringBuilder.append((Object)this.c);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

}

