/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Deque
 *  java.util.Locale
 */
package d.a.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import d.a.a.c;
import d.a.a.e.a;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Deque;
import java.util.Locale;

public final class b
implements Application.ActivityLifecycleCallbacks {
    public int k = 0;
    public final DateFormat l = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass() != c.b.s) {
            c.d = new WeakReference((Object)activity);
        }
        if (c.b.p) {
            Deque<String> deque = c.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.l.format(new Date()));
            stringBuilder.append(": ");
            stringBuilder.append(activity.getClass().getSimpleName());
            stringBuilder.append(" created\n");
            deque.add((Object)stringBuilder.toString());
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (c.b.p) {
            Deque<String> deque = c.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.l.format(new Date()));
            stringBuilder.append(": ");
            stringBuilder.append(activity.getClass().getSimpleName());
            stringBuilder.append(" destroyed\n");
            deque.add((Object)stringBuilder.toString());
        }
    }

    public void onActivityPaused(Activity activity) {
        if (c.b.p) {
            Deque<String> deque = c.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.l.format(new Date()));
            stringBuilder.append(": ");
            stringBuilder.append(activity.getClass().getSimpleName());
            stringBuilder.append(" paused\n");
            deque.add((Object)stringBuilder.toString());
        }
    }

    public void onActivityResumed(Activity activity) {
        if (c.b.p) {
            Deque<String> deque = c.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.l.format(new Date()));
            stringBuilder.append(": ");
            stringBuilder.append(activity.getClass().getSimpleName());
            stringBuilder.append(" resumed\n");
            deque.add((Object)stringBuilder.toString());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        int n2;
        int n3 = this.k;
        int n4 = 1;
        this.k = n2 = n3 + n4;
        if (n2 != 0) {
            n4 = 0;
        }
        c.e = n4;
    }

    public void onActivityStopped(Activity activity) {
        int n2;
        int n3 = this.k;
        int n4 = 1;
        this.k = n2 = n3 - n4;
        if (n2 != 0) {
            n4 = 0;
        }
        c.e = n4;
    }
}

