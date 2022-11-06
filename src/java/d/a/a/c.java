/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Process
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  e.e.a.a.a
 *  java.io.Serializable
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.ref.WeakReference
 *  java.util.ArrayDeque
 *  java.util.Deque
 */
package d.a.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;

public final class c {
    @SuppressLint(value={"StaticFieldLeak"})
    public static Application a;
    public static d.a.a.e.a b;
    public static final Deque<String> c;
    public static WeakReference<Activity> d;
    public static boolean e;

    public static {
        b = new d.a.a.e.a();
        c = new ArrayDeque(50);
        d = new WeakReference(null);
        e = true;
    }

    @NonNull
    public static String a(@Nullable String string2) {
        if (string2 != null && string2.length() != 0) {
            char c2 = string2.charAt(0);
            if (Character.isUpperCase((char)c2)) {
                return string2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Character.toUpperCase((char)c2));
            stringBuilder.append(string2.substring(1));
            return stringBuilder.toString();
        }
        return "";
    }

    /*
     * Exception decompiling
     */
    @NonNull
    public static String b(@NonNull Context var0, @NonNull Intent var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl57 : NEW : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    @Nullable
    public static d.a.a.e.a c(@NonNull Intent intent) {
        d.a.a.e.a a2 = (d.a.a.e.a)intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
        if (a2.o && intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE") != null) {
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"The previous app process crashed. This is the stack trace of the crash:\n");
            stringBuilder.append(intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
            Log.e((String)"CustomActivityOnCrash", (String)stringBuilder.toString());
        }
        return a2;
    }

    public static void d() {
        Process.killProcess((int)Process.myPid());
        System.exit((int)10);
    }

    public static void e(@NonNull Activity activity, @NonNull d.a.a.e.a a2) {
        a a3;
        Intent intent = new Intent((Context)activity, a2.t);
        intent.addFlags(270565376);
        if (intent.getComponent() != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        if ((a3 = a2.u) != null) {
            a3.F();
        }
        activity.finish();
        activity.startActivity(intent);
        c.d();
    }

    public static interface a
    extends Serializable {
        public void F();

        public void k();

        public void l();
    }

}

