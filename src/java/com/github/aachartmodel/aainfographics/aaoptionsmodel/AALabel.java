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

import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "", "", "prop", "text", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "style", "(Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "Ljava/lang/Object;", "getStyle", "()Ljava/lang/Object;", "setStyle", "(Ljava/lang/Object;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AALabel {
    private Object style;
    private String text;

    public final Object getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final void setStyle(Object object) {
        this.style = object;
    }

    public final void setText(String string2) {
        this.text = string2;
    }

    public final AALabel style(Object object) {
        i.e((Object)object, (String)"prop");
        this.style = object;
        return this;
    }

    public final AALabel text(String string2) {
        i.e((Object)string2, (String)"prop");
        this.text = string2;
        return this;
    }
}

