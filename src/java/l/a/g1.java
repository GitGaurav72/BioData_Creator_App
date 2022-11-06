/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  l.a.m0
 */
package l.a;

import l.a.b2.q;
import l.a.m0;
import l.a.v0;
import l.a.w0;

public final class g1 {
    public static final q a = new q("COMPLETING_ALREADY");
    public static final q b = new q("COMPLETING_WAITING_CHILDREN");
    public static final q c = new q("COMPLETING_RETRY");
    public static final q d = new q("TOO_LATE_TO_CANCEL");
    public static final q e = new q("SEALED");
    public static final m0 f = new m0(false);
    public static final m0 g = new m0(true);

    public static final Object a(Object object) {
        w0 w02 = object instanceof w0 ? (w0)object : null;
        if (w02 == null) {
            return object;
        }
        return w02.a;
    }
}

