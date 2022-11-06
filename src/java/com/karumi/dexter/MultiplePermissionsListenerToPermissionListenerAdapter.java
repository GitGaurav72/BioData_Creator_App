/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.karumi.dexter.MultiplePermissionsReport
 *  com.karumi.dexter.PermissionToken
 *  com.karumi.dexter.listener.PermissionDeniedResponse
 *  com.karumi.dexter.listener.PermissionGrantedResponse
 *  com.karumi.dexter.listener.PermissionRequest
 *  com.karumi.dexter.listener.multi.MultiplePermissionsListener
 *  com.karumi.dexter.listener.single.PermissionListener
 *  java.lang.Object
 *  java.util.List
 */
package com.karumi.dexter;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.List;

public final class MultiplePermissionsListenerToPermissionListenerAdapter
implements MultiplePermissionsListener {
    private final PermissionListener listener;

    public MultiplePermissionsListenerToPermissionListenerAdapter(PermissionListener permissionListener) {
        this.listener = permissionListener;
    }

    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
        PermissionRequest permissionRequest = (PermissionRequest)list.get(0);
        this.listener.onPermissionRationaleShouldBeShown(permissionRequest, permissionToken);
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        List list = multiplePermissionsReport.getDeniedPermissionResponses();
        List list2 = multiplePermissionsReport.getGrantedPermissionResponses();
        if (!list.isEmpty()) {
            PermissionDeniedResponse permissionDeniedResponse = (PermissionDeniedResponse)list.get(0);
            this.listener.onPermissionDenied(permissionDeniedResponse);
            return;
        }
        PermissionGrantedResponse permissionGrantedResponse = (PermissionGrantedResponse)list2.get(0);
        this.listener.onPermissionGranted(permissionGrantedResponse);
    }
}

