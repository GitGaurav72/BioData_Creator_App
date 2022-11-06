/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IInterface
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package b.a.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import b.a.a.a;
import java.util.List;

public interface b
extends IInterface {
    public Bundle extraCommand(String var1, Bundle var2);

    public boolean mayLaunchUrl(a var1, Uri var2, Bundle var3, List<Bundle> var4);

    public boolean newSession(a var1);

    public boolean newSessionWithExtras(a var1, Bundle var2);

    public int postMessage(a var1, String var2, Bundle var3);

    public boolean receiveFile(a var1, Uri var2, int var3, Bundle var4);

    public boolean requestPostMessageChannel(a var1, Uri var2);

    public boolean requestPostMessageChannelWithExtras(a var1, Uri var2, Bundle var3);

    public boolean updateVisuals(a var1, Bundle var2);

    public boolean validateRelationship(a var1, int var2, Uri var3, Bundle var4);

    public boolean warmup(long var1);
}

