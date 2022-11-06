/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPosition;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b&\u0010'J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u000f\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006("}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "", "", "prop", "enabled", "(Z)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "", "href", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "position", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getHref", "setHref", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "getPosition", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "setPosition", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;)V", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AACredits {
    private Boolean enabled;
    private String href;
    private AAPosition position;
    private AAStyle style;
    private String text;

    public final AACredits enabled(boolean bl) {
        this.enabled = bl;
        return this;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getHref() {
        return this.href;
    }

    public final AAPosition getPosition() {
        return this.position;
    }

    public final AAStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final AACredits href(String string2) {
        this.href = string2;
        return this;
    }

    public final AACredits position(AAPosition aAPosition) {
        this.position = aAPosition;
        return this;
    }

    public final void setEnabled(Boolean bl) {
        this.enabled = bl;
    }

    public final void setHref(String string2) {
        this.href = string2;
    }

    public final void setPosition(AAPosition aAPosition) {
        this.position = aAPosition;
    }

    public final void setStyle(AAStyle aAStyle) {
        this.style = aAStyle;
    }

    public final void setText(String string2) {
        this.text = string2;
    }

    public final AACredits style(AAStyle aAStyle) {
        this.style = aAStyle;
        return this;
    }

    public final AACredits text(String string2) {
        this.text = string2;
        return this;
    }
}

