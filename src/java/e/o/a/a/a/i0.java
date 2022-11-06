/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.AbstractMap
 *  java.util.AbstractMap$SimpleEntry
 *  java.util.Objects
 *  java.util.concurrent.ConcurrentMap
 */
package e.o.a.a.a;

import java.util.AbstractMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

public final class i0<K, V>
extends AbstractMap.SimpleEntry<K, V> {
    public final ConcurrentMap<K, V> k;

    public i0(ConcurrentMap<K, V> concurrentMap, K k2, V v2) {
        super(k2, v2);
        Objects.requireNonNull(concurrentMap);
        this.k = concurrentMap;
    }

    public V setValue(V v2) {
        this.k.put(this.getKey(), v2);
        return (V)super.setValue(v2);
    }
}

