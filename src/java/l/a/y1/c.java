/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.view.Choreographer
 *  androidx.annotation.VisibleForTesting
 *  e.s.a.a
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.util.Objects
 *  l.a.y1.a
 *  l.a.y1.b
 */
package l.a.y1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Objects;
import k.j;
import l.a.y1.a;
import l.a.y1.b;

public final class c {
    private static volatile Choreographer choreographer;

    public static {
        Object object;
        try {
            object = new a(c.a(Looper.getMainLooper(), true), null, false);
        }
        catch (Throwable throwable) {
            object = e.s.a.a.A0((Throwable)throwable);
        }
        Object object2 = object instanceof j.a ? null : object;
        (b)object2;
    }

    @VisibleForTesting
    public static final Handler a(Looper looper, boolean bl) {
        if (bl) {
            Constructor constructor;
            if (Build.VERSION.SDK_INT >= 28) {
                Object object = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{looper});
                Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type android.os.Handler");
                return (Handler)object;
            }
            try {
                Class[] arrclass = new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE};
                constructor = Handler.class.getDeclaredConstructor(arrclass);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return new Handler(looper);
            }
            Object[] arrobject = new Object[]{looper, null, Boolean.TRUE};
            return (Handler)constructor.newInstance(arrobject);
        }
        return new Handler(looper);
    }
}

