/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.u.e
 *  k.u.e$a
 *  k.u.f$a
 *  l.a.h0
 *  l.a.v1
 *  l.a.w1
 *  l.a.z
 */
package l.a;

import e.s.a.a;
import k.u.e;
import k.u.f;
import k.u.j.a.d;
import l.a.b0;
import l.a.h0;
import l.a.j0;
import l.a.v1;
import l.a.w1;
import l.a.z;

public final class x {
    public static final boolean a;

    public static {
        boolean bl;
        block6 : {
            block2 : {
                String string;
                block5 : {
                    block3 : {
                        block4 : {
                            string = a.a4((String)"kotlinx.coroutines.scheduler");
                            if (string == null) break block2;
                            int n2 = string.hashCode();
                            if (n2 == 0) break block3;
                            if (n2 == 3551) break block4;
                            if (n2 != 109935 || !string.equals((Object)"off")) break block5;
                            bl = false;
                            break block6;
                        }
                        if (!string.equals((Object)"on")) break block5;
                        break block2;
                    }
                    if (string.equals((Object)"")) break block2;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("System property 'kotlinx.coroutines.scheduler' has unrecognized value '");
                stringBuilder.append((Object)string);
                stringBuilder.append('\'');
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            bl = true;
        }
        a = bl;
    }

    public static final f a(b0 b02, f f2) {
        z z2;
        f f3 = b02.getCoroutineContext().plus(f2);
        if (f3 != (z2 = j0.a) && f3.get(e.a.k) == null) {
            f3 = f3.plus((f)z2);
        }
        return f3;
    }

    public static final v1<?> b(k.u.d<?> d2, f f2, Object object) {
        v1 v12;
        block6 : {
            if (!(d2 instanceof d)) {
                return null;
            }
            boolean bl = f2.get(w1.k) != null;
            if (!bl) {
                return null;
            }
            d d3 = (d)((Object)d2);
            do {
                if (d3 instanceof h0) {
                    v12 = null;
                } else {
                    if ((d3 = d3.getCallerFrame()) != null) continue;
                    v12 = null;
                }
                break block6;
            } while (!(d3 instanceof v1));
            v12 = (v1)d3;
        }
        if (v12 == null) {
            return v12;
        }
        v12.n = f2;
        v12.o = object;
        return v12;
    }
}

