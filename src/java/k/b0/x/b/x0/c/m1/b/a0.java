/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.AnnotatedElement
 *  java.lang.reflect.Member
 *  java.lang.reflect.Modifier
 *  java.lang.reflect.Type
 *  java.util.Collection
 *  java.util.List
 *  k.b0.x.b.x0.c.h1
 *  k.b0.x.b.x0.c.m1.b.c0
 *  k.b0.x.b.x0.c.m1.b.h
 *  k.b0.x.b.x0.c.m1.b.s
 *  k.b0.x.b.x0.c.m1.b.w
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.b0.x.b.x0.e.a.q0.p
 *  k.b0.x.b.x0.e.a.q0.z
 */
package k.b0.x.b.x0.c.m1.b;

import e.s.a.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import k.b0.x.b.x0.c.h1;
import k.b0.x.b.x0.c.m1.b.c0;
import k.b0.x.b.x0.c.m1.b.h;
import k.b0.x.b.x0.c.m1.b.s;
import k.b0.x.b.x0.c.m1.b.w;
import k.b0.x.b.x0.e.a.q0.p;
import k.b0.x.b.x0.e.a.q0.z;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.b0.x.b.x0.g.g;
import k.x.c.i;

public abstract class a0
extends w
implements h,
c0,
p {
    public int A() {
        return this.M().getModifiers();
    }

    public k.b0.x.b.x0.e.a.q0.g L() {
        Class class_ = this.M().getDeclaringClass();
        i.d((Object)class_, "member.declaringClass");
        return new s(class_);
    }

    public abstract Member M();

    /*
     * Exception decompiling
     */
    public final List<z> N(Type[] var1, Annotation[][] var2, boolean var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl65 : ALOAD : trying to set 1 previously set to 0
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

    public AnnotatedElement a() {
        return (AnnotatedElement)this.M();
    }

    public k.b0.x.b.x0.e.a.q0.a e(c c2) {
        return a.R0((h)this, (c)c2);
    }

    public boolean equals(Object object) {
        return object instanceof a0 && i.a((Object)this.M(), (Object)((a0)((Object)object)).M());
    }

    public Collection getAnnotations() {
        return a.g1((h)this);
    }

    public e getName() {
        String string = this.M().getName();
        if (string == null) {
            return g.b;
        }
        e e2 = e.l(string);
        i.d(e2, "member.name?.let { Name.\u2026ialNames.NO_NAME_PROVIDED");
        return e2;
    }

    public h1 getVisibility() {
        return a.U1((c0)this);
    }

    public int hashCode() {
        return this.M().hashCode();
    }

    public boolean isAbstract() {
        i.e((Object)((Object)this), "this");
        return Modifier.isAbstract((int)this.A());
    }

    public boolean isFinal() {
        i.e((Object)((Object)this), "this");
        return Modifier.isFinal((int)this.A());
    }

    public boolean isStatic() {
        i.e((Object)((Object)this), "this");
        return Modifier.isStatic((int)this.A());
    }

    public boolean l() {
        a.o2((h)this);
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append((Object)this.M());
        return stringBuilder.toString();
    }
}

