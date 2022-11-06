/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.appcompat.app.AlertDialog
 *  androidx.appcompat.app.AlertDialog$Builder
 *  com.github.dhaval2404.imagepicker.util.DialogHelper$showChooseAppDialog
 *  com.github.dhaval2404.imagepicker.util.DialogHelper$showChooseAppDialog$dialog
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.dhaval2404.imagepicker.util;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import com.github.dhaval2404.imagepicker.R;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.github.dhaval2404.imagepicker.listener.ResultListener;
import com.github.dhaval2404.imagepicker.util.DialogHelper;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2={"Lcom/github/dhaval2404/imagepicker/util/DialogHelper;", "", "Landroid/content/Context;", "context", "Lcom/github/dhaval2404/imagepicker/listener/ResultListener;", "Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;", "listener", "Lk/q;", "showChooseAppDialog", "(Landroid/content/Context;Lcom/github/dhaval2404/imagepicker/listener/ResultListener;)V", "<init>", "()V", "imagepicker_release"}, k=1, mv={1, 4, 0})
public final class DialogHelper {
    public static final DialogHelper INSTANCE = new DialogHelper();

    private DialogHelper() {
    }

    public final void showChooseAppDialog(Context context, ResultListener<ImageProvider> resultListener) {
        i.f((Object)context, (String)"context");
        i.f(resultListener, (String)"listener");
        View view = LayoutInflater.from((Context)context).inflate(R.layout.dialog_choose_app, null);
        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(R.string.title_choose_image_provider).setView(view).setOnCancelListener(new DialogInterface.OnCancelListener(resultListener){
            public final /* synthetic */ ResultListener $listener;
            {
                this.$listener = resultListener;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.$listener.onResult(null);
            }
        }).setNegativeButton(R.string.action_cancel, new DialogInterface.OnClickListener(resultListener){
            public final /* synthetic */ ResultListener $listener;
            {
                this.$listener = resultListener;
            }

            public final void onClick(DialogInterface dialogInterface, int n2) {
                this.$listener.onResult(null);
            }
        }).show();
        i.b((Object)view, (String)"customView");
        ((LinearLayout)view.findViewById(R.id.lytCameraPick)).setOnClickListener(new View.OnClickListener(resultListener, alertDialog){
            public final /* synthetic */ AlertDialog $dialog;
            public final /* synthetic */ ResultListener $listener;
            {
                this.$listener = resultListener;
                this.$dialog = alertDialog;
            }

            public final void onClick(View view) {
                this.$listener.onResult(ImageProvider.CAMERA);
                this.$dialog.dismiss();
            }
        });
        ((LinearLayout)view.findViewById(R.id.lytGalleryPick)).setOnClickListener(new View.OnClickListener(resultListener, alertDialog){
            public final /* synthetic */ AlertDialog $dialog;
            public final /* synthetic */ ResultListener $listener;
            {
                this.$listener = resultListener;
                this.$dialog = alertDialog;
            }

            public final void onClick(View view) {
                this.$listener.onResult(ImageProvider.GALLERY);
                this.$dialog.dismiss();
            }
        });
    }
}

