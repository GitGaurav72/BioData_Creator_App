/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.karumi.dexter.MultiplePermissionListenerThreadDecorator$1
 *  com.karumi.dexter.MultiplePermissionListenerThreadDecorator$2
 *  com.karumi.dexter.MultiplePermissionsReport
 *  com.karumi.dexter.PermissionToken
 *  com.karumi.dexter.Thread
 *  com.karumi.dexter.listener.PermissionRequest
 *  com.karumi.dexter.listener.multi.MultiplePermissionsListener
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.List
 */
package com.karumi.dexter;

import com.karumi.dexter.MultiplePermissionListenerThreadDecorator;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.Thread;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import java.util.List;

public final class MultiplePermissionListenerThreadDecorator
implements MultiplePermissionsListener {
    private final MultiplePermissionsListener listener;
    private final Thread thread;

    public MultiplePermissionListenerThreadDecorator(MultiplePermissionsListener multiplePermissionsListener, Thread thread) {
        this.thread = thread;
        this.listener = multiplePermissionsListener;
    }

    public static /* synthetic */ MultiplePermissionsListener access$000(MultiplePermissionListenerThreadDecorator multiplePermissionListenerThreadDecorator) {
        return multiplePermissionListenerThreadDecorator.listener;
    }

    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
        this.thread.execute((Runnable)new 2(this, list, permissionToken));
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        this.thread.execute((Runnable)new 1(this, multiplePermissionsReport));
    }
}

