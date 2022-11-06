/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Object
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.lang.reflect.WildcardType
 *  java.util.List
 *  k.b0.x.b.e
 *  k.b0.x.b.w0.g
 *  k.b0.x.b.x0.c.b
 *  k.b0.x.b.x0.c.v
 *  k.s.i
 *  k.x.b.a
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import k.b0.x.b.e;
import k.b0.x.b.w0.g;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.v;
import k.u.d;
import k.x.b.a;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Ljava/lang/reflect/Type;", "R", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class j
extends k
implements a<Type> {
    public final /* synthetic */ e<R> k;

    public j(e<? extends R> e2) {
        this.k = e2;
        super(0);
    }

    public Object invoke() {
        boolean bl;
        e<R> e2 = this.k;
        b b2 = e2.v();
        v v2 = b2 instanceof v ? (v)b2 : null;
        if (v2 == null) {
            bl = false;
        } else {
            boolean bl2 = v2.isSuspend();
            bl = false;
            if (bl2) {
                bl = true;
            }
        }
        Object object = null;
        if (bl) {
            Object object2 = k.s.i.D((List)e2.l().a());
            ParameterizedType parameterizedType = object2 instanceof ParameterizedType ? (ParameterizedType)object2 : null;
            Type type = parameterizedType == null ? null : parameterizedType.getRawType();
            boolean bl3 = i.a((Object)type, d.class);
            object = null;
            if (bl3) {
                Object[] arrobject;
                Object[] arrobject2 = parameterizedType.getActualTypeArguments();
                i.d(arrobject2, "continuationType.actualTypeArguments");
                Object object3 = e.s.a.a.N3((Object[])arrobject2);
                WildcardType wildcardType = object3 instanceof WildcardType ? (WildcardType)object3 : null;
                object = wildcardType == null ? null : ((arrobject = wildcardType.getLowerBounds()) == null ? null : (Type)e.s.a.a.X0((Object[])arrobject));
            }
        }
        if (object == null) {
            object = this.k.l().getReturnType();
        }
        return object;
    }
}

