/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.util.Log
 *  cat.ereza.customactivityoncrash.activity.DefaultErrorActivity
 *  java.io.PrintWriter
 *  java.io.Serializable
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.Date
 *  java.util.Deque
 *  java.util.List
 */
package d.a.a;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import d.a.a.c;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Deque;
import java.util.List;

public final class a
implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable throwable) {
        if (c.b.l) {
            Activity activity;
            Log.e((String)"CustomActivityOnCrash", (String)"App has crashed, executing CustomActivityOnCrash's UncaughtExceptionHandler", (Throwable)throwable);
            long l2 = c.a.getSharedPreferences("custom_activity_on_crash", 0).getLong("last_crash_timestamp", -1L);
            long l3 = new Date().getTime();
            boolean bl = l2 <= l3 && l3 - l2 < (long)c.b.q;
            if (bl) {
                Log.e((String)"CustomActivityOnCrash", (String)"App already crashed recently, not starting custom error activity because we could enter a restart loop. Are you sure that your app does not crash directly on init?", (Throwable)throwable);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, throwable);
                    return;
                }
            } else {
                Class class_;
                boolean bl2;
                block33 : {
                    Application application = c.a;
                    long l4 = new Date().getTime();
                    application.getSharedPreferences("custom_activity_on_crash", 0).edit().putLong("last_crash_timestamp", l4).commit();
                    class_ = c.b.s;
                    if (class_ == null) {
                        block32 : {
                            Application application2 = c.a;
                            Intent intent = new Intent().setAction("cat.ereza.customactivityoncrash.ERROR").setPackage(application2.getPackageName());
                            List list = application2.getPackageManager().queryIntentActivities(intent, 64);
                            if (list != null && list.size() > 0) {
                                ResolveInfo resolveInfo = (ResolveInfo)list.get(0);
                                try {
                                    class_ = Class.forName((String)resolveInfo.activityInfo.name);
                                    break block32;
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    Log.e((String)"CustomActivityOnCrash", (String)"Failed when resolving the error activity class via intent filter, stack trace follows!", (Throwable)classNotFoundException);
                                }
                            }
                            class_ = null;
                        }
                        if (class_ == null) {
                            class_ = DefaultErrorActivity.class;
                        }
                    }
                    Throwable throwable2 = throwable;
                    do {
                        for (StackTraceElement stackTraceElement : throwable2.getStackTrace()) {
                            if ((!stackTraceElement.getClassName().equals((Object)"android.app.ActivityThread") || !stackTraceElement.getMethodName().equals((Object)"handleBindApplication")) && !stackTraceElement.getClassName().equals((Object)class_.getName())) continue;
                            bl2 = true;
                            break block33;
                        }
                    } while ((throwable2 = throwable2.getCause()) != null);
                    bl2 = false;
                }
                if (bl2) {
                    Log.e((String)"CustomActivityOnCrash", (String)"Your application class or your error activity have crashed, the custom activity will not be launched!");
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, throwable);
                        return;
                    }
                } else if (c.b.k != 1 && c.e) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
                    if (c.b.k == 2 && (uncaughtExceptionHandler = this.a) != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, throwable);
                        return;
                    }
                } else {
                    Intent intent = new Intent((Context)c.a, class_);
                    StringWriter stringWriter = new StringWriter();
                    throwable.printStackTrace(new PrintWriter((Writer)stringWriter));
                    String string2 = stringWriter.toString();
                    if (string2.length() > 131071) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string2.substring(0, 131047));
                        stringBuilder.append(" [stack trace too large]");
                        string2 = stringBuilder.toString();
                    }
                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", string2);
                    if (c.b.p) {
                        Deque<String> deque;
                        StringBuilder stringBuilder = new StringBuilder();
                        while (!(deque = c.c).isEmpty()) {
                            stringBuilder.append((String)deque.poll());
                        }
                        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG", stringBuilder.toString());
                    }
                    d.a.a.e.a a2 = c.b;
                    if (a2.n && a2.t == null) {
                        Class class_2;
                        Application application;
                        block34 : {
                            application = c.a;
                            Intent intent2 = new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(application.getPackageName());
                            List list = application.getPackageManager().queryIntentActivities(intent2, 64);
                            if (list != null && list.size() > 0) {
                                ResolveInfo resolveInfo = (ResolveInfo)list.get(0);
                                try {
                                    class_2 = Class.forName((String)resolveInfo.activityInfo.name);
                                    break block34;
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    Log.e((String)"CustomActivityOnCrash", (String)"Failed when resolving the restart activity class via intent filter, stack trace follows!", (Throwable)classNotFoundException);
                                }
                            }
                            class_2 = null;
                        }
                        if (class_2 == null) {
                            Intent intent3 = application.getPackageManager().getLaunchIntentForPackage(application.getPackageName());
                            Class class_3 = null;
                            if (intent3 != null) {
                                ComponentName componentName = intent3.getComponent();
                                class_3 = null;
                                if (componentName != null) {
                                    try {
                                        class_3 = Class.forName((String)intent3.getComponent().getClassName());
                                    }
                                    catch (ClassNotFoundException classNotFoundException) {
                                        Log.e((String)"CustomActivityOnCrash", (String)"Failed when resolving the restart activity class via getLaunchIntentForPackage, stack trace follows!", (Throwable)classNotFoundException);
                                    }
                                }
                            }
                            class_2 = class_3;
                        }
                        a2.t = class_2;
                    }
                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG", (Serializable)c.b);
                    intent.setFlags(268468224);
                    c.a a3 = c.b.u;
                    if (a3 != null) {
                        a3.k();
                    }
                    c.a.startActivity(intent);
                }
            }
            if ((activity = (Activity)c.d.get()) != null) {
                activity.finish();
                c.d.clear();
            }
            c.d();
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, throwable);
        }
    }
}

