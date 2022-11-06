/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.r1.j
 *  k.b0.x.b.x0.m.y0
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.m;

import e.e.a.a.a;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.e;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.r1.j;
import k.b0.x.b.x0.m.y0;
import k.x.c.i;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class t0
extends e
implements j {
    public final y0 o;
    public final h p;

    public t0(y0 y02, boolean bl, y0 y03) {
        i.e((Object)y02, "originalTypeVariable");
        i.e((Object)y03, "constructor");
        super(y02, bl);
        this.o = y03;
        this.p = y02.getBuiltIns().getAnyType().getMemberScope();
    }

    public y0 T() {
        return this.o;
    }

    @Override
    public e c0(boolean bl) {
        return new t0(this.l, bl, this.o);
    }

    @Override
    public h getMemberScope() {
        return this.p;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = a.t((String)"Stub (BI): ");
        stringBuilder.append((Object)this.l);
        String string = this.m ? "?" : "";
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

