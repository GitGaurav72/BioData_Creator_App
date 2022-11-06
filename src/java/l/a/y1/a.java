/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.concurrent.CancellationException
 *  k.u.f$a
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  l.a.a1
 *  l.a.a1$a
 */
package l.a.y1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import k.u.f;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.a.a1;
import l.a.j0;
import l.a.j1;
import l.a.y1.b;
import l.a.z;

public final class a
extends b {
    private volatile a _immediate;
    public final Handler k;
    public final String l;
    public final boolean m;
    public final a n;

    public a(Handler handler, String string, boolean bl) {
        a a2;
        super(null);
        this.k = handler;
        this.l = string;
        this.m = bl;
        a a3 = null;
        if (bl) {
            a3 = this;
        }
        if ((a2 = (this._immediate = a3)) == null) {
            this._immediate = a2 = new a(handler, string, true);
        }
        this.n = a2;
    }

    @Override
    public j1 B() {
        return this.n;
    }

    @Override
    public void dispatch(f f2, Runnable runnable) {
        if (!this.k.post(runnable)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The task was rejected, the handler underlying the dispatcher '");
            stringBuilder.append((Object)this);
            stringBuilder.append("' was closed");
            CancellationException cancellationException = new CancellationException(stringBuilder.toString());
            a1 a12 = (a1)f2.get(a1.a.k);
            if (a12 != null) {
                a12.a(cancellationException);
            }
            j0.b.dispatch(f2, runnable);
        }
    }

    public boolean equals(Object object) {
        return object instanceof a && ((a)object).k == this.k;
    }

    public int hashCode() {
        return System.identityHashCode((Object)this.k);
    }

    @Override
    public boolean isDispatchNeeded(f f2) {
        return !this.m || !i.a((Object)Looper.myLooper(), (Object)this.k.getLooper());
        {
        }
    }

    @Override
    public String toString() {
        String string = this.F();
        if (string == null) {
            string = this.l;
            if (string == null) {
                string = this.k.toString();
            }
            if (this.m) {
                string = i.k(string, ".immediate");
            }
        }
        return string;
    }
}

