/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.u.a
 *  k.u.b
 *  k.u.e
 *  k.u.e$a
 *  k.u.f$a
 *  k.u.h
 *  k.x.b.l
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  l.a.b2.e
 *  l.a.z$a
 */
package l.a;

import k.u.b;
import k.u.d;
import k.u.e;
import k.u.f;
import k.u.h;
import k.x.b.l;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.a.b2.e;
import l.a.z;

/*
 * Exception performing whole class analysis.
 */
public abstract class z
extends k.u.a
implements k.u.e {
    public static final a Key;

    public static {
        Key = new /* Unavailable Anonymous Inner Class!! */;
    }

    public z() {
        super((f.b)e.a.k);
    }

    public abstract void dispatch(f var1, Runnable var2);

    public void dispatchYield(f f2, Runnable runnable) {
        this.dispatch(f2, runnable);
    }

    public <E extends f.a> E get(f.b<E> b2) {
        z z2;
        i.e((Object)((Object)this), "this");
        i.e(b2, "key");
        if (b2 instanceof b) {
            b b3 = (b)b2;
            f.b b4 = this.getKey();
            i.e(b4, "key");
            boolean bl = b4 == b3 || b3.l == b4;
            z2 = null;
            if (bl) {
                i.e((Object)((Object)this), "element");
                f.a a2 = b3.k.invoke((Object)((Object)this));
                boolean bl2 = a2 instanceof f.a;
                z2 = null;
                if (bl2) {
                    return (E)a2;
                }
            }
        } else {
            e.a a3 = e.a.k;
            z2 = null;
            if (a3 == b2) {
                z2 = this;
            }
        }
        return (E)((Object)z2);
    }

    public final <T> d<T> interceptContinuation(d<? super T> d2) {
        return new e(this, d2);
    }

    public boolean isDispatchNeeded(f f2) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public f minusKey(f.b<?> b2) {
        i.e((Object)((Object)this), "this");
        i.e(b2, "key");
        if (!(b2 instanceof b)) {
            if (e.a.k != b2) return this;
            return h.k;
        }
        b b3 = (b)b2;
        f.b b4 = this.getKey();
        i.e(b4, "key");
        boolean bl = b4 == b3 || b3.l == b4;
        if (!bl) return this;
        i.e((Object)((Object)this), "element");
        if (b3.k.invoke((Object)((Object)this)) == null) return this;
        return h.k;
    }

    public final z plus(z z2) {
        return z2;
    }

    public final void releaseInterceptedContinuation(d<?> d2) {
        ((e)d2).n();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(e.s.a.a.w1((Object)((Object)this)));
        return stringBuilder.toString();
    }
}

