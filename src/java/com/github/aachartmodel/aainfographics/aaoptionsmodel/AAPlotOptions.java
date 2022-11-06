/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAArea;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAAreaspline;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AABar;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumn;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALine;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPie;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASeries;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASpline;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\bM\u0010NJ\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0016\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\u00a8\u0006O"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "prop", "column", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALine;", "line", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALine;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "pie", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;", "bar", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASpline;", "spline", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASpline;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAArea;", "area", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAArea;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAreaspline;", "areaspline", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAreaspline;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "columnrange", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "arearange", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "series", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "Ljava/lang/Object;", "getColumnrange", "()Ljava/lang/Object;", "setColumnrange", "(Ljava/lang/Object;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "getSeries", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "setSeries", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAArea;", "getArea", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAArea;", "setArea", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAArea;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASpline;", "getSpline", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASpline;", "setSpline", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASpline;)V", "getArearange", "setArearange", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "getColumn", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;", "setColumn", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumn;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;", "getBar", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;", "setBar", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALine;", "getLine", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALine;", "setLine", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALine;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "getPie", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "setPie", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAreaspline;", "getAreaspline", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAreaspline;", "setAreaspline", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAreaspline;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAPlotOptions {
    private AAArea area;
    private Object arearange;
    private AAAreaspline areaspline;
    private AABar bar;
    private AAColumn column;
    private Object columnrange;
    private AALine line;
    private AAPie pie;
    private AASeries series;
    private AASpline spline;

    public final AAPlotOptions area(AAArea aAArea) {
        i.e((Object)aAArea, (String)"prop");
        this.area = aAArea;
        return this;
    }

    public final AAPlotOptions arearange(Object object) {
        i.e((Object)object, (String)"prop");
        this.arearange = object;
        return this;
    }

    public final AAPlotOptions areaspline(AAAreaspline aAAreaspline) {
        i.e((Object)aAAreaspline, (String)"prop");
        this.areaspline = aAAreaspline;
        return this;
    }

    public final AAPlotOptions bar(AABar aABar) {
        i.e((Object)aABar, (String)"prop");
        this.bar = aABar;
        return this;
    }

    public final AAPlotOptions column(AAColumn aAColumn) {
        i.e((Object)aAColumn, (String)"prop");
        this.column = aAColumn;
        return this;
    }

    public final AAPlotOptions columnrange(Object object) {
        i.e((Object)object, (String)"prop");
        this.columnrange = object;
        return this;
    }

    public final AAArea getArea() {
        return this.area;
    }

    public final Object getArearange() {
        return this.arearange;
    }

    public final AAAreaspline getAreaspline() {
        return this.areaspline;
    }

    public final AABar getBar() {
        return this.bar;
    }

    public final AAColumn getColumn() {
        return this.column;
    }

    public final Object getColumnrange() {
        return this.columnrange;
    }

    public final AALine getLine() {
        return this.line;
    }

    public final AAPie getPie() {
        return this.pie;
    }

    public final AASeries getSeries() {
        return this.series;
    }

    public final AASpline getSpline() {
        return this.spline;
    }

    public final AAPlotOptions line(AALine aALine) {
        i.e((Object)aALine, (String)"prop");
        this.line = aALine;
        return this;
    }

    public final AAPlotOptions pie(AAPie aAPie) {
        i.e((Object)aAPie, (String)"prop");
        this.pie = aAPie;
        return this;
    }

    public final AAPlotOptions series(AASeries aASeries) {
        i.e((Object)aASeries, (String)"prop");
        this.series = aASeries;
        return this;
    }

    public final void setArea(AAArea aAArea) {
        this.area = aAArea;
    }

    public final void setArearange(Object object) {
        this.arearange = object;
    }

    public final void setAreaspline(AAAreaspline aAAreaspline) {
        this.areaspline = aAAreaspline;
    }

    public final void setBar(AABar aABar) {
        this.bar = aABar;
    }

    public final void setColumn(AAColumn aAColumn) {
        this.column = aAColumn;
    }

    public final void setColumnrange(Object object) {
        this.columnrange = object;
    }

    public final void setLine(AALine aALine) {
        this.line = aALine;
    }

    public final void setPie(AAPie aAPie) {
        this.pie = aAPie;
    }

    public final void setSeries(AASeries aASeries) {
        this.series = aASeries;
    }

    public final void setSpline(AASpline aASpline) {
        this.spline = aASpline;
    }

    public final AAPlotOptions spline(AASpline aASpline) {
        i.e((Object)aASpline, (String)"prop");
        this.spline = aASpline;
        return this;
    }
}

