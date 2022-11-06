/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractSet
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Objects
 *  java.util.Set
 *  k.s.b0.b
 *  k.s.b0.b$e
 *  k.s.e
 *  k.x.c.b0.c
 *  kotlin.Metadata
 */
package k.s.b0;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import k.s.b0.b;
import k.s.e;
import k.x.c.b0.c;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\b\u0000\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0015\u001a\u00020\fH\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0019\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u0010\u001a\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2={"Lkotlin/collections/builders/MapBuilderKeys;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "backing", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "contains", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "kotlin-stdlib"}, k=1, mv={1, 6, 0}, xi=48)
public final class d<E>
extends e<E>
implements Set<E>,
c {
    public final b<E, ?> k;

    public d(b<E, ?> b2) {
        i.e(b2, "backing");
        this.k = b2;
    }

    public boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        i.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.k.clear();
    }

    public boolean contains(Object object) {
        return this.k.r(object) >= 0;
    }

    public int h() {
        return this.k.s;
    }

    public boolean isEmpty() {
        return this.k.isEmpty();
    }

    public Iterator<E> iterator() {
        b<E, ?> b2 = this.k;
        Objects.requireNonNull(b2);
        return new b.e(b2);
    }

    public boolean remove(Object object) {
        b<E, ?> b2 = this.k;
        b2.m();
        int n2 = b2.r(object);
        if (n2 < 0) {
            n2 = -1;
        } else {
            b2.v(n2);
        }
        return n2 >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.k.m();
        return AbstractSet.super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.k.m();
        return AbstractSet.super.retainAll(collection);
    }
}

