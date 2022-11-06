/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.e.a.o0.n.f
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.m.b1
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.l0
 *  k.b0.x.b.x0.m.m1
 *  k.b0.x.b.x0.m.p1.d
 *  k.b0.x.b.x0.m.y0
 *  k.d0.g
 *  k.s.i
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
 */
package k.b0.x.b.x0.e.a.o0.n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.e.a.o0.n.f;
import k.b0.x.b.x0.e.a.o0.n.g;
import k.b0.x.b.x0.e.a.o0.n.h;
import k.b0.x.b.x0.i.c;
import k.b0.x.b.x0.m.b1;
import k.b0.x.b.x0.m.e1;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.l0;
import k.b0.x.b.x0.m.m0;
import k.b0.x.b.x0.m.m1;
import k.b0.x.b.x0.m.p1.b;
import k.b0.x.b.x0.m.p1.d;
import k.b0.x.b.x0.m.y0;
import k.b0.x.b.x0.m.z;
import k.i;
import k.x.b.l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class g
extends z
implements l0 {
    public g(m0 m02, m0 m03) {
        k.x.c.i.e(m02, "lowerBound");
        k.x.c.i.e(m03, "upperBound");
        super(m02, m03);
        b.a.d((f0)m02, (f0)m03);
    }

    public g(m0 m02, m0 m03, boolean bl) {
        super(m02, m03);
        if (!bl) {
            b.a.d((f0)m02, (f0)m03);
        }
    }

    public static final List<String> d0(c c2, f0 f02) {
        List list = f02.S();
        ArrayList arrayList = new ArrayList(e.s.a.a.U((Iterable)list, (int)10));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)c2.w((b1)iterator.next()));
        }
        return arrayList;
    }

    public static final String e0(String string, String string2) {
        if (!k.d0.g.b((CharSequence)string, (char)'<', (boolean)false, (int)2)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(k.d0.g.L((String)string, (char)'<', null, (int)2));
        stringBuilder.append('<');
        stringBuilder.append(string2);
        stringBuilder.append('>');
        stringBuilder.append(k.d0.g.K((String)string, (char)'>', null, (int)2));
        return stringBuilder.toString();
    }

    public m1 X(boolean bl) {
        return new g(this.l.a0(bl), this.m.a0(bl));
    }

    public m1 Z(k.b0.x.b.x0.c.i1.h h2) {
        k.x.c.i.e((Object)h2, "newAnnotations");
        return new g(this.l.b0(h2), this.m.b0(h2));
    }

    @Override
    public m0 a0() {
        return this.l;
    }

    @Override
    public String b0(c c2, k.b0.x.b.x0.i.i i2) {
        boolean bl;
        String string;
        k.x.c.i.e(c2, "renderer");
        k.x.c.i.e(i2, "options");
        String string2 = c2.v((f0)this.l);
        String string3 = c2.v((f0)this.m);
        if (i2.n()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("raw (");
            stringBuilder.append(string2);
            stringBuilder.append("..");
            stringBuilder.append(string3);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
        if (this.m.S().isEmpty()) {
            return c2.s(string2, string3, e.s.a.a.k1((f0)this));
        }
        List<String> list = g.d0(c2, (f0)this.l);
        List<String> list2 = g.d0(c2, (f0)this.m);
        String string4 = k.s.i.A(list, (CharSequence)", ", null, null, (int)0, null, (l)a.k, (int)30);
        ArrayList arrayList = (ArrayList)k.s.i.l0(list, list2);
        if (!arrayList.isEmpty()) {
            for (i i3 : arrayList) {
                String string5 = (String)i3.k;
                String string6 = (String)i3.l;
                boolean bl2 = k.x.c.i.a(string5, k.d0.g.t((String)string6, (CharSequence)"out ")) || k.x.c.i.a(string6, "*");
                if (bl2) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        if (bl) {
            string3 = g.e0(string3, string4);
        }
        if (k.x.c.i.a(string = g.e0(string2, string4), string3)) {
            return string;
        }
        return c2.s(string, string3, e.s.a.a.k1((f0)this));
    }

    public z c0(d d2) {
        k.x.c.i.e((Object)d2, "kotlinTypeRefiner");
        return new g((m0)d2.h((k.b0.x.b.x0.m.r1.i)((Object)this.l)), (m0)d2.h((k.b0.x.b.x0.m.r1.i)((Object)this.m)), true);
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getMemberScope() {
        k.b0.x.b.x0.c.h h2 = this.T().getDeclarationDescriptor();
        e e2 = h2 instanceof e ? (e)h2 : null;
        if (e2 != null) {
            k.b0.x.b.x0.j.a0.h h3 = e2.getMemberScope((e1)new f(null));
            k.x.c.i.d((Object)h3, "classDescriptor.getMemberScope(RawSubstitution())");
            return h3;
        }
        throw new IllegalStateException(k.x.c.i.k("Incorrect classifier: ", this.T().getDeclarationDescriptor()).toString());
    }
}

