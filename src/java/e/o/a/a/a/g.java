/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.o.a.a.a.g0
 *  e.o.a.a.a.g0$c
 *  java.lang.Object
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.concurrent.ConcurrentMap
 *  java.util.function.Consumer
 */
package e.o.a.a.a;

import e.o.a.a.a.g0;
import e.o.a.a.a.i0;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;

public final class g
implements Consumer {
    public final /* synthetic */ g0.c a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ g(g0.c c2, Consumer consumer) {
        this.a = c2;
        this.b = consumer;
    }

    public final void accept(Object object) {
        g0.c c2 = this.a;
        Consumer consumer = this.b;
        Map.Entry entry = (Map.Entry)object;
        Objects.requireNonNull((Object)c2);
        consumer.accept(new i0<Object, Object>((ConcurrentMap<Object, Object>)c2.b, entry.getKey(), entry.getValue()));
    }
}

