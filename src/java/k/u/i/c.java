/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.s.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k.u.j.a.c
 *  k.x.b.p
 *  kotlin.Metadata
 */
package k.u.i;

import e.s.a.a;
import k.u.d;
import k.u.f;
import k.x.b.p;
import k.x.c.a0;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t\u00b8\u0006\u0000"}, d2={"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k=1, mv={1, 6, 0}, xi=48)
public final class c
extends k.u.j.a.c {
    public int k;
    public final /* synthetic */ d l;
    public final /* synthetic */ f m;
    public final /* synthetic */ p n;
    public final /* synthetic */ Object o;

    public c(d d2, f f2, p p2, Object object) {
        this.l = d2;
        this.m = f2;
        this.n = p2;
        this.o = object;
        super(d2, f2);
    }

    public Object invokeSuspend(Object object) {
        int n2 = this.k;
        if (n2 != 0) {
            if (n2 == 1) {
                this.k = 2;
                a.e4((Object)object);
                return object;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.k = 1;
        a.e4((Object)object);
        p p2 = this.n;
        a0.b((Object)p2, 2);
        return p2.invoke(this.o, (Object)this);
    }
}

