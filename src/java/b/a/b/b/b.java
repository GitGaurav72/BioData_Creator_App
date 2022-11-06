/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.browse.MediaBrowser
 *  android.media.browse.MediaBrowser$ConnectionCallback
 *  android.os.Messenger
 *  android.support.v4.media.MediaBrowserCompat
 *  android.support.v4.media.MediaBrowserCompat$a
 *  android.support.v4.media.MediaBrowserCompat$b
 *  android.support.v4.media.MediaBrowserCompat$b$a
 *  android.support.v4.media.MediaBrowserCompat$b$b
 *  android.support.v4.media.MediaBrowserCompat$d
 *  android.support.v4.media.MediaBrowserCompat$h
 *  android.support.v4.media.session.MediaSessionCompat$Token
 */
package b.a.b.b;

import android.media.browse.MediaBrowser;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import b.a.b.b.a;

public class b<T extends a>
extends MediaBrowser.ConnectionCallback {
    public final T a;

    public b(T t) {
        this.a = t;
    }

    /*
     * Exception decompiling
     */
    public void onConnected() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl90 : ALOAD : trying to set 1 previously set to 0
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

    public void onConnectionFailed() {
        MediaBrowserCompat.b b2 = ((MediaBrowserCompat.b.b)this.a).a;
        MediaBrowserCompat.b.a a2 = b2.mConnectionCallbackInternal;
        if (a2 != null) {
            (MediaBrowserCompat.d)a2;
        }
        b2.onConnectionFailed();
    }

    public void onConnectionSuspended() {
        MediaBrowserCompat.b.b b2 = (MediaBrowserCompat.b.b)this.a;
        MediaBrowserCompat.b.a a2 = b2.a.mConnectionCallbackInternal;
        if (a2 != null) {
            MediaBrowserCompat.d d2 = (MediaBrowserCompat.d)a2;
            d2.f = null;
            d2.g = null;
            d2.h = null;
            d2.d.a(null);
        }
        b2.a.onConnectionSuspended();
    }
}

