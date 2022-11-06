/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package l.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class t {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a;
    private volatile /* synthetic */ int _handled;
    public final Throwable b;

    public static {
        a = AtomicIntegerFieldUpdater.newUpdater(t.class, (String)"_handled");
    }

    public t(Throwable throwable, boolean bl) {
        this.b = throwable;
        this._handled = bl ? 1 : 0;
    }

    public t(Throwable throwable, boolean bl, int n2) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        this.b = throwable;
        this._handled = bl ? 1 : 0;
    }

    public final boolean a() {
        return (boolean)this._handled;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append((Object)this.b);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

