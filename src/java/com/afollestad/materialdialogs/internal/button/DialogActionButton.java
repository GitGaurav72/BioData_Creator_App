/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.Button
 *  androidx.appcompat.widget.AppCompatButton
 *  java.lang.Object
 *  kotlin.Metadata
 */
package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatButton;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\t\u00a8\u0006\u0013"}, d2={"Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "enabled", "Lk/q;", "setEnabled", "(Z)V", "", "k", "I", "enabledColor", "l", "disabledColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k=1, mv={1, 4, 0})
public final class DialogActionButton
extends AppCompatButton {
    public int k;
    public int l;

    public DialogActionButton(Context context, AttributeSet attributeSet) {
        i.f((Object)context, "context");
        super(context, attributeSet);
        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setEnabled(boolean bl) {
        Button.super.setEnabled(bl);
        int n = bl ? this.k : this.l;
        this.setTextColor(n);
    }
}

