/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicLongFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceArray
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package l.a.b2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.a.b2.q;

public final class k<E> {
    public static final a a = new a(null);
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final q d = new q("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next;
    private volatile /* synthetic */ long _state;
    public final int e;
    public final boolean f;
    public final int g;
    public /* synthetic */ AtomicReferenceArray h;

    public static {
        b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, (String)"_next");
        c = AtomicLongFieldUpdater.newUpdater(k.class, (String)"_state");
    }

    public k(int n2, boolean bl) {
        int n3;
        this.e = n2;
        this.f = bl;
        this.g = n3 = n2 - 1;
        this._next = null;
        this._state = 0L;
        this.h = new AtomicReferenceArray(n2);
        boolean bl2 = n3 <= 1073741823;
        if (bl2) {
            int n4 = n2 & n3;
            boolean bl3 = false;
            if (n4 == 0) {
                bl3 = true;
            }
            if (bl3) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int a(E var1_1) {
        do lbl-1000: // 3 sources:
        {
            var2_2 = this._state;
            var4_3 = 0x3000000000000000L & var2_2 LCMP 0L;
            var5_4 = 1;
            if (var4_3 != false) {
                if ((var2_2 & 0x2000000000000000L) == 0L) return var5_4;
                return 2;
            }
            var8_7 = this.g;
            var7_6 = (int)((1152921503533105152L & var2_2) >> 30);
            var6_5 = (int)((0x3FFFFFFFL & var2_2) >> 0);
            if ((var8_7 & var7_6 + 2) == (var6_5 & var8_7)) {
                return var5_4;
            }
            if (this.f || this.h.get(var7_6 & var8_7) == null) continue;
            var12_9 = this.e;
            if (var12_9 < 1024) return var5_4;
            if ((1073741823 & var7_6 - var6_5) <= var12_9 >> 1) ** GOTO lbl-1000
            return var5_4;
        } while (!k.c.compareAndSet((Object)this, var2_2, -1152921503533105153L & var2_2 | (long)(var9_8 = 1073741823 & var7_6 + 1) << 30));
        this.h.set(var7_6 & var8_7, var1_1);
        var10_10 = this;
        do {
            if ((0x1000000000000000L & var10_10._state) == 0L) {
                return 0;
            }
            var10_10 = var10_10.e();
            var11_11 = var10_10.h.get(var7_6 & var10_10.g);
            if (var11_11 instanceof b == false) return 0;
            if (((b)var11_11).a != var7_6) return 0;
            var10_10.h.set(var7_6 & var10_10.g, var1_1);
        } while (var10_10 != null);
        return 0;
    }

    public final boolean b() {
        long l2;
        long l3;
        do {
            if (((l3 = this._state) & 0x2000000000000000L) != 0L) {
                return true;
            }
            if ((0x1000000000000000L & l3) == 0L) continue;
            return false;
        } while (!c.compareAndSet((Object)this, l3, l2 = l3 | 0x2000000000000000L));
        return true;
    }

    public final int c() {
        long l2 = this._state;
        int n2 = (int)((0x3FFFFFFFL & l2) >> 0);
        return 1073741823 & (int)((l2 & 1152921503533105152L) >> 30) - n2;
    }

    public final boolean d() {
        long l2 = this._state;
        int n2 = (int)((0x3FFFFFFFL & l2) >> 0);
        int n3 = (int)((l2 & 1152921503533105152L) >> 30);
        boolean bl = false;
        if (n2 == n3) {
            bl = true;
        }
        return bl;
    }

    public final k<E> e() {
        long l2;
        while (((l2 = this._state) & 0x1000000000000000L) == 0L) {
            long l3 = l2 | 0x1000000000000000L;
            if (!c.compareAndSet((Object)this, l2, l3)) continue;
            l2 = l3;
            break;
        }
        k k2;
        while ((k2 = (k)this._next) == null) {
            int n2;
            int n3;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            k<E> k3 = new k<E>(2 * this.e, this.f);
            int n4 = (int)((0x3FFFFFFFL & l2) >> 0);
            int n5 = (int)((1152921503533105152L & l2) >> 30);
            while ((n2 = n4 & (n3 = this.g)) != (n3 & n5)) {
                Object object = this.h.get(n2);
                if (object == null) {
                    object = new b(n4);
                }
                k3.h.set(n4 & k3.g, object);
                ++n4;
            }
            k3._state = -1152921504606846977L & l2;
            atomicReferenceFieldUpdater.compareAndSet((Object)this, null, k3);
        }
        return k2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Object f() {
        do lbl-1000: // 3 sources:
        {
            block6 : {
                if (((var1_1 = this._state) & 0x1000000000000000L) != 0L) {
                    return k.d;
                }
                var4_3 = (int)((1152921503533105152L & var1_1) >> 30);
                var5_4 = this.g;
                var6_5 = var4_3 & var5_4;
                var3_2 = (int)((var1_1 & 0x3FFFFFFFL) >> 0);
                var7_6 = var5_4 & var3_2;
                if (var6_5 == var7_6) {
                    return null;
                }
                var8_7 = this.h.get(var7_6);
                if (var8_7 != null) break block6;
                if (!this.f) ** GOTO lbl-1000
                return null;
            }
            if (var8_7 instanceof b) {
                return null;
            }
            var10_9 = k.c;
            var11_10 = var1_1 & -1073741824L;
            var9_8 = 1073741823 & var3_2 + 1;
            var13_11 = (long)var9_8 << 0;
            if (!var10_9.compareAndSet((Object)this, var1_1, var11_10 | var13_11)) continue;
            this.h.set(var3_2 & this.g, null);
            return var8_7;
        } while (!this.f);
        var15_12 = this;
        do lbl-1000: // 3 sources:
        {
            var16_13 = var15_12._state;
            var18_14 = (int)((var16_13 & 0x3FFFFFFFL) >> 0);
            if ((var16_13 & 0x1000000000000000L) != 0L) {
                var15_12 = var15_12.e();
                continue;
            }
            var19_15 = k.c;
            var20_16 = var13_11 | var16_13 & -1073741824L;
            if (!var19_15.compareAndSet(var15_12, var16_13, var20_16)) ** GOTO lbl-1000
            var15_12.h.set(var18_14 & var15_12.g, null);
            var15_12 = null;
        } while (var15_12 != null);
        return var8_7;
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b {
        public final int a;

        public b(int n2) {
            this.a = n2;
        }
    }

}

