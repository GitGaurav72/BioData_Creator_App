/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.util.concurrent.locks.LockSupport
 */
package l.a;

import java.util.concurrent.locks.LockSupport;
import l.a.n0;
import l.a.o0;
import l.a.t1;

public final class e0
extends o0
implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final e0 p;
    public static final long q;

    /*
     * Exception decompiling
     */
    public static {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl20 : ALOAD_1 : trying to set 1 previously set to 0
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Thread R() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        e0 e02 = this;
        synchronized (e02) {
            Thread thread2 = _thread;
            if (thread2 == null) {
                _thread = thread2 = new Thread((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
                thread2.setDaemon(true);
                thread2.start();
            }
            return thread2;
        }
    }

    public final void j0() {
        e0 e02 = this;
        synchronized (e02) {
            block4 : {
                boolean bl = this.k0();
                if (bl) break block4;
                return;
            }
            debugStatus = 3;
            this.b0();
            this.notifyAll();
            return;
        }
    }

    public final boolean k0() {
        int n2 = debugStatus;
        return n2 == 2 || n2 == 3;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void run() {
        long l2;
        long l3;
        int n2;
        long l4;
        t1.b.set((Object)this);
        try {
            e0 e02 = this;
            // MONITORENTER : e02
        }
        catch (Throwable throwable) {
            _thread = null;
            this.j0();
            if (this.X()) throw throwable;
            this.R();
            throw throwable;
        }
        if (this.k0()) {
            n2 = 0;
        } else {
            debugStatus = n2 = 1;
            this.notifyAll();
        }
        // MONITOREXIT : e02
        if (n2 == 0) {
            _thread = null;
            this.j0();
            if (this.X()) return;
            this.R();
            return;
        }
        long l5 = Long.MAX_VALUE;
        do {
            Thread.interrupted();
            l2 = this.Y();
            if (l2 != Long.MAX_VALUE) break block13;
            l4 = System.nanoTime();
            if (l5 != Long.MAX_VALUE) break block14;
            l3 = q;
            break;
        } while (true);
        {
            block15 : {
                block16 : {
                    block13 : {
                        long l6;
                        block14 : {
                            l5 = l3 + l4;
                        }
                        if ((l6 = l5 - l4) <= 0L) {
                            _thread = null;
                            this.j0();
                            if (this.X()) return;
                            this.R();
                            return;
                        }
                        if (l2 > l6) {
                            l2 = l6;
                        }
                        break block16;
                    }
                    l5 = Long.MAX_VALUE;
                }
                if (l2 <= 0L) continue;
                boolean bl = this.k0();
                if (!bl) break block15;
                _thread = null;
                this.j0();
                if (this.X()) return;
                this.R();
                return;
            }
            LockSupport.parkNanos((Object)((Object)this), (long)l2);
            continue;
        }
    }
}

