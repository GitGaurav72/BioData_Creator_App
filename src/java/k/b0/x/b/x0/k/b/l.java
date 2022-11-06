/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.f.s
 *  k.b0.x.b.x0.k.b.f0.g
 */
package k.b0.x.b.x0.k.b;

import e.e.a.a.a;
import java.util.List;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.f.s;
import k.b0.x.b.x0.f.z.c;
import k.b0.x.b.x0.f.z.f;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.k.b.c0;
import k.b0.x.b.x0.k.b.f0.g;
import k.b0.x.b.x0.k.b.j;
import k.b0.x.b.x0.k.b.v;
import k.x.c.i;

public final class l {
    public final j a;
    public final c b;
    public final k c;
    public final k.b0.x.b.x0.f.z.e d;
    public final f e;
    public final k.b0.x.b.x0.f.z.a f;
    public final g g;
    public final c0 h;
    public final v i;

    public l(j j2, c c2, k k2, k.b0.x.b.x0.f.z.e e2, f f2, k.b0.x.b.x0.f.z.a a2, g g2, c0 c02, List<s> list) {
        c0 c03;
        i.e(j2, "components");
        i.e(c2, "nameResolver");
        i.e((Object)k2, "containingDeclaration");
        i.e(e2, "typeTable");
        i.e(f2, "versionRequirementTable");
        i.e(a2, "metadataVersion");
        i.e(list, "typeParameters");
        this.a = j2;
        this.b = c2;
        this.c = k2;
        this.d = e2;
        this.e = f2;
        this.f = a2;
        this.g = g2;
        StringBuilder stringBuilder = a.t((String)"Deserializer for \"");
        stringBuilder.append((Object)k2.getName());
        stringBuilder.append('\"');
        String string = stringBuilder.toString();
        String string2 = g2 == null ? "[container not found]" : g2.c();
        this.h = c03 = new c0(this, c02, list, string, string2);
        this.i = new v(this);
    }

    public static /* synthetic */ l b(l l2, k k2, List list, c c2, k.b0.x.b.x0.f.z.e e2, f f2, k.b0.x.b.x0.f.z.a a2, int n2) {
        c c3 = (n2 & 4) != 0 ? l2.b : null;
        k.b0.x.b.x0.f.z.e e3 = (n2 & 8) != 0 ? l2.d : null;
        f f3 = (n2 & 16) != 0 ? l2.e : null;
        int n3 = n2 & 32;
        k.b0.x.b.x0.f.z.a a3 = null;
        if (n3 != 0) {
            a3 = l2.f;
        }
        return l2.a(k2, (List<s>)list, c3, e3, f3, a3);
    }

    public final l a(k k2, List<s> list, c c2, k.b0.x.b.x0.f.z.e e2, f f2, k.b0.x.b.x0.f.z.a a2) {
        i.e((Object)k2, "descriptor");
        i.e(list, "typeParameterProtos");
        i.e(c2, "nameResolver");
        i.e(e2, "typeTable");
        i.e(f2, "versionRequirementTable");
        i.e(a2, "metadataVersion");
        j j2 = this.a;
        i.e(a2, "version");
        i.e(a2, "version");
        int n2 = a2.b;
        int n3 = 1;
        if (n2 != n3 || a2.c < 4) {
            n3 = 0;
        }
        f f3 = n3 != 0 ? f2 : this.e;
        g g2 = this.g;
        c0 c02 = this.h;
        l l2 = new l(j2, c2, k2, e2, f3, a2, g2, c02, list);
        return l2;
    }
}

