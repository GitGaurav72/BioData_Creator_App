/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.karumi.dexter.MultiplePermissionsReport
 *  com.karumi.dexter.PermissionToken
 *  com.karumi.dexter.listener.PermissionRequest
 *  com.karumi.dexter.listener.multi.MultiplePermissionsListener
 *  java.lang.Object
 *  java.util.List
 */
package com.karumi.dexter.listener.multi;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import java.util.List;

public class BaseMultiplePermissionsListener
implements MultiplePermissionsListener {
    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
        permissionToken.continuePermissionRequest();
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
    }
}

