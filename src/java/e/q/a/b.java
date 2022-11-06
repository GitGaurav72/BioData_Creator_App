/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.q.a.f
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Constructor
 */
package e.q.a;

import e.q.a.f;
import java.lang.reflect.Constructor;

public class b
extends f<T> {
    public final /* synthetic */ Constructor a;
    public final /* synthetic */ Class b;

    public b(Constructor constructor, Class class_) {
        this.a = constructor;
        this.b = class_;
    }

    public T a() {
        return (T)this.a.newInstance(null);
    }

    public String toString() {
        return this.b.getName();
    }
}

