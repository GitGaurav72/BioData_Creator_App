/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.util.ArrayDeque
 *  java.util.Set
 *  k.b0.x.b.x0.m.r1.j
 *  k.b0.x.b.x0.m.r1.o
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package k.b0.x.b.x0.m;

import java.util.ArrayDeque;
import java.util.Set;
import k.b0.x.b.x0.m.l;
import k.b0.x.b.x0.m.m;
import k.b0.x.b.x0.m.r1.i;
import k.b0.x.b.x0.m.r1.j;
import k.b0.x.b.x0.m.r1.o;
import k.b0.x.b.x0.o.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class x0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final o d;
    public final l e;
    public final m f;
    public int g;
    public boolean h;
    public ArrayDeque<j> i;
    public Set<j> j;

    public x0(boolean bl, boolean bl2, boolean bl3, o o2, l l2, m m2) {
        k.x.c.i.e((Object)o2, "typeSystemContext");
        k.x.c.i.e(l2, "kotlinTypePreparator");
        k.x.c.i.e(m2, "kotlinTypeRefiner");
        this.a = bl;
        this.b = bl2;
        this.c = bl3;
        this.d = o2;
        this.e = l2;
        this.f = m2;
    }

    public Boolean a(i i2, i i3) {
        k.x.c.i.e(i2, "subType");
        k.x.c.i.e(i3, "superType");
        return null;
    }

    public final void b() {
        ArrayDeque<j> arrayDeque = this.i;
        k.x.c.i.c(arrayDeque);
        arrayDeque.clear();
        Set<j> set = this.j;
        k.x.c.i.c(set);
        set.clear();
        this.h = false;
    }

    public final void c() {
        this.h = true;
        if (this.i == null) {
            this.i = new ArrayDeque(4);
        }
        if (this.j == null) {
            this.j = i.b.a();
        }
    }

    public final i d(i i2) {
        k.x.c.i.e(i2, "type");
        return this.e.a(i2);
    }

    public final i e(i i2) {
        k.x.c.i.e(i2, "type");
        return this.f.a(i2);
    }

    public static abstract class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public abstract j a(x0 var1, i var2);
    }

}

