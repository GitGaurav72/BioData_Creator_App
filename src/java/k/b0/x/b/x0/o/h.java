/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.reflect.Array
 *  java.util.AbstractList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 *  java.util.RandomAccess
 *  k.b0.x.b.x0.o.h$c
 */
package k.b0.x.b.x0.o;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import k.b0.x.b.x0.o.h;

/*
 * Exception performing whole class analysis.
 */
public class h<E>
extends AbstractList<E>
implements RandomAccess {
    public int k;
    public Object l;

    public static /* synthetic */ void h(int n2) {
        String string = n2 != 2 && n2 != 3 && n2 != 5 && n2 != 6 && n2 != 7 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 2 && n2 != 3 && n2 != 5 && n2 != 6 && n2 != 7 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "elements";
                break;
            }
            case 4: {
                arrobject[0] = "a";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            }
        }
        arrobject[1] = n2 != 2 && n2 != 3 ? (n2 != 5 && n2 != 6 && n2 != 7 ? "kotlin/reflect/jvm/internal/impl/utils/SmartList" : "toArray") : "iterator";
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 4: {
                arrobject[2] = "toArray";
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 2 && n2 != 3 && n2 != 5 && n2 != 6 && n2 != 7 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw object;
    }

    public static /* synthetic */ int k(h h2) {
        return h2.modCount;
    }

    public static /* synthetic */ int l(h h2) {
        return h2.modCount;
    }

    public static /* synthetic */ int n(h h2) {
        return h2.modCount;
    }

    public void add(int n2, E e2) {
        int n3;
        if (n2 >= 0 && n2 <= (n3 = this.k)) {
            if (n3 == 0) {
                this.l = e2;
            } else if (n3 == 1 && n2 == 0) {
                Object[] arrobject = new Object[]{e2, this.l};
                this.l = arrobject;
            } else {
                Object[] arrobject = new Object[n3 + 1];
                if (n3 == 1) {
                    arrobject[0] = this.l;
                } else {
                    Object[] arrobject2 = (Object[])this.l;
                    System.arraycopy((Object)arrobject2, (int)0, (Object)arrobject, (int)0, (int)n2);
                    System.arraycopy((Object)arrobject2, (int)n2, (Object)arrobject, (int)(n2 + 1), (int)(this.k - n2));
                }
                arrobject[n2] = e2;
                this.l = arrobject;
            }
            this.k = 1 + this.k;
            this.modCount = 1 + this.modCount;
            return;
        }
        StringBuilder stringBuilder = e.e.a.a.a.u((String)"Index: ", (int)n2, (String)", Size: ");
        stringBuilder.append(this.k);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public boolean add(E e2) {
        int n2 = this.k;
        if (n2 == 0) {
            this.l = e2;
        } else if (n2 == 1) {
            Object[] arrobject = new Object[]{this.l, e2};
            this.l = arrobject;
        } else {
            Object[] arrobject = (Object[])this.l;
            int n3 = arrobject.length;
            if (n2 >= n3) {
                Object[] arrobject2;
                int n4 = 1 + n3 * 3 / 2;
                int n5 = n2 + 1;
                if (n4 < n5) {
                    n4 = n5;
                }
                this.l = arrobject2 = new Object[n4];
                System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)0, (int)n3);
                arrobject = arrobject2;
            }
            arrobject[this.k] = e2;
        }
        this.k = 1 + this.k;
        this.modCount = 1 + this.modCount;
        return true;
    }

    public void clear() {
        this.l = null;
        this.k = 0;
        this.modCount = 1 + this.modCount;
    }

    public E get(int n2) {
        int n3;
        if (n2 >= 0 && n2 < (n3 = this.k)) {
            if (n3 == 1) {
                return (E)this.l;
            }
            return (E)((Object[])this.l)[n2];
        }
        StringBuilder stringBuilder = e.e.a.a.a.u((String)"Index: ", (int)n2, (String)", Size: ");
        stringBuilder.append(this.k);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public Iterator<E> iterator() {
        int n2 = this.k;
        if (n2 == 0) {
            return b.k;
        }
        if (n2 == 1) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        Iterator iterator = super.iterator();
        if (iterator != null) {
            return iterator;
        }
        h.h(3);
        throw null;
    }

    public E remove(int n2) {
        int n3;
        if (n2 >= 0 && n2 < (n3 = this.k)) {
            Object object;
            if (n3 == 1) {
                object = this.l;
                this.l = null;
            } else {
                Object[] arrobject = (Object[])this.l;
                Object object2 = arrobject[n2];
                if (n3 == 2) {
                    this.l = arrobject[1 - n2];
                } else {
                    int n4 = n3 - n2 - 1;
                    if (n4 > 0) {
                        System.arraycopy((Object)arrobject, (int)(n2 + 1), (Object)arrobject, (int)n2, (int)n4);
                    }
                    arrobject[this.k - 1] = null;
                }
                object = object2;
            }
            --this.k;
            this.modCount = 1 + this.modCount;
            return (E)object;
        }
        StringBuilder stringBuilder = e.e.a.a.a.u((String)"Index: ", (int)n2, (String)", Size: ");
        stringBuilder.append(this.k);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public E set(int n2, E e2) {
        int n3;
        if (n2 >= 0 && n2 < (n3 = this.k)) {
            if (n3 == 1) {
                Object object = this.l;
                this.l = e2;
                return (E)object;
            }
            Object[] arrobject = (Object[])this.l;
            Object object = arrobject[n2];
            arrobject[n2] = e2;
            return (E)object;
        }
        StringBuilder stringBuilder = e.e.a.a.a.u((String)"Index: ", (int)n2, (String)", Size: ");
        stringBuilder.append(this.k);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public int size() {
        return this.k;
    }

    /*
     * Enabled aggressive block sorting
     */
    public <T> T[] toArray(T[] arrT) {
        if (arrT == null) {
            h.h(4);
            throw null;
        }
        int n2 = arrT.length;
        int n3 = this.k;
        if (n3 == 1) {
            if (n2 == 0) {
                Object[] arrobject = (Object[])Array.newInstance((Class)arrT.getClass().getComponentType(), (int)1);
                arrobject[0] = this.l;
                return arrobject;
            }
            arrT[0] = this.l;
        } else {
            if (n2 < n3) {
                Object[] arrobject = Arrays.copyOf((Object[])((Object[])this.l), (int)n3, (Class)arrT.getClass());
                if (arrobject != null) {
                    return arrobject;
                }
                h.h(6);
                throw null;
            }
            if (n3 != 0) {
                System.arraycopy((Object)this.l, (int)0, arrT, (int)0, (int)n3);
            }
        }
        int n4 = this.k;
        if (n2 > n4) {
            arrT[n4] = null;
        }
        return arrT;
    }

    public static class b<T>
    implements Iterator<T> {
        public static final b k = new b<T>();

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    public static abstract class d<T>
    implements Iterator<T> {
        public boolean k;

        public d(a a2) {
        }

        public abstract void a();

        public final boolean hasNext() {
            return true ^ this.k;
        }

        public final T next() {
            if (!this.k) {
                this.k = true;
                this.a();
                return (T)(this).m.l;
            }
            throw new NoSuchElementException();
        }
    }

}

