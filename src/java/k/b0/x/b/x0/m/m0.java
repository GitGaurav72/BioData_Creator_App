/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.c
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.r1.j
 *  k.b0.x.b.x0.m.y0
 *  k.s.i
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.m;

import java.util.List;
import k.b0.x.b.x0.c.i1.c;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.r1.j;
import k.b0.x.b.x0.m.r1.k;
import k.b0.x.b.x0.m.y0;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class m0
extends m1
implements j,
k {
    public m0() {
        super(null);
    }

    public abstract m0 a0(boolean var1);

    public abstract m0 b0(h var1);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (c c2 : this.getAnnotations()) {
            String[] arrstring = new String[3];
            arrstring[0] = "[";
            arrstring[1] = k.b0.x.b.x0.i.c.r(k.b0.x.b.x0.i.c.b, c2, null, 2, null);
            arrstring[2] = "] ";
            i.e((Object)stringBuilder, "<this>");
            i.e(arrstring, "value");
            for (int i2 = 0; i2 < 3; ++i2) {
                String string = arrstring[i2];
                stringBuilder.append(string);
            }
        }
        stringBuilder.append((Object)this.T());
        if (true ^ this.S().isEmpty()) {
            k.s.i.y((Iterable)this.S(), (Appendable)stringBuilder, (CharSequence)", ", (CharSequence)"<", (CharSequence)">", (int)0, null, null, (int)112);
        }
        if (this.U()) {
            stringBuilder.append("?");
        }
        String string = stringBuilder.toString();
        i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

