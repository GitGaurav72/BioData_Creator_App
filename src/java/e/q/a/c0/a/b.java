/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.p.a.c.b.a
 *  e.q.a.b0.b
 *  e.q.a.c0.a.a$a
 *  e.q.a.c0.a.c
 *  e.q.a.k
 *  e.q.a.m
 *  e.q.a.m$a
 *  e.q.a.r
 *  e.q.a.r$a
 *  e.q.a.y
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Field
 *  java.lang.reflect.Modifier
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  k.b0.c
 *  k.b0.d
 *  k.b0.e
 *  k.b0.g
 *  k.b0.i
 *  k.b0.j
 *  k.b0.k
 *  k.b0.l
 *  k.b0.m
 *  k.b0.n
 *  k.b0.o
 *  k.b0.x.b.e
 *  k.b0.x.b.l
 *  k.b0.x.b.l$a
 *  k.b0.x.b.m0
 *  k.b0.x.b.n0
 *  k.b0.x.b.s
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.j
 *  k.b0.x.b.x0.c.q0
 *  k.b0.x.b.x0.c.v
 *  k.s.i
 *  kotlin.Metadata
 */
package e.q.a.c0.a;

import e.q.a.c0.a.a;
import e.q.a.c0.a.c;
import e.q.a.k;
import e.q.a.m;
import e.q.a.r;
import e.q.a.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k.b0.d;
import k.b0.e;
import k.b0.g;
import k.b0.i;
import k.b0.j;
import k.b0.l;
import k.b0.n;
import k.b0.o;
import k.b0.x.b.l;
import k.b0.x.b.m0;
import k.b0.x.b.n0;
import k.b0.x.b.s;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.v;
import kotlin.Metadata;

/*
 * Exception performing whole class analysis.
 */
