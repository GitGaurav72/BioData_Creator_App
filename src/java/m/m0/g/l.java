/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 */
package m.m0.g;

import java.io.IOException;
import k.x.c.i;

public final class l
extends RuntimeException {
    public IOException k;
    public final IOException l;

    public l(IOException iOException) {
        i.e((Object)iOException, "firstConnectException");
        super((Throwable)iOException);
        this.l = iOException;
        this.k = iOException;
    }
}

