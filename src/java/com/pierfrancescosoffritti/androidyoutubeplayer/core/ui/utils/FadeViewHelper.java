/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackQuality
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.FadeViewHelper$Companion
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.FadeViewHelper$fade
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.FadeViewHelper$fade$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.FadeViewHelper$fadeOut
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.FadeViewHelper$fadeOut$1
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils;

import android.animation.Animator;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.FadeViewHelper;
import k.x.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/*
 * Exception performing whole class analysis.
 */
@Metadata(bv={1, 0, 3}, d1={"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 H2\u00020\u0001:\u0001HB\u000f\u0012\u0006\u00106\u001a\u000205\u00a2\u0006\u0004\bF\u0010GJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u001f\u0010\u0012J\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b$\u0010\"J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b&\u0010\"J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0016\u00a2\u0006\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0019\u00106\u001a\u0002058\u0006@\u0006\u00a2\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=\"\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010A\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010<R\"\u0010B\u001a\u00020.8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\bB\u00100\u001a\u0004\bC\u00102\"\u0004\bD\u00104R\u0016\u0010E\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u0010<\u00a8\u0006I"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/utils/FadeViewHelper;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "", "finalAlpha", "Lk/q;", "fade", "(F)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "state", "updateState", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;)V", "toggleVisibility", "()V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "youTubePlayer", "onStateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;)V", "onReady", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;", "playbackQuality", "onPlaybackQualityChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "playbackRate", "onPlaybackRateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;", "error", "onError", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;)V", "onApiChange", "second", "onCurrentSecond", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;F)V", "duration", "onVideoDuration", "loadedFraction", "onVideoLoadedFraction", "", "videoId", "onVideoId", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Ljava/lang/String;)V", "Ljava/lang/Runnable;", "fadeOut", "Ljava/lang/Runnable;", "", "fadeOutDelay", "J", "getFadeOutDelay", "()J", "setFadeOutDelay", "(J)V", "Landroid/view/View;", "targetView", "Landroid/view/View;", "getTargetView", "()Landroid/view/View;", "", "isDisabled", "Z", "()Z", "setDisabled", "(Z)V", "isVisible", "isPlaying", "animationDuration", "getAnimationDuration", "setAnimationDuration", "canFade", "<init>", "(Landroid/view/View;)V", "Companion", "core_release"}, k=1, mv={1, 4, 0})
public final class FadeViewHelper
implements YouTubePlayerListener {
    public static final Companion Companion;
    public static final long DEFAULT_ANIMATION_DURATION = 300L;
    public static final long DEFAULT_FADE_OUT_DELAY = 3000L;
    private long animationDuration;
    private boolean canFade;
    private Runnable fadeOut;
    private long fadeOutDelay;
    private boolean isDisabled;
    private boolean isPlaying;
    private boolean isVisible;
    private final View targetView;

    public static {
        Companion = new /* Unavailable Anonymous Inner Class!! */;
    }

    public FadeViewHelper(View view) {
        i.f((Object)view, "targetView");
        this.targetView = view;
        this.isVisible = true;
        this.fadeOut = new fadeOut.1(this);
        this.animationDuration = 300L;
        this.fadeOutDelay = 3000L;
    }

    public static final /* synthetic */ void access$fade(FadeViewHelper fadeViewHelper, float f) {
        fadeViewHelper.fade(f);
    }

    private final void fade(float f) {
        if (this.canFade) {
            if (this.isDisabled) {
                return;
            }
            boolean bl = f != 0.0f;
            this.isVisible = bl;
            if (f == 1.0f && this.isPlaying) {
                Handler handler = this.targetView.getHandler();
                if (handler != null) {
                    handler.postDelayed(this.fadeOut, this.fadeOutDelay);
                }
            } else {
                Handler handler = this.targetView.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(this.fadeOut);
                }
            }
            this.targetView.animate().alpha(f).setDuration(this.animationDuration).setListener((Animator.AnimatorListener)new fade.1(this, f)).start();
        }
    }

    private final void updateState(PlayerConstants.PlayerState playerState) {
        int n2 = playerState.ordinal();
        if (n2 != 2) {
            if (n2 != 3) {
                if (n2 != 4) {
                    return;
                }
            } else {
                this.isPlaying = true;
                return;
            }
        }
        this.isPlaying = false;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final long getFadeOutDelay() {
        return this.fadeOutDelay;
    }

    public final View getTargetView() {
        return this.targetView;
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public void onApiChange(YouTubePlayer youTubePlayer) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public void onCurrentSecond(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public void onError(YouTubePlayer youTubePlayer, PlayerConstants.PlayerError playerError) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f((Object)playerError, "error");
    }

    public void onPlaybackQualityChange(YouTubePlayer youTubePlayer, PlayerConstants.PlaybackQuality playbackQuality) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f((Object)playbackQuality, "playbackQuality");
    }

    public void onPlaybackRateChange(YouTubePlayer youTubePlayer, PlayerConstants.PlaybackRate playbackRate) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f((Object)playbackRate, "playbackRate");
    }

    public void onReady(YouTubePlayer youTubePlayer) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public void onStateChange(YouTubePlayer youTubePlayer, PlayerConstants.PlayerState playerState) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f((Object)playerState, "state");
        this.updateState(playerState);
        switch (playerState.ordinal()) {
            default: {
                return;
            }
            case 0: 
            case 2: {
                this.fade(1.0f);
                return;
            }
            case 1: 
            case 5: {
                this.fade(1.0f);
                this.canFade = false;
                return;
            }
            case 3: 
            case 4: 
            case 6: 
        }
        this.canFade = true;
        if (playerState == PlayerConstants.PlayerState.PLAYING) {
            Handler handler = this.targetView.getHandler();
            if (handler != null) {
                handler.postDelayed(this.fadeOut, this.fadeOutDelay);
                return;
            }
        } else {
            Handler handler = this.targetView.getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.fadeOut);
            }
        }
    }

    public void onVideoDuration(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public void onVideoId(YouTubePlayer youTubePlayer, String string) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f(string, "videoId");
    }

    public void onVideoLoadedFraction(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public final void setAnimationDuration(long l2) {
        this.animationDuration = l2;
    }

    public final void setDisabled(boolean bl) {
        this.isDisabled = bl;
    }

    public final void setFadeOutDelay(long l2) {
        this.fadeOutDelay = l2;
    }

    public final void toggleVisibility() {
        float f = this.isVisible ? 0.0f : 1.0f;
        this.fade(f);
    }
}

