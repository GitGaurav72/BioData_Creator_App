/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAHalo;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011\u00a8\u0006 "}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "", "", "prop", "borderColor", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "", "brightness", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "color", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "halo", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "Ljava/lang/String;", "getBorderColor", "()Ljava/lang/String;", "setBorderColor", "(Ljava/lang/String;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "getHalo", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "setHalo", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;)V", "Ljava/lang/Float;", "getBrightness", "()Ljava/lang/Float;", "setBrightness", "(Ljava/lang/Float;)V", "getColor", "setColor", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAHover {
    private String borderColor;
    private Float brightness;
    private String color;
    private AAHalo halo;

    public final AAHover borderColor(String string2) {
        this.borderColor = string2;
        return this;
    }

    public final AAHover brightness(Float f) {
        this.brightness = f;
        return this;
    }

    public final AAHover color(String string2) {
        this.color = string2;
        return this;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Float getBrightness() {
        return this.brightness;
    }

    public final String getColor() {
        return this.color;
    }

    public final AAHalo getHalo() {
        return this.halo;
    }

    public final AAHover halo(AAHalo aAHalo) {
        this.halo = aAHalo;
        return this;
    }

    public final void setBorderColor(String string2) {
        this.borderColor = string2;
    }

    public final void setBrightness(Float f) {
        this.brightness = f;
    }

    public final void setColor(String string2) {
        this.color = string2;
    }

    public final void setHalo(AAHalo aAHalo) {
        this.halo = aAHalo;
    }
}

