/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ProgressBar
 *  androidx.annotation.Nullable
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentTransaction
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Object
 *  java.lang.String
 *  tech.linjiang.pandora.ui.connector.UIStateCallback
 *  tech.linjiang.pandora.ui.fragment.ConfigFragment
 *  tech.linjiang.pandora.ui.fragment.CrashFragment
 *  tech.linjiang.pandora.ui.fragment.HierarchyFragment
 *  tech.linjiang.pandora.ui.fragment.HistoryFragment
 *  tech.linjiang.pandora.ui.fragment.MeasureFragment
 *  tech.linjiang.pandora.ui.fragment.NetFragment
 *  tech.linjiang.pandora.ui.fragment.PermissionReqFragment
 *  tech.linjiang.pandora.ui.fragment.RouteFragment
 *  tech.linjiang.pandora.ui.fragment.SandboxFragment
 *  tech.linjiang.pandora.ui.fragment.ViewFragment
 *  tech.linjiang.pandora.util.ViewKnife
 */
package tech.linjiang.pandora.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import tech.linjiang.pandora.ui.TransActivity;
import tech.linjiang.pandora.ui.connector.UIStateCallback;
import tech.linjiang.pandora.ui.fragment.ConfigFragment;
import tech.linjiang.pandora.ui.fragment.CrashFragment;
import tech.linjiang.pandora.ui.fragment.HierarchyFragment;
import tech.linjiang.pandora.ui.fragment.HistoryFragment;
import tech.linjiang.pandora.ui.fragment.MeasureFragment;
import tech.linjiang.pandora.ui.fragment.NetFragment;
import tech.linjiang.pandora.ui.fragment.PermissionReqFragment;
import tech.linjiang.pandora.ui.fragment.RouteFragment;
import tech.linjiang.pandora.ui.fragment.SandboxFragment;
import tech.linjiang.pandora.ui.fragment.ViewFragment;
import tech.linjiang.pandora.util.ViewKnife;

public class Dispatcher
extends AppCompatActivity
implements UIStateCallback {
    public static final String PARAM1 = "param1";
    private View hintView;
    private int type;

    private void addFragment(Class<? extends Fragment> class_) {
        try {
            this.getSupportFragmentManager().beginTransaction().add(16908290, (Fragment)class_.newInstance()).commit();
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
            return;
        }
        catch (InstantiationException instantiationException) {
            instantiationException.printStackTrace();
            return;
        }
    }

    private void dispatch(Bundle bundle) {
        block21 : {
            Class<NetFragment> class_;
            block23 : {
                block16 : {
                    block17 : {
                        block22 : {
                            block18 : {
                                block19 : {
                                    block20 : {
                                        int n2 = this.type;
                                        if (n2 == 1) break block16;
                                        if (n2 == 2) break block17;
                                        if (n2 == 3) break block18;
                                        if (n2 == 16) break block19;
                                        if (n2 == 17) break block20;
                                        switch (n2) {
                                            default: {
                                                return;
                                            }
                                            case 9: {
                                                if (bundle == null) {
                                                    class_ = HistoryFragment.class;
                                                    break;
                                                }
                                                break block21;
                                            }
                                            case 8: {
                                                if (bundle == null) {
                                                    class_ = CrashFragment.class;
                                                    break;
                                                }
                                                break block21;
                                            }
                                            case 7: {
                                                if (bundle == null) {
                                                    class_ = ConfigFragment.class;
                                                    break;
                                                }
                                                break block21;
                                            }
                                            case 6: {
                                                if (bundle == null) {
                                                    class_ = ViewFragment.class;
                                                    break;
                                                }
                                                break block22;
                                            }
                                            case 5: {
                                                if (bundle == null) {
                                                    class_ = MeasureFragment.class;
                                                    break;
                                                }
                                                break block21;
                                            }
                                        }
                                        break block23;
                                    }
                                    if (bundle != null) break block21;
                                    class_ = PermissionReqFragment.class;
                                    break block23;
                                }
                                if (bundle != null) break block21;
                                class_ = RouteFragment.class;
                                break block23;
                            }
                            if (bundle != null) break block22;
                            class_ = HierarchyFragment.class;
                            break block23;
                        }
                        this.finish();
                        return;
                    }
                    if (bundle != null) break block21;
                    class_ = SandboxFragment.class;
                    break block23;
                }
                if (bundle != null) break block21;
                class_ = NetFragment.class;
            }
            this.addFragment(class_);
        }
    }

    public static void start(Context context, int n2) {
        boolean bl = n2 == 5 || n2 == 6 || n2 == 17;
        Class class_ = bl ? TransActivity.class : Dispatcher.class;
        Intent intent = new Intent(context, class_).putExtra(PARAM1, n2);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public void finish() {
        Activity.super.finish();
        this.overridePendingTransition(0, 0);
    }

    public void hideHint() {
        View view = this.hintView;
        if (view != null && view.getVisibility() != 8) {
            this.hintView.setVisibility(8);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        FragmentActivity.super.onCreate(bundle);
        this.type = this.getIntent().getIntExtra(PARAM1, 2);
        ViewKnife.setStatusBarColor((Window)this.getWindow(), (int)0);
        ViewKnife.transStatusBar((Window)this.getWindow());
        this.dispatch(bundle);
    }

    public void showHint() {
        if (this.hintView == null) {
            this.hintView = new ProgressBar((Context)this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.hintView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        if (this.hintView.getParent() == null && this.getWindow() != null && this.getWindow().getDecorView() instanceof ViewGroup) {
            ((ViewGroup)this.getWindow().getDecorView()).addView(this.hintView);
        }
        if (this.hintView.getVisibility() == 8) {
            this.hintView.setVisibility(0);
        }
    }
}

