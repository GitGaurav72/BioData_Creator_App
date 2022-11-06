/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
package k.b0.x.b.x0.h;

import java.nio.ByteBuffer;

public class i {
    public static final byte[] a;

    public static {
        byte[] arrby = new byte[]{};
        a = arrby;
        ByteBuffer.wrap((byte[])arrby);
    }

    public static interface a {
        public int f();
    }

    public static interface b<T extends a> {
        public T a(int var1);
    }

}

