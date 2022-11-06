/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAHover;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASelect;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStates;", "", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "prop", "hover", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStates;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;", "select", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStates;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "getHover", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "setHover", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;", "getSelect", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;", "setSelect", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAStates {
    private AAHover hover;
    private AASelect select;

    public final AAHover getHover() {
        return this.hover;
    }

    public final AASelect getSelect() {
        return this.select;
    }

    public final AAStates hover(AAHover aAHover) {
        this.hover = aAHover;
        return this;
    }

    public final AAStates select(AASelect aASelect) {
        this.select = aASelect;
        return this;
    }

    public final void setHover(AAHover aAHover) {
        this.hover = aAHover;
    }

    public final void setSelect(AASelect aASelect) {
        this.select = aASelect;
    }
}

