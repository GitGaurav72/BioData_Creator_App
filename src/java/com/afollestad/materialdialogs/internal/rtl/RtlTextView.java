/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatTextView
 *  java.lang.Object
 *  kotlin.Metadata
 */
package com.afollestad.materialdialogs.internal.rtl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lcom/afollestad/materialdialogs/internal/rtl/RtlTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k=1, mv={1, 4, 0})
public final class RtlTextView
extends AppCompatTextView {
    public RtlTextView(Context context, AttributeSet attributeSet) {
        i.f((Object)context, "context");
        super(context, attributeSet);
        i.f((Object)this, "$this$setGravityStartCompat");
        this.setTextAlignment(5);
        this.setGravity(8388627);
    }
}

