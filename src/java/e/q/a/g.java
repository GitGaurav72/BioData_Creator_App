/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.p.a.c.b.a
 *  e.q.a.b0.b
 *  e.q.a.f
 *  e.q.a.g$b
 *  e.q.a.m
 *  e.q.a.m$a
 *  e.q.a.r
 *  e.q.a.r$a
 *  e.q.a.v
 *  e.q.a.y
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.InstantiationException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Type
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Set
 */
package e.q.a;

import e.q.a.f;
import e.q.a.g;
import e.q.a.m;
import e.q.a.r;
import e.q.a.v;
import e.q.a.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class g<T>
extends m<T> {
    public static final m.a a = new m.a(){

        /*
         * Exception decompiling
         */
        public m<?> a(Type var1, Set<? extends Annotation> var2, y var3) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl257 : NEW : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        public final void b(Type type, Class<?> class_) {
            Class class_2 = e.p.a.c.b.a.a0((Type)type);
            if (!class_.isAssignableFrom(class_2)) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No JsonAdapter for ");
            stringBuilder.append((Object)type);
            stringBuilder.append(", you should probably use ");
            stringBuilder.append(class_.getSimpleName());
            stringBuilder.append(" instead of ");
            stringBuilder.append(class_2.getSimpleName());
            stringBuilder.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    };
    public final f<T> b;
    public final b<?>[] c;
    public final r.a d;

    public g(f<T> f2, Map<String, b<?>> map) {
        this.b = f2;
        this.c = (b[])map.values().toArray((Object[])new b[map.size()]);
        this.d = r.a.a((String[])((String[])map.keySet().toArray((Object[])new String[map.size()])));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public T a(r r2) {
        Object object = this.b.a();
        try {
            r2.b();
            while (r2.r()) {
                int n2 = r2.F(this.d);
                if (n2 == -1) {
                    r2.I();
                    r2.J();
                    continue;
                }
                b<?> b2 = this.c[n2];
                Object object2 = b2.c.a(r2);
                b2.b.set(object, object2);
            }
            r2.o();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError();
        }
        return (T)object;
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError();
        }
        catch (InvocationTargetException invocationTargetException) {
            e.q.a.b0.b.k((InvocationTargetException)invocationTargetException);
            throw null;
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException((Throwable)instantiationException);
        }
    }

    public void f(v v2, T t2) {
        v2.b();
        b<?>[] arrb = this.c;
        int n2 = arrb.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            b<?> b2 = arrb[i2];
            v2.u(b2.a);
            Object object = b2.b.get(t2);
            b2.c.f(v2, object);
        }
        try {
            v2.q();
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"JsonAdapter(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

}

