/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.core.view.MenuHostHelper
 *  androidx.core.view.MenuProvider
 *  androidx.lifecycle.Lifecycle
 *  androidx.lifecycle.Lifecycle$Event
 *  androidx.lifecycle.Lifecycle$State
 *  androidx.lifecycle.LifecycleEventObserver
 *  androidx.lifecycle.LifecycleOwner
 *  java.lang.Object
 */
package c.e.c;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class a
implements LifecycleEventObserver {
    public final /* synthetic */ MenuHostHelper k;
    public final /* synthetic */ Lifecycle.State l;
    public final /* synthetic */ MenuProvider m;

    public /* synthetic */ a(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider) {
        this.k = menuHostHelper;
        this.l = state;
        this.m = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.k.a(this.l, this.m, lifecycleOwner, event);
    }
}

