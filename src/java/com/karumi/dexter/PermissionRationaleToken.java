/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.karumi.dexter.DexterInstance
 *  com.karumi.dexter.PermissionToken
 *  java.lang.Object
 */
package com.karumi.dexter;

import com.karumi.dexter.DexterInstance;
import com.karumi.dexter.PermissionToken;

public final class PermissionRationaleToken
implements PermissionToken {
    private final DexterInstance dexterInstance;
    private boolean isTokenResolved = false;

    public PermissionRationaleToken(DexterInstance dexterInstance) {
        this.dexterInstance = dexterInstance;
    }

    public void cancelPermissionRequest() {
        if (!this.isTokenResolved) {
            this.dexterInstance.onCancelPermissionRequest();
            this.isTokenResolved = true;
        }
    }

    public void continuePermissionRequest() {
        if (!this.isTokenResolved) {
            this.dexterInstance.onContinuePermissionRequest();
            this.isTokenResolved = true;
        }
    }
}

