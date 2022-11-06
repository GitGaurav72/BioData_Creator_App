/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.Display
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewPropertyAnimator
 *  android.view.Window
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  androidx.activity.ComponentActivity
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.camera.core.Camera
 *  androidx.camera.core.CameraInfo
 *  androidx.camera.core.CameraSelector
 *  androidx.camera.core.CameraSelector$Builder
 *  androidx.camera.core.ImageCapture
 *  androidx.camera.core.ImageCapture$Builder
 *  androidx.camera.core.Preview
 *  androidx.camera.core.Preview$Builder
 *  androidx.camera.core.Preview$SurfaceProvider
 *  androidx.camera.core.UseCase
 *  androidx.camera.core.VideoCapture
 *  androidx.camera.core.VideoCapture$Builder
 *  androidx.camera.core.VideoCapture$OnVideoSavedCallback
 *  androidx.camera.core.VideoCapture$OutputFileOptions
 *  androidx.camera.core.VideoCapture$OutputFileOptions$Builder
 *  androidx.camera.lifecycle.ProcessCameraProvider
 *  androidx.camera.view.PreviewView
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.core.content.res.ResourcesCompat
 *  androidx.core.graphics.drawable.DrawableCompat
 *  androidx.fragment.app.FragmentActivity
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.recyclerview.widget.RecyclerView
 *  com.appexecutors.picker.Picker$a
 *  com.appexecutors.picker.Picker$b
 *  com.appexecutors.picker.Picker$c
 *  com.google.android.material.bottomsheet.BottomSheetBehavior
 *  e.f.a.b0.e
 *  e.f.a.b0.f
 *  e.f.a.b0.g
 *  e.f.a.c
 *  e.f.a.d
 *  e.f.a.d0.c
 *  e.f.a.e
 *  e.f.a.h
 *  e.f.a.k
 *  e.f.a.l
 *  e.f.a.m
 *  e.f.a.n
 *  e.f.a.o
 *  e.f.a.p
 *  e.f.a.q
 *  e.s.a.a
 *  java.io.File
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Locale
 *  java.util.Objects
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  kotlin.Metadata
 */
