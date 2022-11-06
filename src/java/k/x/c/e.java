/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Objects
 *  kotlin.Metadata
 */
package k.x.c;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(d1={"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007\u00a2\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007\u00a2\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b\u00a2\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k=2, mv={1, 6, 0}, xi=48)
public final class e {
    public static final Object[] a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        Iterator iterator;
        i.e(collection, "collection");
        int n2 = collection.size();
        if (n2 == 0 || !(iterator = collection.iterator()).hasNext()) {
            return a;
        }
        Object[] arrobject = new Object[n2];
        int n3 = 0;
        do {
            int n4 = n3 + 1;
            arrobject[n3] = iterator.next();
            if (n4 >= arrobject.length) {
                if (!iterator.hasNext()) {
                    return arrobject;
                }
                int n5 = 1 + n4 * 3 >>> 1;
                if (n5 <= n4) {
                    if (n4 < 2147483645) {
                        n5 = 2147483645;
                    } else {
                        throw new OutOfMemoryError();
                    }
                }
                arrobject = Arrays.copyOf((Object[])arrobject, (int)n5);
                i.d(arrobject, "copyOf(result, newSize)");
            } else if (!iterator.hasNext()) {
                Object[] arrobject2 = Arrays.copyOf((Object[])arrobject, (int)n4);
                i.d(arrobject2, "copyOf(result, size)");
                return arrobject2;
            }
            n3 = n4;
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object[] b(Collection<?> collection, Object[] arrobject) {
        Object[] arrobject2;
        i.e(collection, "collection");
        int n2 = collection.size();
        int n3 = 0;
        if (n2 == 0) {
            if (arrobject.length <= 0) return arrobject;
            arrobject[0] = null;
            return arrobject;
        }
        Iterator iterator = collection.iterator();
        if (!iterator.hasNext()) {
            if (arrobject.length <= 0) return arrobject;
            arrobject[0] = null;
            return arrobject;
        }
        if (n2 <= arrobject.length) {
            arrobject2 = arrobject;
            n3 = 0;
        } else {
            Object object = Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)n2);
            Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arrobject2 = (Object[])object;
        }
        do {
            int n4 = n3 + 1;
            arrobject2[n3] = iterator.next();
            if (n4 >= arrobject2.length) {
                if (!iterator.hasNext()) {
                    return arrobject2;
                }
                int n5 = 1 + n4 * 3 >>> 1;
                if (n5 <= n4) {
                    if (n4 >= 2147483645) throw new OutOfMemoryError();
                    n5 = 2147483645;
                }
                arrobject2 = Arrays.copyOf((Object[])arrobject2, (int)n5);
                i.d(arrobject2, "copyOf(result, newSize)");
            } else if (!iterator.hasNext()) {
                if (arrobject2 == arrobject) {
                    arrobject[n4] = null;
                    return arrobject;
                }
                arrobject = Arrays.copyOf((Object[])arrobject2, (int)n4);
                i.d(arrobject, "copyOf(result, size)");
                return arrobject;
            }
            n3 = n4;
        } while (true);
    }
}

