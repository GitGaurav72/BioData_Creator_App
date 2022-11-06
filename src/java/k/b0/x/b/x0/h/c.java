/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.io.OutputStream
 *  java.io.UnsupportedEncodingException
 *  java.lang.Byte
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Stack
 *  k.b0.x.b.x0.h.o
 *  k.b0.x.b.x0.h.s
 */
package k.b0.x.b.x0.h;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import k.b0.x.b.x0.h.o;
import k.b0.x.b.x0.h.s;

public abstract class c
implements Iterable<Byte> {
    public static final c k = new o(new byte[0]);

    public static b J() {
        return new b(128);
    }

    public static c h(Iterator<c> iterator, int n2) {
        if (n2 == 1) {
            return (c)iterator.next();
        }
        int n3 = n2 >>> 1;
        return c.h(iterator, n3).k(c.h(iterator, n2 - n3));
    }

    public static c l(String string) {
        try {
            o o2 = new o(string.getBytes("UTF-8"));
            return o2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 not supported?", (Throwable)unsupportedEncodingException);
        }
    }

    public abstract int F();

    public abstract boolean G();

    public abstract boolean H();

    public abstract a I();

    public abstract int K(int var1, int var2, int var3);

    public abstract int L(int var1, int var2, int var3);

    public abstract int M();

    public abstract String N(String var1);

    public String O() {
        try {
            String string = this.N("UTF-8");
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 not supported?", (Throwable)unsupportedEncodingException);
        }
    }

    public abstract void P(OutputStream var1, int var2, int var3);

    public c k(c c2) {
        int n2;
        int n3 = this.size();
        if ((long)n3 + (long)(n2 = c2.size()) < Integer.MAX_VALUE) {
            s s2 = this instanceof s ? (s)this : null;
            if (c2.size() == 0) {
                return this;
            }
            if (this.size() == 0) {
                return c2;
            }
            int n4 = this.size() + c2.size();
            if (n4 < 128) {
                return s.Q((c)this, (c)c2);
            }
            if (s2 != null && s2.o.size() + c2.size() < 128) {
                o o2 = s.Q((c)s2.o, (c)c2);
                return new s(s2.n, (c)o2);
            }
            if (s2 != null && s2.n.F() > s2.o.F() && s2.q > c2.F()) {
                s s3 = new s(s2.o, c2);
                return new s(s2.n, (c)s3);
            }
            int n5 = 1 + Math.max((int)this.F(), (int)c2.F());
            if (n4 >= s.l[n5]) {
                return new s(this, c2);
            }
            s.b b2 = new s.b(null);
            b2.a(this);
            b2.a(c2);
            c c3 = (c)b2.a.pop();
            while (!b2.a.isEmpty()) {
                c3 = new s((c)b2.a.pop(), c3);
            }
            return c3;
        }
        StringBuilder stringBuilder = new StringBuilder(53);
        stringBuilder.append("ByteString would be too long: ");
        stringBuilder.append(n3);
        stringBuilder.append("+");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void n(byte[] arrby, int n2, int n3, int n4) {
        if (n2 >= 0) {
            if (n3 >= 0) {
                if (n4 >= 0) {
                    int n5 = n2 + n4;
                    if (n5 <= this.size()) {
                        int n6 = n3 + n4;
                        if (n6 <= arrby.length) {
                            if (n4 > 0) {
                                this.r(arrby, n2, n3, n4);
                            }
                            return;
                        }
                        throw new IndexOutOfBoundsException(e.e.a.a.a.J((int)34, (String)"Target end offset < 0: ", (int)n6));
                    }
                    throw new IndexOutOfBoundsException(e.e.a.a.a.J((int)34, (String)"Source end offset < 0: ", (int)n5));
                }
                throw new IndexOutOfBoundsException(e.e.a.a.a.J((int)23, (String)"Length < 0: ", (int)n4));
            }
            throw new IndexOutOfBoundsException(e.e.a.a.a.J((int)30, (String)"Target offset < 0: ", (int)n3));
        }
        throw new IndexOutOfBoundsException(e.e.a.a.a.J((int)30, (String)"Source offset < 0: ", (int)n2));
    }

    public abstract void r(byte[] var1, int var2, int var3, int var4);

    public abstract int size();

    public String toString() {
        Object[] arrobject = new Object[]{Integer.toHexString((int)System.identityHashCode((Object)this)), this.size()};
        return String.format((String)"<ByteString@%s size=%d>", (Object[])arrobject);
    }

    public static interface a
    extends Iterator<Byte> {
        public byte h();
    }

    public static final class b
    extends OutputStream {
        public static final byte[] k = new byte[0];
        public final int l;
        public final ArrayList<c> m;
        public int n;
        public byte[] o;
        public int p;

        public b(int n2) {
            if (n2 >= 0) {
                this.l = n2;
                this.m = new ArrayList();
                this.o = new byte[n2];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public final void a(int n2) {
            int n3;
            this.m.add((Object)new o(this.o));
            this.n = n3 = this.n + this.o.length;
            this.o = new byte[Math.max((int)this.l, (int)Math.max((int)n2, (int)(n3 >>> 1)))];
            this.p = 0;
        }

        public final void b() {
            int n2 = this.p;
            byte[] arrby = this.o;
            if (n2 < arrby.length) {
                if (n2 > 0) {
                    byte[] arrby2 = new byte[n2];
                    System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)0, (int)Math.min((int)arrby.length, (int)n2));
                    this.m.add((Object)new o(arrby2));
                }
            } else {
                this.m.add((Object)new o(this.o));
                this.o = k;
            }
            this.n += this.p;
            this.p = 0;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public c k() {
            b b2 = this;
            synchronized (b2) {
                this.b();
                ArrayList arrayList = this.m;
                if (!(arrayList instanceof Collection)) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        arrayList2.add((Object)((c)iterator.next()));
                    }
                    arrayList = arrayList2;
                }
                if (!arrayList.isEmpty()) return c.h((Iterator<c>)arrayList.iterator(), arrayList.size());
                return c.k;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public String toString() {
            int n2;
            Object[] arrobject = new Object[2];
            arrobject[0] = Integer.toHexString((int)System.identityHashCode((Object)((Object)this)));
            b b2 = this;
            synchronized (b2) {
                int n3 = this.n;
                int n4 = this.p;
                n2 = n3 + n4;
            }
            arrobject[1] = n2;
            return String.format((String)"<ByteString.Output@%s size=%d>", (Object[])arrobject);
        }

        public void write(int n2) {
            b b2 = this;
            synchronized (b2) {
                if (this.p == this.o.length) {
                    this.a(1);
                }
                byte[] arrby = this.o;
                int n3 = this.p;
                this.p = n3 + 1;
                arrby[n3] = (byte)n2;
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void write(byte[] arrby, int n2, int n3) {
            b b2 = this;
            synchronized (b2) {
                byte[] arrby2 = this.o;
                int n4 = arrby2.length;
                int n5 = this.p;
                if (n3 <= n4 - n5) {
                    System.arraycopy((Object)arrby, (int)n2, (Object)arrby2, (int)n5, (int)n3);
                    this.p = n3 + this.p;
                } else {
                    int n6 = arrby2.length - n5;
                    System.arraycopy((Object)arrby, (int)n2, (Object)arrby2, (int)n5, (int)n6);
                    int n7 = n2 + n6;
                    int n8 = n3 - n6;
                    this.a(n8);
                    System.arraycopy((Object)arrby, (int)n7, (Object)this.o, (int)0, (int)n8);
                    this.p = n8;
                }
                return;
            }
        }
    }

}

