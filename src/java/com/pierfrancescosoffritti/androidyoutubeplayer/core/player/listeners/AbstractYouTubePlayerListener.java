/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackQuality
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0006J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\b\"\u0010#\u00a8\u0006&"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/AbstractYouTubePlayerListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "youTubePlayer", "Lk/q;", "onReady", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "state", "onStateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;", "playbackQuality", "onPlaybackQualityChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "playbackRate", "onPlaybackRateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;", "error", "onError", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;)V", "onApiChange", "", "second", "onCurrentSecond", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;F)V", "duration", "onVideoDuration", "loadedFraction", "onVideoLoadedFraction", "", "videoId", "onVideoId", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Ljava/lang/String;)V", "<init>", "()V", "core_release"}, k=1, mv={1, 4, 0})
public abstract class AbstractYouTubePlayerListener
implements YouTubePlayerListener {
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
}

