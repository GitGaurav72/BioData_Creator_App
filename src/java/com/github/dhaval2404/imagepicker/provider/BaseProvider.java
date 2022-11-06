/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Bundle
 *  android.widget.Toast
 *  com.github.dhaval2404.imagepicker.ImagePickerActivity
 *  java.lang.Object
 *  java.lang.String
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.dhaval2404.imagepicker.provider;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.widget.Toast;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0004\u00a2\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0004\u00a2\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0004\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u00158\u0004@\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001c"}, d2={"Lcom/github/dhaval2404/imagepicker/provider/BaseProvider;", "Landroid/content/ContextWrapper;", "", "error", "Lk/q;", "setError", "(Ljava/lang/String;)V", "", "errorRes", "(I)V", "messageRes", "showToast", "setResultCancel", "()V", "onFailure", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onRestoreInstanceState", "Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "activity", "Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "getActivity", "()Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "<init>", "(Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;)V", "imagepicker_release"}, k=1, mv={1, 4, 0})
public abstract class BaseProvider
extends ContextWrapper {
    private final ImagePickerActivity activity;

    public BaseProvider(ImagePickerActivity imagePickerActivity) {
        i.f((Object)imagePickerActivity, (String)"activity");
        super((Context)imagePickerActivity);
        this.activity = imagePickerActivity;
    }

    public final ImagePickerActivity getActivity() {
        return this.activity;
    }

    public void onFailure() {
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        i.f((Object)bundle, (String)"outState");
    }

    public final void setError(int n2) {
        String string2 = this.getString(n2);
        i.b((Object)string2, (String)"getString(errorRes)");
        this.setError(string2);
    }

    public final void setError(String string2) {
        i.f((Object)string2, (String)"error");
        this.onFailure();
        this.activity.setError(string2);
    }

    public final void setResultCancel() {
        this.onFailure();
        this.activity.setResultCancel();
    }

    public final void showToast(int n2) {
        Toast.makeText((Context)this, (int)n2, (int)0).show();
    }
}

