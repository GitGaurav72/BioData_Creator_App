/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageManager
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Typeface
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.Process
 *  android.text.TextUtils
 *  android.text.format.DateFormat
 *  android.util.Base64
 *  android.util.Log
 *  android.util.Patterns
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.animation.Animation
 *  android.webkit.MimeTypeMap
 *  android.webkit.URLUtil
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.activity.ComponentActivity
 *  androidx.appcompat.app.AlertDialog
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.appcompat.app.AppCompatDialogFragment
 *  androidx.core.content.ContextCompat
 *  androidx.drawerlayout.widget.DrawerLayout
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentTransaction
 *  androidx.lifecycle.LifecycleCoroutineScope
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.lifecycle.LifecycleOwnerKt
 *  androidx.recyclerview.widget.RecyclerView
 *  com.airbnb.lottie.LottieAnimationView
 *  com.appfoundry.previewer.BravoApp
 *  com.appfoundry.previewer.BravoApp$a
 *  com.appfoundry.previewer.activities.BravoActivity$a
 *  com.appfoundry.previewer.activities.BravoActivity$b
 *  com.appfoundry.previewer.activities.BravoActivity$c
 *  com.appfoundry.previewer.activities.BravoActivity$d
 *  com.appfoundry.previewer.activities.BravoActivity$e
 *  com.appfoundry.previewer.activities.BravoActivity$f
 *  com.appfoundry.previewer.activities.BravoActivity$g
 *  com.appfoundry.previewer.activities.BravoActivity$h
 *  com.appfoundry.previewer.activities.BravoActivity$i
 *  com.appfoundry.previewer.activities.BravoActivity$j
 *  com.appfoundry.previewer.activities.BravoActivity$k
 *  com.appfoundry.previewer.model.Action
 *  com.appfoundry.previewer.model.ActionBodyParams
 *  com.appfoundry.previewer.model.ActionBodyParamsContext
 *  com.appfoundry.previewer.model.Actions
 *  com.appfoundry.previewer.model.App
 *  com.appfoundry.previewer.model.Asset
 *  com.appfoundry.previewer.model.Component
 *  com.appfoundry.previewer.model.Container
 *  com.appfoundry.previewer.model.Data
 *  com.appfoundry.previewer.model.FontName
 *  com.appfoundry.previewer.model.InputComponent
 *  com.appfoundry.previewer.model.JsonApp
 *  com.appfoundry.previewer.model.Option
 *  com.appfoundry.previewer.model.Page
 *  com.appfoundry.previewer.model.Params
 *  com.appfoundry.previewer.model.Paywall
 *  com.appfoundry.previewer.model.Resolution
 *  com.appfoundry.previewer.model.ResponseAction
 *  com.appfoundry.previewer.model.Stripe
 *  com.appfoundry.previewer.model.StripePaymentIntent
 *  com.appfoundry.previewer.model.Style
 *  com.appfoundry.previewer.model.Tap
 *  com.auth0.android.provider.AuthenticationActivity
 *  com.contrarywind.view.WheelView
 *  com.google.android.gms.auth.api.signin.GoogleSignInAccount
 *  com.google.android.gms.common.api.Status
 *  com.google.android.material.navigation.NavigationView
 *  com.google.android.material.snackbar.Snackbar
 *  com.google.android.material.snackbar.Snackbar$SnackbarLayout
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.zxing.integration.android.IntentIntegrator
 *  com.google.zxing.integration.android.IntentResult
 *  com.karumi.dexter.DexterBuilder
 *  com.karumi.dexter.DexterBuilder$SinglePermissionListener
 *  com.karumi.dexter.listener.single.PermissionListener
 *  com.segment.analytics.Options
 *  com.segment.analytics.Properties
 *  e.e.a.a.a
 *  e.f.a.a0
 *  e.f.a.d0.c
 *  e.g.a.d.a0
 *  e.g.a.d.b
 *  e.g.a.d.b0
 *  e.g.a.d.c
 *  e.g.a.d.d
 *  e.g.a.d.e
 *  e.g.a.d.e0
 *  e.g.a.d.f
 *  e.g.a.d.g
 *  e.g.a.d.h
 *  e.g.a.d.i
 *  e.g.a.d.k
 *  e.g.a.d.l
 *  e.g.a.d.m
 *  e.g.a.d.n
 *  e.g.a.d.p
 *  e.g.a.d.q
 *  e.g.a.d.r
 *  e.g.a.d.s
 *  e.g.a.d.t
 *  e.g.a.d.v
 *  e.g.a.d.v0
 *  e.g.a.d.w
 *  e.g.a.d.w0
 *  e.g.a.d.z0
 *  e.g.a.e.a
 *  e.g.a.f.a.c
 *  e.g.a.f.a.k
 *  e.g.a.f.a.m
 *  e.g.a.f.a.o
 *  e.g.a.f.a.p
 *  e.g.a.f.b.d
 *  e.g.a.g.b
 *  e.g.a.i.a
 *  e.g.a.i.a0
 *  e.g.a.i.a1
 *  e.g.a.i.b
 *  e.g.a.i.b0
 *  e.g.a.i.b1
 *  e.g.a.i.c
 *  e.g.a.i.c1
 *  e.g.a.i.d
 *  e.g.a.i.d0
 *  e.g.a.i.d1
 *  e.g.a.i.e
 *  e.g.a.i.e0
 *  e.g.a.i.e1
 *  e.g.a.i.f
 *  e.g.a.i.f0
 *  e.g.a.i.g0
 *  e.g.a.i.h
 *  e.g.a.i.h0
 *  e.g.a.i.i0
 *  e.g.a.i.j
 *  e.g.a.i.j0
 *  e.g.a.i.k
 *  e.g.a.i.k0
 *  e.g.a.i.l0
 *  e.g.a.i.m
 *  e.g.a.i.m0
 *  e.g.a.i.n0
 *  e.g.a.i.o
 *  e.g.a.i.o0
 *  e.g.a.i.p
 *  e.g.a.i.p0
 *  e.g.a.i.q
 *  e.g.a.i.q0
 *  e.g.a.i.r
 *  e.g.a.i.r0
 *  e.g.a.i.s
 *  e.g.a.i.s0
 *  e.g.a.i.t
 *  e.g.a.i.t0
 *  e.g.a.i.u
 *  e.g.a.i.u0
 *  e.g.a.i.v
 *  e.g.a.i.w
 *  e.g.a.i.w0
 *  e.g.a.i.x
 *  e.g.a.i.x0
 *  e.g.a.i.y0
 *  e.g.a.i.z
 *  e.g.a.i.z0
 *  e.g.a.j.n0
 *  e.g.a.j.r0
 *  e.g.a.j.t0
 *  e.g.a.j.v0
 *  e.g.a.k.f
 *  e.g.a.k.h
 *  e.g.a.k.l
 *  e.g.a.k.p
 *  e.g.a.m.a
 *  e.g.a.m.f
 *  e.g.a.m.g
 *  e.g.a.m.h
 *  e.g.a.m.i
 *  e.g.a.m.j
 *  e.g.a.o.j
 *  e.g.a.o.k
 *  e.g.a.o.l
 *  e.g.a.o.m
 *  e.g.a.o.n
 *  e.g.a.o.o
 *  e.g.a.o.q
 *  e.g.a.o.r
 *  e.g.a.o.s
 *  e.g.a.o.u
 *  e.g.a.o.v
 *  e.g.a.o.w
 *  e.g.a.p.f
 *  e.g.a.p.g
 *  e.g.a.p.i
 *  e.g.a.p.j
 *  e.h.a.a
 *  e.h.a.b
 *  e.h.a.c.b
 *  e.h.a.c.c
 *  e.h.a.c.e.a
 *  e.h.a.c.e.d
 *  e.h.a.c.e.e
 *  e.h.a.c.e.j
 *  e.h.a.c.e.k
 *  e.h.a.c.e.l
 *  e.h.a.d.a
 *  e.h.a.e.b
 *  e.h.a.e.c
 *  e.h.a.e.f
 *  e.h.a.f.e
 *  e.h.a.f.e$a
 *  e.h.a.f.f
 *  e.h.a.f.h
 *  e.h.a.f.h$a
 *  e.h.a.f.k
 *  e.h.a.f.n
 *  e.h.a.f.o
 *  e.h.a.f.p
 *  e.h.a.f.t
 *  e.h.a.g.i.o
 *  e.h.a.h.a
 *  e.h.a.i.a
 *  e.i.a.a.a
 *  e.i.a.b.a
 *  e.i.a.d.b
 *  e.i.a.d.e
 *  e.i.a.d.f
 *  e.i.a.d.g
 *  e.i.a.d.h
 *  e.l.a.a
 *  e.l.c.b
 *  e.p.a.c.a.a.d.c
 *  e.p.a.c.a.a.d.d
 *  e.p.a.c.a.a.f.b
 *  e.p.a.c.b.a
 *  e.p.a.c.c.k.b
 *  e.p.a.c.k.d
 *  e.p.a.c.k.e
 *  e.p.a.c.k.f
 *  e.p.a.c.k.i
 *  e.p.a.d.a.a.b
 *  e.p.a.d.a.e.f
 *  e.p.a.d.a.e.g
 *  e.p.a.d.a.e.q
 *  e.p.a.d.a.g.a
 *  e.p.a.d.a.g.b
 *  e.p.a.d.a.g.g
 *  e.p.a.d.a.g.i
 *  e.p.a.d.a.g.k
 *  e.p.a.d.a.i.a
 *  e.p.a.d.a.i.c
 *  e.p.a.d.a.i.e
 *  e.p.a.d.a.i.n
 *  e.p.a.d.a.i.r
 *  e.p.d.i
 *  e.p.d.o.c
 *  e.p.d.o.t
 *  e.p.d.o.y
 *  e.p.d.p.r
 *  e.p.d.r.a
 *  e.q.a.m
 *  e.r.a.c.a
 *  e.s.a.a
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.lang.ref.WeakReference
 *  java.nio.charset.Charset
 *  java.security.SecureRandom
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.UUID
 *  java.util.concurrent.Executor
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  k.d0.g
 *  k.s.i
 *  k.s.s
 *  k.x.b.a
 *  k.x.b.l
 *  k.x.b.p
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  m.g0$a$a
 *  m.m0.g.e
 *  m.z
 *  m.z$a
 *  o.b.a.c
 *  o.b.a.m
 *  org.greenrobot.eventbus.ThreadMode
 *  p.a.a
 *  p.a.a$b
 */
package com.appfoundry.previewer.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.appexecutors.picker.Picker;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.activities.DebugAppsActivity;
import com.appfoundry.previewer.activities.InitActivity;
import com.appfoundry.previewer.activities.LongPressActivity;
import com.appfoundry.previewer.activities.QrScannerActivity;
import com.appfoundry.previewer.activities.YoutubeActivity;
import com.appfoundry.previewer.model.Action;
import com.appfoundry.previewer.model.ActionBodyParams;
import com.appfoundry.previewer.model.ActionBodyParamsContext;
import com.appfoundry.previewer.model.Actions;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Data;
import com.appfoundry.previewer.model.FontName;
import com.appfoundry.previewer.model.InputComponent;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Option;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Params;
import com.appfoundry.previewer.model.Paywall;
import com.appfoundry.previewer.model.Resolution;
import com.appfoundry.previewer.model.ResponseAction;
import com.appfoundry.previewer.model.Stripe;
import com.appfoundry.previewer.model.StripePaymentIntent;
import com.appfoundry.previewer.model.Style;
import com.appfoundry.previewer.model.Tap;
import com.auth0.android.provider.AuthenticationActivity;
import com.contrarywind.view.WheelView;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.DexterBuilder;
import com.karumi.dexter.listener.single.PermissionListener;
import com.segment.analytics.Options;
import com.segment.analytics.Properties;
import e.g.a.d.a0;
import e.g.a.d.b0;
import e.g.a.d.e0;
import e.g.a.f.a.m;
import e.g.a.f.a.o;
import e.g.a.f.a.p;
import e.g.a.i.a1;
import e.g.a.i.b1;
import e.g.a.i.c1;
import e.g.a.i.d0;
import e.g.a.i.d1;
import e.g.a.i.e1;
import e.g.a.i.f0;
import e.g.a.i.h0;
import e.g.a.i.i0;
import e.g.a.i.j0;
import e.g.a.i.k0;
import e.g.a.i.l0;
import e.g.a.i.m0;
import e.g.a.i.o0;
import e.g.a.i.p0;
import e.g.a.i.q0;
import e.g.a.i.s0;
import e.g.a.i.t0;
import e.g.a.i.u0;
import e.g.a.i.w0;
import e.g.a.i.x;
import e.g.a.i.x0;
import e.g.a.i.y0;
import e.g.a.i.z;
import e.g.a.i.z0;
import e.g.a.j.n0;
import e.g.a.j.r0;
import e.g.a.j.v0;
import e.g.a.o.l;
import e.g.a.o.n;
import e.g.a.o.u;
import e.g.a.o.v;
import e.g.a.o.w;
import e.h.a.f.e;
import e.h.a.f.h;
import e.p.a.d.a.e.q;
import e.p.d.o.t;
import e.p.d.o.y;
import e.p.d.p.r;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.s.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.a.j1;
import m.c0;
import m.e0;
import m.g0;
import m.z;
import org.greenrobot.eventbus.ThreadMode;
import p.a.a;
import tech.linjiang.pandora.ui.Dispatcher;

