/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$id
 *  com.pierfrancescosoffritti.androidyoutubeplayer.R$layout
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.MenuItem
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  kotlin.Metadata
 */
package com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.defaultMenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.menu.MenuItem;
import java.util.List;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/defaultMenu/MenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/defaultMenu/MenuAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/defaultMenu/MenuAdapter$ViewHolder;", "holder", "position", "Lk/q;", "onBindViewHolder", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/defaultMenu/MenuAdapter$ViewHolder;I)V", "getItemCount", "()I", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/MenuItem;", "menuItems", "Ljava/util/List;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "ViewHolder", "core_release"}, k=1, mv={1, 4, 0})
public final class MenuAdapter
extends RecyclerView.Adapter<ViewHolder> {
    private final Context context;
    private final List<MenuItem> menuItems;

    public MenuAdapter(Context context, List<MenuItem> list) {
        i.f((Object)context, "context");
        i.f(list, "menuItems");
        this.context = context;
        this.menuItems = list;
    }

    public int getItemCount() {
        return this.menuItems.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int n2) {
        i.f((Object)viewHolder, "holder");
        viewHolder.getRoot().setOnClickListener(((MenuItem)this.menuItems.get(n2)).getOnClickListener());
        viewHolder.getTextView().setText((CharSequence)((MenuItem)this.menuItems.get(n2)).getText());
        Integer n3 = ((MenuItem)this.menuItems.get(n2)).getIcon();
        if (n3 != null) {
            int n4 = n3;
            viewHolder.getTextView().setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable((Context)this.context, (int)n4), null, null, null);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n2) {
        i.f((Object)viewGroup, "parent");
        View view = LayoutInflater.from((Context)viewGroup.getContext()).inflate(R.layout.ayp_menu_item, viewGroup, false);
        i.b((Object)view, "view");
        return new ViewHolder(view);
    }

    @Metadata(bv={1, 0, 3}, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2={"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/defaultMenu/MenuAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "<init>", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/menu/defaultMenu/MenuAdapter;Landroid/view/View;)V", "core_release"}, k=1, mv={1, 4, 0})
    public final class ViewHolder
    extends RecyclerView.ViewHolder {
        private final View root;
        private final TextView textView;

        public ViewHolder(View view) {
            i.f((Object)view, "root");
            super(view);
            this.root = view;
            View view2 = view.findViewById(R.id.text);
            i.b((Object)view2, "root.findViewById(R.id.text)");
            this.textView = (TextView)view2;
        }

        public final View getRoot() {
            return this.root;
        }

        public final TextView getTextView() {
            return this.textView;
        }
    }

}

