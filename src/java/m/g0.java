/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  m.g0$a$a
 *  n.f
 */
package m;

import java.nio.charset.Charset;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.b0;
import m.g0;
import m.m0.c;
import n.f;

public abstract class g0 {
    public static final a a = new a(null);

    public static final g0 c(b0 b02, String string) {
        i.e(string, "content");
        i.e(string, "$this$toRequestBody");
        Charset charset = k.d0.a.b;
        if (b02 != null) {
            Charset charset2 = b02.a(null);
            if (charset2 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)b02);
                stringBuilder.append("; charset=utf-8");
                b02 = b0.a.b(stringBuilder.toString());
            } else {
                charset = charset2;
            }
        }
        byte[] arrby = string.getBytes(charset);
        i.d(arrby, "(this as java.lang.String).getBytes(charset)");
        int n2 = arrby.length;
        i.e(arrby, "$this$toRequestBody");
        c.c(arrby.length, 0, n2);
        return new a.a(arrby, b02, n2, 0);
    }

    public abstract long a();

    public abstract b0 b();

    public abstract void d(f var1);

    public static final class m.g0$a {
        public m.g0$a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ g0 b(m.g0$a a2, byte[] arrby, b0 b02, int n2, int n3, int n4) {
            if ((n4 & 1) != 0) {
                b02 = null;
            }
            if ((n4 & 2) != 0) {
                n2 = 0;
            }
            if ((n4 & 4) != 0) {
                n3 = arrby.length;
            }
            return a2.a(arrby, b02, n2, n3);
        }

        public final g0 a(byte[] arrby, b0 b02, int n2, int n3) {
            i.e(arrby, "$this$toRequestBody");
            c.c(arrby.length, n2, n3);
            return new a(arrby, b02, n3, n2);
        }
    }

}

