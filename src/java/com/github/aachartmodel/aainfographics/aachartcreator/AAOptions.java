/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALang;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPane;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bU\u0018\u00002\u00020\u0001B\t\u00a2\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020 \u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u00a2\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020(\u00a2\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020+\u00a2\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010.\u00a2\u0006\u0004\b/\u00100R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b!\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b)\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b,\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0010\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b&\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b/\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001e\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0013\n\u0004\b$\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001\u00a8\u0006\u0083\u0001"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "prop", "chart", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "title", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;", "subtitle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "xAxis", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "yAxis", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "", "xAxisArray", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "yAxisArray", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "tooltip", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "plotOptions", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "series", "([Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "legend", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "pane", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "colors", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "credits", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", "defaultOptions", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "", "touchEventEnabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "getTitle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "setTitle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "getXAxis", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "setXAxis", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "getLegend", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "setLegend", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "getChart", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "setChart", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;", "getSubtitle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;", "setSubtitle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "getPlotOptions", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "setPlotOptions", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "getCredits", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "setCredits", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;)V", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "getYAxisArray", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "setYAxisArray", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "getTooltip", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "setTooltip", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", "getDefaultOptions", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", "setDefaultOptions", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "getYAxis", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "setYAxis", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;)V", "[Ljava/lang/Object;", "getColors", "()[Ljava/lang/Object;", "setColors", "([Ljava/lang/Object;)V", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "getXAxisArray", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "setXAxisArray", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;)V", "Ljava/lang/Boolean;", "getTouchEventEnabled", "()Ljava/lang/Boolean;", "setTouchEventEnabled", "(Ljava/lang/Boolean;)V", "[Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "getSeries", "()[Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "setSeries", "([Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "getPane", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "setPane", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAOptions {
    private AAChart chart;
    private Object[] colors;
    private AACredits credits;
    private AALang defaultOptions;
    private AALegend legend;
    private AAPane pane;
    private AAPlotOptions plotOptions;
    private AASeriesElement[] series;
    private AASubtitle subtitle;
    private AATitle title;
    private AATooltip tooltip;
    private Boolean touchEventEnabled;
    private AAXAxis xAxis;
    private AAXAxis[] xAxisArray;
    private AAYAxis yAxis;
    private AAYAxis[] yAxisArray;

    public AAOptions() {
        AACredits aACredits = new AACredits();
        aACredits.setEnabled(Boolean.FALSE);
        this.credits = aACredits;
    }

    public final AAOptions chart(AAChart aAChart) {
        i.e((Object)aAChart, (String)"prop");
        this.chart = aAChart;
        return this;
    }

    public final AAOptions colors(Object[] arrobject) {
        this.colors = arrobject;
        return this;
    }

    public final AAOptions credits(AACredits aACredits) {
        i.e((Object)aACredits, (String)"prop");
        this.credits = aACredits;
        return this;
    }

    public final AAOptions defaultOptions(AALang aALang) {
        i.e((Object)aALang, (String)"prop");
        this.defaultOptions = aALang;
        return this;
    }

    public final AAChart getChart() {
        return this.chart;
    }

    public final Object[] getColors() {
        return this.colors;
    }

    public final AACredits getCredits() {
        return this.credits;
    }

    public final AALang getDefaultOptions() {
        return this.defaultOptions;
    }

    public final AALegend getLegend() {
        return this.legend;
    }

    public final AAPane getPane() {
        return this.pane;
    }

    public final AAPlotOptions getPlotOptions() {
        return this.plotOptions;
    }

    public final AASeriesElement[] getSeries() {
        return this.series;
    }

    public final AASubtitle getSubtitle() {
        return this.subtitle;
    }

    public final AATitle getTitle() {
        return this.title;
    }

    public final AATooltip getTooltip() {
        return this.tooltip;
    }

    public final Boolean getTouchEventEnabled() {
        return this.touchEventEnabled;
    }

    public final AAXAxis getXAxis() {
        return this.xAxis;
    }

    public final AAXAxis[] getXAxisArray() {
        return this.xAxisArray;
    }

    public final AAYAxis getYAxis() {
        return this.yAxis;
    }

    public final AAYAxis[] getYAxisArray() {
        return this.yAxisArray;
    }

    public final AAOptions legend(AALegend aALegend) {
        i.e((Object)aALegend, (String)"prop");
        this.legend = aALegend;
        return this;
    }

    public final AAOptions pane(AAPane aAPane) {
        this.pane = aAPane;
        return this;
    }

    public final AAOptions plotOptions(AAPlotOptions aAPlotOptions) {
        i.e((Object)aAPlotOptions, (String)"prop");
        this.plotOptions = aAPlotOptions;
        return this;
    }

    public final AAOptions series(AASeriesElement[] arraASeriesElement) {
        this.series = arraASeriesElement;
        return this;
    }

    public final void setChart(AAChart aAChart) {
        this.chart = aAChart;
    }

    public final void setColors(Object[] arrobject) {
        this.colors = arrobject;
    }

    public final void setCredits(AACredits aACredits) {
        this.credits = aACredits;
    }

    public final void setDefaultOptions(AALang aALang) {
        this.defaultOptions = aALang;
    }

    public final void setLegend(AALegend aALegend) {
        this.legend = aALegend;
    }

    public final void setPane(AAPane aAPane) {
        this.pane = aAPane;
    }

    public final void setPlotOptions(AAPlotOptions aAPlotOptions) {
        this.plotOptions = aAPlotOptions;
    }

    public final void setSeries(AASeriesElement[] arraASeriesElement) {
        this.series = arraASeriesElement;
    }

    public final void setSubtitle(AASubtitle aASubtitle) {
        this.subtitle = aASubtitle;
    }

    public final void setTitle(AATitle aATitle) {
        this.title = aATitle;
    }

    public final void setTooltip(AATooltip aATooltip) {
        this.tooltip = aATooltip;
    }

    public final void setTouchEventEnabled(Boolean bl) {
        this.touchEventEnabled = bl;
    }

    public final void setXAxis(AAXAxis aAXAxis) {
        this.xAxis = aAXAxis;
    }

    public final void setXAxisArray(AAXAxis[] arraAXAxis) {
        this.xAxisArray = arraAXAxis;
    }

    public final void setYAxis(AAYAxis aAYAxis) {
        this.yAxis = aAYAxis;
    }

    public final void setYAxisArray(AAYAxis[] arraAYAxis) {
        this.yAxisArray = arraAYAxis;
    }

    public final AAOptions subtitle(AASubtitle aASubtitle) {
        i.e((Object)aASubtitle, (String)"prop");
        this.subtitle = aASubtitle;
        return this;
    }

    public final AAOptions title(AATitle aATitle) {
        i.e((Object)aATitle, (String)"prop");
        this.title = aATitle;
        return this;
    }

    public final AAOptions tooltip(AATooltip aATooltip) {
        i.e((Object)aATooltip, (String)"prop");
        this.tooltip = aATooltip;
        return this;
    }

    public final AAOptions touchEventEnabled(Boolean bl) {
        this.touchEventEnabled = bl;
        return this;
    }

    public final AAOptions xAxis(AAXAxis aAXAxis) {
        i.e((Object)aAXAxis, (String)"prop");
        this.xAxis = aAXAxis;
        return this;
    }

    public final AAOptions xAxisArray(AAXAxis[] arraAXAxis) {
        i.e((Object)arraAXAxis, (String)"prop");
        this.xAxisArray = arraAXAxis;
        return this;
    }

    public final AAOptions yAxis(AAYAxis aAYAxis) {
        i.e((Object)aAYAxis, (String)"prop");
        this.yAxis = aAYAxis;
        return this;
    }

    public final AAOptions yAxisArray(AAYAxis[] arraAYAxis) {
        i.e((Object)arraAYAxis, (String)"prop");
        this.yAxisArray = arraAYAxis;
        return this;
    }
}

