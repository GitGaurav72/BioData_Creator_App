/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Objects
 *  java.util.concurrent.ThreadFactory
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  m.m0.f.d$c
 */
package m.m0.f;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.m0.f.d;

/*
 * Exception performing whole class analysis.
 */
public final class d {
    public static final d a;
    public static final Logger b;
    public static final b c;
    public int d;
    public boolean e;
    public long f;
    public final List<m.m0.f.c> g;
    public final List<m.m0.f.c> h;
    public final Runnable i;
    public final a j;

    public static {
        c = new b(null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m.m0.c.h);
        stringBuilder.append(" TaskRunner");
        String string = stringBuilder.toString();
        i.e(string, "name");
        a = new d((a)new /* Unavailable Anonymous Inner Class!! */);
        Logger logger = Logger.getLogger((String)d.class.getName());
        i.d((Object)logger, "Logger.getLogger(TaskRunner::class.java.name)");
        b = logger;
    }

    public d(a a2) {
        i.e(a2, "backend");
        this.j = a2;
        this.d = 10000;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new Runnable(){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void run() {
                do lbl-1000: // 3 sources:
                {
                    var19_4 = var1_2 = this;
                    // MONITORENTER : var19_4
                    var3_3 = this.c();
                    // MONITOREXIT : var19_4
                    if (var3_3 == null) return;
                    var4_5 = var3_3.a;
                    i.c(var4_5);
                    var5_6 = -1L;
                    var8_7 = d.b.isLoggable(Level.FINE);
                    if (var8_7) {
                        var5_6 = var4_5.e.j.c();
                        e.s.a.a.m((m.m0.f.a)var3_3, (m.m0.f.c)var4_5, (String)"starting");
                    }
                    d.a(this, var3_3);
                    if (!var8_7) continue;
                    break;
                } while (true);
                catch (Throwable var9_9) {
                    try {
                        this.j.execute(this);
                        throw var9_9;
                    }
                    catch (Throwable var10_10) {
                        if (var8_7 == false) throw var10_10;
                        var11_11 = var4_5.e.j.c() - var5_6;
                        var13_12 = e.e.a.a.a.t((String)"failed a run in ");
                        var13_12.append(e.s.a.a.b1((long)var11_11));
                        e.s.a.a.m((m.m0.f.a)var3_3, (m.m0.f.c)var4_5, (String)var13_12.toString());
                        throw var10_10;
                    }
                }
                {
                    var15_8 = var4_5.e.j.c() - var5_6;
                    var17_1 = e.e.a.a.a.t((String)"finished run in ");
                    var17_1.append(e.s.a.a.b1((long)var15_8));
                    e.s.a.a.m((m.m0.f.a)var3_3, (m.m0.f.c)var4_5, (String)var17_1.toString());
                    ** while (true)
                }
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(d d2, m.m0.f.a a2) {
        long l2;
        d d3;
        Objects.requireNonNull((Object)d2);
        Thread thread = Thread.currentThread();
        i.d((Object)thread, "currentThread");
        String string = thread.getName();
        thread.setName(a2.c);
        try {
            l2 = a2.a();
            d3 = d2;
        }
        catch (Throwable throwable) {
            d d4 = d2;
            synchronized (d4) {
                d2.b(a2, -1L);
            }
            thread.setName(string);
            throw throwable;
        }
        synchronized (d3) {
            d2.b(a2, l2);
        }
        thread.setName(string);
    }

    public final void b(m.m0.f.a a2, long l2) {
        m.m0.f.c c2 = a2.a;
        i.c(c2);
        boolean bl = c2.b == a2;
        if (bl) {
            boolean bl2 = c2.d;
            c2.d = false;
            c2.b = null;
            this.g.remove((Object)c2);
            if (l2 != -1L && !bl2 && !c2.a) {
                c2.d(a2, l2, true);
            }
            if (true ^ c2.c.isEmpty()) {
                this.h.add((Object)c2);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /*
     * Exception decompiling
     */
    public final m.m0.f.a c() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl135 : ALOAD_0 : trying to set 1 previously set to 0
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

    public final void d() {
        for (int i2 = -1 + this.g.size(); i2 >= 0; --i2) {
            ((m.m0.f.c)this.g.get(i2)).b();
        }
        for (int i3 = -1 + this.h.size(); i3 >= 0; --i3) {
            m.m0.f.c c2 = (m.m0.f.c)this.h.get(i3);
            c2.b();
            if (!c2.c.isEmpty()) continue;
            this.h.remove(i3);
        }
    }

    public final void e(m.m0.f.c c2) {
        i.e(c2, "taskQueue");
        if (c2.b == null) {
            if (true ^ c2.c.isEmpty()) {
                List<m.m0.f.c> list = this.h;
                i.e(list, "$this$addIfAbsent");
                if (!list.contains((Object)c2)) {
                    list.add((Object)c2);
                }
            } else {
                this.h.remove((Object)c2);
            }
        }
        if (this.e) {
            this.j.a(this);
            return;
        }
        this.j.execute(this.i);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final m.m0.f.c f() {
        int n2;
        d d2 = this;
        synchronized (d2) {
            n2 = this.d;
            this.d = n2 + 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('Q');
        stringBuilder.append(n2);
        return new m.m0.f.c(this, stringBuilder.toString());
    }

    public static interface a {
        public void a(d var1);

        public void b(d var1, long var2);

        public long c();

        public void execute(Runnable var1);
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

}

