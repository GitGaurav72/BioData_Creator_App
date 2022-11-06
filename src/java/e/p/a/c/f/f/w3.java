/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.a.c.f.f.yb
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  javax.crypto.Cipher
 */
package e.p.a.c.f.f;

import e.p.a.c.f.f.yb;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public final class w3
extends ThreadLocal {
    public final Object initialValue() {
        try {
            Cipher cipher = (Cipher)yb.d.a("AES/GCM-SIV/NoPadding");
            return cipher;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new IllegalStateException((Throwable)generalSecurityException);
        }
    }
}

