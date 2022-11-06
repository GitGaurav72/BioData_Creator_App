/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  androidx.appcompat.widget.AppCompatTextView
 *  androidx.core.view.ViewCompat
 *  java.lang.CharSequence
 *  tech.linjiang.pandora.util.Config
 *  tech.linjiang.pandora.util.Utils
 *  tech.linjiang.pandora.util.ViewKnife
 */
package tech.linjiang.pandora.inspector;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import tech.linjiang.pandora.util.Config;
import tech.linjiang.pandora.util.Utils;
import tech.linjiang.pandora.util.ViewKnife;

public class CurInfoView
extends AppCompatTextView {
    private static CharSequence lastInfo;

    public CurInfoView(Context context) {
        super(context);
        this.setBackgroundColor(1862270976);
        this.setTextSize(14.0f);
        this.setTextColor(-1);
        this.setGravity(17);
        this.setPadding(ViewKnife.dip2px((float)4.0f), 0, ViewKnife.dip2px((float)4.0f), 0);
    }

    private void close() {
        Utils.removeViewFromWindow((View)this);
    }

    private void open() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int n2 = Build.VERSION.SDK_INT < 26 ? 2003 : 2038;
        layoutParams.type = n2;
        layoutParams.flags = 24;
        layoutParams.format = -3;
        layoutParams.gravity = Config.getUI_ACTIVITY_GRAVITY();
        Utils.addViewToWindow((View)this, (WindowManager.LayoutParams)layoutParams);
    }

    public boolean isOpen() {
        return ViewCompat.isAttachedToWindow((View)this);
    }

    public void toggle() {
        if (this.isOpen()) {
            this.close();
            return;
        }
        this.open();
    }

    public void updateText(CharSequence charSequence) {
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            lastInfo = this.getText();
        } else {
            charSequence = lastInfo;
        }
        this.setText(charSequence);
    }
}

