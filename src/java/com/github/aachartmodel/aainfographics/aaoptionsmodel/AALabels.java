/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle;
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bO\u0010PJ\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0019\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\u001c\u0010\nJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\u001e\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0016\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001d\u0010+\u001a\u0004\b5\u0010-\"\u0004\b6\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000b\u0010+\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R$\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010+\u001a\u0004\b9\u0010-\"\u0004\b:\u0010/R$\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010+\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R$\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u00100\u001a\u0004\b=\u00102\"\u0004\b>\u00104R$\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b?\u0010!\"\u0004\b@\u0010#R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001e\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u0010F\u001a\u0004\bK\u0010H\"\u0004\bL\u0010JR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\bM\u0010-\"\u0004\bN\u0010/\u00a8\u0006Q"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "prop", "align", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "autoRotation", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "", "autoRotationLimit", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "distance", "", "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "", "format", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "formatter", "padding", "rotation", "", "staggerLines", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "step", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "x", "y", "useHTML", "Ljava/lang/String;", "getAlign", "()Ljava/lang/String;", "setAlign", "(Ljava/lang/String;)V", "getFormat", "setFormat", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "Ljava/lang/Float;", "getX", "()Ljava/lang/Float;", "setX", "(Ljava/lang/Float;)V", "Ljava/lang/Integer;", "getStaggerLines", "()Ljava/lang/Integer;", "setStaggerLines", "(Ljava/lang/Integer;)V", "getY", "setY", "getDistance", "setDistance", "getRotation", "setRotation", "getPadding", "setPadding", "getStep", "setStep", "getFormatter", "setFormatter", "Ljava/lang/Object;", "getAutoRotation", "()Ljava/lang/Object;", "setAutoRotation", "(Ljava/lang/Object;)V", "Ljava/lang/Boolean;", "getUseHTML", "()Ljava/lang/Boolean;", "setUseHTML", "(Ljava/lang/Boolean;)V", "getEnabled", "setEnabled", "getAutoRotationLimit", "setAutoRotationLimit", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AALabels {
    private String align;
    private Object autoRotation;
    private Float autoRotationLimit;
    private Float distance;
    private Boolean enabled;
    private String format;
    private String formatter;
    private Float padding;
    private Float rotation;
    private Integer staggerLines;
    private Integer step;
    private AAStyle style;
    private Boolean useHTML;
    private Float x;
    private Float y;

    public final AALabels align(AAChartAlignType aAChartAlignType) {
        i.e((Object)aAChartAlignType, (String)"prop");
        this.align = aAChartAlignType.getValue();
        return this;
    }

    public final AALabels autoRotation(Object object) {
        i.e((Object)object, (String)"prop");
        this.autoRotation = object;
        return this;
    }

    public final AALabels autoRotationLimit(Float f) {
        this.autoRotationLimit = f;
        return this;
    }

    public final AALabels distance(Float f) {
        this.distance = f;
        return this;
    }

    public final AALabels enabled(Boolean bl) {
        this.enabled = bl;
        return this;
    }

    public final AALabels format(String string2) {
        i.e((Object)string2, (String)"prop");
        this.format = string2;
        return this;
    }

    public final AALabels formatter(String string2) {
        i.e((Object)string2, (String)"prop");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(string2);
        stringBuilder.append(')');
        String string3 = stringBuilder.toString();
        this.formatter = AAJSStringPurer.INSTANCE.pureJavaScriptFunctionString(string3);
        return this;
    }

    public final String getAlign() {
        return this.align;
    }

    public final Object getAutoRotation() {
        return this.autoRotation;
    }

    public final Float getAutoRotationLimit() {
        return this.autoRotationLimit;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getFormatter() {
        return this.formatter;
    }

    public final Float getPadding() {
        return this.padding;
    }

    public final Float getRotation() {
        return this.rotation;
    }

    public final Integer getStaggerLines() {
        return this.staggerLines;
    }

    public final Integer getStep() {
        return this.step;
    }

    public final AAStyle getStyle() {
        return this.style;
    }

    public final Boolean getUseHTML() {
        return this.useHTML;
    }

    public final Float getX() {
        return this.x;
    }

    public final Float getY() {
        return this.y;
    }

    public final AALabels padding(Float f) {
        this.padding = f;
        return this;
    }

    public final AALabels rotation(Float f) {
        this.rotation = f;
        return this;
    }

    public final void setAlign(String string2) {
        this.align = string2;
    }

    public final void setAutoRotation(Object object) {
        this.autoRotation = object;
    }

    public final void setAutoRotationLimit(Float f) {
        this.autoRotationLimit = f;
    }

    public final void setDistance(Float f) {
        this.distance = f;
    }

    public final void setEnabled(Boolean bl) {
        this.enabled = bl;
    }

    public final void setFormat(String string2) {
        this.format = string2;
    }

    public final void setFormatter(String string2) {
        this.formatter = string2;
    }

    public final void setPadding(Float f) {
        this.padding = f;
    }

    public final void setRotation(Float f) {
        this.rotation = f;
    }

    public final void setStaggerLines(Integer n) {
        this.staggerLines = n;
    }

    public final void setStep(Integer n) {
        this.step = n;
    }

    public final void setStyle(AAStyle aAStyle) {
        this.style = aAStyle;
    }

    public final void setUseHTML(Boolean bl) {
        this.useHTML = bl;
    }

    public final void setX(Float f) {
        this.x = f;
    }

    public final void setY(Float f) {
        this.y = f;
    }

    public final AALabels staggerLines(Integer n) {
        this.staggerLines = n;
        return this;
    }

    public final AALabels step(Integer n) {
        this.step = n;
        return this;
    }

    public final AALabels style(AAStyle aAStyle) {
        i.e((Object)aAStyle, (String)"prop");
        this.style = aAStyle;
        return this;
    }

    public final AALabels useHTML(Boolean bl) {
        this.useHTML = bl;
        return this;
    }

    public final AALabels x(Float f) {
        this.x = f;
        return this;
    }

    public final AALabels y(Float f) {
        this.y = f;
        return this;
    }
}

