/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Member
 *  k.b0.k
 *  k.b0.x.b.a0$a
 *  k.b0.x.b.e0$b
 *  k.b0.x.b.n0
 *  k.b0.x.b.o
 *  k.b0.x.b.x0.c.n0
 *  k.x.b.a
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b;

import java.lang.reflect.Member;
import k.b0.k;
import k.b0.l;
import k.b0.x.b.a0;
import k.b0.x.b.e0;
import k.b0.x.b.o;
import k.b0.x.b.x0.c.n0;
import k.e;
import k.f;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0015\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u001cR4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0013*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00120\u00120\u0011X\u0088\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006 "}, d2={"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "V", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "kotlin.jvm.PlatformType", "delegateSource", "Lkotlin/Lazy;", "Ljava/lang/reflect/Member;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "get", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflection"}, k=1, mv={1, 6, 0}, xi=48)
public class a0<T, V>
extends e0<V>
implements l<T, V> {
    public final k.b0.x.b.n0<a<T, V>> v;
    public final e<Member> w;

    public a0(o o2, String string, String string2, Object object) {
        i.e((Object)o2, "container");
        i.e(string, "name");
        i.e(string2, "signature");
        i.e((Object)o2, "container");
        i.e(string, "name");
        i.e(string2, "signature");
        super(o2, string, string2, null, object);
        k.b0.x.b.n0 n02 = e.s.a.a.K2((k.x.b.a)new k.x.b.a<a<T, ? extends V>>(this){
            public final /* synthetic */ a0<T, V> k;
            {
                this.k = a02;
                super(0);
            }

            public Object invoke() {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
        });
        i.d((Object)n02, "lazy { Getter(this) }");
        this.v = n02;
        this.w = e.s.a.a.I2((f)f.l, (k.x.b.a)new k.x.b.a<Member>(this){
            public final /* synthetic */ a0<T, V> k;
            {
                this.k = a02;
                super(0);
            }

            public Object invoke() {
                return this.k.y();
            }
        });
    }

    public a0(o o2, n0 n02) {
        i.e((Object)o2, "container");
        i.e((Object)n02, "descriptor");
        super(o2, n02);
        k.b0.x.b.n0 n03 = e.s.a.a.K2((k.x.b.a)new /* invalid duplicate definition of identical inner class */);
        i.d((Object)n03, "lazy { Getter(this) }");
        this.v = n03;
        this.w = e.s.a.a.I2((f)f.l, (k.x.b.a)new /* invalid duplicate definition of identical inner class */);
    }

    public a<T, V> C() {
        Object object = this.v.invoke();
        i.d(object, "_getter()");
        return object;
    }

    @Override
    public V get(T t2) {
        return (V)this.C().call(new Object[]{t2});
    }

    public V invoke(T t2) {
        return this.get(t2);
    }

}