package com.appexecutors.picker;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.VideoCapture;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.appexecutors.picker.Picker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.f.a.b0.e;
import e.f.a.b0.f;
import e.f.a.b0.g;
import e.f.a.d;
import e.f.a.h;
import e.f.a.k;
import e.f.a.l;
import e.f.a.m;
import e.f.a.n;
import e.f.a.o;
import e.f.a.p;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k.q;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u00d9\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u00019\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0011\u0010\bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00168\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b&\u0010\u0018R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u0010$R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u0010$R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u00168\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bP\u0010\u0018R&\u0010W\u001a\u0012\u0012\u0004\u0012\u00020S0Rj\b\u0012\u0004\u0012\u00020S`T8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020?8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b$\u0010AR\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010c\u001a\u00020H8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010eR\u0016\u0010g\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010$R\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010o\u001a\u00020l8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020H8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bt\u0010bR\u0018\u0010x\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000b\u0010wR\u0016\u0010z\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\by\u0010\u001cR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b|\u0010}\u00a8\u0006\u0001"}, d2={"Lcom/appexecutors/picker/Picker;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lk/q;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "()V", "onBackPressed", "m", "n", "k", "Landroid/view/View;", "it", "o", "(Landroid/view/View;)V", "l", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "q", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraProvider", "Landroid/widget/TextView;", "F", "Landroid/widget/TextView;", "textViewImageCount", "Landroid/widget/ImageView;", "E", "Landroid/widget/ImageView;", "imageViewBack", "w", "imageViewChangeCamera", "z", "imageViewFlash", "", "s", "I", "statusBarSize", "G", "textViewTopSelect", "Landroidx/camera/core/VideoCapture;", "Landroidx/camera/core/VideoCapture;", "videoCapture", "Ljava/util/concurrent/ExecutorService;", "u", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "", "J", "Z", "isTakingVideo", "Landroid/widget/ImageButton;", "y", "Landroid/widget/ImageButton;", "imageViewClick", "K", "mVideoCounterProgress", "com/appexecutors/picker/Picker$a", "Q", "Lcom/appexecutors/picker/Picker$a;", "mMediaClickListener", "r", "flashMode", "Landroidx/recyclerview/widget/RecyclerView;", "H", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerViewInstantMedia", "Landroid/os/Handler;", "L", "Landroid/os/Handler;", "mVideoCounterHandler", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "R", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Le/f/a/b0/f;", "O", "Le/f/a/b0/f;", "mInstantMediaAdapter", "B", "textViewOk", "Ljava/util/ArrayList;", "Le/f/a/b0/g;", "Lkotlin/collections/ArrayList;", "N", "Ljava/util/ArrayList;", "galleryImageList", "Landroidx/camera/view/PreviewView;", "x", "Landroidx/camera/view/PreviewView;", "viewFinder", "recyclerViewBottomSheetMedia", "Ljava/lang/Runnable;", "M", "Ljava/lang/Runnable;", "mVideoCounterRunnable", "D", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintBottomSheetTop", "Landroidx/camera/core/Preview;", "Landroidx/camera/core/Preview;", "preview", "lensFacing", "Landroidx/camera/core/Camera;", "p", "Landroidx/camera/core/Camera;", "camera", "Ljava/io/File;", "t", "Ljava/io/File;", "outputDirectory", "Le/f/a/d0/c;", "v", "Le/f/a/d0/c;", "mPickerOptions", "A", "constraintCheck", "Landroidx/camera/core/ImageCapture;", "Landroidx/camera/core/ImageCapture;", "imageCapture", "C", "imageViewCheck", "Le/f/a/b0/e;", "P", "Le/f/a/b0/e;", "mBottomMediaAdapter", "<init>", "Picker_release"}, k=1, mv={1, 5, 1})
public final class Picker
extends AppCompatActivity {
    public static final String[] k = new String[]{"android.permission.CAMERA"};
    public ConstraintLayout A;
    public TextView B;
    public ImageView C;
    public ConstraintLayout D;
    public ImageView E;
    public TextView F;
    public TextView G;
    public RecyclerView H;
    public RecyclerView I;
    public boolean J;
    public int K;
    public Handler L = new Handler();
    public Runnable M = m.k;
    public final ArrayList<g> N = new ArrayList();
    public f O;
    public e P;
    public final a Q = new a(this);
    public BottomSheetBehavior<ConstraintLayout> R;
    public int l = 1;
    public Preview m;
    public ImageCapture n;
    public VideoCapture o;
    public Camera p;
    public ProcessCameraProvider q;
    public int r = 2;
    public int s;
    public File t;
    public ExecutorService u;
    public e.f.a.d0.c v;
    public ImageView w;
    public PreviewView x;
    public ImageButton y;
    public ImageView z;

    public static final void i(Picker picker) {
        ConstraintLayout constraintLayout = picker.A;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            TextView textView = picker.B;
            if (textView != null) {
                textView.setVisibility(8);
                ImageView imageView = picker.C;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    ConstraintLayout constraintLayout2 = picker.D;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setBackgroundColor(picker.getResources().getColor(2131034177, null));
                        ImageView imageView2 = picker.E;
                        if (imageView2 != null) {
                            DrawableCompat.setTint((Drawable)imageView2.getDrawable(), (int)picker.getResources().getColor(2131034172, null));
                            return;
                        }
                        i.m("imageViewBack");
                        throw null;
                    }
                    i.m("constraintBottomSheetTop");
                    throw null;
                }
                i.m("imageViewCheck");
                throw null;
            }
            i.m("textViewOk");
            throw null;
        }
        i.m("constraintCheck");
        throw null;
    }

    public static final void j(Picker picker) {
        ConstraintLayout constraintLayout = picker.A;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            TextView textView = picker.B;
            if (textView != null) {
                textView.setVisibility(0);
                ImageView imageView = picker.C;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    ConstraintLayout constraintLayout2 = picker.D;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setBackgroundColor(picker.getResources().getColor(2131034175, null));
                        ImageView imageView2 = picker.E;
                        if (imageView2 != null) {
                            DrawableCompat.setTint((Drawable)imageView2.getDrawable(), (int)picker.getResources().getColor(2131034177, null));
                            return;
                        }
                        i.m("imageViewBack");
                        throw null;
                    }
                    i.m("constraintBottomSheetTop");
                    throw null;
                }
                i.m("imageViewCheck");
                throw null;
            }
            i.m("textViewOk");
            throw null;
        }
        i.m("constraintCheck");
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        PreviewView previewView = this.x;
        if (previewView == null) {
            i.m("viewFinder");
            throw null;
        }
        previewView.getDisplay().getRealMetrics(displayMetrics);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Screen metrics: ");
        stringBuilder.append(displayMetrics.widthPixels);
        stringBuilder.append(" x ");
        stringBuilder.append(displayMetrics.heightPixels);
        Log.d((String)"Picker", (String)stringBuilder.toString());
        int n2 = displayMetrics.widthPixels;
        int n3 = displayMetrics.heightPixels;
        double d2 = (double)Math.max((int)n2, (int)n3) / (double)Math.min((int)n2, (int)n3);
        int n4 = Math.abs((double)(d2 - 1.3333333333333333)) <= Math.abs((double)(d2 - 1.7777777777777777)) ? 0 : 1;
        Log.d((String)"Picker", (String)i.k("Preview aspect ratio: ", n4));
        PreviewView previewView2 = this.x;
        if (previewView2 == null) {
            i.m("viewFinder");
            throw null;
        }
        int n5 = previewView2.getDisplay().getRotation();
        ProcessCameraProvider processCameraProvider = this.q;
        if (processCameraProvider == null) {
            throw new IllegalStateException("Camera initialization failed.");
        }
        CameraSelector cameraSelector = new CameraSelector.Builder().requireLensFacing(this.l).build();
        i.d((Object)cameraSelector, "Builder().requireLensFacing(lensFacing).build()");
        this.m = new Preview.Builder().setTargetAspectRatio(n4).setTargetRotation(n5).build();
        this.n = new ImageCapture.Builder().setCaptureMode(1).setTargetAspectRatio(n4).setTargetRotation(n5).build();
        this.o = new VideoCapture.Builder().build();
        processCameraProvider.unbindAll();
        try {
            UseCase[] arruseCase = new UseCase[]{this.m, this.n, this.o};
            this.p = processCameraProvider.bindToLifecycle((LifecycleOwner)this, cameraSelector, arruseCase);
            Preview preview = this.m;
            if (preview != null) {
                PreviewView previewView3 = this.x;
                if (previewView3 == null) {
                    i.m("viewFinder");
                    throw null;
                }
                preview.setSurfaceProvider(previewView3.getSurfaceProvider());
            }
        }
        catch (Exception exception) {
            Log.e((String)"Picker", (String)"Use case binding failed", (Throwable)exception);
        }
        ImageView imageView = (ImageView)this.findViewById(2131231021);
        ImageButton imageButton = this.y;
        if (imageButton == null) {
            i.m("imageViewClick");
            throw null;
        }
        imageButton.setOnTouchListener((View.OnTouchListener)new e.f.a.q(imageView, this));
        ImageButton imageButton2 = this.y;
        if (imageButton2 != null) {
            imageButton2.setOnLongClickListener((View.OnLongClickListener)new n(this));
            return;
        }
        i.m("imageViewClick");
        throw null;
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        ArrayList<g> arrayList2 = this.N;
        ArrayList arrayList3 = new ArrayList(e.s.a.a.U(arrayList2, (int)10));
        for (g g2 : arrayList2) {
            if (g2.d) {
                arrayList.add((Object)String.valueOf((Object)g2.a));
            }
            arrayList3.add((Object)q.a);
        }
        Intent intent = new Intent();
        intent.putExtra("PICKED_MEDIA_LIST", (Serializable)arrayList);
        this.setResult(-1, intent);
        this.finish();
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    public final void m() {
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector((Context)this, (ScaleGestureDetector.OnScaleGestureListener)new b(this));
        PreviewView previewView = this.x;
        if (previewView != null) {
            previewView.setOnTouchListener((View.OnTouchListener)new e.f.a.e(this, scaleGestureDetector));
            return;
        }
        i.m("viewFinder");
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n() {
        int n2;
        ImageView imageView;
        ImageView imageView2;
        CameraInfo cameraInfo;
        this.r = 2;
        View view = this.findViewById(2131231012);
        i.d((Object)view, "findViewById(R.id.image_view_flash)");
        this.z = imageView2 = (ImageView)view;
        if (imageView2 == null) {
            i.m("imageViewFlash");
            throw null;
        }
        imageView2.setImageDrawable(ResourcesCompat.getDrawable((Resources)this.getResources(), (int)2131165328, null));
        Camera camera = this.p;
        Boolean bl = camera == null || (cameraInfo = camera.getCameraInfo()) == null ? null : Boolean.valueOf((boolean)cameraInfo.hasFlashUnit());
        if (bl != null && bl.booleanValue()) {
            imageView = this.z;
            if (imageView == null) {
                i.m("imageViewFlash");
                throw null;
            }
            n2 = 0;
        } else {
            imageView = this.z;
            if (imageView == null) {
                i.m("imageViewFlash");
                throw null;
            }
            n2 = 8;
        }
        imageView.setVisibility(n2);
        ImageView imageView3 = this.z;
        if (imageView3 != null) {
            imageView3.setOnClickListener((View.OnClickListener)new d(this));
            return;
        }
        i.m("imageViewFlash");
        throw null;
    }

    @SuppressLint(value={"RestrictedApi"})
    public final void o(View view) {
        File file = this.t;
        if (file != null) {
            File file2 = new File(file, i.k(new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS", Locale.ENGLISH).format((Object)System.currentTimeMillis()), ".mp4"));
            VideoCapture.OutputFileOptions outputFileOptions = new VideoCapture.OutputFileOptions.Builder(file2).build();
            i.d((Object)outputFileOptions, "Builder(videoFile).build()");
            this.J = true;
            view.performHapticFeedback(0);
            ((ConstraintLayout)this.findViewById(2131230870)).setVisibility(0);
            ProgressBar progressBar = (ProgressBar)this.findViewById(2131231209);
            progressBar.setProgress(0);
            e.f.a.d0.c c2 = this.v;
            if (c2 != null) {
                progressBar.setMax(c2.m);
                progressBar.invalidate();
                k k2 = new k(this, progressBar, (TextView)this.findViewById(2131231350));
                this.M = k2;
                Handler handler = this.L;
                if (handler != null) {
                    handler.postDelayed((Runnable)k2, 1000L);
                }
                ImageButton imageButton = this.y;
                if (imageButton != null) {
                    imageButton.animate().scaleX(1.2f).scaleY(1.2f).setDuration(300L).setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator()).start();
                    ImageView imageView = this.z;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                        ImageView imageView2 = this.w;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                            ((TextView)this.findViewById(2131231345)).setVisibility(8);
                            VideoCapture videoCapture = this.o;
                            if (videoCapture == null) {
                                return;
                            }
                            ExecutorService executorService = this.u;
                            if (executorService != null) {
                                videoCapture.startRecording(outputFileOptions, (Executor)executorService, (VideoCapture.OnVideoSavedCallback)new c(file2, this));
                                return;
                            }
                            i.m("cameraExecutor");
                            throw null;
                        }
                        i.m("imageViewChangeCamera");
                        throw null;
                    }
                    i.m("imageViewFlash");
                    throw null;
                }
                i.m("imageViewClick");
                throw null;
            }
            i.m("mPickerOptions");
            throw null;
        }
        i.m("outputDirectory");
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onBackPressed() {
        f f2;
        block13 : {
            int n2;
            block14 : {
                block12 : {
                    BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.R;
                    boolean bl = bottomSheetBehavior != null && bottomSheetBehavior.getState() == 3;
                    if (bl) {
                        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this.R;
                        if (bottomSheetBehavior2 == null) {
                            return;
                        }
                        bottomSheetBehavior2.setState(4);
                        return;
                    }
                    f f3 = this.O;
                    Integer n3 = f3 == null ? null : Integer.valueOf((int)f3.i);
                    if (n3 == null) break block12;
                    f f4 = this.O;
                    Integer n4 = f4 == null ? null : Integer.valueOf((int)f4.i);
                    i.c((Object)n4);
                    if (n4 <= 0) break block12;
                    f f5 = this.O;
                    if (f5 != null) {
                        f5.i = 0;
                    }
                    e e2 = this.P;
                    if (e2 != null) {
                        e2.r = 0;
                    }
                    n2 = this.N.size();
                    if (n2 <= 0) break block13;
                    break block14;
                }
                ComponentActivity.super.onBackPressed();
                return;
            }
            int n5 = 0;
            do {
                int n6 = n5 + 1;
                ((g)this.N.get((int)n5)).d = false;
                if (n6 >= n2) break;
                n5 = n6;
            } while (true);
        }
        if ((f2 = this.O) != null) {
            f2.notifyDataSetChanged();
        }
        e e3 = this.P;
        if (e3 != null) {
            e3.notifyDataSetChanged();
        }
        ConstraintLayout constraintLayout = this.A;
        if (constraintLayout == null) {
            i.m("constraintCheck");
            throw null;
        }
        constraintLayout.setVisibility(8);
        TextView textView = this.B;
        if (textView == null) {
            i.m("textViewOk");
            throw null;
        }
        textView.setVisibility(8);
        ImageView imageView = this.C;
        if (imageView == null) {
            i.m("imageViewCheck");
            throw null;
        }
        imageView.setVisibility(0);
        ConstraintLayout constraintLayout2 = this.D;
        if (constraintLayout2 == null) {
            i.m("constraintBottomSheetTop");
            throw null;
        }
        constraintLayout2.setBackgroundColor(this.getResources().getColor(2131034177, null));
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            DrawableCompat.setTint((Drawable)imageView2.getDrawable(), (int)this.getResources().getColor(2131034172, null));
            return;
        }
        i.m("imageViewBack");
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCreate(Bundle bundle) {
        ImageButton imageButton;
        File file;
        ImageView imageView;
        PreviewView previewView;
        FragmentActivity.super.onCreate(bundle);
        this.setContentView(2131427360);
        Intent intent = this.getIntent();
        Serializable serializable = intent == null ? null : intent.getSerializableExtra("PICKER_OPTIONS");
        Objects.requireNonNull((Object)serializable, (String)"null cannot be cast to non-null type com.appexecutors.picker.utils.PickerOptions");
        this.v = (e.f.a.d0.c)serializable;
        View view = this.findViewById(2131230869);
        i.d((Object)view, "findViewById(R.id.constraint_check)");
        this.A = (ConstraintLayout)view;
        View view2 = this.findViewById(2131231346);
        i.d((Object)view2, "findViewById(R.id.text_view_ok)");
        this.B = (TextView)view2;
        View view3 = this.findViewById(2131231009);
        i.d((Object)view3, "findViewById(R.id.image_view_check)");
        this.C = (ImageView)view3;
        View view4 = this.findViewById(2131230868);
        i.d((Object)view4, "findViewById(R.id.constraint_bottom_sheet_top)");
        this.D = (ConstraintLayout)view4;
        View view5 = this.findViewById(2131231007);
        i.d((Object)view5, "findViewById(R.id.image_view_back)");
        this.E = (ImageView)view5;
        View view6 = this.findViewById(2131231344);
        i.d((Object)view6, "findViewById(R.id.text_view_image_count)");
        this.F = (TextView)view6;
        View view7 = this.findViewById(2131231349);
        i.d((Object)view7, "findViewById(R.id.text_view_top_select)");
        this.G = (TextView)view7;
        View view8 = this.findViewById(2131231216);
        i.d((Object)view8, "findViewById(R.id.recycler_view_instant_media)");
        this.H = (RecyclerView)view8;
        View view9 = this.findViewById(2131231215);
        i.d((Object)view9, "findViewById<RecyclerVie\u2026_view_bottom_sheet_media)");
        this.I = (RecyclerView)view9;
        View view10 = this.findViewById(2131231398);
        i.d((Object)view10, "findViewById(R.id.viewFinder)");
        this.x = previewView = (PreviewView)view10;
        previewView.post((Runnable)new e.f.a.c(this));
        View view11 = this.findViewById(2131231010);
        i.d((Object)view11, "findViewById(R.id.image_view_click)");
        this.y = imageButton = (ImageButton)view11;
        imageButton.setOnClickListener((View.OnClickListener)new o(this));
        Object[] arrobject = this.getExternalMediaDirs();
        i.d(arrobject, "externalMediaDirs");
        File file2 = (File)e.s.a.a.Y0((Object[])arrobject);
        if (file2 == null) {
            file = null;
        } else {
            file = new File(file2, this.getResources().getString(2131755049));
            file.mkdirs();
        }
        if (file == null || !file.exists()) {
            file = this.getFilesDir();
            i.d((Object)file, "filesDir");
        }
        this.t = file;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        i.d((Object)executorService, "newSingleThreadExecutor()");
        this.u = executorService;
        this.getWindow().getDecorView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)new l(this));
        i.e((Object)this, "appCompatActivity");
        Picker picker = this;
        synchronized (picker) {
            this.getWindow().clearFlags(1024);
        }
        new Handler().postDelayed((Runnable)new h(this), 500L);
        View view12 = this.findViewById(2131231008);
        i.d((Object)view12, "findViewById(R.id.image_view_change_camera)");
        this.w = imageView = (ImageView)view12;
        imageView.setOnClickListener((View.OnClickListener)new p(this));
        e.f.a.d0.c c2 = this.v;
        if (c2 == null) {
            i.m("mPickerOptions");
            throw null;
        }
        if (c2 != null) {
            return;
        }
        i.m("mPickerOptions");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.u;
        if (executorService != null) {
            executorService.shutdown();
            return;
        }
        i.m("cameraExecutor");
        throw null;
    }
}

