/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package e.p.a.c.f.f;

import e.p.a.c.f.f.w1;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class x1 {
    public final ConcurrentMap a = new ConcurrentHashMap();
    public final Class b;

    public x1(Class class_) {
        this.b = class_;
    }

    public final List a(byte[] arrby) {
        List list = (List)this.a.get((Object)new w1(arrby));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
}

