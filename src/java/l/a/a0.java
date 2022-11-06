/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  k.c0.t
 *  kotlinx.coroutines.CoroutineExceptionHandler
 */
package l.a;

import java.util.Iterator;
import java.util.List;
import k.c0.h;
import k.c0.t;
import k.u.f;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class a0 {
    public static final List<CoroutineExceptionHandler> a = t.j((h)e.s.a.a.v((Iterator)a.a()));

    public static final void a(f f2, Throwable throwable) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : a) {
            try {
                coroutineExceptionHandler.handleException(f2, throwable);
            }
            catch (Throwable throwable2) {
                Throwable throwable3;
                Thread thread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
                if (throwable == throwable2) {
                    throwable3 = throwable;
                } else {
                    throwable3 = new RuntimeException("Exception while trying to handle coroutine exception", throwable2);
                    e.s.a.a.o((Throwable)throwable3, (Throwable)throwable);
                }
                uncaughtExceptionHandler.uncaughtException(thread, throwable3);
            }
        }
        Thread thread = Thread.currentThread();
        thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
    }
}

