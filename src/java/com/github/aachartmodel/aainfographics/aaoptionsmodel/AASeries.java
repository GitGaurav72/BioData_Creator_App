/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAShadow;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAAnimation;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker;
import java.util.Map;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bO\u0010PJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001e\u0010\u001fR,\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\n\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\b9\u0010'\"\u0004\b:\u0010)R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001e\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N\u00a8\u0006Q"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "", "", "prop", "borderRadius", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "marker", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;", "stacking", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "animation", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "", "", "keys", "([Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "", "colorByPoint", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "connectNulls", "", "events", "(Ljava/util/Map;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "shadow", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "Ljava/util/Map;", "getEvents", "()Ljava/util/Map;", "setEvents", "(Ljava/util/Map;)V", "Ljava/lang/Boolean;", "getColorByPoint", "()Ljava/lang/Boolean;", "setColorByPoint", "(Ljava/lang/Boolean;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "getShadow", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "setShadow", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "getMarker", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "setMarker", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;)V", "Ljava/lang/String;", "getStacking", "()Ljava/lang/String;", "setStacking", "(Ljava/lang/String;)V", "getConnectNulls", "setConnectNulls", "Ljava/lang/Float;", "getBorderRadius", "()Ljava/lang/Float;", "setBorderRadius", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "getDataLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "setDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "getAnimation", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "setAnimation", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;)V", "[Ljava/lang/String;", "getKeys", "()[Ljava/lang/String;", "setKeys", "([Ljava/lang/String;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AASeries {
    private AAAnimation animation;
    private Float borderRadius;
    private Boolean colorByPoint;
    private Boolean connectNulls;
    private AADataLabels dataLabels;
    private Map<?, ?> events;
    private String[] keys;
    private AAMarker marker;
    private AAShadow shadow;
    private String stacking;

    public final AASeries animation(AAAnimation aAAnimation) {
        i.e((Object)aAAnimation, (String)"prop");
        this.animation = aAAnimation;
        return this;
    }

    public final AASeries borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AASeries colorByPoint(Boolean bl) {
        this.colorByPoint = bl;
        return this;
    }

    public final AASeries connectNulls(Boolean bl) {
        this.connectNulls = bl;
        return this;
    }

    public final AASeries dataLabels(AADataLabels aADataLabels) {
        i.e((Object)aADataLabels, (String)"prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AASeries events(Map<?, ?> map) {
        i.e(map, (String)"prop");
        this.events = map;
        return this;
    }

    public final AAAnimation getAnimation() {
        return this.animation;
    }

    public final Float getBorderRadius() {
        return this.borderRadius;
    }

    public final Boolean getColorByPoint() {
        return this.colorByPoint;
    }

    public final Boolean getConnectNulls() {
        return this.connectNulls;
    }

    public final AADataLabels getDataLabels() {
        return this.dataLabels;
    }

    public final Map<?, ?> getEvents() {
        return this.events;
    }

    public final String[] getKeys() {
        return this.keys;
    }

    public final AAMarker getMarker() {
        return this.marker;
    }

    public final AAShadow getShadow() {
        return this.shadow;
    }

    public final String getStacking() {
        return this.stacking;
    }

    public final AASeries keys(String[] arrstring) {
        i.e((Object)arrstring, (String)"prop");
        this.keys = arrstring;
        return this;
    }

    public final AASeries marker(AAMarker aAMarker) {
        i.e((Object)aAMarker, (String)"prop");
        this.marker = aAMarker;
        return this;
    }

    public final void setAnimation(AAAnimation aAAnimation) {
        this.animation = aAAnimation;
    }

    public final void setBorderRadius(Float f) {
        this.borderRadius = f;
    }

    public final void setColorByPoint(Boolean bl) {
        this.colorByPoint = bl;
    }

    public final void setConnectNulls(Boolean bl) {
        this.connectNulls = bl;
    }

    public final void setDataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
    }

    public final void setEvents(Map<?, ?> map) {
        this.events = map;
    }

    public final void setKeys(String[] arrstring) {
        this.keys = arrstring;
    }

    public final void setMarker(AAMarker aAMarker) {
        this.marker = aAMarker;
    }

    public final void setShadow(AAShadow aAShadow) {
        this.shadow = aAShadow;
    }

    public final void setStacking(String string2) {
        this.stacking = string2;
    }

    public final AASeries shadow(AAShadow aAShadow) {
        i.e((Object)aAShadow, (String)"prop");
        this.shadow = aAShadow;
        return this;
    }

    public final AASeries stacking(AAChartStackingType aAChartStackingType) {
        String string2 = aAChartStackingType != null ? aAChartStackingType.getValue() : null;
        this.stacking = string2;
        return this;
    }
}

