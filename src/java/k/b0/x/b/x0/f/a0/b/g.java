/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  k.b0.x.b.x0.f.a0.a$b
 *  k.b0.x.b.x0.f.a0.a$c
 *  k.b0.x.b.x0.f.a0.a$d
 *  k.b0.x.b.x0.f.a0.a$e
 *  k.b0.x.b.x0.f.a0.b.d$a
 *  k.b0.x.b.x0.f.a0.b.d$b
 *  k.b0.x.b.x0.f.a0.b.f
 *  k.b0.x.b.x0.f.b
 *  k.b0.x.b.x0.f.c
 *  k.b0.x.b.x0.f.d
 *  k.b0.x.b.x0.f.i
 *  k.b0.x.b.x0.f.l
 *  k.b0.x.b.x0.f.n
 *  k.b0.x.b.x0.f.q
 *  k.b0.x.b.x0.f.s
 *  k.b0.x.b.x0.f.u
 *  k.b0.x.b.x0.f.z.b$b
 *  k.b0.x.b.x0.h.b
 *  k.b0.x.b.x0.h.h
 *  k.b0.x.b.x0.h.h$d
 *  k.b0.x.b.x0.h.p
 *  k.s.i
 */
package k.b0.x.b.x0.f.a0.b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k.b0.x.b.x0.f.a0.a;
import k.b0.x.b.x0.f.a0.b.d;
import k.b0.x.b.x0.f.a0.b.f;
import k.b0.x.b.x0.f.b;
import k.b0.x.b.x0.f.c;
import k.b0.x.b.x0.f.d;
import k.b0.x.b.x0.f.i;
import k.b0.x.b.x0.f.l;
import k.b0.x.b.x0.f.n;
import k.b0.x.b.x0.f.q;
import k.b0.x.b.x0.f.s;
import k.b0.x.b.x0.f.u;
import k.b0.x.b.x0.f.z.b;
import k.b0.x.b.x0.f.z.e;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.r;

/*
 * Exception performing whole class analysis.
 */
public final class g {
    public static final g a;
    public static final k.b0.x.b.x0.h.f b;

    public static {
        a = new g();
        k.b0.x.b.x0.h.f f2 = new k.b0.x.b.x0.h.f();
        f2.a(a.a);
        f2.a(a.b);
        f2.a(a.c);
        f2.a(a.d);
        f2.a(a.e);
        f2.a(a.f);
        f2.a(a.g);
        f2.a(a.h);
        f2.a(a.i);
        f2.a(a.j);
        f2.a(a.k);
        f2.a(a.l);
        f2.a(a.m);
        f2.a(a.n);
        k.x.c.i.d(f2, "newInstance().apply(JvmP\u2026f::registerAllExtensions)");
        b = f2;
    }

