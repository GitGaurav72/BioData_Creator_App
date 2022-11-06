/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 *  k.s.b0.a$a
 *  k.s.c
 *  k.s.i
 *  k.x.c.b0.b
 *  kotlin.Metadata
 */
package k.s.b0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k.s.b0.a;
import k.s.c;
import k.s.i;
import k.x.c.b0.b;
import kotlin.Metadata;

/*
 * Exception performing whole class analysis.
 */
@Metadata(d1={"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001VB\u0007\b\u0016\u00a2\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bBM\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u00a2\u0006\u0002\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001dJ\u001d\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J&\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010&\u001a\u00020\nH\u0002J\u001d\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010 J\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0016J\u0014\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u0006\u0012\u0002\b\u00030)H\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\nH\u0002J\u0013\u00101\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u000102H\u0096\u0002J\u0016\u00103\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0002\u00a2\u0006\u0002\u00104J\b\u00105\u001a\u00020\nH\u0016J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00107J\u0018\u00108\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020\u0011H\u0016J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0096\u0002J\u0015\u0010<\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00107J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0015\u0010?\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010@\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u00104J\u0015\u0010B\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u00104J\u0018\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\nH\u0002J\u0016\u0010F\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J.\u0010G\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010H\u001a\u00020\u0011H\u0002J\u001e\u0010I\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010JJ\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016J\u0015\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\rH\u0016\u00a2\u0006\u0002\u0010OJ'\u0010N\u001a\b\u0012\u0004\u0012\u0002HP0\r\"\u0004\b\u0001\u0010P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002HP0\rH\u0016\u00a2\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u000202H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006W"}, d2={"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "array", "", "offset", "length", "isReadOnly", "", "backing", "root", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "isEffectivelyReadOnly", "()Z", "size", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "addAllInternal", "i", "n", "addAtInternal", "build", "", "checkIsMutable", "clear", "contentEquals", "other", "ensureCapacity", "minCapacity", "ensureExtraCapacity", "equals", "", "get", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "destination", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "writeReplace", "Itr", "kotlin-stdlib"}, k=1, mv={1, 6, 0}, xi=48)
public final class a<E>
extends c<E>
implements List<E>,
RandomAccess,
Serializable,
b {
    public E[] k;
    public int l;
    public int m;
    public boolean n;
    public final a<E> o;
    public final a<E> p;

    public a() {
        Object[] arrobject = e.s.a.a.r((int)10);
        this.k = arrobject;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = null;
        this.p = null;
    }

    public a(E[] arrE, int n2, int n3, boolean bl, a<E> a2, a<E> a3) {
        this.k = arrE;
        this.l = n2;
        this.m = n3;
        this.n = bl;
        this.o = a2;
        this.p = a3;
    }

    public final void G(int n2, Collection<? extends E> collection, int n3) {
        a<? extends E> a2 = this.o;
        if (a2 != null) {
            a2.G(n2, collection, n3);
            this.k = this.o.k;
            this.m = n3 + this.m;
            return;
        }
        this.J(n2, n3);
        Iterator iterator = collection.iterator();
        for (int i2 = 0; i2 < n3; ++i2) {
            this.k[n2 + i2] = iterator.next();
        }
    }

    public final void H(int n2, E e2) {
        a<E> a2 = this.o;
        if (a2 != null) {
            a2.H(n2, e2);
            this.k = this.o.k;
            this.m = 1 + this.m;
            return;
        }
        this.J(n2, 1);
        this.k[n2] = e2;
    }

    public final void I() {
        a<E> a2;
        boolean bl = this.n || (a2 = this.p) != null && a2.n;
        if (!bl) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void J(int n2, int n3) {
        int n4 = n3 + this.m;
        if (this.o == null) {
            if (n4 >= 0) {
                Object[] arrobject = this.k;
                if (n4 > arrobject.length) {
                    int n5 = arrobject.length;
                    int n6 = n5 + (n5 >> 1);
                    if (n6 - n4 < 0) {
                        n6 = n4;
                    }
                    if (n6 - 2147483639 > 0) {
                        n6 = n4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                    }
                    this.k = e.s.a.a.l0((Object[])arrobject, (int)n6);
                }
                Object[] arrobject2 = this.k;
                int n7 = this.l + this.m;
                i.g((Object[])arrobject2, (Object[])arrobject2, (int)(n2 + n3), (int)n2, (int)n7);
                this.m = n3 + this.m;
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    public final E K(int n2) {
        a<E> a2 = this.o;
        if (a2 != null) {
            E e2 = a2.K(n2);
            this.m = -1 + this.m;
            return e2;
        }
        Object[] arrobject = this.k;
        E e3 = arrobject[n2];
        i.g((Object[])arrobject, (Object[])arrobject, (int)n2, (int)(n2 + 1), (int)(this.l + this.m));
        e.s.a.a.t3((Object[])this.k, (int)(-1 + (this.l + this.m)));
        this.m = -1 + this.m;
        return e3;
    }

    public final void L(int n2, int n3) {
        a<E> a2 = this.o;
        if (a2 != null) {
            a2.L(n2, n3);
        } else {
            Object[] arrobject = this.k;
            i.g((Object[])arrobject, (Object[])arrobject, (int)n2, (int)(n2 + n3), (int)this.m);
            Object[] arrobject2 = this.k;
            int n4 = this.m;
            e.s.a.a.u3((Object[])arrobject2, (int)(n4 - n3), (int)n4);
        }
        this.m -= n3;
    }

    public final int M(int n2, int n3, Collection<? extends E> collection, boolean bl) {
        a<? extends E> a2 = this.o;
        if (a2 != null) {
            int n4 = a2.M(n2, n3, collection, bl);
            this.m -= n4;
            return n4;
        }
        int n5 = 0;
        int n6 = 0;
        while (n5 < n3) {
            E[] arrE = this.k;
            int n7 = n2 + n5;
            if (collection.contains(arrE[n7]) == bl) {
                E[] arrE2 = this.k;
                int n8 = n6 + 1;
                int n9 = n6 + n2;
                ++n5;
                arrE2[n9] = arrE2[n7];
                n6 = n8;
                continue;
            }
            ++n5;
        }
        int n10 = n3 - n6;
        Object[] arrobject = this.k;
        int n11 = n3 + n2;
        int n12 = this.m;
        i.g((Object[])arrobject, (Object[])arrobject, (int)(n2 + n6), (int)n11, (int)n12);
        Object[] arrobject2 = this.k;
        int n13 = this.m;
        e.s.a.a.u3((Object[])arrobject2, (int)(n13 - n10), (int)n13);
        this.m -= n10;
        return n10;
    }

    public void add(int n2, E e2) {
        this.I();
        int n3 = this.m;
        if (n2 >= 0 && n2 <= n3) {
            this.H(n2 + this.l, e2);
            return;
        }
        throw new IndexOutOfBoundsException(e.e.a.a.a.h((String)"index: ", (int)n2, (String)", size: ", (int)n3));
    }

    public boolean add(E e2) {
        this.I();
        this.H(this.l + this.m, e2);
        return true;
    }

    public boolean addAll(int n2, Collection<? extends E> collection) {
        k.x.c.i.e(collection, "elements");
        this.I();
        int n3 = this.m;
        if (n2 >= 0 && n2 <= n3) {
            int n4 = collection.size();
            this.G(n2 + this.l, collection, n4);
            return n4 > 0;
        }
        throw new IndexOutOfBoundsException(e.e.a.a.a.h((String)"index: ", (int)n2, (String)", size: ", (int)n3));
    }

    public boolean addAll(Collection<? extends E> collection) {
        k.x.c.i.e(collection, "elements");
        this.I();
        int n2 = collection.size();
        this.G(this.l + this.m, collection, n2);
        return n2 > 0;
    }

    public void clear() {
        this.I();
        this.L(this.l, this.m);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (object == this) return true;
        boolean bl = object instanceof List;
        boolean bl2 = false;
        if (!bl) return bl2;
        List list = (List)object;
        E[] arrE = this.k;
        int n2 = this.l;
        int n3 = this.m;
        if (n3 != list.size()) return false;
        int n4 = 0;
        while (n4 < n3) {
            if (!k.x.c.i.a(arrE[n2 + n4], list.get(n4))) {
                return false;
            }
            ++n4;
        }
        return true;
    }

    public E get(int n2) {
        int n3 = this.m;
        if (n2 >= 0 && n2 < n3) {
            return this.k[n2 + this.l];
        }
        throw new IndexOutOfBoundsException(e.e.a.a.a.h((String)"index: ", (int)n2, (String)", size: ", (int)n3));
    }

    public int h() {
        return this.m;
    }

    public int hashCode() {
        E[] arrE = this.k;
        int n2 = this.l;
        int n3 = this.m;
        int n4 = 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            E e2 = arrE[n2 + i2];
            int n5 = n4 * 31;
            int n6 = e2 == null ? 0 : e2.hashCode();
            n4 = n5 + n6;
        }
        return n4;
    }

    public int indexOf(Object object) {
        for (int i2 = 0; i2 < this.m; ++i2) {
            if (!k.x.c.i.a(this.k[i2 + this.l], object)) continue;
            return i2;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.m == 0;
    }

    public Iterator<E> iterator() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public int lastIndexOf(Object object) {
        for (int i2 = -1 + this.m; i2 >= 0; --i2) {
            if (!k.x.c.i.a(this.k[i2 + this.l], object)) continue;
            return i2;
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public ListIterator<E> listIterator(int n2) {
        int n3 = this.m;
        if (n2 >= 0 && n2 <= n3) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        throw new IndexOutOfBoundsException(e.e.a.a.a.h((String)"index: ", (int)n2, (String)", size: ", (int)n3));
    }

    public E r(int n2) {
        this.I();
        int n3 = this.m;
        if (n2 >= 0 && n2 < n3) {
            return this.K(n2 + this.l);
        }
        throw new IndexOutOfBoundsException(e.e.a.a.a.h((String)"index: ", (int)n2, (String)", size: ", (int)n3));
    }

    public boolean remove(Object object) {
        this.I();
        int n2 = this.indexOf(object);
        if (n2 >= 0) {
            this.r(n2);
        }
        return n2 >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        k.x.c.i.e(collection, "elements");
        this.I();
        int n2 = this.M(this.l, this.m, collection, false);
        boolean bl = false;
        if (n2 > 0) {
            bl = true;
        }
        return bl;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        k.x.c.i.e(collection, "elements");
        this.I();
        return this.M(this.l, this.m, collection, true) > 0;
    }

    public E set(int n2, E e2) {
        this.I();
        int n3 = this.m;
        if (n2 >= 0 && n2 < n3) {
            E[] arrE = this.k;
            int n4 = this.l;
            E e3 = arrE[n4 + n2];
            arrE[n4 + n2] = e2;
            return e3;
        }
        throw new IndexOutOfBoundsException(e.e.a.a.a.h((String)"index: ", (int)n2, (String)", size: ", (int)n3));
    }

    public List<E> subList(int n2, int n3) {
        int n4 = this.m;
        if (n2 >= 0 && n3 <= n4) {
            if (n2 <= n3) {
                E[] arrE = this.k;
                int n5 = n2 + this.l;
                int n6 = n3 - n2;
                boolean bl = this.n;
                a<E> a2 = this.p;
                a<E> a3 = a2 == null ? this : a2;
                a<E> a4 = new a<E>(arrE, n5, n6, bl, this, a3);
                return a4;
            }
            throw new IllegalArgumentException(e.e.a.a.a.h((String)"fromIndex: ", (int)n2, (String)" > toIndex: ", (int)n3));
        }
        StringBuilder stringBuilder = e.e.a.a.a.v((String)"fromIndex: ", (int)n2, (String)", toIndex: ", (int)n3, (String)", size: ");
        stringBuilder.append(n4);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public Object[] toArray() {
        Object[] arrobject = this.k;
        int n2 = this.l;
        return i.j((Object[])arrobject, (int)n2, (int)(n2 + this.m));
    }

    public <T> T[] toArray(T[] arrT) {
        k.x.c.i.e(arrT, "destination");
        int n2 = arrT.length;
        int n3 = this.m;
        if (n2 < n3) {
            Object[] arrobject = this.k;
            int n4 = this.l;
            Object[] arrobject2 = Arrays.copyOfRange((Object[])arrobject, (int)n4, (int)(n3 + n4), (Class)arrT.getClass());
            k.x.c.i.d(arrobject2, "copyOfRange(array, offse\u2026h, destination.javaClass)");
            return arrobject2;
        }
        Object[] arrobject = this.k;
        int n5 = this.l;
        i.g((Object[])arrobject, (Object[])arrT, (int)0, (int)n5, (int)(n3 + n5));
        int n6 = arrT.length;
        int n7 = this.m;
        if (n6 > n7) {
            arrT[n7] = null;
        }
        return arrT;
    }

    public String toString() {
        E[] arrE = this.k;
        int n2 = this.l;
        int n3 = this.m;
        StringBuilder stringBuilder = new StringBuilder(2 + n3 * 3);
        stringBuilder.append("[");
        for (int i2 = 0; i2 < n3; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arrE[n2 + i2]);
        }
        stringBuilder.append("]");
        String string = stringBuilder.toString();
        k.x.c.i.d(string, "sb.toString()");
        return string;
    }
}

