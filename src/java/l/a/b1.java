/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  l.a.a1
 */
package l.a;

import java.util.concurrent.CancellationException;
import k.x.c.i;
import l.a.a1;

public final class b1
extends CancellationException {
    public final a1 k;

    public b1(String string, Throwable throwable, a1 a12) {
        super(string);
        this.k = a12;
        if (throwable != null) {
            this.initCause(throwable);
        }
    }

    public boolean equals(Object object) {
        b1 b12;
        return object == this || object instanceof b1 && i.a((b12 = (b1)((Object)object)).getMessage(), this.getMessage()) && i.a((Object)b12.k, (Object)this.k) && i.a((Object)b12.getCause(), (Object)this.getCause());
        {
        }
    }

    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String string = this.getMessage();
        i.c(string);
        int n2 = 31 * (31 * string.hashCode() + this.k.hashCode());
        Throwable throwable = this.getCause();
        int n3 = throwable == null ? 0 : throwable.hashCode();
        return n2 + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("; job=");
        stringBuilder.append((Object)this.k);
        return stringBuilder.toString();
    }
}

