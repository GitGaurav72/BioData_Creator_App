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

import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u000b\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\r\u00a8\u0006\u0010"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "", "", "prop", "color", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "", "offsetX", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "offsetY", "opacity", "width", "Ljava/lang/Float;", "Ljava/lang/String;", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAShadow {
    private String color;
    private Float offsetX;
    private Float offsetY;
    private Float opacity;
    private Float width;

    public final AAShadow color(String string2) {
        i.e((Object)string2, (String)"prop");
        this.color = string2;
        return this;
    }

    public final AAShadow offsetX(Float f) {
        this.offsetX = f;
        return this;
    }

    public final AAShadow offsetY(Float f) {
        this.offsetY = f;
        return this;
    }

    public final AAShadow opacity(Float f) {
        this.opacity = f;
        return this;
    }

    public final AAShadow width(Float f) {
        this.width = f;
        return this;
    }
}

