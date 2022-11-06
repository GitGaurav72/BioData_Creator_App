/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.karumi.dexter.Thread
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.karumi.dexter;

import android.os.Handler;
import android.os.Looper;
import com.karumi.dexter.Thread;

public final class MainThread
implements Thread {
    private static boolean runningMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public void execute(Runnable runnable) {
        if (MainThread.runningMainThread()) {
            runnable.run();
            return;
        }
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public void loop() {
    }
}

