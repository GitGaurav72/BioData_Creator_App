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
package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0015\u00a8\u0006\u0018"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AADataElement;", "", "", "prop", "name", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AADataElement;", "", "y", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AADataElement;", "color", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AADataElement;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AADataElement;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "marker", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AADataElement;", "Ljava/lang/String;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "Ljava/lang/Float;", "Ljava/lang/Object;", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AADataElement {
    private Object color;
    private AADataLabels dataLabels;
    private AAMarker marker;
    private String name;
    private Float y;

    public final AADataElement color(Object object) {
        i.e((Object)object, (String)"prop");
        this.color = object;
        return this;
    }

    public final AADataElement dataLabels(AADataLabels aADataLabels) {
        i.e((Object)aADataLabels, (String)"prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AADataElement marker(AAMarker aAMarker) {
        i.e((Object)aAMarker, (String)"prop");
        this.marker = aAMarker;
        return this;
    }

    public final AADataElement name(String string2) {
        i.e((Object)string2, (String)"prop");
        this.name = string2;
        return this;
    }

    public final AADataElement y(Float f) {
        this.y = f;
        return this;
    }
}

