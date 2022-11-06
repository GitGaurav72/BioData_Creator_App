/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$raw
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$YouTubePlayerBridgeCallbacks
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions$Companion
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.Utils
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$cueVideo
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$cueVideo$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$initWebView
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$initWebView$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$loadVideo
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$loadVideo$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$mute
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$mute$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$pause
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$pause$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$play
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$play$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$seekTo
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$seekTo$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$setVolume
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$setVolume$2
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$unMute
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$unMute$1
 *  java.io.InputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  k.d0.g
 *  k.x.b.l
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.Utils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import k.d0.g;
import k.q;
import k.x.b.l;
import k.x.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv={1, 0, 3}, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010?\u001a\u00020>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\b\b\u0002\u0010B\u001a\u00020\u001d\u00a2\u0006\u0004\bC\u0010DJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b$\u0010\u000fJ\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016\u00a2\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020&H\u0016\u00a2\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020&H\u0016\u00a2\u0006\u0004\b-\u0010,J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u001dH\u0014\u00a2\u0006\u0004\b/\u0010 R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b0\u00101R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020&028\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u00020*8\u0000@\u0000X\u000e\u00a2\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u00a8\u0006E"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "Landroid/webkit/WebView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge$YouTubePlayerBridgeCallbacks;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;", "playerOptions", "Lk/q;", "initWebView", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;)V", "Lkotlin/Function1;", "initListener", "initialize$core_release", "(Lk/x/b/l;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;)V", "initialize", "onYouTubeIFrameAPIReady", "()V", "getInstance", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "", "videoId", "", "startSeconds", "loadVideo", "(Ljava/lang/String;F)V", "cueVideo", "play", "pause", "mute", "unMute", "", "volumePercent", "setVolume", "(I)V", "time", "seekTo", "(F)V", "destroy", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "getListeners", "()Ljava/util/Collection;", "listener", "", "addListener", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;)Z", "removeListener", "visibility", "onWindowVisibilityChanged", "youTubePlayerInitListener", "Lk/x/b/l;", "Ljava/util/HashSet;", "youTubePlayerListeners", "Ljava/util/HashSet;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "isBackgroundPlaybackEnabled", "Z", "isBackgroundPlaybackEnabled$core_release", "()Z", "setBackgroundPlaybackEnabled$core_release", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "core_release"}, k=1, mv={1, 4, 0})
public final class WebViewYouTubePlayer
extends WebView
implements YouTubePlayer,
YouTubePlayerBridge.YouTubePlayerBridgeCallbacks {
    private boolean isBackgroundPlaybackEnabled;
    private final Handler mainThreadHandler;
    private l<? super YouTubePlayer, q> youTubePlayerInitListener;
    private final HashSet<YouTubePlayerListener> youTubePlayerListeners;

    public WebViewYouTubePlayer(Context context, AttributeSet attributeSet, int n) {
        i.f((Object)context, "context");
        super(context, attributeSet, n);
        this.youTubePlayerListeners = new HashSet();
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ WebViewYouTubePlayer(Context context, AttributeSet attributeSet, int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            attributeSet = null;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        this(context, attributeSet, n);
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private final void initWebView(IFramePlayerOptions iFramePlayerOptions) {
        WebSettings webSettings = this.getSettings();
        i.b((Object)webSettings, "settings");
        webSettings.setJavaScriptEnabled(true);
        WebSettings webSettings2 = this.getSettings();
        i.b((Object)webSettings2, "settings");
        webSettings2.setMediaPlaybackRequiresUserGesture(false);
        WebSettings webSettings3 = this.getSettings();
        i.b((Object)webSettings3, "settings");
        webSettings3.setCacheMode(2);
        this.addJavascriptInterface((Object)new YouTubePlayerBridge((YouTubePlayerBridge.YouTubePlayerBridgeCallbacks)this), "YouTubePlayerBridge");
        Utils utils = Utils.INSTANCE;
        InputStream inputStream = this.getResources().openRawResource(R.raw.ayp_youtube_player);
        i.b((Object)inputStream, "resources.openRawResourc\u2026R.raw.ayp_youtube_player)");
        String string = g.w((String)utils.readHTMLFromUTF8File(inputStream), (String)"<<injectedPlayerVars>>", (String)iFramePlayerOptions.toString(), (boolean)false, (int)4);
        this.loadDataWithBaseURL(iFramePlayerOptions.getOrigin$core_release(), string, "text/html", "utf-8", null);
        this.setWebChromeClient((WebChromeClient)new initWebView.1());
    }

    public boolean addListener(YouTubePlayerListener youTubePlayerListener) {
        i.f((Object)youTubePlayerListener, "listener");
        return this.youTubePlayerListeners.add((Object)youTubePlayerListener);
    }

    public void cueVideo(String string, float f) {
        i.f(string, "videoId");
        this.mainThreadHandler.post((Runnable)new cueVideo.1(this, string, f));
    }

    public void destroy() {
        this.youTubePlayerListeners.clear();
        this.mainThreadHandler.removeCallbacksAndMessages(null);
        super.destroy();
    }

    public YouTubePlayer getInstance() {
        return this;
    }

    public Collection<YouTubePlayerListener> getListeners() {
        Collection collection = Collections.unmodifiableCollection((Collection)new HashSet(this.youTubePlayerListeners));
        i.b((Object)collection, "Collections.unmodifiable\u2026(youTubePlayerListeners))");
        return collection;
    }

    public final void initialize$core_release(l<? super YouTubePlayer, q> l2, IFramePlayerOptions iFramePlayerOptions) {
        i.f(l2, "initListener");
        this.youTubePlayerInitListener = l2;
        if (iFramePlayerOptions == null) {
            iFramePlayerOptions = IFramePlayerOptions.Companion.getDefault();
        }
        this.initWebView(iFramePlayerOptions);
    }

    public final boolean isBackgroundPlaybackEnabled$core_release() {
        return this.isBackgroundPlaybackEnabled;
    }

    public void loadVideo(String string, float f) {
        i.f(string, "videoId");
        this.mainThreadHandler.post((Runnable)new loadVideo.1(this, string, f));
    }

    public void mute() {
        this.mainThreadHandler.post((Runnable)new mute.1(this));
    }

    public void onWindowVisibilityChanged(int n) {
        if (this.isBackgroundPlaybackEnabled && (n == 8 || n == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(n);
    }

    public void onYouTubeIFrameAPIReady() {
        l<? super YouTubePlayer, q> l2 = this.youTubePlayerInitListener;
        if (l2 != null) {
            l2.invoke((Object)this);
            return;
        }
        i.m("youTubePlayerInitListener");
        throw null;
    }

    public void pause() {
        this.mainThreadHandler.post((Runnable)new pause.1(this));
    }

    public void play() {
        this.mainThreadHandler.post((Runnable)new play.1(this));
    }

    public boolean removeListener(YouTubePlayerListener youTubePlayerListener) {
        i.f((Object)youTubePlayerListener, "listener");
        return this.youTubePlayerListeners.remove((Object)youTubePlayerListener);
    }

    public void seekTo(float f) {
        this.mainThreadHandler.post((Runnable)new seekTo.1(this, f));
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean bl) {
        this.isBackgroundPlaybackEnabled = bl;
    }

    public void setVolume(int n) {
        boolean bl = n >= 0 && n <= 100;
        if (bl) {
            this.mainThreadHandler.post((Runnable)new setVolume.2(this, n));
            return;
        }
        throw new IllegalArgumentException("Volume must be between 0 and 100".toString());
    }

    public void unMute() {
        this.mainThreadHandler.post((Runnable)new unMute.1(this));
    }
}

