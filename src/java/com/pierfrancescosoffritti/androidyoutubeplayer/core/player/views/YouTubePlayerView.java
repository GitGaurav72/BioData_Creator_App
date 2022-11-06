/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  androidx.annotation.LayoutRes
 *  androidx.lifecycle.Lifecycle
 *  androidx.lifecycle.Lifecycle$Event
 *  androidx.lifecycle.LifecycleObserver
 *  androidx.lifecycle.OnLifecycleEvent
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$styleable
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.FullScreenHelper
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.SixteenByNineFrameLayout
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView$youTubePlayerListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView$youTubePlayerListener$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.FullScreenHelper;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.SixteenByNineFrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController;
import k.x.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv={1, 0, 3}, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u0016\u00a2\u0006\u0004\b>\u0010?B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u000209\u00a2\u0006\u0004\b>\u0010@B\u001d\b\u0016\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u00a2\u0006\u0004\b>\u0010AJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0005J'\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\r\u0010\u000fJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\r\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\t\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b!\u0010\u0005J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\u0003\u00a2\u0006\u0004\b%\u0010\u0005J\r\u0010&\u001a\u00020\u0003\u00a2\u0006\u0004\b&\u0010\u0005J\r\u0010'\u001a\u00020\u0003\u00a2\u0006\u0004\b'\u0010\u0005J\r\u0010(\u001a\u00020\t\u00a2\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*\u00a2\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020*\u00a2\u0006\u0004\b.\u0010-R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\"\u00102\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010)\"\u0004\b5\u0010 R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108\u00a8\u0006B"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/SixteenByNineFrameLayout;", "Landroidx/lifecycle/LifecycleObserver;", "Lk/q;", "onResume", "()V", "onStop", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "youTubePlayerListener", "", "handleNetworkEvents", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;", "playerOptions", "initialize", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;ZLcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;)V", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;Z)V", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;)V", "initializeWithWebUi", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerCallback;", "youTubePlayerCallback", "getYouTubePlayerWhenReady", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerCallback;)V", "", "layoutId", "Landroid/view/View;", "inflateCustomPlayerUi", "(I)Landroid/view/View;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "getPlayerUiController", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "enable", "enableBackgroundPlayback", "(Z)V", "release", "addYouTubePlayerListener", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;)Z", "removeYouTubePlayerListener", "enterFullScreen", "exitFullScreen", "toggleFullScreen", "isFullScreen", "()Z", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerFullScreenListener;", "fullScreenListener", "addFullScreenListener", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerFullScreenListener;)Z", "removeFullScreenListener", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/FullScreenHelper;", "fullScreenHelper", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/FullScreenHelper;", "enableAutomaticInitialization", "Z", "getEnableAutomaticInitialization", "setEnableAutomaticInitialization", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "legacyTubePlayerView", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k=1, mv={1, 4, 0})
public final class YouTubePlayerView
extends SixteenByNineFrameLayout
implements LifecycleObserver {
    private boolean enableAutomaticInitialization;
    private final FullScreenHelper fullScreenHelper;
    private final LegacyYouTubePlayerView legacyTubePlayerView;

    public YouTubePlayerView(Context context) {
        i.f((Object)context, "context");
        this(context, null, 0);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        i.f((Object)context, "context");
        this(context, attributeSet, 0);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet, int n) {
        LegacyYouTubePlayerView legacyYouTubePlayerView;
        i.f((Object)context, "context");
        super(context, attributeSet, n);
        this.legacyTubePlayerView = legacyYouTubePlayerView = new LegacyYouTubePlayerView(context);
        this.fullScreenHelper = new FullScreenHelper((View)this);
        this.addView((View)legacyYouTubePlayerView, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.YouTubePlayerView, 0, 0);
        this.enableAutomaticInitialization = typedArray.getBoolean(R.styleable.YouTubePlayerView_enableAutomaticInitialization, true);
        boolean bl = typedArray.getBoolean(R.styleable.YouTubePlayerView_autoPlay, false);
        boolean bl2 = typedArray.getBoolean(R.styleable.YouTubePlayerView_handleNetworkEvents, true);
        String string = typedArray.getString(R.styleable.YouTubePlayerView_videoId);
        boolean bl3 = typedArray.getBoolean(R.styleable.YouTubePlayerView_useWebUi, false);
        boolean bl4 = typedArray.getBoolean(R.styleable.YouTubePlayerView_enableLiveVideoUi, false);
        boolean bl5 = typedArray.getBoolean(R.styleable.YouTubePlayerView_showYouTubeButton, true);
        boolean bl6 = typedArray.getBoolean(R.styleable.YouTubePlayerView_showFullScreenButton, true);
        boolean bl7 = typedArray.getBoolean(R.styleable.YouTubePlayerView_showVideoCurrentTime, true);
        boolean bl8 = typedArray.getBoolean(R.styleable.YouTubePlayerView_showVideoDuration, true);
        boolean bl9 = typedArray.getBoolean(R.styleable.YouTubePlayerView_showSeekBar, true);
        typedArray.recycle();
        if (!this.enableAutomaticInitialization && bl3) {
            throw new IllegalStateException("YouTubePlayerView: 'enableAutomaticInitialization' is false and 'useWebUi' is set to true. This is not possible, if you want to manually initialize YouTubePlayerView and use the web ui, you should manually initialize the YouTubePlayerView using 'initializeWithWebUi'");
        }
        if (string == null && bl) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not possible.");
        }
        if (!bl3) {
            legacyYouTubePlayerView.getPlayerUiController().enableLiveVideoUi(bl4).showYouTubeButton(bl5).showFullscreenButton(bl6).showCurrentTime(bl7).showDuration(bl8).showSeekBar(bl9);
        }
        youTubePlayerListener.1 var16_16 = new youTubePlayerListener.1(this, string, bl);
        if (this.enableAutomaticInitialization) {
            if (bl3) {
                legacyYouTubePlayerView.initializeWithWebUi((YouTubePlayerListener)var16_16, bl2);
            } else {
                legacyYouTubePlayerView.initialize((YouTubePlayerListener)var16_16, bl2);
            }
        }
        legacyYouTubePlayerView.addFullScreenListener(new YouTubePlayerFullScreenListener(){

            public void onYouTubePlayerEnterFullScreen() {
                this.fullScreenHelper.enterFullScreen();
            }

            public void onYouTubePlayerExitFullScreen() {
                this.fullScreenHelper.exitFullScreen();
            }
        });
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            attributeSet = null;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        this(context, attributeSet, n);
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ LegacyYouTubePlayerView access$getLegacyTubePlayerView$p(YouTubePlayerView youTubePlayerView) {
        return youTubePlayerView.legacyTubePlayerView;
    }

    @OnLifecycleEvent(value=Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        this.legacyTubePlayerView.onResume$core_release();
    }

    @OnLifecycleEvent(value=Lifecycle.Event.ON_STOP)
    private final void onStop() {
        this.legacyTubePlayerView.onStop$core_release();
    }

    public final boolean addFullScreenListener(YouTubePlayerFullScreenListener youTubePlayerFullScreenListener) {
        i.f((Object)youTubePlayerFullScreenListener, "fullScreenListener");
        return this.fullScreenHelper.addFullScreenListener(youTubePlayerFullScreenListener);
    }

    public final boolean addYouTubePlayerListener(YouTubePlayerListener youTubePlayerListener2) {
        i.f((Object)youTubePlayerListener2, "youTubePlayerListener");
        return this.legacyTubePlayerView.getYouTubePlayer$core_release().addListener(youTubePlayerListener2);
    }

    public final void enableBackgroundPlayback(boolean bl) {
        this.legacyTubePlayerView.enableBackgroundPlayback(bl);
    }

    public final void enterFullScreen() {
        this.legacyTubePlayerView.enterFullScreen();
    }

    public final void exitFullScreen() {
        this.legacyTubePlayerView.exitFullScreen();
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.enableAutomaticInitialization;
    }

    public final PlayerUiController getPlayerUiController() {
        return this.legacyTubePlayerView.getPlayerUiController();
    }

    public final void getYouTubePlayerWhenReady(YouTubePlayerCallback youTubePlayerCallback) {
        i.f((Object)youTubePlayerCallback, "youTubePlayerCallback");
        this.legacyTubePlayerView.getYouTubePlayerWhenReady(youTubePlayerCallback);
    }

    public final View inflateCustomPlayerUi(@LayoutRes int n) {
        return this.legacyTubePlayerView.inflateCustomPlayerUi(n);
    }

    public final void initialize(YouTubePlayerListener youTubePlayerListener2) {
        i.f((Object)youTubePlayerListener2, "youTubePlayerListener");
        if (!this.enableAutomaticInitialization) {
            this.legacyTubePlayerView.initialize(youTubePlayerListener2, true);
            return;
        }
        throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false");
    }

    public final void initialize(YouTubePlayerListener youTubePlayerListener2, boolean bl) {
        i.f((Object)youTubePlayerListener2, "youTubePlayerListener");
        if (!this.enableAutomaticInitialization) {
            this.legacyTubePlayerView.initialize(youTubePlayerListener2, bl, null);
            return;
        }
        throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false");
    }

    public final void initialize(YouTubePlayerListener youTubePlayerListener2, boolean bl, IFramePlayerOptions iFramePlayerOptions) {
        i.f((Object)youTubePlayerListener2, "youTubePlayerListener");
        if (!this.enableAutomaticInitialization) {
            this.legacyTubePlayerView.initialize(youTubePlayerListener2, bl, iFramePlayerOptions);
            return;
        }
        throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false");
    }

    public final void initializeWithWebUi(YouTubePlayerListener youTubePlayerListener2, boolean bl) {
        i.f((Object)youTubePlayerListener2, "youTubePlayerListener");
        if (!this.enableAutomaticInitialization) {
            this.legacyTubePlayerView.initializeWithWebUi(youTubePlayerListener2, bl);
            return;
        }
        throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false");
    }

    public final boolean isFullScreen() {
        return this.fullScreenHelper.isFullScreen();
    }

    @OnLifecycleEvent(value=Lifecycle.Event.ON_DESTROY)
    public final void release() {
        this.legacyTubePlayerView.release();
    }

    public final boolean removeFullScreenListener(YouTubePlayerFullScreenListener youTubePlayerFullScreenListener) {
        i.f((Object)youTubePlayerFullScreenListener, "fullScreenListener");
        return this.fullScreenHelper.removeFullScreenListener(youTubePlayerFullScreenListener);
    }

    public final boolean removeYouTubePlayerListener(YouTubePlayerListener youTubePlayerListener2) {
        i.f((Object)youTubePlayerListener2, "youTubePlayerListener");
        return this.legacyTubePlayerView.getYouTubePlayer$core_release().removeListener(youTubePlayerListener2);
    }

    public final void setEnableAutomaticInitialization(boolean bl) {
        this.enableAutomaticInitialization = bl;
    }

    public final void toggleFullScreen() {
        this.legacyTubePlayerView.toggleFullScreen();
    }

}

