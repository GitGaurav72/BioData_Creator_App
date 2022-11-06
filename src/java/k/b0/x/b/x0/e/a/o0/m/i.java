/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  k.b0.f
 *  k.b0.k
 *  k.b0.x.b.x0.c.d0
 *  k.b0.x.b.x0.c.i1.h
 *  k.b0.x.b.x0.c.i1.h$a
 *  k.b0.x.b.x0.c.u0
 *  k.b0.x.b.x0.e.a.o0.m.c
 *  k.b0.x.b.x0.e.a.q0.d
 *  k.b0.x.b.x0.e.a.q0.t
 *  k.b0.x.b.x0.e.b.n
 *  k.b0.x.b.x0.j.a0.h
 *  k.b0.x.b.x0.l.i
 *  k.s.r
 *  k.x.b.a
 *  kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName
 */
package k.b0.x.b.x0.e.a.o0.m;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.b0.f;
import k.b0.k;
import k.b0.x.b.x0.c.d0;
import k.b0.x.b.x0.c.g;
import k.b0.x.b.x0.c.i1.h;
import k.b0.x.b.x0.c.k1.c0;
import k.b0.x.b.x0.c.u0;
import k.b0.x.b.x0.e.a.o0.d;
import k.b0.x.b.x0.e.a.o0.h;
import k.b0.x.b.x0.e.a.o0.m.i;
import k.b0.x.b.x0.e.a.q0.t;
import k.b0.x.b.x0.e.a.y;
import k.b0.x.b.x0.e.b.m;
import k.b0.x.b.x0.e.b.n;
import k.s.r;
import k.x.c.q;
import k.x.c.w;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

public final class i
extends c0 {
    public static final /* synthetic */ k<Object>[] k;
    public final t l;
    public final h m;
    public final k.b0.x.b.x0.l.i n;
    public final k.b0.x.b.x0.e.a.o0.m.c o;
    public final k.b0.x.b.x0.l.i<List<k.b0.x.b.x0.g.c>> p;
    public final k.b0.x.b.x0.c.i1.h q;

    public static {
        k[] arrk = new k[]{w.c(new q((f)w.a(i.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), w.c(new q((f)w.a(i.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
        k = arrk;
    }

    public i(h h2, t t2) {
        k.b0.x.b.x0.c.i1.h h3;
        h h4;
        k.x.c.i.e(h2, "outerContext");
        k.x.c.i.e((Object)t2, "jPackage");
        super(h2.a.o, t2.getFqName());
        this.l = t2;
        this.m = h4 = e.s.a.a.O((h)h2, (g)this, null, (int)0, (int)6);
        this.n = h4.a.a.d(new k.x.b.a<Map<String, ? extends m>>(this){
            public final /* synthetic */ i k;
            {
                this.k = i2;
                super(0);
            }

            public Object invoke() {
                i i2 = this.k;
                k.b0.x.b.x0.e.b.r r2 = i2.m.a.l;
                String string = i2.getFqName().b();
                k.x.c.i.d(string, "fqName.asString()");
                List<String> list = r2.a(string);
                i i3 = this.k;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (String string2 : list) {
                    k.b0.x.b.x0.g.b b2 = k.b0.x.b.x0.g.b.l(JvmClassName.byInternalName((String)string2).getFqNameForTopLevelClassMaybeWithDollars());
                    k.x.c.i.d(b2, "topLevel(JvmClassName.by\u2026velClassMaybeWithDollars)");
                    m m2 = e.s.a.a.V0((k.b0.x.b.x0.e.b.l)i3.m.a.c, (k.b0.x.b.x0.g.b)b2);
                    k.i<String, m> i4 = m2 == null ? null : new k.i<String, m>(string2, m2);
                    if (i4 == null) continue;
                    arrayList.add(i4);
                }
                return k.s.i.c0((java.lang.Iterable)arrayList);
            }
        });
        this.o = new k.b0.x.b.x0.e.a.o0.m.c(h4, t2, this);
        this.p = h4.a.a.c(new k.x.b.a<List<? extends k.b0.x.b.x0.g.c>>(this){
            public final /* synthetic */ i k;
            {
                this.k = i2;
                super(0);
            }

            public Object invoke() {
                java.util.Collection collection = this.k.l.w();
                java.util.ArrayList arrayList = new java.util.ArrayList(e.s.a.a.U((java.lang.Iterable)collection, (int)10));
                java.util.Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    arrayList.add((Object)((t)iterator.next()).getFqName());
                }
                return arrayList;
            }
        }, r.k);
        if (h4.a.v.e) {
            Objects.requireNonNull((Object)k.b0.x.b.x0.c.i1.h.g);
            h3 = h.a.b;
        } else {
            h3 = e.s.a.a.v3((h)h4, (k.b0.x.b.x0.e.a.q0.d)t2);
        }
        this.q = h3;
        h4.a.a.d(new k.x.b.a<HashMap<JvmClassName, JvmClassName>>(this){
            public final /* synthetic */ i k;
            {
                this.k = i2;
                super(0);
            }

            public Object invoke() {
                HashMap hashMap = new HashMap();
                for (java.util.Map$Entry entry : this.k.n().entrySet()) {
                    String string = (String)entry.getKey();
                    m m2 = (m)entry.getValue();
                    JvmClassName jvmClassName = JvmClassName.byInternalName((String)string);
                    k.x.c.i.d((Object)jvmClassName, "byInternalName(partInternalName)");
                    k.b0.x.b.x0.e.b.x.a a2 = m2.a();
                    int n2 = a2.a.ordinal();
                    if (n2 != 2) {
                        String string2;
                        if (n2 != 5 || (string2 = a2.a()) == null) continue;
                        JvmClassName jvmClassName2 = JvmClassName.byInternalName((String)string2);
                        k.x.c.i.d((Object)jvmClassName2, "byInternalName(header.mu\u2026: continue@kotlinClasses)");
                        hashMap.put((Object)jvmClassName, (Object)jvmClassName2);
                        continue;
                    }
                    hashMap.put((Object)jvmClassName, (Object)jvmClassName);
                }
                return hashMap;
            }
        });
    }

    public k.b0.x.b.x0.c.i1.h getAnnotations() {
        return this.q;
    }

    @Override
    public k.b0.x.b.x0.j.a0.h getMemberScope() {
        return this.o;
    }

    @Override
    public u0 getSource() {
        return new n(this);
    }

    public final Map<String, m> n() {
        return (Map)e.s.a.a.T1((k.b0.x.b.x0.l.i)this.n, k[0]);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = e.e.a.a.a.t((String)"Lazy Java package fragment: ");
        stringBuilder.append((Object)this.getFqName());
        stringBuilder.append(" of module ");
        stringBuilder.append((Object)this.m.a.o);
        return stringBuilder.toString();
    }
}

