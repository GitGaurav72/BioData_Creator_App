/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\t\u0010\bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016\u00a8\u0006\u001b"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "", "", "prop", "align", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "verticalAlign", "", "(Ljava/lang/Number;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "y", "Ljava/lang/String;", "getAlign", "()Ljava/lang/String;", "setAlign", "(Ljava/lang/String;)V", "getVerticalAlign", "setVerticalAlign", "x", "Ljava/lang/Number;", "getX", "()Ljava/lang/Number;", "setX", "(Ljava/lang/Number;)V", "getY", "setY", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAPosition {
    private String align;
    private String verticalAlign;
    private Number x;
    private Number y;

    public final AAPosition align(Number number) {
        this.x = number;
        return this;
    }

    public final AAPosition align(String string2) {
        this.align = string2;
        return this;
    }

    public final String getAlign() {
        return this.align;
    }

    public final String getVerticalAlign() {
        return this.verticalAlign;
    }

    public final Number getX() {
        return this.x;
    }

    public final Number getY() {
        return this.y;
    }

    public final void setAlign(String string2) {
        this.align = string2;
    }

    public final void setVerticalAlign(String string2) {
        this.verticalAlign = string2;
    }

    public final void setX(Number number) {
        this.x = number;
    }

    public final void setY(Number number) {
        this.y = number;
    }

    public final AAPosition verticalAlign(String string2) {
        this.verticalAlign = string2;
        return this;
    }

    public final AAPosition y(Number number) {
        this.y = number;
        return this;
    }
}

