/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Set
 *  k.s.i
 *  k.x.b.a
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b.w0;

import e.e.a.a.a;
import java.util.Map;
import java.util.Set;
import k.b0.x.b.w0.d;
import k.x.b.l;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "T", "", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class e
extends k
implements k.x.b.a<String> {
    public final /* synthetic */ Class<T> k;
    public final /* synthetic */ Map<String, Object> l;

    public e(Class<T> class_, Map<String, ? extends Object> map) {
        this.k = class_;
        this.l = map;
        super(0);
    }

    public Object invoke() {
        Class<T> class_ = this.k;
        Map<String, Object> map = this.l;
        StringBuilder stringBuilder = a.s((char)'@');
        stringBuilder.append(class_.getCanonicalName());
        k.s.i.y((Iterable)map.entrySet(), (Appendable)stringBuilder, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", (int)0, null, (l)d.k, (int)48);
        String string = stringBuilder.toString();
        i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

