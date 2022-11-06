/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.io.Closeable
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.f.y.a
 *  k.b0.x.b.x0.h.b
 *  k.b0.x.b.x0.h.p
 *  k.b0.x.b.x0.k.b.e0.a
 *  k.b0.x.b.x0.k.b.f0.g
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment
 */
package k.b0.x.b.x0.k.b.e0;

import java.io.Closeable;
import java.io.InputStream;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.f.m;
import k.b0.x.b.x0.f.y.a;
import k.b0.x.b.x0.h.b;
import k.b0.x.b.x0.h.f;
import k.b0.x.b.x0.h.r;
import k.b0.x.b.x0.k.b.e0.a;
import k.b0.x.b.x0.k.b.f0.g;
import k.b0.x.b.x0.k.b.p;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;

public final class c
extends p
implements BuiltInsPackageFragment {
    public c(k.b0.x.b.x0.g.c c2, k.b0.x.b.x0.l.m m2, d0 d02, m m3, k.b0.x.b.x0.f.y.a a2, boolean bl, DefaultConstructorMarker defaultConstructorMarker) {
        super(c2, m2, d02, m3, (k.b0.x.b.x0.f.z.a)a2, null);
    }

    public static final c q(k.b0.x.b.x0.g.c c2, k.b0.x.b.x0.l.m m2, d0 d02, InputStream inputStream, boolean bl) {
        k.b0.x.b.x0.f.y.a a2;
        k.b0.x.b.x0.f.y.a a3;
        block5 : {
            m m3;
            i.e(c2, "fqName");
            i.e(m2, "storageManager");
            i.e((Object)d02, "module");
            i.e((Object)inputStream, "inputStream");
            try {
                a2 = k.b0.x.b.x0.f.y.a.f.a(inputStream);
                a3 = k.b0.x.b.x0.f.y.a.g;
                if (!a2.b((k.b0.x.b.x0.f.z.a)a3)) break block5;
                f f2 = a.m.a;
                b b2 = (b)m.m;
                k.b0.x.b.x0.h.p p2 = b2.d(inputStream, f2);
                b2.b(p2);
                m3 = (m)p2;
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    e.s.a.a.R((Closeable)inputStream, (Throwable)throwable);
                    throw throwable2;
                }
            }
            e.s.a.a.R((Closeable)inputStream, null);
            i.d((Object)m3, "proto");
            c c3 = new c(c2, m2, d02, m3, a2, bl, null);
            return c3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Kotlin built-in definition format version is not supported: expected ");
        stringBuilder.append((Object)a3);
        stringBuilder.append(", actual ");
        stringBuilder.append((Object)a2);
        stringBuilder.append(". Please update Kotlin");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"builtins package fragment for ");
        stringBuilder.append((Object)this.getFqName());
        stringBuilder.append(" from ");
        stringBuilder.append((Object)k.b0.x.b.x0.j.y.a.j((k)this));
        return stringBuilder.toString();
    }
}

