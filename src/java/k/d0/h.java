/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  k.d0.g
 *  k.x.b.p
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.d0;

import k.d0.g;
import k.i;
import k.x.b.p;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class h
extends k
implements p<CharSequence, Integer, i<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ char[] k;
    public final /* synthetic */ boolean l;

    public h(char[] arrc, boolean bl) {
        this.k = arrc;
        this.l = bl;
        super(2);
    }

    public Object invoke(Object object, Object object2) {
        CharSequence charSequence = (CharSequence)object;
        int n2 = ((Number)object2).intValue();
        k.x.c.i.e((Object)charSequence, "$this$$receiver");
        int n3 = g.m((CharSequence)charSequence, (char[])this.k, (int)n2, (boolean)this.l);
        if (n3 < 0) {
            return null;
        }
        return new i<Integer, Integer>(n3, 1);
    }
}

