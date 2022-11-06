/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Field
 *  sun.misc.Unsafe
 */
package e.p.a.c.f.f;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class x0 {
    public final Unsafe a;

    public x0(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object var1, long var2);

    public abstract float b(Object var1, long var2);

    public abstract void c(Object var1, long var2, boolean var4);

    public abstract void d(Object var1, long var2, byte var4);

    public abstract void e(Object var1, long var2, double var4);

    public abstract void f(Object var1, long var2, float var4);

    public abstract boolean g(Object var1, long var2);

    public final int h(Class class_) {
        return this.a.arrayBaseOffset(class_);
    }

    public final int i(Class class_) {
        return this.a.arrayIndexScale(class_);
    }

    public final int j(Object object, long l2) {
        return this.a.getInt(object, l2);
    }

    public final long k(Object object, long l2) {
        return this.a.getLong(object, l2);
    }

    public final long l(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final Object m(Object object, long l2) {
        return this.a.getObject(object, l2);
    }

    public final void n(Object object, long l2, int n2) {
        this.a.putInt(object, l2, n2);
    }

    public final void o(Object object, long l2, long l3) {
        this.a.putLong(object, l2, l3);
    }

    public final void p(Object object, long l2, Object object2) {
        this.a.putObject(object, l2, object2);
    }
}

