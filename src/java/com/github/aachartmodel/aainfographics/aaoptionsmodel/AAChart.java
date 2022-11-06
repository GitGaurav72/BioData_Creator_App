/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAAnimation;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAResetZoomButton;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b_\u0010`J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\b\u00a2\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017\u00a2\u0006\u0004\b\u001a\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017\u00a2\u0006\u0004\b \u0010\u001fJ\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020$\u00a2\u0006\u0004\b%\u0010&R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010 \u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b \u00101\u001a\u0004\b@\u00103\"\u0004\bA\u00105R$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\bB\u0010)\"\u0004\bC\u0010+R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\bD\u00103\"\u0004\bE\u00105R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b%\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010'\u001a\u0004\bP\u0010)\"\u0004\bQ\u0010+R$\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0016\u0010;\u001a\u0004\bR\u0010=\"\u0004\bS\u0010?R$\u0010\u0004\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010'\u001a\u0004\bT\u0010)\"\u0004\bU\u0010+R$\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\bV\u00103\"\u0004\bW\u00105R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000f\u0010;\u001a\u0004\bX\u0010=\"\u0004\bY\u0010?R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^\u00a8\u0006a"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "prop", "type", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "backgroundColor", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "", "plotBackgroundImage", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;", "pinchType", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "", "panning", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "panKey", "polar", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "animation", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "inverted", "", "marginLeft", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "marginRight", "", "margin", "([Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "marginTop", "(F)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "marginBottom", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "scrollablePlotArea", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;", "resetZoomButton", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "Ljava/lang/String;", "getPlotBackgroundImage", "()Ljava/lang/String;", "setPlotBackgroundImage", "(Ljava/lang/String;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "getAnimation", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "setAnimation", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;)V", "Ljava/lang/Float;", "getMarginTop", "()Ljava/lang/Float;", "setMarginTop", "(Ljava/lang/Float;)V", "Ljava/lang/Object;", "getBackgroundColor", "()Ljava/lang/Object;", "setBackgroundColor", "(Ljava/lang/Object;)V", "Ljava/lang/Boolean;", "getPolar", "()Ljava/lang/Boolean;", "setPolar", "(Ljava/lang/Boolean;)V", "getMarginBottom", "setMarginBottom", "getPinchType", "setPinchType", "getMarginLeft", "setMarginLeft", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "getScrollablePlotArea", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "setScrollablePlotArea", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;", "getResetZoomButton", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;", "setResetZoomButton", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;)V", "getPanKey", "setPanKey", "getInverted", "setInverted", "getType", "setType", "getMarginRight", "setMarginRight", "getPanning", "setPanning", "[Ljava/lang/Float;", "getMargin", "()[Ljava/lang/Float;", "setMargin", "([Ljava/lang/Float;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAChart {
    private AAAnimation animation;
    private Object backgroundColor;
    private Boolean inverted;
    private Float[] margin;
    private Float marginBottom;
    private Float marginLeft;
    private Float marginRight;
    private Float marginTop;
    private String panKey;
    private Boolean panning;
    private String pinchType;
    private String plotBackgroundImage;
    private Boolean polar;
    private AAResetZoomButton resetZoomButton;
    private AAScrollablePlotArea scrollablePlotArea;
    private String type;

    public final AAChart animation(AAAnimation aAAnimation) {
        i.e((Object)aAAnimation, (String)"prop");
        this.animation = aAAnimation;
        return this;
    }

    public final AAChart backgroundColor(Object object) {
        this.backgroundColor = object;
        return this;
    }

    public final AAAnimation getAnimation() {
        return this.animation;
    }

    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Boolean getInverted() {
        return this.inverted;
    }

    public final Float[] getMargin() {
        return this.margin;
    }

    public final Float getMarginBottom() {
        return this.marginBottom;
    }

    public final Float getMarginLeft() {
        return this.marginLeft;
    }

    public final Float getMarginRight() {
        return this.marginRight;
    }

    public final Float getMarginTop() {
        return this.marginTop;
    }

    public final String getPanKey() {
        return this.panKey;
    }

    public final Boolean getPanning() {
        return this.panning;
    }

    public final String getPinchType() {
        return this.pinchType;
    }

    public final String getPlotBackgroundImage() {
        return this.plotBackgroundImage;
    }

    public final Boolean getPolar() {
        return this.polar;
    }

    public final AAResetZoomButton getResetZoomButton() {
        return this.resetZoomButton;
    }

    public final AAScrollablePlotArea getScrollablePlotArea() {
        return this.scrollablePlotArea;
    }

    public final String getType() {
        return this.type;
    }

    public final AAChart inverted(Boolean bl) {
        this.inverted = bl;
        return this;
    }

    public final AAChart margin(Float[] arrfloat) {
        this.margin = arrfloat;
        return this;
    }

    public final AAChart marginBottom(float f) {
        this.marginBottom = Float.valueOf((float)f);
        return this;
    }

    public final AAChart marginLeft(float f) {
        this.marginLeft = Float.valueOf((float)f);
        return this;
    }

    public final AAChart marginLeft(Float f) {
        this.marginLeft = f;
        return this;
    }

    public final AAChart marginRight(float f) {
        this.marginRight = Float.valueOf((float)f);
        return this;
    }

    public final AAChart marginRight(Float f) {
        this.marginRight = f;
        return this;
    }

    public final AAChart marginTop(float f) {
        this.marginTop = Float.valueOf((float)f);
        return this;
    }

    public final AAChart panKey(String string2) {
        i.e((Object)string2, (String)"prop");
        this.panKey = string2;
        return this;
    }

    public final AAChart panning(Boolean bl) {
        this.panning = bl;
        return this;
    }

    public final AAChart pinchType(AAChartZoomType aAChartZoomType) {
        String string2 = aAChartZoomType != null ? aAChartZoomType.getValue() : null;
        this.pinchType = string2;
        return this;
    }

    public final AAChart plotBackgroundImage(String string2) {
        i.e((Object)string2, (String)"prop");
        this.plotBackgroundImage = string2;
        return this;
    }

    public final AAChart polar(Boolean bl) {
        this.polar = bl;
        return this;
    }

    public final AAChart resetZoomButton(AAResetZoomButton aAResetZoomButton) {
        i.e((Object)aAResetZoomButton, (String)"prop");
        this.resetZoomButton = aAResetZoomButton;
        return this;
    }

    public final AAChart scrollablePlotArea(AAScrollablePlotArea aAScrollablePlotArea) {
        this.scrollablePlotArea = aAScrollablePlotArea;
        return this;
    }

    public final void setAnimation(AAAnimation aAAnimation) {
        this.animation = aAAnimation;
    }

    public final void setBackgroundColor(Object object) {
        this.backgroundColor = object;
    }

    public final void setInverted(Boolean bl) {
        this.inverted = bl;
    }

    public final void setMargin(Float[] arrfloat) {
        this.margin = arrfloat;
    }

    public final void setMarginBottom(Float f) {
        this.marginBottom = f;
    }

    public final void setMarginLeft(Float f) {
        this.marginLeft = f;
    }

    public final void setMarginRight(Float f) {
        this.marginRight = f;
    }

    public final void setMarginTop(Float f) {
        this.marginTop = f;
    }

    public final void setPanKey(String string2) {
        this.panKey = string2;
    }

    public final void setPanning(Boolean bl) {
        this.panning = bl;
    }

    public final void setPinchType(String string2) {
        this.pinchType = string2;
    }

    public final void setPlotBackgroundImage(String string2) {
        this.plotBackgroundImage = string2;
    }

    public final void setPolar(Boolean bl) {
        this.polar = bl;
    }

    public final void setResetZoomButton(AAResetZoomButton aAResetZoomButton) {
        this.resetZoomButton = aAResetZoomButton;
    }

    public final void setScrollablePlotArea(AAScrollablePlotArea aAScrollablePlotArea) {
        this.scrollablePlotArea = aAScrollablePlotArea;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final AAChart type(AAChartType aAChartType) {
        String string2 = aAChartType != null ? aAChartType.getValue() : null;
        this.type = string2;
        return this;
    }
}

