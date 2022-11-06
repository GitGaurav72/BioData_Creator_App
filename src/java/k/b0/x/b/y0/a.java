/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package k.b0.x.b.y0;

import java.util.Iterator;

public final class a<E>
implements Iterable<E> {
    public static final a<Object> k = new a<E>();
    public final E l;
    public final a<E> m;
    public final int n;

    public a() {
        this.n = 0;
        this.l = null;
        this.m = null;
    }

    public a(E e2, a<E> a2) {
        this.l = e2;
        this.m = a2;
        this.n = 1 + a2.n;
    }

    public final a<E> h(Object object) {
        if (this.n == 0) {
            return this;
        }
        if (this.l.equals(object)) {
            return this.m;
        }
        a<E> a2 = this.m.h(object);
        if (a2 == this.m) {
            return this;
        }
        return new a<E>(this.l, a2);
    }

    public Iterator<E> iterator() {
        return new a<E>(this.k(0));
    }

    public final a<E> k(int n2) {
        if (n2 >= 0 && n2 <= this.n) {
            if (n2 == 0) {
                return this;
            }
            return this.m.k(n2 - 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public static class a<E>
    implements Iterator<E> {
        public a<E> k;

        public a(a<E> a2) {
            this.k = a2;
        }

        public boolean hasNext() {
            return this.k.n > 0;
        }

        public E next() {
            a<E> a2 = this.k;
            Object e2 = a2.l;
            this.k = a2.m;
            return e2;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

}

