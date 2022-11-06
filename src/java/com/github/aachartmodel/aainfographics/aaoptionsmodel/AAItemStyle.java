/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000b\u0010\u0005R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010\u00a8\u0006\u001b"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "", "", "prop", "color", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "cursor", "pointer", "", "fontSize", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "fontWeight", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getFontSize", "setFontSize", "getCursor", "setCursor", "getFontWeight", "setFontWeight", "getPointer", "setPointer", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAItemStyle {
    private String color;
    private String cursor;
    private String fontSize;
    private String fontWeight;
    private String pointer;

    public final AAItemStyle color(String string2) {
        this.color = string2;
        return this;
    }

    public final AAItemStyle cursor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.cursor = string2;
        return this;
    }

    public final AAItemStyle fontSize(Float f) {
        StringBuilder stringBuilder = new StringBuilder();
        i.c((Object)f);
        stringBuilder.append(String.valueOf((float)f.floatValue()));
        stringBuilder.append("px");
        this.fontSize = stringBuilder.toString();
        return this;
    }

    public final AAItemStyle fontWeight(String string2) {
        i.e((Object)string2, (String)"prop");
        this.fontWeight = string2;
        return this;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getFontSize() {
        return this.fontSize;
    }

    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final String getPointer() {
        return this.pointer;
    }

    public final AAItemStyle pointer(String string2) {
        i.e((Object)string2, (String)"prop");
        this.pointer = string2;
        return this;
    }

    public final void setColor(String string2) {
        this.color = string2;
    }

    public final void setCursor(String string2) {
        this.cursor = string2;
    }

    public final void setFontSize(String string2) {
        this.fontSize = string2;
    }

    public final void setFontWeight(String string2) {
        this.fontWeight = string2;
    }

    public final void setPointer(String string2) {
        this.pointer = string2;
    }
}

