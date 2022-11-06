/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  k.u.f$a
 *  k.x.b.l
 *  k.x.b.p
 *  l.a.a1
 *  l.a.a1$a
 *  l.a.b2.i$a
 *  l.a.f1$c
 *  l.a.j
 *  l.a.k1
 *  l.a.l1
 *  l.a.m0
 *  l.a.n
 *  l.a.u0
 */
package l.a;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.u.f;
import k.x.b.l;
import l.a.a1;
import l.a.b1;
import l.a.b2.i;
import l.a.b2.q;
import l.a.c1;
import l.a.e1;
import l.a.f1;
import l.a.g1;
import l.a.j;
import l.a.k0;
import l.a.k1;
import l.a.l1;
import l.a.m0;
import l.a.n;
import l.a.n1;
import l.a.o;
import l.a.p;
import l.a.t;
import l.a.u0;
import l.a.v0;
import l.a.w;
import l.a.w0;
import l.a.y0;
import l.a.z0;

/*
 * Exception performing whole class analysis.
 */
public class f1
implements a1,
p,
n1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public static {
        k = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, (String)"_state");
    }

    public f1(boolean bl) {
        m0 m02 = bl ? g1.g : g1.f;
        this._state = m02;
        this._parentHandle = null;
    }

    public static /* synthetic */ CancellationException U(f1 f12, Throwable throwable, String string, int n2, Object object) {
        n2 & 1;
        return f12.T(throwable, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object A(c c2, Object object) {
        Object object2;
        t t2 = object instanceof t ? (t)object : null;
        Throwable throwable = t2 == null ? null : t2.b;
        c c3 = c2;
        // MONITORENTER : c3
        c2.f();
        List list = c2.i(throwable);
        if (list.isEmpty()) {
            boolean bl = c2.f();
            object2 = null;
            if (bl) {
                object2 = new b1(this.s(), null, this);
            }
        } else {
            Object object3;
            block13 : {
                Object object4;
                Iterator iterator = list.iterator();
                do {
                    boolean bl = iterator.hasNext();
                    object3 = null;
                    if (!bl) break block13;
                } while (!(true ^ (Throwable)(object4 = iterator.next()) instanceof CancellationException));
                object3 = object4;
            }
            if ((object2 = (Throwable)object3) == null) {
                object2 = (Throwable)list.get(0);
            }
        }
        if (object2 != null && list.size() > 1) {
            Set set = Collections.newSetFromMap((Map)new IdentityHashMap(list.size()));
            for (Throwable throwable2 : list) {
                if (throwable2 == object2 || throwable2 == object2 || throwable2 instanceof CancellationException || !set.add((Object)throwable2)) continue;
                e.s.a.a.o((Throwable)object2, (Throwable)throwable2);
            }
        }
        // MONITOREXIT : c3
        if (object2 != null && object2 != throwable) {
            object = new t((Throwable)object2, false, 2);
        }
        if (object2 != null) {
            boolean bl = this.p((Throwable)object2) || this.G((Throwable)object2);
            if (bl) {
                Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                t t3 = (t)object;
                t.a.compareAndSet((Object)t3, 0, 1);
            }
        }
        this.O(object);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        Object object5 = object instanceof v0 ? new w0((v0)object) : object;
        atomicReferenceFieldUpdater.compareAndSet((Object)this, (Object)c2, object5);
        this.u((v0)c2, object);
        return object;
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return false;
    }

    public final k1 D(v0 v02) {
        k1 k12 = v02.e();
        if (k12 == null) {
            if (v02 instanceof m0) {
                return new k1();
            }
            if (v02 instanceof e1) {
                this.Q((e1)v02);
                return null;
            }
            throw new IllegalStateException(k.x.c.i.k("State should have list: ", v02).toString());
        }
        return k12;
    }

    public final n E() {
        return (n)this._parentHandle;
    }

    public final Object F() {
        Object object;
        while ((object = this._state) instanceof l.a.b2.n) {
            ((l.a.b2.n)object).a(this);
        }
        return object;
    }

    public boolean G(Throwable throwable) {
        return false;
    }

    public void H(Throwable throwable) {
        throw throwable;
    }

    public final void I(a1 a12) {
        if (a12 == null) {
            this._parentHandle = l1.k;
            return;
        }
        a12.start();
        n n2 = a12.z((p)this);
        this._parentHandle = n2;
        if (true ^ this.F() instanceof v0) {
            n2.dispose();
            this._parentHandle = l1.k;
        }
    }

    public boolean J() {
        return false;
    }

    public final Object K(Object object) {
        Object object2;
        do {
            if ((object2 = this.V(this.F(), object)) != g1.a) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Job ");
            stringBuilder.append((Object)this);
            stringBuilder.append(" is already complete or completing, but is being completed with ");
            stringBuilder.append(object);
            String string = stringBuilder.toString();
            t t2 = object instanceof t ? (t)object : null;
            Throwable throwable = t2 == null ? null : t2.b;
            throw new IllegalStateException(string, throwable);
        } while (object2 == g1.c);
        return object2;
    }

    public String L() {
        return this.getClass().getSimpleName();
    }

    public final o M(i i2) {
        while (i2.s()) {
            i2 = i2.o();
        }
        do {
            if ((i2 = i2.n()).s()) {
                continue;
            }
            if (i2 instanceof o) {
                return (o)((Object)i2);
            }
            if (i2 instanceof k1) break;
        } while (true);
        return null;
    }

    public final void N(k1 k12, Throwable throwable) {
        i i2 = (i)k12.l();
        w w2 = null;
        while (!k.x.c.i.a(i2, (Object)k12)) {
            block7 : {
                if (i2 instanceof c1) {
                    e1 e12 = (e1)((Object)i2);
                    try {
                        e12.w(throwable);
                    }
                    catch (Throwable throwable2) {
                        w w3;
                        if (w2 == null) {
                            w3 = null;
                        } else {
                            e.s.a.a.o(w2, (Throwable)throwable2);
                            w3 = w2;
                        }
                        if (w3 != null) break block7;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Exception in completion handler ");
                        stringBuilder.append((Object)e12);
                        stringBuilder.append(" for ");
                        stringBuilder.append((Object)this);
                        w2 = new w(stringBuilder.toString(), throwable2);
                    }
                }
            }
            i2 = i2.n();
        }
        if (w2 != null) {
            this.H((Throwable)w2);
        }
        this.p(throwable);
    }

    public void O(Object object) {
    }

    public void P() {
    }

    public final void Q(e1 e12) {
        k1 k12 = new k1();
        i.l.lazySet((Object)k12, (Object)e12);
        i.k.lazySet((Object)k12, (Object)e12);
        while (((i)((Object)e12)).l() == e12) {
            if (!i.k.compareAndSet((Object)e12, (Object)e12, (Object)k12)) continue;
            k12.k((i)((Object)e12));
            break;
        }
        i i2 = ((i)((Object)e12)).n();
        k.compareAndSet((Object)this, (Object)e12, (Object)i2);
    }

    public final int R(Object object) {
        if (object instanceof m0) {
            if (((m0)object).k) {
                return 0;
            }
            if (!k.compareAndSet((Object)this, object, (Object)g1.g)) {
                return -1;
            }
            this.P();
            return 1;
        }
        if (object instanceof u0) {
            if (!k.compareAndSet((Object)this, object, (Object)((u0)object).k)) {
                return -1;
            }
            this.P();
            return 1;
        }
        return 0;
    }

    public final String S(Object object) {
        boolean bl = object instanceof c;
        String string = "Active";
        if (bl) {
            c c2 = object;
            if (c2.f()) {
                return "Cancelling";
            }
            if (c2.g()) {
                return "Completing";
            }
        } else {
            if (object instanceof v0) {
                if (((v0)object).b()) {
                    return string;
                }
                return "New";
            }
            if (object instanceof t) {
                return "Cancelled";
            }
            string = "Completed";
        }
        return string;
    }

    public final CancellationException T(Throwable throwable, String string) {
        CancellationException cancellationException = throwable instanceof CancellationException ? (CancellationException)throwable : null;
        if (cancellationException == null) {
            if (string == null) {
                string = this.s();
            }
            cancellationException = new b1(string, throwable, this);
        }
        return cancellationException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object V(Object object, Object object2) {
        k1 k12;
        if (!(object instanceof v0)) {
            return g1.a;
        }
        boolean bl = object instanceof m0;
        boolean bl2 = true;
        if ((bl || object instanceof e1) && !(object instanceof o) && !(object2 instanceof t)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            v0 v02 = (v0)object;
            Object object3 = object2 instanceof v0 ? new w0((v0)object2) : object2;
            if (!atomicReferenceFieldUpdater.compareAndSet((Object)this, (Object)v02, object3)) {
                bl2 = false;
            } else {
                this.O(object2);
                this.u(v02, object2);
            }
            if (!bl2) return g1.c;
            return object2;
        }
        v0 v03 = (v0)object;
        k1 k13 = this.D(v03);
        if (k13 == null) {
            return g1.c;
        }
        c c2 = v03 instanceof c ? v03 : null;
        if (c2 == null) {
            c2 = new /* Unavailable Anonymous Inner Class!! */;
        }
        c c3 = c2;
        // MONITORENTER : c3
        if (c2.g()) {
            q q2 = g1.a;
            // MONITOREXIT : c3
            return q2;
        }
        c2.j(bl2);
        if (c2 != v03 && !k.compareAndSet((Object)this, (Object)v03, (Object)c2)) {
            return g1.c;
        }
        boolean bl3 = c2.f();
        t t2 = object2 instanceof t ? (t)object2 : null;
        if (t2 != null) {
            c2.a(t2.b);
        }
        Throwable throwable = c2.d();
        if (!(bl2 ^ bl3)) {
            throwable = null;
        }
        // MONITOREXIT : c3
        if (throwable != null) {
            this.N(k13, throwable);
        }
        o o2 = v03 instanceof o ? (o)v03 : null;
        Object object4 = o2 == null ? ((k12 = v03.e()) == null ? null : this.M((i)k12)) : o2;
        if (object4 == null) return this.A(c2, object2);
        if (!this.W(c2, (o)object4, object2)) return this.A(c2, object2);
        return g1.b;
    }

    public final boolean W(c c2, o o2, Object object) {
        do {
            if (e.s.a.a.k2((a1)o2.o, (boolean)false, (boolean)false, (l)new b(this, c2, o2, object), (int)1, null) == l1.k) continue;
            return true;
        } while ((o2 = this.M((i)((Object)o2))) != null);
        return false;
    }

    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new b1(this.s(), null, this);
        }
        this.n((Throwable)cancellationException);
    }

    public boolean b() {
        Object object = this.F();
        return object instanceof v0 && ((v0)object).b();
    }

    public <R> R fold(R r2, k.x.b.p<? super R, ? super f.a, ? extends R> p2) {
        return f.a$a.a(this, r2, p2);
    }

    public <E extends f.a> E get(f.b<E> b2) {
        return f.a$a.b(this, b2);
    }

    public final f.b<?> getKey() {
        return a1.a.k;
    }

    public final boolean k(Object object, k1 k12, e1 e12) {
        int n2;
        int n3;
        i.a a2 = new i.a((i)((Object)e12), this, object){
            public final /* synthetic */ f1 d;
            public final /* synthetic */ Object e;
            {
                this.d = f12;
                this.e = object;
                super(i2);
            }

            public Object c(Object object) {
                (i)object;
                boolean bl = this.d.F() == this.e;
                if (bl) {
                    return null;
                }
                return l.a.b2.h.a;
            }
        };
        while ((n2 = k12.o().v((i)((Object)e12), (i)k12, a2)) != (n3 = 1)) {
            if (n2 != 2) continue;
            n3 = 0;
            break;
        }
        return (boolean)n3;
    }

    public void l(Object object) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean m(Object var1_1) {
        block20 : {
            block18 : {
                block19 : {
                    var2_2 = g1.a;
                    if (this.C()) {
                        block17 : {
                            while (!(!((var16_3 = this.F()) instanceof v0) || var16_3 instanceof c && (var16_3).g())) {
                                var2_2 = this.V(var16_3, new t(this.x(var1_1), false, 2));
                                if (var2_2 == g1.c) continue;
                                break block17;
                            }
                            var2_2 = g1.a;
                        }
                        if (var2_2 == g1.b) {
                            return true;
                        }
                    }
                    if (var2_2 != g1.a) break block20;
                    var3_4 = null;
                    do lbl-1000: // 3 sources:
                    {
                        block23 : {
                            block22 : {
                                block21 : {
                                    if (!((var4_5 = this.F()) instanceof c)) break block21;
                                    var17_11 = var4_5;
                                    // MONITORENTER : var17_11
                                    if ((var4_5).h()) {
                                        var5_12 = g1.d;
                                        // MONITOREXIT : var17_11
                                        break block18;
                                    }
                                    var12_13 = (var4_5).f();
                                    if (var1_1 != null || !var12_13) {
                                        if (var3_4 == null) {
                                            var3_4 = this.x(var1_1);
                                        }
                                        (var4_5).a(var3_4);
                                    }
                                    var13_14 = (var4_5).d();
                                    var14_15 = var12_13 ^ true;
                                    var15_16 = null;
                                    if (var14_15) {
                                        var15_16 = var13_14;
                                    }
                                    // MONITOREXIT : var17_11
                                    if (var15_16 != null) {
                                        this.N((var4_5).k, var15_16);
                                    }
                                    break block22;
                                }
                                if (!(var4_5 instanceof v0)) break block19;
                                if (var3_4 == null) {
                                    var3_4 = this.x(var1_1);
                                }
                                if (!(var6_6 = (v0)var4_5).b()) break block23;
                                var8_8 = this.D(var6_6);
                                if (var8_8 == null || !f1.k.compareAndSet((Object)this, (Object)var6_6, (Object)(var9_9 = new /* Unavailable Anonymous Inner Class!! */))) {
                                    var10_10 = false;
                                } else {
                                    this.N(var8_8, var3_4);
                                    var10_10 = true;
                                }
                                if (!var10_10) ** GOTO lbl-1000
                            }
                            var5_12 = g1.a;
                            break block18;
                        }
                        var7_7 = this.V(var4_5, new t(var3_4, false, 2));
                        if (var7_7 == g1.a) throw new IllegalStateException(k.x.c.i.k("Cannot happen in ", var4_5).toString());
                    } while (var7_7 == g1.c);
                    var2_2 = var7_7;
                    break block20;
                }
                var5_12 = g1.d;
            }
            var2_2 = var5_12;
        }
        if (var2_2 == g1.a) {
            return true;
        }
        if (var2_2 == g1.b) {
            return true;
        }
        if (var2_2 == g1.d) {
            return false;
        }
        this.l(var2_2);
        return true;
    }

    public f minusKey(f.b<?> b2) {
        return f.a$a.c(this, b2);
    }

    public void n(Throwable throwable) {
        this.m((Object)throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final k0 o(boolean bl, boolean bl2, l<? super Throwable, k.q> l2) {
        Object object;
        block24 : {
            void var4_14;
            if (bl) {
                void var4_6;
                if (l2 instanceof c1) {
                    c1 c12 = (c1)l2;
                } else {
                    Object var4_5 = null;
                }
                if (var4_6 == null) {
                    y0 y02 = new y0(l2);
                }
            } else {
                void var4_10;
                void var4_12;
                if (l2 instanceof e1) {
                    e1 e12 = (e1)l2;
                } else {
                    Object var4_9 = null;
                }
                if (var4_10 == null) {
                    Object var4_11 = null;
                }
                if (var4_12 == null) {
                    z0 z02 = new z0(l2);
                }
            }
            var4_14.n = this;
            do {
                Throwable throwable;
                if ((object = this.F()) instanceof m0) {
                    m0 m02 = (m0)object;
                    if (m02.k) {
                        if (!k.compareAndSet((Object)this, object, (Object)var4_14)) continue;
                        return var4_14;
                    }
                    k1 k12 = new k1();
                    if (!m02.k) {
                        k12 = new u0(k12);
                    }
                    k.compareAndSet((Object)this, (Object)m02, (Object)k12);
                    continue;
                }
                if (!(object instanceof v0)) break block24;
                k1 k13 = ((v0)object).e();
                if (k13 == null) {
                    Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    this.Q((e1)object);
                    continue;
                }
                l1 l12 = l1.k;
                if (bl && object instanceof c) {
                    Object object2 = object;
                    synchronized (object2) {
                        throwable = (object).d();
                        if (throwable == null || l2 instanceof o && !(object).g()) {
                            boolean bl3 = this.k(object, k13, (e1)var4_14);
                            if (!bl3) {
                                continue;
                            }
                            if (throwable == null) {
                                return var4_14;
                            }
                            void var10_19 = var4_14;
                        }
                    }
                } else {
                    throwable = null;
                }
                if (throwable != null) {
                    void var10_17;
                    if (bl2) {
                        l2.invoke(throwable);
                    }
                    return var10_17;
                }
                if (this.k(object, k13, (e1)var4_14)) break;
            } while (true);
            return var4_14;
        }
        if (bl2) {
            t t2 = object instanceof t ? (t)object : null;
            Throwable throwable = t2 == null ? null : t2.b;
            l2.invoke((Object)throwable);
        }
        return l1.k;
    }

    public final boolean p(Throwable throwable) {
        boolean bl = this.J();
        boolean bl2 = true;
        if (bl) {
            return bl2;
        }
        boolean bl3 = throwable instanceof CancellationException;
        n n2 = (n)this._parentHandle;
        if (n2 != null) {
            if (n2 == l1.k) {
                return bl3;
            }
            if (!n2.h(throwable)) {
                if (bl3) {
                    return bl2;
                }
                bl2 = false;
            }
            return bl2;
        }
        return bl3;
    }

    public f plus(f f2) {
        return f.a$a.d(this, f2);
    }

    public final CancellationException q() {
        Object object = this.F();
        if (object instanceof c) {
            Throwable throwable = (object).d();
            if (throwable != null) {
                return this.T(throwable, k.x.c.i.k(this.getClass().getSimpleName(), " is cancelling"));
            }
            throw new IllegalStateException(k.x.c.i.k("Job is still new or active: ", this).toString());
        }
        if (!(object instanceof v0)) {
            if (object instanceof t) {
                return f1.U(this, ((t)object).b, null, 1, null);
            }
            return new b1(k.x.c.i.k(this.getClass().getSimpleName(), " has completed normally"), null, this);
        }
        throw new IllegalStateException(k.x.c.i.k("Job is still new or active: ", this).toString());
    }

    @Override
    public final void r(n1 n12) {
        this.m(n12);
    }

    public String s() {
        return "Job was cancelled";
    }

    public final boolean start() {
        int n2;
        while ((n2 = this.R(this.F())) != 0) {
            if (n2 != 1) continue;
            return true;
        }
        return false;
    }

    public boolean t(Throwable throwable) {
        if (throwable instanceof CancellationException) {
            return true;
        }
        return this.m((Object)throwable) && this.B();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.L());
        stringBuilder2.append('{');
        stringBuilder2.append(this.S(this.F()));
        stringBuilder2.append('}');
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append('@');
        stringBuilder.append(e.s.a.a.w1((Object)this));
        return stringBuilder.toString();
    }

    public final void u(v0 v02, Object object) {
        n n2 = (n)this._parentHandle;
        if (n2 != null) {
            n2.dispose();
            this._parentHandle = l1.k;
        }
        t t2 = object instanceof t ? (t)object : null;
        Throwable throwable = t2 == null ? null : t2.b;
        if (v02 instanceof e1) {
            try {
                ((e1)v02).w(throwable);
                return;
            }
            catch (Throwable throwable2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Exception in completion handler ");
                stringBuilder.append((Object)v02);
                stringBuilder.append(" for ");
                stringBuilder.append((Object)this);
                this.H((Throwable)new w(stringBuilder.toString(), throwable2));
                return;
            }
        }
        k1 k12 = v02.e();
        if (k12 == null) {
            return;
        }
        i i2 = (i)k12.l();
        w w2 = null;
        while (!k.x.c.i.a(i2, (Object)k12)) {
            block12 : {
                if (i2 instanceof e1) {
                    e1 e12 = (e1)((Object)i2);
                    try {
                        e12.w(throwable);
                    }
                    catch (Throwable throwable3) {
                        w w3;
                        if (w2 == null) {
                            w3 = null;
                        } else {
                            e.s.a.a.o(w2, (Throwable)throwable3);
                            w3 = w2;
                        }
                        if (w3 != null) break block12;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Exception in completion handler ");
                        stringBuilder.append((Object)e12);
                        stringBuilder.append(" for ");
                        stringBuilder.append((Object)this);
                        w2 = new w(stringBuilder.toString(), throwable3);
                    }
                }
            }
            i2 = i2.n();
        }
        if (w2 == null) {
            return;
        }
        this.H((Throwable)w2);
    }

    @Override
    public CancellationException w() {
        Object object;
        block8 : {
            Throwable throwable;
            block6 : {
                block7 : {
                    block5 : {
                        object = this.F();
                        if (!(object instanceof c)) break block5;
                        throwable = (object).d();
                        break block6;
                    }
                    if (!(object instanceof t)) break block7;
                    throwable = ((t)object).b;
                    break block6;
                }
                if (object instanceof v0) break block8;
                throwable = null;
            }
            boolean bl = throwable instanceof CancellationException;
            CancellationException cancellationException = null;
            if (bl) {
                cancellationException = (CancellationException)throwable;
            }
            if (cancellationException == null) {
                cancellationException = new b1(k.x.c.i.k("Parent job is ", this.S(object)), throwable, this);
            }
            return cancellationException;
        }
        throw new IllegalStateException(k.x.c.i.k("Cannot be cancelling child in this state: ", object).toString());
    }

    public final Throwable x(Object object) {
        Throwable throwable;
        boolean bl = object == null ? true : object instanceof Throwable;
        if (bl) {
            throwable = (Throwable)object;
            if (throwable == null) {
                return new b1(this.s(), null, this);
            }
        } else {
            Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            throwable = ((n1)object).w();
        }
        return throwable;
    }

    public final n z(p p2) {
        return (n)e.s.a.a.k2((a1)this, (boolean)true, (boolean)false, (l)new o(p2), (int)2, null);
    }

    public static final class b
    extends e1 {
        public final f1 o;
        public final c p;
        public final o q;
        public final Object r;

        public b(f1 f12, c c2, o o2, Object object) {
            this.o = f12;
            this.p = c2;
            this.q = o2;
            this.r = object;
        }

        public void w(Throwable throwable) {
            f1 f12 = this.o;
            c c2 = this.p;
            o o2 = this.q;
            Object object = this.r;
            o o3 = f12.M((i)((Object)o2));
            if (o3 != null && f12.W(c2, o3, object)) {
                return;
            }
            f12.l(f12.A(c2, object));
        }
    }

}

