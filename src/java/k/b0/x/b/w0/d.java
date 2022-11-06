/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Map
 *  java.util.Map$Entry
 *  k.x.b.l
 *  k.x.c.k
 *  kotlin.Metadata
 */
package k.b0.x.b.w0;

import java.util.Arrays;
import java.util.Map;
import k.x.b.l;
import k.x.c.i;
import k.x.c.k;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n\u00a2\u0006\u0002\b\u0007"}, d2={"<anonymous>", "", "T", "", "entry", "", "", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
public final class d
extends k
implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final d k = new d();

    public d() {
        super(1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object invoke(Object var1_1) {
        block9 : {
            block8 : {
                block7 : {
                    block6 : {
                        block5 : {
                            block4 : {
                                block3 : {
                                    block2 : {
                                        var2_2 = (Map.Entry)var1_1;
                                        i.e((Object)var2_2, "entry");
                                        var3_3 = (String)var2_2.getKey();
                                        var4_4 = var2_2.getValue();
                                        if (!(var4_4 instanceof boolean[])) break block2;
                                        var5_5 = Arrays.toString((boolean[])((boolean[])var4_4));
                                        ** GOTO lbl39
                                    }
                                    if (!(var4_4 instanceof char[])) break block3;
                                    var5_5 = Arrays.toString((char[])((char[])var4_4));
                                    ** GOTO lbl39
                                }
                                if (!(var4_4 instanceof byte[])) break block4;
                                var5_5 = Arrays.toString((byte[])((byte[])var4_4));
                                ** GOTO lbl39
                            }
                            if (!(var4_4 instanceof short[])) break block5;
                            var5_5 = Arrays.toString((short[])((short[])var4_4));
                            ** GOTO lbl39
                        }
                        if (!(var4_4 instanceof int[])) break block6;
                        var5_5 = Arrays.toString((int[])((int[])var4_4));
                        ** GOTO lbl39
                    }
                    if (!(var4_4 instanceof float[])) break block7;
                    var5_5 = Arrays.toString((float[])((float[])var4_4));
                    ** GOTO lbl39
                }
                if (!(var4_4 instanceof long[])) break block8;
                var5_5 = Arrays.toString((long[])((long[])var4_4));
                ** GOTO lbl39
            }
            if (!(var4_4 instanceof double[])) break block9;
            var5_5 = Arrays.toString((double[])((double[])var4_4));
            ** GOTO lbl39
        }
        if (var4_4 instanceof Object[]) {
            var5_5 = Arrays.toString((Object[])((Object[])var4_4));
lbl39: // 9 sources:
            i.d(var5_5, "toString(this)");
        } else {
            var5_5 = var4_4.toString();
        }
        var6_6 = new StringBuilder();
        var6_6.append(var3_3);
        var6_6.append('=');
        var6_6.append(var5_5);
        return var6_6.toString();
    }
}

