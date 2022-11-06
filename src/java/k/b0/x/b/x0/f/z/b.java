/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  k.b0.x.b.x0.f.c
 *  k.b0.x.b.x0.f.c$c
 *  k.b0.x.b.x0.f.j
 *  k.b0.x.b.x0.f.k
 *  k.b0.x.b.x0.f.x
 *  k.b0.x.b.x0.f.z.b$b
 *  k.b0.x.b.x0.f.z.b$c
 */
package k.b0.x.b.x0.f.z;

import k.b0.x.b.x0.f.c;
import k.b0.x.b.x0.f.j;
import k.b0.x.b.x0.f.k;
import k.b0.x.b.x0.f.x;
import k.b0.x.b.x0.f.z.b;
import k.b0.x.b.x0.h.i;

public class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    public static final b K;
    public static final b L;
    public static final b M;
    public static final b N;
    public static final b a;
    public static final b b;
    public static final b c;
    public static final d<x> d;
    public static final d<k> e;
    public static final d<c.c> f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final d<j> o;
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;

    public static {
        b b2;
        b b3;
        b b4;
        b b5;
        b b6;
        b b7;
        b b8;
        b b9;
        b b10;
        b b11;
        b b12;
        b b13;
        d d2;
        b b14;
        d d3;
        b b15;
        b b16;
        b b17;
        b b18;
        d d4;
        b b19;
        b b20;
        b b21;
        b b22;
        b b23;
        d d5;
        b b24;
        b b25;
        b b26;
        b b27;
        b b28;
        b b29;
        a = b5 = d.c();
        b = d.b(b5);
        c = b18 = d.c();
        d = d5 = d.a((d)b18, (i.a[])x.values());
        e = d2 = d.a((d)d5, (i.a[])k.values());
        f = d4 = d.a((d)d2, (i.a[])c.c.values());
        g = b22 = d.b(d4);
        h = b2 = d.b(b22);
        i = b29 = d.b(b2);
        j = b19 = d.b(b29);
        k = b3 = d.b(b19);
        l = d.b(b3);
        m = b24 = d.b(d5);
        n = d.b(b24);
        o = d3 = d.a((d)d2, (i.a[])j.values());
        p = b26 = d.b(d3);
        q = b12 = d.b(b26);
        r = b21 = d.b(b12);
        s = b4 = d.b(b21);
        t = b16 = d.b(b4);
        u = b28 = d.b(b16);
        v = b11 = d.b(b28);
        w = d.b(b11);
        x = b20 = d.b(d3);
        y = b23 = d.b(b20);
        z = b13 = d.b(b23);
        A = b15 = d.b(b13);
        B = b7 = d.b(b15);
        C = b9 = d.b(b7);
        D = b25 = d.b(b9);
        E = b14 = d.b(b25);
        F = d.b(b14);
        G = b17 = d.b(b18);
        H = b10 = d.b(b17);
        I = d.b(b10);
        J = b6 = d.b(d2);
        K = b27 = d.b(b6);
        L = d.b(b27);
        M = b8 = d.c();
        d.b(b8);
        N = d.c();
    }

    public static /* synthetic */ void a(int n2) {
        Object[] arrobject;
        block9 : {
            block6 : {
                block7 : {
                    block8 : {
                        arrobject = new Object[3];
                        if (n2 == 1) break block6;
                        if (n2 == 2) break block7;
                        if (n2 == 5) break block6;
                        if (n2 == 6) break block8;
                        if (n2 == 8) break block6;
                        if (n2 == 9) break block8;
                        if (n2 == 11) break block6;
                        arrobject[0] = "visibility";
                        break block9;
                    }
                    arrobject[0] = "memberKind";
                    break block9;
                }
                arrobject[0] = "kind";
                break block9;
            }
            arrobject[0] = "modality";
        }
        arrobject[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (n2) {
            default: {
                arrobject[2] = "getClassFlags";
                break;
            }
            case 10: 
            case 11: {
                arrobject[2] = "getAccessorFlags";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                arrobject[2] = "getPropertyFlags";
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                arrobject[2] = "getFunctionFlags";
                break;
            }
            case 3: {
                arrobject[2] = "getConstructorFlags";
            }
        }
        throw new IllegalArgumentException(String.format((String)"Argument for @NotNull parameter '%s' of %s.%s must not be null", (Object[])arrobject));
    }

    /*
     * Exception performing whole class analysis.
     */
    public static abstract class d<E> {
        public final int a;
        public final int b;

        public d(int n2, int n3, a a2) {
            this.a = n2;
            this.b = n3;
        }

        public static <E extends i.a> d<E> a(d<?> d2, E[] arrE) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public static b b(d<?> d2) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public static b c() {
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public abstract E d(int var1);

        public abstract int e(E var1);
    }

}

