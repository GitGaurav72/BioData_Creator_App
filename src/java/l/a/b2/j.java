/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package l.a.b2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.a.b2.k;
import l.a.b2.q;

public class j<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    private volatile /* synthetic */ Object _cur;

    public static {
        a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, (String)"_cur");
    }

    public j(boolean bl) {
        this._cur = new k(8, bl);
    }

    public final boolean a(E e2) {
        k k2;
        int n2;
        while ((n2 = (k2 = (k)this._cur).a(e2)) != 0) {
            if (n2 != 1) {
                if (n2 != 2) continue;
                return false;
            }
            a.compareAndSet((Object)this, (Object)k2, k2.e());
        }
        return true;
    }

    public final void b() {
        k k2;
        while (!(k2 = (k)this._cur).b()) {
            a.compareAndSet((Object)this, (Object)k2, k2.e());
        }
        return;
    }

    public final int c() {
        return ((k)this._cur).c();
    }

    public final E d() {
        k k2;
        Object object;
        while ((object = (k2 = (k)this._cur).f()) == k.d) {
            a.compareAndSet((Object)this, (Object)k2, k2.e());
        }
        return (E)object;
    }
}

