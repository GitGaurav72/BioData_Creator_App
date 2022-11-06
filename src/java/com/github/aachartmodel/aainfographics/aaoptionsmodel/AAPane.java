/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AABackground;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\r\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006#"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;", "prop", "background", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "", "center", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "", "endAngle", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "size", "startAngle", "Ljava/lang/Float;", "getSize", "()Ljava/lang/Float;", "setSize", "(Ljava/lang/Float;)V", "getStartAngle", "setStartAngle", "getEndAngle", "setEndAngle", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;", "getBackground", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;", "setBackground", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;)V", "[Ljava/lang/Object;", "getCenter", "()[Ljava/lang/Object;", "setCenter", "([Ljava/lang/Object;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAPane {
    private AABackground background;
    private Object[] center;
    private Float endAngle;
    private Float size;
    private Float startAngle;

    public final AAPane background(AABackground aABackground) {
        this.background = aABackground;
        return this;
    }

    public final AAPane center(Object[] arrobject) {
        i.e((Object)arrobject, (String)"prop");
        this.center = arrobject;
        return this;
    }

    public final AAPane endAngle(Float f) {
        this.endAngle = f;
        return this;
    }

    public final AABackground getBackground() {
        return this.background;
    }

    public final Object[] getCenter() {
        return this.center;
    }

    public final Float getEndAngle() {
        return this.endAngle;
    }

    public final Float getSize() {
        return this.size;
    }

    public final Float getStartAngle() {
        return this.startAngle;
    }

    public final void setBackground(AABackground aABackground) {
        this.background = aABackground;
    }

    public final void setCenter(Object[] arrobject) {
        this.center = arrobject;
    }

    public final void setEndAngle(Float f) {
        this.endAngle = f;
    }

    public final void setSize(Float f) {
        this.size = f;
    }

    public final void setStartAngle(Float f) {
        this.startAngle = f;
    }

    public final AAPane size(Float f) {
        this.size = f;
        return this;
    }

    public final AAPane startAngle(Float f) {
        this.startAngle = f;
        return this;
    }
}

