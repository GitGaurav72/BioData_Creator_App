/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  k.b0.x.b.x0.e.b.s
 *  k.s.i
 *  k.s.l
 *  k.s.v
 *  k.s.w
 *  k.x.b.a
 *  k.x.b.l
 *  kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
 */
package k.b0.x.b.x0.e.a.r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b0.x.b.x0.e.a.r0.d;
import k.b0.x.b.x0.e.a.r0.j;
import k.b0.x.b.x0.e.a.r0.t;
import k.b0.x.b.x0.e.b.s;
import k.i;
import k.s.u;
import k.s.v;
import k.s.w;
import k.x.b.l;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public final class q {
    public final Map<String, j> a = new LinkedHashMap();

    public final class k.b0.x.b.x0.e.a.r0.q$a {
        public final String a;

        public k.b0.x.b.x0.e.a.r0.q$a(String string) {
            k.x.c.i.e(q.this, "this$0");
            k.x.c.i.e(string, "className");
            this.a = string;
        }

        public final void a(String string, l<? super a, k.q> l2) {
            k.x.c.i.e(string, "name");
            k.x.c.i.e(l2, "block");
            Map<String, j> map = q.this.a;
            a a2 = new a(string);
            l2.invoke((Object)a2);
            String string2 = a2.a.this.a;
            String string3 = a2.a;
            List<i<String, t>> list = a2.b;
            ArrayList arrayList = new ArrayList(e.s.a.a.U(list, (int)10));
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)((String)((i)iterator.next()).k));
            }
            String string4 = (String)a2.c.k;
            k.x.c.i.e(string3, "name");
            k.x.c.i.e((Object)arrayList, "parameters");
            k.x.c.i.e(string4, "ret");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append('(');
            stringBuilder.append(k.s.i.A((Iterable)arrayList, (CharSequence)"", null, null, (int)0, null, (l)s.k, (int)30));
            stringBuilder.append(')');
            if (string4.length() > 1) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append('L');
                stringBuilder2.append(string4);
                stringBuilder2.append(';');
                string4 = stringBuilder2.toString();
            }
            stringBuilder.append(string4);
            String string5 = stringBuilder.toString();
            k.x.c.i.e(string2, "internalName");
            k.x.c.i.e(string5, "jvmDescriptor");
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string2);
            stringBuilder3.append('.');
            stringBuilder3.append(string5);
            String string6 = stringBuilder3.toString();
            t t2 = (t)a2.c.l;
            List<i<String, t>> list2 = a2.b;
            ArrayList arrayList2 = new ArrayList(e.s.a.a.U(list2, (int)10));
            Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                arrayList2.add((Object)((t)((i)iterator2.next()).l));
            }
            map.put((Object)string6, (Object)new j(t2, (List<t>)arrayList2));
        }

        public final class a {
            public final String a;
            public final List<i<String, t>> b;
            public i<String, t> c;

            public a(String string) {
                k.x.c.i.e(a.this, "this$0");
                k.x.c.i.e(string, "functionName");
                this.a = string;
                this.b = new ArrayList();
                this.c = new i<String, Object>("V", null);
            }

            public final /* varargs */ void a(String string, d ... arrd) {
                t t2;
                k.x.c.i.e(string, "type");
                k.x.c.i.e(arrd, "qualifiers");
                List<i<String, t>> list = this.b;
                boolean bl = arrd.length == 0;
                if (bl) {
                    t2 = null;
                } else {
                    w w2;
                    k.x.c.i.e(arrd, "<this>");
                    v v2 = new v((k.x.b.a)new k.s.l((Object[])arrd));
                    int n2 = e.s.a.a.R2((int)e.s.a.a.U((Iterable)v2, (int)10));
                    if (n2 < 16) {
                        n2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(n2);
                    Iterator iterator = v2.iterator();
                    while ((w2 = (w)iterator).hasNext()) {
                        u u2 = (u)w2.next();
                        linkedHashMap.put((Object)u2.a, (Object)((d)u2.b));
                    }
                    t2 = new t((Map<Integer, d>)linkedHashMap);
                }
                list.add(new i<String, Object>(string, t2));
            }

            public final /* varargs */ void b(String string, d ... arrd) {
                w w2;
                k.x.c.i.e(string, "type");
                k.x.c.i.e(arrd, "qualifiers");
                k.x.c.i.e(arrd, "<this>");
                v v2 = new v((k.x.b.a)new k.s.l((Object[])arrd));
                int n2 = e.s.a.a.R2((int)e.s.a.a.U((Iterable)v2, (int)10));
                if (n2 < 16) {
                    n2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(n2);
                Iterator iterator = v2.iterator();
                while ((w2 = (w)iterator).hasNext()) {
                    u u2 = (u)w2.next();
                    linkedHashMap.put((Object)u2.a, (Object)((d)u2.b));
                }
                this.c = new i<String, t>(string, new t((Map<Integer, d>)linkedHashMap));
            }

            public final void c(JvmPrimitiveType jvmPrimitiveType) {
                k.x.c.i.e((Object)jvmPrimitiveType, "type");
                String string = jvmPrimitiveType.getDesc();
                k.x.c.i.d(string, "type.desc");
                this.c = new i<String, Object>(string, null);
            }
        }

    }

}

