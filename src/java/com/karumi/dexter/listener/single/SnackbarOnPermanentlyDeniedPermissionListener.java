/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.google.android.material.snackbar.BaseTransientBottomBar
 *  com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback
 *  com.google.android.material.snackbar.Snackbar
 *  com.google.android.material.snackbar.Snackbar$Callback
 *  com.karumi.dexter.listener.PermissionDeniedResponse
 *  com.karumi.dexter.listener.SnackbarUtils
 *  com.karumi.dexter.listener.single.SnackbarOnPermanentlyDeniedPermissionListener$1
 *  java.lang.String
 */
package com.karumi.dexter.listener.single;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.SnackbarUtils;
import com.karumi.dexter.listener.single.BasePermissionListener;
import com.karumi.dexter.listener.single.SnackbarOnPermanentlyDeniedPermissionListener;

public class SnackbarOnPermanentlyDeniedPermissionListener
extends BasePermissionListener {
    private final String buttonText;
    private final int duration;
    private final View.OnClickListener onButtonClickListener;
    private final Snackbar.Callback snackbarCallback;
    private final String text;
    private final View view;

    private SnackbarOnPermanentlyDeniedPermissionListener(View view, String string, String string2, View.OnClickListener onClickListener, Snackbar.Callback callback, int n) {
        this.view = view;
        this.text = string;
        this.buttonText = string2;
        this.onButtonClickListener = onClickListener;
        this.snackbarCallback = callback;
        this.duration = n;
    }

    public /* synthetic */ SnackbarOnPermanentlyDeniedPermissionListener(View view, String string, String string2, View.OnClickListener onClickListener, Snackbar.Callback callback, int n, 1 var7_7) {
        this(view, string, string2, onClickListener, callback, n);
    }

    @Override
    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        super.onPermissionDenied(permissionDeniedResponse);
        if (permissionDeniedResponse.isPermanentlyDenied()) {
            SnackbarUtils.show((View)this.view, (String)this.text, (int)this.duration, (String)this.buttonText, (View.OnClickListener)this.onButtonClickListener, (BaseTransientBottomBar.BaseCallback)this.snackbarCallback);
        }
    }
}

