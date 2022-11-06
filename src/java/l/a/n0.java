/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  k.s.i
 *  l.a.i0
 */
package l.a;

import java.util.Objects;
import k.s.i;
import l.a.b2.a;
import l.a.i0;
import l.a.z;

public abstract class n0
extends z {
    public long k;
    public boolean l;
    public a<i0<?>> m;

    public final void B(boolean bl) {
        long l2;
        this.k = l2 = this.k - this.F(bl);
        if (l2 > 0L) {
            return;
        }
        if (this.l) {
            this.shutdown();
        }
    }

    public final long F(boolean bl) {
        if (bl) {
            return 0x100000000L;
        }
        return 1L;
    }

    public final void I(i0<?> i02) {
        int n2;
        a<Object> a2 = this.m;
        if (a2 == null) {
            this.m = a2 = new a();
        }
        Object[] arrobject = a2.a;
        int n3 = a2.c;
        arrobject[n3] = i02;
        a2.c = n2 = n3 + 1 & -1 + arrobject.length;
        int n4 = a2.b;
        if (n2 == n4) {
            int n5 = arrobject.length;
            Object[] arrobject2 = new Object[n5 << 1];
            i.i((Object[])arrobject, (Object[])arrobject2, (int)0, (int)n4, (int)0, (int)10);
            Object[] arrobject3 = a2.a;
            int n6 = arrobject3.length;
            int n7 = a2.b;
            i.i((Object[])arrobject3, (Object[])arrobject2, (int)(n6 - n7), (int)0, (int)n7, (int)4);
            a2.a = arrobject2;
            a2.b = 0;
            a2.c = n5;
        }
    }

    public final void J(boolean bl) {
        this.k += this.F(bl);
        if (!bl) {
            this.l = true;
        }
    }

    public final boolean L() {
        return this.k >= this.F(true);
    }

    public final boolean P() {
        Object object;
        a<i0<?>> a2 = this.m;
        if (a2 == null) {
            return false;
        }
        int n2 = a2.b;
        if (n2 == a2.c) {
            object = null;
        } else {
            Object[] arrobject = a2.a;
            Object object2 = arrobject[n2];
            arrobject[n2] = null;
            a2.b = n2 + 1 & -1 + arrobject.length;
            Objects.requireNonNull((Object)object2, (String)"null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            object = object2;
        }
        i0 i02 = (i0)object;
        if (i02 == null) {
            return false;
        }
        i02.run();
        return true;
    }

    public void shutdown() {
    }
}

