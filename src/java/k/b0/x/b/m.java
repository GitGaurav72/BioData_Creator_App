/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Type
 *  k.b0.x.b.k0
 *  k.b0.x.b.u0
 *  k.b0.x.b.x0.c.e
 *  k.b0.x.b.x0.c.h
 *  k.b0.x.b.x0.m.f0
 *  k.b0.x.b.x0.m.y0
 *  k.x.b.a
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b;

import e.e.a.a.a;
import java.lang.reflect.Type;
import k.b0.x.b.k0;
import k.b0.x.b.l;
import k.b0.x.b.u0;
import k.b0.x.b.x0.c.e;
import k.b0.x.b.x0.c.h;
import k.b0.x.b.x0.m.f0;
import k.b0.x.b.x0.m.y0;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class m
extends k
implements k.x.b.a<Type> {
    public final /* synthetic */ f0 k;
    public final /* synthetic */ l<T> l;
    public final /* synthetic */ l<T> m;

    public m(f0 f02, l<T> l2, l<T> l3) {
        this.k = f02;
        this.l = l2;
        this.m = l3;
        super(0);
    }

    public Object invoke() {
        h h2;
        block2 : {
            block3 : {
                block6 : {
                    Type type;
                    String string;
                    block5 : {
                        Class class_;
                        block4 : {
                            h2 = this.k.T().getDeclarationDescriptor();
                            if (!(h2 instanceof e)) break block2;
                            class_ = u0.j((e)((e)h2));
                            if (class_ == null) break block3;
                            if (!i.a((Object)this.m.o.getSuperclass(), (Object)class_)) break block4;
                            type = this.m.o.getGenericSuperclass();
                            string = "{\n                      \u2026ass\n                    }";
                            break block5;
                        }
                        Object[] arrobject = this.m.o.getInterfaces();
                        i.d(arrobject, "jClass.interfaces");
                        int n2 = e.s.a.a.g2((Object[])arrobject, (Object)class_);
                        if (n2 < 0) break block6;
                        type = this.m.o.getGenericInterfaces()[n2];
                        string = "{\n                      \u2026ex]\n                    }";
                    }
                    i.d((Object)type, string);
                    return type;
                }
                StringBuilder stringBuilder = a.t((String)"No superclass of ");
                stringBuilder.append(this.l);
                stringBuilder.append(" in Java reflection for ");
                stringBuilder.append((Object)h2);
                throw new k0(stringBuilder.toString());
            }
            StringBuilder stringBuilder = a.t((String)"Unsupported superclass of ");
            stringBuilder.append(this.l);
            stringBuilder.append(": ");
            stringBuilder.append((Object)h2);
            throw new k0(stringBuilder.toString());
        }
        throw new k0(i.k("Supertype not a class: ", (Object)h2));
    }
}

