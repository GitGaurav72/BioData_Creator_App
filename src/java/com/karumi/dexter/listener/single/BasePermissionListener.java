/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.karumi.dexter.PermissionToken
 *  com.karumi.dexter.listener.PermissionDeniedResponse
 *  com.karumi.dexter.listener.PermissionGrantedResponse
 *  com.karumi.dexter.listener.PermissionRequest
 *  com.karumi.dexter.listener.single.PermissionListener
 *  java.lang.Object
 */
package com.karumi.dexter.listener.single;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class BasePermissionListener
implements PermissionListener {
    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
    }

    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
    }

    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        permissionToken.continuePermissionRequest();
    }
}

