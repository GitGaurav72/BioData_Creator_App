/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabel;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0013\u00a8\u0006\u001a"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "", "prop", "color", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "dashStyle", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "", "width", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "value", "", "zIndex", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "label", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "Ljava/lang/Object;", "Ljava/lang/Float;", "Ljava/lang/Integer;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "", "Ljava/lang/String;", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAPlotLinesElement {
    private Object color;
    private String dashStyle;
    private AALabel label;
    private Float value;
    private Float width;
    private Integer zIndex;

    public final AAPlotLinesElement color(Object object) {
        i.e((Object)object, (String)"prop");
        this.color = object;
        return this;
    }

    public final AAPlotLinesElement dashStyle(AAChartLineDashStyleType aAChartLineDashStyleType) {
        i.e((Object)aAChartLineDashStyleType, (String)"prop");
        this.dashStyle = aAChartLineDashStyleType.getValue();
        return this;
    }

    public final AAPlotLinesElement label(AALabel aALabel) {
        i.e((Object)aALabel, (String)"prop");
        this.label = aALabel;
        return this;
    }

    public final AAPlotLinesElement value(Float f) {
        this.value = f;
        return this;
    }

    public final AAPlotLinesElement width(Float f) {
        this.width = f;
        return this;
    }

    public final AAPlotLinesElement zIndex(Integer n) {
        this.zIndex = n;
        return this;
    }
}

