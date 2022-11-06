/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.PopupWindow
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$dimen
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$id
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$layout
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.MenuItem
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.YouTubePlayerMenu
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  kotlin.Metadata
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.defaultMenu;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.MenuItem;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.YouTubePlayerMenu;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.defaultMenu.MenuAdapter;
import java.util.ArrayList;
import java.util.List;
import k.n;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00108V@\u0016X\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/defaultMenu/DefaultYouTubePlayerMenu;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/YouTubePlayerMenu;", "Landroid/widget/PopupWindow;", "createPopupWindow", "()Landroid/widget/PopupWindow;", "Landroid/view/View;", "anchorView", "Lk/q;", "show", "(Landroid/view/View;)V", "dismiss", "()V", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/MenuItem;", "menuItem", "addItem", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/MenuItem;)Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/YouTubePlayerMenu;", "", "itemIndex", "removeItem", "(I)Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/YouTubePlayerMenu;", "getItemCount", "()I", "itemCount", "Landroid/content/Context;", "context", "Landroid/content/Context;", "popupWindow", "Landroid/widget/PopupWindow;", "Ljava/util/ArrayList;", "menuItems", "Ljava/util/ArrayList;", "<init>", "(Landroid/content/Context;)V", "core_release"}, k=1, mv={1, 4, 0})
public final class DefaultYouTubePlayerMenu
implements YouTubePlayerMenu {
    private final Context context;
    private final ArrayList<MenuItem> menuItems;
    private PopupWindow popupWindow;

    public DefaultYouTubePlayerMenu(Context context) {
        i.f((Object)context, "context");
        this.context = context;
        this.menuItems = new ArrayList();
    }

    private final PopupWindow createPopupWindow() {
        Object object = this.context.getSystemService("layout_inflater");
        if (object != null) {
            View view = ((LayoutInflater)object).inflate(R.layout.ayp_player_menu, null);
            RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
            i.b((Object)recyclerView, "recyclerView");
            recyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(this.context));
            recyclerView.setAdapter((RecyclerView.Adapter)new MenuAdapter(this.context, (List<MenuItem>)this.menuItems));
            recyclerView.setHasFixedSize(true);
            PopupWindow popupWindow = new PopupWindow(view, -2, -2);
            popupWindow.setContentView(view);
            popupWindow.setFocusable(true);
            popupWindow.setWidth(-2);
            popupWindow.setHeight(-2);
            return popupWindow;
        }
        throw new n("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public YouTubePlayerMenu addItem(MenuItem menuItem) {
        i.f((Object)menuItem, "menuItem");
        this.menuItems.add((Object)menuItem);
        return this;
    }

    public void dismiss() {
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public int getItemCount() {
        return this.menuItems.size();
    }

    public YouTubePlayerMenu removeItem(int n2) {
        this.menuItems.remove(n2);
        return this;
    }

    public YouTubePlayerMenu removeItem(MenuItem menuItem) {
        i.f((Object)menuItem, "menuItem");
        this.menuItems.remove((Object)menuItem);
        return this;
    }

    public void show(View view) {
        PopupWindow popupWindow;
        i.f((Object)view, "anchorView");
        this.popupWindow = popupWindow = this.createPopupWindow();
        if (popupWindow != null) {
            Resources resources = this.context.getResources();
            int n2 = R.dimen.ayp_8dp;
            popupWindow.showAsDropDown(view, 12 * -resources.getDimensionPixelSize(n2), 12 * -this.context.getResources().getDimensionPixelSize(n2));
        }
        if (this.menuItems.size() == 0) {
            Log.e((String)YouTubePlayerMenu.class.getName(), (String)"The menu is empty");
        }
    }
}

