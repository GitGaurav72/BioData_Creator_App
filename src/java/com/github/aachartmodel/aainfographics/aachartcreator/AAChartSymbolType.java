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

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Circle", "Square", "Diamond", "Triangle", "TriangleDown", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAChartSymbolType
extends Enum<AAChartSymbolType> {
    private static final /* synthetic */ AAChartSymbolType[] $VALUES;
    public static final /* enum */ AAChartSymbolType Circle;
    public static final /* enum */ AAChartSymbolType Diamond;
    public static final /* enum */ AAChartSymbolType Square;
    public static final /* enum */ AAChartSymbolType Triangle;
    public static final /* enum */ AAChartSymbolType TriangleDown;
    private final String value;

    public static {
        AAChartSymbolType aAChartSymbolType;
        AAChartSymbolType aAChartSymbolType2;
        AAChartSymbolType aAChartSymbolType3;
        AAChartSymbolType aAChartSymbolType4;
        AAChartSymbolType aAChartSymbolType5;
        AAChartSymbolType[] arraAChartSymbolType = new AAChartSymbolType[5];
        Circle = aAChartSymbolType5 = new AAChartSymbolType("circle");
        arraAChartSymbolType[0] = aAChartSymbolType5;
        Square = aAChartSymbolType3 = new AAChartSymbolType("square");
        arraAChartSymbolType[1] = aAChartSymbolType3;
        Diamond = aAChartSymbolType = new AAChartSymbolType("diamond");
        arraAChartSymbolType[2] = aAChartSymbolType;
        Triangle = aAChartSymbolType4 = new AAChartSymbolType("triangle");
        arraAChartSymbolType[3] = aAChartSymbolType4;
        TriangleDown = aAChartSymbolType2 = new AAChartSymbolType("triangle-down");
        arraAChartSymbolType[4] = aAChartSymbolType2;
        $VALUES = arraAChartSymbolType;
    }

    private AAChartSymbolType(String string3) {
        this.value = string3;
    }

    public static AAChartSymbolType valueOf(String string2) {
        return (AAChartSymbolType)Enum.valueOf(AAChartSymbolType.class, (String)string2);
    }

    public static AAChartSymbolType[] values() {
        return (AAChartSymbolType[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

