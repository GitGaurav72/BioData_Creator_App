/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  l.a.f1
 *  l.a.k1
 *  l.a.m0
 *  l.a.v
 */
package l.a;

import e.s.a.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.a.b2.i;
import l.a.f1;
import l.a.g1;
import l.a.k0;
import l.a.k1;
import l.a.m0;
import l.a.v;
import l.a.v0;

public abstract class e1
extends v
implements k0,
v0 {
    public f1 n;

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void dispose() {
        Object object;
        f1 f12 = this.x();
        while ((object = f12.F()) instanceof e1) {
            if (object != this) {
                return;
            }
            if (!f1.k.compareAndSet((Object)f12, object, (Object)g1.g)) continue;
            return;
        }
        if (object instanceof v0 && ((v0)object).e() != null) {
            ((i)((Object)this)).t();
        }
    }

    @Override
    public k1 e() {
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(a.w1((Object)this));
        stringBuilder.append("[job@");
        stringBuilder.append(a.w1((Object)this.x()));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final f1 x() {
        f1 f12 = this.n;
        if (f12 != null) {
            return f12;
        }
        k.x.c.i.m("job");
        throw null;
    }
}

