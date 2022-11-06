/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.util.Map
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import java.util.Map;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0004\u001a\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\t\u0010\bR,\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013\u00a8\u0006\u0018"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "", "", "prop", "attributes", "(Ljava/util/Map;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "", "opacity", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "size", "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "Ljava/lang/Float;", "getOpacity", "()Ljava/lang/Float;", "setOpacity", "(Ljava/lang/Float;)V", "getSize", "setSize", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAHalo {
    private Map<?, ?> attributes;
    private Float opacity;
    private Float size;

    public final AAHalo attributes(Map<?, ?> map) {
        this.attributes = map;
        return this;
    }

    public final Map<?, ?> getAttributes() {
        return this.attributes;
    }

    public final Float getOpacity() {
        return this.opacity;
    }

    public final Float getSize() {
        return this.size;
    }

    public final AAHalo opacity(Float f) {
        this.opacity = f;
        return this;
    }

    public final void setAttributes(Map<?, ?> map) {
        this.attributes = map;
    }

    public final void setOpacity(Float f) {
        this.opacity = f;
    }

    public final void setSize(Float f) {
        this.size = f;
    }

    public final AAHalo size(Float f) {
        this.size = f;
        return this;
    }
}

