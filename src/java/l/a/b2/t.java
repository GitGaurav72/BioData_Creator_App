/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.util.Arrays
 *  l.a.o0
 *  l.a.o0$a
 */
package l.a.b2;

import java.util.Arrays;
import k.x.c.i;
import l.a.b2.u;
import l.a.o0;

public class t<T extends u & Comparable<? super T>> {
    private volatile /* synthetic */ int _size;
    public T[] a;

    public t() {
        this._size = 0;
    }

    public final void a(T t2) {
        o0.a a2 = (o0.a)t2;
        a2.b(this);
        Object[] arrobject = this.a;
        if (arrobject == null) {
            arrobject = new u[4];
            this.a = arrobject;
        } else if (this._size >= arrobject.length) {
            Object[] arrobject2 = Arrays.copyOf((Object[])arrobject, (int)(2 * this._size));
            i.d(arrobject2, "java.util.Arrays.copyOf(this, newSize)");
            arrobject = (u[])arrobject2;
            this.a = arrobject;
        }
        int n2 = this._size;
        this._size = n2 + 1;
        arrobject[n2] = t2;
        a2.m = n2;
        this.f(n2);
    }

    public final T b() {
        T[] arrT = this.a;
        if (arrT == null) {
            return null;
        }
        return arrT[0];
    }

    public final boolean c() {
        return this._size == 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final T d(int var1_1) {
        block5 : {
            var2_2 = this.a;
            i.c(var2_2);
            this._size = -1 + this._size;
            if (var1_1 >= this._size) break block5;
            this.g(var1_1, this._size);
            var4_3 = (var1_1 - 1) / 2;
            if (var1_1 <= 0) ** GOTO lbl-1000
            var14_4 = var2_2[var1_1];
            i.c(var14_4);
            var15_5 = (Comparable)var14_4;
            var16_6 = var2_2[var4_3];
            i.c(var16_6);
            if (var15_5.compareTo(var16_6) < 0) {
                this.g(var1_1, var4_3);
                this.f(var4_3);
            } else lbl-1000: // 3 sources:
            {
                while ((var5_7 = 1 + var1_1 * 2) < this._size) {
                    var6_8 = this.a;
                    i.c(var6_8);
                    var7_9 = var5_7 + 1;
                    if (var7_9 < this._size) {
                        var11_13 = var6_8[var7_9];
                        i.c(var11_13);
                        var12_14 = (Comparable)var11_13;
                        var13_15 = var6_8[var5_7];
                        i.c(var13_15);
                        if (var12_14.compareTo(var13_15) < 0) {
                            var5_7 = var7_9;
                        }
                    }
                    var8_10 = var6_8[var1_1];
                    i.c(var8_10);
                    var9_11 = (Comparable)var8_10;
                    var10_12 = var6_8[var5_7];
                    i.c(var10_12);
                    if (var9_11.compareTo(var10_12) <= 0) break;
                    this.g(var1_1, var5_7);
                    var1_1 = var5_7;
                }
            }
        }
        var3_16 = var2_2[this._size];
        i.c(var3_16);
        var3_16.b(null);
        var3_16.l(-1);
        var2_2[this._size] = null;
        return var3_16;
    }

    public final T e() {
        t t2 = this;
        synchronized (t2) {
            T t3 = this._size > 0 ? (T)this.d(0) : null;
            return t3;
        }
    }

    public final void f(int n2) {
        while (n2 > 0) {
            T[] arrT = this.a;
            i.c(arrT);
            int n3 = (n2 - 1) / 2;
            T t2 = arrT[n3];
            i.c(t2);
            Comparable comparable = (Comparable)t2;
            T t3 = arrT[n2];
            i.c(t3);
            if (comparable.compareTo(t3) <= 0) {
                return;
            }
            this.g(n2, n3);
            n2 = n3;
        }
        return;
    }

    public final void g(int n2, int n3) {
        T[] arrT = this.a;
        i.c(arrT);
        T t2 = arrT[n3];
        i.c(t2);
        T t3 = arrT[n2];
        i.c(t3);
        arrT[n2] = t2;
        arrT[n3] = t3;
        t2.l(n2);
        t3.l(n3);
    }
}

