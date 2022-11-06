/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IInterface
 *  java.lang.Object
 *  java.lang.String
 */
package b.a.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;

public interface a
extends IInterface {
    public void extraCallback(String var1, Bundle var2);

    public Bundle extraCallbackWithResult(String var1, Bundle var2);

    public void onMessageChannelReady(Bundle var1);

    public void onNavigationEvent(int var1, Bundle var2);

    public void onPostMessage(String var1, Bundle var2);

    public void onRelationshipValidationResult(int var1, Uri var2, boolean var3, Bundle var4);
}

