/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.AbstractSet
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.x.b.x0.o.i$a
 *  k.b0.x.b.x0.o.i$c
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.o;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import k.b0.x.b.x0.o.i;
import k.x.c.a0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/*
 * Exception performing whole class analysis.
 */
public final class i<T>
extends AbstractSet<T> {
    public Object k;
    public int l;

    public i() {
    }

    public i(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final <T> i<T> h() {
        return new i<T>(null);
    }

    public boolean add(T t2) {
        int n2 = this.l;
        if (n2 == 0) {
            this.k = t2;
        } else if (n2 == 1) {
            if (k.x.c.i.a(this.k, t2)) {
                return false;
            }
            Object[] arrobject = new Object[]{this.k, t2};
            this.k = arrobject;
        } else if (n2 < 5) {
            LinkedHashSet linkedHashSet;
            Object object = this.k;
            Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] arrobject = (Object[])object;
            if (e.s.a.a.g0((Object[])arrobject, t2)) {
                return false;
            }
            int n3 = this.l;
            if (n3 == 4) {
                Object[] arrobject2 = Arrays.copyOf((Object[])arrobject, (int)arrobject.length);
                k.x.c.i.e(arrobject2, "elements");
                linkedHashSet = new LinkedHashSet(e.s.a.a.R2((int)arrobject2.length));
                e.s.a.a.g4((Object[])arrobject2, (Collection)linkedHashSet);
                linkedHashSet.add(t2);
            } else {
                linkedHashSet = Arrays.copyOf((Object[])arrobject, (int)(n3 + 1));
                k.x.c.i.d((Object)linkedHashSet, "copyOf(this, newSize)");
                linkedHashSet[((Object[])linkedHashSet).length - 1] = t2;
            }
            this.k = linkedHashSet;
        } else {
            Object object = this.k;
            Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!a0.a(object).add(t2)) {
                return false;
            }
        }
        this.l = 1 + this.l;
        return true;
    }

    public void clear() {
        this.k = null;
        this.l = 0;
    }

    public boolean contains(Object object) {
        int n2 = this.l;
        if (n2 == 0) {
            return false;
        }
        if (n2 == 1) {
            return k.x.c.i.a(this.k, object);
        }
        if (n2 < 5) {
            Object object2 = this.k;
            Objects.requireNonNull((Object)object2, (String)"null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return e.s.a.a.g0((Object[])((Object[])object2), (Object)object);
        }
        Object object3 = this.k;
        Objects.requireNonNull((Object)object3, (String)"null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set)object3).contains(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Iterator<T> iterator() {
        Set set;
        int n2 = this.l;
        if (n2 == 0) {
            set = Collections.emptySet();
            do {
                return set.iterator();
                break;
            } while (true);
        }
        if (n2 == 1) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        if (n2 < 5) {
            Object object = this.k;
            Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        Object object = this.k;
        Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        set = a0.a(object);
        return set.iterator();
    }

    public final int size() {
        return this.l;
    }

    public static final class b {
        public static final <T> i<T> a() {
            return new i(null);
        }
    }

}

