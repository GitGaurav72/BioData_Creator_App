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

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b-\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bC\u0010DJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018\u00a2\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0012\u0010:\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R$\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010 \u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$\u00a8\u0006E"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "prop", "type", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "", "size", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "", "allowPointSelect", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "", "cursor", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "showInLegend", "startAngle", "endAngle", "depth", "center", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "", "data", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Ljava/lang/Float;", "getEndAngle", "()Ljava/lang/Float;", "setEndAngle", "(Ljava/lang/Float;)V", "Ljava/lang/Object;", "getCenter", "()Ljava/lang/Object;", "setCenter", "(Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getData", "()[Ljava/lang/Object;", "setData", "([Ljava/lang/Object;)V", "getSize", "setSize", "getCursor", "setCursor", "getStartAngle", "setStartAngle", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "getDataLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "setDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)V", "Ljava/lang/Boolean;", "getAllowPointSelect", "()Ljava/lang/Boolean;", "setAllowPointSelect", "(Ljava/lang/Boolean;)V", "getShowInLegend", "setShowInLegend", "getDepth", "setDepth", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAPie {
    private Boolean allowPointSelect;
    private Object center;
    private String cursor;
    private Object[] data;
    private AADataLabels dataLabels;
    private Float depth;
    private Float endAngle;
    private Boolean showInLegend;
    private Float size;
    private Float startAngle;
    private String type;

    public final AAPie allowPointSelect(Boolean bl) {
        this.allowPointSelect = bl;
        return this;
    }

    public final AAPie center(Object object) {
        this.center = object;
        return this;
    }

    public final AAPie cursor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.cursor = string2;
        return this;
    }

    public final AAPie data(Object[] arrobject) {
        i.e((Object)arrobject, (String)"prop");
        this.data = arrobject;
        return this;
    }

    public final AAPie dataLabels(AADataLabels aADataLabels) {
        i.e((Object)aADataLabels, (String)"prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AAPie depth(Float f) {
        this.depth = f;
        return this;
    }

    public final AAPie endAngle(Float f) {
        this.endAngle = f;
        return this;
    }

    public final Boolean getAllowPointSelect() {
        return this.allowPointSelect;
    }

    public final Object getCenter() {
        return this.center;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Object[] getData() {
        return this.data;
    }

    public final AADataLabels getDataLabels() {
        return this.dataLabels;
    }

    public final Float getDepth() {
        return this.depth;
    }

    public final Float getEndAngle() {
        return this.endAngle;
    }

    public final Boolean getShowInLegend() {
        return this.showInLegend;
    }

    public final Float getSize() {
        return this.size;
    }

    public final Float getStartAngle() {
        return this.startAngle;
    }

    public final String getType() {
        return this.type;
    }

    public final void setAllowPointSelect(Boolean bl) {
        this.allowPointSelect = bl;
    }

    public final void setCenter(Object object) {
        this.center = object;
    }

    public final void setCursor(String string2) {
        this.cursor = string2;
    }

    public final void setData(Object[] arrobject) {
        this.data = arrobject;
    }

    public final void setDataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
    }

    public final void setDepth(Float f) {
        this.depth = f;
    }

    public final void setEndAngle(Float f) {
        this.endAngle = f;
    }

    public final void setShowInLegend(Boolean bl) {
        this.showInLegend = bl;
    }

    public final void setSize(Float f) {
        this.size = f;
    }

    public final void setStartAngle(Float f) {
        this.startAngle = f;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final AAPie showInLegend(Boolean bl) {
        this.showInLegend = bl;
        return this;
    }

    public final AAPie size(Float f) {
        this.size = f;
        return this;
    }

    public final AAPie startAngle(Float f) {
        this.startAngle = f;
        return this;
    }

    public final AAPie type(AAChartType aAChartType) {
        String string2 = aAChartType != null ? aAChartType.getValue() : null;
        this.type = string2;
        return this;
    }
}

