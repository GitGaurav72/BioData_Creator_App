/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  k.b0.x.b.x0.h.p
 */
package k.b0.x.b.x0.h;

import java.io.IOException;
import k.b0.x.b.x0.h.p;

public class j
extends IOException {
    public p k = null;

    public j(String string) {
        super(string);
    }

    public static j a() {
        return new j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static j b() {
        return new j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static j d() {
        return new j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public j c(p p2) {
        this.k = p2;
        return this;
    }
}

