/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 */
package e.k.a.n;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface n {
    public static final Charset a = Charset.forName((String)"UTF-8");

    public void a(@NonNull MessageDigest var1);

    public boolean equals(Object var1);

    public int hashCode();
}

