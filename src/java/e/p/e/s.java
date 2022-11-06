/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.e.f0.s
 *  e.p.e.f0.s$e
 *  e.p.e.p
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package e.p.e;

import e.p.e.f0.s;
import e.p.e.p;
import java.util.Map;
import java.util.Set;

public final class s
extends p {
    public final e.p.e.f0.s<String, p> a = new e.p.e.f0.s();

    public p F(String string) {
        s.e e2 = this.a.j((Object)string);
        Object object = e2 != null ? e2.q : null;
        return (p)object;
    }

    public boolean G(String string) {
        return this.a.j((Object)string) != null;
    }

    public Set<Map.Entry<String, p>> entrySet() {
        return this.a.entrySet();
    }

    public boolean equals(Object object) {
        return object == this || object instanceof s && ((s)object).a.equals(this.a);
        {
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

