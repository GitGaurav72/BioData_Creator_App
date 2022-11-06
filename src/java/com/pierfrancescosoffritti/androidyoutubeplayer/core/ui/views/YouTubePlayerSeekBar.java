/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.core.content.ContextCompat
 *  androidx.core.graphics.drawable.DrawableCompat
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$color
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$dimen
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$string
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$styleable
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackQuality
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.TimeUtilities
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBar$resetUi
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBar$resetUi$1
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBarListener
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.utils.TimeUtilities;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBarListener;
import k.x.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010W\u001a\u00020V\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X\u00a2\u0006\u0004\bZ\u0010[J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b%\u0010#J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b'\u0010#J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*H\u0016\u00a2\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b.\u0010)J\u001f\u00101\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/H\u0016\u00a2\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00108\u001a\u000207H\u0016\u00a2\u0006\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010<R\u0019\u0010\u0014\u001a\u00020\u00138\u0006@\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u0010<R$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0019\u0010N\u001a\u00020M8\u0006@\u0006\u00a2\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bR\u0010SR\u0019\u0010T\u001a\u00020M8\u0006@\u0006\u00a2\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010Q\u00a8\u0006\\"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBar;", "Landroid/widget/LinearLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "state", "Lk/q;", "updateState", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;)V", "resetUi", "()V", "", "fontSize", "setFontSize", "(F)V", "", "color", "setColor", "(I)V", "Landroid/widget/SeekBar;", "seekBar", "progress", "", "fromUser", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "onStopTrackingTouch", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "youTubePlayer", "onStateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;)V", "second", "onCurrentSecond", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;F)V", "duration", "onVideoDuration", "loadedFraction", "onVideoLoadedFraction", "onReady", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;)V", "", "videoId", "onVideoId", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Ljava/lang/String;)V", "onApiChange", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;", "playbackQuality", "onPlaybackQualityChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "playbackRate", "onPlaybackRateChange", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;)V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;", "error", "onError", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;)V", "showBufferingProgress", "Z", "getShowBufferingProgress", "()Z", "setShowBufferingProgress", "(Z)V", "seekBarTouchStarted", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "isPlaying", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBarListener;", "youtubePlayerSeekBarListener", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBarListener;", "getYoutubePlayerSeekBarListener", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBarListener;", "setYoutubePlayerSeekBarListener", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBarListener;)V", "Landroid/widget/TextView;", "videoCurrentTimeTextView", "Landroid/widget/TextView;", "getVideoCurrentTimeTextView", "()Landroid/widget/TextView;", "newSeekBarProgress", "I", "videoDurationTextView", "getVideoDurationTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k=1, mv={1, 4, 0})
public final class YouTubePlayerSeekBar
extends LinearLayout
implements SeekBar.OnSeekBarChangeListener,
YouTubePlayerListener {
    private boolean isPlaying;
    private int newSeekBarProgress;
    private final SeekBar seekBar;
    private boolean seekBarTouchStarted;
    private boolean showBufferingProgress;
    private final TextView videoCurrentTimeTextView;
    private final TextView videoDurationTextView;
    private YouTubePlayerSeekBarListener youtubePlayerSeekBarListener;

    public YouTubePlayerSeekBar(Context context, AttributeSet attributeSet) {
        TextView textView;
        SeekBar seekBar;
        TextView textView2;
        i.f((Object)context, "context");
        super(context, attributeSet);
        this.newSeekBarProgress = -1;
        this.showBufferingProgress = true;
        this.videoCurrentTimeTextView = textView2 = new TextView(context);
        this.videoDurationTextView = textView = new TextView(context);
        this.seekBar = seekBar = new SeekBar(context);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.YouTubePlayerSeekBar, 0, 0);
        int n2 = typedArray.getDimensionPixelSize(R.styleable.YouTubePlayerSeekBar_fontSize, this.getResources().getDimensionPixelSize(R.dimen.ayp_12sp));
        int n3 = typedArray.getColor(R.styleable.YouTubePlayerSeekBar_color, ContextCompat.getColor((Context)context, (int)R.color.ayp_red));
        typedArray.recycle();
        int n4 = this.getResources().getDimensionPixelSize(R.dimen.ayp_8dp);
        Resources resources = this.getResources();
        int n5 = R.string.ayp_null_time;
        textView2.setText((CharSequence)resources.getString(n5));
        textView2.setPadding(n4, n4, 0, n4);
        textView2.setTextColor(ContextCompat.getColor((Context)context, (int)17170443));
        textView2.setGravity(16);
        textView.setText((CharSequence)this.getResources().getString(n5));
        textView.setPadding(0, n4, n4, n4);
        textView.setTextColor(ContextCompat.getColor((Context)context, (int)17170443));
        textView.setGravity(16);
        this.setFontSize(n2);
        int n6 = n4 * 2;
        seekBar.setPadding(n6, n4, n6, n4);
        this.setColor(n3);
        this.addView((View)textView2, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2));
        this.addView((View)seekBar, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.addView((View)textView, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2));
        this.setGravity(16);
        seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
    }

    public /* synthetic */ YouTubePlayerSeekBar(Context context, AttributeSet attributeSet, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private final void resetUi() {
        this.seekBar.setProgress(0);
        this.seekBar.setMax(0);
        this.videoDurationTextView.post((Runnable)new resetUi.1(this));
    }

    private final void updateState(PlayerConstants.PlayerState playerState) {
        int n2 = playerState.ordinal();
        if (n2 != 1) {
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
            return;
        }
        this.resetUi();
    }

    public final SeekBar getSeekBar() {
        return this.seekBar;
    }

    public final boolean getShowBufferingProgress() {
        return this.showBufferingProgress;
    }

    public final TextView getVideoCurrentTimeTextView() {
        return this.videoCurrentTimeTextView;
    }

    public final TextView getVideoDurationTextView() {
        return this.videoDurationTextView;
    }

    public final YouTubePlayerSeekBarListener getYoutubePlayerSeekBarListener() {
        return this.youtubePlayerSeekBarListener;
    }

    public void onApiChange(YouTubePlayer youTubePlayer) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public void onCurrentSecond(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        if (this.seekBarTouchStarted) {
            return;
        }
        if (this.newSeekBarProgress > 0 && true ^ i.a(TimeUtilities.formatTime((float)f), TimeUtilities.formatTime((float)this.newSeekBarProgress))) {
            return;
        }
        this.newSeekBarProgress = -1;
        this.seekBar.setProgress((int)f);
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

    public void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
        i.f((Object)seekBar, "seekBar");
        this.videoCurrentTimeTextView.setText((CharSequence)TimeUtilities.formatTime((float)n2));
    }

    public void onReady(YouTubePlayer youTubePlayer) {
        i.f((Object)youTubePlayer, "youTubePlayer");
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        i.f((Object)seekBar, "seekBar");
        this.seekBarTouchStarted = true;
    }

    public void onStateChange(YouTubePlayer youTubePlayer, PlayerConstants.PlayerState playerState) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f((Object)playerState, "state");
        this.newSeekBarProgress = -1;
        this.updateState(playerState);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        YouTubePlayerSeekBarListener youTubePlayerSeekBarListener;
        i.f((Object)seekBar, "seekBar");
        if (this.isPlaying) {
            this.newSeekBarProgress = seekBar.getProgress();
        }
        if ((youTubePlayerSeekBarListener = this.youtubePlayerSeekBarListener) != null) {
            youTubePlayerSeekBarListener.seekTo((float)seekBar.getProgress());
        }
        this.seekBarTouchStarted = false;
    }

    public void onVideoDuration(YouTubePlayer youTubePlayer, float f) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        this.videoDurationTextView.setText((CharSequence)TimeUtilities.formatTime((float)f));
        this.seekBar.setMax((int)f);
    }

    public void onVideoId(YouTubePlayer youTubePlayer, String string2) {
        i.f((Object)youTubePlayer, "youTubePlayer");
        i.f(string2, "videoId");
    }

    public void onVideoLoadedFraction(YouTubePlayer youTubePlayer, float f) {
        SeekBar seekBar;
        int n2;
        i.f((Object)youTubePlayer, "youTubePlayer");
        if (this.showBufferingProgress) {
            seekBar = this.seekBar;
            n2 = (int)(f * (float)seekBar.getMax());
        } else {
            seekBar = this.seekBar;
            n2 = 0;
        }
        seekBar.setSecondaryProgress(n2);
    }

    public final void setColor(@ColorInt int n2) {
        DrawableCompat.setTint((Drawable)this.seekBar.getThumb(), (int)n2);
        DrawableCompat.setTint((Drawable)this.seekBar.getProgressDrawable(), (int)n2);
    }

    public final void setFontSize(float f) {
        this.videoCurrentTimeTextView.setTextSize(0, f);
        this.videoDurationTextView.setTextSize(0, f);
    }

    public final void setShowBufferingProgress(boolean bl) {
        this.showBufferingProgress = bl;
    }

    public final void setYoutubePlayerSeekBarListener(YouTubePlayerSeekBarListener youTubePlayerSeekBarListener) {
        this.youtubePlayerSeekBarListener = youTubePlayerSeekBarListener;
    }
}

