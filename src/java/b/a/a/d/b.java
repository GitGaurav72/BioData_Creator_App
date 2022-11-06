/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  java.lang.Object
 *  java.lang.String
 */
package b.a.a.d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface b
extends IInterface {
    public Bundle areNotificationsEnabled(Bundle var1);

    public void cancelNotification(Bundle var1);

    public Bundle extraCommand(String var1, Bundle var2, IBinder var3);

    public Bundle getActiveNotifications();

    public Bundle getSmallIconBitmap();

    public int getSmallIconId();

    public Bundle notifyNotificationWithChannel(Bundle var1);
}

