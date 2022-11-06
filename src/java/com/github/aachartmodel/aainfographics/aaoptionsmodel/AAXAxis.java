/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AACrosshair;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotBandsElement;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotLinesElement;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bm\u0018\u00002\u00020\u0001B\t\u00a2\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u001e\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010 \u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b \u0010\u0018J\u0017\u0010!\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b!\u0010\u0005J\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b$\u0010\u0018J\u0017\u0010%\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b%\u0010\u0005J\u0017\u0010&\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b&\u0010\u0018J\u0017\u0010'\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b'\u0010\u0005J\u0017\u0010(\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b(\u0010\u0018J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b)\u0010\u0005J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b*\u0010\u0005J\u0017\u0010+\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b+\u0010\u0018J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020,\u00a2\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b/\u0010\u0014J\u0017\u00100\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b0\u0010\u0014J\u0017\u00101\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b1\u0010\u0011J\u0015\u00103\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000202\u00a2\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b5\u0010\u0005J\u0017\u00106\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b6\u0010\u0018J\u0017\u00107\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b7\u0010\u0018J\u0015\u00108\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b8\u0010\u0005R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u00109\u001a\u0004\bC\u0010;\"\u0004\bD\u0010=R$\u0010(\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b(\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010E\u001a\u0004\bJ\u0010G\"\u0004\bK\u0010IR$\u00107\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b7\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR$\u0010\"\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010+\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b+\u0010E\u001a\u0004\bS\u0010G\"\u0004\bT\u0010IR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001f\u00109\u001a\u0004\bU\u0010;\"\u0004\bV\u0010=R$\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u0010E\u001a\u0004\bW\u0010G\"\u0004\bX\u0010IR$\u0010 \u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b \u0010E\u001a\u0004\bY\u0010G\"\u0004\bZ\u0010IR$\u00101\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b1\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b)\u00109\u001a\u0004\b`\u0010;\"\u0004\ba\u0010=R$\u0010&\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b&\u0010E\u001a\u0004\bb\u0010G\"\u0004\bc\u0010IR$\u0010$\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b$\u0010E\u001a\u0004\bd\u0010G\"\u0004\be\u0010IR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u00109\u001a\u0004\bf\u0010;\"\u0004\bg\u0010=R$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b5\u00109\u001a\u0004\bh\u0010;\"\u0004\bi\u0010=R$\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010[\u001a\u0004\bj\u0010]\"\u0004\bk\u0010_R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b%\u00109\u001a\u0004\bl\u0010;\"\u0004\bm\u0010=R$\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\bn\u0010;\"\u0004\bo\u0010=R$\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010/\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b/\u0010p\u001a\u0004\bu\u0010r\"\u0004\bv\u0010tR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\bw\u0010;\"\u0004\bx\u0010=R$\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b*\u00109\u001a\u0004\by\u0010;\"\u0004\bz\u0010=R$\u00106\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b6\u0010E\u001a\u0004\b{\u0010G\"\u0004\b|\u0010IR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010p\u001a\u0004\b}\u0010r\"\u0004\b~\u0010tR.\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0016\n\u0004\b\u000b\u0010\u001a\u0006\b\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b\u0017\u0010E\u001a\u0005\b\u0084\u0001\u0010G\"\u0005\b\u0085\u0001\u0010IR)\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\b-\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u00100\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b0\u0010p\u001a\u0005\b\u008b\u0001\u0010r\"\u0005\b\u008c\u0001\u0010tR&\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b\u001d\u0010[\u001a\u0005\b\u008d\u0001\u0010]\"\u0005\b\u008e\u0001\u0010_R)\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\b3\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R/\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\b\b\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R&\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b!\u00109\u001a\u0005\b\u0099\u0001\u0010;\"\u0005\b\u009a\u0001\u0010=R&\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b\u0010\u0010[\u001a\u0005\b\u009b\u0001\u0010]\"\u0005\b\u009c\u0001\u0010_\u00a8\u0006\u009f\u0001"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "", "", "prop", "type", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "plotBands", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "plotLines", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "categories", "([Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "", "linkedTo", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "", "reversed", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "opposite", "", "lineWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "lineColor", "max", "min", "minRange", "minTickInterval", "minorGridLineColor", "minorGridLineDashStyle", "minorGridLineWidth", "minorTickColor", "minorTickInterval", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "minorTickLength", "minorTickPosition", "minorTickWidth", "tickColor", "gridLineWidth", "gridLineColor", "gridLineDashStyle", "off", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "labels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "visible", "startOnTick", "tickInterval", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "crosshair", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "tickmarkPlacement", "tickWidth", "tickLength", "tickPosition", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "[Ljava/lang/String;", "getCategories", "()[Ljava/lang/String;", "setCategories", "([Ljava/lang/String;)V", "getTickColor", "setTickColor", "Ljava/lang/Float;", "getGridLineWidth", "()Ljava/lang/Float;", "setGridLineWidth", "(Ljava/lang/Float;)V", "getMax", "setMax", "getTickLength", "setTickLength", "Ljava/lang/Object;", "getMinorTickInterval", "()Ljava/lang/Object;", "setMinorTickInterval", "(Ljava/lang/Object;)V", "getOff", "setOff", "getMinorGridLineDashStyle", "setMinorGridLineDashStyle", "getMin", "setMin", "getMinorGridLineWidth", "setMinorGridLineWidth", "Ljava/lang/Integer;", "getTickInterval", "()Ljava/lang/Integer;", "setTickInterval", "(Ljava/lang/Integer;)V", "getGridLineColor", "setGridLineColor", "getMinorTickWidth", "setMinorTickWidth", "getMinorTickLength", "setMinorTickLength", "getLineColor", "setLineColor", "getTickmarkPlacement", "setTickmarkPlacement", "getMinRange", "setMinRange", "getMinorTickPosition", "setMinorTickPosition", "getTickPosition", "setTickPosition", "Ljava/lang/Boolean;", "getOpposite", "()Ljava/lang/Boolean;", "setOpposite", "(Ljava/lang/Boolean;)V", "getVisible", "setVisible", "getMinorGridLineColor", "setMinorGridLineColor", "getGridLineDashStyle", "setGridLineDashStyle", "getTickWidth", "setTickWidth", "getReversed", "setReversed", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "getPlotLines", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "setPlotLines", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;)V", "getLineWidth", "setLineWidth", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "getLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "setLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;)V", "getStartOnTick", "setStartOnTick", "getMinTickInterval", "setMinTickInterval", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "getCrosshair", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "setCrosshair", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;)V", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "getPlotBands", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "setPlotBands", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;)V", "getMinorTickColor", "setMinorTickColor", "getLinkedTo", "setLinkedTo", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAXAxis {
    private String[] categories;
    private AACrosshair crosshair;
    private String gridLineColor;
    private String gridLineDashStyle;
    private Float gridLineWidth;
    private AALabels labels;
    private String lineColor;
    private Float lineWidth;
    private Integer linkedTo;
    private Float max;
    private Float min;
    private Integer minRange;
    private Integer minTickInterval;
    private String minorGridLineColor;
    private String minorGridLineDashStyle;
    private Float minorGridLineWidth;
    private String minorTickColor;
    private Object minorTickInterval;
    private Float minorTickLength;
    private String minorTickPosition;
    private Float minorTickWidth;
    private Float off;
    private Boolean opposite;
    private AAPlotBandsElement[] plotBands;
    private AAPlotLinesElement[] plotLines;
    private Boolean reversed;
    private Boolean startOnTick;
    private String tickColor;
    private Integer tickInterval;
    private Float tickLength;
    private String tickPosition;
    private Float tickWidth;
    private String tickmarkPlacement;
    private String type;
    private Boolean visible;

    public final AAXAxis categories(String[] arrstring) {
        this.categories = arrstring;
        return this;
    }

    public final AAXAxis crosshair(AACrosshair aACrosshair) {
        i.e((Object)aACrosshair, (String)"prop");
        this.crosshair = aACrosshair;
        return this;
    }

    public final String[] getCategories() {
        return this.categories;
    }

    public final AACrosshair getCrosshair() {
        return this.crosshair;
    }

    public final String getGridLineColor() {
        return this.gridLineColor;
    }

    public final String getGridLineDashStyle() {
        return this.gridLineDashStyle;
    }

    public final Float getGridLineWidth() {
        return this.gridLineWidth;
    }

    public final AALabels getLabels() {
        return this.labels;
    }

    public final String getLineColor() {
        return this.lineColor;
    }

    public final Float getLineWidth() {
        return this.lineWidth;
    }

    public final Integer getLinkedTo() {
        return this.linkedTo;
    }

    public final Float getMax() {
        return this.max;
    }

    public final Float getMin() {
        return this.min;
    }

    public final Integer getMinRange() {
        return this.minRange;
    }

    public final Integer getMinTickInterval() {
        return this.minTickInterval;
    }

    public final String getMinorGridLineColor() {
        return this.minorGridLineColor;
    }

    public final String getMinorGridLineDashStyle() {
        return this.minorGridLineDashStyle;
    }

    public final Float getMinorGridLineWidth() {
        return this.minorGridLineWidth;
    }

    public final String getMinorTickColor() {
        return this.minorTickColor;
    }

    public final Object getMinorTickInterval() {
        return this.minorTickInterval;
    }

    public final Float getMinorTickLength() {
        return this.minorTickLength;
    }

    public final String getMinorTickPosition() {
        return this.minorTickPosition;
    }

    public final Float getMinorTickWidth() {
        return this.minorTickWidth;
    }

    public final Float getOff() {
        return this.off;
    }

    public final Boolean getOpposite() {
        return this.opposite;
    }

    public final AAPlotBandsElement[] getPlotBands() {
        return this.plotBands;
    }

    public final AAPlotLinesElement[] getPlotLines() {
        return this.plotLines;
    }

    public final Boolean getReversed() {
        return this.reversed;
    }

    public final Boolean getStartOnTick() {
        return this.startOnTick;
    }

    public final String getTickColor() {
        return this.tickColor;
    }

    public final Integer getTickInterval() {
        return this.tickInterval;
    }

    public final Float getTickLength() {
        return this.tickLength;
    }

    public final String getTickPosition() {
        return this.tickPosition;
    }

    public final Float getTickWidth() {
        return this.tickWidth;
    }

    public final String getTickmarkPlacement() {
        return this.tickmarkPlacement;
    }

    public final String getType() {
        return this.type;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final AAXAxis gridLineColor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.gridLineColor = string2;
        return this;
    }

    public final AAXAxis gridLineDashStyle(String string2) {
        i.e((Object)string2, (String)"prop");
        this.gridLineDashStyle = string2;
        return this;
    }

    public final AAXAxis gridLineWidth(Float f) {
        this.gridLineWidth = f;
        return this;
    }

    public final AAXAxis labels(AALabels aALabels) {
        i.e((Object)aALabels, (String)"prop");
        this.labels = aALabels;
        return this;
    }

    public final AAXAxis lineColor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.lineColor = string2;
        return this;
    }

    public final AAXAxis lineWidth(Float f) {
        this.lineWidth = f;
        return this;
    }

    public final AAXAxis linkedTo(Integer n) {
        this.linkedTo = n;
        return this;
    }

    public final AAXAxis max(Float f) {
        this.max = f;
        return this;
    }

    public final AAXAxis min(Float f) {
        this.min = f;
        return this;
    }

    public final AAXAxis minRange(Integer n) {
        this.minRange = n;
        return this;
    }

    public final AAXAxis minTickInterval(Integer n) {
        this.minTickInterval = n;
        return this;
    }

    public final AAXAxis minorGridLineColor(String string2) {
        this.minorGridLineColor = string2;
        return this;
    }

    public final AAXAxis minorGridLineDashStyle(String string2) {
        this.minorGridLineDashStyle = string2;
        return this;
    }

    public final AAXAxis minorGridLineWidth(Float f) {
        this.minorGridLineWidth = f;
        return this;
    }

    public final AAXAxis minorTickColor(String string2) {
        this.minorTickColor = string2;
        return this;
    }

    public final AAXAxis minorTickInterval(Object object) {
        this.minorTickInterval = object;
        return this;
    }

    public final AAXAxis minorTickLength(Float f) {
        this.minorTickLength = f;
        return this;
    }

    public final AAXAxis minorTickPosition(String string2) {
        this.minorTickPosition = string2;
        return this;
    }

    public final AAXAxis minorTickWidth(Float f) {
        this.minorTickWidth = f;
        return this;
    }

    public final AAXAxis off(Float f) {
        this.off = f;
        return this;
    }

    public final AAXAxis opposite(Boolean bl) {
        this.opposite = bl;
        return this;
    }

    public final AAXAxis plotBands(AAPlotBandsElement[] arraAPlotBandsElement) {
        i.e((Object)arraAPlotBandsElement, (String)"prop");
        this.plotBands = arraAPlotBandsElement;
        return this;
    }

    public final AAXAxis plotLines(AAPlotLinesElement[] arraAPlotLinesElement) {
        i.e((Object)arraAPlotLinesElement, (String)"prop");
        this.plotLines = arraAPlotLinesElement;
        return this;
    }

    public final AAXAxis reversed(Boolean bl) {
        this.reversed = bl;
        return this;
    }

    public final void setCategories(String[] arrstring) {
        this.categories = arrstring;
    }

    public final void setCrosshair(AACrosshair aACrosshair) {
        this.crosshair = aACrosshair;
    }

    public final void setGridLineColor(String string2) {
        this.gridLineColor = string2;
    }

    public final void setGridLineDashStyle(String string2) {
        this.gridLineDashStyle = string2;
    }

    public final void setGridLineWidth(Float f) {
        this.gridLineWidth = f;
    }

    public final void setLabels(AALabels aALabels) {
        this.labels = aALabels;
    }

    public final void setLineColor(String string2) {
        this.lineColor = string2;
    }

    public final void setLineWidth(Float f) {
        this.lineWidth = f;
    }

    public final void setLinkedTo(Integer n) {
        this.linkedTo = n;
    }

    public final void setMax(Float f) {
        this.max = f;
    }

    public final void setMin(Float f) {
        this.min = f;
    }

    public final void setMinRange(Integer n) {
        this.minRange = n;
    }

    public final void setMinTickInterval(Integer n) {
        this.minTickInterval = n;
    }

    public final void setMinorGridLineColor(String string2) {
        this.minorGridLineColor = string2;
    }

    public final void setMinorGridLineDashStyle(String string2) {
        this.minorGridLineDashStyle = string2;
    }

    public final void setMinorGridLineWidth(Float f) {
        this.minorGridLineWidth = f;
    }

    public final void setMinorTickColor(String string2) {
        this.minorTickColor = string2;
    }

    public final void setMinorTickInterval(Object object) {
        this.minorTickInterval = object;
    }

    public final void setMinorTickLength(Float f) {
        this.minorTickLength = f;
    }

    public final void setMinorTickPosition(String string2) {
        this.minorTickPosition = string2;
    }

    public final void setMinorTickWidth(Float f) {
        this.minorTickWidth = f;
    }

    public final void setOff(Float f) {
        this.off = f;
    }

    public final void setOpposite(Boolean bl) {
        this.opposite = bl;
    }

    public final void setPlotBands(AAPlotBandsElement[] arraAPlotBandsElement) {
        this.plotBands = arraAPlotBandsElement;
    }

    public final void setPlotLines(AAPlotLinesElement[] arraAPlotLinesElement) {
        this.plotLines = arraAPlotLinesElement;
    }

    public final void setReversed(Boolean bl) {
        this.reversed = bl;
    }

    public final void setStartOnTick(Boolean bl) {
        this.startOnTick = bl;
    }

    public final void setTickColor(String string2) {
        this.tickColor = string2;
    }

    public final void setTickInterval(Integer n) {
        this.tickInterval = n;
    }

    public final void setTickLength(Float f) {
        this.tickLength = f;
    }

    public final void setTickPosition(String string2) {
        this.tickPosition = string2;
    }

    public final void setTickWidth(Float f) {
        this.tickWidth = f;
    }

    public final void setTickmarkPlacement(String string2) {
        this.tickmarkPlacement = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setVisible(Boolean bl) {
        this.visible = bl;
    }

    public final AAXAxis startOnTick(Boolean bl) {
        this.startOnTick = bl;
        return this;
    }

    public final AAXAxis tickColor(String string2) {
        this.tickColor = string2;
        return this;
    }

    public final AAXAxis tickInterval(Integer n) {
        this.tickInterval = n;
        return this;
    }

    public final AAXAxis tickLength(Float f) {
        this.tickLength = f;
        return this;
    }

    public final AAXAxis tickPosition(String string2) {
        i.e((Object)string2, (String)"prop");
        this.tickPosition = string2;
        return this;
    }

    public final AAXAxis tickWidth(Float f) {
        this.tickWidth = f;
        return this;
    }

    public final AAXAxis tickmarkPlacement(String string2) {
        i.e((Object)string2, (String)"prop");
        this.tickmarkPlacement = string2;
        return this;
    }

    public final AAXAxis type(String string2) {
        i.e((Object)string2, (String)"prop");
        this.type = string2;
        return this;
    }

    public final AAXAxis visible(Boolean bl) {
        this.visible = bl;
        return this;
    }
}

