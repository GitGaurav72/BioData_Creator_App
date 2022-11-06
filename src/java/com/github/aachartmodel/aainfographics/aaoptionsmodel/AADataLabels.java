/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bP\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bd\u0010eJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b\u001e\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010 \u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b \u0010\u000fJ\u0017\u0010!\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b!\u0010\u0005J\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010#\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b#\u0010\u0005J\u0017\u0010$\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b&\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010&\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b&\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001d\u0010'\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010'\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010'\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R$\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010C\u001a\u0004\bH\u0010E\"\u0004\bI\u0010GR$\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001f\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR$\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010C\u001a\u0004\bL\u0010E\"\u0004\bM\u0010GR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b#\u0010,\u001a\u0004\bN\u0010.\"\u0004\bO\u00100R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\bP\u0010)\"\u0004\bQ\u0010+R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010C\u001a\u0004\bR\u0010E\"\u0004\bS\u0010GR$\u0010$\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b$\u00101\u001a\u0004\bT\u00103\"\u0004\bU\u00105R$\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u0010'\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010,\u001a\u0004\bX\u0010.\"\u0004\bY\u00100R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b!\u0010,\u001a\u0004\bZ\u0010.\"\u0004\b[\u00100R$\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001e\u0010C\u001a\u0004\b\\\u0010E\"\u0004\b]\u0010GR$\u0010 \u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b \u0010'\u001a\u0004\b^\u0010)\"\u0004\b_\u0010+R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b`\u0010.\"\u0004\ba\u00100R$\u0010\"\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\bb\u0010)\"\u0004\bc\u0010+\u00a8\u0006f"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "", "", "prop", "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "align", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "inside", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "", "format", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "", "rotation", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "allowOverlap", "useHTML", "distance", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartVerticalAlignType;", "verticalAlign", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartVerticalAlignType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "x", "y", "color", "backgroundColor", "borderColor", "borderRadius", "borderWidth", "shape", "crop", "overflow", "softConnector", "textPath", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "filter", "Ljava/lang/String;", "getAlign", "()Ljava/lang/String;", "setAlign", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getAllowOverlap", "()Ljava/lang/Boolean;", "setAllowOverlap", "(Ljava/lang/Boolean;)V", "Ljava/lang/Object;", "getFilter", "()Ljava/lang/Object;", "setFilter", "(Ljava/lang/Object;)V", "getBorderColor", "setBorderColor", "getVerticalAlign", "setVerticalAlign", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "getBackgroundColor", "setBackgroundColor", "getInside", "setInside", "Ljava/lang/Float;", "getDistance", "()Ljava/lang/Float;", "setDistance", "(Ljava/lang/Float;)V", "getX", "setX", "getBorderWidth", "setBorderWidth", "getY", "setY", "getSoftConnector", "setSoftConnector", "getFormat", "setFormat", "getRotation", "setRotation", "getTextPath", "setTextPath", "getColor", "setColor", "getEnabled", "setEnabled", "getCrop", "setCrop", "getBorderRadius", "setBorderRadius", "getShape", "setShape", "getUseHTML", "setUseHTML", "getOverflow", "setOverflow", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AADataLabels {
    private String align;
    private Boolean allowOverlap;
    private String backgroundColor;
    private String borderColor;
    private Float borderRadius;
    private Float borderWidth;
    private String color;
    private Boolean crop;
    private Float distance;
    private Boolean enabled;
    private Object filter;
    private String format;
    private Boolean inside;
    private String overflow;
    private Float rotation;
    private String shape;
    private Boolean softConnector;
    private AAStyle style;
    private Object textPath;
    private Boolean useHTML;
    private String verticalAlign;
    private Float x;
    private Float y;

    public final AADataLabels align(AAChartAlignType aAChartAlignType) {
        String string2 = aAChartAlignType != null ? aAChartAlignType.getValue() : null;
        this.align = string2;
        return this;
    }

    public final AADataLabels allowOverlap(Boolean bl) {
        this.allowOverlap = bl;
        return this;
    }

    public final AADataLabels backgroundColor(String string2) {
        this.backgroundColor = string2;
        return this;
    }

    public final AADataLabels borderColor(String string2) {
        this.borderColor = string2;
        return this;
    }

    public final AADataLabels borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AADataLabels borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AADataLabels color(String string2) {
        this.color = string2;
        return this;
    }

    public final AADataLabels crop(Boolean bl) {
        this.crop = bl;
        return this;
    }

    public final AADataLabels distance(Float f) {
        this.distance = f;
        return this;
    }

    public final AADataLabels enabled(Boolean bl) {
        this.enabled = bl;
        return this;
    }

    public final AADataLabels filter(Object object) {
        this.filter = object;
        return this;
    }

    public final AADataLabels format(String string2) {
        this.format = string2;
        return this;
    }

    public final String getAlign() {
        return this.align;
    }

    public final Boolean getAllowOverlap() {
        return this.allowOverlap;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Float getBorderRadius() {
        return this.borderRadius;
    }

    public final Float getBorderWidth() {
        return this.borderWidth;
    }

    public final String getColor() {
        return this.color;
    }

    public final Boolean getCrop() {
        return this.crop;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Object getFilter() {
        return this.filter;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Boolean getInside() {
        return this.inside;
    }

    public final String getOverflow() {
        return this.overflow;
    }

    public final Float getRotation() {
        return this.rotation;
    }

    public final String getShape() {
        return this.shape;
    }

    public final Boolean getSoftConnector() {
        return this.softConnector;
    }

    public final AAStyle getStyle() {
        return this.style;
    }

    public final Object getTextPath() {
        return this.textPath;
    }

    public final Boolean getUseHTML() {
        return this.useHTML;
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

    public final AADataLabels inside(Boolean bl) {
        this.inside = bl;
        return this;
    }

    public final AADataLabels overflow(String string2) {
        this.overflow = string2;
        return this;
    }

    public final AADataLabels rotation(Float f) {
        this.rotation = f;
        return this;
    }

    public final void setAlign(String string2) {
        this.align = string2;
    }

    public final void setAllowOverlap(Boolean bl) {
        this.allowOverlap = bl;
    }

    public final void setBackgroundColor(String string2) {
        this.backgroundColor = string2;
    }

    public final void setBorderColor(String string2) {
        this.borderColor = string2;
    }

    public final void setBorderRadius(Float f) {
        this.borderRadius = f;
    }

    public final void setBorderWidth(Float f) {
        this.borderWidth = f;
    }

    public final void setColor(String string2) {
        this.color = string2;
    }

    public final void setCrop(Boolean bl) {
        this.crop = bl;
    }

    public final void setDistance(Float f) {
        this.distance = f;
    }

    public final void setEnabled(Boolean bl) {
        this.enabled = bl;
    }

    public final void setFilter(Object object) {
        this.filter = object;
    }

    public final void setFormat(String string2) {
        this.format = string2;
    }

    public final void setInside(Boolean bl) {
        this.inside = bl;
    }

    public final void setOverflow(String string2) {
        this.overflow = string2;
    }

    public final void setRotation(Float f) {
        this.rotation = f;
    }

    public final void setShape(String string2) {
        this.shape = string2;
    }

    public final void setSoftConnector(Boolean bl) {
        this.softConnector = bl;
    }

    public final void setStyle(AAStyle aAStyle) {
        this.style = aAStyle;
    }

    public final void setTextPath(Object object) {
        this.textPath = object;
    }

    public final void setUseHTML(Boolean bl) {
        this.useHTML = bl;
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

    public final AADataLabels shape(String string2) {
        this.shape = string2;
        return this;
    }

    public final AADataLabels softConnector(Boolean bl) {
        this.softConnector = bl;
        return this;
    }

    public final AADataLabels style(AAStyle aAStyle) {
        this.style = aAStyle;
        return this;
    }

    public final AADataLabels textPath(Object object) {
        this.textPath = object;
        return this;
    }

    public final AADataLabels useHTML(Boolean bl) {
        this.useHTML = bl;
        return this;
    }

    public final AADataLabels verticalAlign(AAChartVerticalAlignType aAChartVerticalAlignType) {
        String string2 = aAChartVerticalAlignType != null ? aAChartVerticalAlignType.getValue() : null;
        this.verticalAlign = string2;
        return this;
    }

    public final AADataLabels x(Float f) {
        this.x = f;
        return this;
    }

    public final AADataLabels y(Float f) {
        this.y = f;
        return this;
    }
}

