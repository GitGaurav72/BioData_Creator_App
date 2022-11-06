/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.WindowManager
 *  com.segment.analytics.GetAdvertisingIdTask
 *  com.segment.analytics.GetDeviceIdTask
 *  com.segment.analytics.Traits
 *  com.segment.analytics.ValueMap
 *  com.segment.analytics.integrations.Logger
 *  com.segment.analytics.internal.Utils
 *  com.segment.analytics.internal.Utils$NullableConcurrentHashMap
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TimeZone
 *  java.util.concurrent.CountDownLatch
 */
package com.segment.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.segment.analytics.GetAdvertisingIdTask;
import com.segment.analytics.GetDeviceIdTask;
import com.segment.analytics.Traits;
import com.segment.analytics.ValueMap;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;

public class AnalyticsContext
extends ValueMap {
    private static final String APP_BUILD_KEY = "build";
    private static final String APP_KEY = "app";
    private static final String APP_NAMESPACE_KEY = "namespace";
    private static final String APP_NAME_KEY = "name";
    private static final String APP_VERSION_KEY = "version";
    private static final String CAMPAIGN_KEY = "campaign";
    public static final String DEVICE_KEY = "device";
    private static final String LIBRARY_KEY = "library";
    private static final String LIBRARY_NAME_KEY = "name";
    private static final String LIBRARY_VERSION_KEY = "version";
    private static final String LOCALE_KEY = "locale";
    private static final String LOCATION_KEY = "location";
    private static final String NETWORK_BLUETOOTH_KEY = "bluetooth";
    private static final String NETWORK_CARRIER_KEY = "carrier";
    private static final String NETWORK_CELLULAR_KEY = "cellular";
    private static final String NETWORK_KEY = "network";
    private static final String NETWORK_WIFI_KEY = "wifi";
    private static final String OS_KEY = "os";
    private static final String OS_NAME_KEY = "name";
    private static final String OS_VERSION_KEY = "version";
    private static final String REFERRER_KEY = "referrer";
    private static final String SCREEN_DENSITY_KEY = "density";
    private static final String SCREEN_HEIGHT_KEY = "height";
    private static final String SCREEN_KEY = "screen";
    private static final String SCREEN_WIDTH_KEY = "width";
    private static final String TIMEZONE_KEY = "timezone";
    private static final String TRAITS_KEY = "traits";
    private static final String USER_AGENT_KEY = "userAgent";

    public AnalyticsContext(Map<String, Object> map) {
        super(map);
    }

    public static AnalyticsContext create(Context context, Traits traits, boolean bl) {
        Class<AnalyticsContext> class_ = AnalyticsContext.class;
        synchronized (AnalyticsContext.class) {
            AnalyticsContext analyticsContext = new AnalyticsContext((Map<String, Object>)new Utils.NullableConcurrentHashMap());
            analyticsContext.putApp(context);
            analyticsContext.setTraits(traits);
            analyticsContext.putDevice(bl);
            analyticsContext.putLibrary();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Locale.getDefault().getLanguage());
            stringBuilder.append("-");
            stringBuilder.append(Locale.getDefault().getCountry());
            analyticsContext.put(LOCALE_KEY, (Object)stringBuilder.toString());
            analyticsContext.putNetwork(context);
            analyticsContext.putOs();
            analyticsContext.putScreen(context);
            AnalyticsContext.putUndefinedIfNull((Map<String, Object>)analyticsContext, USER_AGENT_KEY, System.getProperty((String)"http.agent"));
            AnalyticsContext.putUndefinedIfNull((Map<String, Object>)analyticsContext, TIMEZONE_KEY, TimeZone.getDefault().getID());
            // ** MonitorExit[var10_3] (shouldn't be in output)
            return analyticsContext;
        }
    }

    public static void putUndefinedIfNull(Map<String, Object> map, String string2, CharSequence charSequence) {
        if (Utils.isNullOrEmpty((CharSequence)charSequence)) {
            charSequence = "undefined";
        }
        map.put((Object)string2, (Object)charSequence);
    }

    public void attachAdvertisingId(Context context, CountDownLatch countDownLatch, Logger logger) {
        if (Utils.isOnClassPath((String)"com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            new GetAdvertisingIdTask(this, countDownLatch, logger).execute((Object[])new Context[]{context});
            return;
        }
        logger.debug("Not collecting advertising ID because com.google.android.gms.ads.identifier.AdvertisingIdClient was not found on the classpath.", new Object[0]);
        countDownLatch.countDown();
    }

    public void attachDeviceId(SharedPreferences sharedPreferences) {
        new GetDeviceIdTask(this, sharedPreferences, new CountDownLatch(1)).execute();
    }

    public Campaign campaign() {
        return (Campaign)this.getValueMap(CAMPAIGN_KEY, Campaign.class);
    }

    public Device device() {
        return (Device)this.getValueMap(DEVICE_KEY, Device.class);
    }

    public Location location() {
        return (Location)this.getValueMap(LOCATION_KEY, Location.class);
    }

    public void putApp(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            Map map = Utils.createMap();
            AnalyticsContext.putUndefinedIfNull((Map<String, Object>)map, "name", packageInfo.applicationInfo.loadLabel(packageManager));
            AnalyticsContext.putUndefinedIfNull((Map<String, Object>)map, "version", packageInfo.versionName);
            AnalyticsContext.putUndefinedIfNull((Map<String, Object>)map, APP_NAMESPACE_KEY, packageInfo.packageName);
            map.put((Object)APP_BUILD_KEY, (Object)String.valueOf((int)packageInfo.versionCode));
            this.put(APP_KEY, (Object)map);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
    }

    public AnalyticsContext putCampaign(Campaign campaign) {
        return this.putValue(CAMPAIGN_KEY, (Object)campaign);
    }

    public void putDevice(boolean bl) {
        Device device = new Device();
        String string2 = bl ? "" : this.traits().anonymousId();
        device.put("id", (Object)string2);
        device.put("manufacturer", (Object)Build.MANUFACTURER);
        device.put("model", (Object)Build.MODEL);
        device.put("name", (Object)Build.DEVICE);
        device.put("type", (Object)"android");
        this.put(DEVICE_KEY, (Object)device);
    }

    public AnalyticsContext putDeviceToken(String string2) {
        this.device().putDeviceToken(string2);
        return this;
    }

    public void putLibrary() {
        Map map = Utils.createMap();
        map.put((Object)"name", (Object)"analytics-android");
        map.put((Object)"version", (Object)"4.10.4");
        this.put(LIBRARY_KEY, (Object)map);
    }

    public AnalyticsContext putLocation(Location location) {
        return this.putValue(LOCATION_KEY, (Object)location);
    }

    @SuppressLint(value={"MissingPermission"})
    public void putNetwork(Context context) {
        TelephonyManager telephonyManager;
        ConnectivityManager connectivityManager;
        Map map = Utils.createMap();
        if (Utils.hasPermission((Context)context, (String)"android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager)Utils.getSystemService((Context)context, (String)"connectivity")) != null) {
            boolean bl = true;
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo((int)bl);
            boolean bl2 = networkInfo != null && networkInfo.isConnected() ? bl : false;
            map.put((Object)NETWORK_WIFI_KEY, (Object)bl2);
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(7);
            boolean bl3 = networkInfo2 != null && networkInfo2.isConnected() ? bl : false;
            map.put((Object)NETWORK_BLUETOOTH_KEY, (Object)bl3);
            NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
            if (networkInfo3 == null || !networkInfo3.isConnected()) {
                bl = false;
            }
            map.put((Object)NETWORK_CELLULAR_KEY, (Object)bl);
        }
        String string2 = (telephonyManager = (TelephonyManager)Utils.getSystemService((Context)context, (String)"phone")) != null ? telephonyManager.getNetworkOperatorName() : "unknown";
        map.put((Object)NETWORK_CARRIER_KEY, (Object)string2);
        this.put(NETWORK_KEY, (Object)map);
    }

    public void putOs() {
        Map map = Utils.createMap();
        map.put((Object)"name", (Object)"Android");
        map.put((Object)"version", (Object)Build.VERSION.RELEASE);
        this.put(OS_KEY, (Object)map);
    }

    public AnalyticsContext putReferrer(Referrer referrer) {
        return this.putValue(REFERRER_KEY, (Object)referrer);
    }

    public void putScreen(Context context) {
        Map map = Utils.createMap();
        Display display = ((WindowManager)Utils.getSystemService((Context)context, (String)"window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        map.put((Object)SCREEN_DENSITY_KEY, (Object)Float.valueOf((float)displayMetrics.density));
        map.put((Object)SCREEN_HEIGHT_KEY, (Object)displayMetrics.heightPixels);
        map.put((Object)SCREEN_WIDTH_KEY, (Object)displayMetrics.widthPixels);
        this.put(SCREEN_KEY, (Object)map);
    }

    public AnalyticsContext putValue(String string2, Object object) {
        super.putValue(string2, object);
        return this;
    }

    public void setTraits(Traits traits) {
        this.put(TRAITS_KEY, (Object)traits.unmodifiableCopy());
    }

    public Traits traits() {
        return (Traits)this.getValueMap(TRAITS_KEY, Traits.class);
    }

    public AnalyticsContext unmodifiableCopy() {
        return new AnalyticsContext((Map<String, Object>)Collections.unmodifiableMap((Map)new LinkedHashMap((Map)this)));
    }

    public static class Campaign
    extends ValueMap {
        private static final String CAMPAIGN_CONTENT_KEY = "content";
        private static final String CAMPAIGN_MEDIUM_KEY = "medium";
        private static final String CAMPAIGN_NAME_KEY = "name";
        private static final String CAMPAIGN_SOURCE_KEY = "source";
        private static final String CAMPAIGN_TERM_KEY = "term";

        public Campaign() {
        }

        private Campaign(Map<String, Object> map) {
            super(map);
        }

        public String content() {
            return this.getString(CAMPAIGN_CONTENT_KEY);
        }

        public String medium() {
            return this.getString(CAMPAIGN_MEDIUM_KEY);
        }

        public String name() {
            return this.getString("name");
        }

        public Campaign putContent(String string2) {
            return this.putValue(CAMPAIGN_CONTENT_KEY, string2);
        }

        public Campaign putMedium(String string2) {
            return this.putValue(CAMPAIGN_MEDIUM_KEY, string2);
        }

        public Campaign putName(String string2) {
            return this.putValue("name", string2);
        }

        public Campaign putSource(String string2) {
            return this.putValue(CAMPAIGN_SOURCE_KEY, string2);
        }

        public Campaign putTerm(String string2) {
            return this.putValue(CAMPAIGN_TERM_KEY, string2);
        }

        public Campaign putValue(String string2, Object object) {
            super.putValue(string2, object);
            return this;
        }

        public String source() {
            return this.getString(CAMPAIGN_SOURCE_KEY);
        }

        public String term() {
            return this.getString(CAMPAIGN_TERM_KEY);
        }

        public String tern() {
            return this.term();
        }
    }

    public static class Device
    extends ValueMap {
        public static final String DEVICE_ADVERTISING_ID_KEY = "advertisingId";
        public static final String DEVICE_AD_TRACKING_ENABLED_KEY = "adTrackingEnabled";
        public static final String DEVICE_ID_KEY = "id";
        public static final String DEVICE_MANUFACTURER_KEY = "manufacturer";
        public static final String DEVICE_MODEL_KEY = "model";
        public static final String DEVICE_NAME_KEY = "name";
        public static final String DEVICE_TOKEN_KEY = "token";
        public static final String DEVICE_TYPE_KEY = "type";

        public Device() {
        }

        private Device(Map<String, Object> map) {
            super(map);
        }

        public void putAdvertisingInfo(String string2, boolean bl) {
            if (bl && !Utils.isNullOrEmpty((CharSequence)string2)) {
                this.put(DEVICE_ADVERTISING_ID_KEY, (Object)string2);
            }
            this.put(DEVICE_AD_TRACKING_ENABLED_KEY, (Object)bl);
        }

        public Device putDeviceToken(String string2) {
            return this.putValue(DEVICE_TOKEN_KEY, string2);
        }

        public Device putValue(String string2, Object object) {
            super.putValue(string2, object);
            return this;
        }
    }

    public static class Location
    extends ValueMap {
        private static final String LOCATION_LATITUDE_KEY = "latitude";
        private static final String LOCATION_LONGITUDE_KEY = "longitude";
        private static final String LOCATION_SPEED_KEY = "speed";

        public Location() {
        }

        private Location(Map<String, Object> map) {
            super(map);
        }

        public double latitude() {
            return this.getDouble(LOCATION_LATITUDE_KEY, 0.0);
        }

        public double longitude() {
            return this.getDouble(LOCATION_LONGITUDE_KEY, 0.0);
        }

        public Location putLatitude(double d) {
            return this.putValue(LOCATION_LATITUDE_KEY, d);
        }

        public Location putLongitude(double d) {
            return this.putValue(LOCATION_LONGITUDE_KEY, d);
        }

        public Location putSpeed(double d) {
            return this.putValue(LOCATION_SPEED_KEY, d);
        }

        public Location putValue(String string2, Object object) {
            super.putValue(string2, object);
            return this;
        }

        public double speed() {
            return this.getDouble(LOCATION_SPEED_KEY, 0.0);
        }
    }

    public static class Referrer
    extends ValueMap {
        private static final String REFERRER_ID_KEY = "id";
        private static final String REFERRER_LINK_KEY = "link";
        private static final String REFERRER_NAME_KEY = "name";
        private static final String REFERRER_TYPE_KEY = "type";
        private static final String REFERRER_URL_KEY = "url";

        public Referrer() {
        }

        public Referrer(Map<String, Object> map) {
            super(map);
        }

        public String id() {
            return this.getString(REFERRER_ID_KEY);
        }

        public String link() {
            return this.getString(REFERRER_LINK_KEY);
        }

        public String name() {
            return this.getString("name");
        }

        public Referrer putId(String string2) {
            return this.putValue(REFERRER_ID_KEY, string2);
        }

        public Referrer putLink(String string2) {
            return this.putValue(REFERRER_LINK_KEY, string2);
        }

        public Referrer putName(String string2) {
            return this.putValue("name", string2);
        }

        public Referrer putTerm(String string2) {
            return this.putValue(REFERRER_URL_KEY, string2);
        }

        public Referrer putType(String string2) {
            return this.putValue(REFERRER_TYPE_KEY, string2);
        }

        public Referrer putUrl(String string2) {
            return this.putValue(REFERRER_URL_KEY, string2);
        }

        public Referrer putValue(String string2, Object object) {
            super.putValue(string2, object);
            return this;
        }

        public String type() {
            return this.getString(REFERRER_TYPE_KEY);
        }

        public String url() {
            return this.getString(REFERRER_URL_KEY);
        }
    }

}

