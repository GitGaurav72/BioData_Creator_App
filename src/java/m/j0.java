/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.io.Closeable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  n.g
 */
package m;

import java.io.Closeable;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.b0;
import m.m0.c;
import n.g;

public abstract class j0
implements Closeable {
    public static final a k = new a(null);

    public abstract long a();

    public abstract b0 b();

    public void close() {
        c.d((Closeable)this.k());
    }

    public abstract g k();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String o() {
        String string;
        g g2 = this.k();
        try {
            Charset charset;
            b0 b02 = this.b();
            if (b02 == null || (charset = b02.a(k.d0.a.b)) == null) {
                charset = k.d0.a.b;
            }
            string = g2.A(c.s(g2, charset));
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                e.s.a.a.R((Closeable)g2, (Throwable)throwable);
                throw throwable2;
            }
        }
        e.s.a.a.R((Closeable)g2, null);
        return string;
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

}

