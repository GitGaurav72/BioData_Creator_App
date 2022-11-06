/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.net.Uri
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.lifecycle.DefaultLifecycleObserver
 *  androidx.lifecycle.LifecycleOwner
 *  com.segment.analytics.Analytics
 *  com.segment.analytics.IntegrationOperation
 *  com.segment.analytics.Properties
 *  com.segment.analytics.integrations.Logger
 *  com.segment.analytics.internal.Utils
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Set
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.segment.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.segment.analytics.Analytics;
import com.segment.analytics.AnalyticsActivityLifecycleCallbacks;
import com.segment.analytics.IntegrationOperation;
import com.segment.analytics.Properties;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.internal.Utils;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AnalyticsActivityLifecycleCallbacks
implements Application.ActivityLifecycleCallbacks,
DefaultLifecycleObserver {
    private static LifecycleOwner stubOwner = new LifecycleOwner(){
        public androidx.lifecycle.Lifecycle stubLifecycle;
        {
            this.stubLifecycle = new androidx.lifecycle.Lifecycle(this){
                public final /* synthetic */ 1 this$0;
                {
                    this.this$0 = var1_1;
                }

                public void addObserver(@NonNull androidx.lifecycle.LifecycleObserver lifecycleObserver) {
                }

                @NonNull
                public androidx.lifecycle.Lifecycle$State getCurrentState() {
                    return androidx.lifecycle.Lifecycle$State.DESTROYED;
                }

                public void removeObserver(@NonNull androidx.lifecycle.LifecycleObserver lifecycleObserver) {
                }
            };
        }

        @NonNull
        public androidx.lifecycle.Lifecycle getLifecycle() {
            return this.stubLifecycle;
        }
    };
    private Analytics analytics;
    private ExecutorService analyticsExecutor;
    private AtomicBoolean firstLaunch = new AtomicBoolean(false);
    private AtomicBoolean isChangingActivityConfigurations;
    private AtomicInteger numberOfActivities = new AtomicInteger(1);
    private PackageInfo packageInfo;
    private Boolean shouldRecordScreenViews;
    private Boolean shouldTrackApplicationLifecycleEvents;
    private Boolean trackDeepLinks;
    private AtomicBoolean trackedApplicationLifecycleEvents = new AtomicBoolean(false);
    private Boolean useNewLifecycleMethods;

    private AnalyticsActivityLifecycleCallbacks(Analytics analytics, ExecutorService executorService, Boolean bl, Boolean bl2, Boolean bl3, PackageInfo packageInfo, Boolean bl4) {
        this.analytics = analytics;
        this.analyticsExecutor = executorService;
        this.shouldTrackApplicationLifecycleEvents = bl;
        this.trackDeepLinks = bl2;
        this.shouldRecordScreenViews = bl3;
        this.packageInfo = packageInfo;
        this.useNewLifecycleMethods = bl4;
        this.isChangingActivityConfigurations = new AtomicBoolean(false);
    }

    public /* synthetic */ AnalyticsActivityLifecycleCallbacks(Analytics analytics, ExecutorService executorService, Boolean bl, Boolean bl2, Boolean bl3, PackageInfo packageInfo, Boolean bl4, 1 var8_8) {
        this(analytics, executorService, bl, bl2, bl3, packageInfo, bl4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void trackDeepLink(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            if (intent.getData() == null) {
                return;
            }
            Properties properties = new Properties();
            Uri uri = Utils.getReferrer((Activity)activity);
            if (uri != null) {
                properties.putReferrer(uri.toString());
            }
            Uri uri2 = intent.getData();
            try {
                for (String string : uri2.getQueryParameterNames()) {
                    String string2 = uri2.getQueryParameter(string);
                    if (string2 == null || string2.trim().isEmpty()) continue;
                    properties.put(string, (Object)string2);
                }
            }
            catch (Exception exception) {
                Logger logger = this.analytics.logger("LifecycleCallbacks");
                Object[] arrobject = new Object[]{uri2.toString()};
                logger.error((Throwable)exception, "failed to get uri params for %s", arrobject);
            }
            properties.put("url", (Object)uri2.toString());
            this.analytics.track("Deep Link Opened", properties);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityCreated((Activity)activity, (Bundle)bundle));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            this.onCreate(stubOwner);
        }
        if (this.trackDeepLinks.booleanValue()) {
            this.trackDeepLink(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityDestroyed((Activity)activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            this.onDestroy(stubOwner);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityPaused((Activity)activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            this.onPause(stubOwner);
        }
    }

    public void onActivityResumed(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityResumed((Activity)activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            this.onStart(stubOwner);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivitySaveInstanceState((Activity)activity, (Bundle)bundle));
    }

    public void onActivityStarted(Activity activity) {
        if (this.shouldRecordScreenViews.booleanValue()) {
            this.analytics.recordScreenViews(activity);
        }
        this.analytics.runOnMainThread(IntegrationOperation.onActivityStarted((Activity)activity));
    }

    public void onActivityStopped(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityStopped((Activity)activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            this.onStop(stubOwner);
        }
    }

    public void onCreate(@NonNull LifecycleOwner lifecycleOwner) {
        if (!this.trackedApplicationLifecycleEvents.getAndSet(true) && this.shouldTrackApplicationLifecycleEvents.booleanValue()) {
            this.numberOfActivities.set(0);
            this.firstLaunch.set(true);
            this.analytics.trackApplicationLifecycleEvents();
        }
    }

    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        if (this.shouldTrackApplicationLifecycleEvents.booleanValue() && this.numberOfActivities.incrementAndGet() == 1 && !this.isChangingActivityConfigurations.get()) {
            Properties properties = new Properties();
            if (this.firstLaunch.get()) {
                properties.putValue("version", (Object)this.packageInfo.versionName).putValue("build", (Object)String.valueOf((int)this.packageInfo.versionCode));
            }
            properties.putValue("from_background", (Object)(true ^ this.firstLaunch.getAndSet(false)));
            this.analytics.track("Application Opened", properties);
        }
    }

    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        if (this.shouldTrackApplicationLifecycleEvents.booleanValue() && this.numberOfActivities.decrementAndGet() == 0 && !this.isChangingActivityConfigurations.get()) {
            this.analytics.track("Application Backgrounded");
        }
    }
}

