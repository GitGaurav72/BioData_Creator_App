/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  k.c0.t
 *  kotlinx.coroutines.internal.MainDispatcherFactory
 *  l.a.j1
 */
package l.a.b2;

import java.util.Iterator;
import java.util.List;
import k.c0.h;
import k.c0.t;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import l.a.j1;

public final class l {
    public static final l a;
    public static final boolean b;
    public static final j1 c;

    public static {
        l l2;
        a = l2 = new l();
        String string = e.s.a.a.a4((String)"kotlinx.coroutines.fast.service.loader");
        boolean bl = string == null ? true : Boolean.parseBoolean((String)string);
        b = bl;
        c = l2.a();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final j1 a() {
        Object object;
        MainDispatcherFactory mainDispatcherFactory;
        List list = t.j((h)e.s.a.a.v((Iterator)a.b()));
        Iterator iterator = list.iterator();
        if (!iterator.hasNext()) {
            object = null;
        } else {
            Object object2 = iterator.next();
            if (iterator.hasNext()) {
                int n2 = ((MainDispatcherFactory)object2).getLoadPriority();
                do {
                    int n3;
                    Object object3;
                    if (n2 >= (n3 = ((MainDispatcherFactory)(object3 = iterator.next())).getLoadPriority())) continue;
                    object2 = object3;
                    n2 = n3;
                } while (iterator.hasNext());
            }
            object = object2;
        }
        if ((mainDispatcherFactory = (MainDispatcherFactory)object) == null) throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            return mainDispatcherFactory.createDispatcher(list);
        }
        catch (Throwable throwable) {
            mainDispatcherFactory.hintOnError();
            throw throwable;
        }
    }
}

