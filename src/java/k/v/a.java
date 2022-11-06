/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  k.z.b
 *  kotlin.Metadata
 */
package k.v;

import java.lang.reflect.Method;
import k.x.c.i;
import k.z.b;
import k.z.c;
import kotlin.Metadata;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\u0013"}, d2={"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "getSuppressed", "", "ReflectThrowable", "kotlin-stdlib"}, k=1, mv={1, 6, 0}, xi=48)
public class a {
    public void a(Throwable throwable, Throwable throwable2) {
        i.e((Object)throwable, "cause");
        i.e((Object)throwable2, "exception");
        Method method = a.a;
        if (method == null) {
            return;
        }
        method.invoke((Object)throwable, new Object[]{throwable2});
    }

    public c b() {
        return new b();
    }

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2={"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k=1, mv={1, 6, 0}, xi=48)
    public static final class a {
        public static final Method a;

        public static {
            int n2;
            Method method;
            Method[] arrmethod;
            block4 : {
                int n3;
                Method method2;
                arrmethod = Throwable.class.getMethods();
                i.d(arrmethod, "throwableMethods");
                int n4 = arrmethod.length;
                n2 = 0;
                int n5 = 0;
                do {
                    method = null;
                    if (n5 >= n4) break block4;
                    method2 = arrmethod[n5];
                    ++n5;
                    boolean bl = i.a(method2.getName(), "addSuppressed");
                    n3 = 1;
                    if (bl) {
                        Class[] arrclass = method2.getParameterTypes();
                        i.d(arrclass, "it.parameterTypes");
                        i.e(arrclass, "<this>");
                        int n6 = arrclass.length;
                        Class class_ = null;
                        if (n6 == n3) {
                            class_ = arrclass[0];
                        }
                        if (i.a(class_, Throwable.class)) continue;
                    }
                    n3 = 0;
                } while (n3 == 0);
                method = method2;
            }
            a = method;
            int n7 = arrmethod.length;
            while (n2 < n7) {
                Method method3 = arrmethod[n2];
                ++n2;
                if (!i.a(method3.getName(), "getSuppressed")) continue;
            }
        }
    }

}

