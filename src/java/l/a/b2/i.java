/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  l.a.b2.i$a
 */
package l.a.b2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.a.b2.i;
import l.a.b2.n;
import l.a.b2.o;

public class i {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ AtomicReferenceFieldUpdater m;
    public volatile /* synthetic */ Object _next;
    public volatile /* synthetic */ Object _prev;
    private volatile /* synthetic */ Object _removedRef;

    public static {
        k = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, (String)"_next");
        l = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, (String)"_prev");
        m = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, (String)"_removedRef");
    }

    public i() {
        this._next = this;
        this._prev = this;
        this._removedRef = null;
    }

    public final boolean i(i i2, i i3) {
        l.lazySet((Object)i2, (Object)this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        atomicReferenceFieldUpdater.lazySet((Object)i2, (Object)i3);
        if (!atomicReferenceFieldUpdater.compareAndSet((Object)this, (Object)i3, (Object)i2)) {
            return false;
        }
        i2.k(i3);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final i j(n var1_1) {
        block0 : do {
            var3_3 = var2_2 = (i)this._prev;
            block1 : do {
                var4_4 = null;
                do {
                    if ((var5_5 = var3_3._next) == this) {
                        if (var2_2 == var3_3) {
                            return var3_3;
                        }
                        if (i.l.compareAndSet((Object)this, (Object)var2_2, (Object)var3_3) != false) return var3_3;
                        continue block0;
                    }
                    if (this.s()) {
                        return null;
                    }
                    if (var5_5 == null) {
                        return var3_3;
                    }
                    if (var5_5 instanceof n) {
                        ((n)var5_5).a(var3_3);
                        continue block0;
                    }
                    if (var5_5 instanceof o) {
                        if (var4_4 != null) {
                            if (i.k.compareAndSet((Object)var4_4, (Object)var3_3, (Object)((o)var5_5).a)) ** break;
                            continue block0;
                            var3_3 = var4_4;
                            continue block1;
                        }
                        var3_3 = (i)var3_3._prev;
                        continue;
                    }
                    var6_6 = (i)var5_5;
                    var4_4 = var3_3;
                    var3_3 = var6_6;
                } while (true);
                break;
            } while (true);
            break;
        } while (true);
    }

    public final void k(i i2) {
        i i3;
        do {
            i3 = (i)i2._prev;
            if (this.l() == i2) continue;
            return;
        } while (!l.compareAndSet((Object)i2, (Object)i3, (Object)this));
        if (this.s()) {
            i2.j(null);
        }
    }

    public final Object l() {
        Object object;
        while ((object = this._next) instanceof n) {
            ((n)object).a(this);
        }
        return object;
    }

    public final i n() {
        Object object = this.l();
        o o2 = object instanceof o ? (o)object : null;
        if (o2 == null) {
            return (i)object;
        }
        return o2.a;
    }

    public final i o() {
        i i2 = this.j(null);
        if (i2 == null) {
            i i3 = (i)this._prev;
            do {
                if (!i3.s()) {
                    return i3;
                }
                i3 = (i)i3._prev;
            } while (true);
        }
        return i2;
    }

    public final void p() {
        ((o)this.l()).a.q();
    }

    public final void q() {
        i i2 = this;
        do {
            Object object;
            if (!((object = i2.l()) instanceof o)) {
                i2.j(null);
                return;
            }
            i2 = ((o)object).a;
        } while (true);
    }

    public boolean s() {
        return this.l() instanceof o;
    }

    public boolean t() {
        return this.u() == null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append((Object)Integer.toHexString((int)System.identityHashCode((Object)this)));
        return stringBuilder.toString();
    }

    public final i u() {
        i i2;
        Object object;
        o o2;
        do {
            if ((object = this.l()) instanceof o) {
                return ((o)object).a;
            }
            if (object == this) {
                return (i)object;
            }
            i2 = (i)object;
            o2 = (o)i2._removedRef;
            if (o2 != null) continue;
            o2 = new o(i2);
            m.lazySet((Object)i2, (Object)o2);
        } while (!k.compareAndSet((Object)this, object, (Object)o2));
        i2.j(null);
        return null;
    }

    public final int v(i i2, i i3, a a2) {
        l.lazySet((Object)i2, (Object)this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        atomicReferenceFieldUpdater.lazySet((Object)i2, (Object)i3);
        a2.c = i3;
        if (!atomicReferenceFieldUpdater.compareAndSet((Object)this, (Object)i3, (Object)a2)) {
            return 0;
        }
        if (a2.a((Object)this) == null) {
            return 1;
        }
        return 2;
    }
}

