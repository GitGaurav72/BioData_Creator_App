/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.AnnotatedElement
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.lang.reflect.Modifier
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  k.b0.x.b.x0.c.h1
 *  k.b0.x.b.x0.c.m1.b.c0
 *  k.b0.x.b.x0.c.m1.b.d
 *  k.b0.x.b.x0.c.m1.b.h
 *  k.b0.x.b.x0.c.m1.b.w
 *  k.b0.x.b.x0.e.a.q0.a
 *  k.s.i
 *  k.s.r
 */
package k.b0.x.b.x0.c.m1.b;

import e.s.a.a;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k.b0.x.b.x0.c.h1;
import k.b0.x.b.x0.c.m1.b.c0;
import k.b0.x.b.x0.c.m1.b.d;
import k.b0.x.b.x0.c.m1.b.h;
import k.b0.x.b.x0.c.m1.b.h0;
import k.b0.x.b.x0.c.m1.b.k;
import k.b0.x.b.x0.c.m1.b.l;
import k.b0.x.b.x0.c.m1.b.m;
import k.b0.x.b.x0.c.m1.b.n;
import k.b0.x.b.x0.c.m1.b.o;
import k.b0.x.b.x0.c.m1.b.p;
import k.b0.x.b.x0.c.m1.b.q;
import k.b0.x.b.x0.c.m1.b.r;
import k.b0.x.b.x0.c.m1.b.u;
import k.b0.x.b.x0.c.m1.b.w;
import k.b0.x.b.x0.e.a.q0.b0;
import k.b0.x.b.x0.e.a.q0.g;
import k.b0.x.b.x0.e.a.q0.j;
import k.b0.x.b.x0.e.a.q0.v;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;
import k.c0.t;
import k.x.c.i;
import k.x.c.z;

public final class s
extends w
implements h,
c0,
g {
    public final Class<?> a;

    public s(Class<?> class_) {
        i.e(class_, "klass");
        this.a = class_;
    }

    public int A() {
        return this.a.getModifiers();
    }

    @Override
    public boolean D() {
        return this.a.isInterface();
    }

    @Override
    public b0 E() {
        return null;
    }

    public Collection G() {
        Object[] arrobject = this.a.getDeclaredClasses();
        i.d(arrobject, "klass.declaredClasses");
        return t.j(t.h(t.e(a.w((Object[])arrobject), o.k), p.k));
    }

    public Collection I() {
        Object[] arrobject = this.a.getDeclaredMethods();
        i.d(arrobject, "klass.declaredMethods");
        return t.j(t.g(t.d(a.w((Object[])arrobject), new q(this)), r.k));
    }

    /*
     * Exception decompiling
     */
    @Override
    public Collection<j> J() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl48 : ALOAD_2 : trying to set 1 previously set to 0
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
        return this.a;
    }

    public k.b0.x.b.x0.e.a.q0.a e(c c2) {
        return a.R0((h)this, (c)c2);
    }

    public boolean equals(Object object) {
        return object instanceof s && i.a(this.a, ((s)object).a);
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean g() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl46 : ALOAD_2 : trying to set 1 previously set to 0
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

    public Collection getAnnotations() {
        return a.g1((h)this);
    }

    public Collection getConstructors() {
        Object[] arrobject = this.a.getDeclaredConstructors();
        i.d(arrobject, "klass.declaredConstructors");
        return t.j(t.g(t.e(a.w((Object[])arrobject), k.k), l.k));
    }

    @Override
    public c getFqName() {
        c c2 = d.a(this.a).b();
        i.d(c2, "klass.classId.asSingleFqName()");
        return c2;
    }

    public e getName() {
        e e2 = e.l(this.a.getSimpleName());
        i.d(e2, "identifier(klass.simpleName)");
        return e2;
    }

    @Override
    public Collection<j> getSupertypes() {
        Type type = Object.class;
        if (i.a(this.a, type)) {
            return k.s.r.k;
        }
        z z2 = new z(2);
        Type type2 = this.a.getGenericSuperclass();
        if (type2 != null) {
            type = type2;
        }
        z2.a.add((Object)type);
        Type[] arrtype = this.a.getGenericInterfaces();
        i.d(arrtype, "klass.genericInterfaces");
        z2.a(arrtype);
        Object[] arrobject = new Type[z2.b()];
        List list = k.s.i.E((Object[])z2.a.toArray(arrobject));
        ArrayList arrayList = new ArrayList(a.U((Iterable)list, (int)10));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)new u((Type)iterator.next()));
        }
        return arrayList;
    }

    public List<h0> getTypeParameters() {
        TypeVariable[] arrtypeVariable = this.a.getTypeParameters();
        i.d(arrtypeVariable, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(arrtypeVariable.length);
        for (TypeVariable typeVariable : arrtypeVariable) {
            arrayList.add((Object)new h0(typeVariable));
        }
        return arrayList;
    }

    public h1 getVisibility() {
        return a.U1((c0)this);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isAbstract() {
        i.e(this, "this");
        return Modifier.isAbstract((int)this.A());
    }

    public boolean isFinal() {
        i.e(this, "this");
        return Modifier.isFinal((int)this.A());
    }

    public boolean isStatic() {
        i.e(this, "this");
        return Modifier.isStatic((int)this.A());
    }

    @Override
    public g j() {
        Class class_ = this.a.getDeclaringClass();
        if (class_ == null) {
            return null;
        }
        return new s(class_);
    }

    /*
     * Exception decompiling
     */
    @Override
    public Collection<v> k() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl48 : ALOAD_2 : trying to set 1 previously set to 0
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

    public boolean l() {
        a.o2((h)this);
        return false;
    }

    @Override
    public boolean p() {
        return this.a.isAnnotation();
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean q() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl46 : ALOAD_2 : trying to set 1 previously set to 0
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

    @Override
    public boolean r() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        e.e.a.a.a.B(s.class, (StringBuilder)stringBuilder, (String)": ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    @Override
    public boolean x() {
        return this.a.isEnum();
    }

    public Collection z() {
        Object[] arrobject = this.a.getDeclaredFields();
        i.d(arrobject, "klass.declaredFields");
        return t.j(t.g(t.e(a.w((Object[])arrobject), m.k), n.k));
    }
}

