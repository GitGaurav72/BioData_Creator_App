/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\u0005R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\r\u00a8\u0006\u0010"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "", "", "prop", "color", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "", "fontSize", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartFontWeightType;", "fontWeight", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartFontWeightType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "textOutline", "Ljava/lang/String;", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAStyle {
    private String color;
    private String fontSize;
    private String fontWeight;
    private String textOutline;

    public final AAStyle color(String string2) {
        this.color = string2;
        return this;
    }

    public final AAStyle fontSize(Float f) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)f);
        stringBuilder.append("px");
        this.fontSize = stringBuilder.toString();
        return this;
    }

    public final AAStyle fontWeight(AAChartFontWeightType aAChartFontWeightType) {
        String string2 = aAChartFontWeightType != null ? aAChartFontWeightType.getValue() : null;
        this.fontWeight = string2;
        return this;
    }

    public final AAStyle textOutline(String string2) {
        i.e((Object)string2, (String)"prop");
        this.textOutline = string2;
        return this;
    }
}

