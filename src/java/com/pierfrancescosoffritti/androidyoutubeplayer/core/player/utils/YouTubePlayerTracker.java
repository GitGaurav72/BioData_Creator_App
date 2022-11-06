/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\u00a8\u0006\""}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/YouTubePlayerTracker;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/AbstractYouTubePlayerListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "youTubePlayer", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "state", "Lk/q;", "onStateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;)V", "", "second", "onCurrentSecond", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;F)V", "duration", "onVideoDuration", "", "videoId", "onVideoId", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Ljava/lang/String;)V", "<set-?>", "videoDuration", "F", "getVideoDuration", "()F", "Ljava/lang/String;", "getVideoId", "()Ljava/lang/String;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "getState", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "currentSecond", "getCurrentSecond", "<init>", "()V", "core_release"}, k=1, mv={1, 4, 0})
public final class YouTubePlayerTracker
extends AbstractYouTubePlayerListener {
    private float currentSecond;
    private PlayerConstants.PlayerState state = PlayerConstants.PlayerState.UNKNOWN;
    private float videoDuration;
    private String videoId;

    public final float getCurrentSecond() {
        return this.currentSecond;
    }

    public final PlayerConstants.PlayerState getState() {
        return this.state;
    }

    public final float getVideoDuration() {
        return this.videoDuration;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    @Override
    public void onCurrentSecond(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        this.currentSecond = f;
    }

    @Override
    public void onStateChange(YouTubePlayer youTubePlayer, PlayerConstants.PlayerState playerState) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f((Object)playerState, "state");
        this.state = playerState;
    }

    @Override
    public void onVideoDuration(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        this.videoDuration = f;
    }

    @Override
    public void onVideoId(YouTubePlayer youTubePlayer, String string) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f(string, "videoId");
        this.videoId = string;
    }
}

