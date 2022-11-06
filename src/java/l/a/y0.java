/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  k.x.b.l
 */
package l.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k.q;
import k.x.b.l;
import l.a.c1;

public final class y0
extends c1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o;
    private volatile /* synthetic */ int _invoked;
    public final l<Throwable, q> p;

    public static {
        o = AtomicIntegerFieldUpdater.newUpdater(y0.class, (String)"_invoked");
    }

    public y0(l<? super Throwable, q> l2) {
        this.p = l2;
        this._invoked = 0;
    }

    public void w(Throwable throwable) {
        if (o.compareAndSet((Object)this, 0, 1)) {
            this.p.invoke((Object)throwable);
        }
    }
}

