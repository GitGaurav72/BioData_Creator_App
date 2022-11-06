/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 */
package k.x.c;

import e.e.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class z {
    public final ArrayList<Object> a;

    public z(int n2) {
        this.a = new ArrayList(n2);
    }

    public void a(Object object) {
        block9 : {
            block7 : {
                block8 : {
                    block6 : {
                        if (object == null) {
                            return;
                        }
                        if (!(object instanceof Object[])) break block6;
                        Object[] arrobject = (Object[])object;
                        if (arrobject.length > 0) {
                            ArrayList<Object> arrayList = this.a;
                            arrayList.ensureCapacity(arrayList.size() + arrobject.length);
                            Collections.addAll(this.a, (Object[])arrobject);
                            return;
                        }
                        break block7;
                    }
                    if (object instanceof Collection) {
                        this.a.addAll((Collection)object);
                        return;
                    }
                    if (!(object instanceof Iterable)) break block8;
                    for (Object object2 : (Iterable)object) {
                        this.a.add(object2);
                    }
                    break block7;
                }
                if (object instanceof Iterator) {
                    Iterator iterator = (Iterator)object;
                    while (iterator.hasNext()) {
                        this.a.add(iterator.next());
                    }
                }
                break block9;
            }
            return;
        }
        StringBuilder stringBuilder = a.t((String)"Don't know how to spread ");
        stringBuilder.append((Object)object.getClass());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public int b() {
        return this.a.size();
    }
}

