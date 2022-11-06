/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
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
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$layout
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions$Builder
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.FullScreenHelper
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.PlaybackResumer
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$2
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$3
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$2
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.SixteenByNineFrameLayout
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.HashSet
 *  k.x.b.a
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.FullScreenHelper;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.PlaybackResumer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.SixteenByNineFrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController;
import java.util.HashSet;
import k.q;
import k.x.b.a;
import k.x.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010P\u001a\u00020O\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010Q\u0012\b\b\u0002\u0010S\u001a\u00020\u0013\u00a2\u0006\u0004\bT\u0010UB\u0011\b\u0016\u0012\u0006\u0010P\u001a\u00020O\u00a2\u0006\u0004\bT\u0010VB\u001d\b\u0016\u0012\u0006\u0010P\u001a\u00020O\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010Q\u00a2\u0006\u0004\bT\u0010WJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\fJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\rJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH\u0001\u00a2\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\tH\u0001\u00a2\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010 \u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0005\u00a2\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$\u00a2\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\t\u00a2\u0006\u0004\b'\u0010\u0019J\r\u0010(\u001a\u00020\t\u00a2\u0006\u0004\b(\u0010\u0019J\r\u0010)\u001a\u00020\t\u00a2\u0006\u0004\b)\u0010\u0019J\r\u0010*\u001a\u00020\u0005\u00a2\u0006\u0004\b*\u0010\u001fJ\u0015\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\b/\u0010.R$\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\u001fR\"\u00103\u001a\u00020\u00058\u0000@\u0000X\u000e\u00a2\u0006\u0012\n\u0004\b3\u00102\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010#R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010:R\u001c\u0010<\u001a\u00020;8\u0000@\u0000X\u0004\u00a2\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bG\u0010HR&\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u000f0Ij\b\u0012\u0004\u0012\u00020\u000f`J8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010LR$\u0010M\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058\u0000@BX\u000e\u00a2\u0006\f\n\u0004\bM\u00102\u001a\u0004\bN\u0010\u001f\u00a8\u0006X"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/SixteenByNineFrameLayout;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "youTubePlayerListener", "", "handleNetworkEvents", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;", "playerOptions", "Lk/q;", "initialize", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;ZLcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;)V", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;Z)V", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;)V", "initializeWithWebUi", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerCallback;", "youTubePlayerCallback", "getYouTubePlayerWhenReady", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerCallback;)V", "", "layoutId", "Landroid/view/View;", "inflateCustomPlayerUi", "(I)Landroid/view/View;", "release", "()V", "onResume$core_release", "onResume", "onStop$core_release", "onStop", "isEligibleForPlayback$core_release", "()Z", "isEligibleForPlayback", "enable", "enableBackgroundPlayback", "(Z)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "getPlayerUiController", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "enterFullScreen", "exitFullScreen", "toggleFullScreen", "isFullScreen", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerFullScreenListener;", "fullScreenListener", "addFullScreenListener", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerFullScreenListener;)Z", "removeFullScreenListener", "<set-?>", "isUsingCustomUi", "Z", "isYouTubePlayerReady", "isYouTubePlayerReady$core_release", "setYouTubePlayerReady$core_release", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/PlaybackResumer;", "playbackResumer", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/PlaybackResumer;", "Lkotlin/Function0;", "Lk/x/b/a;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "youTubePlayer", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "getYouTubePlayer$core_release", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkListener;", "networkListener", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/FullScreenHelper;", "fullScreenHelper", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/FullScreenHelper;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/DefaultPlayerUiController;", "defaultPlayerUiController", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/DefaultPlayerUiController;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "youTubePlayerCallbacks", "Ljava/util/HashSet;", "canPlay", "getCanPlay$core_release", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k=1, mv={1, 4, 0})
public final class LegacyYouTubePlayerView
extends SixteenByNineFrameLayout
implements LifecycleObserver {
    private boolean canPlay;
    private final DefaultPlayerUiController defaultPlayerUiController;
    private final FullScreenHelper fullScreenHelper;
    private a<q> initialize;
    private boolean isUsingCustomUi;
    private boolean isYouTubePlayerReady;
    private final NetworkListener networkListener;
    private final PlaybackResumer playbackResumer;
    private final WebViewYouTubePlayer youTubePlayer;
    private final HashSet<YouTubePlayerCallback> youTubePlayerCallbacks;

    public LegacyYouTubePlayerView(Context context) {
        i.f((Object)context, "context");
        this(context, null, 0);
    }

    public LegacyYouTubePlayerView(Context context, AttributeSet attributeSet) {
        i.f((Object)context, "context");
        this(context, attributeSet, 0);
    }

    public LegacyYouTubePlayerView(Context context, AttributeSet attributeSet, int n) {
        DefaultPlayerUiController defaultPlayerUiController;
        NetworkListener networkListener;
        WebViewYouTubePlayer webViewYouTubePlayer;
        FullScreenHelper fullScreenHelper;
        PlaybackResumer playbackResumer;
        i.f((Object)context, "context");
        super(context, attributeSet, n);
        this.youTubePlayer = webViewYouTubePlayer = new WebViewYouTubePlayer(context, null, 0, 6, null);
        this.networkListener = networkListener = new NetworkListener();
        this.playbackResumer = playbackResumer = new PlaybackResumer();
        this.fullScreenHelper = fullScreenHelper = new FullScreenHelper((View)this);
        this.initialize = initialize.1.INSTANCE;
        this.youTubePlayerCallbacks = new HashSet();
        this.canPlay = true;
        this.addView((View)webViewYouTubePlayer, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        this.defaultPlayerUiController = defaultPlayerUiController = new DefaultPlayerUiController(this, webViewYouTubePlayer);
        fullScreenHelper.addFullScreenListener((YouTubePlayerFullScreenListener)defaultPlayerUiController);
        webViewYouTubePlayer.addListener(defaultPlayerUiController);
        webViewYouTubePlayer.addListener((YouTubePlayerListener)playbackResumer);
        webViewYouTubePlayer.addListener((YouTubePlayerListener)new 1(this));
        webViewYouTubePlayer.addListener((YouTubePlayerListener)new 2(this));
        networkListener.setOnNetworkAvailable((a)new 3(this));
    }

    public /* synthetic */ LegacyYouTubePlayerView(Context context, AttributeSet attributeSet, int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            attributeSet = null;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        this(context, attributeSet, n);
    }

    public /* synthetic */ LegacyYouTubePlayerView(Context context, AttributeSet attributeSet, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ a access$getInitialize$p(LegacyYouTubePlayerView legacyYouTubePlayerView) {
        return legacyYouTubePlayerView.initialize;
    }

    public static final /* synthetic */ PlaybackResumer access$getPlaybackResumer$p(LegacyYouTubePlayerView legacyYouTubePlayerView) {
        return legacyYouTubePlayerView.playbackResumer;
    }

    public static final /* synthetic */ HashSet access$getYouTubePlayerCallbacks$p(LegacyYouTubePlayerView legacyYouTubePlayerView) {
        return legacyYouTubePlayerView.youTubePlayerCallbacks;
    }

    public static final /* synthetic */ void access$setInitialize$p(LegacyYouTubePlayerView legacyYouTubePlayerView, a a2) {
        legacyYouTubePlayerView.initialize = a2;
    }

    public final boolean addFullScreenListener(YouTubePlayerFullScreenListener youTubePlayerFullScreenListener) {
        i.f((Object)youTubePlayerFullScreenListener, "fullScreenListener");
        return this.fullScreenHelper.addFullScreenListener(youTubePlayerFullScreenListener);
    }

    public final void enableBackgroundPlayback(boolean bl) {
        this.youTubePlayer.setBackgroundPlaybackEnabled$core_release(bl);
    }

    public final void enterFullScreen() {
        this.fullScreenHelper.enterFullScreen();
    }

    public final void exitFullScreen() {
        this.fullScreenHelper.exitFullScreen();
    }

    public final boolean getCanPlay$core_release() {
        return this.canPlay;
    }

    public final PlayerUiController getPlayerUiController() {
        if (!this.isUsingCustomUi) {
            return this.defaultPlayerUiController;
        }
        throw new RuntimeException("You have inflated a custom player Ui. You must manage it with your own controller.");
    }

    public final WebViewYouTubePlayer getYouTubePlayer$core_release() {
        return this.youTubePlayer;
    }

    public final void getYouTubePlayerWhenReady(YouTubePlayerCallback youTubePlayerCallback) {
        i.f((Object)youTubePlayerCallback, "youTubePlayerCallback");
        if (this.isYouTubePlayerReady) {
            youTubePlayerCallback.onYouTubePlayer((YouTubePlayer)this.youTubePlayer);
            return;
        }
        this.youTubePlayerCallbacks.add((Object)youTubePlayerCallback);
    }

    public final View inflateCustomPlayerUi(@LayoutRes int n) {
        this.removeViews(1, this.getChildCount() - 1);
        if (!this.isUsingCustomUi) {
            this.youTubePlayer.removeListener(this.defaultPlayerUiController);
            this.fullScreenHelper.removeFullScreenListener((YouTubePlayerFullScreenListener)this.defaultPlayerUiController);
        }
        this.isUsingCustomUi = true;
        View view = View.inflate((Context)this.getContext(), (int)n, (ViewGroup)this);
        i.b((Object)view, "View.inflate(context, layoutId, this)");
        return view;
    }

    public final void initialize(YouTubePlayerListener youTubePlayerListener) {
        i.f((Object)youTubePlayerListener, "youTubePlayerListener");
        this.initialize(youTubePlayerListener, true);
    }

    public final void initialize(YouTubePlayerListener youTubePlayerListener, boolean bl) {
        i.f((Object)youTubePlayerListener, "youTubePlayerListener");
        this.initialize(youTubePlayerListener, bl, null);
    }

    public final void initialize(YouTubePlayerListener youTubePlayerListener, boolean bl, IFramePlayerOptions iFramePlayerOptions) {
        i.f((Object)youTubePlayerListener, "youTubePlayerListener");
        if (!this.isYouTubePlayerReady) {
            initialize.2 var4_4;
            if (bl) {
                this.getContext().registerReceiver((BroadcastReceiver)this.networkListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
            this.initialize = var4_4 = new initialize.2(this, youTubePlayerListener, iFramePlayerOptions);
            if (!bl) {
                var4_4.invoke();
            }
            return;
        }
        throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
    }

    public final void initializeWithWebUi(YouTubePlayerListener youTubePlayerListener, boolean bl) {
        i.f((Object)youTubePlayerListener, "youTubePlayerListener");
        IFramePlayerOptions iFramePlayerOptions = new IFramePlayerOptions.Builder().controls(1).build();
        this.inflateCustomPlayerUi(R.layout.ayp_empty_layout);
        this.initialize(youTubePlayerListener, bl, iFramePlayerOptions);
    }

    public final boolean isEligibleForPlayback$core_release() {
        return this.canPlay || this.youTubePlayer.isBackgroundPlaybackEnabled$core_release();
        {
        }
    }

    public final boolean isFullScreen() {
        return this.fullScreenHelper.isFullScreen();
    }

    public final boolean isUsingCustomUi() {
        return this.isUsingCustomUi;
    }

    public final boolean isYouTubePlayerReady$core_release() {
        return this.isYouTubePlayerReady;
    }

    @OnLifecycleEvent(value=Lifecycle.Event.ON_RESUME)
    public final void onResume$core_release() {
        this.playbackResumer.onLifecycleResume();
        this.canPlay = true;
    }

    @OnLifecycleEvent(value=Lifecycle.Event.ON_STOP)
    public final void onStop$core_release() {
        this.youTubePlayer.pause();
        this.playbackResumer.onLifecycleStop();
        this.canPlay = false;
    }

    @OnLifecycleEvent(value=Lifecycle.Event.ON_DESTROY)
    public final void release() {
        this.removeView((View)this.youTubePlayer);
        this.youTubePlayer.removeAllViews();
        this.youTubePlayer.destroy();
        try {
            this.getContext().unregisterReceiver((BroadcastReceiver)this.networkListener);
        }
        catch (Exception exception) {}
    }

    public final boolean removeFullScreenListener(YouTubePlayerFullScreenListener youTubePlayerFullScreenListener) {
        i.f((Object)youTubePlayerFullScreenListener, "fullScreenListener");
        return this.fullScreenHelper.removeFullScreenListener(youTubePlayerFullScreenListener);
    }

    public final void setYouTubePlayerReady$core_release(boolean bl) {
        this.isYouTubePlayerReady = bl;
    }

    public final void toggleFullScreen() {
        this.fullScreenHelper.toggleFullScreen();
    }
}

