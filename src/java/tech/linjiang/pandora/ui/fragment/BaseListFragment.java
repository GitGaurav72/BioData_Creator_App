/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.view.View
 *  androidx.recyclerview.widget.DividerItemDecoration
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  tech.linjiang.pandora.core.R
 *  tech.linjiang.pandora.core.R$color
 *  tech.linjiang.pandora.ui.fragment.BaseFragment
 *  tech.linjiang.pandora.ui.recyclerview.UniversalAdapter
 *  tech.linjiang.pandora.ui.view.MenuRecyclerView
 *  tech.linjiang.pandora.util.ViewKnife
 */
package tech.linjiang.pandora.ui.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import tech.linjiang.pandora.core.R;
import tech.linjiang.pandora.ui.fragment.BaseFragment;
import tech.linjiang.pandora.ui.recyclerview.UniversalAdapter;
import tech.linjiang.pandora.ui.view.MenuRecyclerView;
import tech.linjiang.pandora.util.ViewKnife;

public class BaseListFragment
extends BaseFragment {
    private UniversalAdapter adapter;
    private MenuRecyclerView recyclerView;

    public final UniversalAdapter getAdapter() {
        return this.adapter;
    }

    public final int getLayoutId() {
        return 0;
    }

    public View getLayoutView() {
        MenuRecyclerView menuRecyclerView;
        this.adapter = new UniversalAdapter();
        this.recyclerView = menuRecyclerView = new MenuRecyclerView(this.getContext());
        menuRecyclerView.setBackgroundColor(ViewKnife.getColor((int)R.color.pd_main_bg));
        this.recyclerView.setLayoutManager(this.onCreateLayoutManager());
        if (this.needDefaultDivider()) {
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.getContext(), 1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1710619);
            gradientDrawable.setSize(0, 1);
            dividerItemDecoration.setDrawable((Drawable)gradientDrawable);
            this.recyclerView.addItemDecoration((RecyclerView.ItemDecoration)dividerItemDecoration);
        }
        this.recyclerView.setAdapter((RecyclerView.Adapter)this.adapter);
        return this.recyclerView;
    }

    public final MenuRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public boolean needDefaultDivider() {
        return true;
    }

    public RecyclerView.LayoutManager onCreateLayoutManager() {
        return new LinearLayoutManager(this.getContext());
    }
}

