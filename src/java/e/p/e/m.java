/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.p.e.p
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package e.p.e;

import e.p.e.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class m
extends p
implements Iterable<p> {
    public final List<p> k = new ArrayList();

    public boolean equals(Object object) {
        return object == this || object instanceof m && ((m)object).k.equals(this.k);
        {
        }
    }

    public int hashCode() {
        return this.k.hashCode();
    }

    public Iterator<p> iterator() {
        return this.k.iterator();
    }

    public long n() {
        if (this.k.size() == 1) {
            return ((p)this.k.get(0)).n();
        }
        throw new IllegalStateException();
    }

    public String r() {
        if (this.k.size() == 1) {
            return ((p)this.k.get(0)).r();
        }
        throw new IllegalStateException();
    }
}

