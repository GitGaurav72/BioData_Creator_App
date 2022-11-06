/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0007\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "", "", "prop", "duration", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;", "easing", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "Ljava/lang/Integer;", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "", "Ljava/lang/String;", "getEasing", "()Ljava/lang/String;", "setEasing", "(Ljava/lang/String;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAAnimation {
    private Integer duration;
    private String easing;

    public final AAAnimation duration(Integer n) {
        this.duration = n;
        return this;
    }

    public final AAAnimation easing(AAChartAnimationType aAChartAnimationType) {
        String string2 = aAChartAnimationType != null ? aAChartAnimationType.getValue() : null;
        this.easing = string2;
        return this;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getEasing() {
        return this.easing;
    }

    public final void setDuration(Integer n) {
        this.duration = n;
    }

    public final void setEasing(String string2) {
        this.easing = string2;
    }
}

