/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.InsetDrawable
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.R
 *  androidx.appcompat.R$id
 *  androidx.appcompat.app.AlertDialog
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.appcompat.widget.DialogTitle
 *  androidx.core.view.ViewCompat
 *  androidx.fragment.app.DialogFragment
 *  androidx.fragment.app.Fragment
 *  java.lang.CharSequence
 *  java.lang.String
 *  java.lang.Throwable
 *  tech.linjiang.pandora.core.R
 *  tech.linjiang.pandora.core.R$style
 *  tech.linjiang.pandora.ui.GeneralDialog$1
 *  tech.linjiang.pandora.ui.GeneralDialog$Creator
 *  tech.linjiang.pandora.util.ViewKnife
 */
package tech.linjiang.pandora.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.DialogTitle;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import tech.linjiang.pandora.core.R;
import tech.linjiang.pandora.ui.GeneralDialog;
import tech.linjiang.pandora.util.ViewKnife;

/*
 * Exception performing whole class analysis.
 */
public class GeneralDialog
extends DialogFragment
implements DialogInterface.OnClickListener {
    public static final String ATTR1 = "ATTR1";
    public static final String ATTR2 = "ATTR2";
    public static final String ATTR3 = "ATTR3";
    public static final String ATTR4 = "ATTR4";
    public static final String ATTR5 = "ATTR5";
    public static final String ATTR6 = "ATTR6";
    public static final String ATTR7 = "ATTR7";
    private AlertDialog.Builder builder;
    private int code;

    public GeneralDialog() {
        if (this.getArguments() == null) {
            this.setArguments(new Bundle());
        }
    }

    public static /* synthetic */ void access$000(GeneralDialog generalDialog, Window window) {
        generalDialog.transform(window);
    }

    public static Creator build(int n2) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void transform(Window window) {
        try {
            View view = window.findViewById(16908290);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float)ViewKnife.dip2px((float)10.0f));
            gradientDrawable.setColor(-1);
            ViewCompat.setBackground((View)view, (Drawable)gradientDrawable);
            DialogTitle dialogTitle = (DialogTitle)window.findViewById(R.id.alertTitle);
            TextView textView = (TextView)window.findViewById(16908299);
            Button button = (Button)window.findViewById(16908313);
            Button button2 = (Button)window.findViewById(16908314);
            Button button3 = (Button)window.findViewById(16908315);
            LinearLayout linearLayout = (LinearLayout)button.getParent();
            linearLayout.setShowDividers(2);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(-1710619);
            gradientDrawable2.setSize(ViewKnife.dip2px((float)0.5f), 0);
            linearLayout.setDividerDrawable((Drawable)gradientDrawable2);
            linearLayout.setPadding(0, 0, 0, 0);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setStroke(ViewKnife.dip2px((float)0.5f), -1710619);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable)gradientDrawable3, ViewKnife.dip2px((float)-1.0f), 0, ViewKnife.dip2px((float)-1.0f), ViewKnife.dip2px((float)-1.0f));
            ViewCompat.setBackground((View)linearLayout, (Drawable)insetDrawable);
            window.findViewById(R.id.spacer).setVisibility(8);
            View view2 = window.findViewById(R.id.textSpacerNoButtons);
            if (view2 != null) {
                view2.setVisibility(0);
            }
            button.setTextColor(-10785903);
            button2.setTextColor(-13290187);
            button3.setTextColor(-13290187);
            button.setPaintFlags(32);
            button2.setPaintFlags(32);
            button3.setPaintFlags(32);
            ((LinearLayout.LayoutParams)button3.getLayoutParams()).weight = 1.0f;
            ((LinearLayout.LayoutParams)button2.getLayoutParams()).weight = 1.0f;
            ((LinearLayout.LayoutParams)button.getLayoutParams()).weight = 1.0f;
            if (textView != null) {
                textView.setTextColor(-14671840);
                if (this.getArguments().getBoolean(ATTR7, false)) {
                    textView.setTextAlignment(4);
                }
            }
            dialogTitle.setTextColor(-13290187);
            dialogTitle.setPaintFlags(32);
            dialogTitle.setTextAlignment(4);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        if (n2 != -2) {
            if (n2 != -1) {
                return;
            }
            this.getParentFragment().onActivityResult(this.code, -1, null);
            return;
        }
        this.getParentFragment().onActivityResult(this.code, 0, null);
    }

    public void onCreate(@Nullable Bundle bundle) {
        String string;
        String string2;
        String string3;
        super.onCreate(bundle);
        this.builder = new AlertDialog.Builder(this.getContext(), R.style.PdTheme_Alert);
        String string4 = this.getArguments().getString(ATTR2);
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            this.builder.setTitle((CharSequence)string4);
        }
        if (!TextUtils.isEmpty((CharSequence)(string = this.getArguments().getString(ATTR3)))) {
            this.builder.setMessage((CharSequence)string);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = this.getArguments().getString(ATTR4)))) {
            this.builder.setNegativeButton((CharSequence)string2, (DialogInterface.OnClickListener)this);
        }
        if (!TextUtils.isEmpty((CharSequence)(string3 = this.getArguments().getString(ATTR5)))) {
            this.builder.setPositiveButton((CharSequence)string3, (DialogInterface.OnClickListener)this);
        }
        boolean bl = this.getArguments().getBoolean(ATTR6, true);
        this.builder.setCancelable(bl);
        this.builder.setOnKeyListener((DialogInterface.OnKeyListener)new 1(this, bl));
    }

    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        this.code = this.getArguments().getInt(ATTR1);
        return this.builder.create();
    }

    @SuppressLint(value={"RestrictedApi"})
    public final void setupDialog(Dialog dialog, int n2) {
        super.setupDialog(dialog, n2);
        dialog.create();
        this.transform(dialog.getWindow());
    }
}

