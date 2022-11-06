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

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bC\u0010DJ\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u0019\u0010\u000fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R$\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R$\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR$\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u00106\u001a\u0004\bA\u00108\"\u0004\bB\u0010:\u00a8\u0006E"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "", "", "prop", "name", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "", "data", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "color", "", "grouping", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "", "pointPadding", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "pointPlacement", "groupPadding", "borderWidth", "colorByPoint", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "stacking", "borderRadius", "yAxis", "Ljava/lang/Float;", "getPointPadding", "()Ljava/lang/Float;", "setPointPadding", "(Ljava/lang/Float;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getBorderWidth", "setBorderWidth", "getColor", "setColor", "getBorderRadius", "setBorderRadius", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "getDataLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "setDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)V", "getYAxis", "setYAxis", "[Ljava/lang/Object;", "getData", "()[Ljava/lang/Object;", "setData", "([Ljava/lang/Object;)V", "Ljava/lang/Boolean;", "getGrouping", "()Ljava/lang/Boolean;", "setGrouping", "(Ljava/lang/Boolean;)V", "getPointPlacement", "setPointPlacement", "getStacking", "setStacking", "getGroupPadding", "setGroupPadding", "getColorByPoint", "setColorByPoint", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAColumn {
    private Float borderRadius;
    private Float borderWidth;
    private String color;
    private Boolean colorByPoint;
    private Object[] data;
    private AADataLabels dataLabels;
    private Float groupPadding;
    private Boolean grouping;
    private String name;
    private Float pointPadding;
    private Float pointPlacement;
    private String stacking;
    private Float yAxis;

    public final AAColumn borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AAColumn borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AAColumn color(String string2) {
        i.e((Object)string2, (String)"prop");
        this.color = string2;
        return this;
    }

    public final AAColumn colorByPoint(Boolean bl) {
        this.colorByPoint = bl;
        return this;
    }

    public final AAColumn data(Object[] arrobject) {
        i.e((Object)arrobject, (String)"prop");
        this.data = arrobject;
        return this;
    }

    public final AAColumn dataLabels(AADataLabels aADataLabels) {
        i.e((Object)aADataLabels, (String)"prop");
        this.dataLabels = aADataLabels;
        return this;
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

    public final Boolean getColorByPoint() {
        return this.colorByPoint;
    }

    public final Object[] getData() {
        return this.data;
    }

    public final AADataLabels getDataLabels() {
        return this.dataLabels;
    }

    public final Float getGroupPadding() {
        return this.groupPadding;
    }

    public final Boolean getGrouping() {
        return this.grouping;
    }

    public final String getName() {
        return this.name;
    }

    public final Float getPointPadding() {
        return this.pointPadding;
    }

    public final Float getPointPlacement() {
        return this.pointPlacement;
    }

    public final String getStacking() {
        return this.stacking;
    }

    public final Float getYAxis() {
        return this.yAxis;
    }

    public final AAColumn groupPadding(Float f) {
        this.groupPadding = f;
        return this;
    }

    public final AAColumn grouping(Boolean bl) {
        this.grouping = bl;
        return this;
    }

    public final AAColumn name(String string2) {
        i.e((Object)string2, (String)"prop");
        this.name = string2;
        return this;
    }

    public final AAColumn pointPadding(Float f) {
        this.pointPadding = f;
        return this;
    }

    public final AAColumn pointPlacement(Float f) {
        this.pointPlacement = f;
        return this;
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

    public final void setColorByPoint(Boolean bl) {
        this.colorByPoint = bl;
    }

    public final void setData(Object[] arrobject) {
        this.data = arrobject;
    }

    public final void setDataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
    }

    public final void setGroupPadding(Float f) {
        this.groupPadding = f;
    }

    public final void setGrouping(Boolean bl) {
        this.grouping = bl;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPointPadding(Float f) {
        this.pointPadding = f;
    }

    public final void setPointPlacement(Float f) {
        this.pointPlacement = f;
    }

    public final void setStacking(String string2) {
        this.stacking = string2;
    }

    public final void setYAxis(Float f) {
        this.yAxis = f;
    }

    public final AAColumn stacking(String string2) {
        i.e((Object)string2, (String)"prop");
        this.stacking = string2;
        return this;
    }

    public final AAColumn yAxis(Float f) {
        this.yAxis = f;
        return this;
    }
}