@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2={"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "reflect"}, k=1, mv={1, 6, 0}, xi=48)
public final class b
implements m.a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public m<?> a(Type type, Set<? extends Annotation> set, y y2) {
        LinkedHashMap linkedHashMap;
        Class class_;
        boolean bl;
        Iterator iterator;
        ArrayList arrayList;
        Iterator iterator2;
        ArrayList arrayList2;
        g g2;
        LinkedHashMap linkedHashMap2;
        block43 : {
            RuntimeException runtimeException2;
            block39 : {
                Object object3;
                k.b0.x.b.l l2;
                d d2;
                block40 : {
                    k.x.c.i.e((Object)type, "type");
                    k.x.c.i.e(set, "annotations");
                    k.x.c.i.e((Object)y2, "moshi");
                    boolean bl2 = set.isEmpty();
                    bl = true;
                    if (bl2 ^ bl) {
                        return null;
                    }
                    k.x.c.i.e((Object)type, "<this>");
                    class_ = e.p.a.c.b.a.a0((Type)type);
                    k.x.c.i.d((Object)class_, "getRawType(this)");
                    if (class_.isInterface()) {
                        return null;
                    }
                    if (class_.isEnum()) {
                        return null;
                    }
                    if (!class_.isAnnotationPresent(c.a)) {
                        return null;
                    }
                    if (e.q.a.b0.b.e((Class)class_)) {
                        return null;
                    }
                    try {
                        m m2 = e.q.a.b0.b.c((y)y2, (Type)type, (Class)class_);
                        if (m2 != null) {
                            return m2;
                        }
                    }
                    catch (RuntimeException runtimeException2) {
                        if (!(runtimeException2.getCause() instanceof ClassNotFoundException)) break block39;
                    }
                    if (!(bl ^ class_.isLocalClass())) {
                        throw new IllegalArgumentException(k.x.c.i.k("Cannot serialize local class or object expression ", class_.getName()).toString());
                    }
                    d2 = e.s.a.a.G1((Class)class_);
                    if (!(bl ^ d2.isAbstract())) {
                        throw new IllegalArgumentException(k.x.c.i.k("Cannot serialize abstract class ", class_.getName()).toString());
                    }
                    if (!(bl ^ d2.isInner())) {
                        throw new IllegalArgumentException(k.x.c.i.k("Cannot serialize inner class ", class_.getName()).toString());
                    }
                    boolean bl3 = d2.p() == null ? bl : false;
                    if (!bl3) {
                        throw new IllegalArgumentException(k.x.c.i.k("Cannot serialize object declaration ", class_.getName()).toString());
                    }
                    if (!(bl ^ d2.g())) {
                        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Cannot reflectively serialize sealed class ");
                        stringBuilder.append((Object)class_.getName());
                        stringBuilder.append(". Please register an adapter.");
                        throw new IllegalArgumentException(stringBuilder.toString().toString());
                    }
                    k.x.c.i.e((Object)d2, "<this>");
                    l2 = (k.b0.x.b.l)d2;
                    m0 m02 = ((l.a)l2.p.invoke()).i;
                    l.a.d[4];
                    Object object2 = m02.invoke();
                    k.x.c.i.d(object2, "<get-constructors>(...)");
                    for (Object object3 : (Collection)object2) {
                        if (!((k.b0.x.b.x0.c.j)((s)((g)object3)).B()).j()) continue;
                        break block40;
                    }
                    object3 = null;
                }
                g2 = (g)object3;
                if (g2 == null) {
                    return null;
                }
                List list = g2.getParameters();
                int n2 = e.s.a.a.R2((int)e.s.a.a.U((Iterable)list, (int)10));
                if (n2 < 16) {
                    n2 = 16;
                }
                linkedHashMap2 = new LinkedHashMap(n2);
                for (Object object4 : list) {
                    linkedHashMap2.put((Object)((j)object4).getName(), object4);
                }
                e.s.a.a.I3((k.b0.c)g2, (boolean)bl);
                linkedHashMap = new LinkedHashMap();
                k.x.c.i.e((Object)d2, "<this>");
                m0 m03 = ((l.a)l2.p.invoke()).o;
                l.a.d[14];
                Object object5 = m03.invoke();
                k.x.c.i.d(object5, "<get-allNonStaticMembers>(...)");
                Collection collection = (Collection)object5;
                arrayList2 = new ArrayList();
                iterator2 = collection.iterator();
                break block43;
            }
            throw runtimeException2;
        }
        while (iterator2.hasNext()) {
            Object object = iterator2.next();
            k.b0.x.b.e e2 = (k.b0.x.b.e)object;
            boolean bl4 = e2.v().getExtensionReceiverParameter() != null ? bl : false;
            boolean bl5 = bl4 ^ bl && e2 instanceof l ? bl : false;
            if (!bl5) continue;
            arrayList2.add(object);
        }
        Iterator iterator3 = arrayList2.iterator();
        do {
            Iterator iterator4;
            block49 : {
                Type type2;
                List list;
                j j2;
                String string;
                l l3;
                block53 : {
                    Iterator iterator5;
                    ArrayList arrayList3;
                    block54 : {
                        block52 : {
                            e e3;
                            block51 : {
                                String string2;
                                k k2;
                                block50 : {
                                    block48 : {
                                        block47 : {
                                            Object object;
                                            block42 : {
                                                Iterator iterator6;
                                                block46 : {
                                                    block44 : {
                                                        block45 : {
                                                            Object object62;
                                                            block41 : {
                                                                if (!iterator3.hasNext()) break block44;
                                                                l3 = (l)iterator3.next();
                                                                j2 = (j)linkedHashMap2.get((Object)l3.getName());
                                                                e.s.a.a.I3((k.b0.c)l3, (boolean)bl);
                                                                for (Object object62 : l3.getAnnotations()) {
                                                                    if (!((Annotation)object62 instanceof k)) continue;
                                                                    break block41;
                                                                }
                                                                object62 = null;
                                                            }
                                                            k2 = (k)object62;
                                                            list = k.s.i.g0((Collection)l3.getAnnotations());
                                                            if (j2 == null) break block45;
                                                            k.s.i.b((Collection)list, (Iterable)j2.getAnnotations());
                                                            if (k2 != null) break block45;
                                                            iterator6 = j2.getAnnotations().iterator();
                                                            break block46;
                                                        }
                                                        iterator4 = iterator3;
                                                        break block47;
                                                    }
                                                    arrayList = new ArrayList();
                                                    iterator = g2.getParameters().iterator();
                                                    break;
                                                }
                                                while (iterator6.hasNext()) {
                                                    object = iterator6.next();
                                                    iterator4 = iterator3;
                                                    if (!((Annotation)object instanceof k)) {
                                                        iterator3 = iterator4;
                                                        continue;
                                                    }
                                                    break block42;
                                                }
                                                iterator4 = iterator3;
                                                object = null;
                                            }
                                            k2 = (k)object;
                                        }
                                        Field field = e.s.a.a.y1((k.b0.k)l3);
                                        int n3 = field == null ? 0 : field.getModifiers();
                                        if (!Modifier.isTransient((int)n3)) break block48;
                                        if (j2 != null && !j2.s()) {
                                            bl = false;
                                        }
                                        if (!bl) {
                                            throw new IllegalArgumentException(k.x.c.i.k("No default value for transient constructor ", (Object)j2).toString());
                                        }
                                        break block49;
                                    }
                                    boolean bl6 = k2 != null && k2.ignore() == bl ? bl : false;
                                    if (!bl6) break block50;
                                    if (j2 != null && !j2.s()) {
                                        bl = false;
                                    }
                                    if (!bl) {
                                        throw new IllegalArgumentException(k.x.c.i.k("No default value for ignored constructor ", (Object)j2).toString());
                                    }
                                    break block49;
                                }
                                if (j2 != null && !k.x.c.i.a((Object)j2.b(), (Object)l3.getReturnType())) {
                                    bl = false;
                                }
                                if (!bl) {
                                    StringBuilder stringBuilder = e.e.a.a.a.s((char)'\'');
                                    stringBuilder.append(l3.getName());
                                    stringBuilder.append("' has a constructor parameter of type ");
                                    k.x.c.i.c((Object)j2);
                                    stringBuilder.append((Object)j2.b());
                                    stringBuilder.append(" but a property of type ");
                                    stringBuilder.append((Object)l3.getReturnType());
                                    stringBuilder.append('.');
                                    throw new IllegalArgumentException(stringBuilder.toString().toString());
                                }
                                if (!(l3 instanceof i) && j2 == null) break block49;
                                if (k2 == null || (string2 = k2.name()) == null || k.x.c.i.a(string2, "\u0000")) {
                                    string2 = null;
                                }
                                if (string2 == null) {
                                    string2 = l3.getName();
                                }
                                string = string2;
                                e3 = l3.getReturnType().i();
                                if (!(e3 instanceof d)) break block51;
                                d d3 = (d)e3;
                                if (!d3.isValue()) break block52;
                                type2 = e.s.a.a.x1((d)d3);
                                if (l3.getReturnType().h().isEmpty()) break block53;
                                List list2 = l3.getReturnType().h();
                                arrayList3 = new ArrayList();
                                iterator5 = list2.iterator();
                                break block54;
                            }
                            if (!(e3 instanceof n)) {
                                throw new IllegalStateException("Not possible!".toString());
                            }
                        }
                        type2 = e.s.a.a.C1((k.b0.m)l3.getReturnType());
                        break block53;
                    }
                    while (iterator5.hasNext()) {
                        Object object = iterator5.next();
                        Iterator iterator7 = iterator5;
                        k.b0.m m3 = ((o)object).d;
                        Type type3 = m3 == null ? null : e.s.a.a.C1((k.b0.m)m3);
                        if (type3 != null) {
                            arrayList3.add((Object)type3);
                        }
                        iterator5 = iterator7;
                    }
                    Object[] arrobject = arrayList3.toArray((Object[])new Type[0]);
                    Objects.requireNonNull((Object)arrobject, (String)"null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    Object[] arrobject2 = (Type[])arrobject;
                    type2 = e.p.a.c.b.a.i0((Type)type2, (Type[])((Type[])Arrays.copyOf((Object[])arrobject2, (int)arrobject2.length)));
                }
                Type type4 = e.q.a.b0.b.i((Type)type, (Class)class_, (Type)type2);
                Object[] arrobject = new Annotation[]{};
                Object[] arrobject3 = ((ArrayList)list).toArray(arrobject);
                Objects.requireNonNull((Object)arrobject3, (String)"null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                m m4 = y2.d(type4, e.q.a.b0.b.f((Annotation[])((Annotation[])arrobject3)), l3.getName());
                String string3 = l3.getName();
                k.x.c.i.d((Object)m4, "adapter");
                int n4 = j2 == null ? -1 : j2.e();
                a.a a2 = new /* Unavailable Anonymous Inner Class!! */;
                linkedHashMap.put((Object)string3, (Object)a2);
            }
            bl = true;
            iterator3 = iterator4;
        } while (true);
        while (iterator.hasNext()) {
            j j3 = (j)iterator.next();
            a.a a3 = linkedHashMap.remove((Object)j3.getName());
            boolean bl7 = a3 != null || j3.s();
            if (!bl7) {
                throw new IllegalArgumentException(k.x.c.i.k("No property for required constructor ", (Object)j3).toString());
            }
            arrayList.add((Object)a3);
        }
        int n5 = arrayList.size();
        Iterator iterator8 = linkedHashMap.entrySet().iterator();
        int n6 = n5;
        while (iterator8.hasNext()) {
            a.a a4 = ((Map.Entry)iterator8.next()).getValue();
            int n7 = n6 + 1;
            String string = a4.a;
            m m5 = a4.b;
            l l4 = a4.c;
            j j4 = a4.d;
            k.x.c.i.e(string, "jsonName");
            k.x.c.i.e((Object)m5, "adapter");
            k.x.c.i.e((Object)l4, "property");
            a.a a5 = new /* Unavailable Anonymous Inner Class!! */;
            arrayList.add((Object)a5);
            n6 = n7;
        }
        k.x.c.i.e((Object)arrayList, "<this>");
        ArrayList arrayList4 = new ArrayList();
        k.x.c.i.e((Object)arrayList, "<this>");
        k.x.c.i.e((Object)arrayList4, "destination");
        for (Object object : arrayList) {
            if (object == null) continue;
            arrayList4.add(object);
        }
        ArrayList arrayList5 = new ArrayList(e.s.a.a.U((Iterable)arrayList4, (int)10));
        Iterator iterator9 = arrayList4.iterator();
        do {
            if (!iterator9.hasNext()) {
                Object[] arrobject = arrayList5.toArray((Object[])new String[0]);
                Objects.requireNonNull((Object)arrobject, (String)"null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                Object[] arrobject4 = (String[])arrobject;
                r.a a6 = r.a.a((String[])((String[])Arrays.copyOf((Object[])arrobject4, (int)arrobject4.length)));
                k.x.c.i.d((Object)a6, "options");
                return new a(g2, arrayList, arrayList4, a6).d();
            }
            arrayList5.add((Object)(iterator9.next()).a);
        } while (true);
    }
}

