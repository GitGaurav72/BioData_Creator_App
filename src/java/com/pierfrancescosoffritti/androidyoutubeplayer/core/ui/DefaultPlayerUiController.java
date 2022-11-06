/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$drawable
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$id
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$layout
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackQuality
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$2
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$initClickListeners
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$initClickListeners$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$initClickListeners$2
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$initClickListeners$3
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$initClickListeners$4
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$onVideoId
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController$onVideoId$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.YouTubePlayerMenu
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBarListener
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.YouTubePlayerMenu;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.defaultMenu.DefaultYouTubePlayerMenu;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.FadeViewHelper;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBarListener;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001a\u0012\u0007\u0010\u0001\u001a\u00020\u0012\u0006\u0010@\u001a\u00020?\u00a2\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u0013J!\u0010 \u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016\u00a2\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016\u00a2\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b#\u0010\u0013J\u0017\u0010$\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b$\u0010\u0013J\u0017\u0010%\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b%\u0010\u0013J\u0017\u0010'\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b)\u0010\u0013J\u0017\u0010*\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b*\u0010\u0013J\u0017\u0010+\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b+\u0010\u0013J\u0017\u0010,\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b,\u0010\u0013J\u0017\u0010-\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b-\u0010\u0013J\u0017\u00100\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.H\u0016\u00a2\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.H\u0016\u00a2\u0006\u0004\b2\u00101J\u000f\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b6\u0010\u0013J\u0017\u00108\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\b8\u0010(J\u000f\u00109\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b9\u0010\u0007J\u000f\u0010:\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b:\u0010\u0007J\u0017\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00020;H\u0016\u00a2\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?H\u0016\u00a2\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u0010I\u001a\u00020HH\u0016\u00a2\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u0010M\u001a\u00020LH\u0016\u00a2\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u0010Q\u001a\u00020PH\u0016\u00a2\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?H\u0016\u00a2\u0006\u0004\bT\u0010GJ\u001f\u0010V\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u0010U\u001a\u00020;H\u0016\u00a2\u0006\u0004\bV\u0010WJ\u001f\u0010Y\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u0010X\u001a\u00020;H\u0016\u00a2\u0006\u0004\bY\u0010WJ\u001f\u0010[\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u0010Z\u001a\u00020;H\u0016\u00a2\u0006\u0004\b[\u0010WR\u0016\u0010\\\u001a\u00020.8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020`8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bf\u0010bR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020`8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bu\u0010bR\u0016\u0010\u0015\u001a\u00020c8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010eR\u0016\u0010v\u001a\u00020.8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bv\u0010]R\u0016\u0010w\u001a\u00020`8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bw\u0010bR\u0016\u0010x\u001a\u00020`8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bx\u0010bR\u0016\u0010y\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\by\u0010qR\u0016\u0010z\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bz\u0010qR\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010{R\u0016\u0010|\u001a\u00020`8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b|\u0010bR\u0016\u0010}\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u0001\u001a\u000208\u0002@\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0001\u0010\u0081\u0001R\u0018\u0010\u0082\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0082\u0001\u0010qR\u0018\u0010\u0083\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0083\u0001\u0010~\u00a8\u0006\u0086\u0001"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/DefaultPlayerUiController;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerFullScreenListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBarListener;", "Lk/q;", "initClickListeners", "()V", "onPlayButtonPressed", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "state", "updateState", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;)V", "", "playing", "updatePlayPauseButtonIcon", "(Z)V", "show", "showVideoTitle", "(Z)Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "", "videoTitle", "setVideoTitle", "(Ljava/lang/String;)Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "showUi", "showPlayPauseButton", "enable", "enableLiveVideoUi", "Landroid/graphics/drawable/Drawable;", "icon", "Landroid/view/View$OnClickListener;", "clickListener", "setCustomAction1", "(Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "setCustomAction2", "showCustomAction1", "showCustomAction2", "showMenuButton", "customMenuButtonClickListener", "setMenuButtonClickListener", "(Landroid/view/View$OnClickListener;)Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "showCurrentTime", "showDuration", "showSeekBar", "showBufferingProgress", "showYouTubeButton", "Landroid/view/View;", "view", "addView", "(Landroid/view/View;)Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/PlayerUiController;", "removeView", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/YouTubePlayerMenu;", "getMenu", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/YouTubePlayerMenu;", "showFullscreenButton", "customFullScreenButtonClickListener", "setFullScreenButtonClickListener", "onYouTubePlayerEnterFullScreen", "onYouTubePlayerExitFullScreen", "", "time", "seekTo", "(F)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "youTubePlayer", "onStateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;)V", "videoId", "onVideoId", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Ljava/lang/String;)V", "onReady", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;", "playbackQuality", "onPlaybackQualityChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "playbackRate", "onPlaybackRateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;", "error", "onError", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;)V", "onApiChange", "second", "onCurrentSecond", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;F)V", "duration", "onVideoDuration", "loadedFraction", "onVideoLoadedFraction", "controlsContainer", "Landroid/view/View;", "youTubePlayerMenu", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/YouTubePlayerMenu;", "Landroid/widget/ImageView;", "customActionLeft", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "liveVideoIndicator", "Landroid/widget/TextView;", "playPauseButton", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/utils/FadeViewHelper;", "fadeControlsContainer", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/utils/FadeViewHelper;", "Landroid/widget/LinearLayout;", "extraViewsContainer", "Landroid/widget/LinearLayout;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBar;", "youtubePlayerSeekBar", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBar;", "isPlaying", "Z", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "youTubeButton", "panel", "menuButton", "fullScreenButton", "isCustomActionLeftEnabled", "isCustomActionRightEnabled", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "customActionRight", "onFullScreenButtonListener", "Landroid/view/View$OnClickListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "youTubePlayerView", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "isPlayPauseButtonEnabled", "onMenuButtonClickListener", "<init>", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;)V", "core_release"}, k=1, mv={1, 4, 0})
public final class DefaultPlayerUiController
implements PlayerUiController,
YouTubePlayerListener,
YouTubePlayerFullScreenListener,
YouTubePlayerSeekBarListener {
    private final View controlsContainer;
    private final ImageView customActionLeft;
    private final ImageView customActionRight;
    private final LinearLayout extraViewsContainer;
    private final FadeViewHelper fadeControlsContainer;
    private final ImageView fullScreenButton;
    private boolean isCustomActionLeftEnabled;
    private boolean isCustomActionRightEnabled;
    private boolean isPlayPauseButtonEnabled;
    private boolean isPlaying;
    private final TextView liveVideoIndicator;
    private final ImageView menuButton;
    private View.OnClickListener onFullScreenButtonListener;
    private View.OnClickListener onMenuButtonClickListener;
    private final View panel;
    private final ImageView playPauseButton;
    private final ProgressBar progressBar;
    private final TextView videoTitle;
    private final ImageView youTubeButton;
    private final YouTubePlayer youTubePlayer;
    private YouTubePlayerMenu youTubePlayerMenu;
    private final LegacyYouTubePlayerView youTubePlayerView;
    private final YouTubePlayerSeekBar youtubePlayerSeekBar;

    public DefaultPlayerUiController(LegacyYouTubePlayerView legacyYouTubePlayerView, YouTubePlayer youTubePlayer) {
        i.f((Object)legacyYouTubePlayerView, "youTubePlayerView");
        i.f((Object)youTubePlayer, "youTubePlayer");
        this.youTubePlayerView = legacyYouTubePlayerView;
        this.youTubePlayer = youTubePlayer;
        this.isPlayPauseButtonEnabled = true;
        View view = View.inflate((Context)legacyYouTubePlayerView.getContext(), (int)R.layout.ayp_default_player_ui, (ViewGroup)legacyYouTubePlayerView);
        Context context = legacyYouTubePlayerView.getContext();
        i.b((Object)context, "youTubePlayerView.context");
        this.youTubePlayerMenu = new DefaultYouTubePlayerMenu(context);
        View view2 = view.findViewById(R.id.panel);
        i.b((Object)view2, "controlsView.findViewById(R.id.panel)");
        this.panel = view2;
        View view3 = view.findViewById(R.id.controls_container);
        i.b((Object)view3, "controlsView.findViewById(R.id.controls_container)");
        this.controlsContainer = view3;
        View view4 = view.findViewById(R.id.extra_views_container);
        i.b((Object)view4, "controlsView.findViewByI\u2026id.extra_views_container)");
        this.extraViewsContainer = (LinearLayout)view4;
        View view5 = view.findViewById(R.id.video_title);
        i.b((Object)view5, "controlsView.findViewById(R.id.video_title)");
        this.videoTitle = (TextView)view5;
        View view6 = view.findViewById(R.id.live_video_indicator);
        i.b((Object)view6, "controlsView.findViewByI\u2026.id.live_video_indicator)");
        this.liveVideoIndicator = (TextView)view6;
        View view7 = view.findViewById(R.id.progress);
        i.b((Object)view7, "controlsView.findViewById(R.id.progress)");
        this.progressBar = (ProgressBar)view7;
        View view8 = view.findViewById(R.id.menu_button);
        i.b((Object)view8, "controlsView.findViewById(R.id.menu_button)");
        this.menuButton = (ImageView)view8;
        View view9 = view.findViewById(R.id.play_pause_button);
        i.b((Object)view9, "controlsView.findViewById(R.id.play_pause_button)");
        this.playPauseButton = (ImageView)view9;
        View view10 = view.findViewById(R.id.youtube_button);
        i.b((Object)view10, "controlsView.findViewById(R.id.youtube_button)");
        this.youTubeButton = (ImageView)view10;
        View view11 = view.findViewById(R.id.fullscreen_button);
        i.b((Object)view11, "controlsView.findViewById(R.id.fullscreen_button)");
        this.fullScreenButton = (ImageView)view11;
        View view12 = view.findViewById(R.id.custom_action_left_button);
        i.b((Object)view12, "controlsView.findViewByI\u2026ustom_action_left_button)");
        this.customActionLeft = (ImageView)view12;
        View view13 = view.findViewById(R.id.custom_action_right_button);
        i.b((Object)view13, "controlsView.findViewByI\u2026stom_action_right_button)");
        this.customActionRight = (ImageView)view13;
        View view14 = view.findViewById(R.id.youtube_player_seekbar);
        i.b((Object)view14, "controlsView.findViewByI\u2026d.youtube_player_seekbar)");
        this.youtubePlayerSeekBar = (YouTubePlayerSeekBar)view14;
        this.fadeControlsContainer = new FadeViewHelper(view3);
        this.onFullScreenButtonListener = new 1(this);
        this.onMenuButtonClickListener = new 2(this);
        this.initClickListeners();
    }

    public static final /* synthetic */ FadeViewHelper access$getFadeControlsContainer$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.fadeControlsContainer;
    }

    public static final /* synthetic */ ImageView access$getFullScreenButton$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.fullScreenButton;
    }

    public static final /* synthetic */ ImageView access$getMenuButton$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.menuButton;
    }

    public static final /* synthetic */ View.OnClickListener access$getOnFullScreenButtonListener$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.onFullScreenButtonListener;
    }

    public static final /* synthetic */ View.OnClickListener access$getOnMenuButtonClickListener$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.onMenuButtonClickListener;
    }

    public static final /* synthetic */ ImageView access$getYouTubeButton$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.youTubeButton;
    }

    public static final /* synthetic */ YouTubePlayerMenu access$getYouTubePlayerMenu$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.youTubePlayerMenu;
    }

    public static final /* synthetic */ LegacyYouTubePlayerView access$getYouTubePlayerView$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.youTubePlayerView;
    }

    public static final /* synthetic */ YouTubePlayerSeekBar access$getYoutubePlayerSeekBar$p(DefaultPlayerUiController defaultPlayerUiController) {
        return defaultPlayerUiController.youtubePlayerSeekBar;
    }

    public static final /* synthetic */ void access$onPlayButtonPressed(DefaultPlayerUiController defaultPlayerUiController) {
        defaultPlayerUiController.onPlayButtonPressed();
    }

    public static final /* synthetic */ void access$setOnFullScreenButtonListener$p(DefaultPlayerUiController defaultPlayerUiController, View.OnClickListener onClickListener) {
        defaultPlayerUiController.onFullScreenButtonListener = onClickListener;
    }

    public static final /* synthetic */ void access$setOnMenuButtonClickListener$p(DefaultPlayerUiController defaultPlayerUiController, View.OnClickListener onClickListener) {
        defaultPlayerUiController.onMenuButtonClickListener = onClickListener;
    }

    public static final /* synthetic */ void access$setYouTubePlayerMenu$p(DefaultPlayerUiController defaultPlayerUiController, YouTubePlayerMenu youTubePlayerMenu) {
        defaultPlayerUiController.youTubePlayerMenu = youTubePlayerMenu;
    }

    private final void initClickListeners() {
        this.youTubePlayer.addListener((YouTubePlayerListener)this.youtubePlayerSeekBar);
        this.youTubePlayer.addListener((YouTubePlayerListener)this.fadeControlsContainer);
        this.youtubePlayerSeekBar.setYoutubePlayerSeekBarListener(this);
        this.panel.setOnClickListener((View.OnClickListener)new initClickListeners.1(this));
        this.playPauseButton.setOnClickListener((View.OnClickListener)new initClickListeners.2(this));
        this.fullScreenButton.setOnClickListener((View.OnClickListener)new initClickListeners.3(this));
        this.menuButton.setOnClickListener((View.OnClickListener)new initClickListeners.4(this));
    }

    private final void onPlayButtonPressed() {
        if (this.isPlaying) {
            this.youTubePlayer.pause();
            return;
        }
        this.youTubePlayer.play();
    }

    private final void updatePlayPauseButtonIcon(boolean bl) {
        ImageView imageView = this.playPauseButton;
        int n = bl ? R.drawable.ayp_ic_pause_36dp : R.drawable.ayp_ic_play_36dp;
        imageView.setImageResource(n);
    }

    private final void updateState(PlayerConstants.PlayerState playerState) {
        block2 : {
            block0 : {
                block1 : {
                    int n = playerState.ordinal();
                    if (n == 2) break block0;
                    if (n == 3) break block1;
                    if (n == 4) break block0;
                    break block2;
                }
                this.isPlaying = true;
                break block2;
            }
            this.isPlaying = false;
        }
        this.updatePlayPauseButtonIcon(true ^ this.isPlaying);
    }

    public PlayerUiController addView(View view) {
        i.f((Object)view, "view");
        this.extraViewsContainer.addView(view, 0);
        return this;
    }

    public PlayerUiController enableLiveVideoUi(boolean bl) {
        YouTubePlayerSeekBar youTubePlayerSeekBar = this.youtubePlayerSeekBar;
        int n = bl ? 4 : 0;
        youTubePlayerSeekBar.setVisibility(n);
        TextView textView = this.liveVideoIndicator;
        int n2 = bl ? 0 : 8;
        textView.setVisibility(n2);
        return this;
    }

    public YouTubePlayerMenu getMenu() {
        return this.youTubePlayerMenu;
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
        PlayerConstants.PlayerState playerState2 = PlayerConstants.PlayerState.PLAYING;
        if (playerState != playerState2 && playerState != PlayerConstants.PlayerState.PAUSED && playerState != PlayerConstants.PlayerState.VIDEO_CUED) {
            this.updatePlayPauseButtonIcon(false);
            if (playerState == PlayerConstants.PlayerState.BUFFERING) {
                this.progressBar.setVisibility(0);
                View view = this.panel;
                view.setBackgroundColor(ContextCompat.getColor((Context)view.getContext(), (int)17170445));
                if (this.isPlayPauseButtonEnabled) {
                    this.playPauseButton.setVisibility(4);
                }
                this.customActionLeft.setVisibility(8);
                this.customActionRight.setVisibility(8);
            }
            if (playerState == PlayerConstants.PlayerState.UNSTARTED) {
                this.progressBar.setVisibility(8);
                if (this.isPlayPauseButtonEnabled) {
                    this.playPauseButton.setVisibility(0);
                    return;
                }
            }
        } else {
            View view = this.panel;
            view.setBackgroundColor(ContextCompat.getColor((Context)view.getContext(), (int)17170445));
            this.progressBar.setVisibility(8);
            if (this.isPlayPauseButtonEnabled) {
                this.playPauseButton.setVisibility(0);
            }
            if (this.isCustomActionLeftEnabled) {
                this.customActionLeft.setVisibility(0);
            }
            if (this.isCustomActionRightEnabled) {
                this.customActionRight.setVisibility(0);
            }
            boolean bl = false;
            if (playerState == playerState2) {
                bl = true;
            }
            this.updatePlayPauseButtonIcon(bl);
        }
    }

    public void onVideoDuration(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public void onVideoId(YouTubePlayer youTubePlayer, String string) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f(string, "videoId");
        this.youTubeButton.setOnClickListener((View.OnClickListener)new onVideoId.1(this, string));
    }

    public void onVideoLoadedFraction(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public void onYouTubePlayerEnterFullScreen() {
        this.fullScreenButton.setImageResource(R.drawable.ayp_ic_fullscreen_exit_24dp);
    }

    public void onYouTubePlayerExitFullScreen() {
        this.fullScreenButton.setImageResource(R.drawable.ayp_ic_fullscreen_24dp);
    }

    public PlayerUiController removeView(View view) {
        i.f((Object)view, "view");
        this.extraViewsContainer.removeView(view);
        return this;
    }

    public void seekTo(float f) {
        this.youTubePlayer.seekTo(f);
    }

    public PlayerUiController setCustomAction1(Drawable drawable2, View.OnClickListener onClickListener) {
        i.f((Object)drawable2, "icon");
        this.customActionLeft.setImageDrawable(drawable2);
        this.customActionLeft.setOnClickListener(onClickListener);
        this.showCustomAction1(true);
        return this;
    }

    public PlayerUiController setCustomAction2(Drawable drawable2, View.OnClickListener onClickListener) {
        i.f((Object)drawable2, "icon");
        this.customActionRight.setImageDrawable(drawable2);
        this.customActionRight.setOnClickListener(onClickListener);
        this.showCustomAction2(true);
        return this;
    }

    public PlayerUiController setFullScreenButtonClickListener(View.OnClickListener onClickListener) {
        i.f((Object)onClickListener, "customFullScreenButtonClickListener");
        this.onFullScreenButtonListener = onClickListener;
        return this;
    }

    public PlayerUiController setMenuButtonClickListener(View.OnClickListener onClickListener) {
        i.f((Object)onClickListener, "customMenuButtonClickListener");
        this.onMenuButtonClickListener = onClickListener;
        return this;
    }

    public PlayerUiController setVideoTitle(String string) {
        i.f(string, "videoTitle");
        this.videoTitle.setText((CharSequence)string);
        return this;
    }

    public PlayerUiController showBufferingProgress(boolean bl) {
        this.youtubePlayerSeekBar.setShowBufferingProgress(bl);
        return this;
    }

    public PlayerUiController showCurrentTime(boolean bl) {
        TextView textView = this.youtubePlayerSeekBar.getVideoCurrentTimeTextView();
        int n = bl ? 0 : 8;
        textView.setVisibility(n);
        return this;
    }

    public PlayerUiController showCustomAction1(boolean bl) {
        this.isCustomActionLeftEnabled = bl;
        ImageView imageView = this.customActionLeft;
        int n = bl ? 0 : 8;
        imageView.setVisibility(n);
        return this;
    }

    public PlayerUiController showCustomAction2(boolean bl) {
        this.isCustomActionRightEnabled = bl;
        ImageView imageView = this.customActionRight;
        int n = bl ? 0 : 8;
        imageView.setVisibility(n);
        return this;
    }

    public PlayerUiController showDuration(boolean bl) {
        TextView textView = this.youtubePlayerSeekBar.getVideoDurationTextView();
        int n = bl ? 0 : 8;
        textView.setVisibility(n);
        return this;
    }

    public PlayerUiController showFullscreenButton(boolean bl) {
        ImageView imageView = this.fullScreenButton;
        int n = bl ? 0 : 8;
        imageView.setVisibility(n);
        return this;
    }

    public PlayerUiController showMenuButton(boolean bl) {
        ImageView imageView = this.menuButton;
        int n = bl ? 0 : 8;
        imageView.setVisibility(n);
        return this;
    }

    public PlayerUiController showPlayPauseButton(boolean bl) {
        ImageView imageView = this.playPauseButton;
        int n = bl ? 0 : 8;
        imageView.setVisibility(n);
        this.isPlayPauseButtonEnabled = bl;
        return this;
    }

    public PlayerUiController showSeekBar(boolean bl) {
        SeekBar seekBar = this.youtubePlayerSeekBar.getSeekBar();
        int n = bl ? 0 : 4;
        seekBar.setVisibility(n);
        return this;
    }

    public PlayerUiController showUi(boolean bl) {
        this.fadeControlsContainer.setDisabled(bl ^ true);
        View view = this.controlsContainer;
        int n = bl ? 0 : 4;
        view.setVisibility(n);
        return this;
    }

    public PlayerUiController showVideoTitle(boolean bl) {
        TextView textView = this.videoTitle;
        int n = bl ? 0 : 8;
        textView.setVisibility(n);
        return this;
    }

    public PlayerUiController showYouTubeButton(boolean bl) {
        ImageView imageView = this.youTubeButton;
        int n = bl ? 0 : 8;
        imageView.setVisibility(n);
        return this;
    }
}

