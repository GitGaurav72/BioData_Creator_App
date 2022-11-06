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

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b\u00a8\u0006\u001c"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Column", "Bar", "Area", "Areaspline", "Line", "Spline", "Scatter", "Pie", "Bubble", "Pyramid", "Funnel", "Columnrange", "Arearange", "Areasplinerange", "Boxplot", "Waterfall", "Polygon", "Gauge", "Errorbar", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAChartType
extends Enum<AAChartType> {
    private static final /* synthetic */ AAChartType[] $VALUES;
    public static final /* enum */ AAChartType Area;
    public static final /* enum */ AAChartType Arearange;
    public static final /* enum */ AAChartType Areaspline;
    public static final /* enum */ AAChartType Areasplinerange;
    public static final /* enum */ AAChartType Bar;
    public static final /* enum */ AAChartType Boxplot;
    public static final /* enum */ AAChartType Bubble;
    public static final /* enum */ AAChartType Column;
    public static final /* enum */ AAChartType Columnrange;
    public static final /* enum */ AAChartType Errorbar;
    public static final /* enum */ AAChartType Funnel;
    public static final /* enum */ AAChartType Gauge;
    public static final /* enum */ AAChartType Line;
    public static final /* enum */ AAChartType Pie;
    public static final /* enum */ AAChartType Polygon;
    public static final /* enum */ AAChartType Pyramid;
    public static final /* enum */ AAChartType Scatter;
    public static final /* enum */ AAChartType Spline;
    public static final /* enum */ AAChartType Waterfall;
    private final String value;

    public static {
        AAChartType aAChartType;
        AAChartType aAChartType2;
        AAChartType aAChartType3;
        AAChartType aAChartType4;
        AAChartType aAChartType5;
        AAChartType aAChartType6;
        AAChartType aAChartType7;
        AAChartType aAChartType8;
        AAChartType aAChartType9;
        AAChartType aAChartType10;
        AAChartType aAChartType11;
        AAChartType aAChartType12;
        AAChartType aAChartType13;
        AAChartType aAChartType14;
        AAChartType aAChartType15;
        AAChartType aAChartType16;
        AAChartType aAChartType17;
        AAChartType aAChartType18;
        AAChartType aAChartType19;
        AAChartType[] arraAChartType = new AAChartType[19];
        Column = aAChartType19 = new AAChartType("column");
        arraAChartType[0] = aAChartType19;
        Bar = aAChartType14 = new AAChartType("bar");
        arraAChartType[1] = aAChartType14;
        Area = aAChartType = new AAChartType("area");
        arraAChartType[2] = aAChartType;
        Areaspline = aAChartType17 = new AAChartType("areaspline");
        arraAChartType[3] = aAChartType17;
        Line = aAChartType13 = new AAChartType("line");
        arraAChartType[4] = aAChartType13;
        Spline = aAChartType8 = new AAChartType("spline");
        arraAChartType[5] = aAChartType8;
        Scatter = aAChartType12 = new AAChartType("scatter");
        arraAChartType[6] = aAChartType12;
        Pie = aAChartType15 = new AAChartType("pie");
        arraAChartType[7] = aAChartType15;
        Bubble = aAChartType6 = new AAChartType("bubble");
        arraAChartType[8] = aAChartType6;
        Pyramid = aAChartType16 = new AAChartType("pyramid");
        arraAChartType[9] = aAChartType16;
        Funnel = aAChartType4 = new AAChartType("funnel");
        arraAChartType[10] = aAChartType4;
        Columnrange = aAChartType7 = new AAChartType("columnrange");
        arraAChartType[11] = aAChartType7;
        Arearange = aAChartType9 = new AAChartType("arearange");
        arraAChartType[12] = aAChartType9;
        Areasplinerange = aAChartType11 = new AAChartType("areasplinerange");
        arraAChartType[13] = aAChartType11;
        Boxplot = aAChartType18 = new AAChartType("boxplot");
        arraAChartType[14] = aAChartType18;
        Waterfall = aAChartType2 = new AAChartType("waterfall");
        arraAChartType[15] = aAChartType2;
        Polygon = aAChartType10 = new AAChartType("polygon");
        arraAChartType[16] = aAChartType10;
        Gauge = aAChartType5 = new AAChartType("gauge");
        arraAChartType[17] = aAChartType5;
        Errorbar = aAChartType3 = new AAChartType("errorbar");
        arraAChartType[18] = aAChartType3;
        $VALUES = arraAChartType;
    }

    private AAChartType(String string3) {
        this.value = string3;
    }

    public static AAChartType valueOf(String string2) {
        return (AAChartType)Enum.valueOf(AAChartType.class, (String)string2);
    }

    public static AAChartType[] values() {
        return (AAChartType[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

