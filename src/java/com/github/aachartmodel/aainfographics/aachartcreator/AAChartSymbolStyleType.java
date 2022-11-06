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

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolStyleType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Normal", "InnerBlank", "BorderBlank", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAChartSymbolStyleType
extends Enum<AAChartSymbolStyleType> {
    private static final /* synthetic */ AAChartSymbolStyleType[] $VALUES;
    public static final /* enum */ AAChartSymbolStyleType BorderBlank;
    public static final /* enum */ AAChartSymbolStyleType InnerBlank;
    public static final /* enum */ AAChartSymbolStyleType Normal;
    private final String value;

    public static {
        AAChartSymbolStyleType aAChartSymbolStyleType;
        AAChartSymbolStyleType aAChartSymbolStyleType2;
        AAChartSymbolStyleType aAChartSymbolStyleType3;
        AAChartSymbolStyleType[] arraAChartSymbolStyleType = new AAChartSymbolStyleType[3];
        Normal = aAChartSymbolStyleType2 = new AAChartSymbolStyleType("normal");
        arraAChartSymbolStyleType[0] = aAChartSymbolStyleType2;
        InnerBlank = aAChartSymbolStyleType = new AAChartSymbolStyleType("innerBlank");
        arraAChartSymbolStyleType[1] = aAChartSymbolStyleType;
        BorderBlank = aAChartSymbolStyleType3 = new AAChartSymbolStyleType("borderBlank");
        arraAChartSymbolStyleType[2] = aAChartSymbolStyleType3;
        $VALUES = arraAChartSymbolStyleType;
    }

    private AAChartSymbolStyleType(String string3) {
        this.value = string3;
    }

    public static AAChartSymbolStyleType valueOf(String string2) {
        return (AAChartSymbolStyleType)Enum.valueOf(AAChartSymbolStyleType.class, (String)string2);
    }

    public static AAChartSymbolStyleType[] values() {
        return (AAChartSymbolStyleType[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

