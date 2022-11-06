/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.drawable.Drawable
 *  com.karumi.dexter.listener.OnDialogButtonClickListener
 *  com.karumi.dexter.listener.PermissionDeniedResponse
 *  com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener$1
 *  java.lang.CharSequence
 *  java.lang.String
 */
package com.karumi.dexter.listener.single;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.karumi.dexter.listener.OnDialogButtonClickListener;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.single.BasePermissionListener;
import com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener;

public class DialogOnDeniedPermissionListener
extends BasePermissionListener {
    private final Context context;
    private final Drawable icon;
    private final String message;
    private final OnDialogButtonClickListener onDialogButtonClickListener;
    private final String positiveButtonText;
    private final String title;

    private DialogOnDeniedPermissionListener(Context context, String string, String string2, String string3, Drawable drawable, OnDialogButtonClickListener onDialogButtonClickListener) {
        this.context = context;
        this.title = string;
        this.message = string2;
        this.positiveButtonText = string3;
        this.icon = drawable;
        this.onDialogButtonClickListener = onDialogButtonClickListener;
    }

    public /* synthetic */ DialogOnDeniedPermissionListener(Context context, String string, String string2, String string3, Drawable drawable, OnDialogButtonClickListener onDialogButtonClickListener, 1 var7_7) {
        this(context, string, string2, string3, drawable, onDialogButtonClickListener);
    }

    public static /* synthetic */ OnDialogButtonClickListener access$000(DialogOnDeniedPermissionListener dialogOnDeniedPermissionListener) {
        return dialogOnDeniedPermissionListener.onDialogButtonClickListener;
    }

    @Override
    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        super.onPermissionDenied(permissionDeniedResponse);
        new AlertDialog.Builder(this.context).setTitle((CharSequence)this.title).setMessage((CharSequence)this.message).setPositiveButton((CharSequence)this.positiveButtonText, (DialogInterface.OnClickListener)new 1(this)).setIcon(this.icon).show();
    }
}

