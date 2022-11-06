/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.Button
 *  androidx.annotation.RestrictTo
 *  androidx.annotation.RestrictTo$Scope
 *  androidx.appcompat.widget.AppCompatCheckBox
 *  com.afollestad.materialdialogs.internal.button.DialogActionButton
 *  com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  k.d0.g
 *  k.x.c.i
 */
package e.a.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import k.d0.g;
import k.x.c.i;

public final class c {
    public static final float a(View view, int n2) {
        i.f((Object)view, (String)"$this$dp");
        float f = n2;
        Resources resources = view.getResources();
        i.b((Object)resources, (String)"resources");
        return TypedValue.applyDimension((int)1, (float)f, (DisplayMetrics)resources.getDisplayMetrics());
    }

    public static final int b(Context context, int n2) {
        i.e((Object)context, (String)"$this$getAttrId");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(n2, typedValue, true)) {
            return -1;
        }
        return typedValue.resourceId;
    }

    public static final boolean c(Context context) {
        Configuration configuration;
        Resources resources;
        return context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 1;
    }

    public static final <T extends View> boolean d(T t) {
        i.f(t, (String)"$this$isRtl");
        Resources resources = t.getResources();
        i.b((Object)resources, (String)"resources");
        Configuration configuration = resources.getConfiguration();
        i.b((Object)configuration, (String)"resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    public static final boolean e(Context context) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            return resources.getBoolean(2130968600);
        }
        return false;
    }

    public static final <T extends View> boolean f(T t) {
        boolean bl;
        block3 : {
            block4 : {
                block2 : {
                    i.f(t, (String)"$this$isVisible");
                    if (!(t instanceof Button)) break block2;
                    Button button = (Button)t;
                    int n2 = button.getVisibility();
                    bl = false;
                    if (n2 != 0) break block3;
                    CharSequence charSequence = button.getText();
                    i.b((Object)charSequence, (String)"this.text");
                    boolean bl2 = true ^ g.n((CharSequence)g.O((CharSequence)charSequence));
                    bl = false;
                    if (!bl2) break block3;
                    break block4;
                }
                int n3 = t.getVisibility();
                bl = false;
                if (n3 != 0) break block3;
            }
            bl = true;
        }
        return bl;
    }

    @RestrictTo(value={RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean g(DialogActionButtonLayout dialogActionButtonLayout) {
        boolean bl;
        block5 : {
            block4 : {
                if (dialogActionButtonLayout == null) {
                    return false;
                }
                boolean bl2 = dialogActionButtonLayout.getVisibleButtons().length == 0;
                if (bl2 ^ true) break block4;
                boolean bl3 = c.f(dialogActionButtonLayout.getCheckBoxPrompt());
                bl = false;
                if (!bl3) break block5;
            }
            bl = true;
        }
        return bl;
    }
}