@Metadata(d1={"\u0000\u00fa\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\u0006\u0010&\u001a\u00020!J\b\u0010'\u001a\u00020!H\u0002J\u0006\u0010(\u001a\u00020!J\u001a\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0002J\u0014\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0010\u00105\u001a\u00020\u001e2\u0006\u0010/\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u000209H\u0002J\u001a\u0010:\u001a\u00020!2\b\u0010;\u001a\u0004\u0018\u0001092\u0006\u0010<\u001a\u000209H\u0002J>\u0010=\u001a\u00020!2\b\u0010>\u001a\u0004\u0018\u0001092\n\b\u0002\u0010?\u001a\u0004\u0018\u0001092\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010B\u001a\u00020\u001e2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010DJ\n\u0010E\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000209H\u0002J\b\u0010I\u001a\u00020!H\u0002J2\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020L2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010B\u001a\u00020\u001e2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010DH\u0002J\u0010\u0010M\u001a\u00020!2\u0006\u0010<\u001a\u000209H\u0002J\b\u0010N\u001a\u00020!H\u0002J$\u0010O\u001a\u00020!2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010<\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020AH\u0002J]\u0010R\u001a\u00020!2\b\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010U\u001a\u0004\u0018\u0001022\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u00a2\u0006\u0002\u0010YJ\u001a\u0010R\u001a\u00020!2\b\u0010S\u001a\u0004\u0018\u00010T2\b\u0010@\u001a\u0004\u0018\u00010AJ\u0012\u0010Z\u001a\u00020!2\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\u0006\u0010[\u001a\u00020!J\u001c\u0010\\\u001a\u00020!2\b\u0010U\u001a\u0004\u0018\u0001022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\\\u001a\u00020!2\b\u0010@\u001a\u0004\u0018\u00010AJ\u001a\u0010]\u001a\u00020!2\b\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010^\u001a\u00020\u001eJ\u0010\u0010_\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020\u0006H\u0002J\b\u0010a\u001a\u00020\u001eH\u0002J\u0010\u0010b\u001a\u00020\u001e2\u0006\u0010c\u001a\u00020\u0006H\u0002J\u0010\u0010d\u001a\u00020!2\u0006\u0010e\u001a\u00020fH\u0002J\b\u0010g\u001a\u00020!H\u0002J\u0010\u0010h\u001a\u00020!2\u0006\u0010/\u001a\u00020iH\u0007J\"\u0010j\u001a\u00020!2\u0006\u0010k\u001a\u00020f2\u0006\u0010l\u001a\u00020f2\b\u0010m\u001a\u0004\u0018\u00010nH\u0014J\u0010\u0010o\u001a\u00020!2\u0006\u0010/\u001a\u00020pH\u0007J\b\u0010q\u001a\u00020!H\u0016J\u0010\u0010r\u001a\u00020!2\u0006\u0010/\u001a\u00020sH\u0007J\u0012\u0010t\u001a\u00020!2\b\u0010u\u001a\u0004\u0018\u00010vH\u0014J\u0010\u0010w\u001a\u00020!2\u0006\u0010/\u001a\u00020xH\u0007J\b\u0010y\u001a\u00020!H\u0014J\u0010\u0010z\u001a\u00020!2\u0006\u0010/\u001a\u00020{H\u0007J\u0010\u0010|\u001a\u00020!2\u0006\u0010/\u001a\u00020}H\u0007J\u0011\u0010~\u001a\u00020!2\u0007\u0010\u001a\u00030\u0001H\u0007J\u0012\u0010\u0081\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u0082\u0001H\u0007J\u0012\u0010\u0083\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u0084\u0001H\u0007J\u0012\u0010\u0085\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u0086\u0001H\u0007J\u0012\u0010\u0087\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u0088\u0001H\u0007J\u0012\u0010\u0089\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u008a\u0001H\u0007J\u0012\u0010\u008b\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u008c\u0001H\u0007J\u0014\u0010\u008d\u0001\u001a\u00020!2\t\u0010/\u001a\u0005\u0018\u00010\u008e\u0001H\u0007J\u0012\u0010\u008f\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u0090\u0001H\u0007J\u0012\u0010\u0091\u0001\u001a\u00020!2\u0007\u0010\u001a\u00030\u0092\u0001H\u0007J\u0012\u0010\u0093\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u0094\u0001H\u0007J\u0012\u0010\u0095\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u0096\u0001H\u0007J\u0012\u0010\u0097\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u0098\u0001H\u0007J\u0012\u0010\u0099\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u009a\u0001H\u0007J\u0012\u0010\u009b\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u009c\u0001H\u0007J\u0012\u0010\u009d\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u009e\u0001H\u0007J\u0012\u0010\u009f\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00a0\u0001H\u0007J\u0012\u0010\u00a1\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00a2\u0001H\u0007J\t\u0010\u00a3\u0001\u001a\u00020!H\u0014J\u0012\u0010\u00a4\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00a5\u0001H\u0007J\u0012\u0010\u00a6\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00a7\u0001H\u0007J\u0012\u0010\u00a8\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00a9\u0001H\u0007J\u0011\u0010\u00aa\u0001\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0007J\u0012\u0010\u00ab\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00ac\u0001H\u0007J\u0012\u0010\u00ad\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00ae\u0001H\u0007J\u0012\u0010\u00af\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00b0\u0001H\u0007J3\u0010\u00b1\u0001\u001a\u00020!2\u0006\u0010k\u001a\u00020f2\u0010\u0010\u00b2\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001090\u00b3\u00012\b\u0010\u00b4\u0001\u001a\u00030\u00b5\u0001H\u0016\u00a2\u0006\u0003\u0010\u00b6\u0001J\u0012\u0010\u00b7\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00b8\u0001H\u0007J\t\u0010\u00b9\u0001\u001a\u00020!H\u0014J\u0012\u0010\u00ba\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00bb\u0001H\u0007J\u0012\u0010\u00bc\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00bd\u0001H\u0007J\u0012\u0010\u00be\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00bf\u0001H\u0007J\u0012\u0010\u00c0\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00c1\u0001H\u0007J\u0012\u0010\u00c2\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00c3\u0001H\u0007J\t\u0010\u00c4\u0001\u001a\u00020!H\u0014J\u0012\u0010\u00c5\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00c6\u0001H\u0007J\u0012\u0010\u00c7\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00c8\u0001H\u0007J\u0012\u0010\u00c9\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00ca\u0001H\u0007J\u0012\u0010\u00cb\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00cc\u0001H\u0007J\u0012\u0010\u00cd\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00ce\u0001H\u0007J\u0012\u0010\u00cf\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00d0\u0001H\u0007J\u0012\u0010\u00d1\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00d2\u0001H\u0007J\u0013\u0010\u00d3\u0001\u001a\u00020!2\n\b\u0002\u0010;\u001a\u0004\u0018\u000109J\u0013\u0010\u00d4\u0001\u001a\u00020!2\b\b\u0002\u0010B\u001a\u00020\u001eH\u0002J\t\u0010\u00d5\u0001\u001a\u00020!H\u0002J\u0007\u0010\u00d6\u0001\u001a\u00020!J\t\u0010\u00d7\u0001\u001a\u00020!H\u0002J\t\u0010\u00d8\u0001\u001a\u00020!H\u0002J\t\u0010\u00d9\u0001\u001a\u00020\u001eH\u0002J\u001d\u0010\u00da\u0001\u001a\u00020!2\t\b\u0002\u0010\u00db\u0001\u001a\u00020\u001e2\t\b\u0002\u0010\u00dc\u0001\u001a\u00020\u001eJ\u0012\u0010\u00dd\u0001\u001a\u00020!2\u0007\u0010\u00de\u0001\u001a\u00020fH\u0002J\u0012\u0010\u00df\u0001\u001a\u00020A2\t\b\u0002\u0010\u00dc\u0001\u001a\u00020\u001eJ\t\u0010\u00e0\u0001\u001a\u00020!H\u0002J\t\u0010\u00e1\u0001\u001a\u00020\u001eH\u0002J\t\u0010\u00e2\u0001\u001a\u00020!H\u0002J\t\u0010\u00e3\u0001\u001a\u00020!H\u0002J\t\u0010\u00e4\u0001\u001a\u00020\u001eH\u0002J\u0010\u0010\u00e5\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00e6\u0001J\u001c\u0010\u00e7\u0001\u001a\u00020!2\u0007\u0010/\u001a\u00030\u00b0\u00012\b\b\u0002\u0010X\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00e8\u0001"}, d2={"Lcom/appfoundry/previewer/activities/BravoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "actionDownTime", "", "actionDownX", "", "actionDownY", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "getAppUpdateManager", "()Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager$delegate", "Lkotlin/Lazy;", "appUpdatedListener", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "getAppUpdatedListener", "()Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "appUpdatedListener$delegate", "bravoLottie", "Lcom/airbnb/lottie/LottieAnimationView;", "drawerMenu", "Landroidx/drawerlayout/widget/DrawerLayout;", "fragmentContainer", "Landroid/widget/FrameLayout;", "mainLoading", "Landroid/widget/RelativeLayout;", "progressBar", "Landroid/widget/ProgressBar;", "scrollingGesture", "", "showDownloading", "backButtonEvent", "", "checkGooglePlayInAppUpdates", "checkIfNewJsonAvailable", "checkIfPushArrivedWhenAppClosed", "checkIfShouldLaunchInAppReview", "clearAppWithLogin", "clearBravoVisionLoginData", "closeMenuIfOpen", "continueWithAuth0Credentials", "credentialsManager", "Lcom/auth0/android/authentication/storage/SecureCredentialsManager;", "credentials", "Lcom/auth0/android/result/Credentials;", "continueWithPlayEvent", "event", "Lcom/appfoundry/previewer/events/PlayEvent;", "createAndAddFragmentLoading", "Landroidx/fragment/app/Fragment;", "page", "Lcom/appfoundry/previewer/model/Page;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "downloadFile", "url", "", "exchangeSecretsWithBackend", "pageId", "provider", "getBravoIdentity", "token", "params", "loadingUI", "Lcom/appfoundry/previewer/model/LoadingUI;", "isRegister", "onBravoIdentityRefreshed", "Lcom/appfoundry/previewer/authentication/firebase/OnTokenRefreshed;", "getDrawerMenu", "getScreenshotBitmap", "Landroid/graphics/Bitmap;", "path", "handleBackPressed", "handleBravoIdentityResponse", "response", "Lcom/appfoundry/previewer/model/BravoIdTokenResponse;", "handleBravoVisionLoginWithAuth0", "handleInAppUpdatesOnResume", "handleOAuth2", "authInfo", "Lcom/appfoundry/previewer/model/AuthInfoFromBackend;", "handleResponseAction", "responseAction", "Lcom/appfoundry/previewer/model/ResponseAction;", "loadingFragment", "fromPush", "fromPushWithAppClosed", "fromPostLoginAction", "(Lcom/appfoundry/previewer/model/ResponseAction;Landroid/widget/RelativeLayout;Landroidx/fragment/app/Fragment;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/appfoundry/previewer/model/LoadingUI;)V", "handleResponseActionFromPush", "hideActivityLoading", "hideLoading", "hideLoadingDataUiThread", "uiThread", "isHorizontalScroll", "x", "isLongPress", "isVerticalScroll", "y", "launchInAppReviewFlow", "appSessions", "", "logoutAndRestartActivity", "onActionInPushNotificationEvent", "Lcom/appfoundry/previewer/events/ActionInPushNotificationEvent;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAddToCalendarEvent", "Lcom/appfoundry/previewer/events/AddToCalendarEvent;", "onBackPressed", "onCloseEvent", "Lcom/appfoundry/previewer/events/CloseEvent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteUserEvent", "Lcom/appfoundry/previewer/events/DeleteUserEvent;", "onDestroy", "onDownloadEvent", "Lcom/appfoundry/previewer/events/DownloadEvent;", "onEmailEvent", "Lcom/appfoundry/previewer/events/EmailEvent;", "onFirebaseLogoutEvent", "logout", "Lcom/appfoundry/previewer/events/FirebaseLogoutEvent;", "onFirebaseRegisterEvent", "Lcom/appfoundry/previewer/events/FirebaseRegisterEvent;", "onFirebaseVerifyPhoneEvent", "Lcom/appfoundry/previewer/events/FirebaseVerifyPhoneEvent;", "onGoBackEvent", "Lcom/appfoundry/previewer/events/GoBackEvent;", "onInputFileEvent", "Lcom/appfoundry/previewer/events/InputFileEvent;", "onInputImageEvent", "Lcom/appfoundry/previewer/events/InputImageEvent;", "onInputVideoEvent", "Lcom/appfoundry/previewer/events/InputVideoEvent;", "onIntroCloseEvent", "Lcom/appfoundry/previewer/events/IntroCloseEvent;", "onLoginWithProviderEvent", "Lcom/appfoundry/previewer/events/LoginWithProviderEvent;", "onLogoutEvent", "Lcom/appfoundry/previewer/events/LogoutEvent;", "onMapsEvent", "Lcom/appfoundry/previewer/events/MapsEvent;", "onNavigationEvent", "Lcom/appfoundry/previewer/events/NavigationEvent;", "onNewJsonEvent", "Lcom/appfoundry/previewer/events/NewJsonEvent;", "onOpenAudioEvent", "Lcom/appfoundry/previewer/events/OpenAudioEvent;", "onOpenIntroEvent", "Lcom/appfoundry/previewer/events/OpenIntroEvent;", "onOpenQrScannerEvent", "Lcom/appfoundry/previewer/events/OpenQrScannerEvent;", "onOpenSelectorEvent", "Lcom/appfoundry/previewer/events/OpenSelectorEvent;", "onOpenUrlEvent", "Lcom/appfoundry/previewer/events/OpenUrlEvent;", "onPause", "onPauseEvent", "Lcom/appfoundry/previewer/events/PauseEvent;", "onPdfEvent", "Lcom/appfoundry/previewer/events/PdfEvent;", "onPhoneEvent", "Lcom/appfoundry/previewer/events/PhoneEvent;", "onPlayEvent", "onPreviewAppEvent", "Lcom/appfoundry/previewer/events/PreviewAppEvent;", "onPushDialogEvent", "Lcom/appfoundry/previewer/events/PushDialogEvent;", "onRemoteActionEvent", "Lcom/appfoundry/previewer/events/RemoteActionEvent;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResetPasswordEvent", "Lcom/appfoundry/previewer/events/ResetPasswordEvent;", "onResume", "onScannedOrEmulatorAppListClicked", "Lcom/appfoundry/previewer/events/ScannedAppClickedEvent;", "onShareBravoUrlEvent", "Lcom/appfoundry/previewer/events/ShareBravoUrlEvent;", "onShareEvent", "Lcom/appfoundry/previewer/events/ShareEvent;", "onShowEmulatorAppListEvent", "Lcom/appfoundry/previewer/events/ShowEmulatorAppListEvent;", "onShowNetworkLogsEvent", "Lcom/appfoundry/previewer/events/ShowNetworkLogsEvent;", "onStart", "onStripeCheckoutEvent", "Lcom/appfoundry/previewer/events/StripeCheckoutEvent;", "onSubmitEvent", "Lcom/appfoundry/previewer/events/SubmitEvent;", "onTokenExpiredEvent", "Lcom/appfoundry/previewer/events/TokenExpiredEvent;", "onTripleTapEvent", "Lcom/appfoundry/previewer/events/TripleTapEvent;", "onUnlinkEvent", "Lcom/appfoundry/previewer/events/UnlinkEvent;", "onUpdateEvent", "Lcom/appfoundry/previewer/events/UpdateEvent;", "onVideoEvent", "Lcom/appfoundry/previewer/events/VideoEvent;", "openMenu", "proceedAfterLoginSuccess", "processBravoVisionLoginFailure", "setScreenshotAsBackgroundForTransparentLoadingEffect", "setupFirebaseDynamicLinks", "setupIfUiTest", "shouldConsiderLongPress", "showActivityLoading", "isVision", "backgroundTransparent", "showFlexibleUpdateSnackBar", "snackbarType", "showLoadingOnTopOfEverything", "showLongPressToastFirstTime", "slideMenuOpen", "stopDowngradedUsers", "stopFreeUsersWithPaidFeatures", "timerTriggeredLongPress", "triggerActionEvent", "Lcom/appfoundry/previewer/events/ActionEvent;", "triggerRemoteAction", "app_debug"}, k=1, mv={1, 6, 0}, xi=48)
public class BravoActivity
extends AppCompatActivity {
    public static final /* synthetic */ int k;
    public DrawerLayout l;
    public long m;
    public float n;
    public float o;
    public boolean p;
    public boolean q = true;
    public RelativeLayout r;
    public LottieAnimationView s;
    public ProgressBar t;
    public FrameLayout u;
    public final k.e v = e.s.a.a.J2((k.x.b.a)new a(this));
    public final k.e w = e.s.a.a.J2((k.x.b.a)new b(this));

    public static e.g.a.m.h D(BravoActivity bravoActivity, boolean bl, int n2, Object object) {
        e.g.a.k.f f2;
        block6 : {
            block5 : {
                if ((n2 & 1) != 0) {
                    bl = true;
                }
                Objects.requireNonNull((Object)((Object)bravoActivity));
                e.g.a.k.l l2 = e.f.a.a0.I((BravoActivity)bravoActivity);
                f2 = null;
                if (l2 == null) break block5;
                Page page = l2.k;
                Page page2 = page == null ? null : r0.b((Page)page);
                f2 = null;
                if (page2 != null) {
                    f2 = r0.a((Page)page2, null, (int)1);
                    bravoActivity.A();
                    String string = page2.a;
                    k.x.c.i.e((Object)bravoActivity, "<this>");
                    FragmentTransaction fragmentTransaction = bravoActivity.getSupportFragmentManager().beginTransaction().setCustomAnimations(2130772021, 2130772022, 2130772021, 2130772022);
                    k.x.c.i.c((Object)f2);
                    fragmentTransaction.add(2131230871, (Fragment)f2, string).commitAllowingStateLoss();
                }
                if (f2 != null) break block6;
            }
            bravoActivity.B(e.g.a.p.j.C(), bl);
        }
        return new e.g.a.m.h(bravoActivity.r, f2);
    }

    public static final void i(BravoActivity bravoActivity, e.h.a.c.e.j j2, e.h.a.h.a a2) {
        Objects.requireNonNull((Object)((Object)bravoActivity));
        e.f.a.a0.P0((String)"bravo_vision_user_logged_in", (Object)Boolean.TRUE);
        Object[] arrobject = new Object[1];
        Date date = a2.b();
        String string = date == null ? null : date.toString();
        arrobject[0] = string;
        a.b b2 = p.a.a.d;
        b2.a("REFRESH TOKEN EXPIRATION DATE: %s", arrobject);
        Date date2 = a2.b();
        Long l2 = date2 == null ? null : Long.valueOf((long)date2.getTime());
        e.f.a.a0.P0((String)"bravo_vision_refresh_token_expiration", (Object)l2);
        Object[] arrobject2 = new Object[]{a2.c()};
        b2.a("onSuccess: %s", arrobject2);
        e.f.a.a0.P0((String)"auth_token", (Object)a2.c());
        e.f.a.a0.P0((String)"access_token", (Object)a2.a());
        try {
            e.f.a.a0.P0((String)"bravo_vision_user_id", (Object)new e.h.a.e.c((String)a2.c()).m.a);
        }
        catch (e.h.a.e.b b3) {
            Object[] arrobject3 = new Object[]{b3.getLocalizedMessage()};
            p.a.a.d.b("Error decoding JWT: %s", arrobject3);
        }
        try {
            j2.e(a2);
        }
        catch (Exception exception) {
            Object[] arrobject4 = new Object[]{exception.getLocalizedMessage()};
            p.a.a.d.b("Error on credentialsManager.saveCredentials: %s", arrobject4);
            j2.c();
            o.b.a.c.b().g((Object)new x(false, 1));
        }
        bravoActivity.runOnUiThread((Runnable)new e.g.a.d.g(bravoActivity));
        e.g.a.o.s.a.h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showIntro", false);
        bundle.putBoolean("showLogin", false);
        Intent intent = new Intent((Context)bravoActivity, BravoActivity.class);
        intent.putExtras(bundle);
        bravoActivity.startActivity(intent);
        bravoActivity.finish();
    }

    public static final void j(BravoActivity bravoActivity) {
        Objects.requireNonNull((Object)((Object)bravoActivity));
        Object[] arrobject = new Object[]{};
        p.a.a.d.b("ERROR: onFailure dialog", arrobject);
        bravoActivity.runOnUiThread((Runnable)new e.g.a.d.n(bravoActivity));
        bravoActivity.l();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showIntro", false);
        bundle.putBoolean("showLogin", true);
        Intent intent = new Intent((Context)bravoActivity, BravoActivity.class);
        intent.putExtras(bundle);
        bravoActivity.startActivity(intent);
        bravoActivity.finish();
    }

    public static void q(BravoActivity bravoActivity, String string, String string2, e.g.a.m.h h2, boolean bl, p p2, int n2, Object object) {
        String string3 = (n2 & 2) != 0 ? null : string2;
        e.g.a.m.h h3 = (n2 & 4) != 0 ? null : h2;
        boolean bl2 = (n2 & 8) != 0 ? false : bl;
        p p3 = (n2 & 16) != 0 ? null : p2;
        Objects.requireNonNull((Object)((Object)bravoActivity));
        LifecycleCoroutineScope lifecycleCoroutineScope = LifecycleOwnerKt.getLifecycleScope((LifecycleOwner)bravoActivity);
        e.g.a.d.w0 w02 = new e.g.a.d.w0(string, string3, bravoActivity, h3, bl2, p3, null);
        e.s.a.a.H2((l.a.b0)lifecycleCoroutineScope, null, null, (k.x.b.p)w02, (int)3, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void t(BravoActivity var0, ResponseAction var1_1, RelativeLayout var2_2, Fragment var3_3, Boolean var4_4, Boolean var5_5, Boolean var6_6, e.g.a.m.h var7_7, int var8_8, Object var9_9) {
        block42 : {
            block43 : {
                block41 : {
                    var10_10 = (var8_8 & 2) != 0 ? null : var2_2;
                    var11_11 = (var8_8 & 4) != 0 ? null : var3_3;
                    var12_12 = (var8_8 & 8) != 0 ? Boolean.FALSE : var4_4;
                    var13_13 = (var8_8 & 16) != 0 ? Boolean.FALSE : var5_5;
                    var14_14 = (var8_8 & 32) != 0 ? Boolean.FALSE : var6_6;
                    var15_15 = (var8_8 & 64) != 0 ? null : var7_7;
                    Objects.requireNonNull((Object)var0);
                    if (var1_1 != null && (var17_16 = var1_1.b) != null) break block41;
                    var21_17 = null;
                    break block42;
                }
                var18_18 = var17_16.hashCode();
                var19_19 = 1;
                switch (var18_18) {
                    default: {
                        ** GOTO lbl-1000
                    }
                    case 1769563340: {
                        if (!var17_16.equals((Object)"show-post-login")) ** GOTO lbl-1000
                        var56_20 = e.g.a.o.s.a;
                        k.x.c.i.e((Object)var0, "activity");
                        var58_21 = BravoApp.r;
                        if (var58_21 != null && (var59_22 = var58_21.d) != null && (var60_23 = var59_22.e) != null && (var61_24 = var60_23.b) != null) ** GOTO lbl25
                        var64_25 = null;
                        ** GOTO lbl30
lbl25: // 2 sources:
                        for (Object var63_27 : var61_24) {
                            if (!r0.h((Page)((Page)var63_27), (String)"post-login")) continue;
                            ** GOTO lbl29
                        }
                        var63_27 = null;
lbl29: // 2 sources:
                        var64_25 = (Page)var63_27;
lbl30: // 2 sources:
                        if (var64_25 == null) {
                            var65_28 = null;
                        } else {
                            e.g.a.o.s.l = var19_19;
                            e.f.a.a0.M0((AppCompatActivity)var0, var64_25, (int)2131230871);
                            var65_28 = k.q.a;
                        }
                        if (var65_28 == null) {
                            var56_20.i(var0);
                        }
                        break block43;
                    }
                    case 1153105883: {
                        if (!var17_16.equals((Object)"set-access-token")) ** GOTO lbl-1000
                        var50_29 = var1_1.c;
                        if (var50_29 != null) {
                            var51_30 = var50_29.P;
                            if (var51_30 != null) {
                                e.f.a.a0.R0((String)"app_oauth_token", (Object)var51_30);
                            }
                            var52_31 = var50_29.Q;
                            if (var52_31 != null) {
                                e.f.a.a0.R0((String)"app_oauth_params", (Object)var52_31);
                            }
                        }
                        var54_33 = (var53_32 = var1_1.c) == null ? null : var53_32.P;
                        var55_34 = var53_32 == null ? null : var53_32.Q;
                        BravoActivity.q(var0, var54_33, var55_34, null, false, null, 28, null);
                        break block43;
                    }
                    case 1085444827: {
                        if (!var17_16.equals((Object)"refresh")) ** GOTO lbl-1000
                        var20_35 = new a0(var0);
                        ** GOTO lbl131
                    }
                    case 92899676: {
                        if (var17_16.equals((Object)"alert")) ** GOTO lbl-1000
                        ** GOTO lbl-1000
                    }
                    case 3387192: {
                        if (!var17_16.equals((Object)"none")) ** GOTO lbl-1000
                        if (!k.x.c.i.a((Object)var14_14, (Object)Boolean.TRUE)) break block43;
                        var35_36 = e.g.a.o.s.a;
                        ** GOTO lbl105
                    }
                    case 3178851: {
                        if (!var17_16.equals((Object)"goto")) ** GOTO lbl-1000
                        var37_37 = BravoApp.s;
                        if (var37_37 == null) {
                            var38_38 = null;
                        } else {
                            var48_39 = var1_1.c;
                            var49_40 = var48_39 == null ? null : var48_39.n;
                            var38_38 = (Page)var37_37.get((Object)var49_40);
                        }
                        if (var38_38 == null) ** GOTO lbl88
                        var42_41 = Boolean.TRUE;
                        if (k.x.c.i.a((Object)var12_12, (Object)var42_41)) ** GOTO lbl98
                        var43_42 = var1_1.c;
                        if (var43_42 != null) {
                            if (k.x.c.i.a((Object)var13_13, (Object)var42_41)) {
                                var46_43 = e.g.a.o.s.a;
                                var47_44 = new e.g.a.i.a0(var43_42.n, var43_42.B, var42_41, null, null, 24);
                                var46_43.f(var0, var47_44);
                            } else {
                                var44_45 = o.b.a.c.b();
                                var45_46 = new e.g.a.i.a0(var43_42.n, var43_42.B, var42_41, null, null, 24);
                                var44_45.g((Object)var45_46);
                            }
                        }
                        break block43;
lbl88: // 1 sources:
                        var39_47 = new Object[2];
                        var40_48 = var1_1.c;
                        var41_49 = var40_48 == null ? null : var40_48.n;
                        var39_47[0] = var41_49;
                        var39_47[var19_19] = BravoApp.v;
                        p.a.a.d.b("PageId %s does not belong to app id %S", var39_47);
                        break block43;
                    }
                    case -268144392: {
                        if (!var17_16.equals((Object)"__none__")) ** GOTO lbl-1000
                        if (!k.x.c.i.a((Object)var12_12, (Object)Boolean.TRUE)) break block43;
lbl98: // 2 sources:
                        var0.u(var1_1);
                        break block43;
                    }
                    case -485371922: {
                        if (!var17_16.equals((Object)"homepage")) ** GOTO lbl-1000
                        var35_36 = e.g.a.o.s.a;
                        e.g.a.o.s.l = false;
lbl105: // 2 sources:
                        var35_36.i(var0);
                        break block43;
                    }
                    case -499367066: {
                        if (!var17_16.equals((Object)"set-state")) ** GOTO lbl-1000
                        var34_50 = new Object[]{};
                        p.a.a.d.a("action:set-state ignored (handled in mobile)", var34_50);
                        break block43;
                    }
                    case -1240638001: {
                        if (!var17_16.equals((Object)"goback")) ** GOTO lbl-1000
                        var20_35 = new e.g.a.d.h(var0);
                        ** GOTO lbl131
                    }
                    case -1263172891: {
                        if (!var17_16.equals((Object)"openurl")) ** GOTO lbl-1000
                        var29_51 = o.b.a.c.b();
                        var32_52 = var1_1.c;
                        if (var32_52 == null || (var33_53 = var32_52.a) == null) ** GOTO lbl125
                        k.x.c.i.e(var33_53, "<this>");
                        if (!k.d0.g.C((String)var33_53, (String)"http", (boolean)var19_19) && !k.d0.g.C((String)var33_53, (String)"https", (boolean)var19_19)) {
                            var33_53 = k.x.c.i.k("https://", var33_53);
                        }
                        if (var33_53 != null) ** GOTO lbl126
lbl125: // 2 sources:
                        var33_53 = "";
lbl126: // 2 sources:
                        var31_54 = new h0(var33_53, null);
                        ** GOTO lbl141
                    }
                    case -1901722497: 
                }
                if (var17_16.equals((Object)"showalert")) lbl-1000: // 2 sources:
                {
                    var20_35 = new e.g.a.d.r(var0, var1_1);
lbl131: // 3 sources:
                    var0.runOnUiThread((Runnable)var20_35);
                } else lbl-1000: // 13 sources:
                {
                    var28_57 = var0.r;
                    if (var28_57 != null) {
                        v0.g((View)var28_57);
                    }
                    var29_51 = o.b.a.c.b();
                    k.x.c.i.e((Object)var1_1, "responseAction");
                    k.x.c.i.e((Object)var1_1, "<this>");
                    var30_58 = new Actions(new Tap(var1_1.b, var1_1.c), null, null, null, 14, null);
                    var31_55 = e.f.a.a0.E((Actions)var30_58, null, null, null, null, null, null, null, null, (int)498);
lbl141: // 2 sources:
                    var29_51.g((Object)var31_56);
                }
            }
            if (!k.x.c.i.a(var1_1.b, "goto") || (var27_60 = (var26_59 = var1_1.c) == null ? null : var26_59.B) == null) {
                var0.runOnUiThread((Runnable)new e.g.a.d.i(var0, var11_11, var10_10));
            }
            if (!k.x.c.i.a(var1_1.b, "refresh")) ** GOTO lbl-1000
            var23_61 = e.f.a.a0.J((BravoActivity)var0);
            if (var23_61 == null || (var24_62 = var23_61.k) == null || r0.m((Page)var24_62) != var19_19) {
                var19_19 = 0;
            }
            if (var19_19 != 0) {
                e.g.a.o.j.f = var15_15;
            } else lbl-1000: // 2 sources:
            {
                BravoActivity.y(var0, var15_15, false, 2, null);
            }
            var21_17 = k.q.a;
        }
        if (var21_17 != null) return;
        var22_63 = new Object[]{};
        p.a.a.d.a("actionResponse.action is null. is it coming from OneSignal directly?", var22_63);
    }

    public static /* synthetic */ void y(BravoActivity bravoActivity, e.g.a.m.h h2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = true;
        }
        bravoActivity.x(h2, bl);
    }

    public final void A() {
        FrameLayout frameLayout;
        int n2;
        Resources resources;
        Bitmap bitmap;
        block10 : {
            block9 : {
                WindowInsets windowInsets;
                File file;
                k.x.c.i.e((Object)this, "activity");
                Date date = new Date();
                DateFormat.format((CharSequence)"yyyy-MM-dd_hh:mm:ss", (Date)date);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(e.g.a.p.f.o());
                stringBuilder.append((Object)date);
                stringBuilder.append(".jpg");
                String string = stringBuilder.toString();
                n2 = 1;
                try {
                    View view = this.getWindow().getDecorView().getRootView();
                    view.setDrawingCacheEnabled((boolean)n2);
                    Bitmap bitmap2 = Bitmap.createBitmap((Bitmap)view.getDrawingCache());
                    view.setDrawingCacheEnabled(false);
                    file = new File(string);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                catch (Throwable throwable) {
                    Object[] arrobject = new Object[2];
                    arrobject[0] = string;
                    arrobject[n2] = throwable.getLocalizedMessage();
                    p.a.a.d.b("Error taking screenshot %s: %s", arrobject);
                    file = null;
                }
                if (file == null) {
                    return;
                }
                frameLayout = this.u;
                if (frameLayout == null) {
                    return;
                }
                resources = this.getResources();
                String string2 = file.getAbsolutePath();
                k.x.c.i.d(string2, "it.absolutePath");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = n2;
                bitmap = BitmapFactory.decodeFile((String)string2, (BitmapFactory.Options)options);
                int n3 = (2 & this.getWindow().getDecorView().getVisibility()) != 0 ? n2 : 0;
                if (n3 != 0) break block9;
                View view = this.getWindow().getDecorView();
                k.x.c.i.d((Object)view, "context.window.decorView");
                if (view.getRootWindowInsets() != null && ((windowInsets = view.getRootWindowInsets()) == null || windowInsets.getStableInsetBottom() != 0)) break block10;
            }
            n2 = 0;
        }
        if (n2 != 0) {
            int n4 = this.getWindow().getDecorView().getHeight();
            int n5 = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
            int n6 = 0;
            if (n5 > 0) {
                n6 = Resources.getSystem().getDimensionPixelSize(n5);
            }
            bitmap.setHeight(n4 - n6);
        }
        k.x.c.i.d((Object)bitmap, "bitmap");
        frameLayout.setBackground((Drawable)new BitmapDrawable(resources, bitmap));
    }

    public final void B(boolean bl, boolean bl2) {
        LottieAnimationView lottieAnimationView;
        RelativeLayout relativeLayout;
        if (bl2 && (relativeLayout = this.r) != null) {
            relativeLayout.setBackgroundResource(0);
        }
        if (bl) {
            ProgressBar progressBar = this.t;
            if (progressBar != null) {
                v0.g((View)progressBar);
            }
            RelativeLayout relativeLayout2 = this.r;
            if (relativeLayout2 != null) {
                v0.p((View)relativeLayout2);
            }
            lottieAnimationView = this.s;
            if (lottieAnimationView == null) {
                return;
            }
        } else {
            LottieAnimationView lottieAnimationView2 = this.s;
            if (lottieAnimationView2 != null) {
                v0.g((View)lottieAnimationView2);
            }
            RelativeLayout relativeLayout3 = this.r;
            if (relativeLayout3 != null) {
                v0.p((View)relativeLayout3);
            }
            lottieAnimationView = this.t;
            if (lottieAnimationView == null) {
                return;
            }
        }
        v0.p((View)lottieAnimationView);
    }

    public final void C(int n2) {
        RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131231187);
        if (relativeLayout != null) {
            int n3 = n2 == 99 ? -2 : -1;
            Snackbar snackbar = Snackbar.make((View)relativeLayout, (CharSequence)"", (int)n3);
            k.x.c.i.d((Object)snackbar, "make(parentLayout, \"\", duration)");
            int n4 = (int)this.getResources().getDimension(2131100260);
            int n5 = n2 == 99 ? 2131427500 : 2131427498;
            View view = this.getLayoutInflater().inflate(n5, null);
            TextView textView = (TextView)view.findViewById(2131231272);
            if (textView != null) {
                textView.setTypeface(e.g.a.o.k.a.d("01DZ4603S1A99S0MKRX805Z15F"));
            }
            if (n2 == 500) {
                textView.setText((CharSequence)this.getString(2131755348));
            }
            if (n2 == 99) {
                TextView textView2 = (TextView)view.findViewById(2131231273);
                if (textView2 != null) {
                    textView2.setTypeface(e.g.a.o.k.a.d("01DZ4603RX0X7SJMZFXAMWZQ4T"));
                }
                textView2.setOnClickListener((View.OnClickListener)new e.g.a.d.b(this));
            }
            Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout)snackbar.getView();
            ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
            Objects.requireNonNull((Object)layoutParams, (String)"null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams)layoutParams;
            layoutParams2.height = n4;
            layoutParams2.width = -1;
            snackbarLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
            snackbarLayout.setBackgroundColor(ContextCompat.getColor((Context)this, (int)2131034151));
            snackbarLayout.addView(view, 0);
            snackbar.show();
        }
    }

    public final boolean E() {
        boolean bl = e.g.a.p.f.b();
        boolean bl2 = false;
        if (bl) {
            DrawerLayout drawerLayout = (DrawerLayout)this.findViewById(2131230930);
            if (drawerLayout == null) {
                return false;
            }
            bl2 = drawerLayout.isDrawerOpen(8388611);
        }
        return bl2;
    }

    public final void F(e.g.a.i.a a2) {
        k.x.c.i.e((Object)a2, "event");
        ActionBodyParams actionBodyParams = new ActionBodyParams(new ActionBodyParamsContext(a2.c, a2.d, a2.e, a2.f));
        c0 c02 = BravoApp.k.d();
        String string = a2.b;
        k.x.c.i.e(string, "url");
        k.x.c.i.e((Object)actionBodyParams, "body");
        e0.a a3 = e.g.a.p.i.g(null, (int)1);
        a3.c("content-type", "application/json");
        a3.h(string);
        String string2 = e.g.a.o.r.q.e((Object)actionBodyParams);
        k.x.c.i.d(string2, "Moshify.actionBodyParamsInstance.toJson(body)");
        k.x.c.i.e(string2, "$this$toRequestBody");
        byte[] arrby = string2.getBytes(k.d0.a.b);
        k.x.c.i.d(arrby, "(this as java.lang.String).getBytes(charset)");
        int n2 = arrby.length;
        k.x.c.i.e(arrby, "$this$toRequestBody");
        m.m0.c.c(arrby.length, 0, n2);
        a3.e((g0)new g0.a.a(arrby, null, n2, 0));
        m.f f2 = c02.a(a3.b());
        j j2 = new j(a2, this);
        ((m.m0.g.e)f2).f((m.g)j2);
    }

    public final void G(o0 o02, boolean bl) {
        k.q q2;
        String string = o02.b;
        if (string == null) {
            q2 = null;
        } else {
            View view;
            e0.a a2 = e.g.a.p.i.g(null, (int)1);
            a2.h(string);
            a2.e(g0.a.b(g0.a, new byte[0], null, 0, 0, 7));
            m.e0 e02 = a2.b();
            View view2 = new View((Context)this);
            view2.setClickable(true);
            Component component = o02.e;
            if (component != null && (view = component.y) != null) {
                v0.b((View)view, (View)view2);
            }
            e.g.a.m.h h2 = BravoActivity.D(this, false, 1, null);
            m.f f2 = BravoApp.k.d().a(e02);
            k k2 = new k(this, h2, o02, view2, bl);
            ((m.m0.g.e)f2).f((m.g)k2);
            q2 = k.q.a;
        }
        if (q2 == null) {
            Object[] arrobject = new Object[]{};
            p.a.a.d.b("TriggerUrl is null", arrobject);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        block11 : {
            block13 : {
                int n2;
                block14 : {
                    block16 : {
                        block15 : {
                            block12 : {
                                k.x.c.i.e((Object)motionEvent, "event");
                                boolean bl = e.g.a.o.j.g;
                                n2 = 1;
                                int n3 = !bl && e.g.a.p.j.b() && !e.g.a.p.j.C() ? n2 : 0;
                                if (n3 == 0) break block11;
                                if (motionEvent.getAction() != 0) break block12;
                                this.m = System.currentTimeMillis();
                                this.n = motionEvent.getY();
                                this.o = motionEvent.getX();
                                break block13;
                            }
                            if (motionEvent.getAction() != 2) break block14;
                            int n4 = System.currentTimeMillis() - this.m > 700L && e.g.a.p.j.b() && !e.g.a.p.j.C() && !this.p ? n2 : 0;
                            if (n4 != 0) {
                                e.f.a.a0.D0((BravoActivity)this);
                                return false;
                            }
                            int n5 = Math.abs((float)(Math.abs((float)motionEvent.getY()) - this.n)) > 30.0f ? n2 : 0;
                            if (n5 != 0) break block15;
                            float f2 = Math.abs((float)(Math.abs((float)motionEvent.getX()) - this.o)) FCMPL 30.0f;
                            int n6 = 0;
                            if (f2 > 0) {
                                n6 = n2;
                            }
                            if (n6 == 0) break block16;
                        }
                        this.p = n2;
                    }
                    return Activity.super.dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() != n2) break block11;
                if (System.currentTimeMillis() - this.m < 700L) {
                    n2 = 0;
                }
                if (n2 != 0 && !this.p) {
                    this.m = 0L;
                    this.p = false;
                    if (e.g.a.p.j.b() && !e.g.a.p.j.C()) {
                        e.f.a.a0.D0((BravoActivity)this);
                    }
                    return false;
                }
                this.m = 0L;
                this.p = false;
            }
            return Activity.super.dispatchTouchEvent(motionEvent);
        }
        return Activity.super.dispatchTouchEvent(motionEvent);
    }

    public final void k() {
        e.f.a.a0.f();
        e.g.a.o.s s2 = e.g.a.o.s.a;
        e.g.a.o.s.k = false;
        e.g.a.o.s.l = false;
        e.g.a.o.s.m = false;
        BravoApp.p = null;
        s2.h();
    }

    public final void l() {
        JsonApp jsonApp;
        e.f.a.a0.P0((String)"after_logout", (Object)Boolean.TRUE);
        e.f.a.a0.g((String[])new String[]{"bravo_vision_user_logged_in", "auth_token", "access_token", "bravo_vision_user_id"});
        BravoApp.q = jsonApp = e.g.a.p.f.w((int)2131689476);
        BravoApp.r = jsonApp;
        e.g.a.o.s.a.h();
    }

    public final void m() {
        if (e.g.a.p.f.b()) {
            if (this.l == null) {
                this.l = (DrawerLayout)this.findViewById(2131230930);
            }
            DrawerLayout drawerLayout = this.l;
            k.x.c.i.c((Object)drawerLayout);
            if (drawerLayout.isDrawerOpen(8388611)) {
                DrawerLayout drawerLayout2 = this.l;
                k.x.c.i.c((Object)drawerLayout2);
                drawerLayout2.closeDrawer(8388611);
                return;
            }
        } else if (k.x.c.i.a(e.g.a.p.f.q(), "menu:modal")) {
            e.g.a.o.s.a.b();
        }
    }

    public final void n(l0 l02) {
        MediaPlayer mediaPlayer;
        e.g.a.m.a a2;
        MediaPlayer mediaPlayer2;
        e.g.a.m.a a3;
        e.g.a.m.a a4;
        e.g.a.m.a a5;
        List list = (List)BravoApp.D.get((Object)l02.b);
        if (list == null) {
            a3 = null;
        } else {
            Object object2;
            block18 : {
                for (Object object2 : list) {
                    if (!k.x.c.i.a(((e.g.a.m.a)object2).c, "audio:currenttime")) continue;
                    break block18;
                }
                object2 = null;
            }
            a3 = (e.g.a.m.a)object2;
        }
        TextView textView = a3 != null ? (TextView)a3.d : null;
        List list2 = (List)BravoApp.D.get((Object)l02.b);
        if (list2 == null) {
            a4 = null;
        } else {
            Object object3;
            block19 : {
                for (Object object3 : list2) {
                    if (!k.x.c.i.a(((e.g.a.m.a)object3).c, "audio:totaltime")) continue;
                    break block19;
                }
                object3 = null;
            }
            a4 = (e.g.a.m.a)object3;
        }
        TextView textView2 = a4 != null ? (TextView)a4.d : null;
        List list3 = (List)BravoApp.D.get((Object)l02.b);
        if (list3 == null) {
            a5 = null;
        } else {
            Object object4;
            block20 : {
                for (Object object4 : list3) {
                    if (!k.x.c.i.a(((e.g.a.m.a)object4).c, "action:play")) continue;
                    break block20;
                }
                object4 = null;
            }
            a5 = (e.g.a.m.a)object4;
        }
        View view = a5 == null ? null : a5.d;
        List list4 = (List)BravoApp.D.get((Object)l02.b);
        if (list4 == null) {
            a2 = null;
        } else {
            Object object5;
            block21 : {
                for (Object object5 : list4) {
                    if (!k.x.c.i.a(((e.g.a.m.a)object5).c, "action:pause")) continue;
                    break block21;
                }
                object5 = null;
            }
            a2 = (e.g.a.m.a)object5;
        }
        View view2 = a2 == null ? null : a2.d;
        Object[] arrobject = new Object[1];
        e.g.a.m.i i2 = BravoApp.E;
        String string = i2 == null || (mediaPlayer = i2.c) == null ? null : Integer.valueOf((int)mediaPlayer.getDuration()).toString();
        arrobject[0] = string;
        p.a.a.d.a("Audio File duration = %s", arrobject);
        e.g.a.m.i i3 = BravoApp.E;
        if (i3 != null && (mediaPlayer2 = i3.c) != null) {
            mediaPlayer2.start();
        }
        if (view != null) {
            v0.g((View)view);
        }
        if (view2 != null) {
            v0.p((View)view2);
        }
        if (textView2 != null) {
            v0.p((View)textView2);
        }
        if (textView2 != null) {
            MediaPlayer mediaPlayer3;
            e.g.a.m.i i4 = BravoApp.E;
            String string2 = i4 == null ? null : ((mediaPlayer3 = i4.c) == null ? null : e.f.a.a0.x0((int)mediaPlayer3.getDuration()));
            textView2.setText(string2);
        }
        if (textView != null) {
            textView.setText((CharSequence)"0");
        }
        this.runOnUiThread((Runnable)new c(textView));
    }

    public final void o(String string, String string2) {
        e.g.a.m.h h2 = BravoActivity.D(this, false, 1, null);
        LifecycleCoroutineScope lifecycleCoroutineScope = LifecycleOwnerKt.getLifecycleScope((LifecycleOwner)this);
        d d2 = new d(this, string2, h2, string, null);
        e.s.a.a.H2((l.a.b0)lifecycleCoroutineScope, null, null, (k.x.b.p)d2, (int)3, null);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onActionInPushNotificationEvent(e.g.a.i.b b2) {
        k.x.c.i.e((Object)b2, "event");
        BravoActivity.t(this, b2.a, null, null, Boolean.TRUE, null, null, null, 118, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void onActivityResult(int var1_1, int var2_2, Intent var3_3) {
        block96 : {
            block90 : {
                block89 : {
                    block88 : {
                        block93 : {
                            block94 : {
                                block95 : {
                                    FragmentActivity.super.onActivityResult(var1_1, var2_2, var3_3);
                                    k.x.c.i.e((Object)this, "<this>");
                                    var4_4 = this.getSystemService("connectivity");
                                    var5_5 = 1;
                                    var6_9 = var4_4 != null && var4_4 instanceof ConnectivityManager != false && (var200_7 = (var199_6 = (ConnectivityManager)var4_4).getActiveNetwork()) != null && (var201_8 = var199_6.getNetworkCapabilities(var200_7)) != null && (var201_8.hasTransport(var5_5) != false || var201_8.hasTransport(0) != false || var201_8.hasTransport(3) != false) ? var5_5 : 0;
                                    if (var6_9 == 0) {
                                        var7_173 = this.getString(2131755043);
                                        k.x.c.i.d(var7_173, "getString(R.string.alert_no_internet)");
                                        e.g.a.p.f.y((AppCompatActivity)this, (String)var7_173);
                                        return;
                                    }
                                    var8_10 = IntentIntegrator.parseActivityResult((int)var1_1, (int)var2_2, (Intent)var3_3);
                                    if (var8_10 != null && (var9_11 = var8_10.getContents()) != null) {
                                        k.x.c.i.e(var9_11, "<this>");
                                        if (Pattern.compile((String)"^https:\\/\\/[^\\/]+\\/devices\\/apps\\/.*$").matcher((CharSequence)var9_11).find()) {
                                            var195_12 = e.g.a.e.a.a;
                                            k.x.c.i.e(var9_11, "url");
                                            var196_13 = var195_12.d();
                                            var197_14 = UUID.randomUUID().toString();
                                            k.x.c.i.d(var197_14, "randomUUID().toString()");
                                            var198_15 = var195_12.c(var196_13, var197_14).putValue("url", (Object)var9_11);
                                            k.x.c.i.d((Object)var198_15, "baseEvent(getAppId(), ja\u2026      .putValue(URL, url)");
                                            var195_12.f(false, "QR Scanned", var198_15, null);
                                            e.f.a.a0.v0((BravoActivity)this, (String)var9_11, (boolean)var5_5);
                                        } else {
                                            k.x.c.i.e(var9_11, "<this>");
                                            if (Patterns.WEB_URL.matcher((CharSequence)var9_11).matches()) {
                                                if (!k.d0.g.E((String)var9_11, (String)"http", (boolean)false, (int)2)) {
                                                    var9_11 = URLUtil.guessUrl((String)var9_11);
                                                }
                                                this.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse((String)var9_11)));
                                            } else {
                                                e.g.a.p.f.y((AppCompatActivity)this, (String)var9_11);
                                            }
                                        }
                                    }
                                    var10_16 = var2_2 == 2 ? var5_5 : 0;
                                    if (var10_16 != 0) {
                                        var194_17 = var1_1 != 21 && var1_1 != 22 && var1_1 != 23 ? 0 : var5_5;
                                        if (var194_17 != 0) {
                                            o.b.a.c.b().g((Object)new e.g.a.i.m());
                                        }
                                    }
                                    var11_18 = "parse(it)";
                                    var12_19 = 6;
                                    var13_20 = "";
                                    if (var1_1 == 10) break block93;
                                    if (var1_1 == 55) {
                                        if (e.f.a.a0.C0((int)var2_2) != false) return;
                                        var70_125 = k.x.c.i.k("Update flow failed! Result code: ", var2_2);
                                        var71_126 = new Object[]{};
                                        p.a.a.d.b(var70_125, var71_126);
                                        return;
                                    }
                                    if (var1_1 == 50000) {
                                        k.x.c.i.e((Object)this, "activity");
                                        new WeakReference((Object)this);
                                        return;
                                    }
                                    if (var1_1 == 78) break block94;
                                    if (var1_1 == 79) break block95;
                                    switch (var1_1) {
                                        default: {
                                            return;
                                        }
                                        case 25: {
                                            if (e.f.a.a0.C0((int)var2_2) == false) return;
                                            var137_21 = var3_3 == null ? null : var3_3.getData();
                                            k.x.c.i.e((Object)this, "<this>");
                                            if (var137_21 == null) ** GOTO lbl101
                                            var138_22 = this.getCacheDir();
                                            var139_23 = this.getContentResolver();
                                            if (var139_23 == null || (var140_24 = var139_23.query(var137_21, null, null, null, null)) == null) {
                                                var145_25 = null;
                                            } else {
                                                var143_26 = var140_24.getColumnIndex("_display_name");
                                                var140_24.moveToFirst();
                                                var145_25 = var140_24.getString(var143_26);
                                                e.s.a.a.R((Closeable)var140_24, null);
                                            }
                                            if (var145_25 == null) {
                                                k.x.c.i.e((Object)this, "<this>");
                                                var193_27 = MimeTypeMap.getSingleton().getExtensionFromMimeType(e.f.a.a0.Q((Context)this, (Uri)var137_21));
                                                if (var193_27 != null) {
                                                    var13_20 = var193_27;
                                                }
                                                var145_25 = k.x.c.i.k("temp_file_name.", var13_20);
                                            }
                                            var146_28 = new File(var138_22, var145_25);
                                            var147_29 = new FileOutputStream(var146_28);
                                            var187_30 = this.getContentResolver().openInputStream(var137_21);
                                            k.x.c.i.e((Object)var147_29, "<this>");
                                            if (var187_30 == null) ** GOTO lbl86
                                            e.s.a.a.n0((InputStream)var187_30, (OutputStream)var147_29, (int)0, (int)2);
lbl86: // 3 sources:
                                            e.s.a.a.R((Closeable)var147_29, null);
                                            var149_32 = var192_31 = new e.g.a.m.j(e.f.a.a0.Q((Context)this, (Uri)var137_21), var146_28);
                                            ** GOTO lbl102
                                            catch (Throwable var188_33) {
                                                try {
                                                    throw var188_33;
                                                }
                                                catch (Throwable var189_34) {
                                                    try {
                                                        e.s.a.a.R((Closeable)var147_29, (Throwable)var188_33);
                                                        throw var189_34;
                                                    }
                                                    catch (Exception var186_35) {
                                                        var186_35.printStackTrace();
                                                    }
                                                    catch (FileNotFoundException var148_36) {
                                                        var148_36.printStackTrace();
                                                    }
                                                }
                                            }
lbl101: // 3 sources:
                                            var149_32 = null;
lbl102: // 2 sources:
                                            k.x.c.i.e((Object)this, "context");
                                            if (var149_32 == null) {
                                                return;
                                            }
                                            try {
                                                var152_37 = l.f;
                                                var153_38 = var152_37 == null ? null : var152_37.c;
                                                break block88;
                                            }
                                            catch (Exception var150_67) {
                                                var151_68 = new Object[var5_5];
                                                var151_68[0] = var150_67.getLocalizedMessage();
                                                p.a.a.d.b("Error processing file upload: %s", var151_68);
                                                e.f.a.a0.j1((BravoActivity)this, (int)2131755147, (String)var150_67.getLocalizedMessage(), (boolean)false, (int)4);
                                                return;
                                            }
                                            catch (Throwable var141_69) {
                                                try {
                                                    throw var141_69;
                                                }
                                                catch (Throwable var142_70) {
                                                    e.s.a.a.R((Closeable)var140_24, (Throwable)var141_69);
                                                    throw var142_70;
                                                }
                                            }
                                        }
                                        case 24: {
                                            if (e.f.a.a0.C0((int)var2_2) == false) return;
                                            var103_71 = l.a;
                                            var104_72 = ImagePicker.Companion.getFile(var3_3);
                                            k.x.c.i.e((Object)this, "context");
                                            if (var104_72 == null) {
                                                var105_99 = new Object[]{};
                                                p.a.a.d.b("input image file is null", var105_99);
                                                return;
                                            }
                                            var106_73 = l.d;
                                            if (var106_73 != null && (var107_74 = var106_73.c) != null) {
                                                k.x.c.i.e((Object)var107_74, "<this>");
                                                var108_75 = var104_72.getAbsolutePath();
                                                var109_76 = var108_75 == null ? var13_20 : var108_75;
                                                var110_77 = new Asset(var109_76, var104_72.getAbsolutePath(), null, null, null, null, null, false, 128, null);
                                                n0.F((ImageView)var107_74, (String)var106_73.a, (String)var106_73.b, (String)"component:input-image", (Style)var106_73.d, (int)var106_73.e, (int)var106_73.f, (Asset)var110_77, (int)var106_73.g, (boolean)false, (boolean)false, (int)768);
                                            }
                                            var112_78 = new ProgressBar((Context)this);
                                            var112_78.setScaleX(0.33f);
                                            var112_78.setScaleY(0.33f);
                                            var113_79 = l.d;
                                            var114_80 = var113_79 == null ? null : var113_79.b;
                                            var115_81 = new e.g.a.m.g(var114_80, var112_78, false);
                                            var103_71.a(l.c, var115_81);
                                            var116_82 = l.d;
                                            if (var116_82 != null && (var117_83 = var116_82.c) != null) {
                                                v0.b((View)var117_83, (View)var112_78);
                                            }
                                            var120_85 = (var119_84 = l.d) == null ? null : var119_84.a;
                                            var121_86 = e.g.a.o.q.a((String)var120_85);
                                            if (var121_86 != null) {
                                                var123_87 = e.s.a.a.g((k.u.f)l.a.b2.l.c.plus((k.u.f)e.s.a.a.h(null, (int)var5_5, null)));
                                                var124_88 = new n(var104_72, this, var115_81, var121_86, null);
                                                e.s.a.a.H2((l.a.b0)var123_87, null, null, (k.x.b.p)var124_88, (int)3, null);
                                            }
                                            var126_89 = l.d;
                                            var127_90 = var126_89 == null ? null : var126_89.a;
                                            var128_91 = e.g.a.o.q.a((String)var127_90);
                                            if (var128_91 == null) {
                                                return;
                                            }
                                            var130_93 = var128_91.iterator();
                                            do {
                                                var131_94 = var130_93.hasNext();
                                                var132_95 = null;
                                                if (!var131_94) ** GOTO lbl165
                                            } while (!k.x.c.i.a(var134_97 = e.f.a.a0.o0((InputComponent)((InputComponent)(var133_96 = var130_93.next()))), var135_98 = var126_89 == null ? null : var126_89.b));
                                            var132_95 = var133_96;
lbl165: // 2 sources:
                                            if ((var129_92 = (InputComponent)var132_95) == null) {
                                                return;
                                            }
                                            var129_92.c = var104_72;
                                            return;
                                        }
                                        case 23: {
                                            var101_100 = o.b.a.c.b();
                                            var102_101 = new z0();
                                            ** GOTO lbl176
                                        }
                                        case 22: {
                                            var101_100 = o.b.a.c.b();
                                            var102_101 = new y0();
lbl176: // 2 sources:
                                            var101_100.g((Object)var102_101);
                                            return;
                                        }
                                        case 21: 
                                    }
                                    if (var3_3 == null) {
                                        return;
                                    }
                                    var97_102 = var3_3.getDataString();
                                    if (var97_102 == null) {
                                        return;
                                    }
                                    var98_103 = o.b.a.c.b();
                                    var99_104 = new Uri[var5_5];
                                    var100_105 = Uri.parse((String)var97_102);
                                    k.x.c.i.d((Object)var100_105, var11_18);
                                    var99_104[0] = var100_105;
                                    var98_103.g((Object)new e.g.a.i.c(var99_104));
                                    return;
                                }
                                var82_106 = o.a;
                                k.x.c.i.e((Object)this, "context");
                                if (var3_3 == null) {
                                    var84_107 = new e.p.a.c.a.a.f.b(null, Status.m);
                                } else {
                                    var95_108 = (Status)var3_3.getParcelableExtra("googleSignInStatus");
                                    var96_109 = (GoogleSignInAccount)var3_3.getParcelableExtra("googleSignInAccount");
                                    if (var96_109 == null) {
                                        if (var95_108 == null) {
                                            var95_108 = Status.m;
                                        }
                                        var84_107 = new e.p.a.c.a.a.f.b(null, var95_108);
                                    } else {
                                        var84_107 = new e.p.a.c.a.a.f.b(var96_109, Status.k);
                                    }
                                }
                                var85_110 = var84_107.l;
                                var86_111 = var84_107.k.j0() && var85_110 != null ? e.p.a.c.b.a.W((Object)var85_110) : e.p.a.c.b.a.V((Exception)e.p.a.c.b.a.Y((Status)var84_107.k));
                                k.x.c.i.d((Object)var86_111, "getSignedInAccountFromIntent(data)");
                                try {
                                    var87_112 = new t(((GoogleSignInAccount)var86_111.m(e.p.a.c.c.k.b.class)).m, null);
                                    k.x.c.i.d((Object)var87_112, "getCredential(account.idToken, null)");
                                    var91_113 = var82_106.a(this);
                                    if (var91_113 == null) {
                                        return;
                                    }
                                    var92_114 = var91_113.a((e.p.d.o.c)var87_112);
                                    if (var92_114 == null) {
                                        return;
                                    }
                                    var92_114.f((Activity)this, (e.p.a.c.k.f)new e.g.a.f.a.c(this));
                                    var92_114.d((Activity)this, (e.p.a.c.k.e)new m(this));
                                    return;
                                }
                                catch (e.p.a.c.c.k.b var88_115) {
                                    var89_116 = var88_115.k.q == 7 ? "Could not reach network" : k.x.c.i.k("SignIn failed with exception ", (Object)var88_115);
                                    var90_117 = new Object[]{};
                                    p.a.a.d.b(var89_116, var90_117);
                                    BravoActivity.y(this, o.c, false, 2, null);
                                    e.f.a.a0.n1((BravoActivity)this, (int)2131755131, null, (boolean)false, (int)var12_19);
                                    return;
                                }
                            }
                            var73_118 = o.a;
                            k.x.c.i.e((Object)this, "context");
                            if (BravoApp.C == null) {
                                var75_119 = null;
                            } else {
                                if (var3_3 == null) throw new e.p.a.c.c.k.b(Status.m);
                                var80_120 = (Status)e.p.a.c.b.a.P((Intent)var3_3, (String)"status", (Parcelable.Creator)Status.CREATOR);
                                if (var80_120 == null) throw new e.p.a.c.c.k.b(Status.o);
                                if (var80_120.j0() == false) throw new e.p.a.c.c.k.b(var80_120);
                                var81_121 = (e.p.a.c.a.a.d.d)e.p.a.c.b.a.P((Intent)var3_3, (String)"sign_in_credential", (Parcelable.Creator)e.p.a.c.a.a.d.d.CREATOR);
                                if (var81_121 == null) throw new e.p.a.c.c.k.b(Status.m);
                                var75_119 = var81_121.q;
                            }
                            var76_122 = new t(var75_119, null);
                            k.x.c.i.d((Object)var76_122, "getCredential(googleIdToken, null)");
                            var77_123 = var73_118.a(this);
                            if (var77_123 == null) {
                                return;
                            }
                            var78_124 = var77_123.a((e.p.d.o.c)var76_122);
                            if (var78_124 == null) {
                                return;
                            }
                            var78_124.b((Activity)this, (e.p.a.c.k.d)new e.g.a.f.a.k(this));
                            return;
                        }
                        if (e.f.a.a0.C0((int)var2_2) == false) return;
                        k.x.c.i.e((Object)this, "context");
                        if (var3_3 == null) {
                            return;
                        }
                        var15_127 = var3_3.getStringArrayListExtra("PICKED_MEDIA_LIST");
                        if (var15_127 == null) {
                            return;
                        }
                        break block96;
                    }
                    if (var153_38 != null) {
                        var153_38.setText((CharSequence)var149_32.b.getName());
                    }
                    var154_39 = new ProgressBar((Context)this);
                    var154_39.setScaleX(0.33f);
                    var154_39.setScaleY(0.33f);
                    var155_40 = l.f;
                    var156_41 = var155_40 == null ? null : var155_40.b;
                    var157_42 = new e.g.a.m.f(var156_41, var154_39, false);
                    var158_43 = l.b;
                    for (Object var160_45 : var158_43) {
                        if (!k.x.c.i.a(((e.g.a.m.f)var160_45).a, var157_42.a)) continue;
                        break block89;
                    }
                    var160_45 = null;
                }
                if (var160_45 == null) {
                    var158_43.add((Object)var157_42);
                }
                if ((var162_46 = l.f) != null && (var163_47 = var162_46.c) != null) {
                    v0.b((View)var163_47, (View)var154_39);
                }
                var164_48 = new k.x.c.t();
                var166_49 = l.f;
                var167_50 = var166_49 == null ? null : var166_49.a;
                var168_51 = e.g.a.o.q.a((String)var167_50);
                if (var168_51 != null) {
                    var170_52 = e.s.a.a.g((k.u.f)l.a.b2.l.c.plus((k.u.f)e.s.a.a.h(null, (int)var5_5, null)));
                    var171_53 = new e.g.a.o.m(this, var149_32, var164_48, var157_42, var168_51, null);
                    e.s.a.a.H2((l.a.b0)var170_52, null, null, (k.x.b.p)var171_53, (int)3, null);
                }
                var173_54 = var149_32.b.getName();
                k.x.c.i.d(var173_54, "it.file.name");
                var174_55 = var149_32.a;
                var175_56 = var164_48.k;
                var176_57 = l.f;
                var177_58 = var176_57 == null ? null : var176_57.a;
                var178_59 = e.g.a.o.q.a((String)var177_58);
                if (var178_59 == null) {
                    return;
                }
                var179_60 = var178_59.iterator();
                do {
                    var180_61 = var179_60.hasNext();
                    var181_62 = null;
                    if (!var180_61) break block90;
                } while (!k.x.c.i.a(var183_64 = e.f.a.a0.o0((InputComponent)((InputComponent)(var182_63 = var179_60.next()))), var184_65 = var176_57 == null ? null : var176_57.b));
                var181_62 = var182_63;
            }
            if ((var185_66 = (InputComponent)var181_62) == null) {
                return;
            }
            var185_66.d = var173_54;
            var185_66.e = var175_56;
            var185_66.f = var174_55;
            return;
        }
        var16_128 = new ArrayList(e.s.a.a.U((Iterable)var15_127, (int)10));
        var17_129 = var15_127.iterator();
        while (var17_129.hasNext() != false) {
            var18_130 = (String)var17_129.next();
            var19_131 = Uri.parse((String)var18_130);
            k.x.c.i.d((Object)var19_131, var11_18);
            var20_132 = this.getContentResolver().getType(var19_131);
            var21_133 = MimeTypeMap.getSingleton().getExtensionFromMimeType(var20_132);
            var22_134 = var21_133 != null ? k.x.c.i.k(".", var21_133) : var13_20;
            var23_135 = k.x.c.i.k("temp_file", var22_134);
            var24_136 = new File(this.getCacheDir(), var23_135);
            var24_136.createNewFile();
            try {
                var26_137 = new FileOutputStream(var24_136);
                var67_170 = this.getContentResolver().openInputStream(var19_131);
                if (var67_170 != null) {
                    var68_171 = new byte[8192];
                    while ((var69_172 = var67_170.read(var68_171)) > 0) {
                        var26_137.write(var68_171, 0, var69_172);
                    }
                }
                var26_137.flush();
            }
            catch (Exception var27_138) {
                var27_138.printStackTrace();
            }
            k.x.c.i.e((Object)var24_136, "<this>");
            k.x.c.i.e((Object)var24_136, "<this>");
            k.x.c.i.e((Object)var24_136, "<this>");
            var28_139 = var24_136.exists() == false ? 0.0 : (double)var24_136.length();
            var30_140 = var11_18;
            var31_141 = var13_20;
            var32_142 = 1024;
            if (var28_139 / var32_142 / var32_142 > 200.0) {
                e.f.a.a0.j1((BravoActivity)this, (int)2131755151, null, (boolean)false, (int)var12_19);
            } else {
                block91 : {
                    var34_143 = l.e;
                    if (var34_143 != null && (var35_144 = var34_143.c) != null) {
                        k.x.c.i.d(var18_130, "it");
                        var36_145 = l.e;
                        k.x.c.i.e((Object)var35_144, "<this>");
                        k.x.c.i.e(var18_130, "file");
                        var37_146 = new Asset(var18_130, var18_130, null, null, null, null, null, false, 128, null);
                        if (var36_145 != null) {
                            n0.F((ImageView)var35_144, (String)var36_145.a, (String)var36_145.b, (String)"component:input-video", (Style)var36_145.d, (int)var36_145.e, (int)var36_145.f, (Asset)var37_146, (int)var36_145.g, (boolean)false, (boolean)false, (int)768);
                        }
                    }
                    var39_147 = new ProgressBar((Context)this);
                    var39_147.setScaleX(0.33f);
                    var39_147.setScaleY(0.33f);
                    var40_148 = l.e;
                    var41_149 = var40_148 == null ? null : var40_148.b;
                    var42_150 = new e.g.a.m.g(var41_149, var39_147, false);
                    var43_151 = l.c;
                    for (Object var45_153 : var43_151) {
                        if (!k.x.c.i.a(((e.g.a.m.g)var45_153).a, var42_150.a)) continue;
                        break block91;
                    }
                    var45_153 = null;
                }
                if (var45_153 == null) {
                    var43_151.add((Object)var42_150);
                }
                if ((var46_154 = l.e) != null && (var47_155 = var46_154.c) != null) {
                    v0.b((View)var47_155, (View)var39_147);
                }
                var50_157 = (var49_156 = l.e) == null ? null : var49_156.a;
                var51_158 = e.g.a.o.q.a((String)var50_157);
                if (var51_158 == null) {
                    var54_160 = var24_136;
                } else {
                    var53_159 = e.s.a.a.g((k.u.f)l.a.b2.l.c.plus((k.u.f)e.s.a.a.h(null, (int)var5_5, null)));
                    var54_160 = var24_136;
                    var55_161 = new e.g.a.o.o(var24_136, this, var42_150, var51_158, null);
                    e.s.a.a.H2((l.a.b0)var53_159, null, null, (k.x.b.p)var55_161, (int)3, null);
                }
                var57_162 = l.e;
                var58_163 = var57_162 == null ? null : var57_162.a;
                var59_164 = e.g.a.o.q.a((String)var58_163);
                if (var59_164 == null) {
                    var60_165 = null;
                } else {
                    block92 : {
                        for (Object var63_167 : var59_164) {
                            var64_168 = e.f.a.a0.o0((InputComponent)((InputComponent)var63_167));
                            if (!k.x.c.i.a(var64_168, var65_169 = var57_162 == null ? null : var57_162.b)) continue;
                            break block92;
                        }
                        var63_167 = null;
                    }
                    var60_165 = (InputComponent)var63_167;
                }
                if (var60_165 != null) {
                    var60_165.c = var54_160;
                }
            }
            var16_128.add((Object)k.q.a);
            var5_5 = 1;
            var12_19 = 6;
            var13_20 = var31_141;
            var11_18 = var30_140;
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onAddToCalendarEvent(e.g.a.i.d d2) {
        boolean bl;
        Intent intent;
        String string;
        k.x.c.i.e((Object)d2, "event");
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string2 = d2.b;
        k.x.c.i.e(string2, "dateString");
        Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"action_type", (String)"date").putValue("action_data", (Object)string2);
        a2.f(false, "Action Started", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026(ACTION_DATA, dateString)", (String)"Slack", (boolean)false));
        Intent intent2 = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("beginTime", d2.b).putExtra("title", d2.a);
        k.x.c.i.d((Object)intent2, "Intent(Intent.ACTION_EDI\u2026s.TITLE, event.eventName)");
        String string3 = d2.c;
        if (string3 == null) {
            bl = false;
        } else {
            boolean bl2 = e.g.a.j.t0.l((String)string3);
            bl = false;
            if (bl2) {
                bl = true;
            }
        }
        if (bl) {
            intent = intent2.putExtra("endTime", d2.c);
            string = "{\n            calendarIn\u2026 event.endDate)\n        }";
        } else {
            intent = intent2.putExtra("allDay", true);
            string = "{\n            calendarIn\u2026_ALL_DAY, true)\n        }";
        }
        k.x.c.i.d((Object)intent, string);
        this.startActivity(intent);
    }

    public void onBackPressed() {
        if (this.E()) {
            DrawerLayout drawerLayout;
            if (this.l == null) {
                this.l = (DrawerLayout)this.findViewById(2131230930);
            }
            if ((drawerLayout = this.l) == null) {
                return;
            }
            drawerLayout.closeDrawer(8388611);
            return;
        }
        this.r();
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onCloseEvent(e.g.a.i.f f2) {
        k.x.c.i.e((Object)f2, "event");
        WeakReference weakReference = BravoApp.m;
        Activity activity = weakReference == null ? null : (Activity)weakReference.get();
        if (activity instanceof LongPressActivity) {
            e.g.a.o.s.i = false;
            Object object = weakReference.get();
            Objects.requireNonNull((Object)object, (String)"null cannot be cast to non-null type com.appfoundry.previewer.activities.LongPressActivity");
            ((LongPressActivity)((Object)object)).finish();
            return;
        }
        if (this.E()) {
            this.m();
            return;
        }
        e.g.a.o.s s2 = e.g.a.o.s.a;
        if (e.g.a.o.s.f && e.g.a.o.s.e != null) {
            s2.b();
            return;
        }
        if (e.f.a.a0.u0((BravoActivity)this) instanceof AppCompatDialogFragment) {
            Fragment fragment = e.f.a.a0.u0((BravoActivity)this);
            Objects.requireNonNull((Object)fragment, (String)"null cannot be cast to non-null type androidx.appcompat.app.AppCompatDialogFragment");
            ((AppCompatDialogFragment)fragment).dismiss();
            return;
        }
        if (e.g.a.o.s.h) {
            this.onIntroCloseEvent(null);
            return;
        }
        if (!e.g.a.o.s.k && !e.g.a.o.s.l) {
            this.onBackPressed();
            return;
        }
        k.x.c.i.e((Object)this, "activity");
        e.g.a.o.s.k = false;
        e.g.a.o.s.l = false;
        e.f.a.a0.M0((AppCompatActivity)this, (Page)s2.d(), (int)2131230871);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCreate(Bundle bundle) {
        block39 : {
            Page page;
            block44 : {
                NavigationView navigationView;
                block45 : {
                    List list;
                    block47 : {
                        Container container;
                        block46 : {
                            Container container2;
                            List list2;
                            List list3;
                            int n2;
                            block42 : {
                                Iterator iterator;
                                block43 : {
                                    a.b b2;
                                    block40 : {
                                        List list4;
                                        block41 : {
                                            block38 : {
                                                String string;
                                                block36 : {
                                                    block37 : {
                                                        String string2;
                                                        String string3;
                                                        App app;
                                                        FragmentActivity.super.onCreate(bundle);
                                                        this.overridePendingTransition(17432576, 17432577);
                                                        e.f.a.a0.Y0((AppCompatActivity)this);
                                                        e.f.a.a0.n0((AppCompatActivity)this);
                                                        Object[] arrobject = new Object[1];
                                                        long l2 = u.a.e(e.f.a.a0.s0((String)"bravo_vision_refresh_token_expiration"));
                                                        k.x.c.i.e("dd/MM/yyyy HH:mm:ss", "format");
                                                        try {
                                                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
                                                            Calendar calendar = Calendar.getInstance();
                                                            k.x.c.i.d((Object)calendar, "getInstance()");
                                                            calendar.setTimeInMillis(l2);
                                                            string3 = simpleDateFormat.format(calendar.getTime());
                                                            k.x.c.i.d(string3, "{\n        val formatter \u2026rmat(calendar.time)\n    }");
                                                        }
                                                        catch (Exception exception) {
                                                            Object[] arrobject2 = new Object[]{String.valueOf((long)l2), exception.getLocalizedMessage()};
                                                            p.a.a.d.b("exception parsing %s to date: %s", arrobject2);
                                                            string3 = String.valueOf((long)l2);
                                                        }
                                                        arrobject[0] = string3;
                                                        b2 = p.a.a.d;
                                                        b2.a("Auth0 expiration time = %s", arrobject);
                                                        if (this.getIntent().getBooleanExtra("isUiTest", false)) {
                                                            b2.b("isUiTest!!!!!!!!!", new Object[0]);
                                                            BravoApp.a a2 = BravoApp.k;
                                                            BravoApp.G = Boolean.TRUE;
                                                            String string4 = this.getIntent().getStringExtra("appUrl");
                                                            if (string4 != null && !k.x.c.i.a(string4, "")) {
                                                                b2.b("isUiTest WITH APP URL!!!!!!!!!", new Object[0]);
                                                                b2.a("Getting json from url: %s", new Object[]{string4});
                                                                c0 c02 = e.g.a.p.f.r((String)string4);
                                                                e0.a a3 = new e0.a();
                                                                a3.h(string4);
                                                                m.f f2 = c02.a(a3.b());
                                                                e.g.a.d.z0 z02 = new e.g.a.d.z0(string4);
                                                                ((m.m0.g.e)f2).f((m.g)z02);
                                                            } else {
                                                                JsonApp jsonApp;
                                                                b2.b("isUiTest WITHOUT APP URL!!!!!!!!!", new Object[0]);
                                                                BravoApp.q = jsonApp = e.g.a.p.f.w((int)2131689476);
                                                                a2.f(jsonApp, null);
                                                            }
                                                        }
                                                        int n3 = k.x.c.i.a(string2 = e.g.a.p.f.q(), "menu:tabs") ? 2131427365 : (k.x.c.i.a(string2, "menu:modal") ? 2131427364 : 2131427363);
                                                        this.setContentView(n3);
                                                        this.r = (RelativeLayout)this.findViewById(2131230788);
                                                        this.s = (LottieAnimationView)this.findViewById(2131230821);
                                                        this.t = (ProgressBar)this.findViewById(2131231206);
                                                        this.u = (FrameLayout)this.findViewById(2131230871);
                                                        Object[] arrobject3 = new Object[]{e.g.a.p.g.c()};
                                                        b2.a("BravoActivity created for appId: %s", arrobject3);
                                                        e.g.a.p.j.a();
                                                        JsonApp jsonApp = BravoApp.r;
                                                        Paywall paywall = jsonApp == null || (app = jsonApp.d) == null ? null : app.h;
                                                        boolean bl = paywall != null;
                                                        if (bl) {
                                                            if (e.g.a.p.j.a()) {
                                                                Paywall paywall2;
                                                                App app2;
                                                                List list5;
                                                                Object[] arrobject4 = new Object[2];
                                                                arrobject4[0] = e.g.a.p.f.d();
                                                                JsonApp jsonApp2 = BravoApp.r;
                                                                String string5 = jsonApp2 == null || (app2 = jsonApp2.d) == null || (paywall2 = app2.h) == null || (list5 = paywall2.c) == null ? null : list5.toString();
                                                                arrobject4[1] = string5;
                                                                b2.b("User with paywall. App id: %s, Paid features used: %s", arrobject4);
                                                                AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
                                                                builder.setTitle(2131755110);
                                                                builder.setCancelable(false);
                                                                String string6 = e.g.a.p.g.r();
                                                                if (string6 == null) {
                                                                    string6 = this.getString(2131755108);
                                                                    k.x.c.i.d(string6, "getString(R.string.downgraded_user_message)");
                                                                }
                                                                builder.setMessage((CharSequence)string6);
                                                                builder.setPositiveButton(2131755109, (DialogInterface.OnClickListener)new e.g.a.d.m(this));
                                                                builder.create().show();
                                                            } else {
                                                                String string7 = e.g.a.p.g.r();
                                                                if (string7 == null) {
                                                                    string7 = this.getString(2131755108);
                                                                    k.x.c.i.d(string7, "getString(R.string.downgraded_user_message)");
                                                                }
                                                                Toast.makeText((Context)this, (CharSequence)string7, (int)1).show();
                                                            }
                                                        }
                                                        e.g.a.o.s s2 = e.g.a.o.s.a;
                                                        Intent intent = this.getIntent();
                                                        k.x.c.i.d((Object)intent, "intent");
                                                        k.x.c.i.e((Object)intent, "intent");
                                                        k.x.c.i.e((Object)this, "activity");
                                                        e.f.a.a0.M0((AppCompatActivity)this, (Page)s2.c(intent, false), (int)2131230871);
                                                        k.x.c.i.e((Object)this, "<this>");
                                                        page = e.g.a.p.f.p();
                                                        string = e.g.a.p.f.q();
                                                        int n4 = string.hashCode();
                                                        if (n4 == -1560961390) break block36;
                                                        if (n4 == -1560939335) break block37;
                                                        if (n4 == -1145068586 && string.equals((Object)"menu:slide")) break block38;
                                                        break block39;
                                                    }
                                                    if (string.equals((Object)"menu:tabs")) {
                                                        FrameLayout frameLayout = (FrameLayout)this.findViewById(2131231312);
                                                        frameLayout.setVisibility(0);
                                                        frameLayout.getLayoutParams().height = e.g.a.p.f.t();
                                                        List list6 = page == null ? null : page.g;
                                                        if (list6 != null) {
                                                            List list7 = page.g;
                                                            k.x.c.i.c((Object)list7);
                                                            for (Container container3 : list7) {
                                                                String string8 = page.a;
                                                                k.x.c.i.d((Object)frameLayout, "tabMenu");
                                                                n0.h((Container)container3, (FragmentActivity)this, (Context)this, (String)string8, (FrameLayout)frameLayout, (Boolean)Boolean.FALSE, (float)100.0f);
                                                            }
                                                        }
                                                    }
                                                    break block39;
                                                }
                                                if (!string.equals((Object)"menu:side")) break block39;
                                            }
                                            if ((navigationView = (NavigationView)this.findViewById(2131231266)) == null) break block40;
                                            ViewGroup.LayoutParams layoutParams = navigationView.getLayoutParams();
                                            Page page2 = e.g.a.p.f.p();
                                            if (page2 != null && (list4 = page2.g) != null) break block41;
                                            n2 = 0;
                                            break block42;
                                        }
                                        iterator = list4.iterator();
                                        n2 = 0;
                                        break block43;
                                    }
                                    Object[] arrobject = new Object[]{e.g.a.p.g.c()};
                                    b2.a("slide_menu is null in app %s", arrobject);
                                    break block44;
                                }
                                while (iterator.hasNext()) {
                                    int n5;
                                    Style style = e.g.a.p.g.o((String)((Container)iterator.next()).c, null, (int)2);
                                    Float f3 = style == null ? null : style.i;
                                    if (f3 == null || (n5 = e.f.a.a0.V0((Style)style)) <= n2) continue;
                                    n2 = n5;
                                }
                            }
                            layoutParams.width = n2;
                            DrawerLayout drawerLayout = (DrawerLayout)this.findViewById(2131230930);
                            if (drawerLayout != null) {
                                drawerLayout.setDrawerLockMode(0);
                            }
                            Container container4 = page == null ? null : page.j;
                            if (container4 == null) break block44;
                            Page page3 = e.g.a.p.f.p();
                            Boolean bl = page3 == null || (list2 = page3.g) == null || (container2 = (Container)list2.get(0)) == null || (list3 = container2.j) == null ? null : Boolean.valueOf((boolean)e.f.a.a0.b0((List)list3));
                            if (!k.x.c.i.a(bl, (Object)Boolean.TRUE)) break block45;
                            container = page.j;
                            List list8 = container == null ? null : container.j;
                            if (list8 != null) break block46;
                            if (container == null) break block45;
                            list = e.s.a.a.N2((Object)"display:fullscreen");
                            break block47;
                        }
                        if (container == null) break block45;
                        list = new ArrayList();
                        Container container5 = page.j;
                        List list9 = container5 == null ? null : container5.j;
                        k.x.c.i.c((Object)list9);
                        list.addAll((Collection)list9);
                        list.add((Object)"display:fullscreen");
                    }
                    container.j = list;
                }
                v0.d((View)navigationView, (String)page.a, (Container)page.j, null, (int)4);
            }
            View view = this.findViewById(2131231213);
            k.x.c.i.d((Object)view, "findViewById(R.id.recyclerView)");
            RecyclerView recyclerView = (RecyclerView)view;
            String string = page == null ? null : page.a;
            List list = page == null ? null : page.g;
            e.f.a.a0.b1((RecyclerView)recyclerView, (FragmentActivity)this, (String)string, (List)list, null, null, (boolean)false, (boolean)false, null, (boolean)false, (boolean)false, (boolean)false, (int)2040);
        }
        boolean bl = !e.g.a.p.j.C() && e.g.a.p.j.b() && !u.a.c("shake_toast_displayed") && k.x.c.i.a((Object)BravoApp.G, (Object)Boolean.FALSE);
        if (bl) {
            u.a.g("shake_toast_displayed");
            RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131231187);
            if (relativeLayout != null) {
                Snackbar snackbar = Snackbar.make((View)relativeLayout, (CharSequence)"", (int)0);
                k.x.c.i.d((Object)snackbar, "make(parentLayout, \"\", Snackbar.LENGTH_LONG)");
                int n6 = (int)this.getResources().getDimension(2131100262);
                int n7 = (int)this.getResources().getDimension(2131100260);
                View view = this.getLayoutInflater().inflate(2131427499, null);
                TextView textView = (TextView)view.findViewById(2131231270);
                if (textView != null) {
                    textView.setTypeface(e.g.a.o.k.a.d("01DZ4603S1A99S0MKRX805Z15F"));
                }
                snackbar.getView().setBackgroundColor(ContextCompat.getColor((Context)this, (int)2131034152));
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout)snackbar.getView();
                ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
                Objects.requireNonNull((Object)layoutParams, (String)"null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams)layoutParams;
                layoutParams2.setMargins(n6, 0, n6, n6);
                layoutParams2.height = n7;
                layoutParams2.width = -1;
                snackbarLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
                snackbarLayout.addView(view, 0);
                snackbar.show();
            }
        }
        u u2 = u.a;
        int n8 = Process.myPid();
        k.x.c.i.e("app_process_id", "key");
        SharedPreferences sharedPreferences = u.b;
        sharedPreferences.edit().putInt("app_process_id", n8).apply();
        if (BravoApp.w) {
            e.p.a.d.a.i.r r2 = this.p().b();
            k.x.c.i.d((Object)r2, "appUpdateManager.appUpdateInfo");
            e.g.a.d.v v2 = new e.g.a.d.v(this);
            r2.c(e.p.a.d.a.i.e.a, (e.p.a.d.a.i.c)v2);
        }
        if (e.g.a.p.j.b() || e.g.a.p.g.m() != null) {
            Integer n9;
            String string = k.x.c.i.k(e.g.a.p.f.d(), "app_sessions");
            k.x.c.i.e(string, "key");
            int n10 = u2.d(string);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            int n11 = n10 + 1;
            editor.putInt(string, n11).apply();
            int n12 = e.g.a.p.j.b() ? 5 : ((n9 = e.g.a.p.g.m()) == null ? 3 : n9);
            Object[] arrobject = new Object[]{n11, n12};
            p.a.a.d.a("APP_SESSIONS = %d, ratingAppAlert = %d", arrobject);
            boolean bl2 = n11 > 0 && n11 % n12 == 0;
            if (bl2) {
                e.p.a.d.a.i.r r3;
                Object object = this.getApplicationContext();
                if (object == null) {
                    object = this;
                }
                e.p.a.d.a.g.g g2 = new e.p.a.d.a.g.g(new e.p.a.d.a.g.k(object));
                k.x.c.i.d((Object)g2, "create(this)");
                e.p.a.d.a.g.k k2 = g2.a;
                e.p.a.d.a.e.f f4 = e.p.a.d.a.g.k.a;
                Object[] arrobject5 = new Object[]{k2.c};
                f4.d("requestInAppReview (%s)", arrobject5);
                if (k2.b == null) {
                    f4.b("Play Store app is either not installed or not the official version", new Object[0]);
                    r3 = e.p.a.c.b.a.U0((Exception)new e.p.a.d.a.g.a(-1));
                } else {
                    e.p.a.d.a.i.n n13 = new e.p.a.d.a.i.n();
                    k2.b.b((e.p.a.d.a.e.g)new e.p.a.d.a.g.i(k2, n13, n13), n13);
                    r3 = n13.a;
                }
                k.x.c.i.d((Object)r3, "manager.requestReviewFlow()");
                r3.a((e.p.a.d.a.i.a)new e.g.a.d.e((e.p.a.d.a.g.b)g2, this, n11));
            }
        }
        Class<e.p.d.r.a> class_ = e.p.d.r.a.class;
        synchronized (e.p.d.r.a.class) {
            e.p.d.i i2 = e.p.d.i.c();
            class_ = e.p.d.r.a.class;
            synchronized (e.p.d.r.a.class) {
                i2.a();
                e.p.d.r.a a4 = (e.p.d.r.a)i2.g.a(e.p.d.r.a.class);
                // ** MonitorExit[var128_100] (shouldn't be in output)
                // ** MonitorExit[var128_100] (shouldn't be in output)
                k.x.c.i.b((Object)a4, "FirebaseDynamicLinks.getInstance()");
                a4.a(this.getIntent()).f((Activity)this, (e.p.a.c.k.f)new e.g.a.d.d(this)).d((Activity)this, (e.p.a.c.k.e)e.g.a.d.p.a);
                String string = u2.b("push_arrived_when_app_closed");
                if (e.g.a.j.t0.f((String)string)) {
                    String string9 = k.x.c.i.k("NotificationOpened pushArrivedWhenAppClosed has value = ", string);
                    Object[] arrobject = new Object[]{};
                    p.a.a.d.b(string9, arrobject);
                    ResponseAction responseAction = (ResponseAction)e.g.a.o.r.k.b(string);
                    if (responseAction != null) {
                        BravoActivity.t(this, responseAction, null, null, null, Boolean.TRUE, null, null, 110, null);
                    }
                    u2.a("push_arrived_when_app_closed");
                }
                return;
            }
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onDeleteUserEvent(e.g.a.i.h h2) {
        k.x.c.i.e((Object)h2, "event");
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setMessage(2131755105);
        builder.setPositiveButton((CharSequence)"Ok", (DialogInterface.OnClickListener)new e.g.a.d.l(this));
        builder.setNegativeButton((CharSequence)"Cancel", (DialogInterface.OnClickListener)e.g.a.d.s.k);
        builder.create().show();
    }

    public void onDestroy() {
        super.onDestroy();
        e.g.a.o.s s2 = e.g.a.o.s.a;
        if (e.g.a.o.s.o) {
            e.g.a.o.s.o = false;
        } else if (e.g.a.o.s.p) {
            e.g.a.o.s.p = false;
        } else {
            s2.h();
        }
        e.f.a.a0.o1((AppCompatActivity)this);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onDownloadEvent(e.g.a.i.j j2) {
        k.x.c.i.e((Object)j2, "event");
        if (URLUtil.isValidUrl((String)j2.a)) {
            e.g.a.e.a a2 = e.g.a.e.a.a;
            String string = j2.a;
            k.x.c.i.e(string, "url");
            Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"action_type", (String)"download").putValue("action_data", (Object)string);
            a2.f(false, "Action Started", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026utValue(ACTION_DATA, url)", (String)"Slack", (boolean)false));
            Dexter.withContext((Context)this).withPermission("android.permission.WRITE_EXTERNAL_STORAGE").withListener((PermissionListener)new g(this, j2)).check();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getString(2131755161));
        stringBuilder.append(' ');
        stringBuilder.append(j2.a);
        Toast.makeText((Context)this, (CharSequence)stringBuilder.toString(), (int)0).show();
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onEmailEvent(e.g.a.i.k k2) {
        k.x.c.i.e((Object)k2, "event");
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string = k2.a;
        k.x.c.i.e(string, "email");
        Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"action_type", (String)"email").putValue("action_data", (Object)string);
        a2.f(false, "Action Started", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026Value(ACTION_DATA, email)", (String)"Slack", (boolean)false));
        this.startActivity(new Intent("android.intent.action.SENDTO", Uri.fromParts((String)"mailto", (String)k2.a, null)));
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onFirebaseLogoutEvent(e.g.a.i.o o2) {
        k.x.c.i.e((Object)o2, "logout");
        this.k();
        o o3 = o.a;
        k.x.c.i.e((Object)this, "context");
        FirebaseAuth firebaseAuth = o3.a(this);
        if (firebaseAuth != null) {
            firebaseAuth.b();
        }
        k.x.c.i.e((Object)this, "<this>");
        this.getSupportFragmentManager().popBackStack(null, 1);
        this.m();
        Page page = e.g.a.p.g.g();
        e.g.a.k.f f2 = page == null ? null : r0.a((Page)page, null, (int)1);
        e.f.a.a0.L0((AppCompatActivity)this, (e.g.a.k.f)f2, (int)2131230871);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onFirebaseRegisterEvent(e.g.a.i.p p2) {
        k.x.c.i.e((Object)p2, "event");
        e.f.a.a0.l0((AppCompatActivity)this);
        this.o(p2.a, "register:firebase-email-password");
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onFirebaseVerifyPhoneEvent(e.g.a.i.q q2) {
        k.x.c.i.e((Object)q2, "event");
        int n2 = 1;
        e.g.a.m.h h2 = BravoActivity.D(this, false, n2, null);
        o o2 = o.a;
        String string = q2.a;
        k.x.c.i.e((Object)this, "context");
        k.x.c.i.e((Object)h2, "loadingUI");
        List list = e.g.a.o.q.a((String)string);
        if (list == null) {
            return;
        }
        InputComponent inputComponent = e.g.a.o.q.b((List)list, (String)"component:input-number");
        if (inputComponent == null || (n2 ^ k.d0.g.n((CharSequence)e.f.a.a0.W((InputComponent)inputComponent))) != n2) {
            n2 = 0;
        }
        if (n2 != 0) {
            y y2 = y.l0((String)o.b, (String)e.f.a.a0.W((InputComponent)inputComponent));
            k.x.c.i.d((Object)y2, "getCredential(storedVeri\u2026rificationCode.getText())");
            o2.l(this, y2, h2);
            return;
        }
        BravoActivity.y(this, h2, false, 2, null);
        e.f.a.a0.n1((BravoActivity)this, (int)2131755131, null, (boolean)false, (int)6);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onGoBackEvent(e.g.a.i.r r2) {
        k.x.c.i.e((Object)r2, "event");
        this.onBackPressed();
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onInputFileEvent(e.g.a.i.s s2) {
        k.x.c.i.e((Object)s2, "event");
        k.x.c.i.e((Object)s2, "event");
        l.f = s2;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        this.startActivityForResult(intent, 25);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onInputImageEvent(e.g.a.i.t t2) {
        k.x.c.i.e((Object)t2, "event");
        k.x.c.i.e((Object)t2, "event");
        l.d = t2;
        ImagePicker.Companion.with((Activity)this).setImageProviderInterceptor((k.x.b.l<? super ImageProvider, k.q>)h.k).start(24);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onInputVideoEvent(e.g.a.i.u u2) {
        int n2;
        int n3;
        int n4;
        k.x.c.i.e((Object)u2, "event");
        k.x.c.i.e((Object)u2, "event");
        l.e = u2;
        e.f.a.d0.c c2 = new e.f.a.d0.c();
        c2.k = n3 = 1;
        c2.m = 300;
        c2.l = n3;
        k.x.c.i.e((Object)this, "activity");
        k.x.c.i.e((Object)c2, "mPickerOptions");
        k.x.c.i.e((Object)this, "activity");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.checkSelfPermission("android.permission.CAMERA") != 0) {
            arrayList2.add((Object)"android.permission.CAMERA");
            n4 = this.shouldShowRequestPermissionRationale("android.permission.CAMERA") ? 1 : 0;
        } else {
            n4 = n3;
        }
        if (n4 == 0) {
            arrayList.add((Object)"CAMERA");
        }
        if (this.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            arrayList2.add((Object)"android.permission.READ_EXTERNAL_STORAGE");
            n2 = this.shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE") ? 1 : 0;
        } else {
            n2 = n3;
        }
        if (n2 == 0) {
            arrayList.add((Object)"READ_EXTERNAL_STORAGE");
        }
        if (this.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList2.add((Object)"android.permission.RECORD_AUDIO");
            n3 = this.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") ? 1 : 0;
        }
        if (n3 == 0) {
            arrayList.add((Object)"RECORD_AUDIO");
        }
        if (arrayList2.size() > 0) {
            Object[] arrobject = arrayList2.toArray((Object[])new String[0]);
            Objects.requireNonNull((Object)arrobject, (String)"null cannot be cast to non-null type kotlin.Array<T>");
            this.requestPermissions((String[])arrobject, 9921);
            return;
        }
        Intent intent = new Intent((Context)this, Picker.class);
        intent.putExtra("PICKER_OPTIONS", (Serializable)c2);
        intent.addFlags(65536);
        this.startActivityForResult(intent, 10);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onIntroCloseEvent(e.g.a.i.v v2) {
        e.g.a.o.s.a.h();
        if (!e.g.a.o.s.j) {
            e.g.a.o.s.h = false;
            e.g.a.o.s.p = true;
            Bundle bundle = new Bundle();
            bundle.putBoolean("showIntro", false);
            bundle.putBoolean("showLogin", true);
            Intent intent = new Intent((Context)this, BravoActivity.class);
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onLoginWithProviderEvent(e.g.a.i.w w2) {
        k.x.c.i.e((Object)w2, "event");
        e.f.a.a0.l0((AppCompatActivity)this);
        if (e.g.a.p.j.C()) {
            String string = w2.b;
            k.x.c.i.e(string, "<set-?>");
            BravoApp.F = string;
            this.s(w2.b);
            return;
        }
        this.o(w2.a, w2.b);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onLogoutEvent(x x2) {
        k.x.c.i.e((Object)x2, "logout");
        e.f.a.a0.m0((FragmentActivity)this);
        boolean bl = x2.a;
        int n2 = 1;
        if (bl) {
            e.h.a.a a2 = new e.h.a.a((Context)this);
            e.h.a.c.e.d d2 = new e.h.a.c.e.d(new e.h.a.c.b(a2), (e.h.a.c.e.l)new e.h.a.c.e.k((Context)this, null, 2));
            k.x.c.i.e((Object)a2, "account");
            k.x.c.i.e((Object)a2, "account");
            e.h.a.f.h h2 = new e.h.a.f.h(false, 0, new e.h.a.f.e(null, null), null);
            k.x.c.i.d((Object)h2, "newBuilder().build()");
            String string = this.getString(2131755069);
            k.x.c.i.d(string, "getString(R.string.com_auth0_scheme)");
            k.x.c.i.e(string, "scheme");
            Locale locale = Locale.ROOT;
            k.x.c.i.d((Object)locale, "ROOT");
            String string2 = string.toLowerCase(locale);
            k.x.c.i.d(string2, "(this as java.lang.String).toLowerCase(locale)");
            if (!k.x.c.i.a(string, string2)) {
                Log.w((String)e.h.a.f.t.b, (String)"Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
            }
            i i2 = new i(d2, this);
            k.x.c.i.e((Object)this, "context");
            k.x.c.i.e((Object)i2, "callback");
            e.h.a.f.t.c = null;
            if (h2.a(this.getPackageManager()) == null) {
                n2 = 0;
            }
            if (n2 == 0) {
                i2.a((e.h.a.b)new e.h.a.c.c("a0.browser_not_available", "No compatible Browser application is installed."));
                return;
            }
            String string3 = e.h.a.f.f.a((String)string, (String)this.getApplicationContext().getPackageName(), (String)a2.b());
            k.x.c.i.c(string3);
            e.h.a.f.k k2 = new e.h.a.f.k(a2, (e.h.a.d.a)i2, string3, h2, false);
            e.h.a.f.t.c = k2;
            k.x.c.i.e((Object)this, "context");
            Map map = k2.d;
            map.put((Object)"auth0Client", (Object)k2.b.d.b);
            map.put((Object)"client_id", (Object)k2.b.b);
            m.z z2 = k2.b.c;
            k.x.c.i.c((Object)z2);
            z.a a3 = z2.f();
            a3.a("v2");
            a3.a("logout");
            Uri.Builder builder = Uri.parse((String)a3.d().l).buildUpon();
            for (Map.Entry entry : k2.d.entrySet()) {
                builder.appendQueryParameter((String)entry.getKey(), (String)entry.getValue());
            }
            Uri uri = builder.build();
            Log.d((String)e.h.a.f.k.a, (String)k.x.c.i.k("Using the following Logout URI: ", (Object)uri));
            k.x.c.i.d((Object)uri, "uri");
            e.h.a.f.h h3 = k2.e;
            k.x.c.i.e((Object)this, "context");
            k.x.c.i.e((Object)uri, "authorizeUri");
            k.x.c.i.e((Object)h3, "options");
            Intent intent = new Intent((Context)this, AuthenticationActivity.class);
            intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", (Parcelable)uri);
            intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", (Parcelable)h3);
            intent.addFlags(67108864);
            this.startActivity(intent);
            return;
        }
        if (e.g.a.p.j.C()) {
            this.z();
            return;
        }
        this.k();
        e.g.a.f.b.d d3 = BravoApp.z;
        if (d3 != null) {
            d3.a((AppCompatActivity)this);
        }
        k.x.c.i.e((Object)this, "<this>");
        this.getSupportFragmentManager().popBackStack(null, n2);
        this.m();
        Page page = e.g.a.p.g.g();
        e.g.a.k.f f2 = page == null ? null : r0.a((Page)page, null, (int)n2);
        e.f.a.a0.L0((AppCompatActivity)this, (e.g.a.k.f)f2, (int)2131230871);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onMapsEvent(z z2) {
        String string;
        k.x.c.i.e((Object)z2, "event");
        String string2 = z2.a;
        if (string2 != null && !k.x.c.i.a(string2, "")) {
            string = k.x.c.i.k("geo:0,0?q=", z2.a);
        } else {
            StringBuilder stringBuilder = e.e.a.a.a.t((String)"geo:");
            stringBuilder.append((Object)z2.b);
            stringBuilder.append(',');
            stringBuilder.append((Object)z2.c);
            stringBuilder.append("?z=");
            stringBuilder.append((Object)z2.d);
            string = stringBuilder.toString();
        }
        e.g.a.e.a.a.e(string);
        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)).setPackage("com.google.android.apps.maps"));
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onNavigationEvent(e.g.a.i.a0 a02) {
        k.x.c.i.e((Object)a02, "event");
        e.g.a.o.s.a.f(this, a02);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onNewJsonEvent(e.g.a.i.b0 b02) {
        k.x.c.i.e((Object)b02, "event");
        String string = BravoApp.v;
        if (string == null) {
            string = u.a.b("current_app_url");
        }
        if (string != null && !k.x.c.i.a(string, "")) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("new_json", true);
            Intent intent = new Intent((Context)this, InitActivity.class);
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onOpenAudioEvent(d0 d02) {
        k.x.c.i.e((Object)d02, "event");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse((String)d02.a), "audio/*");
        this.startActivity(intent);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onOpenIntroEvent(e.g.a.i.e0 e02) {
        String string;
        block4 : {
            k.x.c.i.e((Object)e02, "event");
            JsonApp jsonApp = e.g.a.p.f.s();
            if (jsonApp == null) {
                string = null;
            } else {
                Data data;
                k.x.c.i.e((Object)jsonApp, "<this>");
                App app = jsonApp.d;
                List list = app == null || (data = app.e) == null ? null : data.b;
                string = null;
                if (list != null) {
                    Page page;
                    Iterator iterator = app.e.b.iterator();
                    do {
                        boolean bl = iterator.hasNext();
                        string = null;
                        if (!bl) break block4;
                        page = (Page)iterator.next();
                    } while (page.o == null && !r0.g((Page)page, (String)"intro"));
                    string = page.a;
                }
            }
        }
        e.f.a.a0.E0((BravoActivity)this, string, (boolean)false, (boolean)true, null, (int)8);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onOpenQrScannerEvent(f0 f02) {
        k.x.c.i.e((Object)f02, "event");
        if (u.a.c("user_disabled_ask_for_camera_permission") && this.checkCallingOrSelfPermission("android.permission.CAMERA") == -1) {
            Page page = e.g.a.p.g.k((String)"error:noCamera");
            String string = page == null ? null : page.a;
            e.f.a.a0.E0((BravoActivity)this, (String)string, (boolean)false, (boolean)false, null, (int)12);
            return;
        }
        new IntentIntegrator((Activity)this).setPrompt("").setBeepEnabled(false).setOrientationLocked(true).setCaptureActivity(QrScannerActivity.class).initiateScan();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onOpenSelectorEvent(e.g.a.i.g0 var1_1) {
        block24 : {
            block23 : {
                k.x.c.i.e((Object)var1_1, "event");
                var2_2 = new ArrayList();
                var3_3 = new ArrayList();
                var4_4 = new e.g.a.d.q((List)var3_3, var1_1, (List)var2_2);
                var5_5 = new e.i.a.b.a(1);
                var5_5.e = this;
                var5_5.a = var4_4;
                var5_5.l = Typeface.createFromAsset((AssetManager)e.g.a.p.f.a().getAssets(), (String)"fonts/01DZ4603S1A99S0MKRX805Z15F.otf");
                var5_5.b = true;
                var5_5.k = false;
                var5_5.f = this.getString(2131755113);
                var5_5.g = this.getString(2131755112);
                var5_5.h = -16777216;
                var5_5.i = -16777216;
                k.x.c.i.e((Object)this, "<this>");
                var7_6 = e.f.a.a0.u0((BravoActivity)this);
                if (var7_6 == null) ** GOTO lbl-1000
                if (!(var7_6 instanceof e.g.a.k.p)) break block23;
                var36_7 = ((e.g.a.k.p)var7_6).d();
                ** GOTO lbl24
            }
            if (var7_6 instanceof e.g.a.k.h) {
                var36_7 = ((e.g.a.k.h)var7_6).f();
lbl24: // 2 sources:
                var8_8 = (ViewGroup)var36_7;
            } else lbl-1000: // 2 sources:
            {
                var8_8 = null;
            }
            if (var8_8 != null) {
                var5_5.d = var8_8;
            }
            var9_9 = e.g.a.p.g.h((String)var1_1.a);
            var10_10 = var9_9 != null && r0.k((Page)var9_9) == true;
            if (var10_10) {
                var5_5.j = true;
            }
            var11_11 = new e.i.a.d.e(var5_5);
            var12_12 = var1_1.d;
            if (var12_12 == null || (var13_13 = var12_12.I) == null) break block24;
            for (Option var31_17 : var13_13) {
                k.x.c.i.e((Object)var31_17, "<this>");
                var32_15 = var31_17.b;
                if (var32_15 == null) ** GOTO lbl-1000
                if (var32_15 instanceof String) {
                    var33_16 = (String)var32_15;
                } else if (var32_15 instanceof Integer || var32_15 instanceof Float) {
                    var33_16 = var32_15.toString();
                } else if (var32_15 instanceof Object[]) {
                    var33_16 = Arrays.toString((Object[])((Object[])var32_15));
                    k.x.c.i.d(var33_16, "toString(this)");
                } else lbl-1000: // 2 sources:
                {
                    var33_16 = "";
                }
                var2_2.add((Object)var33_16);
                var3_3.add((Object)var31_17.a);
            }
        }
        var15_18 = k.s.i.b0((Iterable)var3_3);
        var16_19 = var11_11.w;
        var16_19.d = var15_18;
        var16_19.e = null;
        var16_19.f = null;
        var16_19.a.setAdapter((e.l.a.a)new e.i.a.a.a(var15_18));
        var16_19.a.setCurrentItem(0);
        var17_20 = var16_19.e;
        if (var17_20 != null) {
            var16_19.b.setAdapter((e.l.a.a)new e.i.a.a.a((List)var17_20.get(0)));
        }
        var18_21 = var16_19.b;
        var18_21.setCurrentItem(var18_21.getCurrentItem());
        var19_22 = var16_19.f;
        if (var19_22 != null) {
            var16_19.c.setAdapter((e.l.a.a)new e.i.a.a.a((List)((List)var19_22.get(0)).get(0)));
        }
        var20_23 = var16_19.c;
        var20_23.setCurrentItem(var20_23.getCurrentItem());
        var16_19.a.setIsOptions(true);
        var16_19.b.setIsOptions(true);
        var16_19.c.setIsOptions(true);
        if (var16_19.e == null) {
            var16_19.b.setVisibility(8);
        } else {
            var16_19.b.setVisibility(0);
        }
        if (var16_19.f == null) {
            var16_19.c.setVisibility(8);
        } else {
            var16_19.c.setVisibility(0);
        }
        var21_24 = new e.i.a.d.f(var16_19);
        var16_19.h = var21_24;
        var16_19.i = new e.i.a.d.g(var16_19);
        var16_19.a.setOnItemSelectedListener((e.l.c.b)var21_24);
        var22_25 = var11_11.w;
        if (var22_25 != null) {
            Objects.requireNonNull((Object)var11_11.o);
            Objects.requireNonNull((Object)var11_11.o);
            Objects.requireNonNull((Object)var11_11.o);
            if (var22_25.d != null) {
                var22_25.a.setCurrentItem(0);
            }
            if ((var29_26 = var22_25.e) != null) {
                var22_25.b.setAdapter((e.l.a.a)new e.i.a.a.a((List)var29_26.get(0)));
                var22_25.b.setCurrentItem(0);
            }
            if ((var30_27 = var22_25.f) != null) {
                var22_25.c.setAdapter((e.l.a.a)new e.i.a.a.a((List)((List)var30_27.get(0)).get(0)));
                var22_25.c.setCurrentItem(0);
            }
        }
        e.f.a.a0.l0((AppCompatActivity)this);
        if (var11_11.o.j) {
            var25_28 = var11_11.t;
            if (var25_28 == null) return;
            var25_28.show();
            return;
        }
        if (var11_11.c()) {
            return;
        }
        var11_11.s = true;
        var23_29 = var11_11.m;
        var11_11.o.d.addView((View)var23_29);
        var11_11.l.startAnimation(var11_11.r);
        var11_11.m.requestFocus();
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onOpenUrlEvent(h0 h02) {
        k.x.c.i.e((Object)h02, "event");
        this.m();
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string = h02.a;
        k.x.c.i.e(string, "url");
        Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"action_type", (String)"url").putValue("action_data", (Object)string);
        a2.f(false, "Action Started", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026utValue(ACTION_DATA, url)", (String)"Slack", (boolean)false));
        this.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse((String)h02.a)));
    }

    public void onPause() {
        FragmentActivity.super.onPause();
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string = a2.d();
        String string2 = UUID.randomUUID().toString();
        k.x.c.i.d(string2, "randomUUID().toString()");
        a2.f(false, "App Closed", a2.c(string, string2), new Options().setIntegration("Slack", false));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onPauseEvent(i0 var1_1) {
        block9 : {
            k.x.c.i.e((Object)var1_1, "event");
            var3_2 = BravoApp.D;
            var4_3 = BravoApp.E;
            var5_4 = var4_3 == null ? null : var4_3.a;
            var6_5 = (List)var3_2.get((Object)var5_4);
            if (var6_5 == null) ** GOTO lbl-1000
            for (Object var8_7 : var6_5) {
                if (!k.x.c.i.a(((e.g.a.m.a)var8_7).c, "action:play")) continue;
                break block9;
            }
            var8_7 = null;
        }
        var9_8 = (e.g.a.m.a)var8_7;
        if (var9_8 == null) lbl-1000: // 2 sources:
        {
            var10_9 = null;
        } else {
            var10_9 = var9_8.d;
        }
        var12_10 = BravoApp.D;
        var13_11 = BravoApp.E;
        var14_12 = var13_11 == null ? null : var13_11.a;
        var15_13 = (List)var12_10.get((Object)var14_12);
        if (var15_13 == null) {
            var16_14 = null;
        } else {
            block10 : {
                for (Object var21_16 : var15_13) {
                    if (!k.x.c.i.a(((e.g.a.m.a)var21_16).c, "action:pause")) continue;
                    break block10;
                }
                var21_16 = null;
            }
            var22_17 = (e.g.a.m.a)var21_16;
            var16_14 = var22_17 == null ? null : var22_17.d;
        }
        var18_18 = BravoApp.E;
        if (var18_18 != null && (var19_19 = var18_18.c) != null) {
            var19_19.pause();
        }
        if (var10_9 != null) {
            v0.p((View)var10_9);
        }
        if (var16_14 == null) {
            return;
        }
        v0.g((View)var16_14);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onPdfEvent(j0 j02) {
        k.x.c.i.e((Object)j02, "event");
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string = j02.a;
        k.x.c.i.e(string, "url");
        Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"action_type", (String)"pdf").putValue("action_data", (Object)string);
        a2.f(false, "Action Started", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026utValue(ACTION_DATA, url)", (String)"Slack", (boolean)false));
        this.startActivity(new Intent("android.intent.action.VIEW").setDataAndType(Uri.parse((String)j02.a), "application/pdf"));
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onPhoneEvent(k0 k02) {
        k.x.c.i.e((Object)k02, "event");
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string = k02.a;
        k.x.c.i.e(string, "phone");
        Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"action_type", (String)"phone_call").putValue("action_data", (Object)string);
        a2.f(false, "Action Started", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026Value(ACTION_DATA, phone)", (String)"Slack", (boolean)false));
        this.startActivity(new Intent("android.intent.action.DIAL").setData(Uri.parse((String)k.x.c.i.k("tel:", k02.a))));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onPlayEvent(l0 var1_1) {
        block21 : {
            k.x.c.i.e((Object)var1_1, "event");
            var2_2 = new Object[]{var1_1.b, var1_1.a};
            p.a.a.d.a("PlayEvent with url: %s and containerId: %s", var2_2);
            var4_3 = BravoApp.E;
            if (var4_3 != null && k.x.c.i.a(var4_3.a, var1_1.b)) {
                var41_4 = BravoApp.E;
                if (var41_4 != null) {
                    var42_5 = new Handler(Looper.getMainLooper());
                    k.x.c.i.e((Object)var42_5, "<set-?>");
                    var41_4.d = var42_5;
                }
                this.n(var1_1);
                return;
            }
            var5_6 = BravoApp.E;
            var6_7 = var5_6 == null ? null : var5_6.a;
            if (!k.x.c.i.a(var6_7, var1_1.b)) {
                var22_8 = BravoApp.E;
                if (var22_8 != null && (var23_9 = var22_8.c) != null) {
                    var23_9.stop();
                }
                var24_10 = BravoApp.D;
                var25_11 = BravoApp.E;
                var26_12 = var25_11 == null ? null : var25_11.a;
                var27_13 = (List)var24_10.get((Object)var26_12);
                if (var27_13 != null) {
                    block19 : {
                        for (Object var29_15 : var27_13) {
                            if (!k.x.c.i.a(((e.g.a.m.a)var29_15).c, "action:pause")) continue;
                            break block19;
                        }
                        var29_15 = null;
                    }
                    var30_16 = (e.g.a.m.a)var29_15;
                    if (var30_16 != null && (var31_17 = var30_16.d) != null) {
                        v0.g((View)var31_17);
                    }
                }
                var33_18 = BravoApp.D;
                var34_19 = BravoApp.E;
                var35_20 = var34_19 == null ? null : var34_19.a;
                var36_21 = (List)var33_18.get((Object)var35_20);
                if (var36_21 != null) {
                    block20 : {
                        for (Object var38_23 : var36_21) {
                            if (!k.x.c.i.a(((e.g.a.m.a)var38_23).c, "action:play")) continue;
                            break block20;
                        }
                        var38_23 = null;
                    }
                    var39_24 = (e.g.a.m.a)var38_23;
                    if (var39_24 != null && (var40_25 = var39_24.d) != null) {
                        v0.p((View)var40_25);
                    }
                }
            }
            var7_26 = new MediaPlayer();
            var7_26.setDataSource(var1_1.b);
            var9_27 = (List)BravoApp.D.get((Object)var1_1.b);
            if (var9_27 == null) ** GOTO lbl-1000
            for (Object var11_29 : var9_27) {
                if (!k.x.c.i.a(((e.g.a.m.a)var11_29).c, "audio:loading")) continue;
                break block21;
            }
            var11_29 = null;
        }
        var12_30 = (e.g.a.m.a)var11_29;
        if (var12_30 == null) lbl-1000: // 2 sources:
        {
            var13_31 = null;
        } else {
            var13_31 = var12_30.d;
        }
        if (var13_31 != null) {
            v0.p(var13_31);
        }
        var15_32 = (List)BravoApp.D.get((Object)var1_1.b);
        if (var15_32 == null) {
            var16_33 = null;
        } else {
            block22 : {
                for (Object var20_35 : var15_32) {
                    if (!k.x.c.i.a(((e.g.a.m.a)var20_35).c, "action:play")) continue;
                    break block22;
                }
                var20_35 = null;
            }
            var21_36 = (e.g.a.m.a)var20_35;
            var16_33 = null;
            if (var21_36 != null) {
                var16_33 = var21_36.d;
            }
        }
        var17_37 = var16_33;
        if (var17_37 != null) {
            var17_37.setClickable(false);
        }
        var7_26.setOnCompletionListener((MediaPlayer.OnCompletionListener)new e.g.a.d.w(var17_37, var1_1));
        var7_26.setOnErrorListener((MediaPlayer.OnErrorListener)new b0(var13_31));
        var7_26.prepareAsync();
        var18_38 = new e0(var13_31, var17_37, var1_1, var7_26, this);
        var7_26.setOnPreparedListener((MediaPlayer.OnPreparedListener)var18_38);
    }

    /*
     * Enabled aggressive block sorting
     */
    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onPreviewAppEvent(m0 m02) {
        k.x.c.i.e((Object)m02, "event");
        String string = m02.a;
        boolean bl = true;
        if (string == null || k.d0.g.c((CharSequence)string, (CharSequence)"https", (boolean)false, (int)2) != bl) {
            bl = false;
        }
        String string2 = bl ? m02.a : k.x.c.i.k("https://apps-service.bravostudio.app/devices/apps/", m02.a);
        e.f.a.a0.w0((BravoActivity)this, (String)string2, (boolean)false, (int)2);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onPushDialogEvent(e.g.a.i.n0 n02) {
        k.x.c.i.e((Object)n02, "event");
        if (!e.g.a.o.s.i && !e.g.a.o.s.j) {
            e.g.a.p.f.z((AppCompatActivity)this);
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onRemoteActionEvent(o0 o02) {
        String string;
        Fragment fragment;
        k.x.c.i.e((Object)o02, "event");
        Page page = e.g.a.p.g.h((String)o02.a);
        boolean bl = true;
        if (page == null || r0.k((Page)page) != bl) {
            bl = false;
        }
        if (bl && (fragment = e.f.a.a0.o((FragmentActivity)this, (String)o02.a)) != null && fragment instanceof AppCompatDialogFragment) {
            ((AppCompatDialogFragment)fragment).dismiss();
        }
        if ((string = o02.c) != null && !k.x.c.i.a(string, "")) {
            AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
            builder.setMessage((CharSequence)o02.c);
            builder.setPositiveButton((CharSequence)this.getString(2131755045), (DialogInterface.OnClickListener)new e.g.a.d.k(this, o02));
            builder.setNegativeButton((CharSequence)this.getString(2131755037), (DialogInterface.OnClickListener)e.g.a.d.f.k);
            builder.create().show();
            return;
        }
        this.G(o02, false);
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        boolean bl;
        k.x.c.i.e(arrstring, "permissions");
        k.x.c.i.e(arrn, "grantResults");
        FragmentActivity.super.onRequestPermissionsResult(n2, arrstring, arrn);
        if (n2 == 1 && (bl = arrn.length == 0) ^ true && arrn[0] == 0) {
            o.b.a.c.b().g((Object)new e.g.a.i.e());
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onResetPasswordEvent(p0 p02) {
        k.x.c.i.e((Object)p02, "event");
        e.f.a.a0.l0((AppCompatActivity)this);
        this.o(p02.a, "reset-password");
    }

    public void onResume() {
        FragmentActivity.super.onResume();
        e.g.a.e.a a2 = e.g.a.e.a.a;
        boolean bl = k.x.c.i.a("https://apps-service.bravostudio.app/devices/apps/", "https://apps-service.bravostudio.app/devices/apps/");
        String string = a2.d();
        String string2 = UUID.randomUUID().toString();
        k.x.c.i.d(string2, "randomUUID().toString()");
        a2.f(bl, "App Opened", a2.c(string, string2), new Options().setIntegration("Slack", false));
        if (e.g.a.p.j.b() && e.g.a.p.j.C() || e.g.a.p.j.a()) {
            e.s.a.a.H2((l.a.b0)LifecycleOwnerKt.getLifecycleScope((LifecycleOwner)this), null, null, (k.x.b.p)new e.g.a.d.v0(this, null), (int)3, null);
        }
        if (BravoApp.w) {
            e.p.a.d.a.i.r r2 = this.p().b();
            e.g.a.d.c c2 = new e.g.a.d.c(this);
            Objects.requireNonNull((Object)r2);
            r2.c(e.p.a.d.a.i.e.a, (e.p.a.d.a.i.c)c2);
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onScannedOrEmulatorAppListClicked(q0 q02) {
        k.x.c.i.e((Object)q02, "event");
        String string = q02.a;
        if (string == null) {
            return;
        }
        e.g.a.e.a a2 = e.g.a.e.a.a;
        k.x.c.i.e(string, "url");
        String string2 = a2.d();
        String string3 = UUID.randomUUID().toString();
        k.x.c.i.d(string3, "randomUUID().toString()");
        Properties properties = a2.c(string2, string3).putValue("url", (Object)string);
        k.x.c.i.d((Object)properties, "baseEvent(getAppId(), ja\u2026      .putValue(URL, url)");
        a2.f(false, "Scanned App Loaded", properties, new Options().setIntegration("Slack", false));
        e.f.a.a0.w0((BravoActivity)this, (String)string, (boolean)false, (int)2);
        o.b.a.c.b().g((Object)new e.g.a.i.f());
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onShareBravoUrlEvent(e.g.a.i.r0 r02) {
        Page page;
        k.q q2;
        String string;
        k.x.c.i.e((Object)r02, "event");
        e.g.a.k.l l2 = e.f.a.a0.I((BravoActivity)this);
        if (l2 == null || (page = l2.k) == null || (string = page.D) == null) {
            q2 = null;
        } else {
            this.onShareEvent(new s0(string));
            q2 = k.q.a;
        }
        if (q2 == null) {
            Toast.makeText((Context)this, (CharSequence)this.getString(2131755225), (int)0).show();
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onShareEvent(s0 s02) {
        k.x.c.i.e((Object)s02, "event");
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string = s02.a;
        k.x.c.i.e(string, "url");
        Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"action_type", (String)"share").putValue("action_data", (Object)string);
        a2.f(false, "Action Started", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026utValue(ACTION_DATA, url)", (String)"Slack", (boolean)false));
        this.startActivity(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", s02.a).setType("text/plain"));
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onShowEmulatorAppListEvent(t0 t02) {
        k.x.c.i.e((Object)t02, "event");
        k.x.c.i.e((Object)this, "<this>");
        this.startActivity(new Intent((Context)this, DebugAppsActivity.class));
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onShowNetworkLogsEvent(u0 u02) {
        k.x.c.i.e((Object)u02, "event");
        Dispatcher.start((Context)this, 1);
    }

    public void onStart() {
        super.onStart();
        e.f.a.a0.J0((AppCompatActivity)this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onStripeCheckoutEvent(w0 var1_1) {
        block44 : {
            block42 : {
                block41 : {
                    block40 : {
                        block39 : {
                            block38 : {
                                block37 : {
                                    block43 : {
                                        block35 : {
                                            k.x.c.i.e((Object)var1_1, "event");
                                            k.x.c.i.e((Object)this, "activity");
                                            k.x.c.i.e((Object)var1_1, "event");
                                            var2_2 = e.g.a.p.g.h((String)var1_1.a);
                                            var3_3 = var2_2 != null && r0.k((Page)var2_2) == true;
                                            if (var3_3 && (var84_4 = e.f.a.a0.o((FragmentActivity)this, (String)var1_1.a)) != null && var84_4 instanceof AppCompatDialogFragment) {
                                                ((AppCompatDialogFragment)var84_4).dismiss();
                                            }
                                            if ((var5_5 = e.g.a.o.q.a((String)var1_1.a)) == null) {
                                                return;
                                            }
                                            for (Object var7_7 : var5_5) {
                                                if (!k.x.c.i.a(e.f.a.a0.g1((InputComponent)((InputComponent)var7_7)), "amount")) continue;
                                                break block35;
                                            }
                                            var7_7 = null;
                                        }
                                        var8_8 = (InputComponent)var7_7;
                                        if (var8_8 != null) {
                                            k.x.c.i.e((Object)var8_8, "<this>");
                                            try {
                                                var83_9 = e.f.a.a0.z((InputComponent)var8_8);
                                                if (var83_9 != null) {
                                                    var11_10 = Float.valueOf((float)Float.parseFloat((String)var83_9));
                                                }
                                                ** break block36
                                            }
                                            catch (Exception var9_11) {
                                                var10_12 = new Object[]{var9_11.getLocalizedMessage()};
                                                p.a.a.d.b("Exception parsing Stripe amount: %s", var10_12);
                                                var11_10 = Float.valueOf((float)-1.0f);
                                            }
                                        } else lbl-1000: // 2 sources:
                                        {
                                            
                                            var11_10 = null;
                                        }
                                        if (var11_10 != null) break block43;
                                        var80_13 = var1_1.c;
                                        if (var80_13 == null) ** GOTO lbl-1000
                                        k.x.c.i.e((Object)var80_13, "<this>");
                                        var81_14 = var80_13.a;
                                        if (var81_14 == null || (var82_15 = var81_14.b) == null) lbl-1000: // 2 sources:
                                        {
                                            var11_10 = null;
                                        } else {
                                            var11_10 = var82_15.D;
                                        }
                                    }
                                    var12_16 = var11_10;
                                    for (Object var14_18 : var5_5) {
                                        if (!k.x.c.i.a(e.f.a.a0.g1((InputComponent)((InputComponent)var14_18)), "currency")) continue;
                                        break block37;
                                    }
                                    var14_18 = null;
                                }
                                var15_19 = (InputComponent)var14_18;
                                if (var15_19 == null) {
                                    var16_20 = null;
                                } else {
                                    var16_21 = e.f.a.a0.z((InputComponent)var15_19);
                                }
                                if (var16_22 != null) ** GOTO lbl63
                                var77_26 = var1_1.c;
                                if (var77_26 == null) {
                                    var17_27 = null;
                                } else {
                                    k.x.c.i.e((Object)var77_26, "<this>");
                                    var78_28 = var77_26.a;
                                    if (var78_28 == null || (var79_29 = var78_28.b) == null) {
                                        var16_23 = null;
                                    } else {
                                        var16_24 = var79_29.E;
                                    }
lbl63: // 3 sources:
                                    var17_27 = var16_25;
                                }
                                for (Object var19_31 : var5_5) {
                                    if (!k.x.c.i.a(e.f.a.a0.g1((InputComponent)((InputComponent)var19_31)), "customerEmail")) continue;
                                    break block38;
                                }
                                var19_31 = null;
                            }
                            var20_32 = (InputComponent)var19_31;
                            var21_33 = var20_32 == null ? null : e.f.a.a0.z((InputComponent)var20_32);
                            if (var21_33 != null) ** GOTO lbl84
                            var74_34 = e.f.a.a0.f1((String)"bravo_email");
                            if (var74_34 == null) {
                                var75_35 = false;
                            } else {
                                var76_36 = e.g.a.j.t0.l((String)var74_34);
                                var75_35 = false;
                                if (var76_36) {
                                    var75_35 = true;
                                }
                            }
                            if (!var75_35) {
                                var22_37 = null;
                            } else {
                                var21_33 = e.f.a.a0.f1((String)"bravo_email");
lbl84: // 2 sources:
                                var22_37 = var21_33;
                            }
                            for (Object var24_39 : var5_5) {
                                if (!k.x.c.i.a(e.f.a.a0.g1((InputComponent)((InputComponent)var24_39)), "description")) continue;
                                break block39;
                            }
                            var24_39 = null;
                        }
                        var25_40 = (InputComponent)var24_39;
                        var26_41 = var25_40 == null ? null : e.f.a.a0.z((InputComponent)var25_40);
                        var27_42 = var26_41;
                        for (Object var29_44 : var5_5) {
                            if (!k.x.c.i.a(e.f.a.a0.g1((InputComponent)((InputComponent)var29_44)), "customerName")) continue;
                            break block40;
                        }
                        var29_44 = null;
                    }
                    var30_45 = (InputComponent)var29_44;
                    var31_46 = var30_45 == null ? null : e.f.a.a0.z((InputComponent)var30_45);
                    var32_47 = var31_46;
                    for (Object var34_49 : var5_5) {
                        if (!k.x.c.i.a(e.f.a.a0.g1((InputComponent)((InputComponent)var34_49)), "customerPhone")) continue;
                        break block41;
                    }
                    var34_49 = null;
                }
                var35_50 = (InputComponent)var34_49;
                var36_51 = var35_50 == null ? null : e.f.a.a0.z((InputComponent)var35_50);
                var37_52 = var36_51;
                var38_53 = new HashMap();
                var39_54 = var5_5.iterator();
                do {
                    var40_55 = var39_54.hasNext();
                    var41_56 = "";
                    if (!var40_55) break;
                    var65_57 = (InputComponent)var39_54.next();
                    var66_58 = e.f.a.a0.h1((InputComponent)var65_57);
                    var67_59 = var66_58 == null ? false : k.x.c.i.a((Object)var66_58.b, (Object)Boolean.TRUE);
                    if (!var67_59 || (var69_61 = (var68_60 = e.f.a.a0.h1((InputComponent)var65_57)) == null ? null : var68_60.a) == null) continue;
                    var70_62 = e.f.a.a0.h1((InputComponent)var65_57);
                    var71_63 = var70_62 == null ? null : var70_62.a;
                    k.x.c.i.c(var71_63);
                    var72_64 = e.f.a.a0.z((InputComponent)var65_57);
                    if (var72_64 != null) {
                        var41_56 = var72_64;
                    }
                    var38_53.put((Object)var71_63, (Object)var41_56);
                } while (true);
                var42_65 = e.f.a.a0.v();
                var43_66 = var42_65 != null && e.g.a.j.t0.l((String)var42_65) == true;
                if (var43_66) {
                    var38_53.put((Object)"user.id", (Object)var42_65);
                }
                if ((var45_67 = e.g.a.o.q.g((List)var5_5)) != null) {
                    Toast.makeText((Context)this, (CharSequence)var45_67, (int)1).show();
                    return;
                }
                if (var12_16 == null) {
                    e.f.a.a0.j1((BravoActivity)this, (int)2131755358, null, (boolean)false, (int)6);
                    return;
                }
                if (var17_27 == null || k.x.c.i.a(var17_27, var41_56)) break block44;
                var46_68 = new StripePaymentIntent(var12_16, var17_27, var27_42, var32_47, var22_37, var37_52, (Map)var38_53);
                var47_69 = e.g.a.p.g.h((String)var1_1.a);
                if (var47_69 == null || (var48_70 = var47_69.g) == null) ** GOTO lbl-1000
                for (Object var50_72 : var48_70) {
                    if (!k.x.c.i.a(((Container)var50_72).a, var1_1.b)) continue;
                    break block42;
                }
                var50_72 = null;
            }
            var51_73 = (Container)var50_72;
            if (var51_73 == null) lbl-1000: // 2 sources:
            {
                var52_74 = null;
            } else {
                var52_74 = var51_73.q;
            }
            var53_75 = var52_74 == null ? null : var52_74.getCardParams();
            if (var53_75 != null) {
                var55_76 = e.g.a.o.r.m.e((Object)var46_68);
                k.x.c.i.d(var55_76, "Moshify.stripePaymentInt\u2026Json(stripePaymentIntent)");
                var56_77 = e.g.a.p.i.n((String)var55_76);
                var57_78 = e.g.a.p.i.g(null, (int)1);
                k.x.c.i.e("/stripe/payment_intent", "endpoint");
                var57_78.h(k.x.c.i.k(e.g.a.p.i.a(), "/stripe/payment_intent"));
                var57_78.e(var56_77);
                var60_79 = var57_78.b();
                var61_80 = new WeakReference((Object)this);
                w.b = BravoActivity.D(this, false, 1, null);
                var62_81 = BravoApp.k.d().a(var60_79);
                var63_82 = new v(var61_80, this, var52_74);
                ((m.m0.g.e)var62_81).f((m.g)var63_82);
                return;
            }
            e.f.a.a0.j1((BravoActivity)this, (int)2131755357, null, (boolean)false, (int)6);
            return;
        }
        e.f.a.a0.j1((BravoActivity)this, (int)2131755356, null, (boolean)false, (int)6);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onSubmitEvent(x0 x02) {
        k.x.c.i.e((Object)x02, "event");
        e.f.a.a0.l0((AppCompatActivity)this);
        e.g.a.p.g.h((String)x02.a);
        l.a.d(this, x02.a, Boolean.FALSE, null);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onTokenExpiredEvent(a1 a12) {
        k.x.c.i.e((Object)a12, "event");
        this.s(BravoApp.F);
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onTripleTapEvent(b1 b12) {
        k.x.c.i.e((Object)b12, "event");
        o.b.a.c.b().g((Object)new f0());
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onUnlinkEvent(c1 c12) {
        k.x.c.i.e((Object)c12, "event");
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string = a2.d();
        String string2 = UUID.randomUUID().toString();
        k.x.c.i.d(string2, "randomUUID().toString()");
        Properties properties = a2.c(string, string2).putValue("action_type", (Object)"unlink");
        k.x.c.i.d((Object)properties, "baseEvent(getAppId(), ja\u2026alue(ACTION_TYPE, UNLINK)");
        a2.f(false, "Action Started", properties, new Options().setIntegration("Slack", false));
        int n2 = 1 + u.a.d("unlinks");
        k.x.c.i.e("unlinks", "key");
        u.b.edit().putInt("unlinks", n2).apply();
        this.k();
        l.b.clear();
        l.c.clear();
        l.d = null;
        l.e = null;
        l.f = null;
        e.g.a.o.q.b.clear();
        e.g.a.o.q.c.clear();
        BravoApp.a a3 = BravoApp.k;
        e.g.a.f.b.d d2 = BravoApp.z;
        if (d2 != null) {
            d2.a((AppCompatActivity)this);
        }
        a3.a();
        k.x.c.i.e((Object)this, "<this>");
        e.g.a.p.f.f();
        Intent intent = new Intent((Context)this, InitActivity.class);
        intent.putExtra("unlink", true);
        this.startActivity(intent);
        this.finish();
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onUpdateEvent(d1 d12) {
        k.x.c.i.e((Object)d12, "event");
        if (!e.g.a.p.j.C()) {
            String string = BravoApp.v;
            if (string == null) {
                string = u.a.b("current_app_url");
            }
            if (string != null && !k.x.c.i.a(string, "")) {
                e.g.a.e.a a2 = e.g.a.e.a.a;
                boolean bl = d12.a;
                k.x.c.i.e(string, "url");
                String string2 = bl ? "live_push" : "manual";
                Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"url", (String)string).putValue("type", (Object)string2);
                a2.f(false, "App Updated", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026(UPDATE_TYPE, updateType)", (String)"Slack", (boolean)false));
                Object[] arrobject = new Object[]{string};
                p.a.a.d.a("Update event received: %s", arrobject);
                e.g.a.p.f.f();
                e.f.a.a0.w0((BravoActivity)this, (String)string, (boolean)false, (int)2);
                return;
            }
        } else {
            Object[] arrobject = new Object[]{};
            p.a.a.d.a("Silent PUSH Update received, but previewer is loaded, so ignoring.", arrobject);
        }
    }

    @o.b.a.m(threadMode=ThreadMode.MAIN)
    public final void onVideoEvent(e1 e12) {
        Intent intent;
        k.x.c.i.e((Object)e12, "event");
        e.g.a.e.a a2 = e.g.a.e.a.a;
        String string = e12.a;
        k.x.c.i.e(string, "url");
        Properties properties = e.e.a.a.a.I((String)"randomUUID().toString()", (e.g.a.e.a)a2, (String)a2.d(), (String)"action_type", (String)"video").putValue("action_data", (Object)string);
        a2.f(false, "Action Started", properties, e.e.a.a.a.H((Properties)properties, (String)"baseEvent(getAppId(), ja\u2026utValue(ACTION_DATA, url)", (String)"Slack", (boolean)false));
        String string2 = e12.a;
        k.x.c.i.e(string2, "<this>");
        if (k.d0.g.a((CharSequence)string2, (CharSequence)"youtu", (boolean)true)) {
            String string3;
            Intent intent2 = new Intent((Context)this, YoutubeActivity.class);
            String string4 = e12.a;
            k.x.c.i.e(string4, "<this>");
            Matcher matcher = Pattern.compile((String)"(?<=youtu.be/|watch\\?v=|/videos/|embed\\/)[^#\\&\\?]*").matcher((CharSequence)string4);
            if (matcher.find()) {
                string3 = matcher.group();
                k.x.c.i.d(string3, "{\n        matcher.group()\n    }");
            } else {
                string3 = "";
            }
            intent = intent2.putExtra("video_id", string3);
        } else {
            intent = new Intent("android.intent.action.VIEW").setDataAndType(Uri.parse((String)e12.a), "video/*");
        }
        this.startActivity(intent);
    }

    public final e.p.a.d.a.a.b p() {
        return (e.p.a.d.a.a.b)this.v.getValue();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void r() {
        var1_1 = e.f.a.a0.I((BravoActivity)this);
        if (var1_1 == null || (var2_2 = var1_1.k) == null) ** GOTO lbl-1000
        k.x.c.i.e((Object)var2_2, "<this>");
        var3_3 = var2_2.g;
        if (var3_3 == null) {
            var4_4 = null;
        } else {
            block19 : {
                for (Object var29_9 : var3_3) {
                    var30_10 = ((Container)var29_9).f;
                    if (var30_10 == null) {
                        var31_11 = null;
                    } else {
                        block18 : {
                            for (Object var34_8 : var30_10) {
                                if (!k.x.c.i.a(((Component)var34_8).b, "component:web-view")) continue;
                                break block18;
                            }
                            var34_8 = null;
                        }
                        var31_11 = (Component)var34_8;
                    }
                    if (!(var32_6 = var31_11 != null)) continue;
                    break block19;
                }
                var29_9 = null;
            }
            var4_4 = (Container)var29_9;
        }
        var5_12 = var4_4 != null;
        if (var5_12) {
            var6_13 = true;
        } else lbl-1000: // 2 sources:
        {
            var6_13 = false;
        }
        var7_14 = false;
        if (var6_13) {
            block20 : {
                for (Object var26_16 : e.g.a.o.j.c) {
                    if (!((WebView)var26_16).canGoBack()) continue;
                    break block20;
                }
                var26_16 = null;
            }
            var27_17 = var26_16 != null;
            var7_14 = false;
            if (var27_17) {
                var7_14 = true;
            }
        }
        if (e.g.a.o.s.c <= 1 && !var7_14) {
            BravoApp.k.a();
            this.finish();
            return;
        }
        if (var7_14) {
            var22_18 = e.g.a.o.j.c.iterator();
            while (var22_18.hasNext() != false) {
                var23_19 = (WebView)var22_18.next();
                if (!var23_19.canGoBack()) continue;
                var23_19.goBack();
            }
            return;
        }
        e.g.a.o.s.g = true;
        e.g.a.o.s.n = true;
        e.g.a.o.s.c = -1 + e.g.a.o.s.c;
        var9_20 = e.g.a.o.s.d;
        var9_20.remove(-1 + var9_20.size());
        var11_21 = (true ^ e.g.a.o.s.d.isEmpty()) != false ? (String)k.s.i.C((List)e.g.a.o.s.d) : null;
        var12_22 = e.g.a.p.g.h((String)var11_21);
        var13_23 = var12_22 == null ? null : r0.b((Page)var12_22);
        if (var13_23 != null && r0.o((Page)var12_22)) {
            this.A();
        }
        ComponentActivity.super.onBackPressed();
        k.x.c.i.e((Object)this, "<this>");
        var14_24 = this.getSupportFragmentManager().getFragments();
        k.x.c.i.d((Object)var14_24, "supportFragmentManager.fragments");
        var15_25 = true ^ var14_24.isEmpty();
        var16_26 = "";
        if (var15_25) {
            var18_27 = this.getSupportFragmentManager().getFragments();
            k.x.c.i.d((Object)var18_27, "supportFragmentManager.fragments");
            var19_28 = (Fragment)k.s.i.C((List)var18_27);
            if (var19_28 != null && (var20_29 = e.f.a.a0.p0((Fragment)var19_28) != false ? var19_28.getTag() : var16_26) != null) {
                var16_26 = var20_29;
            }
        }
        k.x.c.i.e(var16_26, "pageId");
        var17_30 = e.g.a.p.f.l((String)var16_26);
        if (var17_30 == null) {
            return;
        }
        e.g.a.p.f.x((Component)var17_30);
    }

    public final void s(String string) {
        String string2;
        e.h.a.a a2 = new e.h.a.a((Context)this);
        e.h.a.c.e.j j2 = new e.h.a.c.e.j((Context)this, new e.h.a.c.b(a2), (e.h.a.c.e.l)new e.h.a.c.e.k((Context)this, null, 2));
        boolean bl = true;
        this.B(bl, false);
        if (j2.d(0L) && !u.a.c(e.f.a.a0.s0((String)"after_logout"))) {
            e e2 = new e(this, j2);
            k.x.c.i.e((Object)e2, "callback");
            k.x.c.i.e((Object)e2, "callback");
            s s2 = s.k;
            k.x.c.i.e((Object)s2, "parameters");
            k.x.c.i.e((Object)e2, "callback");
            if (!j2.d((long)0)) {
                e2.a((e.h.a.b)new e.h.a.c.e.e("No Credentials were previously set.", null));
                return;
            }
            Executor executor = j2.g;
            e.h.a.c.e.a a3 = new e.h.a.c.e.a(j2, (e.h.a.d.a)e2, 0, null, (Map)s2);
            executor.execute((Runnable)a3);
            return;
        }
        k.x.c.i.e((Object)a2, "account");
        k.x.c.i.e((Object)a2, "account");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        k.x.c.i.d((Object)new e.h.a.f.h(false, 0, new e.h.a.f.e(null, null), null), "newBuilder().build()");
        String string3 = this.getString(2131755069);
        k.x.c.i.d(string3, "getString(R.string.com_auth0_scheme)");
        k.x.c.i.e(string3, "scheme");
        Locale locale = Locale.ROOT;
        k.x.c.i.d((Object)locale, "ROOT");
        String string4 = string3.toLowerCase(locale);
        k.x.c.i.d(string4, "(this as java.lang.String).toLowerCase(locale)");
        if (!k.x.c.i.a(string3, string4)) {
            Log.w((String)e.h.a.f.t.b, (String)"Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
        }
        k.x.c.i.e("openid profile offline_access", "scope");
        linkedHashMap.put((Object)"scope", (Object)"openid profile offline_access");
        Object[] arrobject = new Object[bl];
        arrobject[0] = e.g.a.p.f.a().getString(2131755068);
        String string5 = String.format((String)"https://%s/api/v2/", (Object[])Arrays.copyOf((Object[])arrobject, (int)bl));
        k.x.c.i.d(string5, "format(format, *args)");
        k.x.c.i.e(string5, "audience");
        linkedHashMap.put((Object)"audience", (Object)string5);
        e.h.a.f.h h2 = new e.h.a.f.h(bl, 2131034151, new e.h.a.f.e(null, null), null);
        k.x.c.i.d((Object)h2, "newBuilder()\n           \u2026                 .build()");
        k.x.c.i.e((Object)h2, "options");
        if (!k.x.c.i.a(string, "passwordless")) {
            k.x.c.i.e(string, "connectionName");
            linkedHashMap.put((Object)"connection", (Object)string);
        }
        if (u.a.c(e.f.a.a0.s0((String)"after_logout"))) {
            Map map = e.g.a.g.b.b;
            k.x.c.i.e((Object)map, "parameters");
            for (Map.Entry entry : map.entrySet()) {
                String string6 = (String)entry.getKey();
                Object object = entry.getValue();
                if (object == null) continue;
                linkedHashMap.put((Object)string6, (Object)object.toString());
            }
            e.f.a.a0.g((String[])new String[]{"after_logout"});
        }
        f f2 = new f(this, j2);
        k.x.c.i.e((Object)this, "context");
        k.x.c.i.e((Object)f2, "callback");
        e.h.a.f.t.c = null;
        if (h2.a(this.getPackageManager()) == null) {
            bl = false;
        }
        if (!bl) {
            f2.a((e.h.a.b)new e.h.a.c.c("a0.browser_not_available", "No compatible Browser application is installed."));
            return;
        }
        e.h.a.f.n n2 = new e.h.a.f.n(a2, (e.h.a.d.a)f2, (Map)linkedHashMap, h2);
        k.x.c.i.e((Object)linkedHashMap2, "headers");
        n2.e.putAll((Map)linkedHashMap2);
        n2.i = null;
        n2.j = null;
        boolean bl2 = TextUtils.isEmpty(null);
        String string7 = null;
        if (bl2) {
            string7 = n2.g.b.b();
        }
        n2.k = string7;
        e.h.a.f.t.c = n2;
        String string8 = e.h.a.f.f.a((String)string3, (String)this.getApplicationContext().getPackageName(), (String)a2.b());
        k.x.c.i.c(string8);
        k.x.c.i.e((Object)this, "context");
        k.x.c.i.e(string8, "redirectUri");
        Map map = n2.d;
        k.x.c.i.e((Object)map, "parameters");
        String string9 = map.containsKey((Object)"scope") ? e.h.a.g.i.o.a((String)((String)k.s.i.w((Map)map, (Object)"scope"))) : "openid profile email";
        map.put((Object)"scope", (Object)string9);
        Map map2 = n2.d;
        Map map3 = n2.e;
        if (n2.i == null) {
            n2.i = new e.h.a.f.o(n2.g, string8, map3);
        }
        e.h.a.f.o o2 = n2.i;
        k.x.c.i.c((Object)o2);
        String string10 = o2.e;
        k.x.c.i.d(string10, "codeChallenge");
        map2.put((Object)"code_challenge", (Object)string10);
        map2.put((Object)"code_challenge_method", (Object)"S256");
        Log.v((String)e.h.a.f.n.a, (String)"Using PKCE authentication flow");
        Map map4 = n2.d;
        map4.put((Object)"auth0Client", (Object)n2.b.d.b);
        map4.put((Object)"client_id", (Object)n2.b.b);
        map4.put((Object)"redirect_uri", (Object)string8);
        Map map5 = n2.d;
        String string11 = (String)map5.get((Object)"state");
        if (string11 == null) {
            SecureRandom secureRandom = new SecureRandom();
            byte[] arrby = new byte[32];
            secureRandom.nextBytes(arrby);
            string11 = Base64.encodeToString((byte[])arrby, (int)11);
            k.x.c.i.d(string11, "encodeToString(\n                randomBytes,\n                Base64.URL_SAFE or Base64.NO_WRAP or Base64.NO_PADDING\n            )");
        }
        if ((string2 = (String)map5.get((Object)"nonce")) == null) {
            SecureRandom secureRandom = new SecureRandom();
            byte[] arrby = new byte[32];
            secureRandom.nextBytes(arrby);
            string2 = Base64.encodeToString((byte[])arrby, (int)11);
            k.x.c.i.d(string2, "encodeToString(\n                randomBytes,\n                Base64.URL_SAFE or Base64.NO_WRAP or Base64.NO_PADDING\n            )");
        }
        map5.put((Object)"state", (Object)string11);
        map5.put((Object)"nonce", (Object)string2);
        m.z z2 = n2.b.c;
        k.x.c.i.c((Object)z2);
        z.a a4 = z2.f();
        a4.a("authorize");
        Uri.Builder builder = Uri.parse((String)a4.d().l).buildUpon();
        for (Map.Entry entry : n2.d.entrySet()) {
            builder.appendQueryParameter((String)entry.getKey(), (String)entry.getValue());
        }
        Uri uri = builder.build();
        Log.d((String)e.h.a.f.n.a, (String)k.x.c.i.k("Using the following Authorize URI: ", (Object)uri));
        k.x.c.i.d((Object)uri, "uri");
        n2.h = 110;
        e.h.a.f.h h3 = n2.f;
        k.x.c.i.e((Object)this, "context");
        k.x.c.i.e((Object)uri, "authorizeUri");
        k.x.c.i.e((Object)h3, "options");
        Intent intent = new Intent((Context)this, AuthenticationActivity.class);
        intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", (Parcelable)uri);
        intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", (Parcelable)h3);
        intent.addFlags(67108864);
        this.startActivity(intent);
    }

    public final void u(ResponseAction responseAction) {
        if (k.x.c.i.a(BravoApp.I, "foreground")) {
            Params params = responseAction.c;
            if (params == null) {
                return;
            }
            o.b.a.c c2 = o.b.a.c.b();
            e.g.a.i.a0 a02 = new e.g.a.i.a0(params.n, params.B, null, null, Boolean.TRUE, 12);
            c2.g((Object)a02);
            return;
        }
        u u2 = u.a;
        String string = e.g.a.o.r.k.e((Object)responseAction);
        k.x.c.i.d(string, "Moshify.responseActionIn\u2026ce.toJson(responseAction)");
        u2.j("start_page_from_push_notification", string);
        k.x.c.i.e((Object)this, "<this>");
        this.startActivity(new Intent((Context)this, InitActivity.class));
    }

    public final void v() {
        RelativeLayout relativeLayout = this.r;
        if (relativeLayout == null) {
            return;
        }
        v0.g((View)relativeLayout);
    }

    public final void w(Fragment fragment, RelativeLayout relativeLayout) {
        if (fragment != null) {
            k.x.c.i.e((Object)this, "<this>");
            k.x.c.i.e((Object)fragment, "fragment");
            if (!this.isFinishing()) {
                this.getSupportFragmentManager().beginTransaction().remove(fragment).commitNowAllowingStateLoss();
            }
            e.f.a.a0.K0((FragmentActivity)this);
            return;
        }
        if (relativeLayout != null) {
            v0.g((View)relativeLayout);
        }
        ProgressBar progressBar = this.t;
        if (progressBar != null) {
            v0.g((View)progressBar);
        }
        RelativeLayout relativeLayout2 = this.r;
        if (relativeLayout2 == null) {
            return;
        }
        v0.g((View)relativeLayout2);
    }

    public final void x(e.g.a.m.h h2, boolean bl) {
        if (h2 == null) {
            return;
        }
        if (bl) {
            this.runOnUiThread((Runnable)new e.g.a.d.t(this, h2));
            return;
        }
        this.w(h2.b, h2.a);
    }

    public final void z() {
        this.l();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showLogin", true);
        Intent intent = new Intent((Context)this, BravoActivity.class);
        intent.putExtras(bundle);
        this.startActivity(intent);
        this.finish();
    }
}

