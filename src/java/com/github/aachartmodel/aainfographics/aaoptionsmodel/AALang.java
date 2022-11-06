/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0005R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b\u00a8\u0006\u0010"}, d2={"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", "", "", "prop", "resetZoom", "(Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", "thousandsSep", "Ljava/lang/String;", "getThousandsSep", "()Ljava/lang/String;", "setThousandsSep", "(Ljava/lang/String;)V", "getResetZoom", "setResetZoom", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AALang {
    private String resetZoom;
    private String thousandsSep;

    public final String getResetZoom() {
        return this.resetZoom;
    }

    public final String getThousandsSep() {
        return this.thousandsSep;
    }

    public final AALang resetZoom(String string2) {
        this.resetZoom = string2;
        return this;
    }

    public final void setResetZoom(String string2) {
        this.resetZoom = string2;
    }

    public final void setThousandsSep(String string2) {
        this.thousandsSep = string2;
    }

    public final AALang thousandsSep(String string2) {
        this.thousandsSep = string2;
        return this;
    }
}

