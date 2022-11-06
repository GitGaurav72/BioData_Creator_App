/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
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

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle;
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b2\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bF\u0010GJ\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0005J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0005J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0005J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u001a\u0010\u0005R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b7\u0010/\"\u0004\b8\u00101R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\"\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R$\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\"\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001f\u00a8\u0006H"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "", "", "prop", "backgroundColor", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "borderColor", "", "borderRadius", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "borderWidth", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "", "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "useHTML", "formatter", "headerFormat", "pointFormat", "footerFormat", "", "valueDecimals", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "shared", "valueSuffix", "Ljava/lang/String;", "getValueSuffix", "()Ljava/lang/String;", "setValueSuffix", "(Ljava/lang/String;)V", "getFormatter", "setFormatter", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "getBorderColor", "setBorderColor", "getBackgroundColor", "setBackgroundColor", "getPointFormat", "setPointFormat", "Ljava/lang/Float;", "getBorderWidth", "()Ljava/lang/Float;", "setBorderWidth", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "getBorderRadius", "setBorderRadius", "Ljava/lang/Integer;", "getValueDecimals", "()Ljava/lang/Integer;", "setValueDecimals", "(Ljava/lang/Integer;)V", "getShared", "setShared", "getUseHTML", "setUseHTML", "getHeaderFormat", "setHeaderFormat", "getFooterFormat", "setFooterFormat", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AATooltip {
    private String backgroundColor;
    private String borderColor;
    private Float borderRadius;
    private Float borderWidth;
    private Boolean enabled;
    private String footerFormat;
    private String formatter;
    private String headerFormat;
    private String pointFormat;
    private Boolean shared;
    private AAStyle style;
    private Boolean useHTML;
    private Integer valueDecimals;
    private String valueSuffix;

    public AATooltip() {
        Boolean bl;
        this.shared = bl = Boolean.TRUE;
        this.enabled = bl;
    }

    public final AATooltip backgroundColor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.backgroundColor = string2;
        return this;
    }

    public final AATooltip borderColor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.borderColor = string2;
        return this;
    }

    public final AATooltip borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AATooltip borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AATooltip enabled(Boolean bl) {
        this.enabled = bl;
        return this;
    }

    public final AATooltip footerFormat(String string2) {
        i.e((Object)string2, (String)"prop");
        this.footerFormat = string2;
        return this;
    }

    public final AATooltip formatter(String string2) {
        i.e((Object)string2, (String)"prop");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(string2);
        stringBuilder.append(')');
        String string3 = stringBuilder.toString();
        this.formatter = AAJSStringPurer.INSTANCE.pureJavaScriptFunctionString(string3);
        return this;
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

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getFooterFormat() {
        return this.footerFormat;
    }

    public final String getFormatter() {
        return this.formatter;
    }

    public final String getHeaderFormat() {
        return this.headerFormat;
    }

    public final String getPointFormat() {
        return this.pointFormat;
    }

    public final Boolean getShared() {
        return this.shared;
    }

    public final AAStyle getStyle() {
        return this.style;
    }

    public final Boolean getUseHTML() {
        return this.useHTML;
    }

    public final Integer getValueDecimals() {
        return this.valueDecimals;
    }

    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    public final AATooltip headerFormat(String string2) {
        i.e((Object)string2, (String)"prop");
        this.headerFormat = string2;
        return this;
    }

    public final AATooltip pointFormat(String string2) {
        i.e((Object)string2, (String)"prop");
        this.pointFormat = string2;
        return this;
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

    public final void setEnabled(Boolean bl) {
        this.enabled = bl;
    }

    public final void setFooterFormat(String string2) {
        this.footerFormat = string2;
    }

    public final void setFormatter(String string2) {
        this.formatter = string2;
    }

    public final void setHeaderFormat(String string2) {
        this.headerFormat = string2;
    }

    public final void setPointFormat(String string2) {
        this.pointFormat = string2;
    }

    public final void setShared(Boolean bl) {
        this.shared = bl;
    }

    public final void setStyle(AAStyle aAStyle) {
        this.style = aAStyle;
    }

    public final void setUseHTML(Boolean bl) {
        this.useHTML = bl;
    }

    public final void setValueDecimals(Integer n) {
        this.valueDecimals = n;
    }

    public final void setValueSuffix(String string2) {
        this.valueSuffix = string2;
    }

    public final AATooltip shared(Boolean bl) {
        this.shared = bl;
        return this;
    }

    public final AATooltip style(AAStyle aAStyle) {
        i.e((Object)aAStyle, (String)"prop");
        this.style = aAStyle;
        return this;
    }

    public final AATooltip useHTML(Boolean bl) {
        this.useHTML = bl;
        return this;
    }

    public final AATooltip valueDecimals(Integer n) {
        this.valueDecimals = n;
        return this;
    }

    public final AATooltip valueSuffix(String string2) {
        this.valueSuffix = string2;
        return this;
    }
}

