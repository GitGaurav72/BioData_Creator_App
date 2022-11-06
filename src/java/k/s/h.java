/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.util.RandomAccess
 *  k.s.b
 *  kotlin.Metadata
 */
package k.s;

import e.s.a.a;
import java.util.RandomAccess;
import k.s.b;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(d1={"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2={"kotlin/collections/ArraysKt___ArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Integer;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k=1, mv={1, 6, 0}, xi=48)
public final class h
extends b<Integer>
implements RandomAccess {
    public final /* synthetic */ int[] k;

    public h(int[] arrn) {
        this.k = arrn;
    }

    public final boolean contains(Object object) {
        if (!(object instanceof Integer)) {
            return false;
        }
        int n2 = ((Number)object).intValue();
        int[] arrn = this.k;
        i.e(arrn, "<this>");
        int n3 = a.f2((int[])arrn, (int)n2);
        boolean bl = false;
        if (n3 >= 0) {
            bl = true;
        }
        return bl;
    }

    public Object get(int n2) {
        return this.k[n2];
    }

    public int h() {
        return this.k.length;
    }

    public final int indexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        int n2 = ((Number)object).intValue();
        return a.f2((int[])this.k, (int)n2);
    }

    public boolean isEmpty() {
        return this.k.length == 0;
    }

    public final int lastIndexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        int n2 = ((Number)object).intValue();
        int[] arrn = this.k;
        i.e(arrn, "<this>");
        int n3 = -1 + arrn.length;
        if (n3 >= 0) {
            do {
                int n4 = n3 - 1;
                if (n2 == arrn[n3]) {
                    return n3;
                }
                if (n4 < 0) {
                    return -1;
                }
                n3 = n4;
            } while (true);
        }
        return -1;
    }
}

