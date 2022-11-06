/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  k.u.f$a
 *  l.a.x1$a
 */
package l.a;

import k.u.f;
import l.a.x1;
import l.a.z;

public final class u1
extends z {
    public static final u1 k = new u1();

    @Override
    public void dispatch(f f2, Runnable runnable) {
        if ((x1)((Object)f2.get(x1.k)) != null) {
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override
    public boolean isDispatchNeeded(f f2) {
        return false;
    }

    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}

