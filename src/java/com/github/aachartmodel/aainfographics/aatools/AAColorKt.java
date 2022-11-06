/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aatools;

import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"", "red", "green", "blue", "", "alpha", "", "AARgba", "(IIIF)Ljava/lang/String;", "charts_release"}, k=2, mv={1, 4, 0})
public final class AAColorKt {
    public static final String AARgba(int n, int n2, int n3, float f) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rgba(");
        stringBuilder.append(n);
        stringBuilder.append(',');
        stringBuilder.append(n2);
        stringBuilder.append(',');
        stringBuilder.append(n3);
        stringBuilder.append(',');
        stringBuilder.append(f);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static /* synthetic */ String AARgba$default(int n, int n2, int n3, float f, int n4, Object object) {
        if ((n4 & 8) != 0) {
            f = 1.0f;
        }
        return AAColorKt.AARgba(n, n2, n3, f);
    }
}

