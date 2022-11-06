/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.wuman.android.auth.AuthorizationFlow
 *  com.wuman.android.auth.AuthorizationUIController
 *  com.wuman.android.auth.OAuthManager$1
 *  com.wuman.android.auth.OAuthManager$3
 *  com.wuman.android.auth.OAuthManager$4
 *  com.wuman.android.auth.OAuthManager$Future2Task
 *  e.p.b.a.a.b.f
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Objects
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  java.util.concurrent.FutureTask
 *  java.util.logging.Logger
 */
package com.wuman.android.auth;

import android.os.Handler;
import android.os.Looper;
import com.wuman.android.auth.AuthorizationFlow;
import com.wuman.android.auth.AuthorizationUIController;
import com.wuman.android.auth.OAuthManager;
import com.wuman.android.auth.OnIdTokenAvailable;
import e.p.b.a.a.b.f;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Logger;

public class OAuthManager {
    public static final Logger LOGGER = Logger.getLogger((String)"OAuthAndroid");
    public final ExecutorService mExecutor;
    public final AuthorizationFlow mFlow;
    public final Handler mMainHandler = new Handler(Looper.getMainLooper());
    public final AuthorizationUIController mUIController;
    public OnIdTokenAvailable onIdTokenAvailable;

    public OAuthManager(AuthorizationFlow authorizationFlow, AuthorizationUIController authorizationUIController) {
        this(authorizationFlow, authorizationUIController, Executors.newSingleThreadExecutor());
    }

    public OAuthManager(AuthorizationFlow authorizationFlow, AuthorizationUIController authorizationUIController, ExecutorService executorService) {
        this.mFlow = authorizationFlow;
        this.mUIController = authorizationUIController;
        Objects.requireNonNull((Object)executorService);
        this.mExecutor = executorService;
    }

    public static /* synthetic */ AuthorizationFlow access$000(OAuthManager oAuthManager) {
        return oAuthManager.mFlow;
    }

    public static /* synthetic */ AuthorizationUIController access$100(OAuthManager oAuthManager) {
        return oAuthManager.mUIController;
    }

    public static /* synthetic */ OnIdTokenAvailable access$200(OAuthManager oAuthManager) {
        return oAuthManager.onIdTokenAvailable;
    }

    public OAuthFuture<f> authorizeExplicitly(String string, OAuthCallback<f> oAuthCallback, Handler handler) {
        Objects.requireNonNull((Object)string);
        3 var5_4 = new 3(this, handler, oAuthCallback, string);
        this.submitTaskToExecutor(var5_4);
        return var5_4;
    }

    public OAuthFuture<f> authorizeImplicitly(String string, OAuthCallback<f> oAuthCallback, Handler handler) {
        Objects.requireNonNull((Object)string);
        4 var5_4 = new 4(this, handler, oAuthCallback, string);
        this.submitTaskToExecutor(var5_4);
        return var5_4;
    }

    public OAuthFuture<Boolean> deleteCredential(String string, OAuthCallback<Boolean> oAuthCallback, Handler handler) {
        Objects.requireNonNull((Object)string);
        1 var5_4 = new 1(this, handler, oAuthCallback, string);
        this.submitTaskToExecutor(var5_4);
        return var5_4;
    }

    public final void submitTaskToExecutor(final Future2Task<?> future2Task) {
        this.mExecutor.submit(new Runnable(){

            public void run() {
                future2Task.start();
            }
        });
    }

    public abstract class BaseFutureTask<T>
    extends FutureTask<T> {
        public final Handler mHandler;

        public BaseFutureTask(Handler handler) {
            super(new Callable<T>(){

                public T call() {
                    throw new IllegalStateException("this should never be called");
                }
            });
            this.mHandler = handler;
        }

        public abstract void doWork();

        public void postRunnableToHandler(Runnable runnable) {
            Handler handler = this.mHandler;
            if (handler == null) {
                handler = OAuthManager.this.mMainHandler;
            }
            handler.post(runnable);
        }

        public void startTask() {
            try {
                this.doWork();
                return;
            }
            catch (Exception exception) {
                this.setException((Throwable)exception);
                return;
            }
        }

    }

    public static interface OAuthCallback<T> {
        public void run(OAuthFuture<T> var1);
    }

    public static interface OAuthFuture<V> {
    }

}

