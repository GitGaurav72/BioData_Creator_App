/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Fragment
 *  android.app.FragmentTransaction
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentTransaction
 *  com.wuman.android.auth.FragmentCompat
 *  java.lang.Object
 */
package com.wuman.android.auth;

import android.annotation.TargetApi;
import android.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.wuman.android.auth.FragmentCompat;

public class FragmentTransactionCompat {
    public final android.app.FragmentTransaction nativeFragmentTransaction;
    public final FragmentTransaction supportFragmentTransaction;

    public FragmentTransactionCompat(android.app.FragmentTransaction fragmentTransaction) {
        this.nativeFragmentTransaction = fragmentTransaction;
        this.supportFragmentTransaction = null;
    }

    public FragmentTransactionCompat(FragmentTransaction fragmentTransaction) {
        this.supportFragmentTransaction = fragmentTransaction;
        this.nativeFragmentTransaction = null;
    }

    public Object getFragmentTransaction() {
        FragmentTransaction fragmentTransaction = this.supportFragmentTransaction;
        if (fragmentTransaction != null) {
            return fragmentTransaction;
        }
        return this.nativeFragmentTransaction;
    }

    @TargetApi(value=11)
    public FragmentTransactionCompat remove(FragmentCompat fragmentCompat) {
        FragmentTransaction fragmentTransaction = this.supportFragmentTransaction;
        if (fragmentTransaction != null) {
            fragmentTransaction.remove((androidx.fragment.app.Fragment)fragmentCompat.getFragment());
            return this;
        }
        this.nativeFragmentTransaction.remove((Fragment)fragmentCompat.getFragment());
        return this;
    }
}

