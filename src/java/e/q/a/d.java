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

public class d
extends f<T> {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ int c;

    public d(Method method, Class class_, int n2) {
        this.a = method;
        this.b = class_;
        this.c = n2;
    }

    public T a() {
        Method method = this.a;
        Object[] arrobject = new Object[]{this.b, this.c};
        return (T)method.invoke(null, arrobject);
    }

    public String toString() {
        return this.b.getName();
    }
}

