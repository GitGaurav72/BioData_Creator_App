/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.Window
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.FragmentActivity
 *  androidx.lifecycle.Lifecycle
 *  androidx.lifecycle.LifecycleObserver
 *  com.appfoundry.previewer.activities.YoutubeActivity$a
 *  com.appfoundry.previewer.activities.YoutubeActivity$b
 *  com.appfoundry.previewer.activities.YoutubeActivity$c
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.appfoundry.previewer.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.appfoundry.previewer.activities.YoutubeActivity;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController;
import k.x.c.i;
import kotlin.Metadata;

/*
 * Exception performing whole class analysis.
 */
@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/appfoundry/previewer/activities/YoutubeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "fullScreenHelper", "Lcom/appfoundry/previewer/activities/YoutubeActivity$FullScreenHelper;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "FullScreenHelper", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public final class YoutubeActivity
extends AppCompatActivity {
    public final a k;

    public YoutubeActivity() {
        this.k = new /* Unavailable Anonymous Inner Class!! */;
    }

    public void onCreate(Bundle bundle) {
        FragmentActivity.super.onCreate(bundle);
        this.setContentView(2131427366);
        String string = this.getIntent().getStringExtra("video_id");
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView)this.findViewById(2131231437);
        youTubePlayerView.addYouTubePlayerListener((YouTubePlayerListener)new b(string));
        youTubePlayerView.getPlayerUiController().showFullscreenButton(true);
        youTubePlayerView.enterFullScreen();
        this.setRequestedOrientation(0);
        View view = this.k.a.getWindow().getDecorView();
        i.d((Object)view, "context.window.decorView");
        view.setSystemUiVisibility(5894);
        youTubePlayerView.addFullScreenListener((YouTubePlayerFullScreenListener)new c(this));
        this.getLifecycle().addObserver((LifecycleObserver)youTubePlayerView);
    }
}

