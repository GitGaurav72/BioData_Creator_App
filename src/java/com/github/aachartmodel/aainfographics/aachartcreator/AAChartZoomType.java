/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aachartcreator;

import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "None", "X", "Y", "XY", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAChartZoomType
extends Enum<AAChartZoomType> {
    private static final /* synthetic */ AAChartZoomType[] $VALUES;
    public static final /* enum */ AAChartZoomType None;
    public static final /* enum */ AAChartZoomType X;
    public static final /* enum */ AAChartZoomType XY;
    public static final /* enum */ AAChartZoomType Y;
    private final String value;

    public static {
        AAChartZoomType aAChartZoomType;
        AAChartZoomType aAChartZoomType2;
        AAChartZoomType aAChartZoomType3;
        AAChartZoomType aAChartZoomType4;
        AAChartZoomType[] arraAChartZoomType = new AAChartZoomType[4];
        None = aAChartZoomType4 = new AAChartZoomType("none");
        arraAChartZoomType[0] = aAChartZoomType4;
        X = aAChartZoomType = new AAChartZoomType("x");
        arraAChartZoomType[1] = aAChartZoomType;
        Y = aAChartZoomType2 = new AAChartZoomType("y");
        arraAChartZoomType[2] = aAChartZoomType2;
        XY = aAChartZoomType3 = new AAChartZoomType("xy");
        arraAChartZoomType[3] = aAChartZoomType3;
        $VALUES = arraAChartZoomType;
    }

    private AAChartZoomType(String string3) {
        this.value = string3;
    }

    public static AAChartZoomType valueOf(String string2) {
        return (AAChartZoomType)Enum.valueOf(AAChartZoomType.class, (String)string2);
    }

    public static AAChartZoomType[] values() {
        return (AAChartZoomType[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

