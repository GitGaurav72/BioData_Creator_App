/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.io.UnsupportedEncodingException
 *  java.lang.Boolean
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  k.b0.x.b.x0.h.h
 *  k.b0.x.b.x0.h.h$e
 *  k.b0.x.b.x0.h.k
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.h.p$a
 *  k.b0.x.b.x0.h.t
 */
package k.b0.x.b.x0.h;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.d;
import k.b0.x.b.x0.h.e;
import k.b0.x.b.x0.h.h;
import k.b0.x.b.x0.h.i;
import k.b0.x.b.x0.h.j;
import k.b0.x.b.x0.h.k;
import k.b0.x.b.x0.h.l;
import k.b0.x.b.x0.h.p;
import k.b0.x.b.x0.h.t;
import k.b0.x.b.x0.h.u;
import k.b0.x.b.x0.h.y;
import k.b0.x.b.x0.h.z;

public final class g<FieldDescriptorType extends a<FieldDescriptorType>> {
    public static final g a = new g<FieldDescriptorType>(true);
    public final u<FieldDescriptorType, Object> b;
    public boolean c;
    public boolean d = false;

    public g() {
        this.b = new t(16);
    }

    public g(boolean bl) {
        this.b = new t(0);
        this.i();
    }

    public static int d(y y2, Object object) {
        switch (y2.ordinal()) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 17: {
                long l2 = (Long)object;
                return e.h(l2 << 1 ^ l2 >> 63);
            }
            case 16: {
                int n2 = (Integer)object;
                return e.g(n2 << 1 ^ n2 >> 31);
            }
            case 15: {
                ((Long)object).longValue();
                return 8;
            }
            case 14: {
                ((Integer)object).intValue();
                return 4;
            }
            case 13: {
                if (object instanceof i.a) {
                    return e.d(((i.a)object).f());
                }
                return e.d((Integer)object);
            }
            case 12: {
                return e.g((Integer)object);
            }
            case 11: {
                if (object instanceof c) {
                    return e.a((c)object);
                }
                byte[] arrby = (byte[])object;
                return e.g(arrby.length) + arrby.length;
            }
            case 10: {
                if (object instanceof k) {
                    k k2 = (k)object;
                    if (k2.a) {
                        int n3 = k2.b.d();
                        return n3 + e.g(n3);
                    }
                    throw null;
                }
                return e.f((p)object);
            }
            case 9: {
                return ((p)object).d();
            }
            case 8: {
                int n4;
                int n5;
                String string = (String)object;
                try {
                    byte[] arrby = string.getBytes("UTF-8");
                    n4 = e.g(arrby.length);
                    n5 = arrby.length;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    throw new RuntimeException("UTF-8 not supported.", (Throwable)unsupportedEncodingException);
                }
                return n4 + n5;
            }
            case 7: {
                ((Boolean)object).booleanValue();
                return 1;
            }
            case 6: {
                ((Integer)object).intValue();
                return 4;
            }
            case 5: {
                ((Long)object).longValue();
                return 8;
            }
            case 4: {
                return e.d((Integer)object);
            }
            case 3: {
                return e.h((Long)object);
            }
            case 2: {
                return e.h((Long)object);
            }
            case 1: {
                ((Float)object).floatValue();
                return 4;
            }
            case 0: 
        }
        ((Double)object).doubleValue();
        return 8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int e(a<?> a2, Object object) {
        int n2;
        int n3;
        y y2 = a2.j();
        int n4 = a2.f();
        if (a2.i()) {
            boolean bl = a2.s();
            int n5 = 0;
            List list = (List)object;
            if (bl) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    n5 += g.d(y2, iterator.next());
                }
                n3 = n5 + e.i(n4);
                n2 = e.g(n5);
                do {
                    return n2 + n3;
                    break;
                } while (true);
            }
            for (Object object2 : list) {
                int n6 = e.i(n4);
                if (y2 == y.t) {
                    n6 *= 2;
                }
                n5 += n6 + g.d(y2, object2);
            }
            return n5;
        }
        n3 = e.i(n4);
        if (y2 == y.t) {
            n3 *= 2;
        }
        n2 = g.d(y2, object);
        return n2 + n3;
    }

    public static int g(y y2, boolean bl) {
        if (bl) {
            return 2;
        }
        return y2.E;
    }

    public static Object k(d d2, y y2, boolean bl) {
        switch (y2.ordinal()) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 17: {
                long l2 = d2.m();
                return l2 >>> 1 ^ -(l2 & 1L);
            }
            case 16: {
                int n2 = d2.l();
                return n2 >>> 1 ^ -(n2 & 1);
            }
            case 15: {
                return d2.k();
            }
            case 14: {
                return d2.j();
            }
            case 13: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
            case 12: {
                return d2.l();
            }
            case 11: {
                return d2.f();
            }
            case 10: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case 9: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case 8: {
                if (bl) {
                    int n3;
                    byte[] arrby;
                    int n4 = d2.l();
                    if (n4 <= d2.c - (n3 = d2.e) && n4 > 0) {
                        arrby = d2.a;
                        d2.e = n3 + n4;
                    } else {
                        if (n4 == 0) {
                            return "";
                        }
                        arrby = d2.i(n4);
                        n3 = 0;
                    }
                    if (e.s.a.a.B2((byte[])arrby, (int)n3, (int)(n3 + n4))) {
                        return new String(arrby, n3, n4, "UTF-8");
                    }
                    throw new j("Protocol message had invalid UTF-8.");
                }
                int n5 = d2.l();
                if (n5 <= d2.c - d2.e && n5 > 0) {
                    String string = new String(d2.a, d2.e, n5, "UTF-8");
                    d2.e = n5 + d2.e;
                    return string;
                }
                if (n5 == 0) {
                    return "";
                }
                return new String(d2.i(n5), "UTF-8");
            }
            case 7: {
                return d2.e();
            }
            case 6: {
                return d2.j();
            }
            case 5: {
                return d2.k();
            }
            case 4: {
                return d2.l();
            }
            case 3: {
                return d2.m();
            }
            case 2: {
                return d2.m();
            }
            case 1: {
                return Float.valueOf((float)Float.intBitsToFloat((int)d2.j()));
            }
            case 0: 
        }
        return Double.longBitsToDouble((long)d2.k());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void m(y y2, Object object) {
        boolean bl;
        block15 : {
            Objects.requireNonNull((Object)object);
            switch (y2.D.ordinal()) {
                default: {
                    bl = false;
                    break block15;
                }
                case 8: {
                    if (object instanceof p) return;
                    boolean bl2 = object instanceof k;
                    bl = false;
                    if (bl2) {
                        return;
                    }
                    break block15;
                }
                case 7: {
                    if (object instanceof Integer) return;
                    boolean bl3 = object instanceof i.a;
                    bl = false;
                    if (bl3) {
                        return;
                    }
                    break block15;
                }
                case 6: {
                    if (object instanceof c) return;
                    boolean bl4 = object instanceof byte[];
                    bl = false;
                    if (bl4) {
                        return;
                    }
                    break block15;
                }
                case 5: {
                    bl = object instanceof String;
                    break block15;
                }
                case 4: {
                    bl = object instanceof Boolean;
                    break block15;
                }
                case 3: {
                    bl = object instanceof Double;
                    break block15;
                }
                case 2: {
                    bl = object instanceof Float;
                    break block15;
                }
                case 1: {
                    bl = object instanceof Long;
                    break block15;
                }
                case 0: 
            }
            bl = object instanceof Integer;
        }
        if (!bl) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void n(e e2, y y2, int n2, Object object) {
        if (y2 == y.t) {
            p p2 = (p)object;
            int n3 = n2 << 3;
            e2.y(n3 | 3);
            p2.c(e2);
            e2.y(n3 | 4);
            return;
        }
        e2.y(g.g(y2, false) | n2 << 3);
        g.o(e2, y2, object);
    }

    public static void o(e e2, y y2, Object object) {
        switch (y2.ordinal()) {
            default: {
                return;
            }
            case 17: {
                long l2 = (Long)object;
                e2.z(l2 << 1 ^ l2 >> 63);
                return;
            }
            case 16: {
                int n2 = (Integer)object;
                e2.y(n2 << 1 ^ n2 >> 31);
                return;
            }
            case 15: {
                e2.x((Long)object);
                return;
            }
            case 14: {
                e2.w((Integer)object);
                return;
            }
            case 13: {
                int n3 = object instanceof i.a ? ((i.a)object).f() : ((Integer)object).intValue();
                e2.o(n3);
                return;
            }
            case 12: {
                e2.y((Integer)object);
                return;
            }
            case 11: {
                if (object instanceof c) {
                    e2.m((c)object);
                    return;
                }
                byte[] arrby = (byte[])object;
                e2.y(arrby.length);
                e2.v(arrby);
                return;
            }
            case 10: {
                e2.s((p)object);
                return;
            }
            case 9: {
                ((p)object).c(e2);
                return;
            }
            case 8: {
                byte[] arrby = ((String)object).getBytes("UTF-8");
                e2.y(arrby.length);
                e2.v(arrby);
                return;
            }
            case 7: {
                e2.t((int)((Boolean)object).booleanValue());
                return;
            }
            case 6: {
                e2.w((Integer)object);
                return;
            }
            case 5: {
                e2.x((Long)object);
                return;
            }
            case 4: {
                e2.q((Integer)object);
                return;
            }
            case 3: {
                e2.z((Long)object);
                return;
            }
            case 2: {
                e2.z((Long)object);
                return;
            }
            case 1: {
                e2.w(Float.floatToRawIntBits((float)((Float)object).floatValue()));
                return;
            }
            case 0: 
        }
        e2.x(Double.doubleToRawLongBits((double)((Double)object)));
    }

    public void a(FieldDescriptorType FieldDescriptorType, Object object) {
        if (((h.e)FieldDescriptorType).n) {
            List list;
            g.m(((h.e)FieldDescriptorType).m, object);
            Object object2 = this.f(FieldDescriptorType);
            if (object2 == null) {
                list = new ArrayList();
                this.b.o(FieldDescriptorType, (Object)list);
            } else {
                list = (List)object2;
            }
            list.add(object);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public g<FieldDescriptorType> b() {
        g<a> g2 = new g<a>();
        for (int i2 = 0; i2 < this.b.k(); ++i2) {
            Map.Entry<FieldDescriptorType, Object> entry = this.b.j(i2);
            g2.l((a)entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry : this.b.l()) {
            g2.l((a)entry.getKey(), entry.getValue());
        }
        g2.d = this.d;
        return g2;
    }

    public final Object c(Object object) {
        if (object instanceof byte[]) {
            byte[] arrby = (byte[])object;
            byte[] arrby2 = new byte[arrby.length];
            System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)0, (int)arrby.length);
            return arrby2;
        }
        return object;
    }

    public Object f(FieldDescriptorType FieldDescriptorType) {
        Object object = this.b.get(FieldDescriptorType);
        if (object instanceof k) {
            object = ((k)object).a();
        }
        return object;
    }

    public final boolean h(Map.Entry<FieldDescriptorType, Object> entry) {
        a a2 = (a)entry.getKey();
        if (a2.p() == z.s) {
            boolean bl = a2.i();
            Object object = entry.getValue();
            if (bl) {
                Iterator iterator = ((List)object).iterator();
                while (iterator.hasNext()) {
                    if (((p)iterator.next()).f()) continue;
                    return false;
                }
            } else if (object instanceof p) {
                if (!((p)object).f()) {
                    return false;
                }
            } else {
                if (object instanceof k) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public void i() {
        if (this.c) {
            return;
        }
        t t2 = (t)this.b;
        if (!t2.o) {
            for (int i2 = 0; i2 < t2.k(); ++i2) {
                Map.Entry entry = t2.j(i2);
                if (!((a)entry.getKey()).i()) continue;
                entry.setValue((Object)Collections.unmodifiableList((List)((List)entry.getValue())));
            }
            for (Map.Entry entry : t2.l()) {
                if (!((a)entry.getKey()).i()) continue;
                entry.setValue((Object)Collections.unmodifiableList((List)((List)entry.getValue())));
            }
        }
        if (!t2.o) {
            Map map = t2.n.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(t2.n);
            t2.n = map;
            t2.o = true;
        }
        this.c = true;
    }

    public final void j(Map.Entry<FieldDescriptorType, Object> entry) {
        Object object;
        Object object2;
        u<FieldDescriptorType, Object> u2;
        a a2 = (a)entry.getKey();
        Object object3 = entry.getValue();
        if (object3 instanceof k) {
            object3 = ((k)object3).a();
        }
        if (a2.i()) {
            Object object4 = this.f(a2);
            if (object4 == null) {
                object4 = new ArrayList();
            }
            for (Object object5 : (List)object3) {
                ((List)object4).add(this.c(object5));
            }
            this.b.o(a2, object4);
            return;
        }
        if (a2.p() == z.s && (object2 = this.f(a2)) != null) {
            object = a2.g(((p)object2).b(), (p)object3).build();
            u2 = this.b;
        } else {
            u2 = this.b;
            object = this.c(object3);
        }
        u2.o(a2, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void l(FieldDescriptorType FieldDescriptorType, Object object) {
        if (FieldDescriptorType.i()) {
            if (!(object instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)((List)object));
            for (Object object2 : arrayList) {
                g.m(FieldDescriptorType.j(), object2);
            }
            object = arrayList;
        } else {
            g.m(FieldDescriptorType.j(), object);
        }
        if (object instanceof k) {
            this.d = true;
        }
        this.b.o(FieldDescriptorType, object);
    }

    public static interface a<T extends a<T>>
    extends Comparable<T> {
        public int f();

        public p.a g(p.a var1, p var2);

        public boolean i();

        public y j();

        public z p();

        public boolean s();
    }

}

