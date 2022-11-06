/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  k.b0.k
 *  k.b0.x.b.n0
 *  k.b0.x.b.o
 *  k.x.b.a
 *  kotlin.Metadata
 */
package k.b0.x.b;

import k.b0.k;
import k.b0.x.b.e0;
import k.b0.x.b.o;
import k.b0.x.b.x0.c.n0;
import k.b0.x.b.z;
import k.e;
import k.f;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\r\u0010\u0018\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u001b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0088\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001d"}, d2={"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "kotlin.jvm.PlatformType", "delegateValue", "Lkotlin/Lazy;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflection"}, k=1, mv={1, 6, 0}, xi=48)
public class z<V>
extends e0<V> {
    public final k.b0.x.b.n0<a<V>> v;
    public final e<Object> w;

    public z(o o2, n0 n02) {
        i.e((Object)o2, "container");
        i.e(n02, "descriptor");
        super(o2, n02);
        k.b0.x.b.n0 n03 = e.s.a.a.K2((k.x.b.a)new k.x.b.a<a<? extends V>>(this){
            public final /* synthetic */ z<V> k;
            {
                this.k = z2;
                super(0);
            }

            public Object invoke() {
                return new a<V>(this.k);
            }
        });
        i.d((Object)n03, "lazy { Getter(this) }");
        this.v = n03;
        this.w = e.s.a.a.I2((f)f.l, (k.x.b.a)new k.x.b.a<Object>(this){
            public final /* synthetic */ z<V> k;
            {
                this.k = z2;
                super(0);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final Object invoke() {
                Object object;
                Object object2;
                z<V> z2 = this.k;
                java.lang.reflect.Member member = z2.y();
                java.util.Objects.requireNonNull(z2);
                try {
                    object = e0.o;
                    object2 = z2.x() ? e.s.a.a.S((Object)z2.s, (k.b0.x.b.x0.c.b)z2.z()) : null;
                }
                catch (java.lang.IllegalAccessException illegalAccessException) {
                    throw new k.b0.w.b(illegalAccessException);
                }
                boolean bl = object2 != object;
                if (!bl) {
                    object2 = null;
                }
                z2.x();
                if (member == null) {
                    return null;
                }
                if (member instanceof java.lang.reflect.Field) {
                    return ((java.lang.reflect.Field)member).get(object2);
                }
                if (!(member instanceof java.lang.reflect.Method)) {
                    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                    stringBuilder.append("delegate field/method ");
                    stringBuilder.append((Object)member);
                    stringBuilder.append(" neither field nor method");
                    throw new java.lang.AssertionError((Object)stringBuilder.toString());
                }
                int n2 = ((java.lang.reflect.Method)member).getParameterTypes().length;
                if (n2 == 0) {
                    return ((java.lang.reflect.Method)member).invoke(null, new Object[0]);
                }
                if (n2 != 1) {
                    if (n2 == 2) {
                        java.lang.reflect.Method method = (java.lang.reflect.Method)member;
                        Object[] arrobject = new Object[2];
                        arrobject[0] = object2;
                        java.lang.Class class_ = ((java.lang.reflect.Method)member).getParameterTypes()[1];
                        i.d((Object)class_, "fieldOrMethod.parameterTypes[1]");
                        arrobject[1] = k.b0.x.b.u0.e((java.lang.reflect.Type)class_);
                        return method.invoke(null, arrobject);
                    }
                    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                    stringBuilder.append("delegate method ");
                    stringBuilder.append((Object)member);
                    stringBuilder.append(" should take 0, 1, or 2 parameters");
                    throw new java.lang.AssertionError((Object)stringBuilder.toString());
                }
                java.lang.reflect.Method method = (java.lang.reflect.Method)member;
                Object[] arrobject = new Object[1];
                if (object2 == null) {
                    java.lang.Class class_ = ((java.lang.reflect.Method)member).getParameterTypes()[0];
                    i.d((Object)class_, "fieldOrMethod.parameterTypes[0]");
                    object2 = k.b0.x.b.u0.e((java.lang.reflect.Type)class_);
                }
                arrobject[0] = object2;
                return method.invoke(null, arrobject);
            }
        });
    }

    public a<V> C() {
        Object object = this.v.invoke();
        i.d(object, "_getter()");
        return (a)object;
    }

    public V invoke() {
        return (V)this.C().call(new Object[0]);
    }

    @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2={"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "property", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "(Lkotlin/reflect/jvm/internal/KProperty0Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty0Impl;", "invoke", "()Ljava/lang/Object;", "kotlin-reflection"}, k=1, mv={1, 6, 0}, xi=48)
    public static final class a<R>
    extends e0.b<R> {
        public final z<R> r;

        public a(z<? extends R> z2) {
            i.e(z2, "property");
            this.r = z2;
        }

        public k d() {
            return this.r;
        }

        public R invoke() {
            return (R)this.r.C().call(new Object[0]);
        }

        @Override
        public e0 z() {
            return this.r;
        }
    }

}

