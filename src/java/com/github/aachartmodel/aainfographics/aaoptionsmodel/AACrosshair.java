/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "", "", "prop", "width", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "", "color", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "dashStyle", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "Ljava/lang/Float;", "getWidth", "()Ljava/lang/Float;", "setWidth", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "getDashStyle", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "setDashStyle", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AACrosshair {
    private String color;
    private AAChartLineDashStyleType dashStyle;
    private Float width;

    public final AACrosshair color(String string2) {
        i.e((Object)string2, (String)"prop");
        this.color = string2;
        return this;
    }

    public final AACrosshair dashStyle(AAChartLineDashStyleType aAChartLineDashStyleType) {
        i.e((Object)aAChartLineDashStyleType, (String)"prop");
        this.dashStyle = aAChartLineDashStyleType;
        return this;
    }

    public final String getColor() {
        return this.color;
    }

    public final AAChartLineDashStyleType getDashStyle() {
        return this.dashStyle;
    }

    public final Float getWidth() {
        return this.width;
    }

    public final void setColor(String string2) {
        this.color = string2;
    }

    public final void setDashStyle(AAChartLineDashStyleType aAChartLineDashStyleType) {
        this.dashStyle = aAChartLineDashStyleType;
    }

    public final void setWidth(Float f) {
        this.width = f;
    }

    public final AACrosshair width(Float f) {
        this.width = f;
        return this;
    }
}

