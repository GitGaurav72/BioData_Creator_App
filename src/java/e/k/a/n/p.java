/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  e.e.a.a.a
 *  e.k.a.n.p$a
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.MessageDigest
 *  java.util.Objects
 */
package e.k.a.n;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.k.a.n.p;
import java.security.MessageDigest;
import java.util.Objects;

public final class p<T> {
    public static final b<Object> a = new a();
    public final T b;
    public final b<T> c;
    public final String d;
    public volatile byte[] e;

    public p(@NonNull String string, @Nullable T t, @NonNull b<T> b2) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.d = string;
            this.b = t;
            Objects.requireNonNull(b2, (String)"Argument must not be null");
            this.c = b2;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    public static <T> p<T> a(@NonNull String string, @NonNull T t) {
        return new p<Object>(string, t, a);
    }

    public boolean equals(Object object) {
        if (object instanceof p) {
            p p2 = (p)object;
            return this.d.equals((Object)p2.d);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Option{key='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static interface b<T> {
        public void a(@NonNull byte[] var1, @NonNull T var2, @NonNull MessageDigest var3);
    }

}

