/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  k.a0.b
 *  k.a0.d
 *  k.d0.g
 *  k.s.i
 *  k.x.b.p
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.d0;

import java.util.List;
import k.a0.b;
import k.a0.d;
import k.d0.g;
import k.x.b.p;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class i
extends k
implements p<CharSequence, Integer, k.i<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ List<String> k;
    public final /* synthetic */ boolean l;

    public i(List<String> list, boolean bl) {
        this.k = list;
        this.l = bl;
        super(2);
    }

    public Object invoke(Object object, Object object2) {
        k.i<Integer, String> i2;
        block14 : {
            block15 : {
                boolean bl;
                List<String> list;
                int n2;
                CharSequence charSequence;
                block17 : {
                    charSequence = (CharSequence)object;
                    n2 = ((Number)object2).intValue();
                    k.x.c.i.e((Object)charSequence, "$this$$receiver");
                    list = this.k;
                    bl = this.l;
                    if (bl || list.size() != 1) break block17;
                    String string = (String)k.s.i.S(list);
                    int n3 = g.l((CharSequence)charSequence, (String)string, (int)n2, (boolean)false, (int)4);
                    if (n3 < 0) break block15;
                    i2 = new k.i<Integer, String>(n3, string);
                    break block14;
                }
                if (n2 < 0) {
                    n2 = 0;
                }
                d d2 = new d(n2, charSequence.length());
                if (charSequence instanceof String) {
                    int n4 = d2.l;
                    int n5 = d2.m;
                    if (n5 > 0 && n2 <= n4 || n5 < 0 && n4 <= n2) {
                        do {
                            int n6;
                            Object object32;
                            block13 : {
                                n6 = n2 + n5;
                                for (Object object32 : list) {
                                    int n7;
                                    String string;
                                    String string2 = (String)object32;
                                    if (!g.r((String)string2, (int)0, (String)(string = (String)charSequence), (int)n2, (int)(n7 = string2.length()), (boolean)bl)) continue;
                                    break block13;
                                }
                                object32 = null;
                            }
                            String string = (String)object32;
                            if (string != null) {
                                i2 = new k.i<Integer, String>(n2, string);
                                break block14;
                            }
                            if (n2 != n4) {
                                n2 = n6;
                                continue;
                            }
                            break;
                        } while (true);
                    }
                } else {
                    int n8 = d2.l;
                    int n9 = d2.m;
                    if (n9 > 0 && n2 <= n8 || n9 < 0 && n8 <= n2) {
                        int n10 = n2;
                        do {
                            Object object42;
                            int n11;
                            block16 : {
                                n11 = n10 + n9;
                                for (Object object42 : list) {
                                    int n12;
                                    String string = (String)object42;
                                    if (!g.s((CharSequence)string, (int)0, (CharSequence)charSequence, (int)n10, (int)(n12 = string.length()), (boolean)bl)) continue;
                                    break block16;
                                }
                                object42 = null;
                            }
                            String string = (String)object42;
                            if (string != null) {
                                i2 = new k.i<Integer, String>(n10, string);
                                break block14;
                            }
                            if (n10 == n8) break;
                            n10 = n11;
                        } while (true);
                    }
                }
            }
            i2 = null;
        }
        if (i2 == null) {
            return null;
        }
        return new k.i(i2.k, ((String)i2.l).length());
    }
}

