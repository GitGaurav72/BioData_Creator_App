/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  k.b0.x.b.x0.h.p
 */
package k.b0.x.b.x0.h;

import java.io.IOException;
import java.io.OutputStream;
import k.b0.x.b.x0.h.c;
import k.b0.x.b.x0.h.p;

public final class e {
    public final byte[] a;
    public final int b;
    public int c;
    public int d = 0;
    public final OutputStream e;

    public e(OutputStream outputStream, byte[] arrby) {
        this.e = outputStream;
        this.a = arrby;
        this.c = 0;
        this.b = arrby.length;
    }

    public static int a(c c2) {
        return e.g(c2.size()) + c2.size();
    }

    public static int b(int n2, int n3) {
        return e.i(n2) + e.d(n3);
    }

    public static int c(int n2, int n3) {
        return e.i(n2) + e.d(n3);
    }

    public static int d(int n2) {
        if (n2 >= 0) {
            return e.g(n2);
        }
        return 10;
    }

    public static int e(int n2, p p2) {
        int n3 = e.i(n2);
        int n4 = p2.d();
        return n3 + (n4 + e.g(n4));
    }

    public static int f(p p2) {
        int n2 = p2.d();
        return n2 + e.g(n2);
    }

    public static int g(int n2) {
        if ((n2 & -128) == 0) {
            return 1;
        }
        if ((n2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & n2) == 0) {
            return 3;
        }
        if ((n2 & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int h(long l2) {
        if ((-128L & l2) == 0L) {
            return 1;
        }
        if ((-16384L & l2) == 0L) {
            return 2;
        }
        if ((-2097152L & l2) == 0L) {
            return 3;
        }
        if ((-268435456L & l2) == 0L) {
            return 4;
        }
        if ((-34359738368L & l2) == 0L) {
            return 5;
        }
        if ((-4398046511104L & l2) == 0L) {
            return 6;
        }
        if ((-562949953421312L & l2) == 0L) {
            return 7;
        }
        if ((-72057594037927936L & l2) == 0L) {
            return 8;
        }
        if ((l2 & Long.MIN_VALUE) == 0L) {
            return 9;
        }
        return 10;
    }

    public static int i(int n2) {
        return e.g(0 | n2 << 3);
    }

    public static e k(OutputStream outputStream, int n2) {
        return new e(outputStream, new byte[n2]);
    }

    public void A(int n2, int n3) {
        this.y(n3 | n2 << 3);
    }

    public void j() {
        if (this.e != null) {
            this.l();
        }
    }

    public final void l() {
        OutputStream outputStream = this.e;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new a();
    }

    public void m(c c2) {
        this.y(c2.size());
        this.u(c2);
    }

    public void n(int n2, int n3) {
        this.y(0 | n2 << 3);
        if (n3 >= 0) {
            this.y(n3);
            return;
        }
        this.z(n3);
    }

    public void o(int n2) {
        if (n2 >= 0) {
            this.y(n2);
            return;
        }
        this.z(n2);
    }

    public void p(int n2, int n3) {
        this.y(0 | n2 << 3);
        if (n3 >= 0) {
            this.y(n3);
            return;
        }
        this.z(n3);
    }

    public void q(int n2) {
        if (n2 >= 0) {
            this.y(n2);
            return;
        }
        this.z(n2);
    }

    public void r(int n2, p p2) {
        this.y(2 | n2 << 3);
        this.y(p2.d());
        p2.c(this);
    }

    public void s(p p2) {
        this.y(p2.d());
        p2.c(this);
    }

    public void t(int n2) {
        byte by = (byte)n2;
        if (this.c == this.b) {
            this.l();
        }
        byte[] arrby = this.a;
        int n3 = this.c;
        this.c = n3 + 1;
        arrby[n3] = by;
        this.d = 1 + this.d;
    }

    public void u(c c2) {
        int n2;
        block7 : {
            int n3;
            block8 : {
                int n4;
                block9 : {
                    block5 : {
                        block6 : {
                            int n5;
                            int n6;
                            block4 : {
                                int n7 = this.b;
                                n6 = this.c;
                                n5 = n7 - n6;
                                n3 = c2.size();
                                if (n5 < n3) break block4;
                                c2.n(this.a, 0, n6, n3);
                                this.c = n3 + this.c;
                                break block5;
                            }
                            c2.n(this.a, 0, n6, n5);
                            n2 = n5 + 0;
                            this.c = this.b;
                            this.d = n5 + this.d;
                            this.l();
                            if ((n3 -= n5) > this.b) break block6;
                            c2.n(this.a, n2, 0, n3);
                            this.c = n3;
                            break block5;
                        }
                        OutputStream outputStream = this.e;
                        if (n2 < 0) break block7;
                        if (n3 < 0) break block8;
                        n4 = n2 + n3;
                        if (n4 > c2.size()) break block9;
                        if (n3 > 0) {
                            c2.P(outputStream, n2, n3);
                        }
                    }
                    this.d = n3 + this.d;
                    return;
                }
                throw new IndexOutOfBoundsException(e.e.a.a.a.J((int)39, (String)"Source end offset exceeded: ", (int)n4));
            }
            throw new IndexOutOfBoundsException(e.e.a.a.a.J((int)23, (String)"Length < 0: ", (int)n3));
        }
        throw new IndexOutOfBoundsException(e.e.a.a.a.J((int)30, (String)"Source offset < 0: ", (int)n2));
    }

    public void v(byte[] arrby) {
        int n2 = this.b;
        int n3 = this.c;
        int n4 = n2 - n3;
        int n5 = arrby.length;
        if (n4 >= n5) {
            System.arraycopy((Object)arrby, (int)0, (Object)this.a, (int)n3, (int)n5);
            this.c = n5 + this.c;
        } else {
            System.arraycopy((Object)arrby, (int)0, (Object)this.a, (int)n3, (int)n4);
            int n6 = n4 + 0;
            this.c = this.b;
            this.d = n4 + this.d;
            this.l();
            if ((n5 -= n4) <= this.b) {
                System.arraycopy((Object)arrby, (int)n6, (Object)this.a, (int)0, (int)n5);
                this.c = n5;
            } else {
                this.e.write(arrby, n6, n5);
            }
        }
        this.d = n5 + this.d;
    }

    public void w(int n2) {
        this.t(n2 & 255);
        this.t(255 & n2 >> 8);
        this.t(255 & n2 >> 16);
        this.t(255 & n2 >> 24);
    }

    public void x(long l2) {
        this.t(255 & (int)l2);
        this.t(255 & (int)(l2 >> 8));
        this.t(255 & (int)(l2 >> 16));
        this.t(255 & (int)(l2 >> 24));
        this.t(255 & (int)(l2 >> 32));
        this.t(255 & (int)(l2 >> 40));
        this.t(255 & (int)(l2 >> 48));
        this.t(255 & (int)(l2 >> 56));
    }

    public void y(int n2) {
        do {
            if ((n2 & -128) == 0) {
                this.t(n2);
                return;
            }
            this.t(128 | n2 & 127);
            n2 >>>= 7;
        } while (true);
    }

    public void z(long l2) {
        do {
            if ((-128L & l2) == 0L) {
                this.t((int)l2);
                return;
            }
            this.t(128 | 127 & (int)l2);
            l2 >>>= 7;
        } while (true);
    }

    public static class a
    extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

}

