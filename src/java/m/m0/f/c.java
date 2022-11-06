/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package m.m0.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.x.c.i;
import m.m0.f.a;
import m.m0.f.d;

public final class c {
    public boolean a;
    public a b;
    public final List<a> c;
    public boolean d;
    public final d e;
    public final String f;

    public c(d d2, String string) {
        i.e(d2, "taskRunner");
        i.e(string, "name");
        this.e = d2;
        this.f = string;
        this.c = new ArrayList();
    }

    public final void a() {
        d d2;
        d d3 = d2 = this.e;
        synchronized (d3) {
            if (this.b()) {
                this.e.e(this);
            }
            return;
        }
    }

    public final boolean b() {
        a a2 = this.b;
        if (a2 != null) {
            i.c(a2);
            if (a2.d) {
                this.d = true;
            }
        }
        boolean bl = false;
        for (int i2 = this.c.size() - 1; i2 >= 0; --i2) {
            if (!((a)this.c.get((int)i2)).d) continue;
            a a3 = (a)this.c.get(i2);
            if (d.b.isLoggable(Level.FINE)) {
                e.s.a.a.m((a)a3, (c)this, (String)"canceled");
            }
            this.c.remove(i2);
            bl = true;
        }
        return bl;
    }

    public final void c(a a2, long l2) {
        d d2;
        i.e(a2, "task");
        d d3 = d2 = this.e;
        synchronized (d3) {
            if (this.a) {
                if (a2.d) {
                    if (d.b.isLoggable(Level.FINE)) {
                        e.s.a.a.m((a)a2, (c)this, (String)"schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (d.b.isLoggable(Level.FINE)) {
                    e.s.a.a.m((a)a2, (c)this, (String)"schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (this.d(a2, l2, false)) {
                this.e.e(this);
            }
            return;
        }
    }

    public final boolean d(a a2, long l2, boolean bl) {
        block12 : {
            int n2;
            block10 : {
                block11 : {
                    i.e(a2, "task");
                    i.e(this, "queue");
                    c c2 = a2.a;
                    if (c2 == this) break block11;
                    boolean bl2 = c2 == null;
                    if (!bl2) break block12;
                    a2.a = this;
                }
                long l3 = this.e.j.c();
                long l4 = l3 + l2;
                int n3 = this.c.indexOf((Object)a2);
                if (n3 != -1) {
                    if (a2.b <= l4) {
                        if (d.b.isLoggable(Level.FINE)) {
                            e.s.a.a.m((a)a2, (c)this, (String)"already scheduled");
                        }
                        return false;
                    }
                    this.c.remove(n3);
                }
                a2.b = l4;
                if (d.b.isLoggable(Level.FINE)) {
                    String string;
                    StringBuilder stringBuilder;
                    if (bl) {
                        stringBuilder = new StringBuilder();
                        string = "run again after ";
                    } else {
                        stringBuilder = new StringBuilder();
                        string = "scheduled after ";
                    }
                    stringBuilder.append(string);
                    stringBuilder.append(e.s.a.a.b1((long)(l4 - l3)));
                    e.s.a.a.m((a)a2, (c)this, (String)stringBuilder.toString());
                }
                Iterator iterator = this.c.iterator();
                n2 = 0;
                while (iterator.hasNext()) {
                    boolean bl3 = ((a)iterator.next()).b - l3 > l2;
                    if (!bl3) {
                        ++n2;
                        continue;
                    }
                    break block10;
                }
                n2 = -1;
            }
            if (n2 == -1) {
                n2 = this.c.size();
            }
            this.c.add(n2, (Object)a2);
            return n2 == 0;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    public final void e() {
        d d2;
        d d3 = d2 = this.e;
        synchronized (d3) {
            this.a = true;
            if (this.b()) {
                this.e.e(this);
            }
            return;
        }
    }

    public String toString() {
        return this.f;
    }
}

