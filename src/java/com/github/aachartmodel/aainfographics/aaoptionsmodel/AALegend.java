/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b@\u0010AJ\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\f\u00a2\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\n\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R$\u0010\u0004\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R$\u0010\u0007\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R$\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R$\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106\u00a8\u0006B"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLayoutType;", "prop", "layout", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLayoutType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "align", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartVerticalAlignType;", "verticalAlign", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartVerticalAlignType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "", "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "", "borderColor", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "", "BorderWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "itemMarginTop", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "itemStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "x", "y", "floating", "(Z)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "Ljava/lang/Float;", "getItemMarginTop", "()Ljava/lang/Float;", "setItemMarginTop", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "getItemStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "setItemStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;)V", "Ljava/lang/String;", "getVerticalAlign", "()Ljava/lang/String;", "setVerticalAlign", "(Ljava/lang/String;)V", "getX", "setX", "getLayout", "setLayout", "getAlign", "setAlign", "Ljava/lang/Boolean;", "getFloating", "()Ljava/lang/Boolean;", "setFloating", "(Ljava/lang/Boolean;)V", "borderWidth", "getBorderWidth", "setBorderWidth", "getBorderColor", "setBorderColor", "getY", "setY", "getEnabled", "setEnabled", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AALegend {
    private String align;
    private String borderColor;
    private Float borderWidth;
    private Boolean enabled;
    private Boolean floating;
    private Float itemMarginTop;
    private AAItemStyle itemStyle;
    private String layout;
    private String verticalAlign;
    private Float x;
    private Float y;

    public final AALegend BorderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AALegend align(AAChartAlignType aAChartAlignType) {
        i.e((Object)aAChartAlignType, (String)"prop");
        this.align = aAChartAlignType.getValue();
        return this;
    }

    public final AALegend borderColor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.borderColor = string2;
        return this;
    }

    public final AALegend enabled(Boolean bl) {
        this.enabled = bl;
        return this;
    }

    public final AALegend floating(boolean bl) {
        this.floating = bl;
        return this;
    }

    public final String getAlign() {
        return this.align;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Float getBorderWidth() {
        return this.borderWidth;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getFloating() {
        return this.floating;
    }

    public final Float getItemMarginTop() {
        return this.itemMarginTop;
    }

    public final AAItemStyle getItemStyle() {
        return this.itemStyle;
    }

    public final String getLayout() {
        return this.layout;
    }

    public final String getVerticalAlign() {
        return this.verticalAlign;
    }

    public final Float getX() {
        return this.x;
    }

    public final Float getY() {
        return this.y;
    }

    public final AALegend itemMarginTop(Float f) {
        this.itemMarginTop = f;
        return this;
    }

    public final AALegend itemStyle(AAItemStyle aAItemStyle) {
        i.e((Object)aAItemStyle, (String)"prop");
        this.itemStyle = aAItemStyle;
        return this;
    }

    public final AALegend layout(AAChartLayoutType aAChartLayoutType) {
        i.e((Object)aAChartLayoutType, (String)"prop");
        this.layout = aAChartLayoutType.getValue();
        return this;
    }

    public final void setAlign(String string2) {
        this.align = string2;
    }

    public final void setBorderColor(String string2) {
        this.borderColor = string2;
    }

    public final void setBorderWidth(Float f) {
        this.borderWidth = f;
    }

    public final void setEnabled(Boolean bl) {
        this.enabled = bl;
    }

    public final void setFloating(Boolean bl) {
        this.floating = bl;
    }

    public final void setItemMarginTop(Float f) {
        this.itemMarginTop = f;
    }

    public final void setItemStyle(AAItemStyle aAItemStyle) {
        this.itemStyle = aAItemStyle;
    }

    public final void setLayout(String string2) {
        this.layout = string2;
    }

    public final void setVerticalAlign(String string2) {
        this.verticalAlign = string2;
    }

    public final void setX(Float f) {
        this.x = f;
    }

    public final void setY(Float f) {
        this.y = f;
    }

    public final AALegend verticalAlign(AAChartVerticalAlignType aAChartVerticalAlignType) {
        i.e((Object)((Object)aAChartVerticalAlignType), (String)"prop");
        this.verticalAlign = aAChartVerticalAlignType.getValue();
        return this;
    }

    public final AALegend x(Float f) {
        this.x = f;
        return this;
    }

    public final AALegend y(Float f) {
        this.y = f;
        return this;
    }
}

