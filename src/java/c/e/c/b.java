/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.core.view.MenuHostHelper
 *  androidx.core.view.MenuProvider
 *  androidx.lifecycle.Lifecycle
 *  androidx.lifecycle.Lifecycle$Event
 *  androidx.lifecycle.LifecycleEventObserver
 *  androidx.lifecycle.LifecycleOwner
 *  java.lang.Object
 *  java.util.Objects
 */
package c.e.c;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Objects;

public final class b
implements LifecycleEventObserver {
    public final /* synthetic */ MenuHostHelper k;
    public final /* synthetic */ MenuProvider l;

    public /* synthetic */ b(MenuHostHelper menuHostHelper, MenuProvider menuProvider) {
        this.k = menuHostHelper;
        this.l = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        MenuHostHelper menuHostHelper = this.k;
        MenuProvider menuProvider = this.l;
        Objects.requireNonNull((Object)menuHostHelper);
        if (event == Lifecycle.Event.ON_DESTROY) {
            menuHostHelper.removeMenuProvider(menuProvider);
        }
    }
}

