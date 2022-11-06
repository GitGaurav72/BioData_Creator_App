/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  k.s.h
 *  k.s.i
 *  k.s.r
 */
package k.b0.x.b.x0.f.z;

import java.util.ArrayList;
import java.util.List;
import k.s.h;
import k.s.r;
import k.x.c.i;

public abstract class a {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List<Integer> e;

    public /* varargs */ a(int ... arrn) {
        r r2;
        i.e(arrn, "numbers");
        this.a = arrn;
        Integer n2 = e.s.a.a.L1((int[])arrn, (int)0);
        int n3 = -1;
        int n4 = n2 == null ? n3 : n2;
        this.b = n4;
        Integer n5 = e.s.a.a.L1((int[])arrn, (int)1);
        int n6 = n5 == null ? n3 : n5;
        this.c = n6;
        Integer n7 = e.s.a.a.L1((int[])arrn, (int)2);
        if (n7 != null) {
            n3 = n7;
        }
        this.d = n3;
        if (arrn.length > 3) {
            i.e(arrn, "<this>");
            r2 = k.s.i.b0((Iterable)new h(arrn).subList(3, arrn.length));
        } else {
            r2 = r.k;
        }
        this.e = r2;
    }

    public final boolean a(int n2, int n3, int n4) {
        int n5 = this.b;
        if (n5 > n2) {
            return true;
        }
        if (n5 < n2) {
            return false;
        }
        int n6 = this.c;
        if (n6 > n3) {
            return true;
        }
        if (n6 < n3) {
            return false;
        }
        return this.d >= n4;
    }

    public final boolean b(a a2) {
        i.e(a2, "ourVersion");
        int n2 = this.b;
        return n2 == 0 ? a2.b == 0 && this.c == a2.c : n2 == a2.b && this.c <= a2.c;
    }

    public boolean equals(Object object) {
        if (object != null && i.a((Object)this.getClass(), (Object)object.getClass())) {
            int n2 = this.b;
            a a2 = (a)object;
            if (n2 == a2.b && this.c == a2.c && this.d == a2.d && i.a(this.e, a2.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b;
        int n3 = n2 + (n2 * 31 + this.c);
        int n4 = n3 + (n3 * 31 + this.d);
        return n4 + (n4 * 31 + this.e.hashCode());
    }

    public String toString() {
        int[] arrn = this.a;
        ArrayList arrayList = new ArrayList();
        for (int n2 : arrn) {
            boolean bl = n2 != -1;
            if (!bl) break;
            arrayList.add((Object)n2);
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return k.s.i.A((Iterable)arrayList, (CharSequence)".", null, null, (int)0, null, null, (int)62);
    }
}

