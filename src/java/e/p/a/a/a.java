/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package e.p.a.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

public final class a {
    public final String a;

    public a(@NonNull String string) {
        Objects.requireNonNull((Object)string, (String)"name is null");
        this.a = string;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        return this.a.equals((Object)((a)object).a);
    }

    public int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    @NonNull
    public String toString() {
        return e.e.a.a.a.q((StringBuilder)e.e.a.a.a.t((String)"Encoding{name=\""), (String)this.a, (String)"\"}");
    }
}

