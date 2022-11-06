/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions;
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAAnimation;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AABar;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumn;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumnrange;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPie;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASeries;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis;
import com.github.aachartmodel.aainfographics.aatools.AAColor;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptionsConstructor;", "", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "aaChartModel", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "aaPlotOptions", "Lk/q;", "configureAAPlotOptionsMarkerStyle", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;)V", "configureAAPlotOptionsDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "aaOptions", "configureAxisContentAndStyle", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;)V", "configureChartOptions", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAOptionsConstructor {
    public static final AAOptionsConstructor INSTANCE = new AAOptionsConstructor();

    private AAOptionsConstructor() {
    }

    private final void configureAAPlotOptionsDataLabels(AAPlotOptions aAPlotOptions, AAChartModel aAChartModel) {
        AASeries aASeries;
        AAChartType aAChartType;
        Boolean bl;
        AADataLabels aADataLabels = new AADataLabels();
        Boolean bl2 = aAChartModel.getDataLabelsEnabled();
        if (i.a((Object)bl2, (Object)(bl = Boolean.TRUE))) {
            aADataLabels.enabled(bl).style(aAChartModel.getDataLabelsStyle());
        }
        if ((aAChartType = aAChartModel.getChartType()) != null) {
            int n = aAChartType.ordinal();
            if (n != 0) {
                if (n != 1) {
                    if (n != 7) {
                        if (n == 11) {
                            aAPlotOptions.columnrange(new AAColumnrange().borderRadius(Float.valueOf((float)0.0f)).borderWidth(Float.valueOf((float)0.0f)));
                        }
                    } else {
                        AAPie aAPie = new AAPie().allowPointSelect(bl).cursor("pointer").showInLegend(bl);
                        if (i.a((Object)aAChartModel.getDataLabelsEnabled(), (Object)bl)) {
                            aADataLabels.format("<b>{point.name}</b>: {point.percentage:.1f} %");
                        }
                        aAPlotOptions.pie(aAPie);
                    }
                } else {
                    AABar aABar = new AABar().borderWidth(Float.valueOf((float)0.0f)).borderRadius(aAChartModel.getBorderRadius());
                    if (i.a((Object)aAChartModel.getPolar(), (Object)bl)) {
                        aABar.pointPadding(Float.valueOf((float)0.0f)).groupPadding(Float.valueOf((float)0.005f));
                    }
                    aAPlotOptions.bar(aABar);
                }
            } else {
                AAColumn aAColumn = new AAColumn().borderWidth(Float.valueOf((float)0.0f)).borderRadius(aAChartModel.getBorderRadius());
                if (i.a((Object)aAChartModel.getPolar(), (Object)bl)) {
                    aAColumn.pointPadding(Float.valueOf((float)0.0f)).groupPadding(Float.valueOf((float)0.005f));
                }
                aAPlotOptions.column(aAColumn);
            }
        }
        if ((aASeries = aAPlotOptions.getSeries()) != null) {
            aASeries.dataLabels(aADataLabels);
        }
    }

    private final void configureAAPlotOptionsMarkerStyle(AAChartModel aAChartModel, AAPlotOptions aAPlotOptions) {
        AAChartType aAChartType = aAChartModel.getChartType();
        if (aAChartType == null) {
            return;
        }
        int n = aAChartType.ordinal();
        if (n != 2 && n != 3 && n != 4 && n != 5 && n != 6) {
            return;
        }
        AAMarker aAMarker = new AAMarker().radius(aAChartModel.getMarkerRadius());
        AAChartSymbolType aAChartSymbolType = aAChartModel.getMarkerSymbol();
        String string2 = aAChartSymbolType != null ? aAChartSymbolType.getValue() : null;
        AAMarker aAMarker2 = aAMarker.symbol(string2);
        if (aAChartModel.getMarkerSymbolStyle() == AAChartSymbolStyleType.InnerBlank) {
            aAMarker2.fillColor(AAColor.INSTANCE.getWhite()).lineWidth(Float.valueOf((float)2.0f)).lineColor("");
        } else if (aAChartModel.getMarkerSymbolStyle() == AAChartSymbolStyleType.BorderBlank) {
            aAMarker2.lineWidth(Float.valueOf((float)2.0f)).lineColor(aAChartModel.getBackgroundColor());
        }
        AASeries aASeries = aAPlotOptions.getSeries();
        if (aASeries != null) {
            aASeries.marker(aAMarker2);
        }
    }

    private final void configureAxisContentAndStyle(AAOptions aAOptions, AAChartModel aAChartModel) {
        AAChartType aAChartType = aAChartModel.getChartType();
        if (aAChartType == null) {
            return;
        }
        switch (aAChartType.ordinal()) {
            default: {
                return;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 8: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
        }
        if (aAChartType != AAChartType.Gauge) {
            Boolean bl = aAChartModel.getXAxisLabelsEnabled();
            AALabels aALabels = new AALabels().enabled(bl);
            i.c((Object)bl);
            if (bl.booleanValue()) {
                aALabels.style(new AAStyle().color(aAChartModel.getAxesTextColor()));
            }
            aAOptions.xAxis(new AAXAxis().labels(aALabels).reversed(aAChartModel.getXAxisReversed()).gridLineWidth(aAChartModel.getXAxisGridLineWidth()).categories(aAChartModel.getCategories()).visible(aAChartModel.getXAxisVisible()).tickInterval(aAChartModel.getXAxisTickInterval()));
        }
        Boolean bl = aAChartModel.getYAxisLabelsEnabled();
        AALabels aALabels = new AALabels().enabled(aAChartModel.getYAxisLabelsEnabled());
        i.c((Object)bl);
        if (bl.booleanValue()) {
            aALabels.style(new AAStyle().color(aAChartModel.getAxesTextColor()));
        }
        aAOptions.yAxis(new AAYAxis().labels(aALabels).min(aAChartModel.getYAxisMin()).max(aAChartModel.getYAxisMax()).allowDecimals(aAChartModel.getYAxisAllowDecimals()).reversed(aAChartModel.getYAxisReversed()).gridLineWidth(aAChartModel.getYAxisGridLineWidth()).title(new AATitle().text(aAChartModel.getYAxisTitle()).style(new AAStyle().color(aAChartModel.getAxesTextColor()))).lineWidth(aAChartModel.getYAxisLineWidth()).visible(aAChartModel.getYAxisVisible()));
    }

    public final AAOptions configureChartOptions(AAChartModel aAChartModel) {
        AASeries aASeries;
        i.e((Object)aAChartModel, (String)"aaChartModel");
        AAChart aAChart = new AAChart().type(aAChartModel.getChartType()).inverted(aAChartModel.getInverted()).backgroundColor(aAChartModel.getBackgroundColor()).pinchType(aAChartModel.getZoomType());
        Boolean bl = Boolean.TRUE;
        AAChart aAChart2 = aAChart.panning(bl).polar(aAChartModel.getPolar()).margin(aAChartModel.getMargin()).scrollablePlotArea(aAChartModel.getScrollablePlotArea());
        AATitle aATitle = new AATitle().text(aAChartModel.getTitle()).style(aAChartModel.getTitleStyle());
        AASubtitle aASubtitle = new AASubtitle().text(aAChartModel.getSubtitle()).align(aAChartModel.getSubtitleAlign()).style(aAChartModel.getSubtitleStyle());
        AATooltip aATooltip = new AATooltip().enabled(aAChartModel.getTooltipEnabled()).shared(bl).valueSuffix(aAChartModel.getTooltipValueSuffix());
        AAPlotOptions aAPlotOptions = new AAPlotOptions().series(new AASeries().stacking(aAChartModel.getStacking()));
        if (aAChartModel.getAnimationType() != AAChartAnimationType.Linear && (aASeries = aAPlotOptions.getSeries()) != null) {
            aASeries.animation(new AAAnimation().easing(aAChartModel.getAnimationType()).duration(aAChartModel.getAnimationDuration()));
        }
        this.configureAAPlotOptionsMarkerStyle(aAChartModel, aAPlotOptions);
        this.configureAAPlotOptionsDataLabels(aAPlotOptions, aAChartModel);
        AALegend aALegend = new AALegend().enabled(aAChartModel.getLegendEnabled()).itemStyle(new AAItemStyle().color(aAChartModel.getAxesTextColor()));
        AAOptions aAOptions = new AAOptions().chart(aAChart2).title(aATitle).subtitle(aASubtitle).tooltip(aATooltip).plotOptions(aAPlotOptions).legend(aALegend).series(aAChartModel.getSeries()).colors(aAChartModel.getColorsTheme()).touchEventEnabled(aAChartModel.getTouchEventEnabled());
        this.configureAxisContentAndStyle(aAOptions, aAChartModel);
        return aAOptions;
    }
}

