/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAShadow;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bA\u0010BJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b(\u0010\u0014J\u0017\u0010)\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b)\u0010\u0014J\u0017\u0010*\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b*\u0010\bJ\u0017\u0010+\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\b+\u0010!J\u001b\u0010,\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u00a2\u0006\u0004\b,\u0010\u000eJ\u0017\u0010.\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010-\u00a2\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b0\u0010\u000bJ\u0017\u00102\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u000101\u00a2\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b4\u0010\bJ\u0017\u00105\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b5\u0010\bJ\u0017\u00106\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b6\u0010\bR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u00107R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u00108R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u00109R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u00109R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010:R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u00108R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u0010;R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u0010;R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u00108R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010;R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0004\u00109R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010<R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u00108R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010=R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010>R\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b4\u0010;R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u0010?R\u0018\u0010(\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u00108R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010@R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010<R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u00109R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u00108R\u0018\u0010+\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010>R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010@R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010;R\u0018\u00100\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u00109R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010<R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0016\u0010<R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u00108\u00a8\u0006C"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "prop", "type", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "", "allowPointSelect", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "", "name", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "", "data", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "", "lineWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "borderWidth", "color", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "fillColor", "fillOpacity", "threshold", "negativeColor", "negativeFillColor", "size", "innerSize", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "dashStyle", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "", "yAxis", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "marker", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "step", "states", "colorByPoint", "zIndex", "zones", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "shadow", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "stack", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "tooltip", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "showInLegend", "enableMouseTracking", "reversed", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "Ljava/lang/Object;", "Ljava/lang/String;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "Ljava/lang/Boolean;", "Ljava/lang/Float;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "Ljava/lang/Integer;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "[Ljava/lang/Object;", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AASeriesElement {
    private Boolean allowPointSelect;
    private Float borderWidth;
    private Object color;
    private Boolean colorByPoint;
    private String dashStyle;
    private Object[] data;
    private AADataLabels dataLabels;
    private Boolean enableMouseTracking;
    private Object fillColor;
    private Float fillOpacity;
    private Object innerSize;
    private Float lineWidth;
    private AAMarker marker;
    private String name;
    private String negativeColor;
    private Object negativeFillColor;
    private Boolean reversed;
    private AAShadow shadow;
    private Boolean showInLegend;
    private Object size;
    private String stack;
    private Object states;
    private Object step;
    private Float threshold;
    private AATooltip tooltip;
    private String type;
    private Integer yAxis;
    private Integer zIndex;
    private Object[] zones;

    public final AASeriesElement allowPointSelect(Boolean bl) {
        this.allowPointSelect = bl;
        return this;
    }

    public final AASeriesElement borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AASeriesElement color(Object object) {
        this.color = object;
        return this;
    }

    public final AASeriesElement colorByPoint(Boolean bl) {
        this.colorByPoint = bl;
        return this;
    }

    public final AASeriesElement dashStyle(AAChartLineDashStyleType aAChartLineDashStyleType) {
        String string2 = aAChartLineDashStyleType != null ? aAChartLineDashStyleType.getValue() : null;
        this.dashStyle = string2;
        return this;
    }

    public final AASeriesElement data(Object[] arrobject) {
        i.e((Object)arrobject, (String)"prop");
        this.data = arrobject;
        return this;
    }

    public final AASeriesElement dataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AASeriesElement enableMouseTracking(Boolean bl) {
        this.enableMouseTracking = bl;
        return this;
    }

    public final AASeriesElement fillColor(Object object) {
        this.fillColor = object;
        return this;
    }

    public final AASeriesElement fillOpacity(Float f) {
        this.fillOpacity = f;
        return this;
    }

    public final AASeriesElement innerSize(Object object) {
        this.innerSize = object;
        return this;
    }

    public final AASeriesElement lineWidth(Float f) {
        this.lineWidth = f;
        return this;
    }

    public final AASeriesElement marker(AAMarker aAMarker) {
        this.marker = aAMarker;
        return this;
    }

    public final AASeriesElement name(String string2) {
        this.name = string2;
        return this;
    }

    public final AASeriesElement negativeColor(String string2) {
        this.negativeColor = string2;
        return this;
    }

    public final AASeriesElement negativeFillColor(Object object) {
        this.negativeFillColor = object;
        return this;
    }

    public final AASeriesElement reversed(Boolean bl) {
        this.reversed = bl;
        return this;
    }

    public final AASeriesElement shadow(AAShadow aAShadow) {
        this.shadow = aAShadow;
        return this;
    }

    public final AASeriesElement showInLegend(Boolean bl) {
        this.showInLegend = bl;
        return this;
    }

    public final AASeriesElement size(Object object) {
        this.size = object;
        return this;
    }

    public final AASeriesElement stack(String string2) {
        this.stack = string2;
        return this;
    }

    public final AASeriesElement states(Object object) {
        this.states = object;
        return this;
    }

    public final AASeriesElement step(Object object) {
        this.step = object;
        return this;
    }

    public final AASeriesElement threshold(Float f) {
        this.threshold = f;
        return this;
    }

    public final AASeriesElement tooltip(AATooltip aATooltip) {
        this.tooltip = aATooltip;
        return this;
    }

    public final AASeriesElement type(AAChartType aAChartType) {
        String string2 = aAChartType != null ? aAChartType.getValue() : null;
        this.type = string2;
        return this;
    }

    public final AASeriesElement yAxis(Integer n) {
        this.yAxis = n;
        return this;
    }

    public final AASeriesElement zIndex(Integer n) {
        this.zIndex = n;
        return this;
    }

    public final AASeriesElement zones(Object[] arrobject) {
        i.e((Object)arrobject, (String)"prop");
        this.zones = arrobject;
        return this;
    }
}

