/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  k.x.b.a
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b.w0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k.x.b.a;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2={"<anonymous>", "", "T", "", "invoke", "()Ljava/lang/Integer;"}, k=3, mv={1, 6, 0}, xi=48)
public final class b
extends k
implements a<Integer> {
    public final /* synthetic */ Map<String, Object> k;

    public b(Map<String, ? extends Object> map) {
        this.k = map;
        super(0);
    }

    public Object invoke() {
        Iterator iterator = this.k.entrySet().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            String string = (String)entry.getKey();
            Object object = entry.getValue();
            int n3 = object instanceof boolean[] ? Arrays.hashCode((boolean[])((boolean[])object)) : (object instanceof char[] ? Arrays.hashCode((char[])((char[])object)) : (object instanceof byte[] ? Arrays.hashCode((byte[])((byte[])object)) : (object instanceof short[] ? Arrays.hashCode((short[])((short[])object)) : (object instanceof int[] ? Arrays.hashCode((int[])((int[])object)) : (object instanceof float[] ? Arrays.hashCode((float[])((float[])object)) : (object instanceof long[] ? Arrays.hashCode((long[])((long[])object)) : (object instanceof double[] ? Arrays.hashCode((double[])((double[])object)) : (object instanceof Object[] ? Arrays.hashCode((Object[])((Object[])object)) : object.hashCode()))))))));
            n2 += n3 ^ 127 * string.hashCode();
        }
        return n2;
    }
}

