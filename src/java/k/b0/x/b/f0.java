/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.lang.reflect.WildcardType
 *  java.util.List
 *  k.b0.x.b.k0
 *  k.x.b.a
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import k.b0.x.b.h0;
import k.b0.x.b.k0;
import k.e;
import k.x.b.a;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class f0
extends k
implements a<Type> {
    public final /* synthetic */ h0 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ e<List<Type>> m;

    public f0(h0 h02, int n2, e<? extends List<? extends Type>> e2) {
        this.k = h02;
        this.l = n2;
        this.m = e2;
        super(0);
    }

    public Object invoke() {
        block10 : {
            Class class_;
            block7 : {
                Type type;
                block8 : {
                    block9 : {
                        block6 : {
                            type = this.k.q();
                            if (!(type instanceof Class)) break block6;
                            Class class_2 = (Class)type;
                            class_ = class_2.isArray() ? class_2.getComponentType() : Object.class;
                            break block7;
                        }
                        if (!(type instanceof GenericArrayType)) break block8;
                        if (this.l != 0) break block9;
                        class_ = ((GenericArrayType)type).getGenericComponentType();
                        break block7;
                    }
                    throw new k0(i.k("Array type has been queried for a non-0th argument: ", this.k));
                }
                if (!(type instanceof ParameterizedType)) break block10;
                class_ = (Type)this.m.getValue().get(this.l);
                if (class_ instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType)class_;
                    Object[] arrobject = wildcardType.getLowerBounds();
                    i.d(arrobject, "argument.lowerBounds");
                    Type type2 = (Type)e.s.a.a.Y0((Object[])arrobject);
                    if (type2 == null) {
                        Object[] arrobject2 = wildcardType.getUpperBounds();
                        i.d(arrobject2, "argument.upperBounds");
                        class_ = (Type)e.s.a.a.X0((Object[])arrobject2);
                    } else {
                        class_ = type2;
                    }
                }
            }
            i.d((Object)class_, "{\n                      \u2026                        }");
            return class_;
        }
        throw new k0(i.k("Non-generic type has been queried for arguments: ", this.k));
    }
}

