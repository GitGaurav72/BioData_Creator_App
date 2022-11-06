/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractMap
 *  java.util.AbstractSet
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 *  java.util.Set
 *  java.util.SortedMap
 *  java.util.TreeMap
 *  k.b0.x.b.x0.h.t
 */
package k.b0.x.b.x0.h;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import k.b0.x.b.x0.h.t;

public class u<K extends Comparable<K>, V>
extends AbstractMap<K, V> {
    public static final /* synthetic */ int k;
    public final int l;
    public List<u<K, V>> m;
    public Map<K, V> n;
    public boolean o;
    public volatile u<K, V> p;

    public u(int n2, t t2) {
        this.l = n2;
        this.m = Collections.emptyList();
        this.n = Collections.emptyMap();
    }

    public void clear() {
        this.i();
        if (!this.m.isEmpty()) {
            this.m.clear();
        }
        if (!this.n.isEmpty()) {
            this.n.clear();
        }
    }

    public boolean containsKey(Object object) {
        Comparable comparable = (Comparable)object;
        return this.e((K)comparable) >= 0 || this.n.containsKey((Object)comparable);
        {
        }
    }

    public final int e(K k2) {
        int n2 = -1 + this.m.size();
        if (n2 >= 0) {
            int n3 = k2.compareTo(((b)this.m.get((int)n2)).k);
            if (n3 > 0) {
                return -(n2 + 2);
            }
            if (n3 == 0) {
                return n2;
            }
        }
        int n4 = 0;
        while (n4 <= n2) {
            int n5 = (n4 + n2) / 2;
            int n6 = k2.compareTo(((b)this.m.get((int)n5)).k);
            if (n6 < 0) {
                n2 = n5 - 1;
                continue;
            }
            if (n6 > 0) {
                n4 = n5 + 1;
                continue;
            }
            return n5;
        }
        return -(n4 + 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.p == null) {
            this.p = new d(null);
        }
        return this.p;
    }

    public V get(Object object) {
        Comparable comparable = (Comparable)object;
        int n2 = this.e((K)comparable);
        if (n2 >= 0) {
            return ((b)this.m.get((int)n2)).l;
        }
        return (V)this.n.get((Object)comparable);
    }

    public final void i() {
        if (!this.o) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public Map.Entry<K, V> j(int n2) {
        return (Map.Entry)this.m.get(n2);
    }

    public int k() {
        return this.m.size();
    }

    public Iterable<Map.Entry<K, V>> l() {
        if (this.n.isEmpty()) {
            return a.b;
        }
        return this.n.entrySet();
    }

    public final SortedMap<K, V> m() {
        this.i();
        if (this.n.isEmpty() && !(this.n instanceof TreeMap)) {
            this.n = new TreeMap();
        }
        return (SortedMap)this.n;
    }

    public V o(K k2, V v2) {
        int n2;
        int n3;
        this.i();
        int n4 = this.e(k2);
        if (n4 >= 0) {
            b b2 = (b)this.m.get(n4);
            b2.m.i();
            Object v3 = b2.l;
            b2.l = v2;
            return v3;
        }
        this.i();
        if (this.m.isEmpty() && !(this.m instanceof ArrayList)) {
            this.m = new ArrayList(this.l);
        }
        if ((n2 = -(n4 + 1)) >= this.l) {
            return (V)this.m().put(k2, v2);
        }
        int n5 = this.m.size();
        if (n5 == (n3 = this.l)) {
            b b3 = (b)this.m.remove(n3 - 1);
            this.m().put(b3.k, b3.l);
        }
        this.m.add(n2, (Object)new b(this, k2, v2));
        return null;
    }

    public final V p(int n2) {
        this.i();
        Object v2 = ((b)this.m.remove((int)n2)).l;
        if (!this.n.isEmpty()) {
            Iterator iterator = this.m().entrySet().iterator();
            this.m.add((Object)new b(this, (Map.Entry)iterator.next()));
            iterator.remove();
        }
        return v2;
    }

    public V remove(Object object) {
        this.i();
        Comparable comparable = (Comparable)object;
        int n2 = this.e((K)comparable);
        if (n2 >= 0) {
            return this.p(n2);
        }
        if (this.n.isEmpty()) {
            return null;
        }
        return (V)this.n.remove((Object)comparable);
    }

    public int size() {
        return this.m.size() + this.n.size();
    }

    public static class k.b0.x.b.x0.h.u$a {
        public static final Iterator<Object> a = new Iterator<Object>(){

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        public static final Iterable<Object> b = new Iterable<Object>(){

            public Iterator<Object> iterator() {
                return k.b0.x.b.x0.h.u$a.a;
            }
        };

    }

    public class b
    implements Comparable<u<K, V>>,
    Map.Entry<K, V> {
        public final K k;
        public V l;
        public final /* synthetic */ u m;

        public b(K k2, V v2) {
            this.m = var1_1;
            this.k = k2;
            this.l = v2;
        }

        public b(u u2, Map.Entry<K, V> entry) {
            Comparable comparable = (Comparable)entry.getKey();
            Object object = entry.getValue();
            this.m = u2;
            this.k = comparable;
            this.l = object;
        }

        public int compareTo(Object object) {
            b b2 = (b)object;
            return this.k.compareTo(b2.k);
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry)object;
            K k2 = this.k;
            Object object2 = entry.getKey();
            boolean bl = k2 == null ? object2 == null : k2.equals(object2);
            if (bl) {
                V v2 = this.l;
                Object object3 = entry.getValue();
                boolean bl2 = v2 == null ? object3 == null : v2.equals(object3);
                if (bl2) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.k;
        }

        public V getValue() {
            return this.l;
        }

        public int hashCode() {
            K k2 = this.k;
            int n2 = k2 == null ? 0 : k2.hashCode();
            V v2 = this.l;
            int n3 = v2 == null ? 0 : v2.hashCode();
            return n2 ^ n3;
        }

        public V setValue(V v2) {
            u u2 = this.m;
            u2.i();
            V v3 = this.l;
            this.l = v2;
            return v3;
        }

        public String toString() {
            String string = String.valueOf(this.k);
            String string2 = String.valueOf(this.l);
            StringBuilder stringBuilder = new StringBuilder(1 + string.length() + string2.length());
            stringBuilder.append(string);
            stringBuilder.append("=");
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
    }

    public class c
    implements Iterator<Map.Entry<K, V>> {
        public int k = -1;
        public boolean l;
        public Iterator<Map.Entry<K, V>> m;

        public c(t t2) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.m == null) {
                this.m = u.this.n.entrySet().iterator();
            }
            return this.m;
        }

        public boolean hasNext() {
            int n2 = this.k;
            boolean bl = true;
            if (n2 + bl >= u.this.m.size()) {
                if (this.a().hasNext()) {
                    return bl;
                }
                bl = false;
            }
            return bl;
        }

        public Object next() {
            int n2;
            this.l = true;
            this.k = n2 = 1 + this.k;
            Object object = n2 < u.this.m.size() ? u.this.m.get(this.k) : this.a().next();
            return (Map.Entry)object;
        }

        public void remove() {
            if (this.l) {
                this.l = false;
                u u2 = u.this;
                u2.i();
                if (this.k < u.this.m.size()) {
                    u u3 = u.this;
                    int n2 = this.k;
                    this.k = n2 - 1;
                    u3.p(n2);
                    return;
                }
                this.a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    public class d
    extends AbstractSet<Map.Entry<K, V>> {
        public d(t t2) {
        }

        public boolean add(Object object) {
            Map.Entry entry = (Map.Entry)object;
            if (!this.contains((Object)entry)) {
                u.this.o((Comparable)entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        public void clear() {
            u.this.clear();
        }

        public boolean contains(Object object) {
            Object object2;
            Map.Entry entry = (Map.Entry)object;
            Object v2 = u.this.get(entry.getKey());
            return v2 == (object2 = entry.getValue()) || v2 != null && v2.equals(object2);
            {
            }
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new c(null);
        }

        public boolean remove(Object object) {
            Map.Entry entry = (Map.Entry)object;
            if (this.contains((Object)entry)) {
                u.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        public int size() {
            return u.this.size();
        }
    }

}

