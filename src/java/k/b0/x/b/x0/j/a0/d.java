/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.lang.reflect.Modifier
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  k.s.i
 *  k.s.r
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.j.a0;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.j.a0.c;
import k.s.r;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {
    public static final a a;
    public static int b = 1;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final List<a.a> r;
    public static final List<a.a> s;
    public final List<c> t;
    public final int u;

    public static {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        a = new a(null);
        int n12 = b;
        b = n6 = n12 << 1;
        c = n12;
        b = n4 = n6 << 1;
        d = n6;
        b = n11 = n4 << 1;
        e = n4;
        b = n8 = n11 << 1;
        f = n11;
        b = n3 = n8 << 1;
        g = n8;
        b = n5 = n3 << 1;
        h = n3;
        b = n5 << 1;
        i = n9 = n5 - 1;
        j = n10 = n4 | (n12 | n6);
        k = n2 = n3 | (n6 | n8);
        l = n7 = n8 | n3;
        m = new d(n9, null, 2);
        n = new d(n7, null, 2);
        new d(n12, null, 2);
        new d(n6, null, 2);
        new d(n4, null, 2);
        o = new d(n10, null, 2);
        new d(n11, null, 2);
        p = new d(n8, null, 2);
        q = new d(n3, null, 2);
        new d(n2, null, 2);
        Field[] arrfield = d.class.getFields();
        i.d(arrfield, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : arrfield) {
            if (!Modifier.isStatic((int)field.getModifiers())) continue;
            arrayList.add((Object)field);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field : arrayList) {
            a.a a2;
            Object object = field.get(null);
            d d2 = object instanceof d ? (d)object : null;
            if (d2 != null) {
                int n13 = d2.u;
                String string = field.getName();
                i.d(string, "field.name");
                a2 = new a.a(n13, string);
            } else {
                a2 = null;
            }
            if (a2 == null) continue;
            arrayList2.add(a2);
        }
        r = arrayList2;
        Field[] arrfield2 = d.class.getFields();
        i.d(arrfield2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field : arrfield2) {
            if (!Modifier.isStatic((int)field.getModifiers())) continue;
            arrayList3.add((Object)field);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object object : arrayList3) {
            if (!i.a((Object)((Field)object).getType(), (Object)Integer.TYPE)) continue;
            arrayList4.add(object);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field : arrayList4) {
            a.a a3;
            Object object = field.get(null);
            Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type kotlin.Int");
            int n14 = (Integer)object;
            boolean bl = n14 == (n14 & -n14);
            if (bl) {
                String string = field.getName();
                i.d(string, "field.name");
                a3 = new a.a(n14, string);
            } else {
                a3 = null;
            }
            if (a3 == null) continue;
            arrayList5.add(a3);
        }
        s = arrayList5;
    }

    public d(int n2, List<? extends c> list) {
        i.e(list, "excludes");
        this.t = list;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            n2 &= ((c)iterator.next()).a();
        }
        this.u = n2;
    }

    public /* synthetic */ d(int n2, List list, int n3) {
        Object object = (n3 & 2) != 0 ? r.k : null;
        this(n2, (List<? extends c>)object);
    }

    public final boolean a(int n2) {
        return (n2 & this.u) != 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class class_ = object == null ? null : object.getClass();
        if (!i.a(d.class, (Object)class_)) {
            return false;
        }
        Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d d2 = (d)object;
        if (!i.a(this.t, d2.t)) {
            return false;
        }
        return this.u == d2.u;
    }

    public int hashCode() {
        return 31 * this.t.hashCode() + this.u;
    }

    public String toString() {
        Object object2;
        block3 : {
            for (Object object2 : r) {
                boolean bl = ((a.a)object2).a == this.u;
                if (!bl) continue;
                break block3;
            }
            object2 = null;
        }
        a.a a2 = (a.a)object2;
        String string = a2 == null ? null : a2.b;
        if (string == null) {
            List<a.a> list = s;
            ArrayList arrayList = new ArrayList();
            for (a.a a3 : list) {
                String string2 = this.a(a3.a) ? a3.b : null;
                if (string2 == null) continue;
                arrayList.add((Object)string2);
            }
            string = k.s.i.A((Iterable)arrayList, (CharSequence)" | ", null, null, (int)0, null, null, (int)62);
        }
        StringBuilder stringBuilder = e.e.a.a.a.y((String)"DescriptorKindFilter(", (String)string, (String)", ");
        stringBuilder.append(this.t);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static final class k.b0.x.b.x0.j.a0.d$a {
        public k.b0.x.b.x0.j.a0.d$a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final class a {
            public final int a;
            public final String b;

            public a(int n2, String string) {
                i.e(string, "name");
                this.a = n2;
                this.b = string;
            }
        }

    }

}

