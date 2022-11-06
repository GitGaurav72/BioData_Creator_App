/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.a.c.f.f.e5
 *  e.p.a.c.f.f.yb
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.security.GeneralSecurityException
 *  java.security.Key
 *  javax.crypto.Mac
 *  javax.crypto.spec.SecretKeySpec
 */
package e.p.a.c.f.f;

import e.p.a.c.f.f.e5;
import e.p.a.c.f.f.yb;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class u4 {
    public final byte[] a(byte[] arrby, byte[] arrby2, String string, byte[] arrby3) {
        return this.c(e5.c((String)string, (byte[])arrby2, (byte[])arrby3), arrby);
    }

    public final byte[] b(byte[] arrby, byte[] arrby2, int n) {
        Mac mac = (Mac)yb.e.a("HmacSha256");
        if (n <= 255 * mac.getMacLength()) {
            byte[] arrby3 = new byte[n];
            mac.init((Key)new SecretKeySpec(arrby, "HmacSha256"));
            byte[] arrby4 = new byte[]{};
            int n2 = 1;
            int n3 = 0;
            do {
                mac.update(arrby4);
                mac.update(arrby2);
                mac.update((byte)n2);
                arrby4 = mac.doFinal();
                int n4 = arrby4.length;
                int n5 = n3 + n4;
                if (n5 >= n) break;
                System.arraycopy((Object)arrby4, (int)0, (Object)arrby3, (int)n3, (int)n4);
                ++n2;
                n3 = n5;
            } while (true);
            System.arraycopy((Object)arrby4, (int)0, (Object)arrby3, (int)n3, (int)(n - n3));
            return arrby3;
        }
        throw new GeneralSecurityException("size too large");
    }

    public final byte[] c(byte[] arrby, byte[] arrby2) {
        Mac mac = (Mac)yb.e.a("HmacSha256");
        if (arrby2 != null && arrby2.length != 0) {
            mac.init((Key)new SecretKeySpec(arrby2, "HmacSha256"));
        } else {
            mac.init((Key)new SecretKeySpec(new byte[mac.getMacLength()], "HmacSha256"));
        }
        return mac.doFinal(arrby);
    }
}