    public static final boolean d(n n2) {
        k.x.c.i.e((Object)n2, "proto");
        b.b b2 = k.b0.x.b.x0.f.a0.b.c.b;
        Object object = n2.m(a.e);
        k.x.c.i.d(object, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean bl = b2.f(((Number)object).intValue());
        k.x.c.i.d((Object)bl, "JvmFlags.IS_MOVED_FROM_I\u2026nsion(JvmProtoBuf.flags))");
        return bl;
    }

    public static final k.i<f, c> f(String[] arrstring, String[] arrstring2) {
        k.x.c.i.e(arrstring, "data");
        k.x.c.i.e(arrstring2, "strings");
        byte[] arrby = k.b0.x.b.x0.f.a0.b.a.b(arrstring);
        k.x.c.i.d(arrby, "decodeBytes(data)");
        k.x.c.i.e(arrby, "bytes");
        k.x.c.i.e(arrstring2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
        k.b0.x.b.x0.h.f f2 = b;
        a.e e2 = ((k.b0.x.b.x0.h.b)a.e.l).c((InputStream)byteArrayInputStream, f2);
        k.x.c.i.d((Object)e2, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        f f3 = new f(e2, arrstring2);
        k.b0.x.b.x0.h.b b2 = (k.b0.x.b.x0.h.b)c.m;
        p p2 = b2.d((InputStream)byteArrayInputStream, f2);
        b2.b(p2);
        return new k.i<f, c>(f3, (c)p2);
    }

    public static final k.i<f, l> g(String[] arrstring, String[] arrstring2) {
        k.x.c.i.e(arrstring, "data");
        k.x.c.i.e(arrstring2, "strings");
        byte[] arrby = k.b0.x.b.x0.f.a0.b.a.b(arrstring);
        k.x.c.i.d(arrby, "decodeBytes(data)");
        k.x.c.i.e(arrby, "bytes");
        k.x.c.i.e(arrstring2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
        k.b0.x.b.x0.h.f f2 = b;
        a.e e2 = ((k.b0.x.b.x0.h.b)a.e.l).c((InputStream)byteArrayInputStream, f2);
        k.x.c.i.d((Object)e2, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        f f3 = new f(e2, arrstring2);
        k.b0.x.b.x0.h.b b2 = (k.b0.x.b.x0.h.b)l.m;
        p p2 = b2.d((InputStream)byteArrayInputStream, f2);
        b2.b(p2);
        return new k.i<f, l>(f3, (l)p2);
    }

    public final d.b a(d d2, k.b0.x.b.x0.f.z.c c2, e e2) {
        String string;
        k.x.c.i.e((Object)d2, "proto");
        k.x.c.i.e(c2, "nameResolver");
        k.x.c.i.e(e2, "typeTable");
        h.f<d, a.c> f2 = a.a;
        k.x.c.i.d(f2, "constructorSignature");
        a.c c3 = e.s.a.a.t1((h.d)d2, f2);
        String string2 = c3 != null && c3.j() ? c2.b(c3.o) : "<init>";
        if (c3 != null && c3.i()) {
            string = c2.b(c3.p);
        } else {
            List list = d2.q;
            k.x.c.i.d((Object)list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
            for (u u2 : list) {
                k.x.c.i.d((Object)u2, "it");
                q q2 = e.s.a.a.v4((u)u2, (e)e2);
                String string3 = q2.u() ? k.b0.x.b.x0.f.a0.b.b.b(c2.a(q2.u)) : null;
                if (string3 == null) {
                    return null;
                }
                arrayList.add((Object)string3);
            }
            string = k.s.i.A((Iterable)arrayList, (CharSequence)"", (CharSequence)"(", (CharSequence)")V", (int)0, null, null, (int)56);
        }
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final d.a b(n n2, k.b0.x.b.x0.f.z.c c2, e e2, boolean bl) {
        String string;
        int n3;
        k.x.c.i.e((Object)n2, "proto");
        k.x.c.i.e(c2, "nameResolver");
        k.x.c.i.e(e2, "typeTable");
        h.f<n, a.d> f2 = a.d;
        k.x.c.i.d(f2, "propertySignature");
        a.d d2 = e.s.a.a.t1((h.d)n2, f2);
        if (d2 == null) {
            return null;
        }
        int n4 = d2.n;
        int n5 = 1;
        int n6 = (n4 & n5) == n5 ? n5 : 0;
        a.b b2 = n6 != 0 ? d2.o : null;
        if (b2 == null && bl) {
            return null;
        }
        int n7 = b2 != null && (n3 = (n5 & b2.n) == n5 ? n5 : 0) != 0 ? b2.o : n2.r;
        if (b2 != null) {
            if ((2 & b2.n) != 2) {
                n5 = 0;
            }
            if (n5 != 0) {
                string = c2.b(b2.p);
                return new /* Unavailable Anonymous Inner Class!! */;
            }
        }
        if ((string = this.e(e.s.a.a.C3((n)n2, (e)e2), c2)) != null) return new /* Unavailable Anonymous Inner Class!! */;
        return null;
    }

    public final d.b c(i i2, k.b0.x.b.x0.f.z.c c2, e e2) {
        String string;
        k.x.c.i.e((Object)i2, "proto");
        k.x.c.i.e(c2, "nameResolver");
        k.x.c.i.e(e2, "typeTable");
        h.f<i, a.c> f2 = a.b;
        k.x.c.i.d(f2, "methodSignature");
        a.c c3 = e.s.a.a.t1((h.d)i2, f2);
        int n2 = c3 != null && c3.j() ? c3.o : i2.r;
        if (c3 != null && c3.i()) {
            string = c2.b(c3.p);
        } else {
            List list = k.s.i.F((Object)e.s.a.a.f3((i)i2, (e)e2));
            List list2 = i2.x;
            k.x.c.i.d((Object)list2, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list2, (int)10));
            for (u u2 : list2) {
                k.x.c.i.d((Object)u2, "it");
                arrayList.add((Object)e.s.a.a.v4((u)u2, (e)e2));
            }
            List list3 = k.s.i.M((Collection)list, (Iterable)arrayList);
            ArrayList arrayList2 = new ArrayList(e.s.a.a.U((Iterable)list3, (int)10));
            for (q q2 : (ArrayList)list3) {
                String string2 = q2.u() ? k.b0.x.b.x0.f.a0.b.b.b(c2.a(q2.u)) : null;
                if (string2 == null) {
                    return null;
                }
                arrayList2.add((Object)string2);
            }
            String string3 = this.e(e.s.a.a.B3((i)i2, (e)e2), c2);
            if (string3 == null) {
                return null;
            }
            string = k.x.c.i.k(k.s.i.A((Iterable)arrayList2, (CharSequence)"", (CharSequence)"(", (CharSequence)")", (int)0, null, null, (int)56), string3);
        }
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public final String e(q q2, k.b0.x.b.x0.f.z.c c2) {
        if (q2.u()) {
            return k.b0.x.b.x0.f.a0.b.b.b(c2.a(q2.u));
        }
        return null;
    }
}

