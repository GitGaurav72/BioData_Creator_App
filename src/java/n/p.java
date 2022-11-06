/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.RandomAccess
 *  k.s.a
 *  k.s.b
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  n.h
 *  n.p$a
 */
package n;

import java.util.RandomAccess;
import k.s.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.h;
import n.p;

/*
 * Exception performing whole class analysis.
 */
public final class p
extends b<h>
implements RandomAccess {
    public static final a k;
    public final h[] l;
    public final int[] m;

    public static {
        k = new /* Unavailable Anonymous Inner Class!! */;
    }

    public p(h[] arrh, int[] arrn, DefaultConstructorMarker defaultConstructorMarker) {
        this.l = arrh;
        this.m = arrn;
    }

    public Object get(int n2) {
        return this.l[n2];
    }

    public int h() {
        return this.l.length;
    }
}

