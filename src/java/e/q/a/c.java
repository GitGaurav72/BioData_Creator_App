/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.q.a.f
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package e.q.a;

import e.q.a.f;
import java.lang.reflect.Method;

public class c
extends f<T> {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Class c;

    public c(Method method, Object object, Class class_) {
        this.a = method;
        this.b = object;
        this.c = class_;
    }

    public T a() {
        Method method = this.a;
        Object object = this.b;
        Object[] arrobject = new Object[]{this.c};
        return (T)method.invoke(object, arrobject);
    }

    public String toString() {
        return this.c.getName();
    }
}

