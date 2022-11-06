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
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\bu\u0018\u00002\u00020\u0001B\t\u00a2\u0006\u0006\b\u00a9\u0001\u0010\u00aa\u0001J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r\u00a2\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r\u00a2\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r\u00a2\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b\u001e\u0010\u0015J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r\u00a2\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010 \u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b \u0010\u0015J\u0017\u0010!\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b!\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b\"\u0010\u0015J\u0017\u0010#\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b#\u0010\u0015J\u0017\u0010%\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b(\u0010\u0017J\u0017\u0010)\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b)\u0010\u0017J\u0017\u0010*\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b*\u0010\u0015J\u0017\u0010+\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b+\u0010\u0017J\u0017\u0010,\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b.\u0010\u0015J\u0017\u0010/\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b/\u0010\u0017J\u0017\u00100\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b0\u0010\u0015J\u001b\u00101\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b3\u0010\u0012J\u0017\u00104\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b4\u0010\u0012J\u0017\u00105\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\b5\u0010&J\u0015\u00107\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000206\u00a2\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r\u00a2\u0006\u0004\b9\u0010\u0017J\u0017\u0010:\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b:\u0010\u0015J\u0017\u0010;\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b;\u0010\u0015J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r\u00a2\u0006\u0004\b<\u0010\u0017R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010'\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010,\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b,\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001e\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u00109\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b9\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010;\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b;\u0010L\u001a\u0004\bV\u0010N\"\u0004\bW\u0010PR$\u0010\"\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010L\u001a\u0004\bX\u0010N\"\u0004\bY\u0010PR$\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010Q\u001a\u0004\bZ\u0010S\"\u0004\b[\u0010UR$\u0010.\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b.\u0010L\u001a\u0004\b\\\u0010N\"\u0004\b]\u0010PR$\u0010 \u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b \u0010L\u001a\u0004\b^\u0010N\"\u0004\b_\u0010PR$\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010Q\u001a\u0004\b`\u0010S\"\u0004\ba\u0010UR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010<\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b<\u0010Q\u001a\u0004\bg\u0010S\"\u0004\bh\u0010UR$\u00103\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b3\u0010b\u001a\u0004\bi\u0010d\"\u0004\bj\u0010fR*\u00101\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b1\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010:\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b:\u0010L\u001a\u0004\bp\u0010N\"\u0004\bq\u0010PR$\u0010)\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b)\u0010Q\u001a\u0004\br\u0010S\"\u0004\bs\u0010UR$\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u0010Q\u001a\u0004\bt\u0010S\"\u0004\bu\u0010UR$\u0010+\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b+\u0010Q\u001a\u0004\bv\u0010S\"\u0004\bw\u0010UR$\u0010(\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b(\u0010Q\u001a\u0004\bx\u0010S\"\u0004\by\u0010UR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R%\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0013\n\u0004\b\u0014\u0010L\u001a\u0004\b\u0010N\"\u0005\b\u0001\u0010PR&\u00100\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b0\u0010L\u001a\u0005\b\u0081\u0001\u0010N\"\u0005\b\u0082\u0001\u0010PR&\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b\u001f\u0010Q\u001a\u0005\b\u0083\u0001\u0010S\"\u0005\b\u0084\u0001\u0010UR&\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b\u0016\u0010Q\u001a\u0005\b\u0085\u0001\u0010S\"\u0005\b\u0086\u0001\u0010UR&\u0010!\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b!\u0010b\u001a\u0005\b\u0087\u0001\u0010d\"\u0005\b\u0088\u0001\u0010fR&\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b%\u0010B\u001a\u0005\b\u0089\u0001\u0010D\"\u0005\b\u008a\u0001\u0010FR)\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\b\u001c\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010#\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b#\u0010L\u001a\u0005\b\u0090\u0001\u0010N\"\u0005\b\u0091\u0001\u0010PR&\u0010*\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b*\u0010L\u001a\u0005\b\u0092\u0001\u0010N\"\u0005\b\u0093\u0001\u0010PR/\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\b\b\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R/\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\b\u000b\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u0010/\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b/\u0010Q\u001a\u0005\b\u009e\u0001\u0010S\"\u0005\b\u009f\u0001\u0010UR&\u00104\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b4\u0010b\u001a\u0005\b\u00a0\u0001\u0010d\"\u0005\b\u00a1\u0001\u0010fR)\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\b7\u0010\u00a2\u0001\u001a\u0006\b\u00a3\u0001\u0010\u00a4\u0001\"\u0006\b\u00a5\u0001\u0010\u00a6\u0001R&\u00105\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b5\u0010B\u001a\u0005\b\u00a7\u0001\u0010D\"\u0005\b\u00a8\u0001\u0010F\u00a8\u0006\u00ab\u0001"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "prop", "title", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "plotBands", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "plotLines", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "", "categories", "([Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "", "reversed", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "", "gridLineWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "gridLineColor", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "gridLineDashStyle", "alternateGridColor", "gridLineInterpolation", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "labels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "lineWidth", "lineColor", "off", "allowDecimals", "max", "min", "", "minRange", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "minTickInterval", "minorGridLineColor", "minorGridLineDashStyle", "minorGridLineWidth", "minorTickColor", "minorTickInterval", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "minorTickLength", "minorTickPosition", "minorTickWidth", "tickPositions", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "visible", "opposite", "tickInterval", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "crosshair", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "stackLabels", "tickWidth", "tickLength", "tickPosition", "[Ljava/lang/String;", "getCategories", "()[Ljava/lang/String;", "setCategories", "([Ljava/lang/String;)V", "Ljava/lang/Integer;", "getMinTickInterval", "()Ljava/lang/Integer;", "setMinTickInterval", "(Ljava/lang/Integer;)V", "Ljava/lang/Object;", "getMinorTickInterval", "()Ljava/lang/Object;", "setMinorTickInterval", "(Ljava/lang/Object;)V", "Ljava/lang/Float;", "getLineWidth", "()Ljava/lang/Float;", "setLineWidth", "(Ljava/lang/Float;)V", "Ljava/lang/String;", "getStackLabels", "()Ljava/lang/String;", "setStackLabels", "(Ljava/lang/String;)V", "getTickLength", "setTickLength", "getMax", "setMax", "getGridLineInterpolation", "setGridLineInterpolation", "getMinorTickLength", "setMinorTickLength", "getOff", "setOff", "getAlternateGridColor", "setAlternateGridColor", "Ljava/lang/Boolean;", "getReversed", "()Ljava/lang/Boolean;", "setReversed", "(Ljava/lang/Boolean;)V", "getTickPosition", "setTickPosition", "getVisible", "setVisible", "[Ljava/lang/Object;", "getTickPositions", "()[Ljava/lang/Object;", "setTickPositions", "([Ljava/lang/Object;)V", "getTickWidth", "setTickWidth", "getMinorGridLineDashStyle", "setMinorGridLineDashStyle", "getGridLineDashStyle", "setGridLineDashStyle", "getMinorTickColor", "setMinorTickColor", "getMinorGridLineColor", "setMinorGridLineColor", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "getTitle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "setTitle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;)V", "getGridLineWidth", "setGridLineWidth", "getMinorTickWidth", "setMinorTickWidth", "getLineColor", "setLineColor", "getGridLineColor", "setGridLineColor", "getAllowDecimals", "setAllowDecimals", "getMinRange", "setMinRange", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "getLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "setLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;)V", "getMin", "setMin", "getMinorGridLineWidth", "setMinorGridLineWidth", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "getPlotBands", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "setPlotBands", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;)V", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "getPlotLines", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "setPlotLines", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;)V", "getMinorTickPosition", "setMinorTickPosition", "getOpposite", "setOpposite", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "getCrosshair", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "setCrosshair", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;)V", "getTickInterval", "setTickInterval", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAYAxis {
    private Boolean allowDecimals;
    private String alternateGridColor;
    private String[] categories;
    private AACrosshair crosshair;
    private String gridLineColor;
    private String gridLineDashStyle;
    private String gridLineInterpolation;
    private Float gridLineWidth;
    private AALabels labels;
    private String lineColor;
    private Float lineWidth;
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
    private String stackLabels;
    private Integer tickInterval;
    private Float tickLength;
    private String tickPosition;
    private Object[] tickPositions;
    private Float tickWidth;
    private AATitle title;
    private Boolean visible;

    public final AAYAxis allowDecimals(Boolean bl) {
        this.allowDecimals = bl;
        return this;
    }

    public final AAYAxis alternateGridColor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.alternateGridColor = string2;
        return this;
    }

    public final AAYAxis categories(String[] arrstring) {
        i.e((Object)arrstring, (String)"prop");
        this.categories = arrstring;
        return this;
    }

    public final AAYAxis crosshair(AACrosshair aACrosshair) {
        i.e((Object)aACrosshair, (String)"prop");
        this.crosshair = aACrosshair;
        return this;
    }

    public final Boolean getAllowDecimals() {
        return this.allowDecimals;
    }

    public final String getAlternateGridColor() {
        return this.alternateGridColor;
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

    public final String getGridLineInterpolation() {
        return this.gridLineInterpolation;
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

    public final String getStackLabels() {
        return this.stackLabels;
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

    public final Object[] getTickPositions() {
        return this.tickPositions;
    }

    public final Float getTickWidth() {
        return this.tickWidth;
    }

    public final AATitle getTitle() {
        return this.title;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final AAYAxis gridLineColor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.gridLineColor = string2;
        return this;
    }

    public final AAYAxis gridLineDashStyle(String string2) {
        i.e((Object)string2, (String)"prop");
        this.gridLineDashStyle = string2;
        return this;
    }

    public final AAYAxis gridLineInterpolation(String string2) {
        i.e((Object)string2, (String)"prop");
        this.gridLineInterpolation = string2;
        return this;
    }

    public final AAYAxis gridLineWidth(Float f) {
        this.gridLineWidth = f;
        return this;
    }

    public final AAYAxis labels(AALabels aALabels) {
        i.e((Object)aALabels, (String)"prop");
        this.labels = aALabels;
        return this;
    }

    public final AAYAxis lineColor(String string2) {
        i.e((Object)string2, (String)"prop");
        this.lineColor = string2;
        return this;
    }

    public final AAYAxis lineWidth(Float f) {
        this.lineWidth = f;
        return this;
    }

    public final AAYAxis max(Float f) {
        this.max = f;
        return this;
    }

    public final AAYAxis min(Float f) {
        this.min = f;
        return this;
    }

    public final AAYAxis minRange(Integer n) {
        this.minRange = n;
        return this;
    }

    public final AAYAxis minTickInterval(Integer n) {
        this.minTickInterval = n;
        return this;
    }

    public final AAYAxis minorGridLineColor(String string2) {
        this.minorGridLineColor = string2;
        return this;
    }

    public final AAYAxis minorGridLineDashStyle(String string2) {
        this.minorGridLineDashStyle = string2;
        return this;
    }

    public final AAYAxis minorGridLineWidth(Float f) {
        this.minorGridLineWidth = f;
        return this;
    }

    public final AAYAxis minorTickColor(String string2) {
        this.minorTickColor = string2;
        return this;
    }

    public final AAYAxis minorTickInterval(Object object) {
        this.minorTickInterval = object;
        return this;
    }

    public final AAYAxis minorTickLength(Float f) {
        this.minorTickLength = f;
        return this;
    }

    public final AAYAxis minorTickPosition(String string2) {
        this.minorTickPosition = string2;
        return this;
    }

    public final AAYAxis minorTickWidth(Float f) {
        this.minorTickWidth = f;
        return this;
    }

    public final AAYAxis off(Float f) {
        this.off = f;
        return this;
    }

    public final AAYAxis opposite(Boolean bl) {
        this.opposite = bl;
        return this;
    }

    public final AAYAxis plotBands(AAPlotBandsElement[] arraAPlotBandsElement) {
        i.e((Object)arraAPlotBandsElement, (String)"prop");
        this.plotBands = arraAPlotBandsElement;
        return this;
    }

    public final AAYAxis plotLines(AAPlotLinesElement[] arraAPlotLinesElement) {
        i.e((Object)arraAPlotLinesElement, (String)"prop");
        this.plotLines = arraAPlotLinesElement;
        return this;
    }

    public final AAYAxis reversed(Boolean bl) {
        this.reversed = bl;
        return this;
    }

    public final void setAllowDecimals(Boolean bl) {
        this.allowDecimals = bl;
    }

    public final void setAlternateGridColor(String string2) {
        this.alternateGridColor = string2;
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

    public final void setGridLineInterpolation(String string2) {
        this.gridLineInterpolation = string2;
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

    public final void setStackLabels(String string2) {
        this.stackLabels = string2;
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

    public final void setTickPositions(Object[] arrobject) {
        this.tickPositions = arrobject;
    }

    public final void setTickWidth(Float f) {
        this.tickWidth = f;
    }

    public final void setTitle(AATitle aATitle) {
        this.title = aATitle;
    }

    public final void setVisible(Boolean bl) {
        this.visible = bl;
    }

    public final AAYAxis stackLabels(String string2) {
        i.e((Object)string2, (String)"prop");
        this.stackLabels = string2;
        return this;
    }

    public final AAYAxis tickInterval(Integer n) {
        this.tickInterval = n;
        return this;
    }

    public final AAYAxis tickLength(Float f) {
        this.tickLength = f;
        return this;
    }

    public final AAYAxis tickPosition(String string2) {
        i.e((Object)string2, (String)"prop");
        this.tickPosition = string2;
        return this;
    }

    public final AAYAxis tickPositions(Object[] arrobject) {
        i.e((Object)arrobject, (String)"prop");
        this.tickPositions = arrobject;
        return this;
    }

    public final AAYAxis tickWidth(Float f) {
        this.tickWidth = f;
        return this;
    }

    public final AAYAxis title(AATitle aATitle) {
        i.e((Object)aATitle, (String)"prop");
        this.title = aATitle;
        return this;
    }

    public final AAYAxis visible(Boolean bl) {
        this.visible = bl;
        return this;
    }
}

