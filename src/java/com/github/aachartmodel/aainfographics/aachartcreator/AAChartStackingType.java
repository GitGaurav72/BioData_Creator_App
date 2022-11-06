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

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "False", "Normal", "Percent", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAChartStackingType
extends Enum<AAChartStackingType> {
    private static final /* synthetic */ AAChartStackingType[] $VALUES;
    public static final /* enum */ AAChartStackingType False;
    public static final /* enum */ AAChartStackingType Normal;
    public static final /* enum */ AAChartStackingType Percent;
    private final String value;

    public static {
        AAChartStackingType aAChartStackingType;
        AAChartStackingType aAChartStackingType2;
        AAChartStackingType aAChartStackingType3;
        AAChartStackingType[] arraAChartStackingType = new AAChartStackingType[3];
        False = aAChartStackingType3 = new AAChartStackingType("");
        arraAChartStackingType[0] = aAChartStackingType3;
        Normal = aAChartStackingType = new AAChartStackingType("normal");
        arraAChartStackingType[1] = aAChartStackingType;
        Percent = aAChartStackingType2 = new AAChartStackingType("percent");
        arraAChartStackingType[2] = aAChartStackingType2;
        $VALUES = arraAChartStackingType;
    }

    private AAChartStackingType(String string3) {
        this.value = string3;
    }

    public static AAChartStackingType valueOf(String string2) {
        return (AAChartStackingType)Enum.valueOf(AAChartStackingType.class, (String)string2);
    }

    public static AAChartStackingType[] values() {
        return (AAChartStackingType[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

