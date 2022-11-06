/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  androidx.annotation.RestrictTo
 *  androidx.annotation.RestrictTo$Scope
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 */
package e.a.a.e.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import e.a.a.b;
import k.x.c.i;

@RestrictTo(value={RestrictTo.Scope.LIBRARY_GROUP})
public abstract class a
extends ViewGroup {
    public final Paint k;
    public final int l;
    public boolean m;

    public a(Context context, AttributeSet attributeSet) {
        Paint paint;
        i.f((Object)context, (String)"context");
        super(context, attributeSet);
        this.k = paint = new Paint();
        i.f((Object)((Object)this), (String)"$this$dimenPx");
        Context context2 = this.getContext();
        i.b((Object)context2, (String)"context");
        this.l = context2.getResources().getDimensionPixelSize(2131100031);
        this.setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(2131100031));
        paint.setAntiAlias(true);
    }

    private final int getDividerColor() {
        i.m((String)"dialog");
        throw null;
    }

    public final Paint a() {
        this.k.setColor(this.getDividerColor());
        return this.k;
    }

    public final b getDialog() {
        i.m((String)"dialog");
        throw null;
    }

    public final int getDividerHeight() {
        return this.l;
    }

    public final boolean getDrawDivider() {
        return this.m;
    }

    public final void setDialog(b b2) {
        i.f((Object)((Object)b2), (String)"<set-?>");
    }

    public final void setDrawDivider(boolean bl) {
        this.m = bl;
        this.invalidate();
    }
}

